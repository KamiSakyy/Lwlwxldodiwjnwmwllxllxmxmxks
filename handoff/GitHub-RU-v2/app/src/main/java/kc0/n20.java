package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n20 implements aaShadow.v0 {
    public w20 a;

    public n20(w20 w20Var) {
        this.a = w20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n20) && k71.k.b(this.a, ((n20) obj).a);
    }

    public final int hashCode() {
        w20 w20Var = this.a;
        if (w20Var == null) {
            return 0;
        }
        return w20Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
