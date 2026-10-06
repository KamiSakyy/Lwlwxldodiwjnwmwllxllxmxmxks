package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q8 implements aaShadow.v0 {
    public final v8 a;

    public q8(v8 v8Var) {
        this.a = v8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8) && k71.k.b(this.a, ((q8) obj).a);
    }

    public final int hashCode() {
        v8 v8Var = this.a;
        if (v8Var == null) {
            return 0;
        }
        return v8Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
