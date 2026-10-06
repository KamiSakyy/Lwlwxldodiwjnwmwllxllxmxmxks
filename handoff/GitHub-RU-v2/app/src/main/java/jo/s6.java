package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s6 {
    public l6 a;

    public s6(l6 l6Var) {
        this.a = l6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6) && k71.k.b(this.a, ((s6) obj).a);
    }

    public final int hashCode() {
        l6 l6Var = this.a;
        if (l6Var == null) {
            return 0;
        }
        return l6Var.hashCode();
    }

    public final String toString() {
        return "OnRepository(gitObject=" + this.a + ")";
    }
}
