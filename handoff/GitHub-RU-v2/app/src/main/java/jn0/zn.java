package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zn {
    public ao a;
    public String b;
    public String c;

    public zn(ao aoVar, String str, String str2) {
        this.a = aoVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        return k71.k.b(this.a, znVar.a) && k71.k.b(this.b, znVar.b) && k71.k.b(this.c, znVar.c);
    }

    public final int hashCode() {
        ao aoVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((aoVar == null ? 0 : aoVar.hashCode()) * 31, this.b, 31);
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
