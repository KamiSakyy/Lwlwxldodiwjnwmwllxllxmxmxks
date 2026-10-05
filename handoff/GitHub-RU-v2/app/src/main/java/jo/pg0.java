package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pg0 {
    public final og0 a;

    public pg0(og0 og0Var) {
        this.a = og0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg0) && k71.k.b(this.a, ((pg0) obj).a);
    }

    public final int hashCode() {
        og0 og0Var = this.a;
        if (og0Var == null) {
            return 0;
        }
        return og0Var.hashCode();
    }

    public final String toString() {
        return "UpdateSubscription(subscribable=" + this.a + ")";
    }
}
