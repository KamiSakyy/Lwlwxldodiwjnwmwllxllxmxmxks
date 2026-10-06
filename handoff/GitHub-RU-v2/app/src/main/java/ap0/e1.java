package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 {
    public String a;
    public y2 b;
    public u2 c;

    public e1(String str, y2 y2Var, u2 u2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = y2Var;
        this.c = u2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c);
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
