package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jd {
    public final gd a;
    public final String b;
    public final String c;

    public jd(gd gdVar, String str, String str2) {
        this.a = gdVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj;
        return k71.k.b(this.a, jdVar.a) && k71.k.b(this.b, jdVar.b) && k71.k.b(this.c, jdVar.c);
    }

    public final int hashCode() {
        gd gdVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((gdVar == null ? 0 : gdVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(diff=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
