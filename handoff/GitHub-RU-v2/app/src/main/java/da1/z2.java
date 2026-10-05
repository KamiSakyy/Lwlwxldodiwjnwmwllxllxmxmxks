package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum z2 extends l3 {
    public z2() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 60);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        if (t == '\t' || t == '\n' || t == '\f' || t == '\r' || t == ' ') {
            return;
        }
        if (t == '\"') {
            u0Var.m(this);
            u0Var.o(l3.C0);
            return;
        }
        if (t == '\'') {
            u0Var.m(this);
            u0Var.o(l3.D0);
            return;
        }
        f1 f1Var = l3.r;
        if (t == '>') {
            u0Var.j();
            u0Var.o(f1Var);
        } else if (t != 65535) {
            u0Var.m(this);
            u0Var.l.h = true;
            u0Var.o(l3.F0);
        } else {
            u0Var.l(this);
            u0Var.l.h = true;
            u0Var.j();
            u0Var.o(f1Var);
        }
    }
}
