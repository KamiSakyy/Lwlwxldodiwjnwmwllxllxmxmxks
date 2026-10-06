package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 {
    public final String a;
    public final m0 b;
    public final String c;
    public final yf0.v d;

    public j0(String str, m0 m0Var, String str2, yf0.v vVar) {
        this.a = str;
        this.b = m0Var;
        this.c = str2;
        this.d = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.a, j0Var.a) && k71.k.b(this.b, j0Var.b) && k71.k.b(this.c, j0Var.c) && k71.k.b(this.d, j0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m0 m0Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        return "Comment(__typename=" + this.a + ", replyTo=" + this.b + ", id=" + this.c + ", discussionCommentReplyFragment=" + this.d + ")";
    }
}
