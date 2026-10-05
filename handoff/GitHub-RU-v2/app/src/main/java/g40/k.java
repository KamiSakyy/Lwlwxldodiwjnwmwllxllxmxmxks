package g40;

import hc0.fm;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public final String a;
    public final fm b;
    public final String c;
    public final int d;
    public final String e;
    public final u f;
    public final String g;

    public k(String str, fm fmVar, String str2, int i, String str3, u uVar, String str4) {
        this.a = str;
        this.b = fmVar;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = uVar;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && this.b == kVar.b && k71.k.b(this.c, kVar.c) && this.d == kVar.d && k71.k.b(this.e, kVar.e) && k71.k.b(this.f, kVar.f) && k71.k.b(this.g, kVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.d, com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31), this.e, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node2(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", headRefName=");
        a0.s0.w(this.d, this.c, ", number=", ", title=", sb);
        sb.append(this.e);
        sb.append(", repository=");
        sb.append(this.f);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.g, ")");
    }
}
