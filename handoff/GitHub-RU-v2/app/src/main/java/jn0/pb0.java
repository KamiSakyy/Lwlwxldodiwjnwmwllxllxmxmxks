package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pb0 {
    public final ob0 a;

    public pb0(ob0 ob0Var) {
        this.a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pb0) && k71.k.b(this.a, ((pb0) obj).a);
    }

    public final int hashCode() {
        ob0 ob0Var = this.a;
        if (ob0Var == null) {
            return 0;
        }
        return ob0Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequest(pullRequest=" + this.a + ")";
    }
}
