package yz0;

import com.github.service.models.response.RepoFileType;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a4 implements b4 {
    public String a;
    public int b;
    public boolean c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public String j;
    public ArrayList k;
    public final RepoFileType l = RepoFileType.TEXT;

    public a4(String str, int i, boolean z, boolean z2, String str2, String str3, String str4, String str5, boolean z3, String str6, ArrayList arrayList) {
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
        this.k = arrayList;
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
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return this.a.equals(a4Var.a) && this.b == a4Var.b && this.c == a4Var.c && this.d == a4Var.d && this.e.equals(a4Var.e) && this.f.equals(a4Var.f) && this.g.equals(a4Var.g) && this.h.equals(a4Var.h) && this.i == a4Var.i && k71.k.b(this.j, a4Var.j) && this.k.equals(a4Var.k);
    }

    @Override // yz0.b4
    public final RepoFileType getType() {
        return this.l;
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), this.e, 31), this.f, 31), this.g, 31), this.h, 31), 31, this.i);
        String str = this.j;
        return this.k.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "TextFile(id=", this.a, ", repoDatabaseId=", ", viewerCanCommitToBranch=");
        com.github.rudroid.m0.A(n, this.c, ", viewerCanPush=", this.d, ", fileRepoPath=");
        f1.e.x(n, this.e, ", commitOid=", this.f, ", headRef=");
        f1.e.x(n, this.g, ", repoOwnerAvatarUrl=", this.h, ", repoIsInOrganization=");
        com.github.rudroid.m0.z(n, this.i, ", extension=", this.j, ", fileLines=");
        return com.github.rudroid.m0.j(")", n, this.k);
    }
}
