package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hz {
    public String a;
    public cz b;
    public bz c;

    public hz(String str, cz czVar, bz bzVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = czVar;
        this.c = bzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz)) {
            return false;
        }
        hz hzVar = (hz) obj;
        return k71.k.b(this.a, hzVar.a) && k71.k.b(this.b, hzVar.b) && k71.k.b(this.c, hzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cz czVar = this.b;
        int hashCode2 = (hashCode + (czVar == null ? 0 : czVar.hashCode())) * 31;
        bz bzVar = this.c;
        return hashCode2 + (bzVar != null ? bzVar.hashCode() : 0);
    }

    public final String toString() {
        return "RepositoryOwner(__typename=" + this.a + ", onUser=" + this.b + ", onOrganization=" + this.c + ")";
    }
}
