package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gj {
    public String a;
    public String b;
    public String c;
    public String d;
    public e30.c e;

    public gj(String str, String str2, String str3, String str4, e30.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj)) {
            return false;
        }
        gj gjVar = (gj) obj;
        return k71.k.b(this.a, gjVar.a) && k71.k.b(this.b, gjVar.b) && k71.k.b(this.c, gjVar.c) && k71.k.b(this.d, gjVar.d) && k71.k.b(this.e, gjVar.e);
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
