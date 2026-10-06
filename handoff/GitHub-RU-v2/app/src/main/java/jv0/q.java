package jv0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q {
    public String a;
    public i b;
    public j c;
    public k d;
    public l e;
    public h f;
    public m g;
    public n h;

    public q(String str, i iVar, j jVar, k kVar, l lVar, h hVar, m mVar, n nVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = iVar;
        this.c = jVar;
        this.d = kVar;
        this.e = lVar;
        this.f = hVar;
        this.g = mVar;
        this.h = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c) && k71.k.b(this.d, qVar.d) && k71.k.b(this.e, qVar.e) && k71.k.b(this.f, qVar.f) && k71.k.b(this.g, qVar.g) && k71.k.b(this.h, qVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.c;
        int hashCode3 = (hashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.d;
        int hashCode4 = (hashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.e;
        int hashCode5 = (hashCode4 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        h hVar = this.f;
        int hashCode6 = (hashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        m mVar = this.g;
        int hashCode7 = (hashCode6 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        n nVar = this.h;
        return hashCode7 + (nVar != null ? nVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "QueryTerm(__typename=" + this.a + ", onSearchShortcutQueryLabelTerm=" + this.b + ", onSearchShortcutQueryLoginRefTerm=" + this.c + ", onSearchShortcutQueryMilestoneTerm=" + this.d + ", onSearchShortcutQueryRepoTerm=" + this.e + ", onSearchShortcutQueryCategoryTerm=" + this.f + ", onSearchShortcutQueryTerm=" + this.g + ", onSearchShortcutQueryText=" + this.h + ")";
    }
}
