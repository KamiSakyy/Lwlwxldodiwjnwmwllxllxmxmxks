package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aaShadow.m0 {
    public r1 a;

    public t1(r1 r1Var) {
        this.a = r1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && k71.k.b(this.a, ((t1) obj).a);
    }

    public final int hashCode() {
        r1 r1Var = this.a;
        if (r1Var == null) {
            return 0;
        }
        return r1Var.hashCode();
    }

    public final String toString() {
        return "Data(addStar=" + this.a + ")";
    }
}
