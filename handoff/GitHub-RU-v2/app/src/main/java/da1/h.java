package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class h extends b0Shadow {
    public h() {
        super("InCell", 14);
    }

    @Override // da1.b0Shadow
    public final boolean d(s0 s0Var, bShadow bVar) {
        boolean d = s0Var.d();
        x xVar = b0.x;
        if (!d) {
            if (!s0Var.e() || !ba1.h.c(((p0) s0Var).l(), a0.x)) {
                return xVar.d(s0Var, bVar);
            }
            if (!bVar.s("td") && !bVar.s("th")) {
                bVar.k(this);
                return false;
            }
            if (bVar.s("td")) {
                bVar.I("td");
            } else {
                bVar.I("th");
            }
            return bVar.H(s0Var);
        }
        String l = ((o0) s0Var).l();
        if (!ba1.h.c(l, a0.u)) {
            if (ba1.h.c(l, a0.v)) {
                bVar.k(this);
                return false;
            }
            if (!ba1.h.c(l, a0.w)) {
                return xVar.d(s0Var, bVar);
            }
            if (!bVar.s(l)) {
                bVar.k(this);
                return false;
            }
            if (bVar.s("td")) {
                bVar.I("td");
            } else {
                bVar.I("th");
            }
            return bVar.H(s0Var);
        }
        boolean s = bVar.s(l);
        g gVar = b0.E;
        if (!s) {
            bVar.k(this);
            bVar.l = gVar;
            return false;
        }
        bVar.m(false);
        if (!bVar.i(l)) {
            bVar.k(this);
        }
        bVar.F(l);
        bVar.c();
        bVar.l = gVar;
        return true;
    }

    public h(Object... a) {
    }
}
