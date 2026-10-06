package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sc {
    public String a;
    public rc b;
    public String c;
    public cu0.c d;

    public sc(String str, rc rcVar, String str2, cu0.c cVar) {
        this.a = str;
        this.b = rcVar;
        this.c = str2;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc)) {
            return false;
        }
        sc scVar = (sc) obj;
        return k71.k.b(this.a, scVar.a) && k71.k.b(this.b, scVar.b) && k71.k.b(this.c, scVar.c) && k71.k.b(this.d, scVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "PullRequestReview(__typename=" + this.a + ", pullRequest=" + this.b + ", id=" + this.c + ", pullRequestReviewFields=" + this.d + ")";
    }
}
