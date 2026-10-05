package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b30 implements aa.m0 {
    public final d30 a;

    public b30(d30 d30Var) {
        this.a = d30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b30) && k71.k.b(this.a, ((b30) obj).a);
    }

    public final int hashCode() {
        d30 d30Var = this.a;
        if (d30Var == null) {
            return 0;
        }
        return d30Var.hashCode();
    }

    public final String toString() {
        return "Data(unminimizeComment=" + this.a + ")";
    }
}
