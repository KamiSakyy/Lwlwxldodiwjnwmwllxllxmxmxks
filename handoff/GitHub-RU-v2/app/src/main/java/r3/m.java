package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f31133a;

    public static String a(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f31133a == ((m) obj).f31133a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31133a);
    }

    public final String toString() {
        return a(this.f31133a);
    }
}
