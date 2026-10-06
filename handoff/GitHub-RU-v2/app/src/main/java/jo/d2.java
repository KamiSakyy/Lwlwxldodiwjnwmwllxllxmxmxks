package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d2 implements aaShadow.m0 {
    public b2 a;

    public d2(b2 b2Var) {
        this.a = b2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && k71.k.b(this.a, ((d2) obj).a);
    }

    public final int hashCode() {
        b2 b2Var = this.a;
        if (b2Var == null) {
            return 0;
        }
        return b2Var.hashCode();
    }

    public final String toString() {
        return "Data(addSubIssue=" + this.a + ")";
    }
}
