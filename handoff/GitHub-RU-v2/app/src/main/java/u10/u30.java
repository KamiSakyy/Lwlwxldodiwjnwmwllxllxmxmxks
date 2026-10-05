package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u30 {
    public final r30 a;

    public u30(r30 r30Var) {
        this.a = r30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u30) && k71.k.b(this.a, ((u30) obj).a);
    }

    public final int hashCode() {
        r30 r30Var = this.a;
        if (r30Var == null) {
            return 0;
        }
        return r30Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussionComment(comment=" + this.a + ")";
    }
}
