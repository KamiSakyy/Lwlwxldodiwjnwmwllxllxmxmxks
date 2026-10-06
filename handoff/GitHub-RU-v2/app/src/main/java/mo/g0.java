package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public String a;
    public s b;
    public j c;

    public g0(String str, s sVar, j jVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = sVar;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b) && k71.k.b(this.c, g0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s sVar = this.b;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        j jVar = this.c;
        return hashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "Sponsorable(__typename=" + this.a + ", onUser=" + this.b + ", onOrganization=" + this.c + ")";
    }
}
