package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum t extends b0 {
    public t() {
        super("BeforeHead", 2);
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
        if (s0Var.e()) {
            p0 p0Var = (p0) s0Var;
            if (p0Var.l().equals("head")) {
                bVar.o = bVar.w(p0Var);
                bVar.l = b0.u;
                return true;
            }
        }
        if (s0Var.d() && ba1.h.c(((o0) s0Var).l(), a0.e)) {
            bVar.J("head");
            return bVar.H(s0Var);
        }
        if (s0Var.d()) {
            bVar.k(this);
            return false;
        }
        bVar.J("head");
        return bVar.H(s0Var);
    }
}
