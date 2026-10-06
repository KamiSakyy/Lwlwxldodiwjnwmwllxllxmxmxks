package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ho {
    public fo a;
    public String b;
    public String c;

    public ho(fo foVar, String str, String str2) {
        this.a = foVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return k71.k.b(this.a, hoVar.a) && k71.k.b(this.b, hoVar.b) && k71.k.b(this.c, hoVar.c);
    }

    public final int hashCode() {
        fo foVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((foVar == null ? 0 : foVar.hashCode()) * 31, this.b, 31);
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
