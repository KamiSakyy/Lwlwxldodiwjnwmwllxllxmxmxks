package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jr {
    public String a;
    public String b;
    public kr c;

    public jr(String str, String str2, kr krVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr)) {
            return false;
        }
        jr jrVar = (jr) obj;
        return k71.k.b(this.a, jrVar.a) && k71.k.b(this.b, jrVar.b) && k71.k.b(this.c, jrVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        kr krVar = this.c;
        return i + (krVar == null ? 0 : krVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
