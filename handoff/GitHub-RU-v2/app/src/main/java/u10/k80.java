package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k80 {
    public final hc0.wz a;
    public final boolean b;

    public k80(hc0.wz wzVar, boolean z) {
        this.a = wzVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        k80 k80Var = (k80) obj;
        return this.a == k80Var.a && this.b == k80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavLink(identifier=" + this.a + ", hidden=" + this.b + ")";
    }
}
