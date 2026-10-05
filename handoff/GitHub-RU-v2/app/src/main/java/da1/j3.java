package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class j3 extends l3 {
    public j3() {
        super("TagOpen", 7);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char W = aVar.W();
        if (W == '!') {
            u0Var.a(l3.i0);
            return;
        }
        if (W == '/') {
            u0Var.a(l3.z);
            return;
        }
        if (W == '?') {
            if (u0Var.g == 2) {
                u0Var.a(l3.j0);
                return;
            } else {
                u0Var.m.f();
                u0Var.o(l3.h0);
                return;
            }
        }
        if (aVar.E0()) {
            u0Var.d(true);
            u0Var.o(l3.A);
        } else {
            u0Var.m(this);
            u0Var.f('<');
            u0Var.o(l3.r);
        }
    }
}
