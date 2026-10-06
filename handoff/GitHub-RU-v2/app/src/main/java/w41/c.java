package w41;

import android.util.Log;
import java.util.concurrent.ExecutorService;
import k71.k;
import t.q;
import t71.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final b a;
    public final b b;
    public final b c;

    public c(ExecutorService executorService, ExecutorService executorService2) {
        k.g(executorService, "backgroundExecutorService");
        k.g(executorService2, "blockingExecutorService");
        this.a = new b(executorService);
        this.b = new b(executorService);
        q.k((Object) null);
        this.c = new b(executorService2);
    }

    public static final void a() {
        String name = Thread.currentThread().getName();
        k.f(name, "threadName");
        if (p.I(name, "Firebase Background Thread #", false)) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public static final void b() {
        String name = Thread.currentThread().getName();
        k.f(name, "threadName");
        if (p.I(name, "Firebase Blocking Thread #", false)) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
    public Object e = null;
}
