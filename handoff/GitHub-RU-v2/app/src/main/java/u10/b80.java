package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b80 {
    public final a80 a;

    public b80(a80 a80Var) {
        this.a = a80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b80) && k71.k.b(this.a, ((b80) obj).a);
    }

    public final int hashCode() {
        a80 a80Var = this.a;
        if (a80Var == null) {
            return 0;
        }
        return a80Var.hashCode();
    }

    public final String toString() {
        return "UpdateSubscription(subscribable=" + this.a + ")";
    }
}
