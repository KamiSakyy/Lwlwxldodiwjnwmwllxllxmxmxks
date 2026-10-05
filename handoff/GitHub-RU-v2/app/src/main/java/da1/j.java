package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum j extends b0 {
    public j() {
        super("InSelectInTable", 16);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        boolean e = s0Var.e();
        String[] strArr = a0.F;
        if (e && ba1.h.c(((p0) s0Var).l(), strArr)) {
            bVar.k(this);
            bVar.F("select");
            bVar.O();
            return bVar.H(s0Var);
        }
        if (s0Var.d()) {
            o0 o0Var = (o0) s0Var;
            if (ba1.h.c(o0Var.l(), strArr)) {
                bVar.k(this);
                if (!bVar.s(o0Var.l())) {
                    return false;
                }
                bVar.F("select");
                bVar.O();
                return bVar.H(s0Var);
            }
        }
        return b0.G.d(s0Var, bVar);
    }
}
