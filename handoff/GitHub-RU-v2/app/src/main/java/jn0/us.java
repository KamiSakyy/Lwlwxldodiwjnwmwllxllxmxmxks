package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class us {
    public String a;
    public String b;
    public js c;

    public us(String str, String str2, js jsVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = jsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us)) {
            return false;
        }
        us usVar = (us) obj;
        return k71.k.b(this.a, usVar.a) && k71.k.b(this.b, usVar.b) && k71.k.b(this.c, usVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        js jsVar = this.c;
        return i + (jsVar == null ? 0 : jsVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target(__typename=", this.a, ", id=", this.b, ", onTag=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
