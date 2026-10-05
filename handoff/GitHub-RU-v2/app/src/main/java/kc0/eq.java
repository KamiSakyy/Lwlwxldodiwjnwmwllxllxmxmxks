package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eq {
    public final String a;
    public final String b;
    public final ud0.a c;

    public eq(String str, String str2, ud0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        return k71.k.b(this.a, eqVar.a) && k71.k.b(this.b, eqVar.b) && k71.k.b(this.c, eqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node2(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
