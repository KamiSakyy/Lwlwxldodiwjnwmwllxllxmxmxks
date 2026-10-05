package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hj {
    public final String a;
    public final String b;
    public final ij c;

    public hj(String str, String str2, ij ijVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = ijVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj)) {
            return false;
        }
        hj hjVar = (hj) obj;
        return k71.k.b(this.a, hjVar.a) && k71.k.b(this.b, hjVar.b) && k71.k.b(this.c, hjVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ij ijVar = this.c;
        return i + (ijVar == null ? 0 : ijVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
