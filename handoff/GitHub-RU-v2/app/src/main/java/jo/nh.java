package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nh {
    public final String a;
    public final String b;
    public final oh c;

    public nh(String str, String str2, oh ohVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = ohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh)) {
            return false;
        }
        nh nhVar = (nh) obj;
        return k71.k.b(this.a, nhVar.a) && k71.k.b(this.b, nhVar.b) && k71.k.b(this.c, nhVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        oh ohVar = this.c;
        return i + (ohVar == null ? 0 : ohVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onUser=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
