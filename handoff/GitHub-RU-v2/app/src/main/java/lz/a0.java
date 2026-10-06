package lz;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0Shadow {
    public String a;
    public w b;
    public q c;
    public y d;
    public xShadow e;
    public m f;
    public vx.a g;

    public a0(String str, w wVar, q qVar, y yVar, xShadow xVar, m mVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = wVar;
        this.c = qVar;
        this.d = yVar;
        this.e = xVar;
        this.f = mVar;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0Shadow)) {
            return false;
        }
        a0Shadow a0Var = (a0Shadow) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b) && k71.k.b(this.c, a0Var.c) && k71.k.b(this.d, a0Var.d) && k71.k.b(this.e, a0Var.e) && k71.k.b(this.f, a0Var.f) && k71.k.b(this.g, a0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w wVar = this.b;
        int hashCode2 = (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        q qVar = this.c;
        int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        y yVar = this.d;
        int hashCode4 = (hashCode3 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        xShadow xVar = this.e;
        int hashCode5 = (hashCode4 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        m mVar = this.f;
        int hashCode6 = (hashCode5 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        vx.a aVar = this.g;
        return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionalList(__typename=");
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
        return f4.r(sb, this.g, ")");
    }
}
