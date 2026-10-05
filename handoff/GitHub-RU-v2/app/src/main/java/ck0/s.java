package ck0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public final String a;
    public final i b;
    public final j c;
    public final k d;
    public final m e;
    public final h f;
    public final l g;
    public final n h;
    public final o i;

    public s(String str, i iVar, j jVar, k kVar, m mVar, h hVar, l lVar, n nVar, o oVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = iVar;
        this.c = jVar;
        this.d = kVar;
        this.e = mVar;
        this.f = hVar;
        this.g = lVar;
        this.h = nVar;
        this.i = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c) && k71.k.b(this.d, sVar.d) && k71.k.b(this.e, sVar.e) && k71.k.b(this.f, sVar.f) && k71.k.b(this.g, sVar.g) && k71.k.b(this.h, sVar.h) && k71.k.b(this.i, sVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.c;
        int hashCode3 = (hashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.d;
        int hashCode4 = (hashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        m mVar = this.e;
        int hashCode5 = (hashCode4 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        h hVar = this.f;
        int hashCode6 = (hashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        l lVar = this.g;
        int hashCode7 = (hashCode6 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n nVar = this.h;
        int hashCode8 = (hashCode7 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        o oVar = this.i;
        return hashCode8 + (oVar != null ? oVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "QueryTerm(__typename=" + this.a + ", onSearchShortcutQueryLabelTerm=" + this.b + ", onSearchShortcutQueryLoginRefTerm=" + this.c + ", onSearchShortcutQueryMilestoneTerm=" + this.d + ", onSearchShortcutQueryRepoTerm=" + this.e + ", onSearchShortcutQueryCategoryTerm=" + this.f + ", onSearchShortcutQueryProjectTerm=" + this.g + ", onSearchShortcutQueryTerm=" + this.h + ", onSearchShortcutQueryText=" + this.i + ")";
    }
}
