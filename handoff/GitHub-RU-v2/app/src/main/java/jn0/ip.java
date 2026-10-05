package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ip {
    public final String a;
    public final String b;
    public final fw0.j c;

    public ip(String str, String str2, fw0.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip)) {
            return false;
        }
        ip ipVar = (ip) obj;
        return k71.k.b(this.a, ipVar.a) && k71.k.b(this.b, ipVar.b) && k71.k.b(this.c, ipVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", homePinnedItems=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
