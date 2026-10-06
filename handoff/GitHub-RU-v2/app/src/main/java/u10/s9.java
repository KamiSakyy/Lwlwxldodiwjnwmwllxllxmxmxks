package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s9 implements aaShadow.v0 {
    public t9 a;

    public s9(t9 t9Var) {
        this.a = t9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9) && k71.k.b(this.a, ((s9) obj).a);
    }

    public final int hashCode() {
        t9 t9Var = this.a;
        if (t9Var == null) {
            return 0;
        }
        return t9Var.hashCode();
    }

    public final String toString() {
        return "Data(discussionCategory=" + this.a + ")";
    }
}
