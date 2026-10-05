package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nd0 implements aa.m0 {
    public final pd0 a;

    public nd0(pd0 pd0Var) {
        this.a = pd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd0) && k71.k.b(this.a, ((nd0) obj).a);
    }

    public final int hashCode() {
        pd0 pd0Var = this.a;
        if (pd0Var == null) {
            return 0;
        }
        return pd0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssue=" + this.a + ")";
    }
}
