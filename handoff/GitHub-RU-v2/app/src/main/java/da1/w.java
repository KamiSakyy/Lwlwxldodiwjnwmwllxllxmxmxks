package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class w extends b0 {
    public w() {
        super("AfterHead", 5);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        if (b0.a(s0Var)) {
            bVar.t((k0) s0Var);
        } else if (s0Var.a()) {
            bVar.v((l0) s0Var);
        } else if (s0Var.b()) {
            bVar.k(this);
        } else {
            boolean e = s0Var.e();
            u uVar = b0.u;
            if (e) {
                p0 p0Var = (p0) s0Var;
                String l = p0Var.l();
                boolean equals = l.equals("html");
                x xVar = b0.x;
                if (equals) {
                    return xVar.d(s0Var, bVar);
                }
                if (l.equals("body")) {
                    bVar.w(p0Var);
                    bVar.u = false;
                    bVar.l = xVar;
                } else if (l.equals("frameset")) {
                    bVar.w(p0Var);
                    bVar.l = b0.K;
                } else if (ba1.h.c(l, a0.g)) {
                    bVar.k(this);
                    ca1.j jVar = bVar.o;
                    bVar.e.add(jVar);
                    uVar.d(s0Var, bVar);
                    bVar.N(jVar);
                } else {
                    if (l.equals("head")) {
                        bVar.k(this);
                        return false;
                    }
                    bVar.J("body");
                    bVar.u = true;
                    bVar.H(s0Var);
                }
            } else if (s0Var.d()) {
                String l2 = ((o0) s0Var).l();
                if (ba1.h.c(l2, a0.d)) {
                    bVar.J("body");
                    bVar.u = true;
                    bVar.H(s0Var);
                } else {
                    if (!l2.equals("template")) {
                        bVar.k(this);
                        return false;
                    }
                    uVar.d(s0Var, bVar);
                }
            } else {
                bVar.J("body");
                bVar.u = true;
                bVar.H(s0Var);
            }
        }
        return true;
    }
}
