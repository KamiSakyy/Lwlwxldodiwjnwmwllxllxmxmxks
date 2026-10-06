package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kd {
    public String a;
    public jd b;
    public String c;

    public kd(String str, jd jdVar, String str2) {
        this.a = str;
        this.b = jdVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        return k71.k.b(this.a, kdVar.a) && k71.k.b(this.b, kdVar.b) && k71.k.b(this.c, kdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jd jdVar = this.b;
        return this.c.hashCode() + ((hashCode + (jdVar == null ? 0 : jdVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
