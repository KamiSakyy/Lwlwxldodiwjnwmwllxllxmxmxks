package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f31141a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f31141a == ((r) obj).f31141a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31141a);
    }

    public final String toString() {
        int i = this.f31141a;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
