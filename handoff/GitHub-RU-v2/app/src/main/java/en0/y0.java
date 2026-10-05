package en0;

import gn0.bt;
import gn0.dt;
import gn0.eq;
import gn0.jj;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y0 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        lb.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r3 = x61.l.r(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CrossReferencedEvent", "DemilestonedEvent", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "Patch", "PinnedDiscussion", "PinnedEvent", "PinnedIssue", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectNext", "ProjectNextField", "ProjectNextItem", "ProjectNextItemFieldValue", "ProjectNextIterationField", "ProjectNextSingleSelectField", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2View", "ProjectV2Workflow", "ProjectView", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "Status", "StatusCheckRollup", "StatusContext", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamDiscussion", "TeamDiscussionComment", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"});
        List list = cl0.a.a;
        aa.s c = no.a.c(list, "selections", "Node", r3, list);
        List n = sy.d0.n("Discussion");
        List list2 = vf0.e.a;
        List r4 = x61.l.r(new aa.s[]{mVar3, c, no.a.c(list2, "selections", "Discussion", n, list2)});
        rb.Companion.getClass();
        aa.m mVar4 = new aa.m("discussionCount", v8.l0.b(rb.a), (String) null, rVar, rVar, rVar);
        jj.Companion.getClass();
        aa.m mVar5 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r2);
        bt.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("nodes", v8.l0.a(bt.a), (String) null, rVar, rVar, r4)});
        eq.Companion.getClass();
        aa.q0 q0Var = eq.m0;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.l("include", false));
        rn.Companion.getClass();
        aa.m mVar6 = new aa.m("repository", q0Var, (String) null, n2, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("name"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r);
        dt.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar6, new aa.m("search", v8.l0.b(dt.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.p, new aa.u0(new aa.t("after"))), new aa.k(rn.q, new aa.u0(new aa.t("first"))), new aa.k(rn.r, new aa.u0(new aa.t("query"))), new aa.k(rn.s, new aa.u0("DISCUSSION"))}), r5)});
    }
}
