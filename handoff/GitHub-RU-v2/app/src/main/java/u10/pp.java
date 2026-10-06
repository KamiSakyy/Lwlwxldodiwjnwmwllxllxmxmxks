package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pp {
    public final String a;
    public final String b;
    public final e30.a c;

    public pp(String str, String str2, e30.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp)) {
            return false;
        }
        pp ppVar = (pp) obj;
        return k71.k.b(this.a, ppVar.a) && k71.k.b(this.b, ppVar.b) && k71.k.b(this.c, ppVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
