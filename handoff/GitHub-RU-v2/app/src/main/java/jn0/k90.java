package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k90 {
    public final j90 a;

    public k90(j90 j90Var) {
        this.a = j90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k90) && k71.k.b(this.a, ((k90) obj).a);
    }

    public final int hashCode() {
        j90 j90Var = this.a;
        if (j90Var == null) {
            return 0;
        }
        return j90Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
