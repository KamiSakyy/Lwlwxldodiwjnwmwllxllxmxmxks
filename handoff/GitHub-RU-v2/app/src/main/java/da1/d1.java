package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum d1 extends l3 {
    public d1() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        if (aVar.E0()) {
            u0Var.d(false);
            u0Var.o(l3.J);
        } else {
            u0Var.h("</");
            u0Var.o(l3.w);
        }
    }
}
