package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wb {
    public yb a;

    public wb(yb ybVar) {
        this.a = ybVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb) && k71.k.b(this.a, ((wb) obj).a);
    }

    public final int hashCode() {
        yb ybVar = this.a;
        if (ybVar == null) {
            return 0;
        }
        return ybVar.hashCode();
    }

    public final String toString() {
        return "DismissPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}
