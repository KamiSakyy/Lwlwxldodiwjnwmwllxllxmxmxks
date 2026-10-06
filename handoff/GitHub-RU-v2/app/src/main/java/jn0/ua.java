package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ua implements aaShadow.v0 {
    public final va a;
    public final String b;
    public final String c;

    public ua(va vaVar, String str, String str2) {
        this.a = vaVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        return k71.k.b(this.a, uaVar.a) && k71.k.b(this.b, uaVar.b) && k71.k.b(this.c, uaVar.c);
    }

    public final int hashCode() {
        va vaVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((vaVar == null ? 0 : vaVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(discussionCategory=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
