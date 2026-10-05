package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qb0 implements aa.v0 {
    public final rb0 a;

    public qb0(rb0 rb0Var) {
        this.a = rb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb0) && k71.k.b(this.a, ((qb0) obj).a);
    }

    public final int hashCode() {
        rb0 rb0Var = this.a;
        if (rb0Var == null) {
            return 0;
        }
        return rb0Var.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ")";
    }
}
