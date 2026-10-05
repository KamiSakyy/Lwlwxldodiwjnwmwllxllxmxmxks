package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum f1 extends l3 {
    public f1() {
        super("Data", 0);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char W = aVar.W();
        if (W == 0) {
            u0Var.m(this);
            u0Var.f(aVar.t());
        } else {
            if (W == '&') {
                u0Var.a(l3.s);
                return;
            }
            if (W == '<') {
                u0Var.a(l3.y);
            } else if (W != 65535) {
                u0Var.h(aVar.A());
            } else {
                u0Var.g(new n0());
            }
        }
    }
}
