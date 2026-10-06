package k3;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f27688a;

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f27688a == ((p) obj).f27688a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27688a);
    }

    public final String toString() {
        int i = this.f27688a;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
    public Object a = null;
}
