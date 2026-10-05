package com.github.rudroid.searchandfilter.ui;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.a1;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.domain.searchandfilter.filters.data.AssigneeFilter;
import com.github.domain.searchandfilter.filters.data.AuthorFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter;
import com.github.domain.searchandfilter.filters.data.LabelFilter;
import com.github.domain.searchandfilter.filters.data.MilestoneFilter;
import com.github.domain.searchandfilter.filters.data.ProjectFilter;
import com.github.rudroid.createissue.propertybar.projects.PropertyBarProjectsHostBottomSheetDialog;
import com.github.rudroid.searchandfilter.complexfilter.b;
import com.github.rudroid.searchandfilter.complexfilter.category.SelectableDiscussionCategoryBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.k;
import com.github.rudroid.searchandfilter.complexfilter.label.SelectableLabelBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.milestone.SelectableMilestoneBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.project.SelectableProjectsBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.user.assignee.RepositoryAssigneesBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.user.author.RepositoryAuthorBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.user.o;
import com.github.service.models.response.LegacyProjectWithNumber;
import java.util.List;
import yz0.k2;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class m implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ a1 v;
    public final /* synthetic */ com.github.domain.searchandfilter.filters.data.d w;

    public /* synthetic */ m(com.github.domain.searchandfilter.filters.data.e eVar, String str, String str2, boolean z, a1 a1Var) {
        this.r = 5;
        this.w = eVar;
        this.s = str;
        this.t = str2;
        this.u = z;
        this.v = a1Var;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                AssigneeFilter assigneeFilter = (AssigneeFilter) this.w;
                RepositoryAssigneesBottomSheet.a aVar = RepositoryAssigneesBottomSheet.Companion;
                List list = assigneeFilter.v;
                aVar.getClass();
                String str = this.s;
                k71.k.g(str, "owner");
                String str2 = this.t;
                k71.k.g(str2, "repository");
                k71.k.g(list, "preselected");
                RepositoryAssigneesBottomSheet repositoryAssigneesBottomSheet = new RepositoryAssigneesBottomSheet();
                com.github.rudroid.searchandfilter.complexfilter.user.o.Companion.getClass();
                Bundle a = o.a.a(str, str2, list);
                a.putBoolean("EXTRA_IS_ACTIVITY_HOSTED", this.u);
                repositoryAssigneesBottomSheet.n4(a);
                repositoryAssigneesBottomSheet.z4(this.v, (String) null);
                break;
            case 1:
                MilestoneFilter milestoneFilter = (MilestoneFilter) this.w;
                SelectableMilestoneBottomSheet.a aVar2 = SelectableMilestoneBottomSheet.Companion;
                List list2 = milestoneFilter.v;
                aVar2.getClass();
                String str3 = this.s;
                k71.k.g(str3, "owner");
                String str4 = this.t;
                k71.k.g(str4, "repository");
                k71.k.g(list2, "preselected");
                SelectableMilestoneBottomSheet selectableMilestoneBottomSheet = new SelectableMilestoneBottomSheet();
                com.github.rudroid.searchandfilter.complexfilter.milestone.g.Companion.getClass();
                Bundle bundle = new Bundle();
                k.a aVar3 = com.github.rudroid.searchandfilter.complexfilter.k.Companion;
                Parcelable[] parcelableArr = (Parcelable[]) list2.toArray(new v2[0]);
                aVar3.getClass();
                k.a.a(parcelableArr, bundle);
                bundle.putString("SelectableMilestoneSearchViewModel key_owner", str3);
                bundle.putString("SelectableMilestoneSearchViewModel key_repository", str4);
                bundle.putBoolean("EXTRA_IS_ACTIVITY_HOSTED", this.u);
                selectableMilestoneBottomSheet.n4(bundle);
                selectableMilestoneBottomSheet.z4(this.v, (String) null);
                break;
            case 2:
                LabelFilter labelFilter = (LabelFilter) this.w;
                SelectableLabelBottomSheet.a aVar4 = SelectableLabelBottomSheet.Companion;
                List list3 = labelFilter.v;
                aVar4.getClass();
                String str5 = this.s;
                k71.k.g(str5, "owner");
                String str6 = this.t;
                k71.k.g(str6, "repository");
                k71.k.g(list3, "preselected");
                SelectableLabelBottomSheet selectableLabelBottomSheet = new SelectableLabelBottomSheet();
                com.github.rudroid.searchandfilter.complexfilter.label.g.Companion.getClass();
                Bundle bundle2 = new Bundle();
                k.a aVar5 = com.github.rudroid.searchandfilter.complexfilter.k.Companion;
                Parcelable[] parcelableArr2 = (Parcelable[]) list3.toArray(new k2[0]);
                aVar5.getClass();
                k.a.a(parcelableArr2, bundle2);
                bundle2.putString("SelectableLabelSearchViewModel key_owner", str5);
                bundle2.putString("SelectableLabelSearchViewModel key_repository", str6);
                bundle2.putBoolean("EXTRA_IS_ACTIVITY_HOSTED", this.u);
                selectableLabelBottomSheet.n4(bundle2);
                selectableLabelBottomSheet.z4(this.v, (String) null);
                break;
            case 3:
                ProjectFilter projectFilter = (ProjectFilter) this.w;
                SelectableProjectsBottomSheet.a aVar6 = SelectableProjectsBottomSheet.Companion;
                List list4 = projectFilter.v;
                aVar6.getClass();
                String str7 = this.s;
                k71.k.g(str7, "owner");
                String str8 = this.t;
                k71.k.g(str8, "repository");
                k71.k.g(list4, "preselected");
                SelectableProjectsBottomSheet selectableProjectsBottomSheet = new SelectableProjectsBottomSheet();
                com.github.rudroid.searchandfilter.complexfilter.project.q.Companion.getClass();
                Bundle bundle3 = new Bundle();
                k.a aVar7 = com.github.rudroid.searchandfilter.complexfilter.k.Companion;
                Parcelable[] parcelableArr3 = (Parcelable[]) list4.toArray(new LegacyProjectWithNumber[0]);
                aVar7.getClass();
                k.a.a(parcelableArr3, bundle3);
                bundle3.putString("SelectableProjectSearchBundle key_owner", str7);
                bundle3.putString("SelectableProjectSearchBundle key_repository", str8);
                bundle3.putBoolean("EXTRA_IS_ACTIVITY_HOSTED", this.u);
                selectableProjectsBottomSheet.n4(bundle3);
                selectableProjectsBottomSheet.z4(this.v, (String) null);
                break;
            case 4:
                AuthorFilter authorFilter = (AuthorFilter) this.w;
                RepositoryAuthorBottomSheet.a aVar8 = RepositoryAuthorBottomSheet.Companion;
                yz0.f fVar = authorFilter.v;
                aVar8.getClass();
                String str9 = this.s;
                k71.k.g(str9, "owner");
                String str10 = this.t;
                k71.k.g(str10, "repository");
                RepositoryAuthorBottomSheet repositoryAuthorBottomSheet = new RepositoryAuthorBottomSheet();
                o.a aVar9 = com.github.rudroid.searchandfilter.complexfilter.user.o.Companion;
                List n = fVar != null ? sy.d0.n(fVar) : x61.r.r;
                aVar9.getClass();
                Bundle a2 = o.a.a(str9, str10, n);
                a2.putBoolean("EXTRA_IS_ACTIVITY_HOSTED", this.u);
                repositoryAuthorBottomSheet.n4(a2);
                repositoryAuthorBottomSheet.z4(this.v, (String) null);
                break;
            case 5:
                com.github.domain.searchandfilter.filters.data.e eVar = (com.github.domain.searchandfilter.filters.data.e) this.w;
                PropertyBarProjectsHostBottomSheetDialog.a aVar10 = PropertyBarProjectsHostBottomSheetDialog.Companion;
                List list5 = eVar.v;
                aVar10.getClass();
                String str11 = this.s;
                k71.k.g(str11, "repositoryOwner");
                String str12 = this.t;
                k71.k.g(str12, "repositoryName");
                k71.k.g(list5, "projects");
                PropertyBarProjectsHostBottomSheetDialog propertyBarProjectsHostBottomSheetDialog = new PropertyBarProjectsHostBottomSheetDialog();
                r71.e[] eVarArr = PropertyBarProjectsHostBottomSheetDialog.Z0;
                propertyBarProjectsHostBottomSheetDialog.V0.b(propertyBarProjectsHostBottomSheetDialog, eVarArr[0], list5);
                propertyBarProjectsHostBottomSheetDialog.W0.b(propertyBarProjectsHostBottomSheetDialog, eVarArr[1], str11);
                propertyBarProjectsHostBottomSheetDialog.X0.b(propertyBarProjectsHostBottomSheetDialog, eVarArr[2], str12);
                propertyBarProjectsHostBottomSheetDialog.Y0.b(propertyBarProjectsHostBottomSheetDialog, eVarArr[3], Boolean.valueOf(this.u));
                propertyBarProjectsHostBottomSheetDialog.z4(this.v, (String) null);
                break;
            default:
                DiscussionCategoryFilter discussionCategoryFilter = (DiscussionCategoryFilter) this.w;
                SelectableDiscussionCategoryBottomSheet.a aVar11 = SelectableDiscussionCategoryBottomSheet.Companion;
                List list6 = discussionCategoryFilter.v;
                aVar11.getClass();
                String str13 = this.s;
                k71.k.g(str13, "owner");
                String str14 = this.t;
                k71.k.g(str14, "repository");
                k71.k.g(list6, "preselected");
                SelectableDiscussionCategoryBottomSheet selectableDiscussionCategoryBottomSheet = new SelectableDiscussionCategoryBottomSheet();
                com.github.rudroid.searchandfilter.complexfilter.category.i.Companion.getClass();
                Bundle bundle4 = new Bundle();
                b.a aVar12 = com.github.rudroid.searchandfilter.complexfilter.b.Companion;
                Parcelable[] parcelableArr4 = (Parcelable[]) list6.toArray(new DiscussionCategoryData[0]);
                aVar12.getClass();
                k71.k.g(parcelableArr4, "preselected");
                bundle4.putParcelableArray("BaseLocalSearchViewModel_key_preselected", parcelableArr4);
                bundle4.putString("SelectableDiscussionCategorySearchViewModel key_owner", str13);
                bundle4.putString("SelectableDiscussionCategorySearchViewModel key_repository", str14);
                bundle4.putBoolean("EXTRA_IS_ACTIVITY_HOSTED", this.u);
                selectableDiscussionCategoryBottomSheet.n4(bundle4);
                selectableDiscussionCategoryBottomSheet.z4(this.v, (String) null);
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ m(String str, String str2, com.github.domain.searchandfilter.filters.data.d dVar, boolean z, a1 a1Var, int i) {
        this.r = i;
        this.s = str;
        this.t = str2;
        this.w = dVar;
        this.u = z;
        this.v = a1Var;
    }
}
