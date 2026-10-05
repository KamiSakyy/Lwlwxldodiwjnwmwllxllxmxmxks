package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public final String a;
    public final r0 b;
    public final String c;
    public final ms.v d;

    public o0(String str, r0 r0Var, String str2, ms.v vVar) {
        this.a = str;
        this.b = r0Var;
        this.c = str2;
        this.d = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && k71.k.b(this.b, o0Var.b) && k71.k.b(this.c, o0Var.c) && k71.k.b(this.d, o0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r0 r0Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (r0Var == null ? 0 : r0Var.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        return "Comment(__typename=" + this.a + ", replyTo=" + this.b + ", id=" + this.c + ", discussionCommentReplyFragment=" + this.d + ")";
    }
}
