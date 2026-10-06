package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lm {
    public mm a;

    public lm(mm mmVar) {
        this.a = mmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm) && k71.k.b(this.a, ((lm) obj).a);
    }

    public final int hashCode() {
        mm mmVar = this.a;
        if (mmVar == null) {
            return 0;
        }
        return mmVar.hashCode();
    }

    public final String toString() {
        return "MarkPullRequestReadyForReview(pullRequest=" + this.a + ")";
    }
}
