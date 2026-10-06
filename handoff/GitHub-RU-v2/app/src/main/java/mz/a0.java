package mz;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        lz.h hVar;
        lz.j jVar;
        lz.g gVar;
        lz.z zVar;
        lz.k kVar;
        lz.o oVar;
        lz.p pVar;
        lz.t tVar;
        lz.u uVar;
        lz.r rVar;
        lz.i iVar;
        lz.s sVar;
        lz.v vVar;
        lz.l lVar;
        lz.n nVar;
        vx.a aVar;
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
            hVar = g.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Gist"}), set2, str, set)) {
            eVar.s0();
            jVar = i.c(eVar, wVar);
        } else {
            jVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckSuite"}), set2, str, set)) {
            eVar.s0();
            gVar = f.c(eVar, wVar);
        } else {
            gVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"WorkflowRun"}), set2, str, set)) {
            eVar.s0();
            zVar = y.c(eVar, wVar);
        } else {
            zVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            kVar = j.c(eVar, wVar);
        } else {
            kVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            oVar = n.c(eVar, wVar);
        } else {
            oVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Release"}), set2, str, set)) {
            eVar.s0();
            pVar = o.c(eVar, wVar);
        } else {
            pVar = null;
        }
        lz.p pVar2 = pVar;
        if (m71.a.v(m71.a.O(new String[]{"RepositoryInvitation"}), set2, str, set)) {
            eVar.s0();
            tVar = s.c(eVar, wVar);
        } else {
            tVar = null;
        }
        lz.t tVar2 = tVar;
        if (m71.a.v(m71.a.O(new String[]{"RepositoryVulnerabilityAlert"}), set2, str, set)) {
            eVar.s0();
            uVar = t.c(eVar, wVar);
        } else {
            uVar = null;
        }
        lz.u uVar2 = uVar;
        if (m71.a.v(m71.a.O(new String[]{"RepositoryAdvisory"}), set2, str, set)) {
            eVar.s0();
            rVar = q.c(eVar, wVar);
        } else {
            rVar = null;
        }
        lz.r rVar2 = rVar;
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            iVar = h.c(eVar, wVar);
        } else {
            iVar = null;
        }
        lz.i iVar2 = iVar;
        if (m71.a.v(m71.a.O(new String[]{"RepositoryDependabotAlertsThread"}), set2, str, set)) {
            eVar.s0();
            sVar = r.c(eVar, wVar);
        } else {
            sVar = null;
        }
        lz.s sVar2 = sVar;
        if (m71.a.v(m71.a.O(new String[]{"SecurityAdvisory"}), set2, str, set)) {
            eVar.s0();
            vVar = u.c(eVar, wVar);
        } else {
            vVar = null;
        }
        lz.v vVar2 = vVar;
        if (m71.a.v(m71.a.O(new String[]{"MemberFeatureRequestNotification"}), set2, str, set)) {
            eVar.s0();
            lVar = k.c(eVar, wVar);
        } else {
            lVar = null;
        }
        lz.l lVar2 = lVar;
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2"}), set2, str, set)) {
            eVar.s0();
            nVar = m.c(eVar, wVar);
        } else {
            nVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "AddedToProjectV2Event", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "BlockedByAddedEvent", "BlockedByRemovedEvent", "BlockingAddedEvent", "BlockingRemovedEvent", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedFromDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CopilotWorkFinishedEvent", "CopilotWorkFinishedFailureEvent", "CopilotWorkStartedEvent", "CrossReferencedEvent", "DemilestonedEvent", "DependencyGraphManifest", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseMemberInvitation", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "IssueCommentPinnedEvent", "IssueCommentUnpinnedEvent", "IssueFieldAddedEvent", "IssueFieldChangedEvent", "IssueFieldDate", "IssueFieldDateValue", "IssueFieldNumber", "IssueFieldNumberValue", "IssueFieldRemovedEvent", "IssueFieldSingleSelect", "IssueFieldSingleSelectOption", "IssueFieldSingleSelectValue", "IssueFieldText", "IssueFieldTextValue", "IssueType", "IssueTypeAddedEvent", "IssueTypeChangedEvent", "IssueTypeRemovedEvent", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MarketplaceCategory", "MarketplaceListing", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OIDCProvider", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "ParentIssueAddedEvent", "ParentIssueRemovedEvent", "Patch", "PinnedDiscussion", "PinnedEnvironment", "PinnedEvent", "PinnedIssue", "PinnedIssueComment", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2ItemStatusChangedEvent", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2StatusUpdate", "ProjectV2View", "ProjectV2Workflow", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Query", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RemovedFromProjectV2Event", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryCustomProperty", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "SponsorsActivity", "SponsorsListing", "SponsorsListingFeaturedItem", "SponsorsTier", "Sponsorship", "SponsorshipNewsletter", "Status", "StatusCheck", "StatusCheckRollup", "StatusContext", "SubIssueAddedEvent", "SubIssueRemovedEvent", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserNamespaceRepository", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"}), set2, str, set)) {
            eVar.s0();
            aVar = vx.b.c(eVar, wVar);
        } else {
            aVar = null;
        }
        return new lz.b0(str, hVar, jVar, gVar, zVar, kVar, oVar, pVar2, tVar2, uVar2, rVar2, iVar2, sVar2, vVar2, lVar2, nVar, aVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        lz.b0 b0Var = (lz.b0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, b0Var.a);
        lz.h hVar = b0Var.b;
        if (hVar != null) {
            g.d(fVar, wVar, hVar);
        }
        lz.j jVar = b0Var.c;
        if (jVar != null) {
            i.d(fVar, wVar, jVar);
        }
        lz.g gVar = b0Var.d;
        if (gVar != null) {
            f.d(fVar, wVar, gVar);
        }
        lz.z zVar = b0Var.e;
        if (zVar != null) {
            y.d(fVar, wVar, zVar);
        }
        lz.k kVar = b0Var.f;
        if (kVar != null) {
            j.d(fVar, wVar, kVar);
        }
        lz.o oVar = b0Var.g;
        if (oVar != null) {
            n.d(fVar, wVar, oVar);
        }
        lz.p pVar = b0Var.h;
        if (pVar != null) {
            o.d(fVar, wVar, pVar);
        }
        lz.t tVar = b0Var.i;
        if (tVar != null) {
            s.d(fVar, wVar, tVar);
        }
        lz.u uVar = b0Var.j;
        if (uVar != null) {
            t.d(fVar, wVar, uVar);
        }
        lz.r rVar = b0Var.k;
        if (rVar != null) {
            q.d(fVar, wVar, rVar);
        }
        lz.i iVar = b0Var.l;
        if (iVar != null) {
            h.d(fVar, wVar, iVar);
        }
        lz.s sVar = b0Var.m;
        if (sVar != null) {
            r.d(fVar, wVar, sVar);
        }
        lz.v vVar = b0Var.n;
        if (vVar != null) {
            u.d(fVar, wVar, vVar);
        }
        lz.l lVar = b0Var.o;
        if (lVar != null) {
            k.d(fVar, wVar, lVar);
        }
        lz.n nVar = b0Var.p;
        if (nVar != null) {
            m.d(fVar, wVar, nVar);
        }
        vx.a aVar = b0Var.q;
        if (aVar != null) {
            vx.b.d(fVar, wVar, aVar);
        }
    }
}
