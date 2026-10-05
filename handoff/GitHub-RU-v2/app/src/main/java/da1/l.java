package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum l extends b0 {
    public l() {
        super("AfterBody", 18);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        ca1.j n = bVar.n("html");
        boolean a = b0.a(s0Var);
        x xVar = b0.x;
        if (a) {
            if (n != null) {
                bVar.u((k0) s0Var, n);
                return true;
            }
            xVar.d(s0Var, bVar);
            return true;
        }
        if (s0Var.a()) {
            bVar.v((l0) s0Var);
            return true;
        }
        if (s0Var.b()) {
            bVar.k(this);
            return false;
        }
        if (s0Var.e() && ((p0) s0Var).l().equals("html")) {
            return xVar.d(s0Var, bVar);
        }
        if (s0Var.d() && ((o0) s0Var).l().equals("html")) {
            bVar.l = b0.M;
            return true;
        }
        if (s0Var.c()) {
            return true;
        }
        bVar.k(this);
        if (!bVar.B("body")) {
            bVar.e.add(bVar.d.K());
        }
        bVar.l = xVar;
        return bVar.H(s0Var);
    }
}
