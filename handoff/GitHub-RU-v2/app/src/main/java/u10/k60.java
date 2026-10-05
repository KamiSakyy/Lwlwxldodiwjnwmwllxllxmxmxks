package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k60 {
    public final b60 a;
    public final j60 b;

    public k60(b60 b60Var, j60 j60Var) {
        this.a = b60Var;
        this.b = j60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k60)) {
            return false;
        }
        k60 k60Var = (k60) obj;
        return k71.k.b(this.a, k60Var.a) && k71.k.b(this.b, k60Var.b);
    }

    public final int hashCode() {
        b60 b60Var = this.a;
        int hashCode = (b60Var == null ? 0 : b60Var.hashCode()) * 31;
        j60 j60Var = this.b;
        return hashCode + (j60Var != null ? j60Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePullRequest(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }







}
