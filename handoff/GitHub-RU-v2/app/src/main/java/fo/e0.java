package fo;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.List;
import kc0.yb0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 implements z01.p0, yn.a, yb0 {
    public final /* synthetic */ int r;

    public final y71.i a(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "viewId");
                return sy.c0.j();
            default:
                k71.k.g(str, "viewId");
                return t1.S("loadGroupsPage", "3.12");
        }
    }

    public final y71.i b(String str, String str2) {
        switch (this.r) {
            case 0:
                return sy.c0.j();
            default:
                return t1.S("refreshProjectBoardItems", "3.12");
        }
    }

    public final y71.i c(String str) {
        switch (this.r) {
            case 0:
                return sy.c0.j();
            default:
                return t1.S("observeProjectBoardItemRelatedProjects", "3.12");
        }
    }

    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "viewId");
                return sy.c0.j();
            default:
                k71.k.g(str, "viewId");
                return t1.S("observeProjectBoardItems", "3.12");
        }
    }

    public final y71.i e(ProjectsMetaInfo projectsMetaInfo, String str, l01.c0 c0Var, List list) {
        switch (this.r) {
            case 0:
                k71.k.g(projectsMetaInfo, "projectsMetaInfo");
                k71.k.g(list, "newSortValues");
                return sy.c0.j();
            default:
                k71.k.g(projectsMetaInfo, "projectsMetaInfo");
                k71.k.g(list, "newSortValues");
                return t1.S("reallocateItem", "3.12");
        }
    }

    public final y71.i f(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                return x.i.q(str2, "viewId", str3, "itemId");
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "viewId");
                k71.k.g(str3, "itemId");
                return t1.S("deleteProjectItem", "3.12");
        }
    }

    public final y71.i g(String str, int i) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectOwnerLogin");
                return sy.c0.j();
            default:
                k71.k.g(str, "projectOwnerLogin");
                return t1.S("observeProjectBoardViewInfo", "3.12");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    public final y71.i i(String str, int i) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectOwnerLogin");
                return sy.c0.j();
            default:
                k71.k.g(str, "projectOwnerLogin");
                return t1.S("fetchProjectBoardInfo", "3.12");
        }
    }

    public final y71.i k(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                return sy.c0.j();
            default:
                return t1.S("loadGroupItemsPage", "3.12");
        }
    }

    public final y71.i l(String str, String str2) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "fullDatabaseId", str2, "selectedViewId");
            default:
                k71.k.g(str, "fullDatabaseId");
                k71.k.g(str2, "selectedViewId");
                return t1.S("observeProjectBoardItem", "3.12");
        }
    }
}
