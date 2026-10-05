package bm;

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
import com.github.domain.searchandfilter.filters.data.StatusFilter$Done;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Inbox;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Saved;
import com.github.domain.searchandfilter.filters.data.TrendingPeriodFilter;
import com.github.rudroid.common.f0;
import com.github.rudroid.common.g0;
import com.github.rudroid.common.h0;
import com.github.rudroid.common.i0;
import com.github.rudroid.common.j0;
import com.github.rudroid.common.k0;
import com.github.rudroid.common.m0;
import com.github.service.models.response.SimpleRepository$;
import com.github.service.models.response.TrendingPeriod;
import java.lang.annotation.Annotation;
import k71.x;
import k81.c1;
import k81.z;
import kotlinx.serialization.KSerializer;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class p implements j71.a {
    public final /* synthetic */ int r;

    public final Object a() {
        switch (this.r) {
            case 0:
                ProjectStatusFilter.Companion companion = ProjectStatusFilter.Companion;
                return c1.f("com.github.rudroid.common.ProjectStatus", f0.values());
            case 1:
                PullRequestStatusFilter.Companion companion2 = PullRequestStatusFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 2:
                PullRequestStatusFilter.Companion companion3 = PullRequestStatusFilter.Companion;
                return c1.f("com.github.rudroid.common.PullRequestStatus", g0.values());
            case 3:
                PullRequestUserRelationshipFilter.Companion companion4 = PullRequestUserRelationshipFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 4:
                PullRequestUserRelationshipFilter.Companion companion5 = PullRequestUserRelationshipFilter.Companion;
                return c1.f("com.github.rudroid.common.PullRequestUserRelationship", h0.values());
            case 5:
                RepositoriesFilter.Companion companion6 = RepositoriesFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 6:
                RepositoriesFilter.Companion companion7 = RepositoriesFilter.Companion;
                return new k81.d(SimpleRepository$.serializer.INSTANCE, 0);
            case 7:
                RepositoriesFilter.Companion companion8 = RepositoriesFilter.Companion;
                return c1.f("com.github.rudroid.common.RepositoryFilter", i0.values());
            case 8:
                RepositoryOwnerRepositoriesFilter.Companion companion9 = RepositoryOwnerRepositoriesFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 9:
                RepositoryOwnerRepositoriesFilter.Companion companion10 = RepositoryOwnerRepositoriesFilter.Companion;
                return new k81.d(SimpleRepository$.serializer.INSTANCE, 0);
            case 10:
                RepositorySortFilter.Companion companion11 = RepositorySortFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 11:
                RepositorySortFilter.Companion companion12 = RepositorySortFilter.Companion;
                return c1.f("com.github.service.repository.filter.RepositorySortOrder", v01.c.values());
            case 12:
                RepositoryTypeFilter.Companion companion13 = RepositoryTypeFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 13:
                RepositoryTypeFilter.Companion companion14 = RepositoryTypeFilter.Companion;
                return c1.f("com.github.service.repository.filter.RepositoryType", v01.d.values());
            case 14:
                RepositoryVisibilityFilter.Companion companion15 = RepositoryVisibilityFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 15:
                RepositoryVisibilityFilter.Companion companion16 = RepositoryVisibilityFilter.Companion;
                return c1.f("com.github.rudroid.common.RepositoryVisibility", j0.values());
            case 16:
                ReviewRequestedFilter.Companion companion17 = ReviewRequestedFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 17:
                ReviewStatusFilter.Companion companion18 = ReviewStatusFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 18:
                ReviewStatusFilter.Companion companion19 = ReviewStatusFilter.Companion;
                return c1.f("com.github.rudroid.common.ReviewStatus", k0.values());
            case 19:
                Separator.Companion companion20 = Separator.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 20:
                SortFilter.Companion companion21 = SortFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 21:
                SortFilter.Companion companion22 = SortFilter.Companion;
                return c1.f("com.github.rudroid.common.SearchFilterSort", m0.values());
            case 22:
                SpokenLanguageFilter.Companion companion23 = SpokenLanguageFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 23:
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            case 24:
                return new g81.d("com.github.domain.searchandfilter.filters.data.StatusFilter", x.a(com.github.domain.searchandfilter.filters.data.i.class), new r71.b[]{x.a(StatusFilter$Done.class), x.a(StatusFilter$Inbox.class), x.a(StatusFilter$Saved.class)}, new KSerializer[]{new z("com.github.domain.searchandfilter.filters.data.StatusFilter.Done", StatusFilter$Done.INSTANCE, new Annotation[0]), new z("com.github.domain.searchandfilter.filters.data.StatusFilter.Inbox", StatusFilter$Inbox.INSTANCE, new Annotation[0]), new z("com.github.domain.searchandfilter.filters.data.StatusFilter.Saved", StatusFilter$Saved.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 25:
                return new z("com.github.domain.searchandfilter.filters.data.StatusFilter.Done", StatusFilter$Done.INSTANCE, new Annotation[0]);
            case 26:
                return new z("com.github.domain.searchandfilter.filters.data.StatusFilter.Inbox", StatusFilter$Inbox.INSTANCE, new Annotation[0]);
            case 27:
                return new z("com.github.domain.searchandfilter.filters.data.StatusFilter.Saved", StatusFilter$Saved.INSTANCE, new Annotation[0]);
            case 28:
                TrendingPeriodFilter.Companion companion24 = TrendingPeriodFilter.Companion;
                return c1.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values());
            default:
                TrendingPeriodFilter.Companion companion25 = TrendingPeriodFilter.Companion;
                return TrendingPeriod.Companion.serializer();
        }
    }
}
