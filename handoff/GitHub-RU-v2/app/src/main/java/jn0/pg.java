package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pg {
    public String a;
    public String b;
    public fw0.c1 c;

    public pg(String str, String str2, fw0.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg)) {
            return false;
        }
        pg pgVar = (pg) obj;
        return k71.k.b(this.a, pgVar.a) && k71.k.b(this.b, pgVar.b) && k71.k.b(this.c, pgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node2(__typename=", this.a, ", id=", this.b, ", userListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
