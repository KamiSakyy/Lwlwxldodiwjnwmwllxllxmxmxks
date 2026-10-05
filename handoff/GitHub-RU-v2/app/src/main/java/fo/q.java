package fo;

import java.io.File;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements z01.s, yn.a {
    public final y71.i a(String str, String str2, String str3, String str4, File file, boolean z) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        return x.i.q(str3, "ref", str4, "path");
    }

    public final y71.i b(String str, String str2, String str3, String str4, String str5, String str6, e01.a aVar) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repoName");
        return x.i.q(str3, "branchName", str6, "$v$c$com-github-android-common-datatypes-CommitOid$-expectedHeadOid$0");
    }

    public final y71.i c(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        return x.i.q(str2, "repo", str4, "path");
    }

    public final y71.i d(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        return x.i.q(str2, "repo", str4, "path");
    }

    public final y71.i e(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        return x.i.q(str3, "branch", str4, "path");
    }

    public final y71.i f(String str, String str2, String str3, String str4) {
        return x.i.q(str, "repoOwner", str2, "repoName");
    }

    public final y71.i g(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        return x.i.q(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-oid$0", str4, "path");
    }

    public final Object h() {
        return this;
    }
}
