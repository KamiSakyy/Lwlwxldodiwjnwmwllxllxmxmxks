package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum f2 extends l3 {
    public f2() {
        super("BogusComment", 42);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        l0 l0Var = u0Var.m;
        l0Var.d.g(aVar.K('>'));
        char W = aVar.W();
        if (W == '>' || W == 65535) {
            aVar.t();
            u0Var.i();
            u0Var.o(l3.r);
        }
    }
}
