package yz0;

import com.github.service.models.response.RepoFileType;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z3 implements b4 {
    public String a;
    public int b;
    public boolean c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public ArrayList j;
    public final RepoFileType k = RepoFileType.MARKDOWN;

    public z3(String str, int i, boolean z, boolean z2, String str2, String str3, String str4, String str5, boolean z3, ArrayList arrayList) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
        this.j = arrayList;
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
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return this.a.equals(z3Var.a) && this.b == z3Var.b && this.c == z3Var.c && this.d == z3Var.d && this.e.equals(z3Var.e) && this.f.equals(z3Var.f) && this.g.equals(z3Var.g) && this.h.equals(z3Var.h) && this.i == z3Var.i && this.j.equals(z3Var.j);
    }

    @Override // yz0.b4
    public final RepoFileType getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.j.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), this.e, 31), this.f, 31), this.g, 31), this.h, 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "RawMarkdownFile(id=", this.a, ", repoDatabaseId=", ", viewerCanCommitToBranch=");
        com.github.rudroid.m0.A(n, this.c, ", viewerCanPush=", this.d, ", fileRepoPath=");
        f1.e.x(n, this.e, ", commitOid=", this.f, ", headRef=");
        f1.e.x(n, this.g, ", repoOwnerAvatarUrl=", this.h, ", repoIsInOrganization=");
        n.append(this.i);
        n.append(", fileLines=");
        n.append(this.j);
        n.append(")");
        return n.toString();
    }
}
