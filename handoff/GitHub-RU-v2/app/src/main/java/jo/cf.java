package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cf implements aaShadow.v0 {
    public final ff a;
    public final String b;
    public final String c;

    public cf(ff ffVar, String str, String str2) {
        this.a = ffVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return k71.k.b(this.a, cfVar.a) && k71.k.b(this.b, cfVar.b) && k71.k.b(this.c, cfVar.c);
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
