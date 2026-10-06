package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zj {
    public final String a;
    public final ak b;
    public final ja0.a c;

    public zj(String str, ak akVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = akVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj)) {
            return false;
        }
        zj zjVar = (zj) obj;
        return k71.k.b(this.a, zjVar.a) && k71.k.b(this.b, zjVar.b) && k71.k.b(this.c, zjVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ak akVar = this.b;
        int hashCode2 = (hashCode + (akVar == null ? 0 : akVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssueOrPullRequest(__typename=");
        sb.append(this.a);
        sb.append(", onPullRequest=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
