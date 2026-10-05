package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class u extends b0 {
    public u() {
        super("InHead", 3);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        if (b0.a(s0Var)) {
            bVar.t((k0) s0Var);
            return true;
        }
        int b = y3.a.b(s0Var.a);
        if (b == 0) {
            bVar.k(this);
            return false;
        }
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    bVar.I("head");
                    return bVar.H(s0Var);
                }
                bVar.v((l0) s0Var);
                return true;
            }
            String l = ((o0) s0Var).l();
            if (l.equals("head")) {
                bVar.E();
                bVar.l = b0.w;
                return true;
            }
            if (ba1.h.c(l, a0.c)) {
                bVar.I("head");
                return bVar.H(s0Var);
            }
            if (!l.equals("template")) {
                bVar.k(this);
                return false;
            }
            if (!bVar.B(l)) {
                bVar.k(this);
                return true;
            }
            bVar.m(true);
            if (!bVar.i(l)) {
                bVar.k(this);
            }
            bVar.F(l);
            bVar.c();
            bVar.G();
            bVar.O();
            return true;
        }
        p0 p0Var = (p0) s0Var;
        String l2 = p0Var.l();
        if (l2.equals("html")) {
            return b0.x.d(s0Var, bVar);
        }
        if (ba1.h.c(l2, a0.a)) {
            ca1.j x = bVar.x(p0Var);
            if (l2.equals("base") && x.n("href") && !bVar.n) {
                String a = x.a("href");
                if (a.length() != 0) {
                    bVar.f = a;
                    bVar.n = true;
                    ca1.g gVar = bVar.d;
                    gVar.getClass();
                    gVar.G(a);
                }
            }
            return true;
        }
        if (l2.equals("meta")) {
            bVar.x(p0Var);
            return true;
        }
        if (l2.equals("title")) {
            b0.b(p0Var, bVar, bVar.P(p0Var).e());
            return true;
        }
        if (ba1.h.c(l2, a0.b)) {
            b0.b(p0Var, bVar, bVar.P(p0Var).e());
            return true;
        }
        if (l2.equals("noscript")) {
            bVar.w(p0Var);
            bVar.l = b0.v;
            return true;
        }
        if (l2.equals("script")) {
            bVar.c.o(l3.w);
            bVar.m = bVar.l;
            bVar.l = b0.y;
            bVar.w(p0Var);
            return true;
        }
        if (l2.equals("head")) {
            bVar.k(this);
            return false;
        }
        if (!l2.equals("template")) {
            bVar.I("head");
            return bVar.H(s0Var);
        }
        bVar.w(p0Var);
        bVar.q.add(null);
        bVar.u = false;
        k kVar = b0.I;
        bVar.l = kVar;
        bVar.K(kVar);
        return true;
    }

    public u(Object... a) {
    }
}
