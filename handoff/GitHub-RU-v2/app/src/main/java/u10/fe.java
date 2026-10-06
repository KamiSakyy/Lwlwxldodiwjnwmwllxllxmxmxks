package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fe {
    public String a;
    public String b;
    public ge c;

    public fe(String str, String str2, ge geVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = geVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return k71.k.b(this.a, feVar.a) && k71.k.b(this.b, feVar.b) && k71.k.b(this.c, feVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ge geVar = this.c;
        return i + (geVar == null ? 0 : geVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onUser=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
