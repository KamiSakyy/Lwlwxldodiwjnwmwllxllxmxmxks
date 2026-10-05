package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum l2 extends l3 {
    public l2() {
        super("CommentEndDash", 48);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        k2 k2Var = l3.m0;
        if (t == 0) {
            u0Var.m(this);
            l0 l0Var = u0Var.m;
            l0Var.d.e('-');
            l0Var.g((char) 65533);
            u0Var.o(k2Var);
            return;
        }
        if (t == '-') {
            u0Var.o(l3.o0);
            return;
        }
        if (t == 65535) {
            u0Var.l(this);
            u0Var.i();
            u0Var.o(l3.r);
        } else {
            l0 l0Var2 = u0Var.m;
            l0Var2.d.e('-');
            l0Var2.g(t);
            u0Var.o(k2Var);
        }
    }
}
