package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements aa.v0 {
    public xShadow a;
    public String b;
    public String c;

    public u(xShadow xVar, String str, String str2) {
        this.a = xVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c);
    }

    public final int hashCode() {
        xShadow xVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((xVar == null ? 0 : xVar.hashCode()) * 31, this.b, 31);
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
