package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o9 implements aaShadow.m0 {
    public p9 a;

    public o9(p9 p9Var) {
        this.a = p9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9) && k71.k.b(this.a, ((o9) obj).a);
    }

    public final int hashCode() {
        p9 p9Var = this.a;
        if (p9Var == null) {
            return 0;
        }
        return p9Var.hashCode();
    }

    public final String toString() {
        return "Data(disablePullRequestAutoMerge=" + this.a + ")";
    }
}
