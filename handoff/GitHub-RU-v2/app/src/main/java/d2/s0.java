package d2;

/* loaded from: /home/user/work/p/classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21380a;

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return this.f21380a == ((s0) obj).f21380a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21380a);
    }

    public final String toString() {
        int i = this.f21380a;
        return i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
    }
}
