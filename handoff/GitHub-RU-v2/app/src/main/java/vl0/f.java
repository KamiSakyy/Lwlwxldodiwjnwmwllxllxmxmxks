package vl0;

import com.github.service.models.response.type.MobileSubjectType;
import gn0.qh;
import gn0.rh;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MobileSubjectType.values().length];
        try {
            iArr[MobileSubjectType.CHECK_SUITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobileSubjectType.COMMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MobileSubjectType.COMMITS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MobileSubjectType.COPILOT_PAYWALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MobileSubjectType.COPILOT_SETTINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MobileSubjectType.DEPLOYMENT_REVIEW.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[MobileSubjectType.DIFF.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[MobileSubjectType.DISCUSSION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[MobileSubjectType.DISCUSSIONS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[MobileSubjectType.FEED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[MobileSubjectType.DRAFT_ISSUE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[MobileSubjectType.FILE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[MobileSubjectType.FILTER_AUTHOR.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[MobileSubjectType.FILTER_ASSIGNEE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[MobileSubjectType.FILTER_DISCUSSION_CATEGORY.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[MobileSubjectType.FILTER_DISCUSSION_IS_UNANSWERED.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[MobileSubjectType.FILTER_DISCUSSION_TOP.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[MobileSubjectType.FILTER_DISCUSSION_VIEWER.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[MobileSubjectType.FILTER_ISSUE_STATUS.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[MobileSubjectType.FILTER_ISSUE_VIEWER.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[MobileSubjectType.FILTER_LABEL.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[MobileSubjectType.FILTER_MILESTONE.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[MobileSubjectType.FILTER_NOTIFICATION_IS_UNREAD.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[MobileSubjectType.FILTER_NOTIFICATION_STATUS.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[MobileSubjectType.FILTER_NOTIFICATION_FILTER.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[MobileSubjectType.FILTER_ORGANIZATION.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[MobileSubjectType.FILTER_PROJECT.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[MobileSubjectType.FILTER_PULL_REQUEST_REVIEW_STATUS.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[MobileSubjectType.FILTER_PULL_REQUEST_STATUS.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[MobileSubjectType.FILTER_PULL_REQUEST_VIEWER.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[MobileSubjectType.FILTER_REPOSITORY.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[MobileSubjectType.FILTER_REPOSITORY_VISIBILITY.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[MobileSubjectType.FILTER_SORT.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[MobileSubjectType.FILTER_TRENDING_DATE_RANGE.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[MobileSubjectType.FILTER_TRENDING_LANGUAGE.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[MobileSubjectType.FILTER_TRENDING_SPOKEN_LANGUAGE.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[MobileSubjectType.GIST.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[MobileSubjectType.HOME.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[MobileSubjectType.ISSUE.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[MobileSubjectType.ISSUES.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[MobileSubjectType.NOTIFICATIONS.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[MobileSubjectType.ORGANIZATION.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[MobileSubjectType.PROJECT.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[MobileSubjectType.PROJECTS.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[MobileSubjectType.PULL_REQUEST.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[MobileSubjectType.PULL_REQUESTS.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATIONS.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_MENTION.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_PULL_REQUEST_REVIEW.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_RELEASE.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_REVIEW_REQUEST.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_ASSIGN.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_DEPLOYMENT_APPROVAL.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[MobileSubjectType.RELEASE.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[MobileSubjectType.RELEASES.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORIES.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_ADVISORY.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_DEPENDABOT_THREAD_ALERT.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_VULNERABILITY_ALERT.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[MobileSubjectType.SECURITY_ADVISORY.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[MobileSubjectType.SHORTCUT.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[MobileSubjectType.SWIPE_ACTIONS.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[MobileSubjectType.TEAM_DISCUSSION.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[MobileSubjectType.WORKFLOW_RUN.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[MobileSubjectType.USER.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr[MobileSubjectType.USERS.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_MOBILE_AUTH_REQUEST.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr[MobileSubjectType.FILTER_REPOSITORY_TYPE.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr[MobileSubjectType.FILTER_LANGUAGE.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_ACTION.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr[MobileSubjectType.TOAST.ordinal()] = 72;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr[MobileSubjectType.SETTINGS.ordinal()] = 73;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr[MobileSubjectType.NAVIGATION_BAR.ordinal()] = 74;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr[MobileSubjectType.DEEP_LINK.ordinal()] = 75;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr[MobileSubjectType.FILTER_DISCUSSION_STATUS.ordinal()] = 76;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr[MobileSubjectType.CODE.ordinal()] = 77;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr[MobileSubjectType.GLOBAL_SEARCH.ordinal()] = 78;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr[MobileSubjectType.JUMP_TO.ordinal()] = 79;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr[MobileSubjectType.ORGANIZATIONS.ordinal()] = 80;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr[MobileSubjectType.SUBMIT_REVIEW_SHEET.ordinal()] = 81;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr[MobileSubjectType.COPILOT_UPSELL.ordinal()] = 82;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr[MobileSubjectType.FILTER_NOTIFICATION_FOCUSED.ordinal()] = 83;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr[MobileSubjectType.FILTER_ISSUE_TYPE.ordinal()] = 84;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr[MobileSubjectType.BRANCHES.ordinal()] = 85;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr[MobileSubjectType.SUB_ISSUE.ordinal()] = 86;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK.ordinal()] = 87;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr[MobileSubjectType.CUSTOM_AGENT.ordinal()] = 88;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr[MobileSubjectType.EMPTY_STATE.ordinal()] = 89;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr[MobileSubjectType.EMPTY_STATE_CTA.ordinal()] = 90;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr[MobileSubjectType.FILTER.ordinal()] = 91;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr[MobileSubjectType.SEARCH.ordinal()] = 92;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr[MobileSubjectType.SEND_AGENT_TASK.ordinal()] = 93;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr[MobileSubjectType.FILTER_DRAFT.ordinal()] = 94;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr[MobileSubjectType.FILTER_VIEWER_REVIEW_REQUESTED.ordinal()] = 95;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_DISABLE_LIVE_UPDATES.ordinal()] = 96;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_LIVE_UPDATE_AGENTS.ordinal()] = 97;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr[MobileSubjectType.AGENT_ASSIGNMENT.ordinal()] = 98;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr[MobileSubjectType.FILTER_AGENT_TASK_STATE.ordinal()] = 99;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr[MobileSubjectType.FILTER_AGENT_TASKS_SORT.ordinal()] = 100;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK_CCA.ordinal()] = 101;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK_CLI.ordinal()] = 102;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK_CLI_REPOLESS.ordinal()] = 103;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK_VSCODE.ordinal()] = 104;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_CREATION.ordinal()] = 105;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr[MobileSubjectType.UNKNOWN__.ordinal()] = 106;
        } catch (NoSuchFieldError unused106) {
        }
        a = iArr;
        int[] iArr2 = new int[rh.values().length];
        try {
            qh qhVar = rh.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            qh qhVar2 = rh.Companion;
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            qh qhVar3 = rh.Companion;
            iArr2[3] = 3;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            qh qhVar4 = rh.Companion;
            iArr2[5] = 4;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            qh qhVar5 = rh.Companion;
            iArr2[6] = 5;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            qh qhVar6 = rh.Companion;
            iArr2[7] = 6;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            qh qhVar7 = rh.Companion;
            iArr2[8] = 7;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            qh qhVar8 = rh.Companion;
            iArr2[10] = 8;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            qh qhVar9 = rh.Companion;
            iArr2[9] = 9;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            qh qhVar10 = rh.Companion;
            iArr2[11] = 10;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            qh qhVar11 = rh.Companion;
            iArr2[12] = 11;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            qh qhVar12 = rh.Companion;
            iArr2[13] = 12;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            qh qhVar13 = rh.Companion;
            iArr2[14] = 13;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            qh qhVar14 = rh.Companion;
            iArr2[15] = 14;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            qh qhVar15 = rh.Companion;
            iArr2[16] = 15;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            qh qhVar16 = rh.Companion;
            iArr2[17] = 16;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            qh qhVar17 = rh.Companion;
            iArr2[19] = 17;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            qh qhVar18 = rh.Companion;
            iArr2[21] = 18;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            qh qhVar19 = rh.Companion;
            iArr2[22] = 19;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            qh qhVar20 = rh.Companion;
            iArr2[20] = 20;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            qh qhVar21 = rh.Companion;
            iArr2[23] = 21;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            qh qhVar22 = rh.Companion;
            iArr2[24] = 22;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            qh qhVar23 = rh.Companion;
            iArr2[25] = 23;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            qh qhVar24 = rh.Companion;
            iArr2[26] = 24;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            qh qhVar25 = rh.Companion;
            iArr2[27] = 25;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            qh qhVar26 = rh.Companion;
            iArr2[28] = 26;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            qh qhVar27 = rh.Companion;
            iArr2[30] = 27;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            qh qhVar28 = rh.Companion;
            iArr2[31] = 28;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            qh qhVar29 = rh.Companion;
            iArr2[32] = 29;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            qh qhVar30 = rh.Companion;
            iArr2[33] = 30;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            qh qhVar31 = rh.Companion;
            iArr2[34] = 31;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            qh qhVar32 = rh.Companion;
            iArr2[35] = 32;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            qh qhVar33 = rh.Companion;
            iArr2[37] = 33;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            qh qhVar34 = rh.Companion;
            iArr2[38] = 34;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            qh qhVar35 = rh.Companion;
            iArr2[39] = 35;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            qh qhVar36 = rh.Companion;
            iArr2[42] = 36;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            qh qhVar37 = rh.Companion;
            iArr2[43] = 37;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            qh qhVar38 = rh.Companion;
            iArr2[45] = 38;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            qh qhVar39 = rh.Companion;
            iArr2[46] = 39;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            qh qhVar40 = rh.Companion;
            iArr2[47] = 40;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            qh qhVar41 = rh.Companion;
            iArr2[48] = 41;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            qh qhVar42 = rh.Companion;
            iArr2[49] = 42;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            qh qhVar43 = rh.Companion;
            iArr2[53] = 43;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            qh qhVar44 = rh.Companion;
            iArr2[55] = 44;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            qh qhVar45 = rh.Companion;
            iArr2[56] = 45;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            qh qhVar46 = rh.Companion;
            iArr2[57] = 46;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            qh qhVar47 = rh.Companion;
            iArr2[51] = 47;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            qh qhVar48 = rh.Companion;
            iArr2[52] = 48;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            qh qhVar49 = rh.Companion;
            iArr2[58] = 49;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            qh qhVar50 = rh.Companion;
            iArr2[59] = 50;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            qh qhVar51 = rh.Companion;
            iArr2[60] = 51;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            qh qhVar52 = rh.Companion;
            iArr2[61] = 52;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            qh qhVar53 = rh.Companion;
            iArr2[62] = 53;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            qh qhVar54 = rh.Companion;
            iArr2[63] = 54;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            qh qhVar55 = rh.Companion;
            iArr2[64] = 55;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            qh qhVar56 = rh.Companion;
            iArr2[65] = 56;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            qh qhVar57 = rh.Companion;
            iArr2[67] = 57;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            qh qhVar58 = rh.Companion;
            iArr2[68] = 58;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            qh qhVar59 = rh.Companion;
            iArr2[69] = 59;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            qh qhVar60 = rh.Companion;
            iArr2[73] = 60;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            qh qhVar61 = rh.Companion;
            iArr2[71] = 61;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            qh qhVar62 = rh.Companion;
            iArr2[72] = 62;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            qh qhVar63 = rh.Companion;
            iArr2[54] = 63;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            qh qhVar64 = rh.Companion;
            iArr2[74] = 64;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            qh qhVar65 = rh.Companion;
            iArr2[29] = 65;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            qh qhVar66 = rh.Companion;
            iArr2[18] = 66;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            qh qhVar67 = rh.Companion;
            iArr2[50] = 67;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            qh qhVar68 = rh.Companion;
            iArr2[41] = 68;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            qh qhVar69 = rh.Companion;
            iArr2[66] = 69;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            qh qhVar70 = rh.Companion;
            iArr2[70] = 70;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            qh qhVar71 = rh.Companion;
            iArr2[4] = 71;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            qh qhVar72 = rh.Companion;
            iArr2[1] = 72;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            qh qhVar73 = rh.Companion;
            iArr2[36] = 73;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            qh qhVar74 = rh.Companion;
            iArr2[40] = 74;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            qh qhVar75 = rh.Companion;
            iArr2[44] = 75;
        } catch (NoSuchFieldError unused181) {
        }
    }
}
