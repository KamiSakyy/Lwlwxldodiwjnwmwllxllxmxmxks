package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tb0 {
    public String a;
    public sb0 b;

    public tb0(String str, sb0 sb0Var) {
        this.a = str;
        this.b = sb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb0)) {
            return false;
        }
        tb0 tb0Var = (tb0) obj;
        return k71.k.b(this.a, tb0Var.a) && k71.k.b(this.b, tb0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sb0 sb0Var = this.b;
        return hashCode + (sb0Var == null ? 0 : sb0Var.hashCode());
    }

    public final String toString() {
        return "UpdateSubscription(__typename=" + this.a + ", subscribable=" + this.b + ")";
    }
}
