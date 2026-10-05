package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class w1 extends l3 {
    public w1() {
        super("AttributeName", 34);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        aVar.L0();
        String N = aVar.N(l3.H0);
        q0 q0Var = u0Var.j;
        q0Var.getClass();
        q0Var.h.g(N.replace((char) 0, (char) 65533));
        char t = aVar.t();
        x1 x1Var = l3.a0;
        if (t == '\t' || t == '\n' || t == '\f' || t == '\r' || t == ' ') {
            u0Var.o(x1Var);
            return;
        }
        if (t != '\"' && t != '\'') {
            if (t == '/') {
                u0Var.o(l3.g0);
                return;
            }
            f1 f1Var = l3.r;
            if (t == 65535) {
                u0Var.l(this);
                u0Var.o(f1Var);
                return;
            }
            switch (t) {
                case '=':
                    u0Var.o(l3.b0);
                    return;
                case '>':
                    u0Var.k();
                    u0Var.o(f1Var);
                    return;
                case '?':
                    if (u0Var.g == 2 && (u0Var.j instanceof r0)) {
                        u0Var.o(x1Var);
                        return;
                    }
                    break;
            }
            u0Var.j.h.e(t);
            return;
        }
        u0Var.m(this);
        u0Var.j.h.e(t);
    }
}
