package com.github.rudroid.searchandfilter.ui;

import com.github.domain.searchandfilter.filters.data.AgentTasksSortFilter;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsTopFilter;
import com.github.domain.searchandfilter.filters.data.IssueStatusFilter;
import com.github.domain.searchandfilter.filters.data.IssueUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.ProjectOrderFilter;
import com.github.domain.searchandfilter.filters.data.ProjectScopeFilter;
import com.github.domain.searchandfilter.filters.data.ProjectStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryTypeFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryVisibilityFilter;
import com.github.domain.searchandfilter.filters.data.ReviewStatusFilter;
import com.github.domain.searchandfilter.filters.data.TrendingPeriodFilter;
import com.github.rudroid.common.j0;
import com.github.rudroid.common.k0;
import com.github.rudroid.searchandfilter.filterbar.f;
import com.github.service.models.response.TrendingPeriod;
import com.github.service.models.response.type.MobileSubjectType;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ com.github.rudroid.searchandfilter.q s;

    public /* synthetic */ k(com.github.rudroid.searchandfilter.q qVar, int i) {
        this.r = i;
        this.s = qVar;
    }

    public final Object k(Object obj) {
        f.b.C0002b.a.C0003a c0003a = (f.b.C0002b.a.C0003a) obj;
        switch (this.r) {
            case 0:
                k71.k.g(c0003a, "it");
                this.s.Y(new PullRequestStatusFilter((com.github.rudroid.common.g0) c0003a.a), MobileSubjectType.FILTER_PULL_REQUEST_STATUS);
                break;
            case 1:
                k71.k.g(c0003a, "it");
                this.s.Y(new IssueUserRelationshipFilter((com.github.rudroid.common.x) c0003a.a), MobileSubjectType.FILTER_ISSUE_VIEWER);
                break;
            case 2:
                k71.k.g(c0003a, "it");
                this.s.Y(new DiscussionUserRelationshipFilter((bm.h) c0003a.a), MobileSubjectType.FILTER_DISCUSSION_VIEWER);
                break;
            case 3:
                k71.k.g(c0003a, "it");
                this.s.Y(new PullRequestUserRelationshipFilter((com.github.rudroid.common.h0) c0003a.a), MobileSubjectType.FILTER_PULL_REQUEST_VIEWER);
                break;
            case 4:
                k71.k.g(c0003a, "it");
                this.s.Y(new AgentTasksSortFilter((on.g) c0003a.a), MobileSubjectType.FILTER_AGENT_TASKS_SORT);
                break;
            case 5:
                k71.k.g(c0003a, "it");
                this.s.Y(new ProjectStatusFilter((com.github.rudroid.common.f0) c0003a.a), null);
                break;
            case 6:
                k71.k.g(c0003a, "it");
                this.s.Y(new ProjectOrderFilter((com.github.rudroid.common.d0) c0003a.a), null);
                break;
            case 7:
                k71.k.g(c0003a, "it");
                this.s.Y(new ReviewStatusFilter((k0) c0003a.a), MobileSubjectType.FILTER_PULL_REQUEST_REVIEW_STATUS);
                break;
            case 8:
                k71.k.g(c0003a, "it");
                this.s.Y(new TrendingPeriodFilter((TrendingPeriod) c0003a.a), MobileSubjectType.FILTER_TRENDING_DATE_RANGE);
                break;
            case 9:
                k71.k.g(c0003a, "it");
                this.s.Y(new DiscussionStatusFilter((com.github.rudroid.common.h) c0003a.a), MobileSubjectType.FILTER_DISCUSSION_STATUS);
                break;
            case 10:
                k71.k.g(c0003a, "it");
                this.s.Y(new ProjectScopeFilter((com.github.rudroid.common.e0) c0003a.a), null);
                break;
            case 11:
                k71.k.g(c0003a, "it");
                this.s.Y(new RepositoryVisibilityFilter((j0) c0003a.a), MobileSubjectType.FILTER_REPOSITORY_VISIBILITY);
                break;
            case 12:
                k71.k.g(c0003a, "it");
                this.s.Y(new AgentTasksStateFilter((cm.a) c0003a.a), MobileSubjectType.FILTER_AGENT_TASK_STATE);
                break;
            case 13:
                k71.k.g(c0003a, "it");
                this.s.Y(new DiscussionsTopFilter((bm.j) c0003a.a), MobileSubjectType.FILTER_DISCUSSION_TOP);
                break;
            case 14:
                k71.k.g(c0003a, "it");
                this.s.Y(new RepositoryTypeFilter((v01.d) c0003a.a), MobileSubjectType.FILTER_REPOSITORY_TYPE);
                break;
            default:
                k71.k.g(c0003a, "it");
                this.s.Y(new IssueStatusFilter((com.github.rudroid.common.w) c0003a.a), MobileSubjectType.FILTER_ISSUE_STATUS);
                break;
        }
        return w61.a0.a;
    }
}
