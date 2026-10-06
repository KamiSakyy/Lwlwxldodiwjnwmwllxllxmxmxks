package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w6 implements aaShadow.m0 {
    public final v6 a;

    public w6(v6 v6Var) {
        this.a = v6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6) && k71.k.b(this.a, ((w6) obj).a);
    }

    public final int hashCode() {
        v6 v6Var = this.a;
        if (v6Var == null) {
            return 0;
        }
        return v6Var.hashCode();
    }

    public final String toString() {
        return "Data(createRef=" + this.a + ")";
    }
}
