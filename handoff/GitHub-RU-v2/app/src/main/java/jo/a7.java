package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a7 {
    public c7 a;

    public a7(c7 c7Var) {
        this.a = c7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7) && k71.k.b(this.a, ((a7) obj).a);
    }

    public final int hashCode() {
        c7 c7Var = this.a;
        if (c7Var == null) {
            return 0;
        }
        return c7Var.hashCode();
    }

    public final String toString() {
        return "Diff(patch=" + this.a + ")";
    }
}
