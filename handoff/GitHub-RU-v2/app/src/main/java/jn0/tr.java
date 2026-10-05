package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tr {
    public final String a;
    public final String b;
    public final fw0.c1 c;

    public tr(String str, String str2, fw0.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr)) {
            return false;
        }
        tr trVar = (tr) obj;
        return k71.k.b(this.a, trVar.a) && k71.k.b(this.b, trVar.b) && k71.k.b(this.c, trVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", userListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
