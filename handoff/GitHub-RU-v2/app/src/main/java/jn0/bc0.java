package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bc0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final pz0.zs e;
    public final String f;
    public final List g;
    public final pz0.py h;
    public final String i;

    public bc0(String str, boolean z, boolean z2, boolean z3, pz0.zs zsVar, String str2, List list, pz0.py pyVar, String str3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = zsVar;
        this.f = str2;
        this.g = list;
        this.h = pyVar;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) obj;
        return k71.k.b(this.a, bc0Var.a) && this.b == bc0Var.b && this.c == bc0Var.c && this.d == bc0Var.d && this.e == bc0Var.e && k71.k.b(this.f, bc0Var.f) && k71.k.b(this.g, bc0Var.g) && this.h == bc0Var.h && k71.k.b(this.i, bc0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + x.i.e(x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        pz0.py pyVar = this.h;
        return this.i.hashCode() + ((hashCode3 + (pyVar != null ? pyVar.hashCode() : 0)) * 31);
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
