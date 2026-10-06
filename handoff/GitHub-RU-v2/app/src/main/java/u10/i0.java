package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 {
    public j0 a;

    public i0(j0 j0Var) {
        this.a = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && k71.k.b(this.a, ((i0) obj).a);
    }

    public final int hashCode() {
        j0 j0Var = this.a;
        if (j0Var == null) {
            return 0;
        }
        return j0Var.hashCode();
    }

    public final String toString() {
        return "AddDiscussionComment(comment=" + this.a + ")";
    }
}
