package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j8 {
    public final m8 a;

    public j8(m8 m8Var) {
        this.a = m8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8) && k71.k.b(this.a, ((j8) obj).a);
    }

    public final int hashCode() {
        m8 m8Var = this.a;
        if (m8Var == null) {
            return 0;
        }
        return m8Var.hashCode();
    }

    public final String toString() {
        return "CreatePullRequest(pullRequest=" + this.a + ")";
    }
}
