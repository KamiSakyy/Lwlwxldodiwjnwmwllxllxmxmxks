package d2;

/* loaded from: /home/user/work/p/classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21326a;

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.f21326a == ((c0) obj).f21326a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21326a);
    }

    public final String toString() {
        int i = this.f21326a;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : "Unknown";
    }
}
