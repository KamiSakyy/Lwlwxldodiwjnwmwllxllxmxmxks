package e81;

import a81.r;
import a81.t;
import com.github.rudroid.support.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v71.a2;
import v71.l;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b implements v71.k, a2 {
    public final l r;
    public final /* synthetic */ c s;

    public b(c cVar, l lVar) {
        this.s = cVar;
        this.r = lVar;
    }

    @Override // v71.a2
    public final void a(r rVar, int i) {
        this.r.a(rVar, i);
    }

    @Override // v71.k
    public final void h(Object obj, j71.f fVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.y;
        c cVar = this.s;
        atomicReferenceFieldUpdater.set(cVar, null);
        u uVar = new u(cVar, this);
        l lVar = this.r;
        lVar.E(a0.a, lVar.t, new com.github.rudroid.utilities.ui.emojipicker.d(18, uVar));
    }

    public final void i(Object obj) {
        this.r.i(obj);
    }

    @Override // v71.k
    public final t p(Object obj, j71.f fVar) {
        c cVar = this.s;
        j71.f dVar = new com.github.rudroid.utilities.ui.emojipicker.d(cVar, this);
        t H = this.r.H((a0) obj, dVar);
        if (H != null) {
            c.y.set(cVar, null);
        }
        return H;
    }

    public final a71.h q() {
        return this.r.v;
    }

    @Override // v71.k
    public final boolean x(Throwable th) {
        return this.r.x(th);
    }

    @Override // v71.k
    public final void y(Object obj) {
        this.r.y(obj);
    }
}
