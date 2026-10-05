package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l70 {
    public final String a;
    public final hc0.bm b;
    public final k70 c;
    public final String d;
    public final z70.d7 e;

    public l70(String str, hc0.bm bmVar, k70 k70Var, String str2, z70.d7 d7Var) {
        this.a = str;
        this.b = bmVar;
        this.c = k70Var;
        this.d = str2;
        this.e = d7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l70)) {
            return false;
        }
        l70 l70Var = (l70) obj;
        return k71.k.b(this.a, l70Var.a) && this.b == l70Var.b && k71.k.b(this.c, l70Var.c) && k71.k.b(this.d, l70Var.d) && k71.k.b(this.e, l70Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        return "PullRequestReviewComment(__typename=" + this.a + ", subjectType=" + this.b + ", pullRequest=" + this.c + ", id=" + this.d + ", reviewThreadCommentFragment=" + this.e + ")";
    }
}
