package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s6 {
    public String a;
    public String b;
    public q6 c;
    public String d;

    public s6(String str, String str2, q6 q6Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = q6Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return k71.k.b(this.a, s6Var.a) && k71.k.b(this.b, s6Var.b) && k71.k.b(this.c, s6Var.c) && k71.k.b(this.d, s6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
