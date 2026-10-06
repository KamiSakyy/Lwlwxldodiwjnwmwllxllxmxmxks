package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z90 {
    public y90 a;

    public z90(y90 y90Var) {
        this.a = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z90) && k71.k.b(this.a, ((z90) obj).a);
    }

    public final int hashCode() {
        y90 y90Var = this.a;
        if (y90Var == null) {
            return 0;
        }
        return y90Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
