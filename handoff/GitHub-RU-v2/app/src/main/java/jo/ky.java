package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ky {
    public String a;
    public String b;
    public ly c;

    public ky(String str, String str2, ly lyVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = lyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky)) {
            return false;
        }
        ky kyVar = (ky) obj;
        return k71.k.b(this.a, kyVar.a) && k71.k.b(this.b, kyVar.b) && k71.k.b(this.c, kyVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ly lyVar = this.c;
        return i + (lyVar == null ? 0 : lyVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
