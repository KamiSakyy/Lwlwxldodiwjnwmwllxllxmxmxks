package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l80 {
    public final String a;
    public final k80 b;

    public l80(String str, k80 k80Var) {
        this.a = str;
        this.b = k80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l80)) {
            return false;
        }
        l80 l80Var = (l80) obj;
        return k71.k.b(this.a, l80Var.a) && k71.k.b(this.b, l80Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k80 k80Var = this.b;
        return hashCode + (k80Var == null ? 0 : k80Var.hashCode());
    }

    public final String toString() {
        return "UpdateSubscription(__typename=" + this.a + ", subscribable=" + this.b + ")";
    }
}
