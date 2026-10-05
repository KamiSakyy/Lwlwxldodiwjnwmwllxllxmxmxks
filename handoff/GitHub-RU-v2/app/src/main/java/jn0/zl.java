package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final cp0.g e;

    public zl(String str, String str2, String str3, String str4, cp0.g gVar) {
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
        if (!(obj instanceof zl)) {
            return false;
        }
        zl zlVar = (zl) obj;
        return k71.k.b(this.a, zlVar.a) && k71.k.b(this.b, zlVar.b) && k71.k.b(this.c, zlVar.c) && k71.k.b(this.d, zlVar.d) && k71.k.b(this.e, zlVar.e);
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
