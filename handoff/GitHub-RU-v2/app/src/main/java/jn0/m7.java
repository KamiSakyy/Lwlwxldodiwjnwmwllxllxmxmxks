package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m7 {
    public final p7 a;

    public m7(p7 p7Var) {
        this.a = p7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7) && k71.k.b(this.a, ((m7) obj).a);
    }

    public final int hashCode() {
        p7 p7Var = this.a;
        if (p7Var == null) {
            return 0;
        }
        return p7Var.hashCode();
    }

    public final String toString() {
        return "CreatePullRequest(pullRequest=" + this.a + ")";
    }
}
