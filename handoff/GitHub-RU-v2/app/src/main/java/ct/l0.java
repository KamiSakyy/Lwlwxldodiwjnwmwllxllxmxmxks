package ct;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 implements aa.a {
    public static final l0 a = new l0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        vx.a aVar;
        et.a aVar2;
        vv.b bVar;
        iq.c cVar;
        ex.c cVar2;
        yq.n nVar;
        xv.b bVar2;
        nt.c cVar3;
        gx.c cVar4;
        vt.b bVar3;
        ix.b bVar4;
        hu.b bVar5;
        wr.b bVar6;
        sr.j jVar;
        tv.f fVar;
        av.b bVar7;
        kx.b bVar8;
        cr.c cVar5;
        cx.c cVar6;
        xt.k kVar;
        tx.c cVar7;
        kr.e eVar2;
        gr.e eVar3;
        gs.e eVar4;
        ww.d dVar;
        ww.l lVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Achievement", "AchievementTier", "AddedToMergeQueueEvent", "AddedToProjectEvent", "AddedToProjectV2Event", "App", "AssignedEvent", "AutoMergeDisabledEvent", "AutoMergeEnabledEvent", "AutoRebaseEnabledEvent", "AutoSquashEnabledEvent", "AutomaticBaseChangeFailedEvent", "AutomaticBaseChangeSucceededEvent", "BaseRefChangedEvent", "BaseRefDeletedEvent", "BaseRefForcePushedEvent", "Blob", "BlockedByAddedEvent", "BlockedByRemovedEvent", "BlockingAddedEvent", "BlockingRemovedEvent", "Bot", "BranchProtectionRule", "BypassForcePushAllowance", "BypassPullRequestAllowance", "CWE", "CheckRun", "CheckSuite", "ClosedEvent", "CodeOfConduct", "CommentDeletedEvent", "Commit", "CommitComment", "CommitCommentThread", "Comparison", "ConnectedEvent", "ConvertToDraftEvent", "ConvertedFromDraftEvent", "ConvertedNoteToIssueEvent", "ConvertedToDiscussionEvent", "CopilotWorkFinishedEvent", "CopilotWorkFinishedFailureEvent", "CopilotWorkStartedEvent", "CrossReferencedEvent", "DemilestonedEvent", "DependencyGraphManifest", "DeployKey", "DeployedEvent", "Deployment", "DeploymentEnvironmentChangedEvent", "DeploymentReview", "DeploymentStatus", "DisconnectedEvent", "Discussion", "DiscussionCategory", "DiscussionComment", "DiscussionPoll", "DiscussionPollOption", "DraftIssue", "Enterprise", "EnterpriseAdministratorInvitation", "EnterpriseIdentityProvider", "EnterpriseMemberInvitation", "EnterpriseRepositoryInfo", "EnterpriseServerInstallation", "EnterpriseServerUserAccount", "EnterpriseServerUserAccountEmail", "EnterpriseServerUserAccountsUpload", "EnterpriseUserAccount", "Environment", "ExternalIdentity", "Gist", "GistComment", "HeadRefDeletedEvent", "HeadRefForcePushedEvent", "HeadRefRestoredEvent", "IpAllowListEntry", "Issue", "IssueComment", "IssueCommentPinnedEvent", "IssueCommentUnpinnedEvent", "IssueFieldAddedEvent", "IssueFieldChangedEvent", "IssueFieldDate", "IssueFieldDateValue", "IssueFieldNumber", "IssueFieldNumberValue", "IssueFieldRemovedEvent", "IssueFieldSingleSelect", "IssueFieldSingleSelectOption", "IssueFieldSingleSelectValue", "IssueFieldText", "IssueFieldTextValue", "IssueType", "IssueTypeAddedEvent", "IssueTypeChangedEvent", "IssueTypeRemovedEvent", "Label", "LabeledEvent", "Language", "License", "LinkedBranch", "LockedEvent", "Mannequin", "MarkedAsDuplicateEvent", "MarketplaceCategory", "MarketplaceListing", "MemberFeatureRequestNotification", "MembersCanDeleteReposClearAuditEntry", "MembersCanDeleteReposDisableAuditEntry", "MembersCanDeleteReposEnableAuditEntry", "MentionedEvent", "MergeQueue", "MergeQueueEntry", "MergedEvent", "MigrationSource", "Milestone", "MilestonedEvent", "MobilePushNotificationSchedule", "MovedColumnsInProjectEvent", "NotificationFilter", "NotificationThread", "OIDCProvider", "OauthApplicationCreateAuditEntry", "OrgAddBillingManagerAuditEntry", "OrgAddMemberAuditEntry", "OrgBlockUserAuditEntry", "OrgConfigDisableCollaboratorsOnlyAuditEntry", "OrgConfigEnableCollaboratorsOnlyAuditEntry", "OrgCreateAuditEntry", "OrgDisableOauthAppRestrictionsAuditEntry", "OrgDisableSamlAuditEntry", "OrgDisableTwoFactorRequirementAuditEntry", "OrgEnableOauthAppRestrictionsAuditEntry", "OrgEnableSamlAuditEntry", "OrgEnableTwoFactorRequirementAuditEntry", "OrgInviteMemberAuditEntry", "OrgInviteToBusinessAuditEntry", "OrgOauthAppAccessApprovedAuditEntry", "OrgOauthAppAccessBlockedAuditEntry", "OrgOauthAppAccessDeniedAuditEntry", "OrgOauthAppAccessRequestedAuditEntry", "OrgOauthAppAccessUnblockedAuditEntry", "OrgRemoveBillingManagerAuditEntry", "OrgRemoveMemberAuditEntry", "OrgRemoveOutsideCollaboratorAuditEntry", "OrgRestoreMemberAuditEntry", "OrgUnblockUserAuditEntry", "OrgUpdateDefaultRepositoryPermissionAuditEntry", "OrgUpdateMemberAuditEntry", "OrgUpdateMemberRepositoryCreationPermissionAuditEntry", "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry", "Organization", "OrganizationIdentityProvider", "OrganizationInvitation", "OrganizationMigration", "Package", "PackageFile", "PackageTag", "PackageVersion", "ParentIssueAddedEvent", "ParentIssueRemovedEvent", "Patch", "PinnedDiscussion", "PinnedEnvironment", "PinnedEvent", "PinnedIssue", "PinnedIssueComment", "PrivateRepositoryForkingDisableAuditEntry", "PrivateRepositoryForkingEnableAuditEntry", "Project", "ProjectCard", "ProjectColumn", "ProjectV2", "ProjectV2Field", "ProjectV2Item", "ProjectV2ItemFieldDateValue", "ProjectV2ItemFieldIterationValue", "ProjectV2ItemFieldNumberValue", "ProjectV2ItemFieldSingleSelectValue", "ProjectV2ItemFieldTextValue", "ProjectV2ItemStatusChangedEvent", "ProjectV2IterationField", "ProjectV2SingleSelectField", "ProjectV2StatusUpdate", "ProjectV2View", "ProjectV2Workflow", "PublicKey", "PullRequest", "PullRequestCommit", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "PullRequestReviewThread", "PullRequestThread", "Push", "PushAllowance", "Query", "Reaction", "ReadyForReviewEvent", "Ref", "ReferencedEvent", "Release", "ReleaseAsset", "RemovedFromMergeQueueEvent", "RemovedFromProjectEvent", "RemovedFromProjectV2Event", "RenamedTitleEvent", "ReopenedEvent", "RepoAccessAuditEntry", "RepoAddMemberAuditEntry", "RepoAddTopicAuditEntry", "RepoArchivedAuditEntry", "RepoChangeMergeSettingAuditEntry", "RepoConfigDisableAnonymousGitAccessAuditEntry", "RepoConfigDisableCollaboratorsOnlyAuditEntry", "RepoConfigDisableContributorsOnlyAuditEntry", "RepoConfigDisableSockpuppetDisallowedAuditEntry", "RepoConfigEnableAnonymousGitAccessAuditEntry", "RepoConfigEnableCollaboratorsOnlyAuditEntry", "RepoConfigEnableContributorsOnlyAuditEntry", "RepoConfigEnableSockpuppetDisallowedAuditEntry", "RepoConfigLockAnonymousGitAccessAuditEntry", "RepoConfigUnlockAnonymousGitAccessAuditEntry", "RepoCreateAuditEntry", "RepoDestroyAuditEntry", "RepoRemoveMemberAuditEntry", "RepoRemoveTopicAuditEntry", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "RepositoryCustomProperty", "RepositoryDependabotAlertsThread", "RepositoryInvitation", "RepositoryMigration", "RepositoryRule", "RepositoryRuleset", "RepositoryRulesetBypassActor", "RepositoryTopic", "RepositoryVisibilityChangeDisableAuditEntry", "RepositoryVisibilityChangeEnableAuditEntry", "RepositoryVulnerabilityAlert", "RequiredStatusCheck", "ReviewDismissalAllowance", "ReviewDismissedEvent", "ReviewRequest", "ReviewRequestRemovedEvent", "ReviewRequestedEvent", "SavedReply", "SearchShortcut", "SecurityAdvisory", "SponsorsActivity", "SponsorsListing", "SponsorsListingFeaturedItem", "SponsorsTier", "Sponsorship", "SponsorshipNewsletter", "Status", "StatusCheck", "StatusCheckRollup", "StatusContext", "SubIssueAddedEvent", "SubIssueRemovedEvent", "SubscribedEvent", "Tag", "Team", "TeamAddMemberAuditEntry", "TeamAddRepositoryAuditEntry", "TeamChangeParentTeamAuditEntry", "TeamDashboard", "TeamRemoveMemberAuditEntry", "TeamRemoveRepositoryAuditEntry", "TeamSearchShortcut", "Topic", "TransferredEvent", "Tree", "UnassignedEvent", "UnlabeledEvent", "UnlockedEvent", "UnmarkedAsDuplicateEvent", "UnpinnedEvent", "UnsubscribedEvent", "User", "UserBlockedEvent", "UserContentEdit", "UserDashboard", "UserList", "UserNamespaceRepository", "UserStatus", "VerifiableDomain", "Workflow", "WorkflowRun", "WorkflowRunFile"}), set2, str, set)) {
            eVar.s0();
            aVar = vx.b.c(eVar, wVar);
        } else {
            aVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"IssueComment"}), set2, str, set)) {
            eVar.s0();
            aVar2 = et.b.c(eVar, wVar);
        } else {
            aVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RenamedTitleEvent"}), set2, str, set)) {
            eVar.s0();
            bVar = vv.d.c(eVar, wVar);
        } else {
            bVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"AssignedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar = iq.e.c(eVar, wVar);
        } else {
            cVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"UnassignedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar2 = ex.f.c(eVar, wVar);
        } else {
            cVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ClosedEvent"}), set2, str, set)) {
            eVar.s0();
            nVar = yq.r.c(eVar, wVar);
        } else {
            nVar = null;
        }
        ex.c cVar8 = cVar2;
        if (m71.a.v(m71.a.O(new String[]{"ReopenedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar2 = xv.d.c(eVar, wVar);
        } else {
            bVar2 = null;
        }
        xv.b bVar9 = bVar2;
        if (m71.a.v(m71.a.O(new String[]{"LabeledEvent"}), set2, str, set)) {
            eVar.s0();
            cVar3 = nt.f.c(eVar, wVar);
        } else {
            cVar3 = null;
        }
        nt.c cVar9 = cVar3;
        if (m71.a.v(m71.a.O(new String[]{"UnlabeledEvent"}), set2, str, set)) {
            eVar.s0();
            cVar4 = gx.f.c(eVar, wVar);
        } else {
            cVar4 = null;
        }
        gx.c cVar10 = cVar4;
        if (m71.a.v(m71.a.O(new String[]{"LockedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar3 = vt.d.c(eVar, wVar);
        } else {
            bVar3 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"UnlockedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar4 = ix.d.c(eVar, wVar);
        } else {
            bVar4 = null;
        }
        ix.b bVar10 = bVar4;
        if (m71.a.v(m71.a.O(new String[]{"MilestonedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar5 = hu.d.c(eVar, wVar);
        } else {
            bVar5 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DemilestonedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar6 = wr.d.c(eVar, wVar);
        } else {
            bVar6 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CrossReferencedEvent"}), set2, str, set)) {
            eVar.s0();
            jVar = sr.l.c(eVar, wVar);
        } else {
            jVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ReferencedEvent"}), set2, str, set)) {
            eVar.s0();
            fVar = tv.k.c(eVar, wVar);
        } else {
            fVar = null;
        }
        hu.b bVar11 = bVar5;
        if (m71.a.v(m71.a.O(new String[]{"PinnedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar7 = av.d.c(eVar, wVar);
        } else {
            bVar7 = null;
        }
        av.b bVar12 = bVar7;
        if (m71.a.v(m71.a.O(new String[]{"UnpinnedEvent"}), set2, str, set)) {
            eVar.s0();
            bVar8 = kx.d.c(eVar, wVar);
        } else {
            bVar8 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CommentDeletedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar5 = cr.e.c(eVar, wVar);
        } else {
            cVar5 = null;
        }
        kx.b bVar13 = bVar8;
        if (m71.a.v(m71.a.O(new String[]{"TransferredEvent"}), set2, str, set)) {
            eVar.s0();
            cVar6 = cx.f.c(eVar, wVar);
        } else {
            cVar6 = null;
        }
        cx.c cVar11 = cVar6;
        if (m71.a.v(m71.a.O(new String[]{"MarkedAsDuplicateEvent"}), set2, str, set)) {
            eVar.s0();
            kVar = xt.q.c(eVar, wVar);
        } else {
            kVar = null;
        }
        xt.k kVar2 = kVar;
        if (m71.a.v(m71.a.O(new String[]{"UserBlockedEvent"}), set2, str, set)) {
            eVar.s0();
            cVar7 = tx.e.c(eVar, wVar);
        } else {
            cVar7 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ConvertedToDiscussionEvent"}), set2, str, set)) {
            eVar.s0();
            eVar2 = kr.g.c(eVar, wVar);
        } else {
            eVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ConnectedEvent"}), set2, str, set)) {
            eVar.s0();
            eVar3 = gr.g.c(eVar, wVar);
        } else {
            eVar3 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DisconnectedEvent"}), set2, str, set)) {
            eVar.s0();
            eVar4 = gs.g.c(eVar, wVar);
        } else {
            eVar4 = null;
        }
        tx.c cVar12 = cVar7;
        if (m71.a.v(m71.a.O(new String[]{"SubIssueAddedEvent"}), set2, str, set)) {
            eVar.s0();
            dVar = ww.h.c(eVar, wVar);
        } else {
            dVar = null;
        }
        ww.d dVar2 = dVar;
        if (m71.a.v(m71.a.O(new String[]{"SubIssueRemovedEvent"}), set2, str, set)) {
            eVar.s0();
            lVar = ww.p.c(eVar, wVar);
        } else {
            lVar = null;
        }
        kr.e eVar5 = eVar2;
        return new g0(str, aVar, aVar2, bVar, cVar, cVar8, nVar, bVar9, cVar9, cVar10, bVar3, bVar10, bVar11, bVar6, jVar, fVar, bVar12, bVar13, cVar5, cVar11, kVar2, cVar12, eVar5, eVar3, eVar4, dVar2, lVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g0 g0Var = (g0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, g0Var.a);
        vx.a aVar = g0Var.b;
        if (aVar != null) {
            vx.b.d(fVar, wVar, aVar);
        }
        et.a aVar2 = g0Var.c;
        if (aVar2 != null) {
            et.b.d(fVar, wVar, aVar2);
        }
        vv.b bVar = g0Var.d;
        if (bVar != null) {
            vv.d.d(fVar, wVar, bVar);
        }
        iq.c cVar = g0Var.e;
        if (cVar != null) {
            iq.e.d(fVar, wVar, cVar);
        }
        ex.c cVar2 = g0Var.f;
        if (cVar2 != null) {
            ex.f.d(fVar, wVar, cVar2);
        }
        yq.n nVar = g0Var.g;
        if (nVar != null) {
            yq.r.d(fVar, wVar, nVar);
        }
        xv.b bVar2 = g0Var.h;
        if (bVar2 != null) {
            xv.d.d(fVar, wVar, bVar2);
        }
        nt.c cVar3 = g0Var.i;
        if (cVar3 != null) {
            nt.f.d(fVar, wVar, cVar3);
        }
        gx.c cVar4 = g0Var.j;
        if (cVar4 != null) {
            gx.f.d(fVar, wVar, cVar4);
        }
        vt.b bVar3 = g0Var.k;
        if (bVar3 != null) {
            vt.d.d(fVar, wVar, bVar3);
        }
        ix.b bVar4 = g0Var.l;
        if (bVar4 != null) {
            ix.d.d(fVar, wVar, bVar4);
        }
        hu.b bVar5 = g0Var.m;
        if (bVar5 != null) {
            hu.d.d(fVar, wVar, bVar5);
        }
        wr.b bVar6 = g0Var.n;
        if (bVar6 != null) {
            wr.d.d(fVar, wVar, bVar6);
        }
        sr.j jVar = g0Var.o;
        if (jVar != null) {
            sr.l.d(fVar, wVar, jVar);
        }
        tv.f fVar2 = g0Var.p;
        if (fVar2 != null) {
            tv.k.d(fVar, wVar, fVar2);
        }
        av.b bVar7 = g0Var.q;
        if (bVar7 != null) {
            av.d.d(fVar, wVar, bVar7);
        }
        kx.b bVar8 = g0Var.r;
        if (bVar8 != null) {
            kx.d.d(fVar, wVar, bVar8);
        }
        cr.c cVar5 = g0Var.s;
        if (cVar5 != null) {
            cr.e.d(fVar, wVar, cVar5);
        }
        cx.c cVar6 = g0Var.t;
        if (cVar6 != null) {
            cx.f.d(fVar, wVar, cVar6);
        }
        xt.k kVar = g0Var.u;
        if (kVar != null) {
            xt.q.d(fVar, wVar, kVar);
        }
        tx.c cVar7 = g0Var.v;
        if (cVar7 != null) {
            tx.e.d(fVar, wVar, cVar7);
        }
        kr.e eVar = g0Var.w;
        if (eVar != null) {
            kr.g.d(fVar, wVar, eVar);
        }
        gr.e eVar2 = g0Var.x;
        if (eVar2 != null) {
            gr.g.d(fVar, wVar, eVar2);
        }
        gs.e eVar3 = g0Var.y;
        if (eVar3 != null) {
            gs.g.d(fVar, wVar, eVar3);
        }
        ww.d dVar = g0Var.z;
        if (dVar != null) {
            ww.h.d(fVar, wVar, dVar);
        }
        ww.l lVar = g0Var.A;
        if (lVar != null) {
            ww.p.d(fVar, wVar, lVar);
        }
    }
}
