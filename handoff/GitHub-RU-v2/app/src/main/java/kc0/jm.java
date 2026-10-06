package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jm {
    public gm a;
    public String b;
    public String c;

    public jm(gm gmVar, String str, String str2) {
        this.a = gmVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm)) {
            return false;
        }
        jm jmVar = (jm) obj;
        return k71.k.b(this.a, jmVar.a) && k71.k.b(this.b, jmVar.b) && k71.k.b(this.c, jmVar.c);
    }

    public final int hashCode() {
        gm gmVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((gmVar == null ? 0 : gmVar.hashCode()) * 31, this.b, 31);
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
