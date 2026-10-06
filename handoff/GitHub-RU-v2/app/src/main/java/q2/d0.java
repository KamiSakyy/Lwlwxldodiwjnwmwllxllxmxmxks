package q2;

/* loaded from: /home/user/work/p/classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f30837a;

    public static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.f30837a == ((d0) obj).f30837a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30837a);
    }

    public final String toString() {
        return a(this.f30837a);
    }
}
