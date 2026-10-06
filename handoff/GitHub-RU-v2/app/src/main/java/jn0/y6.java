package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y6 implements aaShadow.m0 {
    public final x6 a;

    public y6(x6 x6Var) {
        this.a = x6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6) && k71.k.b(this.a, ((y6) obj).a);
    }

    public final int hashCode() {
        x6 x6Var = this.a;
        if (x6Var == null) {
            return 0;
        }
        return x6Var.hashCode();
    }

    public final String toString() {
        return "Data(createCommitOnBranch=" + this.a + ")";
    }
}
