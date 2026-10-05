package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r0 extends s0 {
    public final Runnable t;

    public r0(Runnable runnable, long j) {
        super(j);
        this.t = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.run();
    }

    @Override // v71.s0
    public final String toString() {
        return super.toString() + this.t;
    }
}
