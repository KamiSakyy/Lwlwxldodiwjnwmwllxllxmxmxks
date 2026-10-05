package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y8 implements aa.m0 {
    public final z8 a;

    public y8(z8 z8Var) {
        this.a = z8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8) && k71.k.b(this.a, ((y8) obj).a);
    }

    public final int hashCode() {
        z8 z8Var = this.a;
        if (z8Var == null) {
            return 0;
        }
        return z8Var.a.hashCode();
    }

    public final String toString() {
        return "Data(deleteIssueComment=" + this.a + ")";
    }
}
