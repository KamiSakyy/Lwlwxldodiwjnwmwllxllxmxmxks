package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bd0 {
    public final ad0 a;

    public bd0(ad0 ad0Var) {
        this.a = ad0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd0) && k71.k.b(this.a, ((bd0) obj).a);
    }

    public final int hashCode() {
        ad0 ad0Var = this.a;
        if (ad0Var == null) {
            return 0;
        }
        return ad0Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequest(pullRequest=" + this.a + ")";
    }
}
