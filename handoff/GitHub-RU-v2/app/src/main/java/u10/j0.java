package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 {
    public String a;
    public m0 b;
    public String c;
    public i50.u d;

    public j0(String str, m0 m0Var, String str2, i50.u uVar) {
        this.a = str;
        this.b = m0Var;
        this.c = str2;
        this.d = uVar;
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
