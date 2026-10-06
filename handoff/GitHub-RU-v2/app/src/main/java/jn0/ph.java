package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ph {
    public String a;
    public xh b;
    public kw0.a c;

    public ph(String str, xh xhVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = xhVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        return k71.k.b(this.a, phVar.a) && k71.k.b(this.b, phVar.b) && k71.k.b(this.c, phVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xh xhVar = this.b;
        int hashCode2 = (hashCode + (xhVar == null ? 0 : xhVar.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node2(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
