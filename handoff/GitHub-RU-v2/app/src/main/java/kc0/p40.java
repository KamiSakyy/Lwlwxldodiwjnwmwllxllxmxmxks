package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p40 {
    public final n40 a;

    public p40(n40 n40Var) {
        this.a = n40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p40) && k71.k.b(this.a, ((p40) obj).a);
    }

    public final int hashCode() {
        n40 n40Var = this.a;
        if (n40Var == null) {
            return 0;
        }
        return n40Var.hashCode();
    }

    public final String toString() {
        return "UnmarkDiscussionCommentAsAnswer(discussion=" + this.a + ")";
    }
}
