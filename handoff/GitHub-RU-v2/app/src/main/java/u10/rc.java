package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rc {
    public final String a;
    public final String b;
    public final oc c;
    public final ja0.a d;

    public rc(String str, String str2, oc ocVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = ocVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return k71.k.b(this.a, rcVar.a) && k71.k.b(this.b, rcVar.b) && k71.k.b(this.c, rcVar.c) && k71.k.b(this.d, rcVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        oc ocVar = this.c;
        int hashCode = (i + (ocVar == null ? 0 : ocVar.hashCode())) * 31;
        ja0.a aVar = this.d;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepoObject(__typename=", this.a, ", oid=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(", nodeIdFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
