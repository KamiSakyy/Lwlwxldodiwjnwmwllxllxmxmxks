package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r8 implements aaShadow.m0 {
    public final q8 a;

    public r8(q8 q8Var) {
        this.a = q8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8) && k71.k.b(this.a, ((r8) obj).a);
    }

    public final int hashCode() {
        q8 q8Var = this.a;
        if (q8Var == null) {
            return 0;
        }
        return q8Var.hashCode();
    }

    public final String toString() {
        return "Data(createRef=" + this.a + ")";
    }
}
