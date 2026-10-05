package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum i1 extends l3 {
    public i1() {
        super("ScriptDataEscaped", 21);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        if (aVar.b0()) {
            u0Var.l(this);
            u0Var.o(l3.r);
            return;
        }
        char W = aVar.W();
        if (W == 0) {
            u0Var.m(this);
            aVar.f();
            u0Var.f((char) 65533);
        } else if (W == '-') {
            u0Var.f('-');
            u0Var.a(l3.N);
        } else if (W != '<') {
            u0Var.h(aVar.M('-', '<', 0));
        } else {
            u0Var.a(l3.P);
        }
    }
}
