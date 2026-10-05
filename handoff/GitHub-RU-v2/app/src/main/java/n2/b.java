package n2;

import q2.t;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f29399a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29400b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29401c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29402d;

    /* renamed from: e, reason: collision with root package name */
    public final float f29403e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29404f;

    /* renamed from: g, reason: collision with root package name */
    public final long f29405g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f29406h;
    public boolean i;

    public b(long j10, long j11, long j12, boolean z10, float f6, long j13, long j14, boolean z11) {
        this.f29399a = j10;
        this.f29400b = j11;
        this.f29401c = j12;
        this.f29402d = z10;
        this.f29403e = f6;
        this.f29404f = j13;
        this.f29405g = j14;
        this.f29406h = z11;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) t.j(this.f29399a)) + ", uptimeMillis=" + this.f29400b + ", position=" + ((Object) c2.b.h(this.f29401c)) + ", pressed=" + this.f29402d + ", pressure=" + this.f29403e + ", previousUptimeMillis=" + this.f29404f + ", previousPosition=" + ((Object) c2.b.h(this.f29405g)) + ", previousPressed=" + this.f29406h + ", isConsumed=" + this.i + ')';
    }
}
