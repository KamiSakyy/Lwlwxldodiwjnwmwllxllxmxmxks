package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xd {
    public final String a;
    public final ud b;
    public final String c;

    public xd(String str, ud udVar, String str2) {
        this.a = str;
        this.b = udVar;
        this.c = str2;
    }

    public static xd a(xd xdVar, ud udVar) {
        String str = xdVar.a;
        String str2 = xdVar.c;
        xdVar.getClass();
        return new xd(str, udVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        return k71.k.b(this.a, xdVar.a) && k71.k.b(this.b, xdVar.b) && k71.k.b(this.c, xdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ud udVar = this.b;
        return this.c.hashCode() + ((hashCode + (udVar == null ? 0 : udVar.hashCode())) * 31);
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
