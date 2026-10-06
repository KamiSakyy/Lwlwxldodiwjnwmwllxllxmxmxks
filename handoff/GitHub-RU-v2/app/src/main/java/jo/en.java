package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class en {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final eq.g e;

    public en(String str, String str2, String str3, String str4, eq.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en)) {
            return false;
        }
        en enVar = (en) obj;
        return k71.k.b(this.a, enVar.a) && k71.k.b(this.b, enVar.b) && k71.k.b(this.c, enVar.c) && k71.k.b(this.d, enVar.d) && k71.k.b(this.e, enVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", name=", this.b, ", login=");
        f1.e.x(o, this.c, ", id=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
