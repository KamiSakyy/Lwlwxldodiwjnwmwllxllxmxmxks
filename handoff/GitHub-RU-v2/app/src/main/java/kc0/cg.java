package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cg {
    public final String a;
    public final dg b;
    public final bl0.a c;

    public cg(String str, dg dgVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dgVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return k71.k.b(this.a, cgVar.a) && k71.k.b(this.b, cgVar.b) && k71.k.b(this.c, cgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dg dgVar = this.b;
        int hashCode2 = (hashCode + (dgVar == null ? 0 : dgVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onIssue=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.q(sb, this.c, ")");
    }
}
