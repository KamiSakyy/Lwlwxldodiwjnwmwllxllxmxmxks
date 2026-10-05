package vb0;

import com.github.service.models.response.ProjectV2OrderField;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y3 implements z01.s0, y90 {
    @Override // z01.s0
    public final y71.i a(String str, ProjectV2OrderField projectV2OrderField, v01.a aVar) {
        k71.k.g(str, "query");
        k71.k.g(projectV2OrderField, "orderField");
        k71.k.g(aVar, "orderDirection");
        return y41.t1.S("loadUserProjects", "3.10");
    }

    @Override // z01.s0
    public final y71.i b(String str, ProjectV2OrderField projectV2OrderField, v01.a aVar) {
        k71.k.g(str, "query");
        k71.k.g(projectV2OrderField, "orderField");
        k71.k.g(aVar, "orderDirection");
        return y41.t1.S("refreshUserProjects", "3.10");
    }

    @Override // z01.s0
    public final y71.i c(String str, ProjectV2OrderField projectV2OrderField, v01.a aVar) {
        k71.k.g(str, "query");
        k71.k.g(projectV2OrderField, "orderField");
        k71.k.g(aVar, "orderDirection");
        return y41.t1.S("observeUserProjects", "3.10");
    }

    public final Object h() {
        return this;
    }
}
