package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mx implements aa.v0 {
    public final px a;
    public final String b;
    public final String c;

    public mx(px pxVar, String str, String str2) {
        this.a = pxVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx)) {
            return false;
        }
        mx mxVar = (mx) obj;
        return k71.k.b(this.a, mxVar.a) && k71.k.b(this.b, mxVar.b) && k71.k.b(this.c, mxVar.c);
    }

    public final int hashCode() {
        px pxVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((pxVar == null ? 0 : pxVar.hashCode()) * 31, this.b, 31);
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
