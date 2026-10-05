package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s50 {
    public final p50 a;

    public s50(p50 p50Var) {
        this.a = p50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s50) && k71.k.b(this.a, ((s50) obj).a);
    }

    public final int hashCode() {
        p50 p50Var = this.a;
        if (p50Var == null) {
            return 0;
        }
        return p50Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussionComment(comment=" + this.a + ")";
    }
}
