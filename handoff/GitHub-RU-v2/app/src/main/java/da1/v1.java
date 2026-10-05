package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class v1 extends l3 {
    public v1() {
        super("BeforeAttributeName", 33);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        w1 w1Var = l3.Z;
        if (t == 0) {
            aVar.O0();
            u0Var.m(this);
            u0Var.j.k();
            u0Var.o(w1Var);
            return;
        }
        if (t != ' ') {
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
                if (t == '\t' || t == '\n' || t == '\f' || t == '\r') {
                    return;
                }
                switch (t) {
                    case '>':
                        u0Var.k();
                        u0Var.o(f1Var);
                        return;
                    case '?':
                        if (u0Var.j instanceof r0) {
                            return;
                        }
                        break;
                }
                u0Var.j.k();
                aVar.O0();
                u0Var.o(w1Var);
                return;
            }
            u0Var.m(this);
            u0Var.j.k();
            u0Var.j.h.e(t);
            u0Var.o(w1Var);
        }
    }
}
