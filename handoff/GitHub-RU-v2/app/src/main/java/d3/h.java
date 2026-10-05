package d3;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f21423a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f21423a == ((h) obj).f21423a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21423a);
    }

    public final String toString() {
        int i = this.f21423a;
        return i == 0 ? "Polite" : i == 1 ? "Assertive" : "Unknown";
    }
}
