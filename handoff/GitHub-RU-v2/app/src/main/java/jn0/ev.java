package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ev {
    public final String a;
    public final String b;
    public final ap0.z3 c;

    public ev(String str, String str2, ap0.z3 z3Var) {
        this.a = str;
        this.b = str2;
        this.c = z3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        return k71.k.b(this.a, evVar.a) && k71.k.b(this.b, evVar.b) && k71.k.b(this.c, evVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repoFileFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
