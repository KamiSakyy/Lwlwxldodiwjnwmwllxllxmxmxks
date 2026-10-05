package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i1 implements w1, i, z71.r {
    public final /* synthetic */ w1 r;

    public i1(g1 g1Var) {
        this.r = g1Var;
    }

    @Override // z71.r
    public final i a(a71.h hVar, int i, x71.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != x71.a.s) ? n1.z(this, hVar, i, aVar) : this;
    }

    @Override // y71.i
    public final Object b(j jVar, a71.c cVar) {
        return this.r.b(jVar, cVar);
    }

    @Override // y71.w1
    public final Object getValue() {
        return this.r.getValue();
    }
}
