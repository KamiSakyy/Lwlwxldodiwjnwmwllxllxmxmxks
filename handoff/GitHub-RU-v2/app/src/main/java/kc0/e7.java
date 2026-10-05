package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e7 implements aa.m0 {
    public final d7 a;

    public e7(d7 d7Var) {
        this.a = d7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7) && k71.k.b(this.a, ((e7) obj).a);
    }

    public final int hashCode() {
        d7 d7Var = this.a;
        if (d7Var == null) {
            return 0;
        }
        return d7Var.hashCode();
    }

    public final String toString() {
        return "Data(createRef=" + this.a + ")";
    }
}
