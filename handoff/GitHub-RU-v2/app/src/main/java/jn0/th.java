package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class th {
    public String a;
    public uh b;
    public kw0.a c;

    public th(String str, uh uhVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = uhVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th)) {
            return false;
        }
        th thVar = (th) obj;
        return k71.k.b(this.a, thVar.a) && k71.k.b(this.b, thVar.b) && k71.k.b(this.c, thVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uh uhVar = this.b;
        int hashCode2 = (hashCode + (uhVar == null ? 0 : uhVar.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onIssue=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
