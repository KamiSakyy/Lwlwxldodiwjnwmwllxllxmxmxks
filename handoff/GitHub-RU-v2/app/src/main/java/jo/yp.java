package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yp {
    public final zp a;
    public final String b;
    public final String c;

    public yp(zp zpVar, String str, String str2) {
        this.a = zpVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp)) {
            return false;
        }
        yp ypVar = (yp) obj;
        return k71.k.b(this.a, ypVar.a) && k71.k.b(this.b, ypVar.b) && k71.k.b(this.c, ypVar.c);
    }

    public final int hashCode() {
        zp zpVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((zpVar == null ? 0 : zpVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organization(organizationDiscussionsRepository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
