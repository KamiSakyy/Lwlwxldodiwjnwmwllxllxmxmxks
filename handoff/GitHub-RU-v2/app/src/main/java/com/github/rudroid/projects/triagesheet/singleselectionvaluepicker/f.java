package com.github.rudroid.projects.triagesheet.singleselectionvaluepicker;

import androidx.compose.runtime.t;
import com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.ProjectSelectSingleOptionFieldValuePickerBottomSheet;
import com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.ProjectSingleSelectFieldValuePickerFragment;
import com.github.rudroid.pushnotifications.CodingAgentContentState;
import com.github.rudroid.pushnotifications.SessionState;
import com.github.rudroid.repositories.RepositoriesActivity;
import com.github.rudroid.repositories.RepositoriesViewType;
import com.github.rudroid.repository.RepositoryDetailActivity;
import com.github.rudroid.repository.branches.BranchPickerWithContributeBottomSheet;
import com.github.rudroid.repository.file.RepositoryFileActivity;
import com.github.rudroid.repository.files.RepositoryFilesActivity;
import com.github.rudroid.searchandfilter.complexfilter.category.SelectableDiscussionCategoryBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.explore.SelectableLanguageBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.label.SelectableLabelBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.milestone.SelectableMilestoneBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.organization.SelectableOrganizationBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.project.SelectableProjectsBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.repository.SelectableRepositoryBottomSheet;
import e6.w;
import java.lang.annotation.Annotation;
import java.security.KeyStore;
import k71.xShadow;
import k81.c1Shadow;
import k81.z;
import kotlinx.serialization.KSerializer;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class f implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18141r;

    public /* synthetic */ f(int i) {
        this.f18141r = i;
    }

    public final Object a() {
        switch (this.f18141r) {
            case k5.f.J:
                ProjectSelectSingleOptionFieldValuePickerBottomSheet.a aVar = ProjectSelectSingleOptionFieldValuePickerBottomSheet.Companion;
                throw new IllegalStateException("itemId must be set");
            case 1:
                ProjectSelectSingleOptionFieldValuePickerBottomSheet.a aVar2 = ProjectSelectSingleOptionFieldValuePickerBottomSheet.Companion;
                throw new IllegalStateException("fieldId must be set");
            case 2:
                ProjectSelectSingleOptionFieldValuePickerBottomSheet.a aVar3 = ProjectSelectSingleOptionFieldValuePickerBottomSheet.Companion;
                throw new IllegalStateException("fieldName must be set");
            case 3:
                ProjectSelectSingleOptionFieldValuePickerBottomSheet.a aVar4 = ProjectSelectSingleOptionFieldValuePickerBottomSheet.Companion;
                throw new IllegalStateException("projectId must be set");
            case 4:
                ProjectSelectSingleOptionFieldValuePickerBottomSheet.a aVar5 = ProjectSelectSingleOptionFieldValuePickerBottomSheet.Companion;
                return null;
            case 5:
                ProjectSelectSingleOptionFieldValuePickerBottomSheet.a aVar6 = ProjectSelectSingleOptionFieldValuePickerBottomSheet.Companion;
                return rShadow.r;
            case 6:
                ProjectSingleSelectFieldValuePickerFragment.a aVar7 = ProjectSingleSelectFieldValuePickerFragment.Companion;
                throw new IllegalStateException("Options must be set");
            case 7:
                ProjectSingleSelectFieldValuePickerFragment.a aVar8 = ProjectSingleSelectFieldValuePickerFragment.Companion;
                return null;
            case 8:
                CodingAgentContentState.Companion companion = CodingAgentContentState.Companion;
                return SessionState.Companion.serializer();
            case 9:
                return c1Shadow.e("com.github.rudroid.pushnotifications.SessionState", SessionState.values(), new String[]{"queued", "in_progress", "completed", "failed", "timed_out", "cancelled", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 10:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            case w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                RepositoriesActivity.a aVar9 = RepositoriesActivity.Companion;
                return Boolean.TRUE;
            case w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                RepositoriesActivity.a aVar10 = RepositoriesActivity.Companion;
                return Boolean.FALSE;
            case 13:
                RepositoriesViewType.Companion companion2 = RepositoriesViewType.Companion;
                return new g81.d("com.github.rudroid.repositories.RepositoriesViewType", xShadow.a(RepositoriesViewType.class), new r71.b[]{xShadow.a(RepositoriesViewType.Forked.class), xShadow.a(RepositoriesViewType.Repositories.class)}, new KSerializer[]{new z("com.github.rudroid.repositories.RepositoriesViewType.Forked", RepositoriesViewType.Forked.INSTANCE, new Annotation[0]), new z("com.github.rudroid.repositories.RepositoriesViewType.Repositories", RepositoriesViewType.Repositories.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 14:
                return new z("com.github.rudroid.repositories.RepositoriesViewType.Forked", RepositoriesViewType.Forked.INSTANCE, new Annotation[0]);
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                return new z("com.github.rudroid.repositories.RepositoriesViewType.Repositories", RepositoriesViewType.Repositories.INSTANCE, new Annotation[0]);
            case 16:
                return t.B(Boolean.FALSE);
            case 17:
                return t.B(Boolean.FALSE);
            case 18:
                return t.B(Boolean.FALSE);
            case 19:
                RepositoryDetailActivity.a aVar11 = RepositoryDetailActivity.Companion;
                return null;
            case 20:
                BranchPickerWithContributeBottomSheet.a aVar12 = BranchPickerWithContributeBottomSheet.Companion;
                return "";
            case 21:
                RepositoryFileActivity.a aVar13 = RepositoryFileActivity.Companion;
                return null;
            case 22:
                RepositoryFilesActivity.a aVar14 = RepositoryFilesActivity.Companion;
                return null;
            case 23:
                SelectableDiscussionCategoryBottomSheet.a aVar15 = SelectableDiscussionCategoryBottomSheet.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            case 24:
                SelectableLanguageBottomSheet.a aVar16 = SelectableLanguageBottomSheet.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            case 25:
                SelectableLabelBottomSheet.a aVar17 = SelectableLabelBottomSheet.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            case 26:
                SelectableMilestoneBottomSheet.a aVar18 = SelectableMilestoneBottomSheet.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            case 27:
                SelectableOrganizationBottomSheet.a aVar19 = SelectableOrganizationBottomSheet.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            case 28:
                SelectableProjectsBottomSheet.a aVar20 = SelectableProjectsBottomSheet.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            default:
                SelectableRepositoryBottomSheet.a aVar21 = SelectableRepositoryBottomSheet.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
        }
    }
}
