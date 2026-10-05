package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gx {
    public final String a;
    public final hx b;
    public final vx.a c;

    public gx(String str, hx hxVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = hxVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx)) {
            return false;
        }
        gx gxVar = (gx) obj;
        return k71.k.b(this.a, gxVar.a) && k71.k.b(this.b, gxVar.b) && k71.k.b(this.c, gxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hx hxVar = this.b;
        int hashCode2 = (hashCode + (hxVar == null ? 0 : hxVar.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onTree=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
