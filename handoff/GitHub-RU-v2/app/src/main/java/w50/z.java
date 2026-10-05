package w50;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements aa.a {
    public static final z a = new z();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        ja0.a aVar;
        y50.a aVar2;
        q80.b bVar;
        k30.c cVar;
        s90.c cVar2;
        a40.m mVar;
        s80.b bVar2;
        e60.c cVar3;
        u90.c cVar4;
        m60.b bVar3;
        w90.b bVar4;
        w60.b bVar5;
        s40.b bVar6;
        o40.i iVar;
        m80.f fVar;
        g30.c cVar5;
        c70.c cVar6;
        o80.c cVar7;
        p70.b bVar7;
        y90.b bVar8;
        e40.c cVar8;
        q90.c cVar9;
        o60.e eVar2;
        ha0.c cVar10;
        m40.e eVar3;
        i40.e eVar4;
        c50.e eVar5;
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
        if (m71.a.v(m71.a.O(new String[]{"Achievement", "AchievementTier", "AddedToProjectEvent", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CrossReferencedEvent", "DemilestonedEvent", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "Patch", "PinnedDiscussion", "PinnedEvent", "PinnedIssue", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectNext", "ProjectNextField", "ProjectNextItem", "ProjectNextItemFieldValue", "ProjectNextIterationField", "ProjectNextSingleSelectField", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2View", "ProjectV2Workflow", "ProjectView", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromProjectEvent", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "Status", "StatusCheckRollup", "StatusContext", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamDiscussion", "TeamDiscussionComment", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"}), set2, str, set)) {
            eVar.s0();
            aVar = ja0.b.c(eVar, wVar);
        } else {
            aVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"IssueComment"}), set2, str, set)) {
            eVar.s0();
            aVar2 = y50.b.c(eVar, wVar);
        } else {
            aVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RenamedTitleEvent"}), set2, str, set)) {
            eVar.s0();
            bVar = q80.d.c(eVar, wVar);
        } else {
            bVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"AssignedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar = k30.e.c(eVar, wVar);
        } else {
            cVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"UnassignedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar2 = s90.f.c(eVar, wVar);
        } else {
            cVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ClosedEvent"}), set2, str, set)) {
            eVar.s0();
            mVar = a40.q.c(eVar, wVar);
        } else {
            mVar = null;
        }
        s90.c cVar11 = cVar2;
        if (m71.a.v(m71.a.O(new String[]{"ReopenedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar2 = s80.d.c(eVar, wVar);
        } else {
            bVar2 = null;
        }
        s80.b bVar9 = bVar2;
        if (m71.a.v(m71.a.O(new String[]{"LabeledEvent"}), set2, str, set)) {
            eVar.s0();
            cVar3 = e60.f.c(eVar, wVar);
        } else {
            cVar3 = null;
        }
        e60.c cVar12 = cVar3;
        if (m71.a.v(m71.a.O(new String[]{"UnlabeledEvent"}), set2, str, set)) {
            eVar.s0();
            cVar4 = u90.f.c(eVar, wVar);
        } else {
            cVar4 = null;
        }
        u90.c cVar13 = cVar4;
        if (m71.a.v(m71.a.O(new String[]{"LockedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar3 = m60.d.c(eVar, wVar);
        } else {
            bVar3 = null;
        }
        m60.b bVar10 = bVar3;
        if (m71.a.v(m71.a.O(new String[]{"UnlockedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar4 = w90.d.c(eVar, wVar);
        } else {
            bVar4 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MilestonedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar5 = w60.d.c(eVar, wVar);
        } else {
            bVar5 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DemilestonedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar6 = s40.d.c(eVar, wVar);
        } else {
            bVar6 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CrossReferencedEvent"}), set2, str, set)) {
            eVar.s0();
            iVar = o40.k.c(eVar, wVar);
        } else {
            iVar = null;
        }
        w60.b bVar11 = bVar5;
        if (m71.a.v(m71.a.O(new String[]{"ReferencedEvent"}), set2, str, set)) {
            eVar.s0();
            fVar = m80.k.c(eVar, wVar);
        } else {
            fVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"AddedToProjectEvent"}), set2, str, set)) {
            eVar.s0();
            cVar5 = g30.e.c(eVar, wVar);
        } else {
            cVar5 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MovedColumnsInProjectEvent"}), set2, str, set)) {
            eVar.s0();
            cVar6 = c70.e.c(eVar, wVar);
        } else {
            cVar6 = null;
        }
        g30.c cVar14 = cVar5;
        if (m71.a.v(m71.a.O(new String[]{"RemovedFromProjectEvent"}), set2, str, set)) {
            eVar.s0();
            cVar7 = o80.f.c(eVar, wVar);
        } else {
            cVar7 = null;
        }
        o80.c cVar15 = cVar7;
        if (m71.a.v(m71.a.O(new String[]{"PinnedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar7 = p70.d.c(eVar, wVar);
        } else {
            bVar7 = null;
        }
        p70.b bVar12 = bVar7;
        if (m71.a.v(m71.a.O(new String[]{"UnpinnedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar8 = y90.d.c(eVar, wVar);
        } else {
            bVar8 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CommentDeletedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar8 = e40.e.c(eVar, wVar);
        } else {
            cVar8 = null;
        }
        y90.b bVar13 = bVar8;
        if (m71.a.v(m71.a.O(new String[]{"TransferredEvent"}), set2, str, set)) {
            eVar.s0();
            cVar9 = q90.f.c(eVar, wVar);
        } else {
            cVar9 = null;
        }
        q90.c cVar16 = cVar9;
        if (m71.a.v(m71.a.O(new String[]{"MarkedAsDuplicateEvent"}), set2, str, set)) {
            eVar.s0();
            eVar2 = o60.h.c(eVar, wVar);
        } else {
            eVar2 = null;
        }
        o60.e eVar6 = eVar2;
        if (m71.a.v(m71.a.O(new String[]{"UserBlockedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar10 = ha0.e.c(eVar, wVar);
        } else {
            cVar10 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ConvertedToDiscussionEvent"}), set2, str, set)) {
            eVar.s0();
            eVar3 = m40.g.c(eVar, wVar);
        } else {
            eVar3 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ConnectedEvent"}), set2, str, set)) {
            eVar.s0();
            eVar4 = i40.g.c(eVar, wVar);
        } else {
            eVar4 = null;
        }
        ha0.c cVar17 = cVar10;
        if (m71.a.v(m71.a.O(new String[]{"DisconnectedEvent"}), set2, str, set)) {
            eVar.s0();
            eVar5 = c50.g.c(eVar, wVar);
        } else {
            eVar5 = null;
        }
        i40.e eVar7 = eVar4;
        a40.m mVar2 = mVar;
        return new u(str, aVar, aVar2, bVar, cVar, cVar11, mVar2, bVar9, cVar12, cVar13, bVar10, bVar4, bVar11, bVar6, iVar, fVar, cVar14, cVar6, cVar15, bVar12, bVar13, cVar8, cVar16, eVar6, cVar17, eVar3, eVar7, eVar5);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u uVar = (u) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, uVar.a);
        ja0.a aVar = uVar.b;
        if (aVar != null) {
            ja0.b.d(fVar, wVar, aVar);
        }
        y50.a aVar2 = uVar.c;
        if (aVar2 != null) {
            y50.b.d(fVar, wVar, aVar2);
        }
        q80.b bVar = uVar.d;
        if (bVar != null) {
            q80.d.d(fVar, wVar, bVar);
        }
        k30.c cVar = uVar.e;
        if (cVar != null) {
            k30.e.d(fVar, wVar, cVar);
        }
        s90.c cVar2 = uVar.f;
        if (cVar2 != null) {
            s90.f.d(fVar, wVar, cVar2);
        }
        a40.m mVar = uVar.g;
        if (mVar != null) {
            a40.q.d(fVar, wVar, mVar);
        }
        s80.b bVar2 = uVar.h;
        if (bVar2 != null) {
            s80.d.d(fVar, wVar, bVar2);
        }
        e60.c cVar3 = uVar.i;
        if (cVar3 != null) {
            e60.f.d(fVar, wVar, cVar3);
        }
        u90.c cVar4 = uVar.j;
        if (cVar4 != null) {
            u90.f.d(fVar, wVar, cVar4);
        }
        m60.b bVar3 = uVar.k;
        if (bVar3 != null) {
            m60.d.d(fVar, wVar, bVar3);
        }
        w90.b bVar4 = uVar.l;
        if (bVar4 != null) {
            w90.d.d(fVar, wVar, bVar4);
        }
        w60.b bVar5 = uVar.m;
        if (bVar5 != null) {
            w60.d.d(fVar, wVar, bVar5);
        }
        s40.b bVar6 = uVar.n;
        if (bVar6 != null) {
            s40.d.d(fVar, wVar, bVar6);
        }
        o40.i iVar = uVar.o;
        if (iVar != null) {
            o40.k.d(fVar, wVar, iVar);
        }
        m80.f fVar2 = uVar.p;
        if (fVar2 != null) {
            m80.k.d(fVar, wVar, fVar2);
        }
        g30.c cVar5 = uVar.q;
        if (cVar5 != null) {
            g30.e.d(fVar, wVar, cVar5);
        }
        c70.c cVar6 = uVar.r;
        if (cVar6 != null) {
            c70.e.d(fVar, wVar, cVar6);
        }
        o80.c cVar7 = uVar.s;
        if (cVar7 != null) {
            o80.f.d(fVar, wVar, cVar7);
        }
        p70.b bVar7 = uVar.t;
        if (bVar7 != null) {
            p70.d.d(fVar, wVar, bVar7);
        }
        y90.b bVar8 = uVar.u;
        if (bVar8 != null) {
            y90.d.d(fVar, wVar, bVar8);
        }
        e40.c cVar8 = uVar.v;
        if (cVar8 != null) {
            e40.e.d(fVar, wVar, cVar8);
        }
        q90.c cVar9 = uVar.w;
        if (cVar9 != null) {
            q90.f.d(fVar, wVar, cVar9);
        }
        o60.e eVar = uVar.x;
        if (eVar != null) {
            o60.h.d(fVar, wVar, eVar);
        }
        ha0.c cVar10 = uVar.y;
        if (cVar10 != null) {
            ha0.e.d(fVar, wVar, cVar10);
        }
        m40.e eVar2 = uVar.z;
        if (eVar2 != null) {
            m40.g.d(fVar, wVar, eVar2);
        }
        i40.e eVar3 = uVar.A;
        if (eVar3 != null) {
            i40.g.d(fVar, wVar, eVar3);
        }
        c50.e eVar4 = uVar.B;
        if (eVar4 != null) {
            c50.g.d(fVar, wVar, eVar4);
        }
    }
}
