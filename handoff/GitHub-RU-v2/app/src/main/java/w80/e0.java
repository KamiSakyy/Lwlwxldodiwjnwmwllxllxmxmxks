package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public final String a;
    public final f0 b;

    public e0(String str, f0 f0Var) {
        this.a = str;
        this.b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f0 f0Var = this.b;
        return hashCode + (f0Var == null ? 0 : f0Var.hashCode());
    }

    public final String toString() {
        return "OnCommit(oid=" + this.a + ", statusCheckRollup=" + this.b + ")";
    }
}
