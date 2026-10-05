package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l9 implements aa.v0 {
    public final p9 a;

    public l9(p9 p9Var) {
        this.a = p9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9) && k71.k.b(this.a, ((l9) obj).a);
    }

    public final int hashCode() {
        p9 p9Var = this.a;
        if (p9Var == null) {
            return 0;
        }
        return p9Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
