package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class be0 {
    public final ae0 a;

    public be0(ae0 ae0Var) {
        this.a = ae0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be0) && k71.k.b(this.a, ((be0) obj).a);
    }

    public final int hashCode() {
        ae0 ae0Var = this.a;
        if (ae0Var == null) {
            return 0;
        }
        return ae0Var.hashCode();
    }

    public final String toString() {
        return "UpdateSubscription(subscribable=" + this.a + ")";
    }
}
