package h21;

import android.os.Process;
import android.util.Log;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements Runnable {
    public final /* synthetic */ int r;
    public Runnable s;

    public /* synthetic */ b(Runnable runnable, int i) {
        this.r = i;
        this.s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                Process.setThreadPriority(0);
                this.s.run();
                break;
            case 1:
                try {
                    this.s.run();
                    break;
                } catch (Exception unused) {
                    Log.isLoggable("TRuntime.".concat("Executor"), 6);
                    return;
                }
            default:
                this.s.run();
                break;
        }
    }

    public String toString() {
        switch (this.r) {
            case 2:
                return this.s.toString();
            default:
                return super.toString();
        }
    }
}
