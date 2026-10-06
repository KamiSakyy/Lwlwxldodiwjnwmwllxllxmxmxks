package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kb {
    public lb a;
    public String b;
    public String c;

    public kb(lb lbVar, String str, String str2) {
        this.a = lbVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        return k71.k.b(this.a, kbVar.a) && k71.k.b(this.b, kbVar.b) && k71.k.b(this.c, kbVar.c);
    }

    public final int hashCode() {
        lb lbVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((lbVar == null ? 0 : lbVar.hashCode()) * 31, this.b, 31);
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
