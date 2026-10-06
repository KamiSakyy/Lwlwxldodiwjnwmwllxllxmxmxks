package am0;

/* loaded from: /home/user/work/p/classes4.dex */
public class e {
    public String a;
    public w b;
    public q c;
    public z d;
    public xShadow e;
    public n f;

    public e(String str, w wVar, q qVar, z zVar, xShadow xVar, n nVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = wVar;
        this.c = qVar;
        this.d = zVar;
        this.e = xVar;
        this.f = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && k71.k.b(this.d, eVar.d) && k71.k.b(this.e, eVar.e) && k71.k.b(this.f, eVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w wVar = this.b;
        int hashCode2 = (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        q qVar = this.c;
        int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        z zVar = this.d;
        int hashCode4 = (hashCode3 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        xShadow xVar = this.e;
        int hashCode5 = (hashCode4 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        n nVar = this.f;
        return hashCode5 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "List(__typename=" + this.a + ", onSubscribable=" + this.b + ", onRepository=" + this.c + ", onUser=" + this.d + ", onTeam=" + this.e + ", onOrganization=" + this.f + ")";
    }
}
