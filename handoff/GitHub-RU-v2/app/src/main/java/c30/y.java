package c30;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.h0 {
    public String a;
    public Integer b;
    public n c;
    public boolean d;
    public v e;
    public u f;
    public boolean g;
    public String h;

    public y(String str, Integer num, n nVar, boolean z, v vVar, u uVar, boolean z2, String str2) {
        this.a = str;
        this.b = num;
        this.c = nVar;
        this.d = z;
        this.e = vVar;
        this.f = uVar;
        this.g = z2;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && k71.k.b(this.b, yVar.b) && k71.k.b(this.c, yVar.c) && this.d == yVar.d && k71.k.b(this.e, yVar.e) && k71.k.b(this.f, yVar.f) && this.g == yVar.g && k71.k.b(this.h, yVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        n nVar = this.c;
        int e = x.i.e((hashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.d);
        v vVar = this.e;
        return this.h.hashCode() + x.i.e((this.f.hashCode() + ((e + (vVar != null ? vVar.hashCode() : 0)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder r = h1.r(this.b, "RepoFileFragment(id=", this.a, ", databaseId=", ", gitObject=");
        r.append(this.c);
        r.append(", viewerCanPush=");
        r.append(this.d);
        r.append(", ref=");
        r.append(this.e);
        r.append(", owner=");
        r.append(this.f);
        r.append(", isInOrganization=");
        return com.github.rudroid.m0.l(r, this.g, ", __typename=", this.h, ")");
    }
}
