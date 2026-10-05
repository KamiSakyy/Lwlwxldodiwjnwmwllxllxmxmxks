package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ba0 {
    public final aa0 a;

    public ba0(aa0 aa0Var) {
        this.a = aa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba0) && k71.k.b(this.a, ((ba0) obj).a);
    }

    public final int hashCode() {
        aa0 aa0Var = this.a;
        if (aa0Var == null) {
            return 0;
        }
        return aa0Var.hashCode();
    }

    public final String toString() {
        return "UpdateSubscription(subscribable=" + this.a + ")";
    }
}
