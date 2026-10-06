package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ur {
    public String a;
    public vr b;
    public ja0.a c;

    public ur(String str, vr vrVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = vrVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur)) {
            return false;
        }
        ur urVar = (ur) obj;
        return k71.k.b(this.a, urVar.a) && k71.k.b(this.b, urVar.b) && k71.k.b(this.c, urVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vr vrVar = this.b;
        int hashCode2 = (hashCode + (vrVar == null ? 0 : vrVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onTree=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
