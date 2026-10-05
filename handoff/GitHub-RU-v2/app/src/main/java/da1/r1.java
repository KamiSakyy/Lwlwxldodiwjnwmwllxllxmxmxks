package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum r1 extends l3 {
    public r1() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        p1 p1Var = l3.T;
        if (t == 0) {
            u0Var.m(this);
            u0Var.f((char) 65533);
            u0Var.o(p1Var);
        } else if (t == '-') {
            u0Var.f(t);
            u0Var.o(l3.V);
        } else if (t == '<') {
            u0Var.f(t);
            u0Var.o(l3.W);
        } else if (t != 65535) {
            u0Var.f(t);
            u0Var.o(p1Var);
        } else {
            u0Var.l(this);
            u0Var.o(l3.r);
        }
    }
}
