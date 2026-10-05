package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class m1 extends l3 {
    public m1() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        if (!aVar.E0()) {
            u0Var.h("</");
            u0Var.o(l3.M);
            return;
        }
        u0Var.d(false);
        q0 q0Var = u0Var.j;
        char W = aVar.W();
        q0Var.getClass();
        q0Var.i(String.valueOf(W));
        u0Var.f.e(aVar.W());
        u0Var.a(l3.R);
    }
}
