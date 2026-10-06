package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qc {
    public sc a;

    public qc(sc scVar) {
        this.a = scVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc) && k71.k.b(this.a, ((qc) obj).a);
    }

    public final int hashCode() {
        sc scVar = this.a;
        if (scVar == null) {
            return 0;
        }
        return scVar.hashCode();
    }

    public final String toString() {
        return "DismissPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}
