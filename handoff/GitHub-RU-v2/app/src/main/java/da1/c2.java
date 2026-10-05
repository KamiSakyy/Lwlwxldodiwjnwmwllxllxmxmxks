package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum c2 extends l3 {
    public c2() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        aVar.L0();
        String N = aVar.N(l3.I0);
        if (N.length() > 0) {
            u0Var.j.i.g(N);
        }
        int L0 = aVar.L0();
        char t = aVar.t();
        if (t == 0) {
            u0Var.m(this);
            u0Var.j.g((char) 65533, L0, aVar.L0());
            return;
        }
        if (t != ' ') {
            if (t != '\"' && t != '`') {
                f1 f1Var = l3.r;
                if (t == 65535) {
                    u0Var.l(this);
                    u0Var.o(f1Var);
                    return;
                }
                if (t != '\t' && t != '\n' && t != '\f' && t != '\r') {
                    if (t == '&') {
                        int[] c = u0Var.c('>', true);
                        if (c != null) {
                            u0Var.j.h(L0, aVar.L0(), c);
                            return;
                        } else {
                            u0Var.j.g('&', L0, aVar.L0());
                            return;
                        }
                    }
                    if (t != '\'') {
                        switch (t) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                u0Var.k();
                                u0Var.o(f1Var);
                                break;
                            default:
                                u0Var.j.g(t, L0, aVar.L0());
                                break;
                        }
                        return;
                    }
                }
            }
            u0Var.m(this);
            u0Var.j.g(t, L0, aVar.L0());
            return;
        }
        u0Var.o(l3.Y);
    }
}
