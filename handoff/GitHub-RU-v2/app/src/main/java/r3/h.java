package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f31120a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f31120a == ((h) obj).f31120a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31120a);
    }

    public final String toString() {
        int i = this.f31120a;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
