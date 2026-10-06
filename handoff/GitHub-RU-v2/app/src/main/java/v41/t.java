package v41;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tShadow implements Runnable {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ Object s;

    public Object t(Runnable runnable) {
        this.s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        switch (this.r) {
            case 0:
                ((Runnable) this.s).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) this.s;
                try {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        executorService.shutdownNow();
                        break;
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdownNow();
                    return;
                }
                break;
        }
    }

    public Object t(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.s = executorService;
    }
}
