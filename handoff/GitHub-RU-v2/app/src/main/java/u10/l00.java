package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l00 {
    public String a;
    public k00 b;

    public l00(String str, k00 k00Var) {
        this.a = str;
        this.b = k00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l00)) {
            return false;
        }
        l00 l00Var = (l00) obj;
        return k71.k.b(this.a, l00Var.a) && k71.k.b(this.b, l00Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k00 k00Var = this.b;
        return hashCode + (k00Var == null ? 0 : k00Var.hashCode());
    }

    public final String toString() {
        return "UpdateSubscription(__typename=" + this.a + ", subscribable=" + this.b + ")";
    }
}
