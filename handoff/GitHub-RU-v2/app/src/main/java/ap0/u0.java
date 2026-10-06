package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 {
    public final String a;
    public final y2 b;
    public final u2 c;

    public u0(String str, y2 y2Var, u2 u2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = y2Var;
        this.c = u2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return k71.k.b(this.a, u0Var.a) && k71.k.b(this.b, u0Var.b) && k71.k.b(this.c, u0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y2 y2Var = this.b;
        int hashCode2 = (hashCode + (y2Var == null ? 0 : y2Var.hashCode())) * 31;
        u2 u2Var = this.c;
        return hashCode2 + (u2Var != null ? u2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Followee(__typename=" + this.a + ", recommendedUserFeedFragment=" + this.b + ", recommendedOrganisationFeedFragment=" + this.c + ")";
    }
}
