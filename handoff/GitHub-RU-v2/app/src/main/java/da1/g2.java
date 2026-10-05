package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum g2 extends l3 {
    public g2() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        if (aVar.i0("--")) {
            u0Var.m.f();
            u0Var.o(l3.k0);
            return;
        }
        if (aVar.o0("DOCTYPE")) {
            u0Var.o(l3.q0);
            return;
        }
        if (aVar.i0("[CDATA[")) {
            u0Var.e();
            u0Var.o(l3.G0);
            return;
        }
        if (u0Var.g != 2 || !aVar.E0()) {
            u0Var.m(this);
            u0Var.m.f();
            u0Var.o(l3.h0);
        } else {
            r0 r0Var = u0Var.n;
            r0Var.f();
            r0Var.k = true;
            u0Var.j = r0Var;
            u0Var.o(l3.A);
        }
    }
}
