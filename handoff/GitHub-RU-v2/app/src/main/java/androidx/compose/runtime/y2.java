package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class y2 extends v1.b0 {

    /* renamed from: c, reason: collision with root package name */
    public long f1903c;

    public y2(long j10, long j11) {
        super(j10);
        this.f1903c = j11;
    }

    @Override // v1.b0
    public final void a(v1.b0 b0Var) {
        k71.k.e(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f1903c = ((y2) b0Var).f1903c;
    }

    @Override // v1.b0
    public final v1.b0 b(long j10) {
        return new y2(j10, this.f1903c);
    }
}
