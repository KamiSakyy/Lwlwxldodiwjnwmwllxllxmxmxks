package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ao {
    public xn a;
    public String b;
    public String c;

    public ao(xn xnVar, String str, String str2) {
        this.a = xnVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return k71.k.b(this.a, aoVar.a) && k71.k.b(this.b, aoVar.b) && k71.k.b(this.c, aoVar.c);
    }

    public final int hashCode() {
        xn xnVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((xnVar == null ? 0 : xnVar.hashCode()) * 31, this.b, 31);
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
