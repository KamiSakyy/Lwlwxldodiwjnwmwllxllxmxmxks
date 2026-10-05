package fa1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a implements Executor {
    public final /* synthetic */ int r;
    public final Handler s;

    public /* synthetic */ a(Handler handler, int i) {
        this.r = i;
        this.s = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.r) {
            case 0:
                this.s.post(runnable);
                return;
            case 1:
                this.s.post(runnable);
                return;
            case 2:
                this.s.post(runnable);
                return;
            case 3:
                runnable.getClass();
                Handler handler = this.s;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.s;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }

    public a(int i) {
        this.r = i;
        switch (i) {
            case 1:
                this.s = new Handler(Looper.getMainLooper());
                break;
            case 2:
                this.s = new Handler(Looper.getMainLooper());
                break;
            default:
                this.s = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
