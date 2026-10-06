package l3;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f27949a;

    public static String a(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f27949a == ((i) obj).f27949a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27949a);
    }

    public final String toString() {
        return a(this.f27949a);
    }
}
