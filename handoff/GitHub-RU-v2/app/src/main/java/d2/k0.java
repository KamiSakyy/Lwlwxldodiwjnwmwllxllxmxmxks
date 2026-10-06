package d2;

/* loaded from: /home/user/work/p/classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public int f21354a;

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            return this.f21354a == ((k0) obj).f21354a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21354a);
    }

    public final String toString() {
        int i = this.f21354a;
        return i == 0 ? "NonZero" : i == 1 ? "EvenOdd" : "Unknown";
    }
}
