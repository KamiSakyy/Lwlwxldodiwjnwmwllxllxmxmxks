package a0;

import androidx.compose.runtime.i3;

/* loaded from: /home/user/work/p/classes.dex */
public final class p implements i3 {

    /* renamed from: r, reason: collision with root package name */
    public final h2 f188r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.compose.runtime.p1 f189s;

    /* renamed from: t, reason: collision with root package name */
    public u f190t;

    /* renamed from: u, reason: collision with root package name */
    public long f191u;

    /* renamed from: v, reason: collision with root package name */
    public long f192v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f193w;

    public /* synthetic */ p(h2 h2Var, Object obj, u uVar, int i) {
        this(h2Var, obj, (i & 4) != 0 ? null : uVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object a() {
        return this.f188r.f102b.k(this.f190t);
    }

    @Override // androidx.compose.runtime.i3
    public final Object getValue() {
        return this.f189s.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f189s.getValue() + ", velocity=" + a() + ", isRunning=" + this.f193w + ", lastFrameTimeNanos=" + this.f191u + ", finishedTimeNanos=" + this.f192v + ')';
    }

    public p(h2 h2Var, Object obj, u uVar, long j10, long j11, boolean z10) {
        u uVar2;
        this.f188r = h2Var;
        this.f189s = androidx.compose.runtime.t.B(obj);
        if (uVar != null) {
            uVar2 = f.j(uVar);
        } else {
            uVar2 = (u) h2Var.f101a.k(obj);
            uVar2.d();
        }
        this.f190t = uVar2;
        this.f191u = j10;
        this.f192v = j11;
        this.f193w = z10;
    }
}
