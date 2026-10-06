package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gy {
    public String a;
    public hy b;
    public ja0.a c;

    public gy(String str, hy hyVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = hyVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy)) {
            return false;
        }
        gy gyVar = (gy) obj;
        return k71.k.b(this.a, gyVar.a) && k71.k.b(this.b, gyVar.b) && k71.k.b(this.c, gyVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hy hyVar = this.b;
        int hashCode2 = (hashCode + (hyVar == null ? 0 : hyVar.hashCode())) * 31;
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
    public gy(String p1, Object p2, Object p3) {
    }
}
