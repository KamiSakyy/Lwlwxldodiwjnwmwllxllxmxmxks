package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xo {
    public final String a;
    public final String b;
    public final sh0.a c;

    public xo(String str, String str2, sh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        return k71.k.b(this.a, xoVar.a) && k71.k.b(this.b, xoVar.b) && k71.k.b(this.c, xoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", pushNotificationSchedulesFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
