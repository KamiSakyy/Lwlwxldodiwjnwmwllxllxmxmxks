package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bk {
    public String a;
    public zj b;
    public String c;

    public bk(String str, zj zjVar, String str2) {
        this.a = str;
        this.b = zjVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return k71.k.b(this.a, bkVar.a) && k71.k.b(this.b, bkVar.b) && k71.k.b(this.c, bkVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zj zjVar = this.b;
        return this.c.hashCode() + ((hashCode + (zjVar == null ? 0 : zjVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", issueOrPullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
