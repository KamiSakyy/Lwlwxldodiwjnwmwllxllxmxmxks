package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l90 {
    public final String a;
    public final gn0.dn b;
    public final k90 c;
    public final String d;
    public final ri0.s7 e;

    public l90(String str, gn0.dn dnVar, k90 k90Var, String str2, ri0.s7 s7Var) {
        this.a = str;
        this.b = dnVar;
        this.c = k90Var;
        this.d = str2;
        this.e = s7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        return k71.k.b(this.a, l90Var.a) && this.b == l90Var.b && k71.k.b(this.c, l90Var.c) && k71.k.b(this.d, l90Var.d) && k71.k.b(this.e, l90Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        return "PullRequestReviewComment(__typename=" + this.a + ", subjectType=" + this.b + ", pullRequest=" + this.c + ", id=" + this.d + ", reviewThreadCommentFragment=" + this.e + ")";
    }
}
