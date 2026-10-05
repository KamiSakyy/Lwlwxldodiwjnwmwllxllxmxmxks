package bm;

import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsTopFilter;
import com.github.domain.searchandfilter.filters.data.IssueStatusFilter;
import com.github.domain.searchandfilter.filters.data.IssueUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.ProjectScopeFilter;
import com.github.domain.searchandfilter.filters.data.ProjectStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryTypeFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryVisibilityFilter;
import com.github.domain.searchandfilter.filters.data.ReviewStatusFilter;
import com.github.domain.searchandfilter.filters.data.SortFilter;
import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ LinkedHashMap s;
    public final /* synthetic */ k71.w t;

    public /* synthetic */ g(LinkedHashMap linkedHashMap, k71.w wVar, int i) {
        this.r = i;
        this.s = linkedHashMap;
        this.t = wVar;
    }

    public final Object k(Object obj) {
        int i = this.r;
        boolean z = false;
        k71.w wVar = this.t;
        LinkedHashMap linkedHashMap = this.s;
        t tVar = (t) obj;
        switch (i) {
            case 0:
                DiscussionStatusFilter.Companion companion = DiscussionStatusFilter.Companion;
                k71.k.g(tVar, "it");
                String str = tVar.a;
                if (linkedHashMap.containsKey(str)) {
                    wVar.r = linkedHashMap.get(str);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                DiscussionUserRelationshipFilter.Companion companion2 = DiscussionUserRelationshipFilter.Companion;
                k71.k.g(tVar, "it");
                String str2 = tVar.a;
                if (linkedHashMap.containsKey(str2)) {
                    wVar.r = linkedHashMap.get(str2);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                DiscussionsTopFilter.Companion companion3 = DiscussionsTopFilter.Companion;
                k71.k.g(tVar, "it");
                String str3 = tVar.a;
                if (linkedHashMap.containsKey(str3)) {
                    wVar.r = linkedHashMap.get(str3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                IssueStatusFilter.Companion companion4 = IssueStatusFilter.Companion;
                k71.k.g(tVar, "it");
                String str4 = tVar.a;
                if (linkedHashMap.containsKey(str4)) {
                    wVar.r = linkedHashMap.get(str4);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                IssueUserRelationshipFilter.Companion companion5 = IssueUserRelationshipFilter.Companion;
                k71.k.g(tVar, "it");
                String str5 = tVar.a;
                if (linkedHashMap.containsKey(str5)) {
                    wVar.r = linkedHashMap.get(str5);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                ProjectScopeFilter.Companion companion6 = ProjectScopeFilter.Companion;
                k71.k.g(tVar, "it");
                String str6 = tVar.a;
                if (linkedHashMap.containsKey(str6)) {
                    wVar.r = linkedHashMap.get(str6);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                ProjectStatusFilter.Companion companion7 = ProjectStatusFilter.Companion;
                k71.k.g(tVar, "it");
                String str7 = tVar.a;
                if (linkedHashMap.containsKey(str7)) {
                    wVar.r = linkedHashMap.get(str7);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                PullRequestStatusFilter.Companion companion8 = PullRequestStatusFilter.Companion;
                k71.k.g(tVar, "it");
                String str8 = tVar.a;
                if (linkedHashMap.containsKey(str8)) {
                    wVar.r = linkedHashMap.get(str8);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                PullRequestUserRelationshipFilter.Companion companion9 = PullRequestUserRelationshipFilter.Companion;
                k71.k.g(tVar, "it");
                String str9 = tVar.a;
                if (linkedHashMap.containsKey(str9)) {
                    wVar.r = linkedHashMap.get(str9);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                RepositoryTypeFilter.Companion companion10 = RepositoryTypeFilter.Companion;
                k71.k.g(tVar, "it");
                String str10 = tVar.a;
                if (linkedHashMap.containsKey(str10)) {
                    wVar.r = linkedHashMap.get(str10);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                RepositoryVisibilityFilter.Companion companion11 = RepositoryVisibilityFilter.Companion;
                k71.k.g(tVar, "it");
                String str11 = tVar.a;
                if (linkedHashMap.containsKey(str11)) {
                    wVar.r = linkedHashMap.get(str11);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                ReviewStatusFilter.Companion companion12 = ReviewStatusFilter.Companion;
                k71.k.g(tVar, "it");
                String str12 = tVar.a;
                if (linkedHashMap.containsKey(str12)) {
                    wVar.r = linkedHashMap.get(str12);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                SortFilter.Companion companion13 = SortFilter.Companion;
                k71.k.g(tVar, "it");
                String str13 = tVar.a;
                if (linkedHashMap.containsKey(str13)) {
                    wVar.r = linkedHashMap.get(str13);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
