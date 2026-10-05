package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class w2 extends v1.b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f1894c;

    public w2(float f6, long j10) {
        super(j10);
        this.f1894c = f6;
    }

    @Override // v1.b0
    public final void a(v1.b0 b0Var) {
        k71.k.e(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f1894c = ((w2) b0Var).f1894c;
    }

    @Override // v1.b0
    public final v1.b0 b(long j10) {
        return new w2(this.f1894c, j10);
    }
}
