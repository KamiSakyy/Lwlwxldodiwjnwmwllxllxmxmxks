package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class i extends b0 {
    public i() {
        super("InSelect", 15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0068, code lost:
    
        if (r0.equals("optgroup") == false) goto L29;
     */
    @Override // da1.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(s0 s0Var, b bVar) {
        int b = y3.a.b(s0Var.a);
        if (b == 0) {
            bVar.k(this);
            return false;
        }
        u uVar = b0.u;
        if (b == 1) {
            p0 p0Var = (p0) s0Var;
            String l = p0Var.l();
            if (l.equals("html")) {
                return b0.x.d(p0Var, bVar);
            }
            if (l.equals("option")) {
                if (bVar.i("option")) {
                    bVar.I("option");
                }
                bVar.w(p0Var);
                return true;
            }
            if (l.equals("optgroup")) {
                if (bVar.i("option")) {
                    bVar.I("option");
                }
                if (bVar.i("optgroup")) {
                    bVar.I("optgroup");
                }
                bVar.w(p0Var);
                return true;
            }
            if (l.equals("select")) {
                bVar.k(this);
                return bVar.I("select");
            }
            if (!ba1.h.c(l, a0.E)) {
                if (l.equals("script") || l.equals("template")) {
                    return uVar.d(s0Var, bVar);
                }
                bVar.k(this);
                return false;
            }
            bVar.k(this);
            if (!bVar.q("select")) {
                return false;
            }
            do {
                bVar.F("select");
                bVar.O();
            } while (bVar.q("select"));
            return bVar.H(p0Var);
        }
        char c = 3;
        if (b != 2) {
            if (b == 3) {
                bVar.v((l0) s0Var);
                return true;
            }
            if (b != 4) {
                if (b != 6) {
                    bVar.k(this);
                    return false;
                }
                if (!bVar.i("html")) {
                    bVar.k(this);
                }
                return true;
            }
            k0 k0Var = (k0) s0Var;
            if (k0Var.d.G().equals(b0.P)) {
                bVar.k(this);
                return false;
            }
            bVar.t(k0Var);
            return true;
        }
        String l2 = ((o0) s0Var).l();
        l2.getClass();
        switch (l2.hashCode()) {
            case -1321546630:
                if (l2.equals("template")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1010136971:
                if (l2.equals("option")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -906021636:
                if (l2.equals("select")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -80773204:
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return uVar.d(s0Var, bVar);
            case 1:
                if (bVar.i("option")) {
                    bVar.E();
                    return true;
                }
                bVar.k(this);
                return true;
            case 2:
                if (!bVar.q(l2)) {
                    bVar.k(this);
                    return false;
                }
                bVar.F(l2);
                bVar.O();
                return true;
            case 3:
                if (bVar.i("option") && bVar.a(bVar.h()) != null && bVar.a(bVar.h()).p("optgroup")) {
                    bVar.I("option");
                }
                if (bVar.i("optgroup")) {
                    bVar.E();
                    return true;
                }
                bVar.k(this);
                return true;
            default:
                bVar.k(this);
                return false;
        }
    }
}
