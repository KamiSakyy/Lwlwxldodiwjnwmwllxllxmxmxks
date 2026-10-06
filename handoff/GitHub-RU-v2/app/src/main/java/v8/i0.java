package v8;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32791a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32792b;

    public i0(long j10, long j11) {
        this.f32791a = j10;
        this.f32792b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class.equals(obj.getClass())) {
            i0 i0Var = (i0) obj;
            if (i0Var.f32791a == this.f32791a && i0Var.f32792b == this.f32792b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32792b) + (Long.hashCode(this.f32791a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f32791a + ", flexIntervalMillis=" + this.f32792b + '}';
    }
}
