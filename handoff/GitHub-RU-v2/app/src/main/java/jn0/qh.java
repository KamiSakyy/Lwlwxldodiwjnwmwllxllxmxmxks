package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qh {
    public String a;
    public yh b;
    public kw0.a c;

    public qh(String str, yh yhVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = yhVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh)) {
            return false;
        }
        qh qhVar = (qh) obj;
        return k71.k.b(this.a, qhVar.a) && k71.k.b(this.b, qhVar.b) && k71.k.b(this.c, qhVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yh yhVar = this.b;
        int hashCode2 = (hashCode + (yhVar == null ? 0 : yhVar.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node3(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
