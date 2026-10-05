package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s4 implements aa.m0 {
    public final q4 a;

    public s4(q4 q4Var) {
        this.a = q4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4) && k71.k.b(this.a, ((s4) obj).a);
    }

    public final int hashCode() {
        q4 q4Var = this.a;
        if (q4Var == null) {
            return 0;
        }
        return q4Var.hashCode();
    }

    public final String toString() {
        return "Data(closeIssue=" + this.a + ")";
    }
}
