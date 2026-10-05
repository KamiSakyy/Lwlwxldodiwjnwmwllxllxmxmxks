package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class r2 extends l3 {
    public r2() {
        super("DoctypeName", 53);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        if (aVar.E0()) {
            u0Var.l.d.g(aVar.E());
            return;
        }
        char t = aVar.t();
        if (t == 0) {
            u0Var.m(this);
            u0Var.l.d.e((char) 65533);
            return;
        }
        if (t != ' ') {
            f1 f1Var = l3.r;
            if (t == '>') {
                u0Var.j();
                u0Var.o(f1Var);
                return;
            }
            if (t == 65535) {
                u0Var.l(this);
                u0Var.l.h = true;
                u0Var.j();
                u0Var.o(f1Var);
                return;
            }
            if (t != '\t' && t != '\n' && t != '\f' && t != '\r') {
                u0Var.l.d.e(t);
                return;
            }
        }
        u0Var.o(l3.t0);
    }
}
