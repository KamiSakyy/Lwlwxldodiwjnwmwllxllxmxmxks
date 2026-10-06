package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lx {
    public final String a;
    public final ix b;
    public final String c;

    public lx(String str, ix ixVar, String str2) {
        this.a = str;
        this.b = ixVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj;
        return k71.k.b(this.a, lxVar.a) && k71.k.b(this.b, lxVar.b) && k71.k.b(this.c, lxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ix ixVar = this.b;
        return this.c.hashCode() + ((hashCode + (ixVar == null ? 0 : ixVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", branchInfo=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
