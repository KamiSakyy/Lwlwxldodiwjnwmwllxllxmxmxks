package da1;

/* loaded from: /home/user/work/p/classes5.dex */
class e extends b0Shadow {
    public e() {
        super("InColumnGroup", 11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009d, code lost:
    
        if (r7.equals("template") == false) goto L40;
     */
    @Override // da1.b0Shadow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(s0 s0Var, bShadow bVar) {
        if (b0.a(s0Var)) {
            bVar.t((k0) s0Var);
            return true;
        }
        int b = y3.a.b(s0Var.a);
        if (b == 0) {
            bVar.k(this);
            return true;
        }
        boolean z = false;
        u uVar = b0.u;
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    bVar.v((l0) s0Var);
                    return true;
                }
                if (b == 6 && bVar.i("html")) {
                    return true;
                }
                return e(s0Var, bVar);
            }
            String l = ((o0) s0Var).l();
            l.getClass();
            if (l.equals("template")) {
                uVar.d(s0Var, bVar);
                return true;
            }
            if (!l.equals("colgroup")) {
                return e(s0Var, bVar);
            }
            if (!bVar.i(l)) {
                bVar.k(this);
                return false;
            }
            bVar.E();
            bVar.l = b0.z;
            return true;
        }
        p0 p0Var = (p0) s0Var;
        String l2 = p0Var.l();
        l2.getClass();
        switch (l2.hashCode()) {
            case -1321546630:
                break;
            case 98688:
                if (l2.equals("col")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 3213227:
                if (l2.equals("html")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                uVar.d(s0Var, bVar);
                return true;
            case true:
                bVar.x(p0Var);
                return true;
            case true:
                return b0.x.d(s0Var, bVar);
            default:
                return e(s0Var, bVar);
        }
    }

    public final boolean e(s0 s0Var, bShadow bVar) {
        if (!bVar.i("colgroup")) {
            bVar.k(this);
            return false;
        }
        bVar.E();
        bVar.l = b0.z;
        bVar.H(s0Var);
        return true;
    }

    public e(Object... a) {
    }
}
