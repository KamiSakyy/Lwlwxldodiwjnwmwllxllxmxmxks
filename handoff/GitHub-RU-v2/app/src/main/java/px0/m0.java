package px0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        ox0.i iVar;
        ox0.k kVar;
        ox0.z zVar;
        ox0.h hVar;
        ox0.b0 b0Var;
        ox0.l lVar;
        ox0.p pVar;
        ox0.q qVar;
        ox0.u uVar;
        ox0.v vVar;
        ox0.s sVar;
        ox0.j jVar;
        ox0.t tVar;
        ox0.w wVar2;
        ox0.m mVar;
        ox0.o oVar;
        kw0.a aVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Commit"}), set2, str, set)) {
            eVar.s0();
            iVar = h.c(eVar, wVar);
        } else {
            iVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Gist"}), set2, str, set)) {
            eVar.s0();
            kVar = j.c(eVar, wVar);
        } else {
            kVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TeamDiscussion"}), set2, str, set)) {
            eVar.s0();
            zVar = y.c(eVar, wVar);
        } else {
            zVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckSuite"}), set2, str, set)) {
            eVar.s0();
            hVar = g.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"WorkflowRun"}), set2, str, set)) {
            eVar.s0();
            b0Var = a0.c(eVar, wVar);
        } else {
            b0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            lVar = k.c(eVar, wVar);
        } else {
            lVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            pVar = o.c(eVar, wVar);
        } else {
            pVar = null;
        }
        ox0.p pVar2 = pVar;
        if (m71.a.v(m71.a.O(new String[]{"Release"}), set2, str, set)) {
            eVar.s0();
            qVar = p.c(eVar, wVar);
        } else {
            qVar = null;
        }
        ox0.q qVar2 = qVar;
        if (m71.a.v(m71.a.O(new String[]{"RepositoryInvitation"}), set2, str, set)) {
            eVar.s0();
            uVar = t.c(eVar, wVar);
        } else {
            uVar = null;
        }
        ox0.u uVar2 = uVar;
        if (m71.a.v(m71.a.O(new String[]{"RepositoryVulnerabilityAlert"}), set2, str, set)) {
            eVar.s0();
            vVar = u.c(eVar, wVar);
        } else {
            vVar = null;
        }
        ox0.v vVar2 = vVar;
        if (m71.a.v(m71.a.O(new String[]{"RepositoryAdvisory"}), set2, str, set)) {
            eVar.s0();
            sVar = r.c(eVar, wVar);
        } else {
            sVar = null;
        }
        ox0.s sVar2 = sVar;
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            jVar = i.c(eVar, wVar);
        } else {
            jVar = null;
        }
        ox0.j jVar2 = jVar;
        if (m71.a.v(m71.a.O(new String[]{"RepositoryDependabotAlertsThread"}), set2, str, set)) {
            eVar.s0();
            tVar = s.c(eVar, wVar);
        } else {
            tVar = null;
        }
        ox0.t tVar2 = tVar;
        if (m71.a.v(m71.a.O(new String[]{"SecurityAdvisory"}), set2, str, set)) {
            eVar.s0();
            wVar2 = v.c(eVar, wVar);
        } else {
            wVar2 = null;
        }
        ox0.w wVar3 = wVar2;
        if (m71.a.v(m71.a.O(new String[]{"MemberFeatureRequestNotification"}), set2, str, set)) {
            eVar.s0();
            mVar = l.c(eVar, wVar);
        } else {
            mVar = null;
        }
        ox0.m mVar2 = mVar;
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2"}), set2, str, set)) {
            eVar.s0();
            oVar = n.c(eVar, wVar);
        } else {
            oVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CrossReferencedEvent", "DemilestonedEvent", "DependencyGraphManifest", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseMemberInvitation", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "IssueType", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "ParentIssueAddedEvent", "ParentIssueRemovedEvent", "Patch", "PinnedDiscussion", "PinnedEnvironment", "PinnedEvent", "PinnedIssue", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectNext", "ProjectNextField", "ProjectNextItem", "ProjectNextItemFieldValue", "ProjectNextIterationField", "ProjectNextSingleSelectField", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2StatusUpdate", "ProjectV2View", "ProjectV2Workflow", "ProjectView", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Query", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "Status", "StatusCheckRollup", "StatusContext", "SubIssueAddedEvent", "SubIssueRemovedEvent", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamDiscussion", "TeamDiscussionComment", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserNamespaceRepository", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"}), set2, str, set)) {
            eVar.s0();
            aVar = kw0.b.c(eVar, wVar);
        } else {
            aVar = null;
        }
        return new ox0.n0(str, iVar, kVar, zVar, hVar, b0Var, lVar, pVar2, qVar2, uVar2, vVar2, sVar2, jVar2, tVar2, wVar3, mVar2, oVar, aVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ox0.n0 n0Var = (ox0.n0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, n0Var.a);
        ox0.i iVar = n0Var.b;
        if (iVar != null) {
            h.d(fVar, wVar, iVar);
        }
        ox0.k kVar = n0Var.c;
        if (kVar != null) {
            j.d(fVar, wVar, kVar);
        }
        ox0.z zVar = n0Var.d;
        if (zVar != null) {
            y.d(fVar, wVar, zVar);
        }
        ox0.h hVar = n0Var.e;
        if (hVar != null) {
            g.d(fVar, wVar, hVar);
        }
        ox0.b0 b0Var = n0Var.f;
        if (b0Var != null) {
            a0.d(fVar, wVar, b0Var);
        }
        ox0.l lVar = n0Var.g;
        if (lVar != null) {
            k.d(fVar, wVar, lVar);
        }
        ox0.p pVar = n0Var.h;
        if (pVar != null) {
            o.d(fVar, wVar, pVar);
        }
        ox0.q qVar = n0Var.i;
        if (qVar != null) {
            p.d(fVar, wVar, qVar);
        }
        ox0.u uVar = n0Var.j;
        if (uVar != null) {
            t.d(fVar, wVar, uVar);
        }
        ox0.v vVar = n0Var.k;
        if (vVar != null) {
            u.d(fVar, wVar, vVar);
        }
        ox0.s sVar = n0Var.l;
        if (sVar != null) {
            r.d(fVar, wVar, sVar);
        }
        ox0.j jVar = n0Var.m;
        if (jVar != null) {
            i.d(fVar, wVar, jVar);
        }
        ox0.t tVar = n0Var.n;
        if (tVar != null) {
            s.d(fVar, wVar, tVar);
        }
        ox0.w wVar2 = n0Var.o;
        if (wVar2 != null) {
            v.d(fVar, wVar, wVar2);
        }
        ox0.m mVar = n0Var.p;
        if (mVar != null) {
            l.d(fVar, wVar, mVar);
        }
        ox0.o oVar = n0Var.q;
        if (oVar != null) {
            n.d(fVar, wVar, oVar);
        }
        kw0.a aVar = n0Var.r;
        if (aVar != null) {
            kw0.b.d(fVar, wVar, aVar);
        }
    }
}
