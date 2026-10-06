package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k30 {
    public String a;
    public j30 b;

    public k30(String str, j30 j30Var) {
        this.a = str;
        this.b = j30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k30)) {
            return false;
        }
        k30 k30Var = (k30) obj;
        return k71.k.b(this.a, k30Var.a) && k71.k.b(this.b, k30Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j30 j30Var = this.b;
        return hashCode + (j30Var == null ? 0 : j30Var.hashCode());
    }

    public final String toString() {
        return "UpdateSubscription(__typename=" + this.a + ", subscribable=" + this.b + ")";
    }
}
