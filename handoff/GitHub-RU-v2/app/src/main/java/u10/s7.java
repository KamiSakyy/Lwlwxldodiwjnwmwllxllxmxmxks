package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s7 implements aaShadow.m0 {
    public t7 a;

    public s7(t7 t7Var) {
        this.a = t7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7) && k71.k.b(this.a, ((s7) obj).a);
    }

    public final int hashCode() {
        t7 t7Var = this.a;
        if (t7Var == null) {
            return 0;
        }
        return t7Var.a.hashCode();
    }

    public final String toString() {
        return "Data(deleteDiscussion=" + this.a + ")";
    }
}
