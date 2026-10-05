package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class i2 extends l3 {
    public i2() {
        super("CommentStart", 45);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        k2 k2Var = l3.m0;
        if (t == 0) {
            u0Var.m(this);
            u0Var.m.g((char) 65533);
            u0Var.o(k2Var);
            return;
        }
        if (t == '-') {
            u0Var.o(l3.l0);
            return;
        }
        f1 f1Var = l3.r;
        if (t == '>') {
            u0Var.m(this);
            u0Var.i();
            u0Var.o(f1Var);
        } else if (t != 65535) {
            aVar.O0();
            u0Var.o(k2Var);
        } else {
            u0Var.l(this);
            u0Var.i();
            u0Var.o(f1Var);
        }
    }
}
