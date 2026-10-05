package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b70 {
    public final a70 a;

    public b70(a70 a70Var) {
        this.a = a70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b70) && k71.k.b(this.a, ((b70) obj).a);
    }

    public final int hashCode() {
        a70 a70Var = this.a;
        if (a70Var == null) {
            return 0;
        }
        return a70Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequest(pullRequest=" + this.a + ")";
    }
}
