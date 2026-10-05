package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum l1 extends l3 {
    public l1() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        if (aVar.E0()) {
            u0Var.e();
            u0Var.f.e(aVar.W());
            u0Var.f('<');
            u0Var.f(aVar.W());
            u0Var.a(l3.S);
            return;
        }
        if (aVar.w0('/')) {
            u0Var.e();
            u0Var.a(l3.Q);
        } else {
            u0Var.f('<');
            u0Var.o(l3.M);
        }
    }
}
