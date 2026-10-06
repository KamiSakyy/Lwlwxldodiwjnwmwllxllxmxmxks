package ux0;

import ap0.e2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 {
    public String a;
    public y0 b;
    public e2 c;

    public a1(String str, y0 y0Var, e2 e2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = y0Var;
        this.c = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return k71.k.b(this.a, a1Var.a) && k71.k.b(this.b, a1Var.b) && k71.k.b(this.c, a1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y0 y0Var = this.b;
        int hashCode2 = (hashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        e2 e2Var = this.c;
        return hashCode2 + (e2Var != null ? e2Var.hashCode() : 0);
    }

    public final String toString() {
        return "RepositoryOwner(__typename=" + this.a + ", onProjectV2Owner=" + this.b + ", organizationNameAndAvatar=" + this.c + ")";
    }
}
