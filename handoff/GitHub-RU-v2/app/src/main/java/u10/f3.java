package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f3 implements aa.m0 {
    public final d3 a;

    public f3(d3 d3Var) {
        this.a = d3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3) && k71.k.b(this.a, ((f3) obj).a);
    }

    public final int hashCode() {
        d3 d3Var = this.a;
        if (d3Var == null) {
            return 0;
        }
        return d3Var.hashCode();
    }

    public final String toString() {
        return "Data(blockUser=" + this.a + ")";
    }
}
