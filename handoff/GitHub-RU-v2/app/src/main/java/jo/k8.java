package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k8 implements aa.m0 {
    public final j8 a;

    public k8(j8 j8Var) {
        this.a = j8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8) && k71.k.b(this.a, ((k8) obj).a);
    }

    public final int hashCode() {
        j8 j8Var = this.a;
        if (j8Var == null) {
            return 0;
        }
        return j8Var.hashCode();
    }

    public final String toString() {
        return "Data(createPullRequest=" + this.a + ")";
    }
}
