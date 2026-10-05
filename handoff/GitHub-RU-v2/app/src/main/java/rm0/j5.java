package rm0;

import kc0.cy;
import kc0.gy;
import kc0.yb0;
import u10.dw;
import u10.hw;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j5 implements z01.r0, yb0, y90 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final v71.v t;

    public j5(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
        }
    }

    @Override // z01.r0
    public final y71.i a(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerLogin");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "query");
                return y41.t1.S("fetchRepositoryOwnerProjectsNext", "3.12");
            default:
                k71.k.g(str, "ownerLogin");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "query");
                return y41.t1.S("fetchRepositoryOwnerProjectsNext", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i b(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                return y41.t1.S("clearProjectFieldValue", "3.12");
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                return y41.t1.S("clearProjectFieldValue", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i c(String str, String str2, String str3, l01.c0 c0Var) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                return y41.t1.S("changeProjectFieldValue", "3.12");
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                return y41.t1.S("changeProjectFieldValue", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerLogin");
                return y41.t1.S("loadOwnerProjectsNextPage", "3.12");
            default:
                k71.k.g(str, "ownerLogin");
                return y41.t1.S("loadOwnerProjectsNextPage", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i e(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerLogin");
                return y41.t1.S("observeOwnerProjectsNext", "3.12");
            default:
                k71.k.g(str, "ownerLogin");
                return y41.t1.S("observeOwnerProjectsNext", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i f(String str, String str2, String str3, String str4, l01.c0 c0Var, String str5, l01.j0 j0Var, String str6) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                k71.k.g(str4, "fullDatabaseId");
                k71.k.g(str5, "viewId");
                return y41.t1.S("changeGroupedProjectFieldValue", "3.12");
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                k71.k.g(str4, "fullDatabaseId");
                k71.k.g(str5, "viewId");
                return y41.t1.S("changeGroupedProjectFieldValue", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i g(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerLogin");
                return y41.t1.S("refreshOwnerProjectsNext", "3.12");
            default:
                k71.k.g(str, "ownerLogin");
                return y41.t1.S("refreshOwnerProjectsNext", "3.10");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    @Override // z01.r0
    public final y71.i i(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                return y41.t1.S("deleteProjectItem", "3.12");
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                return y41.t1.S("deleteProjectItem", "3.10");
        }
    }

    @Override // z01.r0
    public final Object j(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                aa1.b bVar = aa.t0.d;
                aa1.b u0Var = str3 == null ? bVar : new aa.u0(str3);
                if (str4 != null) {
                    bVar = new aa.u0(str4);
                }
                return y71.n1.y(new h5(new y00.l(com.github.service.wrapper.a.o(this.s, new cy(u0Var, bVar, str, str2), null, false, null, null, 62), 10), str, str2, 0), this.t);
            default:
                aa1.b bVar2 = aa.t0.d;
                aa1.b u0Var2 = str3 == null ? bVar2 : new aa.u0(str3);
                if (str4 != null) {
                    bVar2 = new aa.u0(str4);
                }
                return y71.n1.y(new h5(new y00.l(com.github.service.wrapper.a.o(this.s, new dw(u0Var2, bVar2, str, str2), null, false, null, null, 62), 10), str, str2, 2), this.t);
        }
    }

    @Override // z01.r0
    public final y71.i k(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "userLogin");
                return y41.t1.S("fetchRecentProjectsForUser", "3.12");
            default:
                k71.k.g(str, "userLogin");
                return y41.t1.S("fetchRecentProjectsForUser", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i l(String str, int i) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectOwnerLogin");
                return y41.t1.S("resolveProjectType", "3.12");
            default:
                k71.k.g(str, "projectOwnerLogin");
                return y41.t1.S("resolveProjectType", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i m(String str, String str2, String str3, String str4, String str5, l01.j0 j0Var, String str6) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                k71.k.g(str4, "fullDatabaseId");
                k71.k.g(str5, "viewId");
                return y41.t1.S("clearGroupedProjectFieldValue", "3.12");
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                k71.k.g(str4, "fullDatabaseId");
                k71.k.g(str5, "viewId");
                return y41.t1.S("clearGroupedProjectFieldValue", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i n(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                return y41.t1.S("updateProjectLastViewed", "3.12");
            default:
                k71.k.g(str, "projectId");
                return y41.t1.S("updateProjectLastViewed", "3.10");
        }
    }

    @Override // z01.r0
    public final Object o(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                aa1.b bVar = aa.t0.d;
                aa1.b u0Var = str3 == null ? bVar : new aa.u0(str3);
                if (str4 != null) {
                    bVar = new aa.u0(str4);
                }
                return y71.n1.y(new h5(new y00.l(com.github.service.wrapper.a.o(this.s, new gy(u0Var, bVar, str, str2), null, false, null, null, 62), 10), str, str2, 1), this.t);
            default:
                aa1.b bVar2 = aa.t0.d;
                aa1.b u0Var2 = str3 == null ? bVar2 : new aa.u0(str3);
                if (str4 != null) {
                    bVar2 = new aa.u0(str4);
                }
                return y71.n1.y(new h5(new y00.l(com.github.service.wrapper.a.o(this.s, new hw(u0Var2, bVar2, str, str2), null, false, null, null, 62), 10), str, str2, 3), this.t);
        }
    }

    @Override // z01.r0
    public final y71.i p(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "contentId");
                return y41.t1.S("addProjectItem", "3.12");
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "contentId");
                return y41.t1.S("addProjectItem", "3.10");
        }
    }

    @Override // z01.r0
    public final y71.i q(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "orgLogin");
                return y41.t1.S("fetchRecentProjectsForOrganization", "3.12");
            default:
                k71.k.g(str, "orgLogin");
                return y41.t1.S("fetchRecentProjectsForOrganization", "3.10");
        }
    }
}
