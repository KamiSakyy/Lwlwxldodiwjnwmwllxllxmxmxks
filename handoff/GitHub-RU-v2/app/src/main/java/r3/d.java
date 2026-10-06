package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f31112a;

    public static String a(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f31112a == ((d) obj).f31112a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31112a);
    }

    public final String toString() {
        return a(this.f31112a);
    }
}
