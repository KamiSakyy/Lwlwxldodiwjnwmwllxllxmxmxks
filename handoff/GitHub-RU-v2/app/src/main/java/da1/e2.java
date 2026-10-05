package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class e2 extends l3 {
    public e2() {
        super("SelfClosingStartTag", 41);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        f1 f1Var = l3.r;
        if (t == '>') {
            u0Var.j.f = true;
            u0Var.k();
            u0Var.o(f1Var);
        } else if (t == 65535) {
            u0Var.l(this);
            u0Var.o(f1Var);
        } else {
            aVar.O0();
            u0Var.m(this);
            u0Var.o(l3.Y);
        }
    }
}
