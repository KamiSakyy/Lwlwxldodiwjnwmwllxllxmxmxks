package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eo {
    public final String a;
    public final ho b;
    public final vx.a c;

    public eo(String str, ho hoVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = hoVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo)) {
            return false;
        }
        eo eoVar = (eo) obj;
        return k71.k.b(this.a, eoVar.a) && k71.k.b(this.b, eoVar.b) && k71.k.b(this.c, eoVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ho hoVar = this.b;
        int hashCode2 = (hashCode + (hoVar == null ? 0 : hoVar.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssueOrPullRequest(__typename=");
        sb.append(this.a);
        sb.append(", onPullRequest=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
