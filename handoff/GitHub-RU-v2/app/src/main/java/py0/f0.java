package py0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 {
    public final e0 a;

    public f0(e0 e0Var) {
        this.a = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && k71.k.b(this.a, ((f0) obj).a);
    }

    public final int hashCode() {
        e0 e0Var = this.a;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.hashCode();
    }

    public final String toString() {
        return "UpdateRepository(repository=" + this.a + ")";
    }
}
