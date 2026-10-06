package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qz {
    public String a;
    public rz b;
    public bl0.a c;

    public qz(String str, rz rzVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = rzVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return k71.k.b(this.a, qzVar.a) && k71.k.b(this.b, qzVar.b) && k71.k.b(this.c, qzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rz rzVar = this.b;
        int hashCode2 = (hashCode + (rzVar == null ? 0 : rzVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.q(sb, this.c, ")");
    }
}
