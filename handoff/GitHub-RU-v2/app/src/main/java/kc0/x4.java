package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x4 implements aaShadow.m0 {
    public v4 a;

    public x4(v4 v4Var) {
        this.a = v4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4) && k71.k.b(this.a, ((x4) obj).a);
    }

    public final int hashCode() {
        v4 v4Var = this.a;
        if (v4Var == null) {
            return 0;
        }
        return v4Var.hashCode();
    }

    public final String toString() {
        return "Data(closePullRequest=" + this.a + ")";
    }
}
