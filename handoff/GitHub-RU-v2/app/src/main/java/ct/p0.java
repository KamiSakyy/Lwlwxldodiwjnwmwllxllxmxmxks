package ct;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 {
    public String a;
    public String b;
    public o0 c;
    public String d;

    public p0(String str, String str2, o0 o0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = o0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && k71.k.b(this.b, p0Var.b) && k71.k.b(this.c, p0Var.c) && k71.k.b(this.d, p0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
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
