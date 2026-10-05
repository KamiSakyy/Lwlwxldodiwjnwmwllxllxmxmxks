package fk;

import bm.l;
import com.github.domain.searchandfilter.filters.data.AgentTasksSortFilter;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter;
import com.github.domain.searchandfilter.filters.data.AssigneeFilter;
import com.github.domain.searchandfilter.filters.data.AuthorFilter;
import com.github.domain.searchandfilter.filters.data.CustomFilter;
import com.github.domain.searchandfilter.filters.data.CustomInstructionsFilter;
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
import com.github.domain.searchandfilter.filters.data.NotificationFilterFilter;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
import com.github.domain.searchandfilter.filters.data.NotificationIsUnreadFilter;
import com.github.domain.searchandfilter.filters.data.NotificationRepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.OrganizationFilter;
import com.github.domain.searchandfilter.filters.data.ProjectFilter;
import com.github.domain.searchandfilter.filters.data.ProjectOrderFilter;
import com.github.domain.searchandfilter.filters.data.ProjectScopeFilter;
import com.github.domain.searchandfilter.filters.data.ProjectStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.RepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryOwnerRepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.RepositorySortFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryTypeFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryVisibilityFilter;
import com.github.domain.searchandfilter.filters.data.ReviewRequestedFilter;
import com.github.domain.searchandfilter.filters.data.ReviewStatusFilter;
import com.github.domain.searchandfilter.filters.data.Separator;
import com.github.domain.searchandfilter.filters.data.SortFilter;
import com.github.domain.searchandfilter.filters.data.SpokenLanguageFilter;
import com.github.domain.searchandfilter.filters.data.TrendingPeriodFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import w61.k;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final ArrayList a(List list) {
        com.github.domain.searchandfilter.filters.data.d dVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            try {
                dVar = b((l) kVar.r).l((String) kVar.s);
            } catch (Exception unused) {
                Object obj = kVar.r;
                Object obj2 = kVar.s;
                Objects.toString(obj);
                Objects.toString(obj2);
                dVar = null;
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public static final bm.k b(l lVar) {
        switch (lVar.ordinal()) {
            case 0:
                AssigneeFilter.Companion.getClass();
                return AssigneeFilter.x;
            case 1:
                SortFilter.Companion.getClass();
                return SortFilter.y;
            case 2:
                PullRequestStatusFilter.Companion.getClass();
                return PullRequestStatusFilter.y;
            case 3:
                DiscussionsIsUnansweredFilter.Companion.getClass();
                return DiscussionsIsUnansweredFilter.x;
            case 4:
                ProjectFilter.Companion.getClass();
                return ProjectFilter.x;
            case 5:
                com.github.domain.searchandfilter.filters.data.e.Companion.getClass();
                return com.github.domain.searchandfilter.filters.data.e.w;
            case 6:
                LabelFilter.Companion.getClass();
                return LabelFilter.x;
            case 7:
                MilestoneFilter.Companion.getClass();
                return MilestoneFilter.x;
            case 8:
                Separator.Companion.getClass();
                return Separator.x;
            case 9:
                IssueStatusFilter.Companion.getClass();
                return IssueStatusFilter.y;
            case 10:
                IssueTypeFilter.Companion.getClass();
                return IssueTypeFilter.x;
            case 11:
                PullRequestUserRelationshipFilter.Companion.getClass();
                return PullRequestUserRelationshipFilter.y;
            case 12:
                ReviewRequestedFilter.Companion.getClass();
                return ReviewRequestedFilter.x;
            case 13:
                IssueUserRelationshipFilter.Companion.getClass();
                return IssueUserRelationshipFilter.y;
            case 14:
                RepositoriesFilter.Companion.getClass();
                return RepositoriesFilter.y;
            case 15:
                RepositoryOwnerRepositoriesFilter.Companion.getClass();
                return RepositoryOwnerRepositoriesFilter.x;
            case 16:
                RepositoryVisibilityFilter.Companion.getClass();
                return RepositoryVisibilityFilter.y;
            case 17:
                AuthorFilter.Companion.getClass();
                return AuthorFilter.x;
            case 18:
                OrganizationFilter.Companion.getClass();
                return OrganizationFilter.x;
            case 19:
                ReviewStatusFilter.Companion.getClass();
                return ReviewStatusFilter.y;
            case 20:
                DiscussionCategoryFilter.Companion.getClass();
                return DiscussionCategoryFilter.x;
            case 21:
                DiscussionUserRelationshipFilter.Companion.getClass();
                return DiscussionUserRelationshipFilter.y;
            case 22:
                DiscussionsTopFilter.Companion.getClass();
                return DiscussionsTopFilter.y;
            case 23:
                com.github.domain.searchandfilter.filters.data.i.Companion.getClass();
                return com.github.domain.searchandfilter.filters.data.i.x;
            case 24:
                NotificationIsUnreadFilter.Companion.getClass();
                return NotificationIsUnreadFilter.x;
            case 25:
                NotificationImportantFilter.Companion.getClass();
                return NotificationImportantFilter.y;
            case 26:
                NotificationFilterFilter.Companion.getClass();
                return NotificationFilterFilter.x;
            case 27:
                NotificationRepositoriesFilter.Companion.getClass();
                return NotificationRepositoriesFilter.x;
            case 28:
                CustomFilter.Companion.getClass();
                return CustomFilter.x;
            case 29:
                LanguageFilter.Companion.getClass();
                return LanguageFilter.x;
            case 30:
                SpokenLanguageFilter.Companion.getClass();
                return SpokenLanguageFilter.x;
            case 31:
                TrendingPeriodFilter.Companion.getClass();
                return TrendingPeriodFilter.y;
            case 32:
                RepositorySortFilter.Companion.getClass();
                return RepositorySortFilter.y;
            case 33:
                RepositoryTypeFilter.Companion.getClass();
                return RepositoryTypeFilter.y;
            case 34:
                DiscussionStatusFilter.Companion.getClass();
                return DiscussionStatusFilter.y;
            case 35:
                ProjectScopeFilter.Companion.getClass();
                return ProjectScopeFilter.y;
            case 36:
                ProjectStatusFilter.Companion.getClass();
                return ProjectStatusFilter.y;
            case 37:
                ProjectOrderFilter.Companion.getClass();
                return ProjectOrderFilter.y;
            case 38:
                IsDraftFilter.Companion.getClass();
                return IsDraftFilter.x;
            case 39:
                AgentTasksStateFilter.Companion.getClass();
                return AgentTasksStateFilter.z;
            case 40:
                AgentTasksSortFilter.Companion.getClass();
                return AgentTasksSortFilter.y;
            case 41:
                CustomInstructionsFilter.Companion.getClass();
                return CustomInstructionsFilter.x;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
