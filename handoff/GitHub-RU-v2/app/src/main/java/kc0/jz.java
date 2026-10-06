package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jz {
    public String a;
    public kz b;
    public bl0.a c;

    public jz(String str, kz kzVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = kzVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        return k71.k.b(this.a, jzVar.a) && k71.k.b(this.b, jzVar.b) && k71.k.b(this.c, jzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kz kzVar = this.b;
        int hashCode2 = (hashCode + (kzVar == null ? 0 : kzVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onOrganization=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.q(sb, this.c, ")");
    }
}
