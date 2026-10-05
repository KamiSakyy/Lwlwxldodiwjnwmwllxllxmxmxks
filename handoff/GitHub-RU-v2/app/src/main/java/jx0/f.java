package jx0;

import com.github.service.models.response.type.MobileSubjectType;
import pz0.mk;
import pz0.nk;

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
            iArr[MobileSubjectType.DRAFT_ISSUE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[MobileSubjectType.FEED.ordinal()] = 11;
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
            iArr[MobileSubjectType.FILTER_NOTIFICATION_FOCUSED.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[MobileSubjectType.FILTER_ORGANIZATION.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[MobileSubjectType.FILTER_PROJECT.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[MobileSubjectType.FILTER_PULL_REQUEST_REVIEW_STATUS.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[MobileSubjectType.FILTER_PULL_REQUEST_STATUS.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[MobileSubjectType.FILTER_PULL_REQUEST_VIEWER.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[MobileSubjectType.FILTER_REPOSITORY.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[MobileSubjectType.FILTER_REPOSITORY_VISIBILITY.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[MobileSubjectType.FILTER_SORT.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[MobileSubjectType.FILTER_TRENDING_DATE_RANGE.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[MobileSubjectType.FILTER_TRENDING_LANGUAGE.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[MobileSubjectType.FILTER_TRENDING_SPOKEN_LANGUAGE.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[MobileSubjectType.GIST.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[MobileSubjectType.HOME.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[MobileSubjectType.ISSUE.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[MobileSubjectType.ISSUES.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[MobileSubjectType.NOTIFICATIONS.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[MobileSubjectType.ORGANIZATION.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[MobileSubjectType.PROJECT.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[MobileSubjectType.PROJECTS.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[MobileSubjectType.PULL_REQUEST.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[MobileSubjectType.PULL_REQUESTS.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATIONS.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_MENTION.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_PULL_REQUEST_REVIEW.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_RELEASE.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_REVIEW_REQUEST.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_ASSIGN.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_DEPLOYMENT_APPROVAL.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[MobileSubjectType.RELEASE.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[MobileSubjectType.RELEASES.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORIES.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_ADVISORY.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_DEPENDABOT_THREAD_ALERT.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_VULNERABILITY_ALERT.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[MobileSubjectType.SECURITY_ADVISORY.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[MobileSubjectType.SHORTCUT.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[MobileSubjectType.SWIPE_ACTIONS.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[MobileSubjectType.TEAM_DISCUSSION.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[MobileSubjectType.WORKFLOW_RUN.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr[MobileSubjectType.USER.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr[MobileSubjectType.USERS.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_MOBILE_AUTH_REQUEST.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr[MobileSubjectType.FILTER_REPOSITORY_TYPE.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr[MobileSubjectType.FILTER_LANGUAGE.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_ACTION.ordinal()] = 72;
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
            iArr[MobileSubjectType.FILTER_DISCUSSION_STATUS.ordinal()] = 77;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr[MobileSubjectType.UNKNOWN__.ordinal()] = 78;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr[MobileSubjectType.CODE.ordinal()] = 79;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr[MobileSubjectType.GLOBAL_SEARCH.ordinal()] = 80;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr[MobileSubjectType.JUMP_TO.ordinal()] = 81;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr[MobileSubjectType.ORGANIZATIONS.ordinal()] = 82;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr[MobileSubjectType.SUBMIT_REVIEW_SHEET.ordinal()] = 83;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr[MobileSubjectType.COPILOT_UPSELL.ordinal()] = 84;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr[MobileSubjectType.FILTER_ISSUE_TYPE.ordinal()] = 85;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr[MobileSubjectType.BRANCHES.ordinal()] = 86;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr[MobileSubjectType.SUB_ISSUE.ordinal()] = 87;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK.ordinal()] = 88;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr[MobileSubjectType.CUSTOM_AGENT.ordinal()] = 89;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr[MobileSubjectType.EMPTY_STATE.ordinal()] = 90;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr[MobileSubjectType.EMPTY_STATE_CTA.ordinal()] = 91;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr[MobileSubjectType.FILTER.ordinal()] = 92;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr[MobileSubjectType.SEARCH.ordinal()] = 93;
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
            iArr[MobileSubjectType.SEND_AGENT_TASK.ordinal()] = 106;
        } catch (NoSuchFieldError unused106) {
        }
        a = iArr;
        int[] iArr2 = new int[nk.values().length];
        try {
            mk mkVar = nk.Companion;
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            mk mkVar2 = nk.Companion;
            iArr2[3] = 2;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            mk mkVar3 = nk.Companion;
            iArr2[4] = 3;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            mk mkVar4 = nk.Companion;
            iArr2[5] = 4;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            mk mkVar5 = nk.Companion;
            iArr2[6] = 5;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            mk mkVar6 = nk.Companion;
            iArr2[7] = 6;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            mk mkVar7 = nk.Companion;
            iArr2[9] = 7;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            mk mkVar8 = nk.Companion;
            iArr2[10] = 8;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            mk mkVar9 = nk.Companion;
            iArr2[11] = 9;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            mk mkVar10 = nk.Companion;
            iArr2[12] = 10;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            mk mkVar11 = nk.Companion;
            iArr2[13] = 11;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            mk mkVar12 = nk.Companion;
            iArr2[14] = 12;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            mk mkVar13 = nk.Companion;
            iArr2[15] = 13;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            mk mkVar14 = nk.Companion;
            iArr2[17] = 14;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            mk mkVar15 = nk.Companion;
            iArr2[16] = 15;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            mk mkVar16 = nk.Companion;
            iArr2[18] = 16;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            mk mkVar17 = nk.Companion;
            iArr2[19] = 17;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            mk mkVar18 = nk.Companion;
            iArr2[20] = 18;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            mk mkVar19 = nk.Companion;
            iArr2[21] = 19;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            mk mkVar20 = nk.Companion;
            iArr2[22] = 20;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            mk mkVar21 = nk.Companion;
            iArr2[24] = 21;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            mk mkVar22 = nk.Companion;
            iArr2[25] = 22;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            mk mkVar23 = nk.Companion;
            iArr2[27] = 23;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            mk mkVar24 = nk.Companion;
            iArr2[30] = 24;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            mk mkVar25 = nk.Companion;
            iArr2[31] = 25;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            mk mkVar26 = nk.Companion;
            iArr2[28] = 26;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            mk mkVar27 = nk.Companion;
            iArr2[29] = 27;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            mk mkVar28 = nk.Companion;
            iArr2[32] = 28;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            mk mkVar29 = nk.Companion;
            iArr2[33] = 29;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            mk mkVar30 = nk.Companion;
            iArr2[34] = 30;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            mk mkVar31 = nk.Companion;
            iArr2[35] = 31;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            mk mkVar32 = nk.Companion;
            iArr2[36] = 32;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            mk mkVar33 = nk.Companion;
            iArr2[37] = 33;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            mk mkVar34 = nk.Companion;
            iArr2[39] = 34;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            mk mkVar35 = nk.Companion;
            iArr2[40] = 35;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            mk mkVar36 = nk.Companion;
            iArr2[41] = 36;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            mk mkVar37 = nk.Companion;
            iArr2[42] = 37;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            mk mkVar38 = nk.Companion;
            iArr2[43] = 38;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            mk mkVar39 = nk.Companion;
            iArr2[44] = 39;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            mk mkVar40 = nk.Companion;
            iArr2[46] = 40;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            mk mkVar41 = nk.Companion;
            iArr2[47] = 41;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            mk mkVar42 = nk.Companion;
            iArr2[48] = 42;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            mk mkVar43 = nk.Companion;
            iArr2[51] = 43;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            mk mkVar44 = nk.Companion;
            iArr2[52] = 44;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            mk mkVar45 = nk.Companion;
            iArr2[54] = 45;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            mk mkVar46 = nk.Companion;
            iArr2[55] = 46;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            mk mkVar47 = nk.Companion;
            iArr2[56] = 47;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            mk mkVar48 = nk.Companion;
            iArr2[57] = 48;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            mk mkVar49 = nk.Companion;
            iArr2[58] = 49;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            mk mkVar50 = nk.Companion;
            iArr2[62] = 50;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            mk mkVar51 = nk.Companion;
            iArr2[64] = 51;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            mk mkVar52 = nk.Companion;
            iArr2[65] = 52;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            mk mkVar53 = nk.Companion;
            iArr2[66] = 53;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            mk mkVar54 = nk.Companion;
            iArr2[60] = 54;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            mk mkVar55 = nk.Companion;
            iArr2[61] = 55;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            mk mkVar56 = nk.Companion;
            iArr2[67] = 56;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            mk mkVar57 = nk.Companion;
            iArr2[68] = 57;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            mk mkVar58 = nk.Companion;
            iArr2[69] = 58;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            mk mkVar59 = nk.Companion;
            iArr2[70] = 59;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            mk mkVar60 = nk.Companion;
            iArr2[71] = 60;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            mk mkVar61 = nk.Companion;
            iArr2[72] = 61;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            mk mkVar62 = nk.Companion;
            iArr2[73] = 62;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            mk mkVar63 = nk.Companion;
            iArr2[74] = 63;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            mk mkVar64 = nk.Companion;
            iArr2[76] = 64;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            mk mkVar65 = nk.Companion;
            iArr2[79] = 65;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            mk mkVar66 = nk.Companion;
            iArr2[80] = 66;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            mk mkVar67 = nk.Companion;
            iArr2[84] = 67;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            mk mkVar68 = nk.Companion;
            iArr2[82] = 68;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            mk mkVar69 = nk.Companion;
            iArr2[83] = 69;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            mk mkVar70 = nk.Companion;
            iArr2[63] = 70;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            mk mkVar71 = nk.Companion;
            iArr2[85] = 71;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            mk mkVar72 = nk.Companion;
            iArr2[38] = 72;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            mk mkVar73 = nk.Companion;
            iArr2[26] = 73;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            mk mkVar74 = nk.Companion;
            iArr2[59] = 74;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            mk mkVar75 = nk.Companion;
            iArr2[50] = 75;
        } catch (NoSuchFieldError unused181) {
        }
        try {
            mk mkVar76 = nk.Companion;
            iArr2[75] = 76;
        } catch (NoSuchFieldError unused182) {
        }
        try {
            mk mkVar77 = nk.Companion;
            iArr2[81] = 77;
        } catch (NoSuchFieldError unused183) {
        }
        try {
            mk mkVar78 = nk.Companion;
            iArr2[8] = 78;
        } catch (NoSuchFieldError unused184) {
        }
        try {
            mk mkVar79 = nk.Companion;
            iArr2[2] = 79;
        } catch (NoSuchFieldError unused185) {
        }
        try {
            mk mkVar80 = nk.Companion;
            iArr2[45] = 80;
        } catch (NoSuchFieldError unused186) {
        }
        try {
            mk mkVar81 = nk.Companion;
            iArr2[49] = 81;
        } catch (NoSuchFieldError unused187) {
        }
        try {
            mk mkVar82 = nk.Companion;
            iArr2[53] = 82;
        } catch (NoSuchFieldError unused188) {
        }
        try {
            mk mkVar83 = nk.Companion;
            iArr2[77] = 83;
        } catch (NoSuchFieldError unused189) {
        }
        try {
            mk mkVar84 = nk.Companion;
            iArr2[23] = 84;
        } catch (NoSuchFieldError unused190) {
        }
        try {
            mk mkVar85 = nk.Companion;
            iArr2[0] = 85;
        } catch (NoSuchFieldError unused191) {
        }
        try {
            mk mkVar86 = nk.Companion;
            iArr2[78] = 86;
        } catch (NoSuchFieldError unused192) {
        }
    }
}
