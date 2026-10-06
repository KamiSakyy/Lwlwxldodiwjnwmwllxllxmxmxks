package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pt implements aaShadow.v0 {
    public final ut a;
    public final String b;
    public final String c;

    public pt(ut utVar, String str, String str2) {
        this.a = utVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt)) {
            return false;
        }
        pt ptVar = (pt) obj;
        return k71.k.b(this.a, ptVar.a) && k71.k.b(this.b, ptVar.b) && k71.k.b(this.c, ptVar.c);
    }

    public final int hashCode() {
        ut utVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((utVar == null ? 0 : utVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
