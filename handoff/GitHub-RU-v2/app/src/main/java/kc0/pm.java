package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pm {
    public nm a;
    public String b;
    public String c;

    public pm(nm nmVar, String str, String str2) {
        this.a = nmVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm)) {
            return false;
        }
        pm pmVar = (pm) obj;
        return k71.k.b(this.a, pmVar.a) && k71.k.b(this.b, pmVar.b) && k71.k.b(this.c, pmVar.c);
    }

    public final int hashCode() {
        nm nmVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((nmVar == null ? 0 : nmVar.hashCode()) * 31, this.b, 31);
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
