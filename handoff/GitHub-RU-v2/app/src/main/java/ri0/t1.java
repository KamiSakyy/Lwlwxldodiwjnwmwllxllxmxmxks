package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t1 {
    public String a;
    public String b;
    public s1 c;
    public String d;

    public t1(String str, String str2, s1 s1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = s1Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return k71.k.b(this.a, t1Var.a) && k71.k.b(this.b, t1Var.b) && k71.k.b(this.c, t1Var.c) && k71.k.b(this.d, t1Var.d);
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
