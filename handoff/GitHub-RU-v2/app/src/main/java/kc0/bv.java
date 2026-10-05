package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bv {
    public final String a;
    public final yu b;
    public final String c;

    public bv(String str, yu yuVar, String str2) {
        this.a = str;
        this.b = yuVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv)) {
            return false;
        }
        bv bvVar = (bv) obj;
        return k71.k.b(this.a, bvVar.a) && k71.k.b(this.b, bvVar.b) && k71.k.b(this.c, bvVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yu yuVar = this.b;
        return this.c.hashCode() + ((hashCode + (yuVar == null ? 0 : yuVar.hashCode())) * 31);
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
