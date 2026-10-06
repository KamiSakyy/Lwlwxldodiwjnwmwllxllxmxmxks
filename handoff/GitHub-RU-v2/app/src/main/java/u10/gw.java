package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gw {
    public String a;
    public String b;
    public v70.d c;

    public gw(String str, String str2, v70.d dVar) {
        this.a = str;
        this.b = str2;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return k71.k.b(this.a, gwVar.a) && k71.k.b(this.b, gwVar.b) && k71.k.b(this.c, gwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", projectOwnerFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public gw(String p1, String p2, Object p3) {
    }
}
