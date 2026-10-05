package d2;

/* loaded from: /home/user/work/p/classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21391a;

    public final boolean equals(Object obj) {
        if (obj instanceof t0) {
            return this.f21391a == ((t0) obj).f21391a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21391a);
    }

    public final String toString() {
        int i = this.f21391a;
        return i == 0 ? "Miter" : i == 1 ? "Round" : i == 2 ? "Bevel" : "Unknown";
    }
}
