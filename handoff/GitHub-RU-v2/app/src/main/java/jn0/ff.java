package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ff implements aaShadow.v0 {
    public gf a;
    public String b;
    public String c;

    public ff(gf gfVar, String str, String str2) {
        this.a = gfVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        return k71.k.b(this.a, ffVar.a) && k71.k.b(this.b, ffVar.b) && k71.k.b(this.c, ffVar.c);
    }

    public final int hashCode() {
        gf gfVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((gfVar == null ? 0 : gfVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(organization=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
