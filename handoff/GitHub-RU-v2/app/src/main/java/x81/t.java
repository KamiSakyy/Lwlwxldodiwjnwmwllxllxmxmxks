package x81;

import h91.i0Shadow;
import h91.m0;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t implements i0 {
    public boolean r;
    public final h91.h s = new h91.h();
    public boolean t;
    public final /* synthetic */ w u;

    public t(w wVar, boolean z) {
        this.u = wVar;
        this.r = z;
    }

    @Override // h91.i0Shadow
    public final void I0(h91.h hVar, long j) {
        TimeZone timeZone = r81.g.a;
        h91.h hVar2 = this.s;
        hVar2.I0(hVar, j);
        while (hVar2.s >= 16384) {
            f(false);
        }
    }

    @Override // h91.i0Shadow
    public final m0 b() {
        return this.u.B;
    }

    @Override // h91.i0Shadow, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        w wVar = this.u;
        TimeZone timeZone = r81.g.a;
        synchronized (wVar) {
            if (this.t) {
                return;
            }
            boolean z = wVar.h() == null;
            w wVar2 = this.u;
            if (!wVar2.z.r) {
                if (this.s.s > 0) {
                    while (this.s.s > 0) {
                        f(true);
                    }
                } else if (z) {
                    wVar2.s.E(wVar2.r, true, null, 0L);
                }
            }
            w wVar3 = this.u;
            synchronized (wVar3) {
                this.t = true;
                wVar3.notifyAll();
            }
            this.u.s.flush();
            this.u.b();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void f(boolean z) {
        long min;
        boolean z2;
        w wVar = this.u;
        synchronized (wVar) {
            wVar.B.i();
            while (wVar.u >= wVar.v && !this.r && !this.t && wVar.h() == null) {
                try {
                    try {
                        wVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    wVar.B.m();
                    throw th;
                }
            }
            wVar.B.m();
            wVar.d();
            min = Math.min(wVar.v - wVar.u, this.s.s);
            wVar.u += min;
            z2 = z && min == this.s.s;
        }
        this.u.B.i();
        try {
            w wVar2 = this.u;
            wVar2.s.E(wVar2.r, z2, this.s, min);
        } finally {
            this.u.B.m();
        }
    }

    @Override // h91.i0Shadow, java.io.Flushable
    public final void flush() {
        w wVar = this.u;
        TimeZone timeZone = r81.g.a;
        synchronized (wVar) {
            wVar.d();
        }
        while (this.s.s > 0) {
            f(false);
            this.u.s.flush();
        }
    }
}
