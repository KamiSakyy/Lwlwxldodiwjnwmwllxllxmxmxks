package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qi {
    public String a;
    public ri b;
    public vx.a c;

    public qi(String str, ri riVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = riVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi)) {
            return false;
        }
        qi qiVar = (qi) obj;
        return k71.k.b(this.a, qiVar.a) && k71.k.b(this.b, qiVar.b) && k71.k.b(this.c, qiVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ri riVar = this.b;
        int hashCode2 = (hashCode + (riVar == null ? 0 : riVar.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onIssue=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
