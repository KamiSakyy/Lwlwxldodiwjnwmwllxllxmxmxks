package fq;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.eh;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        m mVar2 = new m("displayName", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        List r = l.r(new m[]{mVar, mVar2, new m("isCopilot", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("isAgent", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", xVar2, (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar4 = new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        s mVar5 = new m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        List r3 = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = b.a;
        s c = no.a.c(list, "selections", "Actor", r3, list);
        List r4 = l.r(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "AddedToProjectV2Event", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "BlockedByAddedEvent", "BlockedByRemovedEvent", "BlockingAddedEvent", "BlockingRemovedEvent", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedFromDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CopilotWorkFinishedEvent", "CopilotWorkFinishedFailureEvent", "CopilotWorkStartedEvent", "CrossReferencedEvent", "DemilestonedEvent", "DependencyGraphManifest", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseMemberInvitation", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "IssueCommentPinnedEvent", "IssueCommentUnpinnedEvent", "IssueFieldAddedEvent", "IssueFieldChangedEvent", "IssueFieldDate", "IssueFieldDateValue", "IssueFieldNumber", "IssueFieldNumberValue", "IssueFieldRemovedEvent", "IssueFieldSingleSelect", "IssueFieldSingleSelectOption", "IssueFieldSingleSelectValue", "IssueFieldText", "IssueFieldTextValue", "IssueType", "IssueTypeAddedEvent", "IssueTypeChangedEvent", "IssueTypeRemovedEvent", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MarketplaceCategory", "MarketplaceListing", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OIDCProvider", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "ParentIssueAddedEvent", "ParentIssueRemovedEvent", "Patch", "PinnedDiscussion", "PinnedEnvironment", "PinnedEvent", "PinnedIssue", "PinnedIssueComment", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2ItemStatusChangedEvent", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2StatusUpdate", "ProjectV2View", "ProjectV2Workflow", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Query", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RemovedFromProjectV2Event", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryCustomProperty", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "SponsorsActivity", "SponsorsListing", "SponsorsListingFeaturedItem", "SponsorsTier", "Sponsorship", "SponsorshipNewsletter", "Status", "StatusCheck", "StatusCheckRollup", "StatusContext", "SubIssueAddedEvent", "SubIssueRemovedEvent", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserNamespaceRepository", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"});
        List list2 = wx.a.a;
        a = l.r(new s[]{mVar3, mVar4, mVar5, c, no.a.c(list2, "selections", "Node", r4, list2), new n("Bot", d0.n("Bot"), r), new n("User", d0.n("User"), r2)});
    }
}
