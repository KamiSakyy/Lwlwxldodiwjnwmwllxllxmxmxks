package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class li {
    public final String a;
    public final ti b;
    public final vx.a c;

    public li(String str, ti tiVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = tiVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li)) {
            return false;
        }
        li liVar = (li) obj;
        return k71.k.b(this.a, liVar.a) && k71.k.b(this.b, liVar.b) && k71.k.b(this.c, liVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ti tiVar = this.b;
        int hashCode2 = (hashCode + (tiVar == null ? 0 : tiVar.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(__typename=");
        sb.append(this.a);
        sb.append(", onPullRequest=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
