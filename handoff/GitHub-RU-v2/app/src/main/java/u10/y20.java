package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y20 {
    public String a;
    public w20 b;

    public y20(String str, w20 w20Var) {
        this.a = str;
        this.b = w20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y20)) {
            return false;
        }
        y20 y20Var = (y20) obj;
        return k71.k.b(this.a, y20Var.a) && k71.k.b(this.b, y20Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        w20 w20Var = this.b;
        return hashCode + (w20Var != null ? w20Var.hashCode() : 0);
    }

    public final String toString() {
        return "UnmarkFileAsViewed(clientMutationId=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
