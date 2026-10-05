package h91;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends Thread {
    public final /* synthetic */ int r = 0;

    public /* synthetic */ c(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.r) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                b21.v vVar = d.h;
                reentrantLock = d.j;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                d b = c21.j.b();
                if (b == d.i) {
                    d.i = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (b != null) {
                        b.l();
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public /* synthetic */ c(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
