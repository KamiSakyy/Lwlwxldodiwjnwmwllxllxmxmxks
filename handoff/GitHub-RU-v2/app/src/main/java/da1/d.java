package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class d extends b0 {
    public d() {
        super("InCaption", 10);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        boolean d = s0Var.d();
        z zVar = b0.z;
        if (d && ((o0) s0Var).l().equals("caption")) {
            if (!bVar.s("caption")) {
                bVar.k(this);
                return false;
            }
            bVar.m(false);
            if (!bVar.i("caption")) {
                bVar.k(this);
            }
            bVar.F("caption");
            bVar.c();
            bVar.l = zVar;
            return true;
        }
        if ((!s0Var.e() || !ba1.h.c(((p0) s0Var).l(), a0.x)) && (!s0Var.d() || !((o0) s0Var).l().equals("table"))) {
            if (!s0Var.d() || !ba1.h.c(((o0) s0Var).l(), a0.I)) {
                return b0.x.d(s0Var, bVar);
            }
            bVar.k(this);
            return false;
        }
        if (!bVar.s("caption")) {
            bVar.k(this);
            return false;
        }
        bVar.m(false);
        if (!bVar.i("caption")) {
            bVar.k(this);
        }
        bVar.F("caption");
        bVar.c();
        bVar.l = zVar;
        zVar.d(s0Var, bVar);
        return true;
    }
    public Object hasNext() { return null; }
    public Object next() { return null; }
}
