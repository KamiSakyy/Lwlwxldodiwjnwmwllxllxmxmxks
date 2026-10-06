package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u7 implements aaShadow.m0 {
    public final t7 a;

    public u7(t7 t7Var) {
        this.a = t7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7) && k71.k.b(this.a, ((u7) obj).a);
    }

    public final int hashCode() {
        t7 t7Var = this.a;
        if (t7Var == null) {
            return 0;
        }
        return t7Var.hashCode();
    }

    public final String toString() {
        return "Data(createRef=" + this.a + ")";
    }
}
