package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zf0 {
    public String a;
    public m10.xz b;
    public yf0 c;
    public String d;
    public gv.y7 e;

    public zf0(String str, m10.xz xzVar, yf0 yf0Var, String str2, gv.y7 y7Var) {
        this.a = str;
        this.b = xzVar;
        this.c = yf0Var;
        this.d = str2;
        this.e = y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf0)) {
            return false;
        }
        zf0 zf0Var = (zf0) obj;
        return k71.k.b(this.a, zf0Var.a) && this.b == zf0Var.b && k71.k.b(this.c, zf0Var.c) && k71.k.b(this.d, zf0Var.d) && k71.k.b(this.e, zf0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        return "PullRequestReviewComment(__typename=" + this.a + ", subjectType=" + this.b + ", pullRequest=" + this.c + ", id=" + this.d + ", reviewThreadCommentFragment=" + this.e + ")";
    }
    public zf0(String p1, Object p2, Object p3, String p4, Object p5) {
    }
}
