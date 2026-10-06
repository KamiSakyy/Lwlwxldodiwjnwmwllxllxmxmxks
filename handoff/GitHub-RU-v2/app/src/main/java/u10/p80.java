package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p80 {
    public String a;
    public String b;
    public String c;
    public e30.a d;

    public p80(String str, String str2, String str3, e30.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p80)) {
            return false;
        }
        p80 p80Var = (p80) obj;
        return k71.k.b(this.a, p80Var.a) && k71.k.b(this.b, p80Var.b) && k71.k.b(this.c, p80Var.c) && k71.k.b(this.d, p80Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", name=", this.b, ", id=");
        o.append(this.c);
        o.append(", actorFields=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
