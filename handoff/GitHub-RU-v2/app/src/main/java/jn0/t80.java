package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t80 {
    public final String a;
    public final r80 b;

    public t80(String str, r80 r80Var) {
        this.a = str;
        this.b = r80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj;
        return k71.k.b(this.a, t80Var.a) && k71.k.b(this.b, t80Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        r80 r80Var = this.b;
        return hashCode + (r80Var != null ? r80Var.hashCode() : 0);
    }

    public final String toString() {
        return "UnmarkFileAsViewed(clientMutationId=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
