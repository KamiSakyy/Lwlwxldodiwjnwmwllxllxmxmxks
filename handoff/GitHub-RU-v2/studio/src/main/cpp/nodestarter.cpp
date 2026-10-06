// JNI-мост встроенного офлайн Node.js (libnode.so, Node 24).
//
// Java (NodeEngine) -> nativeStart(home, cache) -> фоновый pthread,
// в котором вызывается node::Start() с нашим server.js.
// stdout/stderr узла перенаправляются в logcat (тег "node").
//
// Если libnode.so не был встроен в APK (офлайн-сборка без скачивания),
// nativeStart возвращает 2, и Java показывает экран-заглушку.

#include <jni.h>

#include <android/log.h>
#include <errno.h>
#include <pthread.h>
#include <stdlib.h>
#include <string.h>
#include <sys/stat.h>
#include <unistd.h>

#define LOG_TAG "nodestarter"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

#ifdef HAVE_LIBNODE
// Публичная точка входа node-as-a-library. Объявляем вручную,
// чтобы не тащить заголовки Node в сборку (сигнатура стабильна).
namespace node {
int Start(int argc, char** argv);
}  // namespace node
#endif

namespace {

struct NodeArgs {
    char home[1024];
    char cache[1024];
};

void MkdirP(const char* path) {
    char tmp[2048];
    snprintf(tmp, sizeof(tmp), "%s", path);
    for (char* p = tmp + 1; *p; ++p) {
        if (*p == '/') {
            *p = '\0';
            mkdir(tmp, 0755);
            *p = '/';
        }
    }
    mkdir(tmp, 0755);
}

// Поток логгера: читает канал, куда перенаправлены stdout/stderr узла,
// и пишет построчно в logcat с тегом "node".
void* LoggerThread(void* arg) {
    int fd = *(int*)arg;
    delete (int*)arg;
    char buf[4096];
    char line[8192];
    size_t line_len = 0;
    ssize_t n;
    while ((n = read(fd, buf, sizeof(buf))) > 0) {
        for (ssize_t i = 0; i < n; ++i) {
            char c = buf[i];
            if (c == '\n') {
                line[line_len] = '\0';
                __android_log_print(ANDROID_LOG_INFO, "node", "%s", line);
                line_len = 0;
            } else if (line_len + 1 < sizeof(line)) {
                line[line_len++] = c;
            }
        }
    }
    if (line_len > 0) {
        line[line_len] = '\0';
        __android_log_print(ANDROID_LOG_INFO, "node", "%s", line);
    }
    close(fd);
    return nullptr;
}

void RedirectStdToLogcat() {
    int fds[2];
    if (pipe(fds) != 0) {
        LOGE("pipe() не удался: %s", strerror(errno));
        return;
    }
    // fds[0] — чтение (логгер), fds[1] — запись (stdout/stderr узла).
    dup2(fds[1], STDOUT_FILENO);
    dup2(fds[1], STDERR_FILENO);
    int* read_fd = new int(fds[0]);
    pthread_t t;
    if (pthread_create(&t, nullptr, LoggerThread, read_fd) == 0) {
        pthread_detach(t);
    } else {
        LOGE("не смог создать поток логгера");
        delete read_fd;
    }
}

#ifdef HAVE_LIBNODE
void* NodeThread(void* arg) {
    NodeArgs* a = (NodeArgs*)arg;

    char tmpdir[2048];
    char ccache[2048];
    snprintf(tmpdir, sizeof(tmpdir), "%s/node-tmp", a->cache);
    snprintf(ccache, sizeof(ccache), "%s/node-compile-cache", a->cache);
    MkdirP(tmpdir);
    MkdirP(ccache);

    // Окружение ДО node::Start (потом уже поздно — читается при bootstrap).
    setenv("TMPDIR", tmpdir, 1);  // на Android нет /tmp — без этого os.tmpdir() сломан
    setenv("HOME", a->home, 1);   // os.homedir() и npm-пакеты
    // Ограничение кучи V8 в процентах от RAM устройства (безопасно для фона).
    setenv("NODE_OPTIONS", "--max-old-space-size-percentage=25", 1);
    setenv("NODE_COMPILE_CACHE", ccache, 1);
    setenv("NODE_COMPILE_CACHE_PORTABLE", "1", 1);

    RedirectStdToLogcat();

    char script[2048];
    char portfile[2048];
    snprintf(script, sizeof(script), "%s/server.js", a->home);
    snprintf(portfile, sizeof(portfile), "%s/port.txt", a->home);
    LOGI("Запуск node::Start: %s (port -> %s)", script, portfile);

    char* argv[] = {const_cast<char*>("node"), script, portfile, nullptr};
    int rc = node::Start(3, argv);
    LOGI("node::Start завершился с кодом %d", rc);
    delete a;
    return nullptr;
}
#endif  // HAVE_LIBNODE

}  // namespace

extern "C" JNIEXPORT jint JNICALL
Java_com_github_rudroid_studio_node_NodeEngine_nativeStart(JNIEnv* env, jclass /*clazz*/,
                                                           jstring jHome, jstring jCache) {
#ifdef HAVE_LIBNODE
    const char* home = env->GetStringUTFChars(jHome, nullptr);
    const char* cache = env->GetStringUTFChars(jCache, nullptr);
    NodeArgs* args = new NodeArgs();
    snprintf(args->home, sizeof(args->home), "%s", home ? home : "");
    snprintf(args->cache, sizeof(args->cache), "%s", cache ? cache : "");
    if (home) env->ReleaseStringUTFChars(jHome, home);
    if (cache) env->ReleaseStringUTFChars(jCache, cache);

    pthread_t t;
    pthread_attr_t attr;
    pthread_attr_init(&attr);
    // V8 любит глубокий стек.
    pthread_attr_setstacksize(&attr, 8 * 1024 * 1024);
    int err = pthread_create(&t, &attr, NodeThread, args);
    pthread_attr_destroy(&attr);
    if (err != 0) {
        LOGE("pthread_create не удался: %s", strerror(err));
        delete args;
        return 1;
    }
    pthread_detach(t);
    LOGI("Поток Node.js запущен");
    return 0;
#else
    (void)env;
    LOGI("Сборка-заглушка: libnode.so не встроен, Node.js недоступен");
    return 2;
#endif
}
