package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.l60;
import m10.mr;
import m10.n60;
import m10.oj;
import m10.os;
import m10.p00;
import m10.qs;
import m10.wg;
import m10.wh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c5 {
    public static final List a;

    static {
        ch.Companion.getClass();
        aa.x xVar = ch.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        aa.s mVar = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("Issue");
        List list = dt.c.a;
        aa.s c = no.a.c(list, "selections", "Issue", n2, list);
        ah.Companion.getClass();
        aa.x xVar3 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        wh.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("issue", v8.l0.b(wh.B), (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        os.Companion.getClass();
        List n3 = sy.d0.n(new aa.m("nodes", v8.l0.a(os.a), (String) null, rVar, rVar, r2));
        aa.m mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        oj.Companion.getClass();
        aa.q0 q0Var = oj.a;
        k71.k.g(q0Var, "type");
        aa.m mVar5 = new aa.m("issueTypes", q0Var, (String) null, rVar, rVar, n);
        qs.Companion.getClass();
        aa.q0 q0Var2 = qs.a;
        k71.k.g(q0Var2, "type");
        i30.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, new aa.m("pinnedIssues", q0Var2, (String) null, rVar, no.a.s(i30.I, new aa.u0(3)), n3)});
        wg.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Issue", sy.d0.n("Issue"), list), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.s mVar6 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n4 = sy.d0.n("PullRequest");
        List list2 = hv.i.a;
        List r6 = x61.l.r(new aa.s[]{mVar6, no.a.c(list2, "selections", "PullRequest", n4, list2), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.s mVar7 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r7 = x61.l.r(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "AddedToProjectV2Event", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "BlockedByAddedEvent", "BlockedByRemovedEvent", "BlockingAddedEvent", "BlockingRemovedEvent", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedFromDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CopilotWorkFinishedEvent", "CopilotWorkFinishedFailureEvent", "CopilotWorkStartedEvent", "CrossReferencedEvent", "DemilestonedEvent", "DependencyGraphManifest", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseMemberInvitation", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "IssueCommentPinnedEvent", "IssueCommentUnpinnedEvent", "IssueFieldAddedEvent", "IssueFieldChangedEvent", "IssueFieldDate", "IssueFieldDateValue", "IssueFieldNumber", "IssueFieldNumberValue", "IssueFieldRemovedEvent", "IssueFieldSingleSelect", "IssueFieldSingleSelectOption", "IssueFieldSingleSelectValue", "IssueFieldText", "IssueFieldTextValue", "IssueType", "IssueTypeAddedEvent", "IssueTypeChangedEvent", "IssueTypeRemovedEvent", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MarketplaceCategory", "MarketplaceListing", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OIDCProvider", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "ParentIssueAddedEvent", "ParentIssueRemovedEvent", "Patch", "PinnedDiscussion", "PinnedEnvironment", "PinnedEvent", "PinnedIssue", "PinnedIssueComment", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2ItemStatusChangedEvent", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2StatusUpdate", "ProjectV2View", "ProjectV2Workflow", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Query", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RemovedFromProjectV2Event", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryCustomProperty", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "SponsorsActivity", "SponsorsListing", "SponsorsListingFeaturedItem", "SponsorsTier", "Sponsorship", "SponsorshipNewsletter", "Status", "StatusCheck", "StatusCheckRollup", "StatusContext", "SubIssueAddedEvent", "SubIssueRemovedEvent", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserNamespaceRepository", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"});
        List list3 = wx.a.a;
        List r8 = x61.l.r(new aa.s[]{mVar7, no.a.c(list3, "selections", "Node", r7, list3), new aa.n("Issue", sy.d0.n("Issue"), r5), new aa.n("PullRequest", sy.d0.n("PullRequest"), r6)});
        aa.m mVar8 = new aa.m("issueCount", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        mr.Companion.getClass();
        aa.m mVar9 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r4);
        l60.Companion.getClass();
        List r9 = x61.l.r(new aa.m[]{mVar8, mVar9, new aa.m("nodes", v8.l0.a(l60.a), (String) null, rVar, rVar, r8)});
        aa.q0 q0Var3 = i30.w0;
        k71.k.g(q0Var3, "type");
        List n5 = sy.d0.n(new aa.l("include", false));
        p00.Companion.getClass();
        aa.m mVar10 = new aa.m("repository", q0Var3, (String) null, n5, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("name"))), new aa.k(p00.m, new aa.u0(new aa.t("owner")))}), r3);
        n60.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar10, new aa.m("search", v8.l0.b(n60.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.v, new aa.u0(new aa.t("after"))), new aa.k(p00.w, new aa.u0(new aa.t("first"))), new aa.k(p00.x, new aa.u0(new aa.t("query"))), new aa.k(p00.y, new aa.u0("ISSUE"))}), r9), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
