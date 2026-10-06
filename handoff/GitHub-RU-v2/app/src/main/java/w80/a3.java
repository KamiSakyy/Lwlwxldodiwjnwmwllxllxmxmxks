package w80;

import hc0.dk;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a3 {
    public String a;
    public String b;
    public dk c;
    public String d;

    public a3(String str, String str2, dk dkVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = dkVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return k71.k.b(this.a, a3Var.a) && k71.k.b(this.b, a3Var.b) && this.c == a3Var.c && k71.k.b(this.d, a3Var.d);
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
