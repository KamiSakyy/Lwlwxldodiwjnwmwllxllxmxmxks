package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ld0 {
    public String a;
    public pz0.cu b;
    public kd0 c;
    public String d;
    public xt0.k7 e;

    public ld0(String str, pz0.cu cuVar, kd0 kd0Var, String str2, xt0.k7 k7Var) {
        this.a = str;
        this.b = cuVar;
        this.c = kd0Var;
        this.d = str2;
        this.e = k7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld0)) {
            return false;
        }
        ld0 ld0Var = (ld0) obj;
        return k71.k.b(this.a, ld0Var.a) && this.b == ld0Var.b && k71.k.b(this.c, ld0Var.c) && k71.k.b(this.d, ld0Var.d) && k71.k.b(this.e, ld0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        return "PullRequestReviewComment(__typename=" + this.a + ", subjectType=" + this.b + ", pullRequest=" + this.c + ", id=" + this.d + ", reviewThreadCommentFragment=" + this.e + ")";
    }
}
