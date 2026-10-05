package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum p1 extends l3 {
    public p1() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char W = aVar.W();
        if (W == 0) {
            u0Var.m(this);
            aVar.f();
            u0Var.f((char) 65533);
        } else if (W == '-') {
            u0Var.f(W);
            u0Var.a(l3.U);
        } else if (W == '<') {
            u0Var.f(W);
            u0Var.a(l3.W);
        } else if (W != 65535) {
            u0Var.h(aVar.M('-', '<', 0));
        } else {
            u0Var.l(this);
            u0Var.o(l3.r);
        }
    }
}
