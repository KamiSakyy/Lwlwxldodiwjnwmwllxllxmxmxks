package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum n extends b0 {
    public n() {
        super("InFrameset", 19);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        p0 p0Var;
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
        if (!s0Var.e()) {
            if (s0Var.d() && ((o0) s0Var).l().equals("frameset")) {
                if (bVar.i("html")) {
                    bVar.k(this);
                    return false;
                }
                bVar.E();
                if (!bVar.i("frameset")) {
                    bVar.l = b0.L;
                    return true;
                }
            } else {
                if (!s0Var.c()) {
                    bVar.k(this);
                    return false;
                }
                if (!bVar.i("html")) {
                    bVar.k(this);
                }
            }
            return true;
        }
        p0Var = (p0) s0Var;
        String l = p0Var.l();
        l.getClass();
        switch (l) {
            case "frameset":
                bVar.w(p0Var);
                break;
            case "html":
                break;
            case "frame":
                bVar.x(p0Var);
                break;
            case "noframes":
                break;
            default:
                bVar.k(this);
                break;
        }
        return true;
    }
}
