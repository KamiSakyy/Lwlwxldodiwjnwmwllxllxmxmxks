package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e8 implements aaShadow.m0 {
    public final d8 a;

    public e8(d8 d8Var) {
        this.a = d8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8) && k71.k.b(this.a, ((e8) obj).a);
    }

    public final int hashCode() {
        d8 d8Var = this.a;
        if (d8Var == null) {
            return 0;
        }
        return d8Var.hashCode();
    }

    public final String toString() {
        return "Data(createIssue=" + this.a + ")";
    }
}
