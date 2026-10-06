package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ni {
    public String a;
    public vi b;
    public vx.a c;

    public ni(String str, vi viVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = viVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni)) {
            return false;
        }
        ni niVar = (ni) obj;
        return k71.k.b(this.a, niVar.a) && k71.k.b(this.b, niVar.b) && k71.k.b(this.c, niVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vi viVar = this.b;
        int hashCode2 = (hashCode + (viVar == null ? 0 : viVar.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node3(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
