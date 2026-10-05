package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum v0 extends l3 {
    public v0() {
        super("TagName", 9);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        u0Var.j.i(aVar.F(new d8.m(3)));
        char t = aVar.t();
        if (t == 0) {
            u0Var.j.i(l3.J0);
            return;
        }
        if (t != ' ') {
            if (t == '/') {
                u0Var.o(l3.g0);
                return;
            }
            f1 f1Var = l3.r;
            if (t == '>') {
                u0Var.k();
                u0Var.o(f1Var);
                return;
            }
            if (t == 65535) {
                u0Var.l(this);
                u0Var.o(f1Var);
                return;
            } else if (t != '\t' && t != '\n' && t != '\f' && t != '\r') {
                q0 q0Var = u0Var.j;
                q0Var.getClass();
                q0Var.i(String.valueOf(t));
                return;
            }
        }
        u0Var.o(l3.Y);
    }
}
