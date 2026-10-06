package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class om {
    public final pm a;
    public final String b;
    public final String c;

    public om(pm pmVar, String str, String str2) {
        this.a = pmVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om)) {
            return false;
        }
        om omVar = (om) obj;
        return k71.k.b(this.a, omVar.a) && k71.k.b(this.b, omVar.b) && k71.k.b(this.c, omVar.c);
    }

    public final int hashCode() {
        pm pmVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((pmVar == null ? 0 : pmVar.hashCode()) * 31, this.b, 31);
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
