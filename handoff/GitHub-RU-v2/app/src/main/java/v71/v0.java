package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class v0 extends v {
    public static final /* synthetic */ int w = 0;
    public long t;
    public boolean u;
    public x61.k v;

    @Override // v71.v
    public final v M0(int i) {
        a81.bShadow.a(i);
        return this;
    }

    public final void N0(boolean z) {
        long j = this.t - (z ? 4294967296L : 1L);
        this.t = j;
        if (j <= 0 && this.u) {
            shutdown();
        }
    }

    public final void O0(j0 j0Var) {
        x61.k kVar = this.v;
        if (kVar == null) {
            kVar = new x61.k();
            this.v = kVar;
        }
        kVar.addLast(j0Var);
    }

    public abstract Thread P0();

    public final void Q0(boolean z) {
        this.t = (z ? 4294967296L : 1L) + this.t;
        if (z) {
            return;
        }
        this.u = true;
    }

    public abstract long R0();

    public final boolean S0() {
        j0 j0Var;
        x61.k kVar = this.v;
        if (kVar == null || (j0Var = (j0) kVar.n()) == null) {
            return false;
        }
        j0Var.run();
        return true;
    }

    public void T0(long j, s0 s0Var) {
        c0.A.Y0(j, s0Var);
    }

    public abstract void shutdown();
}
