package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h7 implements aaShadow.m0 {
    public final g7 a;

    public h7(g7 g7Var) {
        this.a = g7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7) && k71.k.b(this.a, ((h7) obj).a);
    }

    public final int hashCode() {
        g7 g7Var = this.a;
        if (g7Var == null) {
            return 0;
        }
        return g7Var.hashCode();
    }

    public final String toString() {
        return "Data(createIssue=" + this.a + ")";
    }
}
