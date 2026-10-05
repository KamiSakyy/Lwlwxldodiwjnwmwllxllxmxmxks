package vb0;

import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x3 implements z01.q0, y90 {
    @Override // z01.q0
    public final y71.i a(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repositoryName");
        return y41.t1.S("loadRepositoryProjectsPage", "3.10");
    }

    @Override // z01.q0
    public final y71.i b(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repositoryName");
        return y41.t1.S("fetchRepositoryProjects", "3.10");
    }

    @Override // z01.q0
    public final y71.i c(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repositoryName");
        return y41.t1.S("refreshRepositoryProjects", "3.10");
    }

    public final Object h() {
        return this;
    }
}
