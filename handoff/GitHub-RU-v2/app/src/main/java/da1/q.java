package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class q extends b0Shadow {
    public q() {
        super("AfterAfterFrameset", 22);
    }

    @Override // da1.b0Shadow
    public final boolean d(s0 s0Var, bShadow bVar) {
        if (s0Var.a()) {
            bVar.v((l0) s0Var);
            return true;
        }
        if (s0Var.b() || b0.a(s0Var) || (s0Var.e() && ((p0) s0Var).l().equals("html"))) {
            return b0.x.d(s0Var, bVar);
        }
        if (s0Var.c()) {
            return true;
        }
        if (s0Var.e() && ((p0) s0Var).l().equals("noframes")) {
            return b0.u.d(s0Var, bVar);
        }
        bVar.k(this);
        return false;
    }
}
