package y71;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends z71.d {
    private volatile /* synthetic */ int consumed$volatile;
    public final x71.v u;

    static {
        AtomicIntegerFieldUpdater.newUpdater(d.class, "consumed$volatile");
    }

    public /* synthetic */ d(x71.v vVar) {
        this(vVar, a71.i.r, -3, x71.a.r);
    }

    @Override // z71.d, y71.i
    public final Object b(j jVar, a71.c cVar) {
        if (this.s == -3) {
            Object r = n1.r(jVar, this.u, false, cVar);
            if (r == b71.a.r) {
                return r;
            }
        } else {
            Object b = super.b(jVar, cVar);
            if (b == b71.a.r) {
                return b;
            }
        }
        return w61.a0.a;
    }

    @Override // z71.d
    public final String c() {
        return "channel=" + this.u;
    }

    @Override // z71.d
    public final Object d(x71.t tVar, a71.c cVar) {
        Object r = n1.r(new z71.x(tVar), this.u, false, cVar);
        return r == b71.a.r ? r : w61.a0.a;
    }

    @Override // z71.d
    public final z71.d e(a71.h hVar, int i, x71.a aVar) {
        return new d(this.u, hVar, i, aVar);
    }

    @Override // z71.d
    public final i f() {
        return new d(this.u);
    }

    @Override // z71.d
    public final x71.v g(v71.z zVar) {
        return this.s == -3 ? this.u : super.g(zVar);
    }

    public d(x71.v vVar, a71.h hVar, int i, x71.a aVar) {
        super(hVar, i, aVar);
        this.u = vVar;
    }
}
