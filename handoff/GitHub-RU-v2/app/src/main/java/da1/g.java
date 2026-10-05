package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class g extends b0 {
    public g() {
        super("InRow", 13);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        boolean e = s0Var.e();
        z zVar = b0.z;
        f fVar = b0.D;
        if (e) {
            p0 p0Var = (p0) s0Var;
            String l = p0Var.l();
            if (ba1.h.c(l, a0.u)) {
                bVar.f();
                bVar.w(p0Var);
                bVar.l = b0.F;
                bVar.q.add(null);
                return true;
            }
            if (!ba1.h.c(l, a0.C)) {
                return zVar.d(s0Var, bVar);
            }
            if (!bVar.s("tr")) {
                bVar.k(this);
                return false;
            }
            bVar.f();
            bVar.E();
            bVar.l = fVar;
            return bVar.H(s0Var);
        }
        if (!s0Var.d()) {
            return zVar.d(s0Var, bVar);
        }
        String l2 = ((o0) s0Var).l();
        if (l2.equals("tr")) {
            if (!bVar.s(l2)) {
                bVar.k(this);
                return false;
            }
            bVar.f();
            bVar.E();
            bVar.l = fVar;
            return true;
        }
        if (l2.equals("table")) {
            if (!bVar.s("tr")) {
                bVar.k(this);
                return false;
            }
            bVar.f();
            bVar.E();
            bVar.l = fVar;
            return bVar.H(s0Var);
        }
        if (!ba1.h.c(l2, a0.r)) {
            if (!ba1.h.c(l2, a0.D)) {
                return zVar.d(s0Var, bVar);
            }
            bVar.k(this);
            return false;
        }
        if (!bVar.s(l2)) {
            bVar.k(this);
            return false;
        }
        if (!bVar.s("tr")) {
            return false;
        }
        bVar.f();
        bVar.E();
        bVar.l = fVar;
        return bVar.H(s0Var);
    }

    public g(Object... a) {
    }
}
