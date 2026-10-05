package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum o extends b0 {
    public o() {
        super("AfterFrameset", 20);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        if (b0.a(s0Var)) {
            bVar.t((k0) s0Var);
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
            return b0.x.d(s0Var, bVar);
        }
        if (s0Var.d() && ((o0) s0Var).l().equals("html")) {
            bVar.l = b0.N;
            return true;
        }
        if (s0Var.e() && ((p0) s0Var).l().equals("noframes")) {
            return b0.u.d(s0Var, bVar);
        }
        if (s0Var.c()) {
            return true;
        }
        bVar.k(this);
        return false;
    }
}
