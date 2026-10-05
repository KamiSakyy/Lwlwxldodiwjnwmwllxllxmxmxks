package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tu {
    public final String a;
    public final String b;
    public final eq.c c;

    public tu(String str, String str2, eq.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu)) {
            return false;
        }
        tu tuVar = (tu) obj;
        return k71.k.b(this.a, tuVar.a) && k71.k.b(this.b, tuVar.b) && k71.k.b(this.c, tuVar.c);
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
