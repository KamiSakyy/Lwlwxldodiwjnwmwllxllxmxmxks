package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class us implements aa.v0 {
    public final xs a;
    public final String b;
    public final String c;

    public us(xs xsVar, String str, String str2) {
        this.a = xsVar;
        this.b = str;
        this.c = str2;
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
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
