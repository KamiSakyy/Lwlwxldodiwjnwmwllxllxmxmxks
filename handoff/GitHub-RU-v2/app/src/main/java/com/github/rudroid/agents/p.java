package com.github.rudroid.agents;

import com.github.rudroid.agents.AgentPullRequestsActivity;
import com.github.rudroid.agents.CreateAgentTaskBottomSheet;
import com.github.rudroid.agents.copilothome.navigation.CopilotActivateFree;
import com.github.rudroid.agents.copilothome.navigation.CopilotHomeEntryPointRoute;
import com.github.rudroid.agents.copilothome.navigation.CopilotHomeNavRoute;
import com.github.rudroid.block.BlockFromOrgBottomSheetDialog;
import com.github.rudroid.block.BlockFromOrgFragment;
import com.github.rudroid.comment.ComposeCommentBottomSheetDialog;
import com.github.rudroid.commit.CommitDataContainer;
import com.github.rudroid.commit.CommitDataContainer$CommitFromId$$serializer;
import com.github.rudroid.commit.CommitDataContainer$CommitFromRepoData$$serializer;
import com.github.rudroid.commits.CommitsType;
import com.github.rudroid.commits.CommitsType$Commits$$serializer;
import com.github.rudroid.commits.CommitsType$Deeplink$$serializer;
import com.github.rudroid.commits.CommitsType$History$$serializer;
import com.github.rudroid.commits.CommitsType$RefComparison$$serializer;
import com.github.rudroid.copilot.CopilotChatActivity;
import com.github.service.models.response.type.MobileEventContext;
import java.lang.annotation.Annotation;
import java.text.DecimalFormat;
import kotlinx.serialization.KSerializer;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class p implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7246r;

    public /* synthetic */ p(int i) {
        this.f7246r = i;
    }

    public final Object a() {
        int i = this.f7246r;
        w61.a0 a0Var = w61.a0.a;
        switch (i) {
            case k5.f.J:
                AgentPullRequestsActivity.a aVar = AgentPullRequestsActivity.Companion;
                return null;
            case 1:
                CreateAgentTaskBottomSheet.a aVar2 = CreateAgentTaskBottomSheet.Companion;
                return MobileEventContext.UNKNOWN__;
            case 2:
                return new k81.z("com.github.rudroid.agents.copilothome.navigation.CopilotActivateFree", CopilotActivateFree.INSTANCE, new Annotation[0]);
            case 3:
                return new k81.z("com.github.rudroid.agents.copilothome.navigation.CopilotHomeEntryPointRoute", CopilotHomeEntryPointRoute.INSTANCE, new Annotation[0]);
            case 4:
                return new k81.z("com.github.rudroid.agents.copilothome.navigation.CopilotHomeNavRoute", CopilotHomeNavRoute.INSTANCE, new Annotation[0]);
            case 5:
                return androidx.compose.runtime.t.B(Boolean.FALSE);
            case 6:
                return androidx.compose.runtime.t.B(Boolean.FALSE);
            case 7:
                float f6 = com.github.rudroid.agents.sessionevents.ui.j1.f7956a;
                return a0Var;
            case 8:
                DecimalFormat decimalFormat = com.github.rudroid.agents.sessionevents.ui.i2.f7947a;
                return androidx.compose.runtime.t.B(Boolean.FALSE);
            case 9:
                DecimalFormat decimalFormat2 = com.github.rudroid.agents.sessionevents.ui.i2.f7947a;
                return androidx.compose.runtime.t.B(Boolean.FALSE);
            case 10:
                DecimalFormat decimalFormat3 = com.github.rudroid.agents.sessionevents.ui.i2.f7947a;
                return a0Var;
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                DecimalFormat decimalFormat4 = com.github.rudroid.agents.sessionevents.ui.i2.f7947a;
                return androidx.compose.runtime.t.B(Boolean.FALSE);
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                float f10 = com.github.rudroid.agents.sessionevents.ui.l2.f7988a;
                return a0Var;
            case 13:
                BlockFromOrgBottomSheetDialog.a aVar3 = BlockFromOrgBottomSheetDialog.Companion;
                throw new IllegalStateException("user login to block is not set");
            case 14:
                BlockFromOrgBottomSheetDialog.a aVar4 = BlockFromOrgBottomSheetDialog.Companion;
                throw new IllegalStateException("comment id is not set");
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                BlockFromOrgBottomSheetDialog.a aVar5 = BlockFromOrgBottomSheetDialog.Companion;
                throw new IllegalStateException("organization id is not set");
            case 16:
                BlockFromOrgBottomSheetDialog.a aVar6 = BlockFromOrgBottomSheetDialog.Companion;
                throw new IllegalStateException("user id to block is not set");
            case 17:
                BlockFromOrgBottomSheetDialog.a aVar7 = BlockFromOrgBottomSheetDialog.Companion;
                throw new IllegalStateException("hide comment section visible not set");
            case 18:
                BlockFromOrgBottomSheetDialog.a aVar8 = BlockFromOrgBottomSheetDialog.Companion;
                throw new IllegalStateException("block origin not set");
            case 19:
                BlockFromOrgFragment.a aVar9 = BlockFromOrgFragment.Companion;
                throw new IllegalStateException("user login to block is not set");
            case 20:
                BlockFromOrgFragment.a aVar10 = BlockFromOrgFragment.Companion;
                throw new IllegalStateException("user id to block is not set");
            case 21:
                BlockFromOrgFragment.a aVar11 = BlockFromOrgFragment.Companion;
                throw new IllegalStateException("organization id is not set");
            case 22:
                BlockFromOrgFragment.a aVar12 = BlockFromOrgFragment.Companion;
                throw new IllegalStateException("comment id not set");
            case 23:
                BlockFromOrgFragment.a aVar13 = BlockFromOrgFragment.Companion;
                throw new IllegalStateException("hide comment section visible not set");
            case 24:
                ComposeCommentBottomSheetDialog.a aVar14 = ComposeCommentBottomSheetDialog.Companion;
                return Integer.valueOf(mb.c.f29201u.a());
            case 25:
                ComposeCommentBottomSheetDialog.a aVar15 = ComposeCommentBottomSheetDialog.Companion;
                return a0Var;
            case 26:
                CommitDataContainer.Companion companion = CommitDataContainer.Companion;
                return new g81.d("com.github.rudroid.commit.CommitDataContainer", k71.xShadow.a(CommitDataContainer.class), new r71.b[]{k71.xShadow.a(CommitDataContainer.CommitFromId.class), k71.xShadow.a(CommitDataContainer.CommitFromRepoData.class)}, new KSerializer[]{CommitDataContainer$CommitFromId$$serializer.INSTANCE, CommitDataContainer$CommitFromRepoData$$serializer.INSTANCE}, new Annotation[0]);
            case 27:
                CommitsType.Companion companion2 = CommitsType.Companion;
                return new g81.d("com.github.rudroid.commits.CommitsType", k71.xShadow.a(CommitsType.class), new r71.b[]{k71.xShadow.a(CommitsType.Commits.class), k71.xShadow.a(CommitsType.Deeplink.class), k71.xShadow.a(CommitsType.History.class), k71.xShadow.a(CommitsType.RefComparison.class)}, new KSerializer[]{CommitsType$Commits$$serializer.INSTANCE, CommitsType$Deeplink$$serializer.INSTANCE, CommitsType$History$$serializer.INSTANCE, CommitsType$RefComparison$$serializer.INSTANCE}, new Annotation[0]);
            case 28:
                CopilotChatActivity.a aVar16 = CopilotChatActivity.Companion;
                return null;
            default:
                CopilotChatActivity.a aVar17 = CopilotChatActivity.Companion;
                return Boolean.TRUE;
        }
    }
}
