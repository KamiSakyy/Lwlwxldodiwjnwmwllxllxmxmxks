package b2;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f3325a;

    public static String a(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f3325a == ((f) obj).f3325a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3325a);
    }

    public final String toString() {
        return a(this.f3325a);
    }
    public static final Object J = null;
}
