package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yb {
    public String a;
    public xb b;
    public String c;
    public wi0.c d;

    public yb(String str, xb xbVar, String str2, wi0.c cVar) {
        this.a = str;
        this.b = xbVar;
        this.c = str2;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb)) {
            return false;
        }
        yb ybVar = (yb) obj;
        return k71.k.b(this.a, ybVar.a) && k71.k.b(this.b, ybVar.b) && k71.k.b(this.c, ybVar.c) && k71.k.b(this.d, ybVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "PullRequestReview(__typename=" + this.a + ", pullRequest=" + this.b + ", id=" + this.c + ", pullRequestReviewFields=" + this.d + ")";
    }
}
