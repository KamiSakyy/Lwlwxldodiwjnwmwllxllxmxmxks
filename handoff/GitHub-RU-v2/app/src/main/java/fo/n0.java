package fo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements z01.c1, yn.a {
    public final y71.i a(String str, String str2, String str3) {
        k71.k.g(str, "repoId");
        return x.i.q(str2, "refName", str3, "$v$c$com-github-android-common-datatypes-CommitOid$-refOid$0");
    }

    public final y71.i b(String str, String str2, String str3, String str4) {
        return x.i.q(str, "ownerName", str2, "repoName");
    }

    public final y71.i c(String str, String str2, String str3) {
        return x.i.q(str, "ownerName", str2, "repoName");
    }

    public final y71.i d(String str, String str2) {
        return x.i.q(str, "ownerName", str2, "repoName");
    }

    public final y71.i e(String str, String str2, String str3, String str4, String str5) {
        k71.k.g(str, "repoId");
        k71.k.g(str2, "title");
        k71.k.g(str3, "body");
        return x.i.q(str4, "baseRefName", str5, "headRefName");
    }

    public final y71.i f(String str, String str2, String str3, String str4) {
        return x.i.q(str, "ownerName", str2, "repoName");
    }

    public final y71.i g(String str, String str2, String str3, String str4) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return x.i.q(str3, "baseRefName", str4, "headRefName");
    }

    public final Object h() {
        return this;
    }
}
