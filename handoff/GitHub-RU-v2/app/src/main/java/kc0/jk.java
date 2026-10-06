package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jk {
    public final String a;
    public final String b;
    public final kk c;

    public jk(String str, String str2, kk kkVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = kkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        return k71.k.b(this.a, jkVar.a) && k71.k.b(this.b, jkVar.b) && k71.k.b(this.c, jkVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        kk kkVar = this.c;
        return i + (kkVar == null ? 0 : kkVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
