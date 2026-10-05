package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ar {
    public final String a;
    public final String b;
    public final qx.j c;

    public ar(String str, String str2, qx.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return k71.k.b(this.a, arVar.a) && k71.k.b(this.b, arVar.b) && k71.k.b(this.c, arVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", homePinnedItems=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }





}
