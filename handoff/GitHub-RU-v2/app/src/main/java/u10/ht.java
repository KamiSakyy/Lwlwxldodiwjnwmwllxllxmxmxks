package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ht {
    public final String a;
    public final ct b;
    public final bt c;

    public ht(String str, ct ctVar, bt btVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = ctVar;
        this.c = btVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        return k71.k.b(this.a, htVar.a) && k71.k.b(this.b, htVar.b) && k71.k.b(this.c, htVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ct ctVar = this.b;
        int hashCode2 = (hashCode + (ctVar == null ? 0 : ctVar.hashCode())) * 31;
        bt btVar = this.c;
        return hashCode2 + (btVar != null ? btVar.hashCode() : 0);
    }

    public final String toString() {
        return "RepositoryOwner(__typename=" + this.a + ", onUser=" + this.b + ", onOrganization=" + this.c + ")";
    }
}
