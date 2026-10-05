package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k6 implements aa.m0 {
    public final j6 a;

    public k6(j6 j6Var) {
        this.a = j6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6) && k71.k.b(this.a, ((k6) obj).a);
    }

    public final int hashCode() {
        j6 j6Var = this.a;
        if (j6Var == null) {
            return 0;
        }
        return j6Var.hashCode();
    }

    public final String toString() {
        return "Data(createIssue=" + this.a + ")";
    }
}
