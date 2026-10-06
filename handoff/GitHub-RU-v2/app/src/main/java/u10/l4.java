package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l4 {
    public o4 a;

    public l4(o4 o4Var) {
        this.a = o4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4) && k71.k.b(this.a, ((l4) obj).a);
    }

    public final int hashCode() {
        o4 o4Var = this.a;
        if (o4Var == null) {
            return 0;
        }
        return o4Var.hashCode();
    }

    public final String toString() {
        return "CloneTemplateRepository(repository=" + this.a + ")";
    }
}
