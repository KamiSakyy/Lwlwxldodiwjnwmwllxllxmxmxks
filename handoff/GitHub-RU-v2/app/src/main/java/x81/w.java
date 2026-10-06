package x81;

import h91.i0Shadow;
import h91.j0;
import h91.k0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import k.h0;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class w implements j0 {
    public final v A;
    public final v B;
    public a C;
    public IOException D;
    public final int r;
    public final o s;
    public final h0 t;
    public long u;
    public long v;
    public final ArrayDeque w;
    public boolean x;
    public final u y;
    public final t z;

    public w(int i, o oVar, boolean z, boolean z2, q81.n nVar) {
        k71.k.g(oVar, "connection");
        this.r = i;
        this.s = oVar;
        this.t = new h0(i);
        this.v = oVar.J.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.w = arrayDeque;
        this.y = new u(this, oVar.I.a(), z2);
        this.z = new t(this, z);
        this.A = new v(this);
        this.B = new v(this);
        if (nVar == null) {
            if (!i()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (i()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(nVar);
        }
    }

    @Override // h91.j0
    public final k0 a() {
        return this.y;
    }

    public final void b() {
        boolean z;
        boolean j;
        TimeZone timeZone = r81.g.a;
        synchronized (this) {
            try {
                u uVar = this.y;
                if (!uVar.s && uVar.v) {
                    t tVar = this.z;
                    if (!tVar.r) {
                        if (tVar.t) {
                        }
                    }
                    z = true;
                    j = j();
                }
                z = false;
                j = j();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e(a.y, null);
        } else {
            if (j) {
                return;
            }
            this.s.r(this.r);
        }
    }

    @Override // h91.j0
    public final i0 c() {
        return this.z;
    }

    @Override // h91.j0
    public final void cancel() {
        g(a.y);
    }

    public final void d() {
        t tVar = this.z;
        if (tVar.t) {
            throw new IOException("stream closed");
        }
        if (tVar.r) {
            throw new IOException("stream finished");
        }
        if (h() != null) {
            IOException iOException = this.D;
            if (iOException != null) {
                throw iOException;
            }
            a h = h();
            k71.k.d(h);
            throw new StreamResetException(h);
        }
    }

    public final void e(a aVar, IOException iOException) {
        if (f(aVar, iOException)) {
            this.s.O.F(this.r, aVar);
        }
    }

    public final boolean f(a aVar, IOException iOException) {
        TimeZone timeZone = r81.g.a;
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            this.C = aVar;
            this.D = iOException;
            notifyAll();
            if (this.y.s) {
                if (this.z.r) {
                    return false;
                }
            }
            this.s.r(this.r);
            return true;
        }
    }

    public final void g(a aVar) {
        if (f(aVar, null)) {
            this.s.F(this.r, aVar);
        }
    }

    public final a h() {
        a aVar;
        synchronized (this) {
            aVar = this.C;
        }
        return aVar;
    }

    public final boolean i() {
        boolean z = (this.r & 1) == 1;
        this.s.getClass();
        return true == z;
    }

    public final boolean j() {
        synchronized (this) {
            try {
                if (h() != null) {
                    return false;
                }
                u uVar = this.y;
                if (!uVar.s) {
                    if (uVar.v) {
                    }
                    return true;
                }
                t tVar = this.z;
                if (tVar.r || tVar.t) {
                    if (this.x) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0008, B:6:0x000d, B:8:0x0015, B:11:0x001e, B:13:0x002f, B:14:0x0033, B:22:0x0026), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(q81.n nVar, boolean z) {
        boolean j;
        k71.k.g(nVar, "headers");
        TimeZone timeZone = r81.g.a;
        synchronized (this) {
            try {
                if (this.x && nVar.a(":status") == null && nVar.a(":method") == null) {
                    this.y.getClass();
                    if (z) {
                        this.y.s = true;
                    }
                    j = j();
                    notifyAll();
                }
                this.x = true;
                this.w.add(nVar);
                if (z) {
                }
                j = j();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j) {
            return;
        }
        this.s.r(this.r);
    }
}
