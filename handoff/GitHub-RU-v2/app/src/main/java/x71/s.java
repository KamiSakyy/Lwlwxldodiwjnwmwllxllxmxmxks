package x71;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import v71.b0;

/* loaded from: /home/user/work/p/classes5.dex */
public class s extends v71.a implements t, l {
    public hShadow u;

    public s(a71.hShadow hVar, hShadow hVar2) {
        super(hVar, true);
        this.u = hVar2;
    }

    @Override // x71.v
    public final Object a(c71.jShadow jVar) {
        hShadow hVar = this.u;
        hVar.getClass();
        Object E = h.E(hVar, jVar);
        b71.a aVar = b71.a.r;
        return E;
    }

    @Override // x71.v
    public final b1.m b() {
        return this.u.b();
    }

    @Override // x71.v
    public final Object c() {
        return this.u.c();
    }

    @Override // x71.w
    public final void d(j71.c cVar) {
        this.u.d(cVar);
    }

    @Override // x71.w
    public final boolean e(Throwable th) {
        return this.u.n(th, false);
    }

    @Override // x71.v
    public final c iterator() {
        hShadow hVar = this.u;
        hVar.getClass();
        return new c(hVar);
    }

    @Override // x71.w
    public final Object j(Object obj) {
        return this.u.j(obj);
    }

    @Override // x71.v
    public final Object k(a71.c cVar) {
        return this.u.k(cVar);
    }

    @Override // x71.w
    public final Object l(a71.c cVar, Object obj) {
        return this.u.l(cVar, obj);
    }

    @Override // v71.j1, v71.d1
    public final void m(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(z(), null, this);
        }
        v(cancellationException);
    }

    @Override // v71.a
    public final void n0(Throwable th, boolean z) {
        if (this.u.n(th, false) || z) {
            return;
        }
        b0.t(this.t, th);
    }

    @Override // v71.a
    public final void p0(Object obj) {
        this.u.e(null);
    }

    @Override // v71.j1
    public final void v(CancellationException cancellationException) {
        this.u.n(cancellationException, true);
        u(cancellationException);
    }
}
