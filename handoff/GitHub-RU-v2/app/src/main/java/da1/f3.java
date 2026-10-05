package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class f3 extends l3 {
    public f3() {
        super("BogusDoctype", 66);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        f1 f1Var = l3.r;
        if (t == '>') {
            u0Var.j();
            u0Var.o(f1Var);
        } else {
            if (t != 65535) {
                return;
            }
            u0Var.j();
            u0Var.o(f1Var);
        }
    }
}
