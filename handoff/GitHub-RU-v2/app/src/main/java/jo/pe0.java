package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pe0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final m10.py e;
    public final String f;
    public final List g;
    public final m10.n40 h;
    public final String i;

    public pe0(String str, boolean z, boolean z2, boolean z3, m10.py pyVar, String str2, List list, m10.n40 n40Var, String str3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = pyVar;
        this.f = str2;
        this.g = list;
        this.h = n40Var;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe0)) {
            return false;
        }
        pe0 pe0Var = (pe0) obj;
        return k71.k.b(this.a, pe0Var.a) && this.b == pe0Var.b && this.c == pe0Var.c && this.d == pe0Var.d && this.e == pe0Var.e && k71.k.b(this.f, pe0Var.f) && k71.k.b(this.g, pe0Var.g) && this.h == pe0Var.h && k71.k.b(this.i, pe0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + x.i.e(x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        m10.n40 n40Var = this.h;
        return this.i.hashCode() + ((hashCode3 + (n40Var != null ? n40Var.hashCode() : 0)) * 31);
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
