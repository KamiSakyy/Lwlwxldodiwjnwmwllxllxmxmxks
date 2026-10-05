package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.ik;
import m10.kk;
import m10.mk;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d2 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("displayName", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r2 = x61.l.r(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "AddedToProjectV2Event", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "BlockedByAddedEvent", "BlockedByRemovedEvent", "BlockingAddedEvent", "BlockingRemovedEvent", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedFromDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CopilotWorkFinishedEvent", "CopilotWorkFinishedFailureEvent", "CopilotWorkStartedEvent", "CrossReferencedEvent", "DemilestonedEvent", "DependencyGraphManifest", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseMemberInvitation", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "IssueCommentPinnedEvent", "IssueCommentUnpinnedEvent", "IssueFieldAddedEvent", "IssueFieldChangedEvent", "IssueFieldDate", "IssueFieldDateValue", "IssueFieldNumber", "IssueFieldNumberValue", "IssueFieldRemovedEvent", "IssueFieldSingleSelect", "IssueFieldSingleSelectOption", "IssueFieldSingleSelectValue", "IssueFieldText", "IssueFieldTextValue", "IssueType", "IssueTypeAddedEvent", "IssueTypeChangedEvent", "IssueTypeRemovedEvent", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MarketplaceCategory", "MarketplaceListing", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OIDCProvider", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "ParentIssueAddedEvent", "ParentIssueRemovedEvent", "Patch", "PinnedDiscussion", "PinnedEnvironment", "PinnedEvent", "PinnedIssue", "PinnedIssueComment", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2ItemStatusChangedEvent", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2StatusUpdate", "ProjectV2View", "ProjectV2Workflow", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Query", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RemovedFromProjectV2Event", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryCustomProperty", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "SponsorsActivity", "SponsorsListing", "SponsorsListingFeaturedItem", "SponsorsTier", "Sponsorship", "SponsorshipNewsletter", "Status", "StatusCheck", "StatusCheckRollup", "StatusContext", "SubIssueAddedEvent", "SubIssueRemovedEvent", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserNamespaceRepository", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"});
        List list = wx.a.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "Node", r2, list), new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Bot", sy.d0.n("Bot"), r)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        kk.Companion.getClass();
        aa.a0 a0Var = kk.s;
        k71.k.g(a0Var, "type");
        aa.s mVar4 = new aa.m("activeLockReason", a0Var, (String) null, rVar, rVar, rVar);
        List r4 = x61.l.r(new String[]{"Discussion", "Issue", "PullRequest"});
        List list2 = ut.a.a;
        List r5 = x61.l.r(new aa.s[]{mVar3, mVar4, no.a.c(list2, "selections", "Lockable", r4, list2)});
        m10.l.Companion.getClass();
        aa.j0 j0Var = m10.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar5 = new aa.m("actor", j0Var, (String) null, rVar, rVar, r3);
        mk.Companion.getClass();
        aa.j0 j0Var2 = mk.a;
        k71.k.g(j0Var2, "type");
        List r6 = x61.l.r(new aa.m[]{mVar5, new aa.m("lockedRecord", j0Var2, (String) null, rVar, rVar, r5)});
        ik.Companion.getClass();
        aa.q0 q0Var = ik.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("lockLockable", q0Var, (String) null, rVar, no.a.s(vp.i0, new aa.u0(a0.s0.p("lockableId", new aa.t("id")))), r6));
    }
}
