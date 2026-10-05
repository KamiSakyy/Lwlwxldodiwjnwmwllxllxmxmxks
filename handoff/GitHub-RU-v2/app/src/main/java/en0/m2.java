package en0;

import gn0.cg;
import gn0.eq;
import gn0.gg;
import gn0.hb;
import gn0.lb;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.tc;
import gn0.yf;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m2 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("MergeQueue");
        List list = jh0.c.a;
        aa.s c = no.a.c(list, "selections", "MergeQueue", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("MergeQueueEntry");
        List list2 = jh0.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list2, "selections", "MergeQueueEntry", n2, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        aa.m mVar4 = new aa.m("headRefOid", v8.l0.b(hb.a), (String) null, rVar, rVar, rVar);
        gg.Companion.getClass();
        aa.m mVar5 = new aa.m("mergeStateStatus", v8.l0.b(gg.s), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        aa.m mVar6 = new aa.m("isInMergeQueue", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar);
        yf.Companion.getClass();
        aa.q0 q0Var = yf.c;
        k71.k.g(q0Var, "type");
        aa.m mVar7 = new aa.m("mergeQueue", q0Var, (String) null, rVar, rVar, r);
        cg.Companion.getClass();
        aa.q0 q0Var2 = cg.a;
        k71.k.g(q0Var2, "type");
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, mVar6, mVar7, new aa.m("mergeQueueEntry", q0Var2, (String) null, rVar, rVar, r2)});
        aa.s mVar8 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r4 = x61.l.r(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CrossReferencedEvent", "DemilestonedEvent", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "Patch", "PinnedDiscussion", "PinnedEvent", "PinnedIssue", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectNext", "ProjectNextField", "ProjectNextItem", "ProjectNextItemFieldValue", "ProjectNextIterationField", "ProjectNextSingleSelectField", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2View", "ProjectV2Workflow", "ProjectView", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "Status", "StatusCheckRollup", "StatusContext", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamDiscussion", "TeamDiscussionComment", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"});
        List list3 = cl0.a.a;
        List r5 = x61.l.r(new aa.s[]{mVar8, no.a.c(list3, "selections", "Node", r4, list3), new aa.n("PullRequest", sy.d0.n("PullRequest"), r3)});
        aa.m mVar9 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        tc.Companion.getClass();
        aa.x0 x0Var = tc.a;
        k71.k.g(x0Var, "type");
        eq.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar9, new aa.m("issueOrPullRequest", x0Var, (String) null, rVar, no.a.s(eq.p, new aa.u0(new aa.t("number"))), r5), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = eq.m0;
        k71.k.g(q0Var3, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(rn.m, new aa.u0(new aa.t("repositoryOwner")))}), r6));
    }
}
