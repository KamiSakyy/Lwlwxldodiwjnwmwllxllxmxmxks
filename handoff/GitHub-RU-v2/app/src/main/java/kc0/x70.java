package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x70 {
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public gn0.bm e;
    public String f;
    public List g;
    public gn0.jr h;
    public String i;

    public x70(String str, boolean z, boolean z2, boolean z3, gn0.bm bmVar, String str2, List list, gn0.jr jrVar, String str3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = bmVar;
        this.f = str2;
        this.g = list;
        this.h = jrVar;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x70)) {
            return false;
        }
        x70 x70Var = (x70) obj;
        return k71.k.b(this.a, x70Var.a) && this.b == x70Var.b && this.c == x70Var.c && this.d == x70Var.d && this.e == x70Var.e && k71.k.b(this.f, x70Var.f) && k71.k.b(this.g, x70Var.g) && this.h == x70Var.h && k71.k.b(this.i, x70Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + x.i.e(x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        gn0.jr jrVar = this.h;
        return this.i.hashCode() + ((hashCode3 + (jrVar != null ? jrVar.hashCode() : 0)) * 31);
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
