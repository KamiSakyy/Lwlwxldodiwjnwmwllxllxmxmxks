package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ap {
    public final String a;
    public final String b;
    public final e30.a c;

    public ap(String str, String str2, e30.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return k71.k.b(this.a, apVar.a) && k71.k.b(this.b, apVar.b) && k71.k.b(this.c, apVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node2(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
