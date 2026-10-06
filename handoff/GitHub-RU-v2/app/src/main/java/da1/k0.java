package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public class k0 extends s0 {
    public final b1.m d;

    public k0() {
        super(5);
        this.d = new b1.m(28);
    }

    @Override // da1.s0
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.D();
    }

    public String toString() {
        return this.d.G();
    }

    public k0(k0 k0Var) {
        super(5);
        b1.m mVar = new b1.m(28);
        this.d = mVar;
        this.b = k0Var.b;
        this.c = k0Var.c;
        String G = k0Var.d.G();
        mVar.D();
        mVar.s = G;
    }
}
