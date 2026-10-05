package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s1 {
    public final String a;
    public final String b;
    public final r1 c;
    public final String d;

    public s1(String str, String str2, r1 r1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = r1Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return k71.k.b(this.a, s1Var.a) && k71.k.b(this.b, s1Var.b) && k71.k.b(this.c, s1Var.c) && k71.k.b(this.d, s1Var.d);
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
