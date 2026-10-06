package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public String a;
    public v b;
    public p c;
    public y d;
    public w e;
    public m f;

    public e(String str, v vVar, p pVar, y yVar, w wVar, m mVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = vVar;
        this.c = pVar;
        this.d = yVar;
        this.e = wVar;
        this.f = mVar;
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
        v vVar = this.b;
        int hashCode2 = (hashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        p pVar = this.c;
        int hashCode3 = (hashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        y yVar = this.d;
        int hashCode4 = (hashCode3 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        w wVar = this.e;
        int hashCode5 = (hashCode4 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        m mVar = this.f;
        return hashCode5 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "List(__typename=" + this.a + ", onSubscribable=" + this.b + ", onRepository=" + this.c + ", onUser=" + this.d + ", onTeam=" + this.e + ", onOrganization=" + this.f + ")";
    }
}
