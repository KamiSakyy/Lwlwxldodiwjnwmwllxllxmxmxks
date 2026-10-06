package bm;

import com.github.domain.searchandfilter.filters.data.AgentTasksSortFilter;
import com.github.domain.searchandfilter.filters.data.AgentTasksSortFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.AssigneeFilter;
import com.github.domain.searchandfilter.filters.data.AssigneeFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.AuthorFilter;
import com.github.domain.searchandfilter.filters.data.AuthorFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.CustomFilter;
import com.github.domain.searchandfilter.filters.data.CustomFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.CustomInstructionsFilter;
import com.github.domain.searchandfilter.filters.data.CustomInstructionsFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.DiscussionsIsUnansweredFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsIsUnansweredFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.DiscussionsTopFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsTopFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.IsDraftFilter;
import com.github.domain.searchandfilter.filters.data.IsDraftFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.IssueStatusFilter;
import com.github.domain.searchandfilter.filters.data.IssueStatusFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.IssueTypeFilter;
import com.github.domain.searchandfilter.filters.data.IssueTypeFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.IssueUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.IssueUserRelationshipFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.LabelFilter;
import com.github.domain.searchandfilter.filters.data.LabelFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.LanguageFilter;
import com.github.domain.searchandfilter.filters.data.LanguageFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.MilestoneFilter;
import com.github.domain.searchandfilter.filters.data.MilestoneFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.NotificationFilterFilter;
import com.github.domain.searchandfilter.filters.data.NotificationFilterFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.NotificationIsUnreadFilter;
import com.github.domain.searchandfilter.filters.data.NotificationIsUnreadFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.NotificationRepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.NotificationRepositoriesFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.OrganizationFilter;
import com.github.domain.searchandfilter.filters.data.OrganizationFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.ProjectFilter;
import com.github.domain.searchandfilter.filters.data.ProjectFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.ProjectOrderFilter;
import com.github.domain.searchandfilter.filters.data.ProjectOrderFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.ProjectScopeFilter;
import com.github.domain.searchandfilter.filters.data.ProjectScopeFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.ProjectStatusFilter;
import com.github.domain.searchandfilter.filters.data.ProjectStatusFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.PullRequestStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestStatusFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.PullRequestUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestUserRelationshipFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.RepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.RepositoriesFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.RepositoryOwnerRepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryOwnerRepositoriesFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.RepositorySortFilter;
import com.github.domain.searchandfilter.filters.data.RepositorySortFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.RepositoryTypeFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryTypeFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.RepositoryVisibilityFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryVisibilityFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.ReviewRequestedFilter;
import com.github.domain.searchandfilter.filters.data.ReviewRequestedFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.ReviewStatusFilter;
import com.github.domain.searchandfilter.filters.data.ReviewStatusFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.Separator;
import com.github.domain.searchandfilter.filters.data.Separator$$serializer;
import com.github.domain.searchandfilter.filters.data.SortFilter;
import com.github.domain.searchandfilter.filters.data.SortFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.SpokenLanguageFilter;
import com.github.domain.searchandfilter.filters.data.SpokenLanguageFilter$$serializer;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Done;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Inbox;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Saved;
import com.github.domain.searchandfilter.filters.data.TrendingPeriodFilter;
import com.github.domain.searchandfilter.filters.data.TrendingPeriodFilter$$serializer;
import com.github.rudroid.common.d0;
import com.github.rudroid.common.e0;
import com.github.service.models.response.LegacyProjectWithNumber$;
import com.github.service.models.response.organizations.Organization$;
import java.lang.annotation.Annotation;
import k71.xShadow;
import k81.c1Shadow;
import k81.z;
import kotlinx.serialization.KSerializer;
import yz0.k2;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class i implements j71.a {
    public final /* synthetic */ int r;

    public /* synthetic */ i(int i) {
        this.r = i;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                DiscussionsTopFilter.Companion companion = DiscussionsTopFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 1:
                DiscussionsTopFilter.Companion companion2 = DiscussionsTopFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.DiscussionsTopFilter.Value", j.values());
            case 2:
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 3:
                return new g81.d("com.github.domain.searchandfilter.filters.data.Filter", x.a(com.github.domain.searchandfilter.filters.data.dShadow.class), new r71.b[]{x.a(AgentTasksSortFilter.class), x.a(AgentTasksStateFilter.class), x.a(AssigneeFilter.class), x.a(AuthorFilter.class), x.a(CustomFilter.class), x.a(CustomInstructionsFilter.class), x.a(DiscussionCategoryFilter.class), x.a(DiscussionStatusFilter.class), x.a(DiscussionUserRelationshipFilter.class), x.a(DiscussionsIsUnansweredFilter.class), x.a(DiscussionsTopFilter.class), x.a(IsDraftFilter.class), x.a(IssueStatusFilter.class), x.a(IssueTypeFilter.class), x.a(IssueUserRelationshipFilter.class), x.a(LabelFilter.class), x.a(LanguageFilter.class), x.a(MilestoneFilter.class), x.a(NotificationFilterFilter.class), x.a(NotificationImportantFilter.class), x.a(NotificationIsUnreadFilter.class), x.a(NotificationRepositoriesFilter.class), x.a(OrganizationFilter.class), x.a(ProjectFilter.class), x.a(ProjectOrderFilter.class), x.a(ProjectScopeFilter.class), x.a(ProjectStatusFilter.class), x.a(PullRequestStatusFilter.class), x.a(PullRequestUserRelationshipFilter.class), x.a(RepositoriesFilter.class), x.a(RepositoryOwnerRepositoriesFilter.class), x.a(RepositorySortFilter.class), x.a(RepositoryTypeFilter.class), x.a(RepositoryVisibilityFilter.class), x.a(ReviewRequestedFilter.class), x.a(ReviewStatusFilter.class), x.a(Separator.class), x.a(SortFilter.class), x.a(SpokenLanguageFilter.class), x.a(StatusFilter$Done.class), x.a(StatusFilter$Inbox.class), x.a(StatusFilter$Saved.class), x.a(TrendingPeriodFilter.class)}, new KSerializer[]{AgentTasksSortFilter$$serializer.INSTANCE, AgentTasksStateFilter$$serializer.INSTANCE, AssigneeFilter$$serializer.INSTANCE, AuthorFilter$$serializer.INSTANCE, CustomFilter$$serializer.INSTANCE, CustomInstructionsFilter$$serializer.INSTANCE, DiscussionCategoryFilter$$serializer.INSTANCE, DiscussionStatusFilter$$serializer.INSTANCE, DiscussionUserRelationshipFilter$$serializer.INSTANCE, DiscussionsIsUnansweredFilter$$serializer.INSTANCE, DiscussionsTopFilter$$serializer.INSTANCE, IsDraftFilter$$serializer.INSTANCE, IssueStatusFilter$$serializer.INSTANCE, IssueTypeFilter$$serializer.INSTANCE, IssueUserRelationshipFilter$$serializer.INSTANCE, LabelFilter$$serializer.INSTANCE, LanguageFilter$$serializer.INSTANCE, MilestoneFilter$$serializer.INSTANCE, NotificationFilterFilter$$serializer.INSTANCE, NotificationImportantFilter$$serializer.INSTANCE, NotificationIsUnreadFilter$$serializer.INSTANCE, NotificationRepositoriesFilter$$serializer.INSTANCE, OrganizationFilter$$serializer.INSTANCE, ProjectFilter$$serializer.INSTANCE, ProjectOrderFilter$$serializer.INSTANCE, ProjectScopeFilter$$serializer.INSTANCE, ProjectStatusFilter$$serializer.INSTANCE, PullRequestStatusFilter$$serializer.INSTANCE, PullRequestUserRelationshipFilter$$serializer.INSTANCE, RepositoriesFilter$$serializer.INSTANCE, RepositoryOwnerRepositoriesFilter$$serializer.INSTANCE, RepositorySortFilter$$serializer.INSTANCE, RepositoryTypeFilter$$serializer.INSTANCE, RepositoryVisibilityFilter$$serializer.INSTANCE, ReviewRequestedFilter$$serializer.INSTANCE, ReviewStatusFilter$$serializer.INSTANCE, Separator$$serializer.INSTANCE, SortFilter$$serializer.INSTANCE, SpokenLanguageFilter$$serializer.INSTANCE, new z("com.github.domain.searchandfilter.filters.data.StatusFilter.Done", StatusFilter$Done.INSTANCE, new Annotation[0]), new z("com.github.domain.searchandfilter.filters.data.StatusFilter.Inbox", StatusFilter$Inbox.INSTANCE, new Annotation[0]), new z("com.github.domain.searchandfilter.filters.data.StatusFilter.Saved", StatusFilter$Saved.INSTANCE, new Annotation[0]), TrendingPeriodFilter$$serializer.INSTANCE}, new Annotation[0]);
            case 4:
                IsDraftFilter.Companion companion3 = IsDraftFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 5:
                IssueStatusFilter.Companion companion4 = IssueStatusFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 6:
                IssueStatusFilter.Companion companion5 = IssueStatusFilter.Companion;
                return c1.f("com.github.rudroid.common.IssueStatus", com.github.rudroid.common.w.values());
            case 7:
                IssueTypeFilter.Companion companion6 = IssueTypeFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 8:
                IssueUserRelationshipFilter.Companion companion7 = IssueUserRelationshipFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 9:
                IssueUserRelationshipFilter.Companion companion8 = IssueUserRelationshipFilter.Companion;
                return c1.f("com.github.rudroid.common.IssueUserRelationship", com.github.rudroid.common.x.values());
            case 10:
                LabelFilter.Companion companion9 = LabelFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 11:
                LabelFilter.Companion companion10 = LabelFilter.Companion;
                return new k81.d(new g81.b(x.a(k2.class), new Annotation[0]), 0);
            case 12:
                LanguageFilter.Companion companion11 = LanguageFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 13:
                MilestoneFilter.Companion companion12 = MilestoneFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 14:
                MilestoneFilter.Companion companion13 = MilestoneFilter.Companion;
                return new k81.d(new g81.b(x.a(v2.class), new Annotation[0]), 0);
            case 15:
                NotificationFilterFilter.Companion companion14 = NotificationFilterFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 16:
                NotificationFilterFilter.Companion companion15 = NotificationFilterFilter.Companion;
                return com.github.domain.searchandfilter.filters.data.notification.a.Companion.serializer();
            case 17:
                NotificationImportantFilter.Companion companion16 = NotificationImportantFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 18:
                NotificationIsUnreadFilter.Companion companion17 = NotificationIsUnreadFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 19:
                NotificationRepositoriesFilter.Companion companion18 = NotificationRepositoriesFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 20:
                NotificationRepositoriesFilter.Companion companion19 = NotificationRepositoriesFilter.Companion;
                return new k81.d(com.github.domain.searchandfilter.filters.data.notification.a.Companion.serializer(), 0);
            case 21:
                OrganizationFilter.Companion companion20 = OrganizationFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 22:
                OrganizationFilter.Companion companion21 = OrganizationFilter.Companion;
                return new k81.d(Organization$.serializer.INSTANCE, 0);
            case 23:
                ProjectFilter.Companion companion22 = ProjectFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 24:
                ProjectFilter.Companion companion23 = ProjectFilter.Companion;
                return new k81.d(LegacyProjectWithNumber$.serializer.INSTANCE, 0);
            case 25:
                ProjectOrderFilter.Companion companion24 = ProjectOrderFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 26:
                ProjectOrderFilter.Companion companion25 = ProjectOrderFilter.Companion;
                return c1.f("com.github.rudroid.common.ProjectOrder", d0.values());
            case 27:
                ProjectScopeFilter.Companion companion26 = ProjectScopeFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 28:
                ProjectScopeFilter.Companion companion27 = ProjectScopeFilter.Companion;
                return c1.f("com.github.rudroid.common.ProjectScope", e0.values());
            default:
                ProjectStatusFilter.Companion companion28 = ProjectStatusFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
        }
    }
}
