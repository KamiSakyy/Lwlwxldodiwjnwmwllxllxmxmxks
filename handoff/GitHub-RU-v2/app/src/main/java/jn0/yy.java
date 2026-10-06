package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yy {
    public String a;
    public String b;
    public pt0.h c;

    public yy(String str, String str2, pt0.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy)) {
            return false;
        }
        yy yyVar = (yy) obj;
        return k71.k.b(this.a, yyVar.a) && k71.k.b(this.b, yyVar.b) && k71.k.b(this.c, yyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", patchFileFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
