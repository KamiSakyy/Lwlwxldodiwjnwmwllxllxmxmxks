package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gx {
    public String a;
    public bx b;
    public ax c;

    public gx(String str, bx bxVar, ax axVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = bxVar;
        this.c = axVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx)) {
            return false;
        }
        gx gxVar = (gx) obj;
        return k71.k.b(this.a, gxVar.a) && k71.k.b(this.b, gxVar.b) && k71.k.b(this.c, gxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bx bxVar = this.b;
        int hashCode2 = (hashCode + (bxVar == null ? 0 : bxVar.hashCode())) * 31;
        ax axVar = this.c;
        return hashCode2 + (axVar != null ? axVar.hashCode() : 0);
    }

    public final String toString() {
        return "RepositoryOwner(__typename=" + this.a + ", onUser=" + this.b + ", onOrganization=" + this.c + ")";
    }
}
