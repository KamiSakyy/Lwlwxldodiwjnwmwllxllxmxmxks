package l3;

/* loaded from: /home/user/work/p/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f27958a;

    public static String a(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f27958a == ((l) obj).f27958a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27958a);
    }

    public final String toString() {
        return a(this.f27958a);
    }
}
