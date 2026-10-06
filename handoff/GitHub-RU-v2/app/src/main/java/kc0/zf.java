package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zf {
    public String a;
    public hg b;
    public bl0.a c;

    public zf(String str, hg hgVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = hgVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf)) {
            return false;
        }
        zf zfVar = (zf) obj;
        return k71.k.b(this.a, zfVar.a) && k71.k.b(this.b, zfVar.b) && k71.k.b(this.c, zfVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hg hgVar = this.b;
        int hashCode2 = (hashCode + (hgVar == null ? 0 : hgVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node3(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.q(sb, this.c, ")");
    }
}
