package x11;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends Thread {
    public WeakReference r;
    public long s;
    public final CountDownLatch t = new CountDownLatch(1);
    public boolean u = false;

    public b(a aVar, long j) {
        this.r = new WeakReference(aVar);
        this.s = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.r;
        try {
            if (this.t.await(this.s, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.u = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.u = true;
            }
        }
    }
}
