package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum b2 extends l3 {
    public b2() {
        super("Rcdata", 2);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char W = aVar.W();
        if (W == 0) {
            u0Var.m(this);
            aVar.f();
            u0Var.f((char) 65533);
        } else {
            if (W == '&') {
                u0Var.a(l3.u);
                return;
            }
            if (W == '<') {
                u0Var.a(l3.B);
            } else if (W != 65535) {
                u0Var.h(aVar.A());
            } else {
                u0Var.g(new n0());
            }
        }
    }
}
