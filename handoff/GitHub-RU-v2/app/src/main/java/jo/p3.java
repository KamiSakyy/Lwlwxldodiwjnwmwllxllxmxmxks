package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p3 implements aa.m0 {
    public final n3 a;

    public p3(n3 n3Var) {
        this.a = n3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3) && k71.k.b(this.a, ((p3) obj).a);
    }

    public final int hashCode() {
        n3 n3Var = this.a;
        if (n3Var == null) {
            return 0;
        }
        return n3Var.hashCode();
    }

    public final String toString() {
        return "Data(blockUserFromOrganization=" + this.a + ")";
    }
}
