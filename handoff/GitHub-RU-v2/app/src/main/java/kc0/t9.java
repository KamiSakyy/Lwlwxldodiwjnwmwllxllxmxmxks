package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t9 implements aaShadow.v0 {
    public x9 a;

    public t9(x9 x9Var) {
        this.a = x9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9) && k71.k.b(this.a, ((t9) obj).a);
    }

    public final int hashCode() {
        x9 x9Var = this.a;
        if (x9Var == null) {
            return 0;
        }
        return x9Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
