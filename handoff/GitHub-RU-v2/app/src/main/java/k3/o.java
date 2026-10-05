package k3;

/* loaded from: /home/user/work/p/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f27687a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f27687a == ((o) obj).f27687a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27687a);
    }

    public final String toString() {
        int i = this.f27687a;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
