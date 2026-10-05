package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class p2 extends l3 {
    public p2() {
        super("Doctype", 51);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        q2 q2Var = l3.r0;
        if (t == '\t' || t == '\n' || t == '\f' || t == '\r' || t == ' ') {
            u0Var.o(q2Var);
            return;
        }
        if (t != '>') {
            if (t != 65535) {
                u0Var.m(this);
                u0Var.o(q2Var);
                return;
            }
            u0Var.l(this);
        }
        u0Var.m(this);
        m0 m0Var = u0Var.l;
        m0Var.f();
        m0Var.h = true;
        u0Var.j();
        u0Var.o(l3.r);
    }
}
