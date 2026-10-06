package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i50 {
    public String a;
    public h50 b;

    public i50(String str, h50 h50Var) {
        this.a = str;
        this.b = h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return k71.k.b(this.a, i50Var.a) && k71.k.b(this.b, i50Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h50 h50Var = this.b;
        return hashCode + (h50Var == null ? 0 : h50Var.hashCode());
    }

    public final String toString() {
        return "UpdateSubscription(__typename=" + this.a + ", subscribable=" + this.b + ")";
    }
}
