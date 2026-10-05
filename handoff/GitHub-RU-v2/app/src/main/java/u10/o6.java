package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o6 {
    public final r6 a;

    public o6(r6 r6Var) {
        this.a = r6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6) && k71.k.b(this.a, ((o6) obj).a);
    }

    public final int hashCode() {
        r6 r6Var = this.a;
        if (r6Var == null) {
            return 0;
        }
        return r6Var.hashCode();
    }

    public final String toString() {
        return "CreatePullRequest(pullRequest=" + this.a + ")";
    }
}
