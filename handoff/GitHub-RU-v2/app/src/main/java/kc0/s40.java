package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s40 implements aaShadow.m0 {
    public final w40 a;

    public s40(w40 w40Var) {
        this.a = w40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s40) && k71.k.b(this.a, ((s40) obj).a);
    }

    public final int hashCode() {
        w40 w40Var = this.a;
        if (w40Var == null) {
            return 0;
        }
        return w40Var.hashCode();
    }

    public final String toString() {
        return "Data(unmarkFileAsViewed=" + this.a + ")";
    }
}
