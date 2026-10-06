package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bl {
    public String a;
    public el b;
    public bl0.a c;

    public bl(String str, el elVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = elVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj;
        return k71.k.b(this.a, blVar.a) && k71.k.b(this.b, blVar.b) && k71.k.b(this.c, blVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        el elVar = this.b;
        int hashCode2 = (hashCode + (elVar == null ? 0 : elVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssueOrPullRequest(__typename=");
        sb.append(this.a);
        sb.append(", onPullRequest=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.q(sb, this.c, ")");
    }
}
