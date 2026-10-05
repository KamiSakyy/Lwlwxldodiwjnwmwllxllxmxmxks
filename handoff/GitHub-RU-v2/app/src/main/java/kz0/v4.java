package kz0;

import java.util.List;
import pz0.hm;
import pz0.hn;
import pz0.jn;
import pz0.jx;
import pz0.l00;
import pz0.le;
import pz0.n00;
import pz0.pd;
import pz0.qf;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v4 {
    public static final List a;

    static {
        vd.Companion.getClass();
        aa.x xVar = vd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        aa.s mVar = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("Issue");
        List list = vr0.b.a;
        aa.s c = no.a.c(list, "selections", "Issue", n2, list);
        td.Companion.getClass();
        aa.x xVar3 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        le.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("issue", v8.l0.b(le.A), (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hn.Companion.getClass();
        List n3 = sy.d0.n(new aa.m("nodes", v8.l0.a(hn.a), (String) null, rVar, rVar, r2));
        aa.m mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        qf.Companion.getClass();
        aa.q0 q0Var = qf.a;
        k71.k.g(q0Var, "type");
        aa.m mVar5 = new aa.m("issueTypes", q0Var, (String) null, rVar, rVar, n);
        jn.Companion.getClass();
        aa.q0 q0Var2 = jn.a;
        k71.k.g(q0Var2, "type");
        jx.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, new aa.m("pinnedIssues", q0Var2, (String) null, rVar, no.a.s(jx.L, new aa.u0(3)), n3)});
        pd.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Issue", sy.d0.n("Issue"), list), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.s mVar6 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n4 = sy.d0.n("PullRequest");
        List list2 = yt0.h.a;
        List r6 = x61.l.r(new aa.s[]{mVar6, no.a.c(list2, "selections", "PullRequest", n4, list2), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.s mVar7 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r7 = x61.l.r(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CrossReferencedEvent", "DemilestonedEvent", "DependencyGraphManifest", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseMemberInvitation", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "IssueType", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "ParentIssueAddedEvent", "ParentIssueRemovedEvent", "Patch", "PinnedDiscussion", "PinnedEnvironment", "PinnedEvent", "PinnedIssue", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectNext", "ProjectNextField", "ProjectNextItem", "ProjectNextItemFieldValue", "ProjectNextIterationField", "ProjectNextSingleSelectField", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2StatusUpdate", "ProjectV2View", "ProjectV2Workflow", "ProjectView", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Query", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "Status", "StatusCheckRollup", "StatusContext", "SubIssueAddedEvent", "SubIssueRemovedEvent", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamDiscussion", "TeamDiscussionComment", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserNamespaceRepository", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"});
        List list3 = lw0.a.a;
        List r8 = x61.l.r(new aa.s[]{mVar7, no.a.c(list3, "selections", "Node", r7, list3), new aa.n("Issue", sy.d0.n("Issue"), r5), new aa.n("PullRequest", sy.d0.n("PullRequest"), r6)});
        aa.m mVar8 = new aa.m("issueCount", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        hm.Companion.getClass();
        aa.m mVar9 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r4);
        l00.Companion.getClass();
        List r9 = x61.l.r(new aa.m[]{mVar8, mVar9, new aa.m("nodes", v8.l0.a(l00.a), (String) null, rVar, rVar, r8)});
        aa.q0 q0Var3 = jx.t0;
        k71.k.g(q0Var3, "type");
        List n5 = sy.d0.n(new aa.l("include", false));
        su.Companion.getClass();
        aa.m mVar10 = new aa.m("repository", q0Var3, (String) null, n5, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("name"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r3);
        n00.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar10, new aa.m("search", v8.l0.b(n00.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.p, new aa.u0(new aa.t("after"))), new aa.k(su.q, new aa.u0(new aa.t("first"))), new aa.k(su.r, new aa.u0(new aa.t("query"))), new aa.k(su.s, new aa.u0("ISSUE"))}), r9), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
