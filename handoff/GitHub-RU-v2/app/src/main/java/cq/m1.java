package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 {
    public final String a;
    public final u3 b;
    public final q3 c;

    public m1(String str, u3 u3Var, q3 q3Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = u3Var;
        this.c = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return k71.k.b(this.a, m1Var.a) && k71.k.b(this.b, m1Var.b) && k71.k.b(this.c, m1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u3 u3Var = this.b;
        int hashCode2 = (hashCode + (u3Var == null ? 0 : u3Var.hashCode())) * 31;
        q3 q3Var = this.c;
        return hashCode2 + (q3Var != null ? q3Var.hashCode() : 0);
    }

    public final String toString() {
        return "Followee(__typename=" + this.a + ", recommendedUserFeedFragment=" + this.b + ", recommendedOrganisationFeedFragment=" + this.c + ")";
    }
}
