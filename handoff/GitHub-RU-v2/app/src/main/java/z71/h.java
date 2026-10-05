package z71;

import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h extends g {
    public h(y71.i iVar, a71.h hVar, int i, x71.a aVar, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? a71.i.r : hVar, (i2 & 8) != 0 ? x71.a.r : aVar, iVar);
    }

    @Override // z71.d
    public final d e(a71.h hVar, int i, x71.a aVar) {
        return new h(i, hVar, aVar, this.u);
    }

    @Override // z71.d
    public final y71.i f() {
        return this.u;
    }

    @Override // z71.g
    public final Object h(y71.j jVar, a71.c cVar) {
        Object b = this.u.b(jVar, cVar);
        return b == b71.a.r ? b : a0.a;
    }
}
