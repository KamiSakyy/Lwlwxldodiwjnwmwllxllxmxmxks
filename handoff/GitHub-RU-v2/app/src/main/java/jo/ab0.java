package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ab0 {
    public ya0 a;

    public ab0(ya0 ya0Var) {
        this.a = ya0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab0) && k71.k.b(this.a, ((ab0) obj).a);
    }

    public final int hashCode() {
        ya0 ya0Var = this.a;
        if (ya0Var == null) {
            return 0;
        }
        return ya0Var.hashCode();
    }

    public final String toString() {
        return "UnmarkDiscussionCommentAsAnswer(discussion=" + this.a + ")";
    }
}
