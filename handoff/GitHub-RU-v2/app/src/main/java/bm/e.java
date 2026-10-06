package bm;

import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.domain.searchandfilter.filters.data.AgentTasksSortFilter;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter;
import com.github.domain.searchandfilter.filters.data.AssigneeFilter;
import com.github.domain.searchandfilter.filters.data.AuthorFilter;
import com.github.domain.searchandfilter.filters.data.CustomFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsIsUnansweredFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsTopFilter;
import com.github.domain.searchandfilter.filters.data.IsDraftFilter;
import com.github.domain.searchandfilter.filters.data.IssueStatusFilter;
import com.github.domain.searchandfilter.filters.data.IssueTypeFilter;
import com.github.domain.searchandfilter.filters.data.IssueUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.LabelFilter;
import com.github.domain.searchandfilter.filters.data.LanguageFilter;
import com.github.domain.searchandfilter.filters.data.MilestoneFilter;
import com.github.domain.searchandfilter.filters.data.OrganizationFilter;
import com.github.domain.searchandfilter.filters.data.ProjectFilter;
import com.github.domain.searchandfilter.filters.data.ProjectOrderFilter;
import com.github.domain.searchandfilter.filters.data.ProjectScopeFilter;
import com.github.domain.searchandfilter.filters.data.ProjectStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.RepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.RepositorySortFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryTypeFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryVisibilityFilter;
import com.github.domain.searchandfilter.filters.data.ReviewRequestedFilter;
import com.github.domain.searchandfilter.filters.data.ReviewStatusFilter;
import com.github.domain.searchandfilter.filters.data.Separator;
import com.github.domain.searchandfilter.filters.data.SortFilter;
import com.github.domain.searchandfilter.filters.data.SpokenLanguageFilter;
import com.github.domain.searchandfilter.filters.data.TrendingPeriodFilter;
import com.github.rudroid.common.h0;
import com.github.rudroid.common.i0;
import com.github.rudroid.common.x;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static final ArrayList a = d0.b(new TrendingPeriodFilter(TrendingPeriodFilter.x), new LanguageFilter(null), new SpokenLanguageFilter(null));
    public static final ArrayList b = b(d0.b(new PullRequestStatusFilter(), new ReviewRequestedFilter(false), new OrganizationFilter(), new RepositoriesFilter(3), new Separator(), new SortFilter()));
    public static final ArrayList c = b(d0.b(new PullRequestStatusFilter(), new ReviewRequestedFilter(false), new AssigneeFilter(), new Separator(), new SortFilter()));
    public static final ArrayList d = d0.b(new IssueStatusFilter(), new LabelFilter(), new IssueTypeFilter(null), new AuthorFilter(null), new AssigneeFilter(), new ProjectFilter(), new MilestoneFilter(), new Separator(), new SortFilter());
    public static final ArrayList e = b(d0.b(new PullRequestStatusFilter(), new IsDraftFilter(false), new LabelFilter(), new AuthorFilter(null), new AssigneeFilter(), new ProjectFilter(), new MilestoneFilter(), new ReviewStatusFilter(ReviewStatusFilter.x), new Separator(), new SortFilter()));
    public static final ArrayList f = d0.b(new DiscussionStatusFilter(), new DiscussionUserRelationshipFilter(DiscussionUserRelationshipFilter.x), new DiscussionsIsUnansweredFilter(false), new Separator(), new DiscussionsTopFilter());
    public static final ArrayList g = d0.b(new ProjectScopeFilter(ProjectScopeFilter.x), new ProjectStatusFilter(ProjectStatusFilter.x), new Separator(), new ProjectOrderFilter(ProjectOrderFilter.x));
    public static final ArrayList h = d0.b(new RepositoryTypeFilter());
    public static final ArrayList i = d0.b(new AgentTasksStateFilter(AgentTasksStateFilter.y), new Separator(), new AgentTasksSortFilter(AgentTasksSortFilter.x));
    public static final ArrayList j = d0.b(new RepositoryTypeFilter(), new LanguageFilter(null), new RepositorySortFilter());

    public static ArrayList a(DiscussionCategoryData discussionCategoryData) {
        y61.b i2 = d0.i();
        i2.add(new DiscussionStatusFilter());
        i2.add(new AuthorFilter(null));
        i2.add(new DiscussionCategoryFilter(discussionCategoryData != null ? d0.n(discussionCategoryData) : x61.rShadow.r));
        i2.add(new LabelFilter());
        i2.add(new DiscussionsIsUnansweredFilter(false));
        i2.add(new Separator());
        i2.add(new DiscussionsTopFilter());
        return new ArrayList((Collection) d0.h(i2));
    }

    public static ArrayList b(ArrayList arrayList) {
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.P;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar)) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!(((com.github.domain.searchandfilter.filters.data.d) obj) instanceof IsDraftFilter)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static ArrayList c(com.github.service.models.response.shortcuts.a aVar, ShortcutType shortcutType) {
        k71.k.g(aVar, "scope");
        k71.k.g(shortcutType, "type");
        if (aVar instanceof ShortcutScope.AllRepositories) {
            int i2 = d.a[shortcutType.ordinal()];
            if (i2 == 1) {
                return d(x.r);
            }
            if (i2 == 2) {
                return e(h0.r);
            }
            if (i2 == 3) {
                return f;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(aVar instanceof ShortcutScope.SpecificRepository)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = d.a[shortcutType.ordinal()];
            if (i3 == 1) {
                return d;
            }
            if (i3 == 2) {
                return e;
            }
            if (i3 == 3) {
                return a(null);
            }
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return h;
    }

    public static ArrayList d(x xVar) {
        IssueStatusFilter issueStatusFilter = new IssueStatusFilter();
        IssueUserRelationshipFilter issueUserRelationshipFilter = new IssueUserRelationshipFilter(xVar);
        RepositoryVisibilityFilter repositoryVisibilityFilter = new RepositoryVisibilityFilter();
        OrganizationFilter organizationFilter = new OrganizationFilter();
        i0 i0Var = i0.r;
        return d0.b(issueStatusFilter, issueUserRelationshipFilter, repositoryVisibilityFilter, organizationFilter, new RepositoriesFilter(1), new Separator(), new SortFilter());
    }

    public static ArrayList e(h0 h0Var) {
        return b(d0.b(new PullRequestStatusFilter(), new IsDraftFilter(false), new PullRequestUserRelationshipFilter(h0Var), new RepositoryVisibilityFilter(), new OrganizationFilter(), new RepositoriesFilter(3), new Separator(), new SortFilter()));
    }

    public static ArrayList f(String str, ArrayList arrayList, c cVar) {
        k71.k.g(arrayList, "defaultFilterSet");
        k71.k.g(cVar, "destinationType");
        List list = cVar.r;
        List list2 = u.a(str).b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            t tVar = (t) obj;
            if (!list.contains(tVar.a) && !list.contains(tVar.b)) {
                arrayList2.add(obj);
            }
        }
        ArrayList H0 = x61.m.H0(arrayList2);
        List<com.github.domain.searchandfilter.filters.data.d> r0 = x61.m.r0(arrayList);
        ArrayList arrayList3 = new ArrayList(x61.n.F(r0, 10));
        for (com.github.domain.searchandfilter.filters.data.d dVar : r0) {
            com.github.domain.searchandfilter.filters.data.dShadow j2 = dVar.j(H0, true);
            if (j2 != null) {
                dVar = j2;
            }
            arrayList3.add(dVar);
        }
        ArrayList arrayList4 = new ArrayList(x61.n.F(H0, 10));
        int size = H0.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = H0.get(i2);
            i2++;
            arrayList4.add(new CustomFilter(((t) obj2).a));
        }
        Set J0 = x61.m.J0(arrayList3);
        x61.m.J(J0, arrayList4);
        return (ArrayList) x61.m.r0(J0);
    }


}
