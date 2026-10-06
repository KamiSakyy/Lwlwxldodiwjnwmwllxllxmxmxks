package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hb0 {
    public final String a;
    public final fb0 b;

    public hb0(String str, fb0 fb0Var) {
        this.a = str;
        this.b = fb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        hb0 hb0Var = (hb0) obj;
        return k71.k.b(this.a, hb0Var.a) && k71.k.b(this.b, hb0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        fb0 fb0Var = this.b;
        return hashCode + (fb0Var != null ? fb0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UnmarkFileAsViewed(clientMutationId=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
