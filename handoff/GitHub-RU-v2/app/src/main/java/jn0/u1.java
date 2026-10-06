package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u1 {
    public final String a;
    public final kw0.a b;
    public final uu0.u4 c;

    public u1(String str, kw0.a aVar, uu0.u4 u4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = u4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.a, u1Var.a) && k71.k.b(this.b, u1Var.b) && k71.k.b(this.c, u1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kw0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        uu0.u4 u4Var = this.c;
        return hashCode2 + (u4Var != null ? u4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Starrable(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", repositoryStarsFragment=" + this.c + ")";
    }
}
