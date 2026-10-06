package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g1 extends l {
    public final j1 z;

    public g1(a71.c cVar, j1 j1Var) {
        super(1, cVar);
        this.z = j1Var;
    }

    @Override // v71.l
    public final String C() {
        return "AwaitContinuation";
    }

    @Override // v71.l
    public final Throwable r(j1 j1Var) {
        Throwable b;
        j1 j1Var2 = this.z;
        j1Var2.getClass();
        Object obj = j1.r.get(j1Var2);
        return (!(obj instanceof i1) || (b = ((i1) obj).b()) == null) ? obj instanceof t ? ((t) obj).a : j1Var.N() : b;
    }
}
