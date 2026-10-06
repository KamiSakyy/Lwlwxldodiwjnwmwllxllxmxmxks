package yz0;

import com.github.service.models.response.RepoFileType;
import com.github.service.models.response.type.PatchStatus;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n1 {
    public String a;
    public String b;
    public int c;
    public int d;
    public boolean e;
    public List f;
    public boolean g;
    public boolean h;
    public boolean i;
    public PatchStatus j;
    public boolean k;
    public String l;
    public Integer m;
    public String n;
    public RepoFileType o;
    public List p;

    public n1(String str, String str2, int i, int i2, boolean z, List list, boolean z2, boolean z3, boolean z4, PatchStatus patchStatus, boolean z5, String str3, Integer num, String str4, RepoFileType repoFileType, List list2) {
        k71.k.g(patchStatus, "status");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = list;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = patchStatus;
        this.k = z5;
        this.l = str3;
        this.m = num;
        this.n = str4;
        this.o = repoFileType;
        this.p = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return k71.k.b(this.a, n1Var.a) && k71.k.b(this.b, n1Var.b) && this.c == n1Var.c && this.d == n1Var.d && this.e == n1Var.e && k71.k.b(this.f, n1Var.f) && this.g == n1Var.g && this.h == n1Var.h && this.i == n1Var.i && this.j == n1Var.j && this.k == n1Var.k && k71.k.b(this.l, n1Var.l) && k71.k.b(this.m, n1Var.m) && k71.k.b(this.n, n1Var.n) && this.o == n1Var.o && k71.k.b(this.p, n1Var.p);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(x.i.e((this.j.hashCode() + x.i.e(x.i.e(x.i.e(f1.e.c(this.f, x.i.e(a0.s0.b(this.d, a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), this.l, 31);
        Integer num = this.m;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.n;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RepoFileType repoFileType = this.o;
        return this.p.hashCode() + ((hashCode2 + (repoFileType != null ? repoFileType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("FileChanged(path=", this.a, ", oldPath=", this.b, ", additions=");
        a0.s0.z(o, this.c, ", deletions=", this.d, ", isViewed=");
        o.append(this.e);
        o.append(", diffLines=");
        o.append(this.f);
        o.append(", isBinary=");
        com.github.rudroid.m0.A(o, this.g, ", isLarge=", this.h, ", isGenerated=");
        o.append(this.i);
        o.append(", status=");
        o.append(this.j);
        o.append(", isSubmodule=");
        com.github.rudroid.m0.z(o, this.k, ", submodulePath=", this.l, ", totalLineCount=");
        o.append(this.m);
        o.append(", imageURL=");
        o.append(this.n);
        o.append(", filetype=");
        o.append(this.o);
        o.append(", fileLevelComments=");
        o.append(this.p);
        o.append(")");
        return o.toString();
    }
}
