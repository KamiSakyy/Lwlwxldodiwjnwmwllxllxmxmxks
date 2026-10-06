package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 {
    public String a;
    public s1 b;
    public r1 c;
    public l0 d;
    public k0 e;

    public i0(String str, s1 s1Var, r1 r1Var, l0 l0Var, k0 k0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = s1Var;
        this.c = r1Var;
        this.d = l0Var;
        this.e = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b) && k71.k.b(this.c, i0Var.c) && k71.k.b(this.d, i0Var.d) && k71.k.b(this.e, i0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s1 s1Var = this.b;
        int hashCode2 = (hashCode + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        r1 r1Var = this.c;
        int hashCode3 = (hashCode2 + (r1Var == null ? 0 : r1Var.hashCode())) * 31;
        l0 l0Var = this.d;
        int hashCode4 = (hashCode3 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        k0 k0Var = this.e;
        return hashCode4 + (k0Var != null ? k0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node4(__typename=" + this.a + ", onUser=" + this.b + ", onTeam=" + this.c + ", onMannequin=" + this.d + ", onBot=" + this.e + ")";
    }
}
