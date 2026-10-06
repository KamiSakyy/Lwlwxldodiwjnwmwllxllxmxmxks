package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sq {
    public String a;
    public String b;
    public hq c;

    public sq(String str, String str2, hq hqVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = hqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) obj;
        return k71.k.b(this.a, sqVar.a) && k71.k.b(this.b, sqVar.b) && k71.k.b(this.c, sqVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        hq hqVar = this.c;
        return i + (hqVar == null ? 0 : hqVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target(__typename=", this.a, ", id=", this.b, ", onTag=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
