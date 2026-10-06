package z71;

import v71.b0;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k extends g {
    public c71.j v;

    public k(j71.f fVar, y71.i iVar, a71.h hVar, int i, x71.a aVar) {
        super(i, hVar, aVar, iVar);
        this.v = (c71.j) fVar;
    }

    @Override // z71.d
    public final d e(a71.h hVar, int i, x71.a aVar) {
        return new k(this.v, this.u, hVar, i, aVar);
    }

    @Override // z71.g
    public final Object h(y71.j jVar, a71.c cVar) {
        Object k = b0.k(new i(this, jVar, null), cVar);
        return k == b71.a.r ? k : a0.a;
    }
}
