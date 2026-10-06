package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iu {
    public final String a;
    public final String b;
    public final eq.g c;

    public iu(String str, String str2, eq.g gVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu)) {
            return false;
        }
        iu iuVar = (iu) obj;
        return k71.k.b(this.a, iuVar.a) && k71.k.b(this.b, iuVar.b) && k71.k.b(this.c, iuVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        eq.g gVar = this.c;
        return i + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", avatarFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
