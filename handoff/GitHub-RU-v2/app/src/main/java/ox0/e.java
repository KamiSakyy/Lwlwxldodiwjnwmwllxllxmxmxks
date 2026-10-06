package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public String a;
    public xShadow b;
    public r c;
    public a0Shadow d;
    public y e;
    public n f;
    public kw0.a g;

    public e(String str, xShadow xVar, r rVar, a0Shadow a0Var, y yVar, n nVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = xVar;
        this.c = rVar;
        this.d = a0Var;
        this.e = yVar;
        this.f = nVar;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && k71.k.b(this.d, eVar.d) && k71.k.b(this.e, eVar.e) && k71.k.b(this.f, eVar.f) && k71.k.b(this.g, eVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xShadow xVar = this.b;
        int hashCode2 = (hashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        r rVar = this.c;
        int hashCode3 = (hashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        a0Shadow a0Var = this.d;
        int hashCode4 = (hashCode3 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        y yVar = this.e;
        int hashCode5 = (hashCode4 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        n nVar = this.f;
        int hashCode6 = (hashCode5 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        kw0.a aVar = this.g;
        return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("List(__typename=");
        sb.append(this.a);
        sb.append(", onSubscribable=");
        sb.append(this.b);
        sb.append(", onRepository=");
        sb.append(this.c);
        sb.append(", onUser=");
        sb.append(this.d);
        sb.append(", onTeam=");
        sb.append(this.e);
        sb.append(", onOrganization=");
        sb.append(this.f);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.g, ")");
    }
}
