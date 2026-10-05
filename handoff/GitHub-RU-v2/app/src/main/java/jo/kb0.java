package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kb0 implements aa.m0 {
    public final mb0 a;

    public kb0(mb0 mb0Var) {
        this.a = mb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kb0) && k71.k.b(this.a, ((kb0) obj).a);
    }

    public final int hashCode() {
        mb0 mb0Var = this.a;
        if (mb0Var == null) {
            return 0;
        }
        return mb0Var.hashCode();
    }

    public final String toString() {
        return "Data(unminimizeComment=" + this.a + ")";
    }
}
