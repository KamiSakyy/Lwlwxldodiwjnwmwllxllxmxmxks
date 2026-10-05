package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zc0 implements aa.m0 {
    public final bd0 a;

    public zc0(bd0 bd0Var) {
        this.a = bd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc0) && k71.k.b(this.a, ((zc0) obj).a);
    }

    public final int hashCode() {
        bd0 bd0Var = this.a;
        if (bd0Var == null) {
            return 0;
        }
        return bd0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
