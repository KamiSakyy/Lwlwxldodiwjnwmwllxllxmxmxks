package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wk {
    public xk a;
    public String b;
    public String c;

    public wk(xk xkVar, String str, String str2) {
        this.a = xkVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk)) {
            return false;
        }
        wk wkVar = (wk) obj;
        return k71.k.b(this.a, wkVar.a) && k71.k.b(this.b, wkVar.b) && k71.k.b(this.c, wkVar.c);
    }

    public final int hashCode() {
        xk xkVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((xkVar == null ? 0 : xkVar.hashCode()) * 31, this.b, 31);
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
