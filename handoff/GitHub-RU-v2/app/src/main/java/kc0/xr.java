package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xr {
    public String a;
    public bl0.a b;
    public oj0.q3 c;

    public xr(String str, bl0.a aVar, oj0.q3 q3Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr)) {
            return false;
        }
        xr xrVar = (xr) obj;
        return k71.k.b(this.a, xrVar.a) && k71.k.b(this.b, xrVar.b) && k71.k.b(this.c, xrVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bl0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        oj0.q3 q3Var = this.c;
        return hashCode2 + (q3Var != null ? q3Var.hashCode() : 0);
    }

    public final String toString() {
        return "Starrable(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", repositoryStarsFragment=" + this.c + ")";
    }
}
