package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xv {
    public final int a;
    public final wv b;
    public final rv c;
    public final String d;
    public final String e;

    public xv(int i, wv wvVar, rv rvVar, String str, String str2) {
        this.a = i;
        this.b = wvVar;
        this.c = rvVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return this.a == xvVar.a && k71.k.b(this.b, xvVar.b) && k71.k.b(this.c, xvVar.c) && k71.k.b(this.d, xvVar.d) && k71.k.b(this.e, xvVar.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        wv wvVar = this.b;
        int hashCode2 = (hashCode + (wvVar == null ? 0 : wvVar.hashCode())) * 31;
        rv rvVar = this.c;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((hashCode2 + (rvVar != null ? rvVar.hashCode() : 0)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(planLimit=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", collaborators=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
