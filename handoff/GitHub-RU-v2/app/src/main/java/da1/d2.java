package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum d2 extends l3 {
    public d2() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        v1 v1Var = l3.Y;
        if (t == '\t' || t == '\n' || t == '\f' || t == '\r' || t == ' ') {
            u0Var.o(v1Var);
            return;
        }
        if (t == '/') {
            u0Var.o(l3.g0);
            return;
        }
        f1 f1Var = l3.r;
        if (t == 65535) {
            u0Var.l(this);
            u0Var.o(f1Var);
        } else if (t == '>') {
            u0Var.k();
            u0Var.o(f1Var);
        } else {
            if (t == '?' && (u0Var.j instanceof r0)) {
                return;
            }
            aVar.O0();
            u0Var.m(this);
            u0Var.o(v1Var);
        }
    }
}
