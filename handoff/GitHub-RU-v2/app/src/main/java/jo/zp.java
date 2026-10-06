package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zp {
    public xp a;
    public String b;
    public String c;

    public zp(xp xpVar, String str, String str2) {
        this.a = xpVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj;
        return k71.k.b(this.a, zpVar.a) && k71.k.b(this.b, zpVar.b) && k71.k.b(this.c, zpVar.c);
    }

    public final int hashCode() {
        xp xpVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((xpVar == null ? 0 : xpVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationDiscussionsRepository(discussion=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
