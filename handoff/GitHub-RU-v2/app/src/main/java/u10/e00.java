package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e00 {
    public String a;
    public d00 b;
    public String c;
    public e80.c d;

    public e00(String str, d00 d00Var, String str2, e80.c cVar) {
        this.a = str;
        this.b = d00Var;
        this.c = str2;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00)) {
            return false;
        }
        e00 e00Var = (e00) obj;
        return k71.k.b(this.a, e00Var.a) && k71.k.b(this.b, e00Var.b) && k71.k.b(this.c, e00Var.c) && k71.k.b(this.d, e00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "PullRequestReview(__typename=" + this.a + ", pullRequest=" + this.b + ", id=" + this.c + ", pullRequestReviewFields=" + this.d + ")";
    }
    public e00(String p1, Object p2, String p3, Object p4) {
    }
}
