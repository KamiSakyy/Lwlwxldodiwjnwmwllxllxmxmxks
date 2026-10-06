package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xe {
    public String a;
    public ef b;
    public ja0.a c;

    public xe(String str, ef efVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = efVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        return k71.k.b(this.a, xeVar.a) && k71.k.b(this.b, xeVar.b) && k71.k.b(this.c, xeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ef efVar = this.b;
        int hashCode2 = (hashCode + (efVar == null ? 0 : efVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node2(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
