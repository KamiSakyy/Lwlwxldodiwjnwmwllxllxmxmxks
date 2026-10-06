package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v4 {
    public final y4 a;

    public v4(y4 y4Var) {
        this.a = y4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4) && k71.k.b(this.a, ((v4) obj).a);
    }

    public final int hashCode() {
        y4 y4Var = this.a;
        if (y4Var == null) {
            return 0;
        }
        return y4Var.hashCode();
    }

    public final String toString() {
        return "ClosePullRequest(pullRequest=" + this.a + ")";
    }
}
