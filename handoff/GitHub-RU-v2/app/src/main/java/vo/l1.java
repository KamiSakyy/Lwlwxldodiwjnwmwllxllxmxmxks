package vo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 {
    public final String a;
    public final String b;
    public final k1 c;
    public final String d;

    public l1(String str, String str2, k1 k1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = k1Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return k71.k.b(this.a, l1Var.a) && k71.k.b(this.b, l1Var.b) && k71.k.b(this.c, l1Var.c) && k71.k.b(this.d, l1Var.d);
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
