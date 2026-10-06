package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q8 {
    public s8 a;

    public q8(s8 s8Var) {
        this.a = s8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8) && k71.k.b(this.a, ((q8) obj).a);
    }

    public final int hashCode() {
        s8 s8Var = this.a;
        if (s8Var == null) {
            return 0;
        }
        return s8Var.hashCode();
    }

    public final String toString() {
        return "CreateRef(ref=" + this.a + ")";
    }
}
