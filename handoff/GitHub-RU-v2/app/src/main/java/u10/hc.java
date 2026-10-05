package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hc {
    public final ec a;
    public final String b;
    public final String c;

    public hc(ec ecVar, String str, String str2) {
        this.a = ecVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        return k71.k.b(this.a, hcVar.a) && k71.k.b(this.b, hcVar.b) && k71.k.b(this.c, hcVar.c);
    }

    public final int hashCode() {
        ec ecVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ecVar == null ? 0 : ecVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(diff=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
