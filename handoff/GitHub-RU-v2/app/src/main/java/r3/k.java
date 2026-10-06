package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f31128a;

    public static String a(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f31128a == ((k) obj).f31128a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31128a);
    }

    public final String toString() {
        return a(this.f31128a);
    }
    public k(int p1) {
    }
}
