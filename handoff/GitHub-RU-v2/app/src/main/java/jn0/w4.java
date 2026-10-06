package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w4 {
    public final z4 a;

    public w4(z4 z4Var) {
        this.a = z4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4) && k71.k.b(this.a, ((w4) obj).a);
    }

    public final int hashCode() {
        z4 z4Var = this.a;
        if (z4Var == null) {
            return 0;
        }
        return z4Var.hashCode();
    }

    public final String toString() {
        return "CloseIssue(issue=" + this.a + ")";
    }
}
