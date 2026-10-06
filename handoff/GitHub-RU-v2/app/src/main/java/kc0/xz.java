package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xz {
    public String a;
    public yz b;
    public bl0.a c;

    public xz(String str, yz yzVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = yzVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz)) {
            return false;
        }
        xz xzVar = (xz) obj;
        return k71.k.b(this.a, xzVar.a) && k71.k.b(this.b, xzVar.b) && k71.k.b(this.c, xzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yz yzVar = this.b;
        int hashCode2 = (hashCode + (yzVar == null ? 0 : yzVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.q(sb, this.c, ")");
    }
}
