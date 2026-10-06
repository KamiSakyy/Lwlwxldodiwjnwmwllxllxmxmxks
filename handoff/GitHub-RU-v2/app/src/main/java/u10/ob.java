package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ob {
    public qb a;

    public ob(qb qbVar) {
        this.a = qbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob) && k71.k.b(this.a, ((ob) obj).a);
    }

    public final int hashCode() {
        qb qbVar = this.a;
        if (qbVar == null) {
            return 0;
        }
        return qbVar.hashCode();
    }

    public final String toString() {
        return "DismissPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}
