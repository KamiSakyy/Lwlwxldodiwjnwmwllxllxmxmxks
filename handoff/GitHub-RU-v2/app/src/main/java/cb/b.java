package cb;

import androidx.compose.runtime.t;
import ch.i;
import com.github.rudroid.accounts.UserAccountsBottomSheet;
import com.github.rudroid.accounts.UserAccountsFragment;
import com.github.rudroid.achievements.UserAchievementsActivity;
import com.github.rudroid.actions.checkdetail.CheckDetailActivity;
import com.github.rudroid.actions.checklog.CheckLogActivity;
import com.github.rudroid.actions.workflowruns.dispatchworkflow.DispatchWorkflowBottomSheet;
import com.github.rudroid.actions.workflowsummary.WorkflowSummaryActivity;
import com.github.rudroid.activities.CreateIssueRepoSearchActivity;
import com.github.rudroid.activities.IssuesActivity;
import com.github.rudroid.activities.PullRequestsActivity;
import com.github.rudroid.activities.m0;
import com.github.rudroid.activities.p2;
import com.github.rudroid.agents.AgentPullRequestsActivity;
import com.github.rudroid.agents.navigation.AgentPullRequestsEntryPointRoute;
import com.github.rudroid.agents.navigation.AgentPullRequestsNavRoute;
import com.github.rudroid.agents.navigation.AgentTasksNavRoute;
import com.github.rudroid.projects.triagesheet.triagebottomsheets.TriageAssigneesFragmentHostBottomSheetDialog;
import com.github.rudroid.projects.triagesheet.triagebottomsheets.TriageLabelsFragmentHostBottomSheetDialog;
import com.github.rudroid.projects.triagesheet.triagebottomsheets.TriageLinkedItemsFragmentHostBottomSheetDialog;
import com.github.rudroid.projects.triagesheet.triagebottomsheets.TriageMilestoneFragmentHostBottomSheetDialog;
import com.github.rudroid.z;
import com.github.service.models.response.type.MobileEventContext;
import com.github.service.models.response.type.MobileSubjectType;
import e6.w;
import java.util.ArrayList;
import k5.f;
import k81.c1;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4167r;

    public final Object a() {
        switch (this.f4167r) {
            case f.J:
                AgentPullRequestsEntryPointRoute.Companion companion = AgentPullRequestsEntryPointRoute.Companion;
                return c1.f("com.github.service.models.response.type.MobileSubjectType", MobileSubjectType.values());
            case 1:
                AgentPullRequestsEntryPointRoute.Companion companion2 = AgentPullRequestsEntryPointRoute.Companion;
                return c1.f("com.github.service.models.response.type.MobileEventContext", MobileEventContext.values());
            case 2:
                AgentPullRequestsNavRoute.Companion companion3 = AgentPullRequestsNavRoute.Companion;
                return c1.f("com.github.service.models.response.type.MobileSubjectType", MobileSubjectType.values());
            case 3:
                AgentPullRequestsNavRoute.Companion companion4 = AgentPullRequestsNavRoute.Companion;
                return c1.f("com.github.service.models.response.type.MobileEventContext", MobileEventContext.values());
            case 4:
                AgentTasksNavRoute.Companion companion5 = AgentTasksNavRoute.Companion;
                return c1.f("com.github.service.models.response.type.MobileEventContext", MobileEventContext.values());
            case 5:
                TriageAssigneesFragmentHostBottomSheetDialog.a aVar = TriageAssigneesFragmentHostBottomSheetDialog.Companion;
                return null;
            case 6:
                TriageLabelsFragmentHostBottomSheetDialog.a aVar2 = TriageLabelsFragmentHostBottomSheetDialog.Companion;
                return null;
            case 7:
                TriageLinkedItemsFragmentHostBottomSheetDialog.a aVar3 = TriageLinkedItemsFragmentHostBottomSheetDialog.Companion;
                return null;
            case 8:
                TriageMilestoneFragmentHostBottomSheetDialog.a aVar4 = TriageMilestoneFragmentHostBottomSheetDialog.Companion;
                return null;
            case 9:
                return ch.c.a;
            case 10:
                return ch.f.a;
            case w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return i.a;
            case w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                return z.a();
            case 13:
                UserAccountsBottomSheet.a aVar5 = UserAccountsBottomSheet.Companion;
                return "";
            case 14:
                UserAccountsBottomSheet.a aVar6 = UserAccountsBottomSheet.Companion;
                return null;
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                UserAccountsFragment.a aVar7 = UserAccountsFragment.Companion;
                return "";
            case 16:
                UserAccountsFragment.a aVar8 = UserAccountsFragment.Companion;
                return null;
            case 17:
                UserAchievementsActivity.a aVar9 = UserAchievementsActivity.Companion;
                return null;
            case 18:
                CheckDetailActivity.a aVar10 = CheckDetailActivity.Companion;
                return null;
            case 19:
                return t.B(Boolean.FALSE);
            case 20:
                CheckLogActivity.a aVar11 = CheckLogActivity.Companion;
                return null;
            case 21:
                DispatchWorkflowBottomSheet.a aVar12 = DispatchWorkflowBottomSheet.Companion;
                throw new IllegalStateException("workflowTitle is not set");
            case 22:
                WorkflowSummaryActivity.a aVar13 = WorkflowSummaryActivity.Companion;
                return null;
            case 23:
                return t.B(Boolean.FALSE);
            case 24:
                CreateIssueRepoSearchActivity.a aVar14 = CreateIssueRepoSearchActivity.Companion;
                return null;
            case 25:
                m0.a aVar15 = m0.Companion;
                return a0.a;
            case 26:
                IssuesActivity.a aVar16 = IssuesActivity.Companion;
                return new ArrayList();
            case 27:
                PullRequestsActivity.a aVar17 = PullRequestsActivity.Companion;
                return new ArrayList();
            case 28:
                p2.a aVar18 = p2.Companion;
                return Boolean.FALSE;
            default:
                AgentPullRequestsActivity.a aVar19 = AgentPullRequestsActivity.Companion;
                return MobileSubjectType.UNKNOWN__;
        }
    }
}
