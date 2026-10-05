package vb0;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w3 implements z01.p0, y90 {
    @Override // z01.p0
    public final y71.i a(String str, String str2) {
        k71.k.g(str, "viewId");
        return y41.t1.S("loadGroupsPage", "3.10");
    }

    @Override // z01.p0
    public final y71.i b(String str, String str2) {
        return y41.t1.S("refreshProjectBoardItems", "3.10");
    }

    @Override // z01.p0
    public final y71.i c(String str) {
        return y41.t1.S("observeProjectBoardItemRelatedProjects", "3.10");
    }

    @Override // z01.p0
    public final y71.i d(String str, String str2) {
        k71.k.g(str, "viewId");
        return y41.t1.S("observeProjectBoardItems", "3.10");
    }

    @Override // z01.p0
    public final y71.i e(ProjectsMetaInfo projectsMetaInfo, String str, l01.c0 c0Var, List list) {
        k71.k.g(projectsMetaInfo, "projectsMetaInfo");
        k71.k.g(list, "newSortValues");
        return y41.t1.S("reallocateItem", "3.10");
    }

    @Override // z01.p0
    public final y71.i f(String str, String str2, String str3) {
        k71.k.g(str, "projectId");
        k71.k.g(str2, "viewId");
        k71.k.g(str3, "itemId");
        return y41.t1.S("deleteProjectItem", "3.10");
    }

    @Override // z01.p0
    public final y71.i g(String str, int i) {
        k71.k.g(str, "projectOwnerLogin");
        return y41.t1.S("observeProjectBoardViewInfo", "3.10");
    }

    public final Object h() {
        return this;
    }

    @Override // z01.p0
    public final y71.i i(String str, int i) {
        k71.k.g(str, "projectOwnerLogin");
        return y41.t1.S("fetchProjectBoardInfo", "3.10");
    }

    @Override // z01.p0
    public final y71.i k(String str, String str2, String str3) {
        return y41.t1.S("loadGroupItemsPage", "3.10");
    }

    @Override // z01.p0
    public final y71.i l(String str, String str2) {
        k71.k.g(str, "fullDatabaseId");
        k71.k.g(str2, "selectedViewId");
        return y41.t1.S("observeProjectBoardItem", "3.10");
    }
}
