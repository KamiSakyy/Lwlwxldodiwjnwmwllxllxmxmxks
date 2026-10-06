package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class im {
    public final jm a;
    public final String b;
    public final String c;

    public im(jm jmVar, String str, String str2) {
        this.a = jmVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im)) {
            return false;
        }
        im imVar = (im) obj;
        return k71.k.b(this.a, imVar.a) && k71.k.b(this.b, imVar.b) && k71.k.b(this.c, imVar.c);
    }

    public final int hashCode() {
        jm jmVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((jmVar == null ? 0 : jmVar.hashCode()) * 31, this.b, 31);
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
