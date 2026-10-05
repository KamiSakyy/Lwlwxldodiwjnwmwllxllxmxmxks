package ab0;

import com.github.service.models.response.type.MobileSubjectType;
import hc0.qg;
import hc0.rg;

/* loaded from: /home/user/work/p/classes3.dex */
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
            iArr[MobileSubjectType.PUSH_NOTIFICATION_REVIEW_REQUEST.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_ASSIGN.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_DEPLOYMENT_APPROVAL.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[MobileSubjectType.RELEASE.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[MobileSubjectType.RELEASES.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORIES.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_ADVISORY.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_DEPENDABOT_THREAD_ALERT.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_VULNERABILITY_ALERT.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[MobileSubjectType.SECURITY_ADVISORY.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[MobileSubjectType.SHORTCUT.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[MobileSubjectType.SWIPE_ACTIONS.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[MobileSubjectType.TEAM_DISCUSSION.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[MobileSubjectType.WORKFLOW_RUN.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[MobileSubjectType.USER.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[MobileSubjectType.USERS.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_MOBILE_AUTH_REQUEST.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr[MobileSubjectType.FILTER_REPOSITORY_TYPE.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr[MobileSubjectType.FILTER_LANGUAGE.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_ACTION.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr[MobileSubjectType.FILTER_DISCUSSION_STATUS.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_RELEASE.ordinal()] = 72;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr[MobileSubjectType.TOAST.ordinal()] = 73;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr[MobileSubjectType.SETTINGS.ordinal()] = 74;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr[MobileSubjectType.NAVIGATION_BAR.ordinal()] = 75;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr[MobileSubjectType.DEEP_LINK.ordinal()] = 76;
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
        int[] iArr2 = new int[rg.values().length];
        try {
            qg qgVar = rg.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            qg qgVar2 = rg.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            qg qgVar3 = rg.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            qg qgVar4 = rg.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            qg qgVar5 = rg.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            qg qgVar6 = rg.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            qg qgVar7 = rg.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            qg qgVar8 = rg.Companion;
            iArr2[8] = 8;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            qg qgVar9 = rg.Companion;
            iArr2[7] = 9;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            qg qgVar10 = rg.Companion;
            iArr2[9] = 10;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            qg qgVar11 = rg.Companion;
            iArr2[10] = 11;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            qg qgVar12 = rg.Companion;
            iArr2[11] = 12;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            qg qgVar13 = rg.Companion;
            iArr2[12] = 13;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            qg qgVar14 = rg.Companion;
            iArr2[13] = 14;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            qg qgVar15 = rg.Companion;
            iArr2[14] = 15;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            qg qgVar16 = rg.Companion;
            iArr2[15] = 16;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            qg qgVar17 = rg.Companion;
            iArr2[17] = 17;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            qg qgVar18 = rg.Companion;
            iArr2[19] = 18;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            qg qgVar19 = rg.Companion;
            iArr2[20] = 19;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            qg qgVar20 = rg.Companion;
            iArr2[18] = 20;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            qg qgVar21 = rg.Companion;
            iArr2[21] = 21;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            qg qgVar22 = rg.Companion;
            iArr2[22] = 22;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            qg qgVar23 = rg.Companion;
            iArr2[23] = 23;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            qg qgVar24 = rg.Companion;
            iArr2[24] = 24;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            qg qgVar25 = rg.Companion;
            iArr2[25] = 25;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            qg qgVar26 = rg.Companion;
            iArr2[26] = 26;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            qg qgVar27 = rg.Companion;
            iArr2[28] = 27;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            qg qgVar28 = rg.Companion;
            iArr2[29] = 28;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            qg qgVar29 = rg.Companion;
            iArr2[30] = 29;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            qg qgVar30 = rg.Companion;
            iArr2[31] = 30;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            qg qgVar31 = rg.Companion;
            iArr2[32] = 31;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            qg qgVar32 = rg.Companion;
            iArr2[33] = 32;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            qg qgVar33 = rg.Companion;
            iArr2[34] = 33;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            qg qgVar34 = rg.Companion;
            iArr2[35] = 34;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            qg qgVar35 = rg.Companion;
            iArr2[36] = 35;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            qg qgVar36 = rg.Companion;
            iArr2[37] = 36;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            qg qgVar37 = rg.Companion;
            iArr2[38] = 37;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            qg qgVar38 = rg.Companion;
            iArr2[39] = 38;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            qg qgVar39 = rg.Companion;
            iArr2[40] = 39;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            qg qgVar40 = rg.Companion;
            iArr2[41] = 40;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            qg qgVar41 = rg.Companion;
            iArr2[42] = 41;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            qg qgVar42 = rg.Companion;
            iArr2[43] = 42;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            qg qgVar43 = rg.Companion;
            iArr2[47] = 43;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            qg qgVar44 = rg.Companion;
            iArr2[49] = 44;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            qg qgVar45 = rg.Companion;
            iArr2[50] = 45;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            qg qgVar46 = rg.Companion;
            iArr2[45] = 46;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            qg qgVar47 = rg.Companion;
            iArr2[46] = 47;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            qg qgVar48 = rg.Companion;
            iArr2[51] = 48;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            qg qgVar49 = rg.Companion;
            iArr2[52] = 49;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            qg qgVar50 = rg.Companion;
            iArr2[53] = 50;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            qg qgVar51 = rg.Companion;
            iArr2[54] = 51;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            qg qgVar52 = rg.Companion;
            iArr2[55] = 52;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            qg qgVar53 = rg.Companion;
            iArr2[56] = 53;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            qg qgVar54 = rg.Companion;
            iArr2[57] = 54;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            qg qgVar55 = rg.Companion;
            iArr2[58] = 55;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            qg qgVar56 = rg.Companion;
            iArr2[59] = 56;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            qg qgVar57 = rg.Companion;
            iArr2[60] = 57;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            qg qgVar58 = rg.Companion;
            iArr2[61] = 58;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            qg qgVar59 = rg.Companion;
            iArr2[64] = 59;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            qg qgVar60 = rg.Companion;
            iArr2[62] = 60;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            qg qgVar61 = rg.Companion;
            iArr2[63] = 61;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            qg qgVar62 = rg.Companion;
            iArr2[48] = 62;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            qg qgVar63 = rg.Companion;
            iArr2[65] = 63;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            qg qgVar64 = rg.Companion;
            iArr2[27] = 64;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            qg qgVar65 = rg.Companion;
            iArr2[16] = 65;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            qg qgVar66 = rg.Companion;
            iArr2[44] = 66;
        } catch (NoSuchFieldError unused172) {
        }
    }
}
