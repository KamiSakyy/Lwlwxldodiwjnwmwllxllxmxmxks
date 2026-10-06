package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u5 {
    public n5 a;

    public u5(n5 n5Var) {
        this.a = n5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5) && k71.k.b(this.a, ((u5) obj).a);
    }

    public final int hashCode() {
        n5 n5Var = this.a;
        if (n5Var == null) {
            return 0;
        }
        return n5Var.hashCode();
    }

    public final String toString() {
        return "OnRepository(gitObject=" + this.a + ")";
    }
}
