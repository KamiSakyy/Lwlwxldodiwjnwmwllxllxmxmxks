package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n4 implements aaShadow.m0 {
    public l4 a;

    public n4(l4 l4Var) {
        this.a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4) && k71.k.b(this.a, ((n4) obj).a);
    }

    public final int hashCode() {
        l4 l4Var = this.a;
        if (l4Var == null) {
            return 0;
        }
        return l4Var.hashCode();
    }

    public final String toString() {
        return "Data(cloneTemplateRepository=" + this.a + ")";
    }
}
