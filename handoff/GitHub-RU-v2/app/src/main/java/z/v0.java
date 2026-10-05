package z;

/* loaded from: /home/user/work/p/classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f34490a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34491b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34492c;

    public v0(float f6, float f10, long j10) {
        this.f34490a = f6;
        this.f34491b = f10;
        this.f34492c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Float.compare(this.f34490a, v0Var.f34490a) == 0 && Float.compare(this.f34491b, v0Var.f34491b) == 0 && this.f34492c == v0Var.f34492c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34492c) + x.i.b(Float.hashCode(this.f34490a) * 31, this.f34491b, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f34490a + ", distance=" + this.f34491b + ", duration=" + this.f34492c + ')';
    }
}
