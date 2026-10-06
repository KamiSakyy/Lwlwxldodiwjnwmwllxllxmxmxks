package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x50 {
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public hc0.zk e;
    public String f;
    public List g;
    public hc0.fq h;
    public String i;

    public x50(String str, boolean z, boolean z2, boolean z3, hc0.zk zkVar, String str2, List list, hc0.fq fqVar, String str3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = zkVar;
        this.f = str2;
        this.g = list;
        this.h = fqVar;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x50)) {
            return false;
        }
        x50 x50Var = (x50) obj;
        return k71.k.b(this.a, x50Var.a) && this.b == x50Var.b && this.c == x50Var.c && this.d == x50Var.d && this.e == x50Var.e && k71.k.b(this.f, x50Var.f) && k71.k.b(this.g, x50Var.g) && this.h == x50Var.h && k71.k.b(this.i, x50Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + x.i.e(x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        hc0.fq fqVar = this.h;
        return this.i.hashCode() + ((hashCode3 + (fqVar != null ? fqVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("Repository(id=", this.a, ", mergeCommitAllowed=", ", squashMergeAllowed=", this.b);
        com.github.rudroid.m0.A(o, this.c, ", rebaseMergeAllowed=", this.d, ", viewerDefaultMergeMethod=");
        o.append(this.e);
        o.append(", viewerDefaultCommitEmail=");
        o.append(this.f);
        o.append(", viewerPossibleCommitEmails=");
        o.append(this.g);
        o.append(", viewerPermission=");
        o.append(this.h);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.i, ")");
    }
}
