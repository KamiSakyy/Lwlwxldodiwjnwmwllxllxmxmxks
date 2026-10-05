package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u90 {
    public final t90 a;

    public u90(t90 t90Var) {
        this.a = t90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u90) && k71.k.b(this.a, ((u90) obj).a);
    }

    public final int hashCode() {
        t90 t90Var = this.a;
        if (t90Var == null) {
            return 0;
        }
        return t90Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
