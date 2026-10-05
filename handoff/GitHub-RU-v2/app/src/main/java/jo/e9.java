package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e9 implements aa.m0 {
    public final d9 a;

    public e9(d9 d9Var) {
        this.a = d9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9) && k71.k.b(this.a, ((e9) obj).a);
    }

    public final int hashCode() {
        d9 d9Var = this.a;
        if (d9Var == null) {
            return 0;
        }
        return d9Var.hashCode();
    }

    public final String toString() {
        return "Data(createUserDisinterest=" + this.a + ")";
    }
}
