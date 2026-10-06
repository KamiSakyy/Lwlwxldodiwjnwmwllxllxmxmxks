package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a5 {
    public d5 a;

    public a5(d5 d5Var) {
        this.a = d5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5) && k71.k.b(this.a, ((a5) obj).a);
    }

    public final int hashCode() {
        d5 d5Var = this.a;
        if (d5Var == null) {
            return 0;
        }
        return d5Var.hashCode();
    }

    public final String toString() {
        return "CloneTemplateRepository(repository=" + this.a + ")";
    }
}
