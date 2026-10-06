package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yx {
    public String a;
    public zx b;
    public ja0.a c;

    public yx(String str, zx zxVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = zxVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx)) {
            return false;
        }
        yx yxVar = (yx) obj;
        return k71.k.b(this.a, yxVar.a) && k71.k.b(this.b, yxVar.b) && k71.k.b(this.c, yxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zx zxVar = this.b;
        int hashCode2 = (hashCode + (zxVar == null ? 0 : zxVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
    public yx(String p1, Object p2, Object p3) {
    }
}
