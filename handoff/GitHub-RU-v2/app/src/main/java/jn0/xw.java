package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xw implements aaShadow.v0 {
    public gx a;
    public String b;
    public String c;

    public xw(gx gxVar, String str, String str2) {
        this.a = gxVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        return k71.k.b(this.a, xwVar.a) && k71.k.b(this.b, xwVar.b) && k71.k.b(this.c, xwVar.c);
    }

    public final int hashCode() {
        gx gxVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((gxVar == null ? 0 : gxVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repositoryOwner=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
