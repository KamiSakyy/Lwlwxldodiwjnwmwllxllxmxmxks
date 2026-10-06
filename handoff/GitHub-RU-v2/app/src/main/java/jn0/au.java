package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class au {
    public final String a;
    public final kw0.a b;
    public final uu0.u4 c;

    public au(String str, kw0.a aVar, uu0.u4 u4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = u4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return k71.k.b(this.a, auVar.a) && k71.k.b(this.b, auVar.b) && k71.k.b(this.c, auVar.c);
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
