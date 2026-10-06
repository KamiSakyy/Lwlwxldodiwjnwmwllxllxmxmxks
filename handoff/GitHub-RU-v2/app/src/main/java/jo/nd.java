package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nd {
    public pd a;

    public nd(pd pdVar) {
        this.a = pdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd) && k71.k.b(this.a, ((nd) obj).a);
    }

    public final int hashCode() {
        pd pdVar = this.a;
        if (pdVar == null) {
            return 0;
        }
        return pdVar.hashCode();
    }

    public final String toString() {
        return "DismissPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}
