package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oj implements aaShadow.m0 {
    public pj a;

    public oj(pj pjVar) {
        this.a = pjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj) && k71.k.b(this.a, ((oj) obj).a);
    }

    public final int hashCode() {
        pj pjVar = this.a;
        if (pjVar == null) {
            return 0;
        }
        return pjVar.hashCode();
    }

    public final String toString() {
        return "Data(markPullRequestReadyForReview=" + this.a + ")";
    }
}
