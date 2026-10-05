package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class y1 extends l3 {
    public y1() {
        super("BeforeAttributeValue", 36);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        c2 c2Var = l3.e0;
        if (t == 0) {
            u0Var.m(this);
            u0Var.j.g((char) 65533, aVar.L0() - 1, aVar.L0());
            u0Var.o(c2Var);
            return;
        }
        if (t != ' ') {
            if (t == '\"') {
                u0Var.o(l3.c0);
                return;
            }
            if (t != '`') {
                f1 f1Var = l3.r;
                if (t == 65535) {
                    u0Var.l(this);
                    u0Var.k();
                    u0Var.o(f1Var);
                    return;
                }
                if (t == '\t' || t == '\n' || t == '\f' || t == '\r') {
                    return;
                }
                if (t == '&') {
                    aVar.O0();
                    u0Var.o(c2Var);
                    return;
                }
                if (t == '\'') {
                    u0Var.o(l3.d0);
                    return;
                }
                switch (t) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        u0Var.m(this);
                        u0Var.k();
                        u0Var.o(f1Var);
                        break;
                    default:
                        aVar.O0();
                        u0Var.o(c2Var);
                        break;
                }
                return;
            }
            u0Var.m(this);
            u0Var.j.g(t, aVar.L0() - 1, aVar.L0());
            u0Var.o(c2Var);
        }
    }
}
