package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ic {
    public String a;
    public hc b;
    public String c;

    public ic(String str, hc hcVar, String str2) {
        this.a = str;
        this.b = hcVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj;
        return k71.k.b(this.a, icVar.a) && k71.k.b(this.b, icVar.b) && k71.k.b(this.c, icVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hc hcVar = this.b;
        return this.c.hashCode() + ((hashCode + (hcVar == null ? 0 : hcVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
