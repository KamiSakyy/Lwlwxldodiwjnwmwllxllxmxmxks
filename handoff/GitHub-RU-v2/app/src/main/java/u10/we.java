package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class we {
    public final String a;
    public final df b;
    public final ja0.a c;

    public we(String str, df dfVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dfVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return k71.k.b(this.a, weVar.a) && k71.k.b(this.b, weVar.b) && k71.k.b(this.c, weVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        df dfVar = this.b;
        int hashCode2 = (hashCode + (dfVar == null ? 0 : dfVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(__typename=");
        sb.append(this.a);
        sb.append(", onPullRequest=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
