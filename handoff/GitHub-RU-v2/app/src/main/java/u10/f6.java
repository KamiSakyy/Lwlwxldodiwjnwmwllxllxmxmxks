package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f6 implements aaShadow.m0 {
    public e6 a;

    public f6(e6 e6Var) {
        this.a = e6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6) && k71.k.b(this.a, ((f6) obj).a);
    }

    public final int hashCode() {
        e6 e6Var = this.a;
        if (e6Var == null) {
            return 0;
        }
        return e6Var.hashCode();
    }

    public final String toString() {
        return "Data(createDiscussion=" + this.a + ")";
    }
}
