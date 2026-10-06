package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d5 implements aaShadow.m0 {
    public final b5 a;

    public d5(b5 b5Var) {
        this.a = b5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5) && k71.k.b(this.a, ((d5) obj).a);
    }

    public final int hashCode() {
        b5 b5Var = this.a;
        if (b5Var == null) {
            return 0;
        }
        return b5Var.hashCode();
    }

    public final String toString() {
        return "Data(closePullRequest=" + this.a + ")";
    }
}
