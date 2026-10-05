package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class i3 extends l3 {
    public i3() {
        super("PLAINTEXT", 6);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char W = aVar.W();
        if (W == 0) {
            u0Var.m(this);
            aVar.f();
            u0Var.f((char) 65533);
        } else if (W != 65535) {
            u0Var.h(aVar.K((char) 0));
        } else {
            u0Var.g(new n0());
        }
    }
}
