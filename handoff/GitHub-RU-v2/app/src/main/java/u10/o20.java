package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o20 implements aaShadow.m0 {
    public r20 a;

    public o20(r20 r20Var) {
        this.a = r20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o20) && k71.k.b(this.a, ((o20) obj).a);
    }

    public final int hashCode() {
        r20 r20Var = this.a;
        if (r20Var == null) {
            return 0;
        }
        return r20Var.hashCode();
    }

    public final String toString() {
        return "Data(unmarkDiscussionCommentAsAnswer=" + this.a + ")";
    }
}
