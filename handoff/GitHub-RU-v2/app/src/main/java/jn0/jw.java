package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jw {
    public String a;
    public String b;
    public kw c;

    public jw(String str, String str2, kw kwVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = kwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        return k71.k.b(this.a, jwVar.a) && k71.k.b(this.b, jwVar.b) && k71.k.b(this.c, jwVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        kw kwVar = this.c;
        return i + (kwVar == null ? 0 : kwVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
