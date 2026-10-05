package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oh {
    public final String a;
    public final wh b;
    public final kw0.a c;

    public oh(String str, wh whVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = whVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh)) {
            return false;
        }
        oh ohVar = (oh) obj;
        return k71.k.b(this.a, ohVar.a) && k71.k.b(this.b, ohVar.b) && k71.k.b(this.c, ohVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wh whVar = this.b;
        int hashCode2 = (hashCode + (whVar == null ? 0 : whVar.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(__typename=");
        sb.append(this.a);
        sb.append(", onPullRequest=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
