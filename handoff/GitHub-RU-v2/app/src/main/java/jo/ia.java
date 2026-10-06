package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ia {
    public String a;
    public ka b;

    public ia(String str, ka kaVar) {
        this.a = str;
        this.b = kaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        return k71.k.b(this.a, iaVar.a) && k71.k.b(this.b, iaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ka kaVar = this.b;
        return hashCode + (kaVar == null ? 0 : kaVar.hashCode());
    }

    public final String toString() {
        return "DeletePullRequestReviewComment(__typename=" + this.a + ", pullRequestReview=" + this.b + ")";
    }
}
