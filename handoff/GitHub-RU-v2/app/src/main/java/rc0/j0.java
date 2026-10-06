package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 implements aa.v0 {
    public final k0 a;

    public j0(k0 k0Var) {
        this.a = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && k71.k.b(this.a, ((j0) obj).a);
    }

    public final int hashCode() {
        k0 k0Var = this.a;
        if (k0Var == null) {
            return 0;
        }
        return k0Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
