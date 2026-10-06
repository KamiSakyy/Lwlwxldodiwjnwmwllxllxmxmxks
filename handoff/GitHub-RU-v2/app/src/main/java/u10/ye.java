package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ye {
    public String a;
    public ff b;
    public ja0.a c;

    public ye(String str, ff ffVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = ffVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye)) {
            return false;
        }
        ye yeVar = (ye) obj;
        return k71.k.b(this.a, yeVar.a) && k71.k.b(this.b, yeVar.b) && k71.k.b(this.c, yeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ff ffVar = this.b;
        int hashCode2 = (hashCode + (ffVar == null ? 0 : ffVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node3(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
