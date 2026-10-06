package l3;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f27957a;

    public static String a(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f27957a == ((k) obj).f27957a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27957a);
    }

    public final String toString() {
        return a(this.f27957a);
    }
}
