package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 {
    public final String a;
    public final j1 b;

    public i1(String str, j1 j1Var) {
        this.a = str;
        this.b = j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return k71.k.b(this.a, i1Var.a) && k71.k.b(this.b, i1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j1 j1Var = this.b;
        return hashCode + (j1Var == null ? 0 : j1Var.hashCode());
    }

    public final String toString() {
        return "OnCommit(oid=" + this.a + ", statusCheckRollup=" + this.b + ")";
    }
}
