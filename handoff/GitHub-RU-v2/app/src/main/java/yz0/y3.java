package yz0;

import com.github.service.models.response.RepoFileType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y3 implements b4 {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final RepoFileType k = RepoFileType.PDF;

    public y3(String str, int i, boolean z, boolean z2, String str2, String str3, String str4, String str5, boolean z3, String str6) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
        this.j = str6;
    }

    @Override // yz0.b4
    public final boolean a() {
        return this.c;
    }

    @Override // yz0.b4
    public final boolean b() {
        return this.d;
    }

    @Override // yz0.b4
    public final String c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return k71.k.b(this.a, y3Var.a) && this.b == y3Var.b && this.c == y3Var.c && this.d == y3Var.d && k71.k.b(this.e, y3Var.e) && k71.k.b(this.f, y3Var.f) && k71.k.b(this.g, y3Var.g) && k71.k.b(this.h, y3Var.h) && this.i == y3Var.i && k71.k.b(this.j, y3Var.j);
    }

    @Override // yz0.b4
    public final RepoFileType getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.j.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), this.e, 31), this.f, 31), this.g, 31), this.h, 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "PdfFile(id=", this.a, ", repoDatabaseId=", ", viewerCanCommitToBranch=");
        com.github.rudroid.m0.A(n, this.c, ", viewerCanPush=", this.d, ", fileRepoPath=");
        f1.e.x(n, this.e, ", commitOid=", this.f, ", headRef=");
        f1.e.x(n, this.g, ", repoOwnerAvatarUrl=", this.h, ", repoIsInOrganization=");
        return com.github.rudroid.m0.l(n, this.i, ", filePath=", this.j, ")");
    }
}
