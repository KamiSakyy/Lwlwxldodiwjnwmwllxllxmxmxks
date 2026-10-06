package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wb0 implements aaShadow.m0 {
    public yb0 a;

    public wb0(yb0 yb0Var) {
        this.a = yb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb0) && k71.k.b(this.a, ((wb0) obj).a);
    }

    public final int hashCode() {
        yb0 yb0Var = this.a;
        if (yb0Var == null) {
            return 0;
        }
        return yb0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
