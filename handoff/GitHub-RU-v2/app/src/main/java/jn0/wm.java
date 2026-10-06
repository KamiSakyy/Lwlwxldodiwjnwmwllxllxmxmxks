package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wm {
    public String a;
    public sm b;
    public String c;

    public wm(String str, sm smVar, String str2) {
        this.a = str;
        this.b = smVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        return k71.k.b(this.a, wmVar.a) && k71.k.b(this.b, wmVar.b) && k71.k.b(this.c, wmVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sm smVar = this.b;
        return this.c.hashCode() + ((hashCode + (smVar == null ? 0 : smVar.hashCode())) * 31);
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
