package we0;

import gn0.hn;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public final String a;
    public final hn b;
    public final String c;
    public final int d;
    public final String e;
    public final u f;
    public final boolean g;
    public final String h;

    public k(String str, hn hnVar, String str2, int i, String str3, u uVar, boolean z, String str4) {
        this.a = str;
        this.b = hnVar;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = uVar;
        this.g = z;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && this.b == kVar.b && k71.k.b(this.c, kVar.c) && this.d == kVar.d && k71.k.b(this.e, kVar.e) && k71.k.b(this.f, kVar.f) && this.g == kVar.g && k71.k.b(this.h, kVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + x.i.e((this.f.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.d, com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31), this.e, 31)) * 31, 31, this.g);
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
        sb.append(", isInMergeQueue=");
        return com.github.rudroid.m0.l(sb, this.g, ", __typename=", this.h, ")");
    }
}
