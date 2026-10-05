package fo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements z01.g, yn.a {
    public final y71.i a(String str, String str2, String str3, String str4) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        return x.i.q(str3, "baseRefName", str4, "headRefName");
    }

    public final y71.i b(String str, String str2, String str3, String str4, String str5) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        return x.i.q(str3, "branch", str4, "path");
    }

    public final y71.i c(String str, String str2, String str3, String str4) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        return x.i.q(str3, "baseRefName", str4, "headRefName");
    }

    public final y71.i d(String str) {
        k71.k.g(str, "commitId");
        return sy.c0.j();
    }

    public final y71.i e(String str, String str2, String str3, String str4) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        return x.i.q(str3, "baseRefName", str4, "headRefName");
    }

    public final Object f(String str, String str2, String str3) {
        return sy.c0.j();
    }

    public final y71.i g(String str, String str2, String str3) {
        k71.k.g(str, "repoOwner");
        return x.i.q(str2, "repoName", str3, "$v$c$com-github-android-common-datatypes-CommitOid$-commitOid$0");
    }

    public final Object h() {
        return this;
    }
}
