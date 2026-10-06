package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dr implements aaShadow.v0 {
    public final fr a;
    public final String b;
    public final String c;

    public dr(fr frVar, String str, String str2) {
        this.a = frVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr)) {
            return false;
        }
        dr drVar = (dr) obj;
        return k71.k.b(this.a, drVar.a) && k71.k.b(this.b, drVar.b) && k71.k.b(this.c, drVar.c);
    }

    public final int hashCode() {
        fr frVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((frVar == null ? 0 : frVar.hashCode()) * 31, this.b, 31);
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
