package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class am {
    public bm a;
    public String b;
    public String c;

    public am(bm bmVar, String str, String str2) {
        this.a = bmVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return k71.k.b(this.a, amVar.a) && k71.k.b(this.b, amVar.b) && k71.k.b(this.c, amVar.c);
    }

    public final int hashCode() {
        bm bmVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((bmVar == null ? 0 : bmVar.hashCode()) * 31, this.b, 31);
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
