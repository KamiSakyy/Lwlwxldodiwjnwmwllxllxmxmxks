package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class go {
    public ho a;
    public String b;
    public String c;

    public go(ho hoVar, String str, String str2) {
        this.a = hoVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return k71.k.b(this.a, goVar.a) && k71.k.b(this.b, goVar.b) && k71.k.b(this.c, goVar.c);
    }

    public final int hashCode() {
        ho hoVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((hoVar == null ? 0 : hoVar.hashCode()) * 31, this.b, 31);
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
