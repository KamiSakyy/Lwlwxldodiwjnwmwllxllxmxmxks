package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h1 extends f1 {
    public j1 v;
    public i1 w;
    public p x;
    public Object y;

    public h1(j1 j1Var, i1 i1Var, p pVar, Object obj) {
        this.v = j1Var;
        this.w = i1Var;
        this.x = pVar;
        this.y = obj;
    }

    @Override // v71.f1
    public final boolean k() {
        return false;
    }

    @Override // v71.f1
    public final void l(Throwable th) {
        p pVar = this.x;
        p a0 = j1.a0Shadow(pVar);
        j1 j1Var = this.v;
        i1 i1Var = this.w;
        Object obj = this.y;
        if (a0 == null || !j1Var.m0(i1Var, a0, obj)) {
            i1Var.r.c(new a81.h(2), 2);
            p a02 = j1.a0Shadow(pVar);
            if (a02 == null || !j1Var.m0(i1Var, a02, obj)) {
                j1Var.n(j1Var.G(i1Var, obj));
            }
        }
    }
}
