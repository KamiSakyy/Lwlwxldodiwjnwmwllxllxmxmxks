package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class c1 extends l3 {
    public c1() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char t = aVar.t();
        if (t == '!') {
            u0Var.h("<!");
            u0Var.o(l3.K);
            return;
        }
        if (t == '/') {
            u0Var.e();
            u0Var.o(l3.I);
        } else if (t != 65535) {
            u0Var.f('<');
            aVar.O0();
            u0Var.o(l3.w);
        } else {
            u0Var.f('<');
            u0Var.l(this);
            u0Var.o(l3.r);
        }
    }
}
