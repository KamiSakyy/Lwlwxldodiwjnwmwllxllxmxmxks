package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v6 {
    public final x6 a;

    public v6(x6 x6Var) {
        this.a = x6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6) && k71.k.b(this.a, ((v6) obj).a);
    }

    public final int hashCode() {
        x6 x6Var = this.a;
        if (x6Var == null) {
            return 0;
        }
        return x6Var.hashCode();
    }

    public final String toString() {
        return "CreateRef(ref=" + this.a + ")";
    }
}
