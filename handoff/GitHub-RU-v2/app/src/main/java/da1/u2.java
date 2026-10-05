package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class u2 extends l3 {
    public u2() {
        super("BeforeDoctypePublicIdentifier", 56);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        if (t == '\t' || t == '\n' || t == '\f' || t == '\r' || t == ' ') {
            return;
        }
        if (t == '\"') {
            u0Var.o(l3.w0);
            return;
        }
        if (t == '\'') {
            u0Var.o(l3.x0);
            return;
        }
        f1 f1Var = l3.r;
        if (t == '>') {
            u0Var.m(this);
            u0Var.l.h = true;
            u0Var.j();
            u0Var.o(f1Var);
            return;
        }
        if (t != 65535) {
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
