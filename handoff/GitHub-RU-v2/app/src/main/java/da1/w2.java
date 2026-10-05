package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum w2 extends l3 {
    public w2() {
        super("DoctypePublicIdentifier_singleQuoted", 58);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        if (t == 0) {
            u0Var.m(this);
            u0Var.l.f.e((char) 65533);
            return;
        }
        if (t == '\'') {
            u0Var.o(l3.y0);
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
            u0Var.l.f.e(t);
            return;
        }
        u0Var.l(this);
        u0Var.l.h = true;
        u0Var.j();
        u0Var.o(f1Var);
    }
}
