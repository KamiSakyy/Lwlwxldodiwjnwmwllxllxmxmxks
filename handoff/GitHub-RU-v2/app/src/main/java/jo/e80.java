package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e80 {
    public final String a;
    public final d80 b;
    public final String c;
    public final lv.c d;

    public e80(String str, d80 d80Var, String str2, lv.c cVar) {
        this.a = str;
        this.b = d80Var;
        this.c = str2;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e80)) {
            return false;
        }
        e80 e80Var = (e80) obj;
        return k71.k.b(this.a, e80Var.a) && k71.k.b(this.b, e80Var.b) && k71.k.b(this.c, e80Var.c) && k71.k.b(this.d, e80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "PullRequestReview(__typename=" + this.a + ", pullRequest=" + this.b + ", id=" + this.c + ", pullRequestReviewFields=" + this.d + ")";
    }
}
