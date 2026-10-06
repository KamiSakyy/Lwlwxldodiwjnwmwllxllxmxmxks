package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pd {
    public String a;
    public od b;
    public String c;
    public lv.c d;

    public pd(String str, od odVar, String str2, lv.c cVar) {
        this.a = str;
        this.b = odVar;
        this.c = str2;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd)) {
            return false;
        }
        pd pdVar = (pd) obj;
        return k71.k.b(this.a, pdVar.a) && k71.k.b(this.b, pdVar.b) && k71.k.b(this.c, pdVar.c) && k71.k.b(this.d, pdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "PullRequestReview(__typename=" + this.a + ", pullRequest=" + this.b + ", id=" + this.c + ", pullRequestReviewFields=" + this.d + ")";
    }
}
