package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class y extends b0Shadow {
    public y() {
        super("Text", 7);
    }

    @Override // da1.b0Shadow
    public final boolean d(s0 s0Var, bShadow bVar) {
        if (s0Var.a == 5) {
            bVar.t((k0) s0Var);
            return true;
        }
        if (!s0Var.c()) {
            if (!s0Var.d()) {
                return true;
            }
            bVar.E();
            bVar.l = bVar.m;
            return true;
        }
        bVar.k(this);
        bVar.E();
        b0Shadow b0Var = bVar.m;
        bVar.l = b0Var;
        if (b0Var == b0.y) {
            bVar.l = b0.x;
        }
        return bVar.H(s0Var);
    }
}
