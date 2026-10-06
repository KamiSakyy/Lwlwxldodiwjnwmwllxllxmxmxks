package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s40 {
    public String a;
    public String b;
    public hc0.dk c;
    public String d;

    public s40(String str, String str2, hc0.dk dkVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = dkVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s40)) {
            return false;
        }
        s40 s40Var = (s40) obj;
        return k71.k.b(this.a, s40Var.a) && k71.k.b(this.b, s40Var.b) && this.c == s40Var.c && k71.k.b(this.d, s40Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Project(id=", this.a, ", name=", this.b, ", state=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
