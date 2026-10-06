package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ys {
    public final String a;
    public final zs b;
    public final bl0.a c;

    public ys(String str, zs zsVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = zsVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys)) {
            return false;
        }
        ys ysVar = (ys) obj;
        return k71.k.b(this.a, ysVar.a) && k71.k.b(this.b, ysVar.b) && k71.k.b(this.c, ysVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zs zsVar = this.b;
        int hashCode2 = (hashCode + (zsVar == null ? 0 : zsVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onTree=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.q(sb, this.c, ")");
    }
}
