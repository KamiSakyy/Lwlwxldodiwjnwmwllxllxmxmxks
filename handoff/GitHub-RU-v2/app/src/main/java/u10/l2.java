package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 implements aaShadow.m0 {
    public final j2 a;

    public l2(j2 j2Var) {
        this.a = j2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && k71.k.b(this.a, ((l2) obj).a);
    }

    public final int hashCode() {
        j2 j2Var = this.a;
        if (j2Var == null) {
            return 0;
        }
        return j2Var.hashCode();
    }

    public final String toString() {
        return "Data(approveDeployments=" + this.a + ")";
    }
}
