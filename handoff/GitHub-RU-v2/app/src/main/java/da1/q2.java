package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class q2 extends l3 {
    public q2() {
        super("BeforeDoctypeName", 52);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        boolean E0 = aVar.E0();
        r2 r2Var = l3.s0;
        if (E0) {
            u0Var.l.f();
            u0Var.o(r2Var);
            return;
        }
        char t = aVar.t();
        if (t == 0) {
            u0Var.m(this);
            m0 m0Var = u0Var.l;
            m0Var.f();
            m0Var.d.e((char) 65533);
            u0Var.o(r2Var);
            return;
        }
        if (t != ' ') {
            if (t == 65535) {
                u0Var.l(this);
                m0 m0Var2 = u0Var.l;
                m0Var2.f();
                m0Var2.h = true;
                u0Var.j();
                u0Var.o(l3.r);
                return;
            }
            if (t == '\t' || t == '\n' || t == '\f' || t == '\r') {
                return;
            }
            u0Var.l.f();
            u0Var.l.d.e(t);
            u0Var.o(r2Var);
        }
    }
}
