package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 implements aaShadow.m0 {
    public w1 a;

    public y1(w1 w1Var) {
        this.a = w1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1) && k71.k.b(this.a, ((y1) obj).a);
    }

    public final int hashCode() {
        w1 w1Var = this.a;
        if (w1Var == null) {
            return 0;
        }
        return w1Var.hashCode();
    }

    public final String toString() {
        return "Data(addUpvote=" + this.a + ")";
    }
}
