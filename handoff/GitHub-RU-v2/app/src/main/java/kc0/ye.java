package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ye {
    public String a;
    public String b;
    public ze c;

    public ye(String str, String str2, ze zeVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = zeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye)) {
            return false;
        }
        ye yeVar = (ye) obj;
        return k71.k.b(this.a, yeVar.a) && k71.k.b(this.b, yeVar.b) && k71.k.b(this.c, yeVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ze zeVar = this.c;
        return i + (zeVar == null ? 0 : zeVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onUser=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
