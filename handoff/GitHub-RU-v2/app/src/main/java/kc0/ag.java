package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ag {
    public String a;
    public eg b;
    public bl0.a c;

    public ag(String str, eg egVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = egVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return k71.k.b(this.a, agVar.a) && k71.k.b(this.b, agVar.b) && k71.k.b(this.c, agVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eg egVar = this.b;
        int hashCode2 = (hashCode + (egVar == null ? 0 : egVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node4(__typename=");
        sb.append(this.a);
        sb.append(", onOrganization=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.q(sb, this.c, ")");
    }
}
