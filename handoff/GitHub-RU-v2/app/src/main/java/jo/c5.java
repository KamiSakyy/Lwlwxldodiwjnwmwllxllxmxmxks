package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c5 implements aa.m0 {
    public final a5 a;

    public c5(a5 a5Var) {
        this.a = a5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5) && k71.k.b(this.a, ((c5) obj).a);
    }

    public final int hashCode() {
        a5 a5Var = this.a;
        if (a5Var == null) {
            return 0;
        }
        return a5Var.hashCode();
    }

    public final String toString() {
        return "Data(cloneTemplateRepository=" + this.a + ")";
    }
}
