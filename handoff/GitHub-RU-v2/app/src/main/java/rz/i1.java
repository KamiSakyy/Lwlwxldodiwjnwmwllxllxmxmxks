package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 implements aa.m0 {
    public j1 a;

    public i1(j1 j1Var) {
        this.a = j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && k71.k.b(this.a, ((i1) obj).a);
    }

    public final int hashCode() {
        j1 j1Var = this.a;
        if (j1Var == null) {
            return 0;
        }
        return j1Var.hashCode();
    }

    public final String toString() {
        return "Data(updateProjectV2LastViewed=" + this.a + ")";
    }
}
