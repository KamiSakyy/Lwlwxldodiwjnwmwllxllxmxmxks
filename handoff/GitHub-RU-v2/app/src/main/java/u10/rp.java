package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rp {
    public final String a;
    public final String b;
    public final e30.a c;

    public rp(String str, String str2, e30.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp)) {
            return false;
        }
        rp rpVar = (rp) obj;
        return k71.k.b(this.a, rpVar.a) && k71.k.b(this.b, rpVar.b) && k71.k.b(this.c, rpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author1(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
