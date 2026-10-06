package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t3 implements aaShadow.m0 {
    public r3 a;

    public t3(r3 r3Var) {
        this.a = r3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3) && k71.k.b(this.a, ((t3) obj).a);
    }

    public final int hashCode() {
        r3 r3Var = this.a;
        if (r3Var == null) {
            return 0;
        }
        return r3Var.hashCode();
    }

    public final String toString() {
        return "Data(blockUser=" + this.a + ")";
    }
}
