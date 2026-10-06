package m2;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f28912a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f28912a == ((a) obj).f28912a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28912a);
    }

    public final String toString() {
        int i = this.f28912a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
