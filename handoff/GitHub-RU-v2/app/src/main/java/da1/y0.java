package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class y0 extends l3 {
    public y0() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(u0 u0Var, a aVar) {
        u0Var.h("</");
        u0Var.h(u0Var.f.G());
        aVar.O0();
        u0Var.o(l3.t);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        if (aVar.E0()) {
            String F = aVar.F(new d8.m(3));
            u0Var.j.i(F);
            u0Var.f.g(F);
            return;
        }
        char t = aVar.t();
        if (t == '\t' || t == '\n' || t == '\f' || t == '\r' || t == ' ') {
            if (u0Var.n()) {
                u0Var.o(l3.Y);
                return;
            } else {
                e(u0Var, aVar);
                return;
            }
        }
        if (t == '/') {
            if (u0Var.n()) {
                u0Var.o(l3.g0);
                return;
            } else {
                e(u0Var, aVar);
                return;
            }
        }
        if (t != '>') {
            e(u0Var, aVar);
        } else if (!u0Var.n()) {
            e(u0Var, aVar);
        } else {
            u0Var.k();
            u0Var.o(l3.r);
        }
    }
}
