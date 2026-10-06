package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w40 {
    public final String a;
    public final u40 b;

    public w40(String str, u40 u40Var) {
        this.a = str;
        this.b = u40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w40)) {
            return false;
        }
        w40 w40Var = (w40) obj;
        return k71.k.b(this.a, w40Var.a) && k71.k.b(this.b, w40Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        u40 u40Var = this.b;
        return hashCode + (u40Var != null ? u40Var.hashCode() : 0);
    }

    public final String toString() {
        return "UnmarkFileAsViewed(clientMutationId=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
