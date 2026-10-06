package yz0;

import com.github.service.models.response.RepoFileType;
import com.github.service.models.response.type.PatchStatus;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p1 {
    public String a;
    public String b;
    public int c;
    public int d;
    public ArrayList e;
    public boolean f;
    public boolean g;
    public boolean h;
    public PatchStatus i;
    public boolean j;
    public String k;
    public int l;
    public String m;
    public RepoFileType n;

    public p1(String str, String str2, int i, int i2, ArrayList arrayList, boolean z, boolean z2, boolean z3, PatchStatus patchStatus, boolean z4, String str3, int i3, String str4, RepoFileType repoFileType) {
        k71.k.g(patchStatus, "status");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = arrayList;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = patchStatus;
        this.j = z4;
        this.k = str3;
        this.l = i3;
        this.m = str4;
        this.n = repoFileType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.a.equals(p1Var.a) && this.b.equals(p1Var.b) && this.c == p1Var.c && this.d == p1Var.d && this.e.equals(p1Var.e) && this.f == p1Var.f && this.g == p1Var.g && this.h == p1Var.h && this.i == p1Var.i && this.j == p1Var.j && this.k.equals(p1Var.k) && this.l == p1Var.l && k71.k.b(this.m, p1Var.m) && this.n == p1Var.n;
    }

    public final int hashCode() {
        int b = a0.s0.b(this.l, com.github.rudroid.copilot.h1.i(x.i.e((this.i.hashCode() + x.i.e(x.i.e(x.i.e(no.a.b(this.e, a0.s0.b(this.d, a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), this.k, 31), 31);
        String str = this.m;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        RepoFileType repoFileType = this.n;
        return hashCode + (repoFileType != null ? repoFileType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("FileChanged(path=", this.a, ", oldPath=", this.b, ", additions=");
        a0.s0.z(o, this.c, ", deletions=", this.d, ", diffLines=");
        o.append(this.e);
        o.append(", isBinary=");
        o.append(this.f);
        o.append(", isLarge=");
        com.github.rudroid.m0.A(o, this.g, ", isGenerated=", this.h, ", status=");
        o.append(this.i);
        o.append(", isSubmodule=");
        o.append(this.j);
        o.append(", submodulePath=");
        a0.s0.w(this.l, this.k, ", totalLineCount=", ", imageURL=", o);
        o.append(this.m);
        o.append(", filetype=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }
}
