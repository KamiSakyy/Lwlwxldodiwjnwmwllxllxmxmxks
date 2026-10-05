package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class f extends b0 {
    public f() {
        super("InTableBody", 12);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        int b = y3.a.b(s0Var.a);
        z zVar = b0.z;
        if (b == 1) {
            p0 p0Var = (p0) s0Var;
            String l = p0Var.l();
            if (l.equals("tr")) {
                bVar.d("tbody", "tfoot", "thead", "template");
                bVar.w(p0Var);
                bVar.l = b0.E;
                return true;
            }
            if (!ba1.h.c(l, a0.u)) {
                return ba1.h.c(l, a0.A) ? e(s0Var, bVar) : zVar.d(s0Var, bVar);
            }
            bVar.k(this);
            bVar.J("tr");
            return bVar.H(p0Var);
        }
        if (b != 2) {
            return zVar.d(s0Var, bVar);
        }
        String l2 = ((o0) s0Var).l();
        if (!ba1.h.c(l2, a0.G)) {
            if (l2.equals("table")) {
                return e(s0Var, bVar);
            }
            if (!ba1.h.c(l2, a0.B)) {
                return zVar.d(s0Var, bVar);
            }
            bVar.k(this);
            return false;
        }
        if (!bVar.s(l2)) {
            bVar.k(this);
            return false;
        }
        bVar.d("tbody", "tfoot", "thead", "template");
        bVar.E();
        bVar.l = zVar;
        return true;
    }

    public final boolean e(s0 s0Var, b bVar) {
        if (!bVar.s("tbody") && !bVar.s("thead") && !bVar.p("tfoot")) {
            bVar.k(this);
            return false;
        }
        bVar.d("tbody", "tfoot", "thead", "template");
        bVar.I(bVar.h().u.t);
        return bVar.H(s0Var);
    }

    public f(Object... a) {
    }
}
