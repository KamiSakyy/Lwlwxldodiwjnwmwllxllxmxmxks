package mg0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 implements aa.a {
    public static final b0 a = new b0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        bl0.a aVar;
        og0.a aVar2;
        ij0.b bVar;
        ae0.c cVar;
        kk0.c cVar2;
        qe0.m mVar;
        kj0.b bVar2;
        ug0.c cVar3;
        mk0.c cVar4;
        ch0.b bVar3;
        ok0.b bVar4;
        oh0.b bVar5;
        if0.b bVar6;
        ef0.i iVar;
        ej0.f fVar;
        wd0.c cVar5;
        uh0.c cVar6;
        gj0.c cVar7;
        hi0.b bVar7;
        qk0.b bVar8;
        ue0.c cVar8;
        ik0.c cVar9;
        eh0.e eVar2;
        zk0.c cVar10;
        cf0.e eVar3;
        ye0.e eVar4;
        sf0.e eVar5;
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
        if (m71.a.v(m71.a.O(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CrossReferencedEvent", "DemilestonedEvent", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "Patch", "PinnedDiscussion", "PinnedEvent", "PinnedIssue", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectNext", "ProjectNextField", "ProjectNextItem", "ProjectNextItemFieldValue", "ProjectNextIterationField", "ProjectNextSingleSelectField", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2View", "ProjectV2Workflow", "ProjectView", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "Status", "StatusCheckRollup", "StatusContext", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamDiscussion", "TeamDiscussionComment", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"}), set2, str, set)) {
            eVar.s0();
            aVar = bl0.b.c(eVar, wVar);
        } else {
            aVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"IssueComment"}), set2, str, set)) {
            eVar.s0();
            aVar2 = og0.b.c(eVar, wVar);
        } else {
            aVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RenamedTitleEvent"}), set2, str, set)) {
            eVar.s0();
            bVar = ij0.d.c(eVar, wVar);
        } else {
            bVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"AssignedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar = ae0.e.c(eVar, wVar);
        } else {
            cVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"UnassignedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar2 = kk0.f.c(eVar, wVar);
        } else {
            cVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ClosedEvent"}), set2, str, set)) {
            eVar.s0();
            mVar = qe0.q.c(eVar, wVar);
        } else {
            mVar = null;
        }
        kk0.c cVar11 = cVar2;
        if (m71.a.v(m71.a.O(new String[]{"ReopenedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar2 = kj0.d.c(eVar, wVar);
        } else {
            bVar2 = null;
        }
        kj0.b bVar9 = bVar2;
        if (m71.a.v(m71.a.O(new String[]{"LabeledEvent"}), set2, str, set)) {
            eVar.s0();
            cVar3 = ug0.f.c(eVar, wVar);
        } else {
            cVar3 = null;
        }
        ug0.c cVar12 = cVar3;
        if (m71.a.v(m71.a.O(new String[]{"UnlabeledEvent"}), set2, str, set)) {
            eVar.s0();
            cVar4 = mk0.f.c(eVar, wVar);
        } else {
            cVar4 = null;
        }
        mk0.c cVar13 = cVar4;
        if (m71.a.v(m71.a.O(new String[]{"LockedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar3 = ch0.d.c(eVar, wVar);
        } else {
            bVar3 = null;
        }
        ch0.b bVar10 = bVar3;
        if (m71.a.v(m71.a.O(new String[]{"UnlockedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar4 = ok0.d.c(eVar, wVar);
        } else {
            bVar4 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MilestonedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar5 = oh0.d.c(eVar, wVar);
        } else {
            bVar5 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DemilestonedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar6 = if0.d.c(eVar, wVar);
        } else {
            bVar6 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CrossReferencedEvent"}), set2, str, set)) {
            eVar.s0();
            iVar = ef0.k.c(eVar, wVar);
        } else {
            iVar = null;
        }
        oh0.b bVar11 = bVar5;
        if (m71.a.v(m71.a.O(new String[]{"ReferencedEvent"}), set2, str, set)) {
            eVar.s0();
            fVar = ej0.k.c(eVar, wVar);
        } else {
            fVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"AddedToProjectEvent"}), set2, str, set)) {
            eVar.s0();
            cVar5 = wd0.e.c(eVar, wVar);
        } else {
            cVar5 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MovedColumnsInProjectEvent"}), set2, str, set)) {
            eVar.s0();
            cVar6 = uh0.e.c(eVar, wVar);
        } else {
            cVar6 = null;
        }
        wd0.c cVar14 = cVar5;
        if (m71.a.v(m71.a.O(new String[]{"RemovedFromProjectEvent"}), set2, str, set)) {
            eVar.s0();
            cVar7 = gj0.f.c(eVar, wVar);
        } else {
            cVar7 = null;
        }
        gj0.c cVar15 = cVar7;
        if (m71.a.v(m71.a.O(new String[]{"PinnedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar7 = hi0.d.c(eVar, wVar);
        } else {
            bVar7 = null;
        }
        hi0.b bVar12 = bVar7;
        if (m71.a.v(m71.a.O(new String[]{"UnpinnedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar8 = qk0.d.c(eVar, wVar);
        } else {
            bVar8 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CommentDeletedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar8 = ue0.e.c(eVar, wVar);
        } else {
            cVar8 = null;
        }
        qk0.b bVar13 = bVar8;
        if (m71.a.v(m71.a.O(new String[]{"TransferredEvent"}), set2, str, set)) {
            eVar.s0();
            cVar9 = ik0.f.c(eVar, wVar);
        } else {
            cVar9 = null;
        }
        ik0.c cVar16 = cVar9;
        if (m71.a.v(m71.a.O(new String[]{"MarkedAsDuplicateEvent"}), set2, str, set)) {
            eVar.s0();
            eVar2 = eh0.h.c(eVar, wVar);
        } else {
            eVar2 = null;
        }
        eh0.e eVar6 = eVar2;
        if (m71.a.v(m71.a.O(new String[]{"UserBlockedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar10 = zk0.e.c(eVar, wVar);
        } else {
            cVar10 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ConvertedToDiscussionEvent"}), set2, str, set)) {
            eVar.s0();
            eVar3 = cf0.g.c(eVar, wVar);
        } else {
            eVar3 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ConnectedEvent"}), set2, str, set)) {
            eVar.s0();
            eVar4 = ye0.g.c(eVar, wVar);
        } else {
            eVar4 = null;
        }
        zk0.c cVar17 = cVar10;
        if (m71.a.v(m71.a.O(new String[]{"DisconnectedEvent"}), set2, str, set)) {
            eVar.s0();
            eVar5 = sf0.g.c(eVar, wVar);
        } else {
            eVar5 = null;
        }
        ye0.e eVar7 = eVar4;
        qe0.m mVar2 = mVar;
        return new w(str, aVar, aVar2, bVar, cVar, cVar11, mVar2, bVar9, cVar12, cVar13, bVar10, bVar4, bVar11, bVar6, iVar, fVar, cVar14, cVar6, cVar15, bVar12, bVar13, cVar8, cVar16, eVar6, cVar17, eVar3, eVar7, eVar5);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w wVar2 = (w) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, wVar2.a);
        bl0.a aVar = wVar2.b;
        if (aVar != null) {
            bl0.b.d(fVar, wVar, aVar);
        }
        og0.a aVar2 = wVar2.c;
        if (aVar2 != null) {
            og0.b.d(fVar, wVar, aVar2);
        }
        ij0.b bVar = wVar2.d;
        if (bVar != null) {
            ij0.d.d(fVar, wVar, bVar);
        }
        ae0.c cVar = wVar2.e;
        if (cVar != null) {
            ae0.e.d(fVar, wVar, cVar);
        }
        kk0.c cVar2 = wVar2.f;
        if (cVar2 != null) {
            kk0.f.d(fVar, wVar, cVar2);
        }
        qe0.m mVar = wVar2.g;
        if (mVar != null) {
            qe0.q.d(fVar, wVar, mVar);
        }
        kj0.b bVar2 = wVar2.h;
        if (bVar2 != null) {
            kj0.d.d(fVar, wVar, bVar2);
        }
        ug0.c cVar3 = wVar2.i;
        if (cVar3 != null) {
            ug0.f.d(fVar, wVar, cVar3);
        }
        mk0.c cVar4 = wVar2.j;
        if (cVar4 != null) {
            mk0.f.d(fVar, wVar, cVar4);
        }
        ch0.b bVar3 = wVar2.k;
        if (bVar3 != null) {
            ch0.d.d(fVar, wVar, bVar3);
        }
        ok0.b bVar4 = wVar2.l;
        if (bVar4 != null) {
            ok0.d.d(fVar, wVar, bVar4);
        }
        oh0.b bVar5 = wVar2.m;
        if (bVar5 != null) {
            oh0.d.d(fVar, wVar, bVar5);
        }
        if0.b bVar6 = wVar2.n;
        if (bVar6 != null) {
            if0.d.d(fVar, wVar, bVar6);
        }
        ef0.i iVar = wVar2.o;
        if (iVar != null) {
            ef0.k.d(fVar, wVar, iVar);
        }
        ej0.f fVar2 = wVar2.p;
        if (fVar2 != null) {
            ej0.k.d(fVar, wVar, fVar2);
        }
        wd0.c cVar5 = wVar2.q;
        if (cVar5 != null) {
            wd0.e.d(fVar, wVar, cVar5);
        }
        uh0.c cVar6 = wVar2.r;
        if (cVar6 != null) {
            uh0.e.d(fVar, wVar, cVar6);
        }
        gj0.c cVar7 = wVar2.s;
        if (cVar7 != null) {
            gj0.f.d(fVar, wVar, cVar7);
        }
        hi0.b bVar7 = wVar2.t;
        if (bVar7 != null) {
            hi0.d.d(fVar, wVar, bVar7);
        }
        qk0.b bVar8 = wVar2.u;
        if (bVar8 != null) {
            qk0.d.d(fVar, wVar, bVar8);
        }
        ue0.c cVar8 = wVar2.v;
        if (cVar8 != null) {
            ue0.e.d(fVar, wVar, cVar8);
        }
        ik0.c cVar9 = wVar2.w;
        if (cVar9 != null) {
            ik0.f.d(fVar, wVar, cVar9);
        }
        eh0.e eVar = wVar2.x;
        if (eVar != null) {
            eh0.h.d(fVar, wVar, eVar);
        }
        zk0.c cVar10 = wVar2.y;
        if (cVar10 != null) {
            zk0.e.d(fVar, wVar, cVar10);
        }
        cf0.e eVar2 = wVar2.z;
        if (eVar2 != null) {
            cf0.g.d(fVar, wVar, eVar2);
        }
        ye0.e eVar3 = wVar2.A;
        if (eVar3 != null) {
            ye0.g.d(fVar, wVar, eVar3);
        }
        sf0.e eVar4 = wVar2.B;
        if (eVar4 != null) {
            sf0.g.d(fVar, wVar, eVar4);
        }
    }
}
