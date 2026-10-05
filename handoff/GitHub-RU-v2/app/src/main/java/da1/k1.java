package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class k1 extends l3 {
    public k1() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        if (aVar.b0()) {
            u0Var.l(this);
            u0Var.o(l3.r);
            return;
        }
        char t = aVar.t();
        i1 i1Var = l3.M;
        if (t == 0) {
            u0Var.m(this);
            u0Var.f((char) 65533);
            u0Var.o(i1Var);
        } else {
            if (t == '-') {
                u0Var.f(t);
                return;
            }
            if (t == '<') {
                u0Var.o(l3.P);
            } else if (t != '>') {
                u0Var.f(t);
                u0Var.o(i1Var);
            } else {
                u0Var.f(t);
                u0Var.o(l3.w);
            }
        }
    }
}
