package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r7 implements aa.m0 {
    public final q7 a;

    public r7(q7 q7Var) {
        this.a = q7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7) && k71.k.b(this.a, ((r7) obj).a);
    }

    public final int hashCode() {
        q7 q7Var = this.a;
        if (q7Var == null) {
            return 0;
        }
        return q7Var.hashCode();
    }

    public final String toString() {
        return "Data(createDiscussion=" + this.a + ")";
    }
}
