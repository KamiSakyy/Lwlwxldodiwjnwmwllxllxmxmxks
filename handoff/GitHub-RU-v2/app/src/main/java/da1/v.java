package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class v extends b0 {
    public v() {
        super("InHeadNoscript", 4);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        if (s0Var.b()) {
            bVar.k(this);
            return true;
        }
        if (s0Var.e() && ((p0) s0Var).l().equals("html")) {
            return b0.x.d(s0Var, bVar);
        }
        boolean d = s0Var.d();
        u uVar = b0.u;
        if (d && ((o0) s0Var).l().equals("noscript")) {
            bVar.E();
            bVar.l = uVar;
            return true;
        }
        if (b0.a(s0Var) || s0Var.a() || (s0Var.e() && ba1.h.c(((p0) s0Var).l(), a0.f))) {
            return uVar.d(s0Var, bVar);
        }
        if (s0Var.d() && ((o0) s0Var).l().equals("br")) {
            bVar.k(this);
            k0 k0Var = new k0();
            String obj = s0Var.toString();
            b1.m mVar = k0Var.d;
            mVar.D();
            mVar.s = obj;
            bVar.t(k0Var);
            return true;
        }
        if ((s0Var.e() && ba1.h.c(((p0) s0Var).l(), a0.H)) || s0Var.d()) {
            bVar.k(this);
            return false;
        }
        bVar.k(this);
        k0 k0Var2 = new k0();
        String obj2 = s0Var.toString();
        b1.m mVar2 = k0Var2.d;
        mVar2.D();
        mVar2.s = obj2;
        bVar.t(k0Var2);
        return true;
    }
}
