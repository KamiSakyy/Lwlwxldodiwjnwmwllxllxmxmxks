package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class el {
    public final fl a;
    public final String b;
    public final String c;

    public el(fl flVar, String str, String str2) {
        this.a = flVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el)) {
            return false;
        }
        el elVar = (el) obj;
        return k71.k.b(this.a, elVar.a) && k71.k.b(this.b, elVar.b) && k71.k.b(this.c, elVar.c);
    }

    public final int hashCode() {
        fl flVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((flVar == null ? 0 : flVar.hashCode()) * 31, this.b, 31);
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
