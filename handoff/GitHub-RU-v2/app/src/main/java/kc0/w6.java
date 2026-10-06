package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w6 {
    public z6 a;

    public w6(z6 z6Var) {
        this.a = z6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6) && k71.k.b(this.a, ((w6) obj).a);
    }

    public final int hashCode() {
        z6 z6Var = this.a;
        if (z6Var == null) {
            return 0;
        }
        return z6Var.hashCode();
    }

    public final String toString() {
        return "CreatePullRequest(pullRequest=" + this.a + ")";
    }
}
