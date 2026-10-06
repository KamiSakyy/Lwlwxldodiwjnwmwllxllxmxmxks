package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bm {
    public final String a;
    public final zl b;
    public final String c;

    public bm(String str, zl zlVar, String str2) {
        this.a = str;
        this.b = zlVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return k71.k.b(this.a, bmVar.a) && k71.k.b(this.b, bmVar.b) && k71.k.b(this.c, bmVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zl zlVar = this.b;
        return this.c.hashCode() + ((hashCode + (zlVar == null ? 0 : zlVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationDiscussionsRepository(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
