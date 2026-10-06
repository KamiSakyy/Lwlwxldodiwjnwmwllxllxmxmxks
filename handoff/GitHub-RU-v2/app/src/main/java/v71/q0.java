package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class q0 extends s0 {
    public l t;
    public final /* synthetic */ u0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(u0 u0Var, long j, l lVar) {
        super(j);
        this.u = u0Var;
        this.t = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.F(this.u);
    }

    @Override // v71.s0
    public final String toString() {
        return super.toString() + this.t;
    }
}
