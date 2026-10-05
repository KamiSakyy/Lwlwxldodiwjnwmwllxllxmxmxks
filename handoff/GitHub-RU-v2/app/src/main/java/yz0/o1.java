package yz0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o1 {
    public final List a;
    public final int b;
    public final String c;
    public final t7 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final int m;
    public final int n;
    public final String o;
    public final String p;

    public /* synthetic */ o1(ArrayList arrayList, int i, String str, t7 t7Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i2, int i3) {
        this(arrayList, i, str, t7Var, str2, str3, str4, str5, str6, str7, str8, z, i2, i3, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.a, o1Var.a) && this.b == o1Var.b && k71.k.b(this.c, o1Var.c) && k71.k.b(this.d, o1Var.d) && k71.k.b(this.e, o1Var.e) && k71.k.b(this.f, o1Var.f) && k71.k.b(this.g, o1Var.g) && k71.k.b(this.h, o1Var.h) && k71.k.b(this.i, o1Var.i) && k71.k.b(this.j, o1Var.j) && k71.k.b(this.k, o1Var.k) && this.l == o1Var.l && this.m == o1Var.m && this.n == o1Var.n && k71.k.b(this.o, o1Var.o) && k71.k.b(this.p, o1Var.p);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.d.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31)) * 31, this.e, 31), this.f, 31), this.g, 31), this.h, 31);
        String str = this.i;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int b = a0.s0.b(this.n, a0.s0.b(this.m, x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.k, 31), 31, this.l), 31), 31);
        String str3 = this.o;
        int hashCode2 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesChanged(files=");
        sb.append(this.a);
        sb.append(", pendingCommentsCount=");
        sb.append(this.b);
        sb.append(", reviewId=");
        sb.append(this.c);
        sb.append(", repo=");
        sb.append(this.d);
        sb.append(", pullRequestId=");
        f1.e.x(sb, this.e, ", headRefOid=", this.f, ", baseRefName=");
        f1.e.x(sb, this.g, ", headRefName=", this.h, ", headRefRepoName=");
        f1.e.x(sb, this.i, ", headRefRepoOwner=", this.j, ", repoOwnerId=");
        com.github.rudroid.m0.x(sb, this.k, ", viewerCanEdit=", this.l, ", totalAdditions=");
        a0.s0.z(sb, this.m, ", totalDeletions=", this.n, ", diffBaseOid=");
        return x.i.k(sb, this.o, ", diffHeadOid=", this.p, ")");
    }

    public o1(List list, int i, String str, t7 t7Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i2, int i3, String str9, String str10) {
        k71.k.g(str, "reviewId");
        k71.k.g(t7Var, "repo");
        k71.k.g(str2, "pullRequestId");
        k71.k.g(str3, "headRefOid");
        k71.k.g(str4, "baseRefName");
        k71.k.g(str5, "headRefName");
        k71.k.g(str8, "repoOwnerId");
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = t7Var;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = z;
        this.m = i2;
        this.n = i3;
        this.o = str9;
        this.p = str10;
    }
}
