package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b5 implements aaShadow.v0 {
    public final d5 a;

    public b5(d5 d5Var) {
        this.a = d5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5) && k71.k.b(this.a, ((b5) obj).a);
    }

    public final int hashCode() {
        d5 d5Var = this.a;
        if (d5Var == null) {
            return 0;
        }
        return d5Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
