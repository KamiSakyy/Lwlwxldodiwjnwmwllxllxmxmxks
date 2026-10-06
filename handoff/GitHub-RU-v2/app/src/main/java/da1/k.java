package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class k extends b0Shadow {
    public k() {
        super("InTemplate", 17);
    }

    @Override // da1.b0Shadow
    public final boolean d(s0 s0Var, bShadow bVar) {
        int b = y3.a.b(s0Var.a);
        x xVar = b0.x;
        if (b != 0) {
            u uVar = b0.u;
            if (b == 1) {
                String l = ((p0) s0Var).l();
                if (ba1.h.c(l, a0.J)) {
                    uVar.d(s0Var, bVar);
                    return true;
                }
                if (ba1.h.c(l, a0.K)) {
                    bVar.G();
                    z zVar = b0.z;
                    bVar.K(zVar);
                    bVar.l = zVar;
                    return bVar.H(s0Var);
                }
                if (l.equals("col")) {
                    bVar.G();
                    e eVar = b0.C;
                    bVar.K(eVar);
                    bVar.l = eVar;
                    return bVar.H(s0Var);
                }
                if (l.equals("tr")) {
                    bVar.G();
                    f fVar = b0.D;
                    bVar.K(fVar);
                    bVar.l = fVar;
                    return bVar.H(s0Var);
                }
                if (!l.equals("td") && !l.equals("th")) {
                    bVar.G();
                    bVar.K(xVar);
                    bVar.l = xVar;
                    return bVar.H(s0Var);
                }
                bVar.G();
                g gVar = b0.E;
                bVar.K(gVar);
                bVar.l = gVar;
                return bVar.H(s0Var);
            }
            if (b == 2) {
                if (((o0) s0Var).l().equals("template")) {
                    uVar.d(s0Var, bVar);
                    return true;
                }
                bVar.k(this);
                return false;
            }
            if (b != 3 && b != 4) {
                if (b != 6) {
                    throw new IllegalStateException("Unexpected state: ".concat(com.github.rudroid.copilot.h1.G(s0Var.a)));
                }
                if (bVar.B("template")) {
                    bVar.k(this);
                    bVar.F("template");
                    bVar.c();
                    bVar.G();
                    bVar.O();
                    if (bVar.l != b0.I && bVar.r.size() < 12) {
                        return bVar.H(s0Var);
                    }
                }
                return true;
            }
        }
        xVar.d(s0Var, bVar);
        return true;
    }
}
