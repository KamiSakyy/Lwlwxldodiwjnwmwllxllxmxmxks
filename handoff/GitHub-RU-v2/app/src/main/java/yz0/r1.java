package yz0;

import com.github.service.models.response.GitObjectType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 {
    public final GitObjectType a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public r1(GitObjectType gitObjectType, String str, String str2, String str3, boolean z) {
        k71.k.g(gitObjectType, "gitObjectType");
        k71.k.g(str2, "branchOrCommitName");
        k71.k.g(str3, "path");
        this.a = gitObjectType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.a == r1Var.a && k71.k.b(this.b, r1Var.b) && k71.k.b(this.c, r1Var.c) && k71.k.b(this.d, r1Var.d) && this.e == r1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(gitObjectType=");
        sb.append(this.a);
        sb.append(", repositoryId=");
        sb.append(this.b);
        sb.append(", branchOrCommitName=");
        f1.e.x(sb, this.c, ", path=", this.d, ", isInRef=");
        return jo.f4.s(sb, this.e, ")");
    }
}
