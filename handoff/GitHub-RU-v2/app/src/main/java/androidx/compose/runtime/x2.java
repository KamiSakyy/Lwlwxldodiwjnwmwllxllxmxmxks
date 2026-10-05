package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class x2 extends v1.b0 {

    /* renamed from: c, reason: collision with root package name */
    public int f1899c;

    public x2(int i, long j10) {
        super(j10);
        this.f1899c = i;
    }

    @Override // v1.b0
    public final void a(v1.b0 b0Var) {
        k71.k.e(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f1899c = ((x2) b0Var).f1899c;
    }

    @Override // v1.b0
    public final v1.b0 b(long j10) {
        return new x2(this.f1899c, j10);
    }
}
