package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r20 {
    public p20 a;

    public r20(p20 p20Var) {
        this.a = p20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r20) && k71.k.b(this.a, ((r20) obj).a);
    }

    public final int hashCode() {
        p20 p20Var = this.a;
        if (p20Var == null) {
            return 0;
        }
        return p20Var.hashCode();
    }

    public final String toString() {
        return "UnmarkDiscussionCommentAsAnswer(discussion=" + this.a + ")";
    }
}
