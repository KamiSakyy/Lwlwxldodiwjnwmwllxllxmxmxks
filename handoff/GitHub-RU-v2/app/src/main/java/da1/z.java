package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum z extends b0 {
    public z() {
        super("InTable", 8);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        if (s0Var.a == 5 && ba1.h.c(bVar.h().u.t, a0.z)) {
            bVar.s.clear();
            bVar.m = bVar.l;
            bVar.l = b0.A;
            return bVar.H(s0Var);
        }
        if (s0Var.a()) {
            bVar.v((l0) s0Var);
            return true;
        }
        if (s0Var.b()) {
            bVar.k(this);
            return false;
        }
        boolean e = s0Var.e();
        u uVar = b0.u;
        if (!e) {
            if (!s0Var.d()) {
                if (!s0Var.c()) {
                    e(s0Var, bVar);
                    return true;
                }
                if (bVar.i("html")) {
                    bVar.k(this);
                }
                return true;
            }
            String l = ((o0) s0Var).l();
            if (l.equals("table")) {
                if (!bVar.s(l)) {
                    bVar.k(this);
                    return false;
                }
                bVar.F("table");
                bVar.O();
                return true;
            }
            if (ba1.h.c(l, a0.y)) {
                bVar.k(this);
                return false;
            }
            if (l.equals("template")) {
                uVar.d(s0Var, bVar);
                return true;
            }
            e(s0Var, bVar);
            return true;
        }
        p0 p0Var = (p0) s0Var;
        String l2 = p0Var.l();
        if (l2.equals("caption")) {
            bVar.e();
            bVar.q.add(null);
            bVar.w(p0Var);
            bVar.l = b0.B;
            return true;
        }
        if (l2.equals("colgroup")) {
            bVar.e();
            bVar.w(p0Var);
            bVar.l = b0.C;
            return true;
        }
        if (l2.equals("col")) {
            bVar.e();
            bVar.J("colgroup");
            return bVar.H(s0Var);
        }
        if (ba1.h.c(l2, a0.r)) {
            bVar.e();
            bVar.w(p0Var);
            bVar.l = b0.D;
            return true;
        }
        if (ba1.h.c(l2, a0.s)) {
            bVar.e();
            bVar.J("tbody");
            return bVar.H(s0Var);
        }
        if (l2.equals("table")) {
            bVar.k(this);
            if (bVar.s(l2)) {
                bVar.F(l2);
                if (bVar.O()) {
                    return bVar.H(s0Var);
                }
                bVar.w(p0Var);
                return true;
            }
        } else {
            if (ba1.h.c(l2, a0.t)) {
                return uVar.d(s0Var, bVar);
            }
            if (l2.equals("input")) {
                ca1.b bVar2 = p0Var.g;
                if (bVar2 == null || !bVar2.e("type").equalsIgnoreCase("hidden")) {
                    e(s0Var, bVar);
                    return true;
                }
                bVar.x(p0Var);
                return true;
            }
            if (!l2.equals("form")) {
                e(s0Var, bVar);
                return true;
            }
            bVar.k(this);
            if (bVar.p == null && !bVar.B("template")) {
                bVar.z(p0Var, false, false);
                return true;
            }
        }
        return false;
    }

    public final void e(s0 s0Var, b bVar) {
        bVar.k(this);
        bVar.v = true;
        b0.x.d(s0Var, bVar);
        bVar.v = false;
    }
}
