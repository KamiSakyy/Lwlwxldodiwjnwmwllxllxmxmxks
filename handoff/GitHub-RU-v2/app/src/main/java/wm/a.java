package wm;

import androidx.compose.runtime.d0;
import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.feed.navigation.ExploreAwesomeListsRoute;
import com.github.rudroid.feed.navigation.ExploreEntryPointRoute;
import com.github.rudroid.feed.navigation.ExploreScreenRoute;
import com.github.rudroid.feed.navigation.ExploreTrendingReposRoute;
import com.github.service.copilot.SteerCommand$ElicitationResponse;
import com.github.service.copilot.SteerCommand$PermissionResponse;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.ProjectState;
import com.github.service.models.response.PullRequestWidgetData;
import com.github.service.models.response.PullsWidgetFilter;
import com.github.service.models.response.PullsWidgetPullRow;
import com.github.service.models.response.PullsWidgetPullRow$;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.TrendingPeriod;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.lang.annotation.Annotation;
import k81.c1Shadow;
import k81.d;
import k81.f0;
import k81.q1;
import k81.z;
import xn.eShadow;
import xn.g1;
import xn.g3;
import xn.j3;
import xn.x1Shadow;
import xn.z2;
import z0.f;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.a {
    public final /* synthetic */ int r;

    public /* synthetic */ a(int i) {
        this.r = i;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                ShortcutConfigurationModel.Companion companion = ShortcutConfigurationModel.Companion;
                return com.github.service.models.response.shortcuts.a.Companion.serializer();
            case 1:
                ShortcutConfigurationModel.Companion companion2 = ShortcutConfigurationModel.Companion;
                return c1Shadow.f("com.github.service.models.response.shortcuts.ShortcutType", ShortcutType.values());
            case 2:
                StoredShortcutModel.Companion companion3 = StoredShortcutModel.Companion;
                return c1Shadow.f("com.github.service.models.response.shortcuts.ShortcutColor", ShortcutColor.values());
            case 3:
                StoredShortcutModel.Companion companion4 = StoredShortcutModel.Companion;
                return c1Shadow.f("com.github.service.models.response.shortcuts.ShortcutIcon", ShortcutIcon.values());
            case 4:
                StoredShortcutModel.Companion companion5 = StoredShortcutModel.Companion;
                return com.github.service.models.response.shortcuts.a.Companion.serializer();
            case 5:
                StoredShortcutModel.Companion companion6 = StoredShortcutModel.Companion;
                return c1Shadow.f("com.github.service.models.response.shortcuts.ShortcutType", ShortcutType.values());
            case 6:
                return new wz0.b();
            case 7:
                return new wz0.a(0);
            case 8:
                return new wz0.a(1);
            case 9:
                return new z("com.github.rudroid.feed.navigation.ExploreAwesomeListsRoute", ExploreAwesomeListsRoute.INSTANCE, new Annotation[0]);
            case 10:
                return new z("com.github.rudroid.feed.navigation.ExploreEntryPointRoute", ExploreEntryPointRoute.INSTANCE, new Annotation[0]);
            case 11:
                return new z("com.github.rudroid.feed.navigation.ExploreScreenRoute", ExploreScreenRoute.INSTANCE, new Annotation[0]);
            case 12:
                return new z("com.github.rudroid.feed.navigation.ExploreTrendingReposRoute", ExploreTrendingReposRoute.INSTANCE, new Annotation[0]);
            case 13:
                return c1Shadow.e("com.github.service.copilot.AgentTaskStatus", eShadow.values(), new String[]{"completed", "in_progress", "queued", "failed", "waiting_for_user", "timed_out", "cancelled", null}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 14:
                return c1Shadow.e("com.github.service.copilot.ElicitationAction", g1.values(), new String[]{"accept", "decline", "cancel"}, new Annotation[][]{null, null, null});
            case 15:
                return c1Shadow.e("com.github.service.copilot.PermissionScope", z2.values(), new String[]{"once", "session"}, new Annotation[][]{null, null});
            case 16:
                return c1Shadow.e("com.github.service.copilot.ResourceState", g3.values(), new String[]{"draft", "open", "closed", "merged"}, new Annotation[][]{null, null, null, null});
            case 17:
                return c1Shadow.e("com.github.service.copilot.SessionEventType", j3.values(), new String[]{"session.requested", "session.start", "session.resume", "session.error", "session.idle", "session.info", "session.model_change", "session.import_legacy", "session.handoff", "session.truncation", "subagent.started", "user.message", "local_pending.user.message", "assistant.turn_start", "assistant.intent", "assistant.message", "assistant.turn_end", "assistant.usage", "abort", "tool.user_requested", "tool.execution_start", "tool.execution_partial_result", "tool.execution_complete", "custom_agent.started", "custom_agent.completed", "custom_agent.failed", "custom_agent.selected", "hook.start", "hook.end", "system.message", "permission.requested", "permission.completed", "user_input.requested", "user_input.completed", "exit_plan_mode.requested", "exit_plan_mode.completed", "elicitation.requested", "elicitation.completed", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 18:
                SteerCommand$ElicitationResponse.Companion companion7 = SteerCommand$ElicitationResponse.Companion;
                return g1.Companion.serializer();
            case 19:
                SteerCommand$ElicitationResponse.Companion companion8 = SteerCommand$ElicitationResponse.Companion;
                return new f0(q1.a, x1Shadow.a, 1);
            case 20:
                SteerCommand$PermissionResponse.Companion companion9 = SteerCommand$PermissionResponse.Companion;
                return z2.Companion.serializer();
            case 21:
                Avatar.Companion companion10 = Avatar.Companion;
                return c1Shadow.f("com.github.service.models.response.Avatar.Type", Avatar.Type.values());
            case 22:
                PullRequestWidgetData.Companion companion11 = PullRequestWidgetData.Companion;
                return c1Shadow.f("com.github.service.models.response.PullsWidgetFilter", PullsWidgetFilter.values());
            case 23:
                PullRequestWidgetData.Companion companion12 = PullRequestWidgetData.Companion;
                return new d(PullsWidgetPullRow$.serializer.INSTANCE, 0);
            case 24:
                PullsWidgetPullRow.Companion companion13 = PullsWidgetPullRow.Companion;
                return c1Shadow.f("com.github.service.models.response.CheckStatusState", CheckStatusState.values());
            case 25:
                SimpleLegacyProject.Companion companion14 = SimpleLegacyProject.Companion;
                return c1Shadow.f("com.github.service.models.response.ProjectState", ProjectState.values());
            case 26:
                return TrendingPeriod.c();
            case 27:
                d0 d0Var = f.a;
                return null;
            case 28:
                throw new IllegalStateException("No default size");
            default:
                throw new IllegalStateException("No default context");
        }
    }
}
