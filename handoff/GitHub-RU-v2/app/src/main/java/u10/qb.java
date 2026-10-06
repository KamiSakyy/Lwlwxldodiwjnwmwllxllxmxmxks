package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qb {
    public final String a;
    public final pb b;
    public final String c;
    public final e80.c d;

    public qb(String str, pb pbVar, String str2, e80.c cVar) {
        this.a = str;
        this.b = pbVar;
        this.c = str2;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        return k71.k.b(this.a, qbVar.a) && k71.k.b(this.b, qbVar.b) && k71.k.b(this.c, qbVar.c) && k71.k.b(this.d, qbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "PullRequestReview(__typename=" + this.a + ", pullRequest=" + this.b + ", id=" + this.c + ", pullRequestReviewFields=" + this.d + ")";
    }
}
