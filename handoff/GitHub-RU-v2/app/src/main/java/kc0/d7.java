package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d7 {
    public f7 a;

    public d7(f7 f7Var) {
        this.a = f7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7) && k71.k.b(this.a, ((d7) obj).a);
    }

    public final int hashCode() {
        f7 f7Var = this.a;
        if (f7Var == null) {
            return 0;
        }
        return f7Var.hashCode();
    }

    public final String toString() {
        return "CreateRef(ref=" + this.a + ")";
    }
}
