package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kd0 {
    public final fd0 a;
    public final id0 b;

    public kd0(fd0 fd0Var, id0 id0Var) {
        this.a = fd0Var;
        this.b = id0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd0)) {
            return false;
        }
        kd0 kd0Var = (kd0) obj;
        return k71.k.b(this.a, kd0Var.a) && k71.k.b(this.b, kd0Var.b);
    }

    public final int hashCode() {
        fd0 fd0Var = this.a;
        int hashCode = (fd0Var == null ? 0 : fd0Var.hashCode()) * 31;
        id0 id0Var = this.b;
        return hashCode + (id0Var != null ? id0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateIssue(actor=" + this.a + ", issue=" + this.b + ")";
    }
}
