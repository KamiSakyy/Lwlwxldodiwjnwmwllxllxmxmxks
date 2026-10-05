package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j20 {
    public final String a;
    public final i20 b;

    public j20(String str, i20 i20Var) {
        this.a = str;
        this.b = i20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j20)) {
            return false;
        }
        j20 j20Var = (j20) obj;
        return k71.k.b(this.a, j20Var.a) && k71.k.b(this.b, j20Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i20 i20Var = this.b;
        return hashCode + (i20Var == null ? 0 : i20Var.hashCode());
    }

    public final String toString() {
        return "UpdateSubscription(__typename=" + this.a + ", subscribable=" + this.b + ")";
    }
}
