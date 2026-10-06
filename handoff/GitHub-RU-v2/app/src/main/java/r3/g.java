package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f31119a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f31119a == ((g) obj).f31119a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31119a);
    }

    public final String toString() {
        int i = this.f31119a;
        return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
