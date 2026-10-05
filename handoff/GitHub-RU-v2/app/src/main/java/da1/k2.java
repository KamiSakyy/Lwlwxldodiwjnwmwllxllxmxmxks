package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum k2 extends l3 {
    public k2() {
        super("Comment", 47);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char W = aVar.W();
        if (W == 0) {
            u0Var.m(this);
            aVar.f();
            u0Var.m.g((char) 65533);
        } else {
            if (W == '-') {
                u0Var.a(l3.n0);
                return;
            }
            if (W != 65535) {
                l0 l0Var = u0Var.m;
                l0Var.d.g(aVar.M('-', 0));
            } else {
                u0Var.l(this);
                u0Var.i();
                u0Var.o(l3.r);
            }
        }
    }
}
