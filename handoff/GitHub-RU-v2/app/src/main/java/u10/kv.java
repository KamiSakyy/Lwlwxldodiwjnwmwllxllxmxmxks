package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kv {
    public String a;
    public String b;
    public u80.c c;

    public kv(String str, String str2, u80.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv)) {
            return false;
        }
        kv kvVar = (kv) obj;
        return k71.k.b(this.a, kvVar.a) && k71.k.b(this.b, kvVar.b) && k71.k.b(this.c, kvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", repoBranchFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
