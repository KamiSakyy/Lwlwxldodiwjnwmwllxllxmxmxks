package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zb {
    public String a;
    public String b;
    public ac c;

    public zb(String str, String str2, ac acVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = acVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        return k71.k.b(this.a, zbVar.a) && k71.k.b(this.b, zbVar.b) && k71.k.b(this.c, zbVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ac acVar = this.c;
        return i + (acVar == null ? 0 : acVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onDiscussion=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
