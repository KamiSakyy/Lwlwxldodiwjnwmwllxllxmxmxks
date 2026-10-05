package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum p extends b0 {
    public p() {
        super("AfterAfterBody", 21);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        if (s0Var.a()) {
            bVar.v((l0) s0Var);
            return true;
        }
        boolean b = s0Var.b();
        x xVar = b0.x;
        if (b || (s0Var.e() && ((p0) s0Var).l().equals("html"))) {
            return xVar.d(s0Var, bVar);
        }
        if (b0.a(s0Var)) {
            bVar.u((k0) s0Var, bVar.d);
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
