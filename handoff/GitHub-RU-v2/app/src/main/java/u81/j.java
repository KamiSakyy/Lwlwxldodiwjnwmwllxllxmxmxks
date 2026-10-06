package u81;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/user/work/p/classes5.dex */
public final class j implements Runnable {
    public final q81.e r;
    public volatile AtomicInteger s = new AtomicInteger(0);
    public final /* synthetic */ m t;

    public j(m mVar, q81.e eVar) {
        this.t = mVar;
        this.r = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w51.r rVar;
        String str = "OkHttp " + ((q81.o) this.t.s.b).g();
        m mVar = this.t;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            mVar.v.i();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    w51.r rVar2 = mVar.r.a;
                    rVar2.getClass();
                    w51.r.L(rVar2, (j) null, (m) null, this, 3);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.r.p(mVar, mVar.h());
                rVar = mVar.r.a;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    a91.e eVar = a91.e.a;
                    a91.e.a.j("Callback failure for " + m.a(mVar), 4, e);
                } else {
                    this.r.r(mVar, e);
                }
                rVar = mVar.r.a;
                rVar.getClass();
                w51.r.L(rVar, (j) null, (m) null, this, 3);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                mVar.cancel();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    this.r.r(mVar, iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                rVar = mVar.r.a;
                rVar.getClass();
                w51.r.L(rVar, (j) null, (m) null, this, 3);
            }
            rVar.getClass();
            w51.r.L(rVar, (j) null, (m) null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
