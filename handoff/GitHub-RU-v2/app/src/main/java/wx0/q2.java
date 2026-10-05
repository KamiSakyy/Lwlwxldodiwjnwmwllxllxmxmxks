package wx0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q2 implements aa.a {
    public static final q2 a = new q2();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        d1 d1Var;
        h1 h1Var;
        m1 m1Var;
        e1 e1Var;
        l1 l1Var;
        f1 f1Var;
        g1 g1Var;
        n1 n1Var;
        j1 j1Var;
        i1 i1Var;
        k1 k1Var;
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
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldDateValue"}), set2, str, set)) {
            eVar.s0();
            d1Var = l3.c(eVar, wVar);
        } else {
            d1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldNumberValue"}), set2, str, set)) {
            eVar.s0();
            h1Var = p3.c(eVar, wVar);
        } else {
            h1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldTextValue"}), set2, str, set)) {
            eVar.s0();
            m1Var = u3.c(eVar, wVar);
        } else {
            m1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldIterationValue"}), set2, str, set)) {
            eVar.s0();
            e1Var = m3.c(eVar, wVar);
        } else {
            e1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldSingleSelectValue"}), set2, str, set)) {
            eVar.s0();
            l1Var = t3.c(eVar, wVar);
        } else {
            l1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldLabelValue"}), set2, str, set)) {
            eVar.s0();
            f1Var = n3.c(eVar, wVar);
        } else {
            f1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldMilestoneValue"}), set2, str, set)) {
            eVar.s0();
            g1Var = o3.c(eVar, wVar);
        } else {
            g1Var = null;
        }
        g1 g1Var2 = g1Var;
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldUserValue"}), set2, str, set)) {
            eVar.s0();
            n1Var = v3.c(eVar, wVar);
        } else {
            n1Var = null;
        }
        n1 n1Var2 = n1Var;
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldRepositoryValue"}), set2, str, set)) {
            eVar.s0();
            j1Var = r3.c(eVar, wVar);
        } else {
            j1Var = null;
        }
        j1 j1Var2 = j1Var;
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldPullRequestValue"}), set2, str, set)) {
            eVar.s0();
            i1Var = q3.c(eVar, wVar);
        } else {
            i1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2ItemFieldReviewerValue"}), set2, str, set)) {
            eVar.s0();
            k1Var = s3.c(eVar, wVar);
        } else {
            k1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CrossReferencedEvent", "DemilestonedEvent", "DependencyGraphManifest", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseMemberInvitation", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "IssueType", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "ParentIssueAddedEvent", "ParentIssueRemovedEvent", "Patch", "PinnedDiscussion", "PinnedEnvironment", "PinnedEvent", "PinnedIssue", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectNext", "ProjectNextField", "ProjectNextItem", "ProjectNextItemFieldValue", "ProjectNextIterationField", "ProjectNextSingleSelectField", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2StatusUpdate", "ProjectV2View", "ProjectV2Workflow", "ProjectView", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Query", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "Status", "StatusCheckRollup", "StatusContext", "SubIssueAddedEvent", "SubIssueRemovedEvent", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamDiscussion", "TeamDiscussionComment", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserNamespaceRepository", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"}), set2, str, set)) {
            eVar.s0();
            aVar = kw0.b.c(eVar, wVar);
        } else {
            aVar = null;
        }
        return new i0(str, d1Var, h1Var, m1Var, e1Var, l1Var, f1Var, g1Var2, n1Var2, j1Var2, i1Var, k1Var, aVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i0 i0Var = (i0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i0Var.a);
        d1 d1Var = i0Var.b;
        if (d1Var != null) {
            l3.d(fVar, wVar, d1Var);
        }
        h1 h1Var = i0Var.c;
        if (h1Var != null) {
            p3.d(fVar, wVar, h1Var);
        }
        m1 m1Var = i0Var.d;
        if (m1Var != null) {
            u3.d(fVar, wVar, m1Var);
        }
        e1 e1Var = i0Var.e;
        if (e1Var != null) {
            m3.d(fVar, wVar, e1Var);
        }
        l1 l1Var = i0Var.f;
        if (l1Var != null) {
            t3.d(fVar, wVar, l1Var);
        }
        f1 f1Var = i0Var.g;
        if (f1Var != null) {
            n3.d(fVar, wVar, f1Var);
        }
        g1 g1Var = i0Var.h;
        if (g1Var != null) {
            o3.d(fVar, wVar, g1Var);
        }
        n1 n1Var = i0Var.i;
        if (n1Var != null) {
            v3.d(fVar, wVar, n1Var);
        }
        j1 j1Var = i0Var.j;
        if (j1Var != null) {
            r3.d(fVar, wVar, j1Var);
        }
        i1 i1Var = i0Var.k;
        if (i1Var != null) {
            q3.d(fVar, wVar, i1Var);
        }
        k1 k1Var = i0Var.l;
        if (k1Var != null) {
            s3.d(fVar, wVar, k1Var);
        }
        kw0.a aVar = i0Var.m;
        if (aVar != null) {
            kw0.b.d(fVar, wVar, aVar);
        }
    }
}
