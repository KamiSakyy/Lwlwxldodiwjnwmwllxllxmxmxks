package ur0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 implements aa.a {
    public static final f0 a = new f0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        kw0.a aVar;
        wr0.a aVar2;
        mu0.b bVar;
        gp0.c cVar;
        tv0.c cVar2;
        wp0.m mVar;
        ou0.b bVar2;
        es0.c cVar3;
        vv0.c cVar4;
        ms0.b bVar3;
        xv0.b bVar4;
        ys0.b bVar5;
        oq0.b bVar6;
        kq0.i iVar;
        ku0.f fVar;
        rt0.b bVar7;
        zv0.b bVar8;
        aq0.c cVar5;
        rv0.c cVar6;
        os0.e eVar2;
        iw0.c cVar7;
        iq0.e eVar3;
        eq0.e eVar4;
        yq0.e eVar5;
        lv0.d dVar;
        lv0.l lVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CrossReferencedEvent", "DemilestonedEvent", "DependencyGraphManifest", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseMemberInvitation", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "IssueType", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "ParentIssueAddedEvent", "ParentIssueRemovedEvent", "Patch", "PinnedDiscussion", "PinnedEnvironment", "PinnedEvent", "PinnedIssue", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectNext", "ProjectNextField", "ProjectNextItem", "ProjectNextItemFieldValue", "ProjectNextIterationField", "ProjectNextSingleSelectField", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2StatusUpdate", "ProjectV2View", "ProjectV2Workflow", "ProjectView", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Query", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "Status", "StatusCheckRollup", "StatusContext", "SubIssueAddedEvent", "SubIssueRemovedEvent", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamDiscussion", "TeamDiscussionComment", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserNamespaceRepository", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"}), set2, str, set)) {
            eVar.s0();
            aVar = kw0.b.c(eVar, wVar);
        } else {
            aVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"IssueComment"}), set2, str, set)) {
            eVar.s0();
            aVar2 = wr0.b.c(eVar, wVar);
        } else {
            aVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RenamedTitleEvent"}), set2, str, set)) {
            eVar.s0();
            bVar = mu0.d.c(eVar, wVar);
        } else {
            bVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"AssignedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar = gp0.e.c(eVar, wVar);
        } else {
            cVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"UnassignedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar2 = tv0.f.c(eVar, wVar);
        } else {
            cVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ClosedEvent"}), set2, str, set)) {
            eVar.s0();
            mVar = wp0.q.c(eVar, wVar);
        } else {
            mVar = null;
        }
        tv0.c cVar8 = cVar2;
        if (m71.a.v(m71.a.O(new String[]{"ReopenedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar2 = ou0.d.c(eVar, wVar);
        } else {
            bVar2 = null;
        }
        ou0.b bVar9 = bVar2;
        if (m71.a.v(m71.a.O(new String[]{"LabeledEvent"}), set2, str, set)) {
            eVar.s0();
            cVar3 = es0.f.c(eVar, wVar);
        } else {
            cVar3 = null;
        }
        es0.c cVar9 = cVar3;
        if (m71.a.v(m71.a.O(new String[]{"UnlabeledEvent"}), set2, str, set)) {
            eVar.s0();
            cVar4 = vv0.f.c(eVar, wVar);
        } else {
            cVar4 = null;
        }
        vv0.c cVar10 = cVar4;
        if (m71.a.v(m71.a.O(new String[]{"LockedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar3 = ms0.d.c(eVar, wVar);
        } else {
            bVar3 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"UnlockedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar4 = xv0.d.c(eVar, wVar);
        } else {
            bVar4 = null;
        }
        xv0.b bVar10 = bVar4;
        if (m71.a.v(m71.a.O(new String[]{"MilestonedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar5 = ys0.d.c(eVar, wVar);
        } else {
            bVar5 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DemilestonedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar6 = oq0.d.c(eVar, wVar);
        } else {
            bVar6 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CrossReferencedEvent"}), set2, str, set)) {
            eVar.s0();
            iVar = kq0.k.c(eVar, wVar);
        } else {
            iVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ReferencedEvent"}), set2, str, set)) {
            eVar.s0();
            fVar = ku0.k.c(eVar, wVar);
        } else {
            fVar = null;
        }
        ys0.b bVar11 = bVar5;
        if (m71.a.v(m71.a.O(new String[]{"PinnedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar7 = rt0.d.c(eVar, wVar);
        } else {
            bVar7 = null;
        }
        rt0.b bVar12 = bVar7;
        if (m71.a.v(m71.a.O(new String[]{"UnpinnedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar8 = zv0.d.c(eVar, wVar);
        } else {
            bVar8 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CommentDeletedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar5 = aq0.e.c(eVar, wVar);
        } else {
            cVar5 = null;
        }
        zv0.b bVar13 = bVar8;
        if (m71.a.v(m71.a.O(new String[]{"TransferredEvent"}), set2, str, set)) {
            eVar.s0();
            cVar6 = rv0.f.c(eVar, wVar);
        } else {
            cVar6 = null;
        }
        rv0.c cVar11 = cVar6;
        if (m71.a.v(m71.a.O(new String[]{"MarkedAsDuplicateEvent"}), set2, str, set)) {
            eVar.s0();
            eVar2 = os0.h.c(eVar, wVar);
        } else {
            eVar2 = null;
        }
        os0.e eVar6 = eVar2;
        if (m71.a.v(m71.a.O(new String[]{"UserBlockedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar7 = iw0.e.c(eVar, wVar);
        } else {
            cVar7 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ConvertedToDiscussionEvent"}), set2, str, set)) {
            eVar.s0();
            eVar3 = iq0.g.c(eVar, wVar);
        } else {
            eVar3 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ConnectedEvent"}), set2, str, set)) {
            eVar.s0();
            eVar4 = eq0.g.c(eVar, wVar);
        } else {
            eVar4 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DisconnectedEvent"}), set2, str, set)) {
            eVar.s0();
            eVar5 = yq0.g.c(eVar, wVar);
        } else {
            eVar5 = null;
        }
        iw0.c cVar12 = cVar7;
        if (m71.a.v(m71.a.O(new String[]{"SubIssueAddedEvent"}), set2, str, set)) {
            eVar.s0();
            dVar = lv0.h.c(eVar, wVar);
        } else {
            dVar = null;
        }
        lv0.d dVar2 = dVar;
        if (m71.a.v(m71.a.O(new String[]{"SubIssueRemovedEvent"}), set2, str, set)) {
            eVar.s0();
            lVar = lv0.p.c(eVar, wVar);
        } else {
            lVar = null;
        }
        iq0.e eVar7 = eVar3;
        return new a0(str, aVar, aVar2, bVar, cVar, cVar8, mVar, bVar9, cVar9, cVar10, bVar3, bVar10, bVar11, bVar6, iVar, fVar, bVar12, bVar13, cVar5, cVar11, eVar6, cVar12, eVar7, eVar4, eVar5, dVar2, lVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a0 a0Var = (a0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, a0Var.a);
        kw0.a aVar = a0Var.b;
        if (aVar != null) {
            kw0.b.d(fVar, wVar, aVar);
        }
        wr0.a aVar2 = a0Var.c;
        if (aVar2 != null) {
            wr0.b.d(fVar, wVar, aVar2);
        }
        mu0.b bVar = a0Var.d;
        if (bVar != null) {
            mu0.d.d(fVar, wVar, bVar);
        }
        gp0.c cVar = a0Var.e;
        if (cVar != null) {
            gp0.e.d(fVar, wVar, cVar);
        }
        tv0.c cVar2 = a0Var.f;
        if (cVar2 != null) {
            tv0.f.d(fVar, wVar, cVar2);
        }
        wp0.m mVar = a0Var.g;
        if (mVar != null) {
            wp0.q.d(fVar, wVar, mVar);
        }
        ou0.b bVar2 = a0Var.h;
        if (bVar2 != null) {
            ou0.d.d(fVar, wVar, bVar2);
        }
        es0.c cVar3 = a0Var.i;
        if (cVar3 != null) {
            es0.f.d(fVar, wVar, cVar3);
        }
        vv0.c cVar4 = a0Var.j;
        if (cVar4 != null) {
            vv0.f.d(fVar, wVar, cVar4);
        }
        ms0.b bVar3 = a0Var.k;
        if (bVar3 != null) {
            ms0.d.d(fVar, wVar, bVar3);
        }
        xv0.b bVar4 = a0Var.l;
        if (bVar4 != null) {
            xv0.d.d(fVar, wVar, bVar4);
        }
        ys0.b bVar5 = a0Var.m;
        if (bVar5 != null) {
            ys0.d.d(fVar, wVar, bVar5);
        }
        oq0.b bVar6 = a0Var.n;
        if (bVar6 != null) {
            oq0.d.d(fVar, wVar, bVar6);
        }
        kq0.i iVar = a0Var.o;
        if (iVar != null) {
            kq0.k.d(fVar, wVar, iVar);
        }
        ku0.f fVar2 = a0Var.p;
        if (fVar2 != null) {
            ku0.k.d(fVar, wVar, fVar2);
        }
        rt0.b bVar7 = a0Var.q;
        if (bVar7 != null) {
            rt0.d.d(fVar, wVar, bVar7);
        }
        zv0.b bVar8 = a0Var.r;
        if (bVar8 != null) {
            zv0.d.d(fVar, wVar, bVar8);
        }
        aq0.c cVar5 = a0Var.s;
        if (cVar5 != null) {
            aq0.e.d(fVar, wVar, cVar5);
        }
        rv0.c cVar6 = a0Var.t;
        if (cVar6 != null) {
            rv0.f.d(fVar, wVar, cVar6);
        }
        os0.e eVar = a0Var.u;
        if (eVar != null) {
            os0.h.d(fVar, wVar, eVar);
        }
        iw0.c cVar7 = a0Var.v;
        if (cVar7 != null) {
            iw0.e.d(fVar, wVar, cVar7);
        }
        iq0.e eVar2 = a0Var.w;
        if (eVar2 != null) {
            iq0.g.d(fVar, wVar, eVar2);
        }
        eq0.e eVar3 = a0Var.x;
        if (eVar3 != null) {
            eq0.g.d(fVar, wVar, eVar3);
        }
        yq0.e eVar4 = a0Var.y;
        if (eVar4 != null) {
            yq0.g.d(fVar, wVar, eVar4);
        }
        lv0.d dVar = a0Var.z;
        if (dVar != null) {
            lv0.h.d(fVar, wVar, dVar);
        }
        lv0.l lVar = a0Var.A;
        if (lVar != null) {
            lv0.p.d(fVar, wVar, lVar);
        }
    }
}
