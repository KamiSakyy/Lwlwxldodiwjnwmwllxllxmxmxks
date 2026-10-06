package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public String a;
    public String b;
    public String c;
    public String d;
    public eq.g e;

    public m(String str, String str2, String str3, String str4, eq.g gVar) {
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
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c) && k71.k.b(this.d, mVar.d) && k71.k.b(this.e, mVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", name=");
        f1.e.x(o, this.c, ", login=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
