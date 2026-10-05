package bo;

import com.github.rudroid.common.d;
import java.util.List;
import jn0.yf0;
import k71.k;
import kc0.yb0;
import on.e;
import on.g;
import sy.c0;
import u10.y90;
import y41.t1;
import y71.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements e, yn.a, yf0, yb0, y90 {
    public final /* synthetic */ int r;

    @Override // on.e
    public final i a(List list, g gVar) {
        switch (this.r) {
            case 0:
                k.g(list, "filters");
                k.g(gVar, "order");
                return c0.j();
            case 1:
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("loadUserAgentSessionsPage", "3.17");
            case 2:
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("loadUserAgentSessionsPage", "3.12");
            default:
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("loadUserAgentSessionsPage", "3.10");
        }
    }

    @Override // on.e
    public final i b(String str, String str2) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "repoOwner", str2, "repoName");
            case 1:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("fetchViewerRepositorySubagentsCount", "3.17");
            case 2:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("fetchViewerRepositorySubagentsCount", "3.12");
            default:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("fetchViewerRepositorySubagentsCount", "3.10");
        }
    }

    @Override // on.e
    public final i c(String str) {
        switch (this.r) {
            case 0:
                return c0.j();
            case 1:
                return t1.S("fetchAgentTask", "3.17");
            case 2:
                return t1.S("fetchAgentTask", "3.12");
            default:
                return t1.S("fetchAgentTask", "3.10");
        }
    }

    @Override // on.e
    public final i d(String str, String str2) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "repoOwner", str2, "repoName");
            case 1:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("loadViewerRepositorySubagentsPage", "3.17");
            case 2:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("loadViewerRepositorySubagentsPage", "3.12");
            default:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("loadViewerRepositorySubagentsPage", "3.10");
        }
    }

    @Override // on.e
    public final i e(String str, String str2, List list, g gVar) {
        switch (this.r) {
            case 0:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return c0.j();
            case 1:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("loadRepositoryAgentTasksPage", "3.17");
            case 2:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("loadRepositoryAgentTasksPage", "3.12");
            default:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("loadRepositoryAgentTasksPage", "3.10");
        }
    }

    @Override // on.e
    public final i f(String str, String str2, List list, g gVar) {
        switch (this.r) {
            case 0:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return c0.j();
            case 1:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("observeRepositoryAgentTasks", "3.17");
            case 2:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("observeRepositoryAgentTasks", "3.12");
            default:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("observeRepositoryAgentTasks", "3.10");
        }
    }

    @Override // on.e
    public final i g(String str, String str2) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "repoOwner", str2, "repoName");
            case 1:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("loadRepositoryCodingAgentsPage", "3.17");
            case 2:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("loadRepositoryCodingAgentsPage", "3.12");
            default:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("loadRepositoryCodingAgentsPage", "3.10");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    @Override // on.e
    public final i i(String str) {
        switch (this.r) {
            case 0:
                return c0.j();
            case 1:
                return t1.S("fetchSessionById", "3.17");
            case 2:
                return t1.S("fetchSessionById", "3.12");
            default:
                return t1.S("fetchSessionById", "3.10");
        }
    }

    @Override // on.e
    public final i j(List list, g gVar, Integer num) {
        switch (this.r) {
            case 0:
                k.g(list, "filters");
                k.g(gVar, "order");
                return c0.j();
            case 1:
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("observeUserAgentSessions", "3.17");
            case 2:
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("observeUserAgentSessions", "3.12");
            default:
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("observeUserAgentSessions", "3.10");
        }
    }

    @Override // on.e
    public final i k(String str, String str2, List list, g gVar) {
        switch (this.r) {
            case 0:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return c0.j();
            case 1:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("refreshRepositoryAgentTasks", "3.17");
            case 2:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("refreshRepositoryAgentTasks", "3.12");
            default:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("refreshRepositoryAgentTasks", "3.10");
        }
    }

    @Override // on.e
    public final i l(String str) {
        switch (this.r) {
            case 0:
                return c0.j();
            case 1:
                return t1.S("fetchResourceForGlobalId", "3.17");
            case 2:
                return t1.S("fetchResourceForGlobalId", "3.12");
            default:
                return t1.S("fetchResourceForGlobalId", "3.10");
        }
    }

    @Override // on.e
    public final i m(String str, String str2) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "repoOwner", str2, "repoName");
            case 1:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("observeViewerRepositorySubagents", "3.17");
            case 2:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("observeViewerRepositorySubagents", "3.12");
            default:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("observeViewerRepositorySubagents", "3.10");
        }
    }

    @Override // on.e
    public final i n(String str, String str2) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "repoOwner", str2, "repoName");
            case 1:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("observeRepositoryCodingAgents", "3.17");
            case 2:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("observeRepositoryCodingAgents", "3.12");
            default:
                k.g(str, "repoOwner");
                k.g(str2, "repoName");
                return t1.S("observeRepositoryCodingAgents", "3.10");
        }
    }

    @Override // on.e
    public final i o(List list, g gVar, Integer num) {
        switch (this.r) {
            case 0:
                k.g(list, "filters");
                k.g(gVar, "order");
                return c0.j();
            case 1:
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("refreshUserAgentSessions", "3.17");
            case 2:
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("refreshUserAgentSessions", "3.12");
            default:
                k.g(list, "filters");
                k.g(gVar, "order");
                return t1.S("refreshUserAgentSessions", "3.10");
        }
    }

    @Override // on.e
    public final i p(String str, String str2, d dVar, String str3, String str4, Integer num, String str5) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "repositoryId", str2, "baseRef");
            case 1:
                k.g(str, "repositoryId");
                k.g(str2, "baseRef");
                return t1.S("createCopilotAgentTask", "3.17");
            case 2:
                k.g(str, "repositoryId");
                k.g(str2, "baseRef");
                return t1.S("createCopilotAgentTask", "3.12");
            default:
                k.g(str, "repositoryId");
                k.g(str2, "baseRef");
                return t1.S("createCopilotAgentTask", "3.10");
        }
    }
}
