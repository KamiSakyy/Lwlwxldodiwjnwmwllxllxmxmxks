package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xa0 implements aaShadow.m0 {
    public ab0 a;

    public xa0(ab0 ab0Var) {
        this.a = ab0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa0) && k71.k.b(this.a, ((xa0) obj).a);
    }

    public final int hashCode() {
        ab0 ab0Var = this.a;
        if (ab0Var == null) {
            return 0;
        }
        return ab0Var.hashCode();
    }

    public final String toString() {
        return "Data(unmarkDiscussionCommentAsAnswer=" + this.a + ")";
    }
}
