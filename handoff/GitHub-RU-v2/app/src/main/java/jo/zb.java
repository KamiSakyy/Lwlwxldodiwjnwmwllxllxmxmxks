package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zb {
    public String a;
    public xb b;
    public String c;

    public zb(String str, xb xbVar, String str2) {
        this.a = str;
        this.b = xbVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        return k71.k.b(this.a, zbVar.a) && k71.k.b(this.b, zbVar.b) && k71.k.b(this.c, zbVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xb xbVar = this.b;
        return this.c.hashCode() + ((hashCode + (xbVar == null ? 0 : xbVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
