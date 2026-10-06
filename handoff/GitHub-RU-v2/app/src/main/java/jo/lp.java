package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lp {
    public final String a;
    public final jp b;
    public final String c;

    public lp(String str, jp jpVar, String str2) {
        this.a = str;
        this.b = jpVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp)) {
            return false;
        }
        lp lpVar = (lp) obj;
        return k71.k.b(this.a, lpVar.a) && k71.k.b(this.b, lpVar.b) && k71.k.b(this.c, lpVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jp jpVar = this.b;
        return this.c.hashCode() + ((hashCode + (jpVar == null ? 0 : jpVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationDiscussionsRepository(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
