package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class s extends b0 {
    public s() {
        super("BeforeHtml", 1);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        if (s0Var.b()) {
            bVar.k(this);
            return false;
        }
        if (s0Var.a()) {
            bVar.v((l0) s0Var);
            return true;
        }
        if (b0.a(s0Var)) {
            bVar.t((k0) s0Var);
            return true;
        }
        boolean e = s0Var.e();
        t tVar = b0.t;
        if (e) {
            p0 p0Var = (p0) s0Var;
            if (p0Var.l().equals("html")) {
                bVar.w(p0Var);
                bVar.l = tVar;
                return true;
            }
        }
        if (s0Var.d() && ba1.h.c(((o0) s0Var).l(), a0.e)) {
            bVar.J("html");
            bVar.l = tVar;
            return bVar.H(s0Var);
        }
        if (s0Var.d()) {
            bVar.k(this);
            return false;
        }
        bVar.J("html");
        bVar.l = tVar;
        return bVar.H(s0Var);
    }
}
