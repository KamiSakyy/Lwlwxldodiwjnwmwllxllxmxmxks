package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pj {
    public final qj a;

    public pj(qj qjVar) {
        this.a = qjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj) && k71.k.b(this.a, ((pj) obj).a);
    }

    public final int hashCode() {
        qj qjVar = this.a;
        if (qjVar == null) {
            return 0;
        }
        return qjVar.hashCode();
    }

    public final String toString() {
        return "MarkPullRequestReadyForReview(pullRequest=" + this.a + ")";
    }
}
