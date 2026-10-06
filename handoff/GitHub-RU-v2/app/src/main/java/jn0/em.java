package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class em implements aaShadow.v0 {
    public fm a;
    public String b;
    public String c;

    public em(fm fmVar, String str, String str2) {
        this.a = fmVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em)) {
            return false;
        }
        em emVar = (em) obj;
        return k71.k.b(this.a, emVar.a) && k71.k.b(this.b, emVar.b) && k71.k.b(this.c, emVar.c);
    }

    public final int hashCode() {
        fm fmVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((fmVar == null ? 0 : fmVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
