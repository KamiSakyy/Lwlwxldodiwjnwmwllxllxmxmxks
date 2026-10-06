package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z30 {
    public y30 a;

    public z30(y30 y30Var) {
        this.a = y30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z30) && k71.k.b(this.a, ((z30) obj).a);
    }

    public final int hashCode() {
        y30 y30Var = this.a;
        if (y30Var == null) {
            return 0;
        }
        return y30Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
