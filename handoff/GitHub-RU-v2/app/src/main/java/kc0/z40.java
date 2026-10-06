package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z40 implements aaShadow.m0 {
    public final b50 a;

    public z40(b50 b50Var) {
        this.a = b50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z40) && k71.k.b(this.a, ((z40) obj).a);
    }

    public final int hashCode() {
        b50 b50Var = this.a;
        if (b50Var == null) {
            return 0;
        }
        return b50Var.hashCode();
    }

    public final String toString() {
        return "Data(unminimizeComment=" + this.a + ")";
    }
}
