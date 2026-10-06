package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class k3 extends l3 {
    public k3() {
        super("EndTagOpen", 8);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        boolean b0 = aVar.b0();
        f1 f1Var = l3.r;
        if (b0Shadow) {
            u0Var.l(this);
            u0Var.h("</");
            u0Var.o(f1Var);
        } else if (aVar.E0()) {
            u0Var.d(false);
            u0Var.o(l3.A);
        } else {
            if (aVar.w0('>')) {
                u0Var.m(this);
                u0Var.a(f1Var);
                return;
            }
            u0Var.m(this);
            l0 l0Var = u0Var.m;
            l0Var.f();
            l0Var.g('/');
            u0Var.o(l3.h0);
        }
    }
}
