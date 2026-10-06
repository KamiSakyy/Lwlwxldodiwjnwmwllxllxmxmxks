package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y00Shadow {
    public String a;
    public String b;
    public yu.h c;

    public Object y00(String str, String str2, yu.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00Shadow)) {
            return false;
        }
        y00Shadow y00Var = (y00Shadow) obj;
        return k71.k.b(this.a, y00Var.a) && k71.k.b(this.b, y00Var.b) && k71.k.b(this.c, y00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", patchFileFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
