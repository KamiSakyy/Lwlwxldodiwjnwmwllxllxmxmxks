package c30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public String a;
    public p b;
    public ja0.a c;

    public n(String str, p pVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = pVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && k71.k.b(this.c, nVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p pVar = this.b;
        int hashCode2 = (hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
