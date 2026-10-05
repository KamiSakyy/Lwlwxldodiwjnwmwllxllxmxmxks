package dz;

import com.github.service.models.response.type.MobileSubjectType;
import m10.np;
import m10.op;

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
            iArr[MobileSubjectType.PUSH_NOTIFICATION_DISABLE_LIVE_UPDATES.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_LIVE_UPDATE_AGENTS.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[MobileSubjectType.RELEASE.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[MobileSubjectType.RELEASES.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORIES.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_ADVISORY.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_DEPENDABOT_THREAD_ALERT.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_VULNERABILITY_ALERT.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[MobileSubjectType.SECURITY_ADVISORY.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[MobileSubjectType.SHORTCUT.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[MobileSubjectType.SWIPE_ACTIONS.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr[MobileSubjectType.TEAM_DISCUSSION.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr[MobileSubjectType.WORKFLOW_RUN.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr[MobileSubjectType.USER.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr[MobileSubjectType.USERS.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_MOBILE_AUTH_REQUEST.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr[MobileSubjectType.FILTER_REPOSITORY_TYPE.ordinal()] = 72;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr[MobileSubjectType.FILTER_LANGUAGE.ordinal()] = 73;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr[MobileSubjectType.PUSH_NOTIFICATION_ACTION.ordinal()] = 74;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr[MobileSubjectType.TOAST.ordinal()] = 75;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr[MobileSubjectType.SETTINGS.ordinal()] = 76;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr[MobileSubjectType.NAVIGATION_BAR.ordinal()] = 77;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr[MobileSubjectType.DEEP_LINK.ordinal()] = 78;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr[MobileSubjectType.FILTER_DISCUSSION_STATUS.ordinal()] = 79;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr[MobileSubjectType.UNKNOWN__.ordinal()] = 80;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr[MobileSubjectType.CODE.ordinal()] = 81;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr[MobileSubjectType.GLOBAL_SEARCH.ordinal()] = 82;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr[MobileSubjectType.JUMP_TO.ordinal()] = 83;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr[MobileSubjectType.ORGANIZATIONS.ordinal()] = 84;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr[MobileSubjectType.SUBMIT_REVIEW_SHEET.ordinal()] = 85;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr[MobileSubjectType.COPILOT_UPSELL.ordinal()] = 86;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr[MobileSubjectType.FILTER_ISSUE_TYPE.ordinal()] = 87;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr[MobileSubjectType.BRANCHES.ordinal()] = 88;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr[MobileSubjectType.SUB_ISSUE.ordinal()] = 89;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr[MobileSubjectType.AGENT_ASSIGNMENT.ordinal()] = 90;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK.ordinal()] = 91;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr[MobileSubjectType.CUSTOM_AGENT.ordinal()] = 92;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr[MobileSubjectType.EMPTY_STATE.ordinal()] = 93;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr[MobileSubjectType.EMPTY_STATE_CTA.ordinal()] = 94;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr[MobileSubjectType.FILTER.ordinal()] = 95;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr[MobileSubjectType.SEARCH.ordinal()] = 96;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr[MobileSubjectType.SEND_AGENT_TASK.ordinal()] = 97;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr[MobileSubjectType.FILTER_DRAFT.ordinal()] = 98;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr[MobileSubjectType.FILTER_VIEWER_REVIEW_REQUESTED.ordinal()] = 99;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr[MobileSubjectType.FILTER_AGENT_TASK_STATE.ordinal()] = 100;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr[MobileSubjectType.FILTER_AGENT_TASKS_SORT.ordinal()] = 101;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK_CCA.ordinal()] = 102;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK_CLI.ordinal()] = 103;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK_CLI_REPOLESS.ordinal()] = 104;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr[MobileSubjectType.AGENT_TASK_VSCODE.ordinal()] = 105;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr[MobileSubjectType.REPOSITORY_CREATION.ordinal()] = 106;
        } catch (NoSuchFieldError unused106) {
        }
        a = iArr;
        int[] iArr2 = new int[op.values().length];
        try {
            np npVar = op.Companion;
            iArr2[7] = 1;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            np npVar2 = op.Companion;
            iArr2[9] = 2;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            np npVar3 = op.Companion;
            iArr2[10] = 3;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            np npVar4 = op.Companion;
            iArr2[11] = 4;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            np npVar5 = op.Companion;
            iArr2[12] = 5;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            np npVar6 = op.Companion;
            iArr2[13] = 6;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            np npVar7 = op.Companion;
            iArr2[16] = 7;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            np npVar8 = op.Companion;
            iArr2[17] = 8;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            np npVar9 = op.Companion;
            iArr2[18] = 9;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            np npVar10 = op.Companion;
            iArr2[19] = 10;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            np npVar11 = op.Companion;
            iArr2[20] = 11;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            np npVar12 = op.Companion;
            iArr2[23] = 12;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            np npVar13 = op.Companion;
            iArr2[24] = 13;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            np npVar14 = op.Companion;
            iArr2[29] = 14;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            np npVar15 = op.Companion;
            iArr2[28] = 15;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            np npVar16 = op.Companion;
            iArr2[30] = 16;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            np npVar17 = op.Companion;
            iArr2[31] = 17;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            np npVar18 = op.Companion;
            iArr2[32] = 18;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            np npVar19 = op.Companion;
            iArr2[33] = 19;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            np npVar20 = op.Companion;
            iArr2[35] = 20;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            np npVar21 = op.Companion;
            iArr2[37] = 21;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            np npVar22 = op.Companion;
            iArr2[38] = 22;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            np npVar23 = op.Companion;
            iArr2[40] = 23;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            np npVar24 = op.Companion;
            iArr2[43] = 24;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            np npVar25 = op.Companion;
            iArr2[44] = 25;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            np npVar26 = op.Companion;
            iArr2[41] = 26;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            np npVar27 = op.Companion;
            iArr2[42] = 27;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            np npVar28 = op.Companion;
            iArr2[45] = 28;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            np npVar29 = op.Companion;
            iArr2[46] = 29;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            np npVar30 = op.Companion;
            iArr2[47] = 30;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            np npVar31 = op.Companion;
            iArr2[48] = 31;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            np npVar32 = op.Companion;
            iArr2[49] = 32;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            np npVar33 = op.Companion;
            iArr2[50] = 33;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            np npVar34 = op.Companion;
            iArr2[52] = 34;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            np npVar35 = op.Companion;
            iArr2[53] = 35;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            np npVar36 = op.Companion;
            iArr2[54] = 36;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            np npVar37 = op.Companion;
            iArr2[55] = 37;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            np npVar38 = op.Companion;
            iArr2[56] = 38;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            np npVar39 = op.Companion;
            iArr2[58] = 39;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            np npVar40 = op.Companion;
            iArr2[60] = 40;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            np npVar41 = op.Companion;
            iArr2[61] = 41;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            np npVar42 = op.Companion;
            iArr2[62] = 42;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            np npVar43 = op.Companion;
            iArr2[65] = 43;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            np npVar44 = op.Companion;
            iArr2[66] = 44;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            np npVar45 = op.Companion;
            iArr2[68] = 45;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            np npVar46 = op.Companion;
            iArr2[69] = 46;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            np npVar47 = op.Companion;
            iArr2[70] = 47;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            np npVar48 = op.Companion;
            iArr2[71] = 48;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            np npVar49 = op.Companion;
            iArr2[72] = 49;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            np npVar50 = op.Companion;
            iArr2[78] = 50;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            np npVar51 = op.Companion;
            iArr2[80] = 51;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            np npVar52 = op.Companion;
            iArr2[81] = 52;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            np npVar53 = op.Companion;
            iArr2[82] = 53;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            np npVar54 = op.Companion;
            iArr2[74] = 54;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            np npVar55 = op.Companion;
            iArr2[75] = 55;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            np npVar56 = op.Companion;
            iArr2[76] = 56;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            np npVar57 = op.Companion;
            iArr2[77] = 57;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            np npVar58 = op.Companion;
            iArr2[83] = 58;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            np npVar59 = op.Companion;
            iArr2[84] = 59;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            np npVar60 = op.Companion;
            iArr2[85] = 60;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            np npVar61 = op.Companion;
            iArr2[86] = 61;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            np npVar62 = op.Companion;
            iArr2[87] = 62;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            np npVar63 = op.Companion;
            iArr2[89] = 63;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            np npVar64 = op.Companion;
            iArr2[90] = 64;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            np npVar65 = op.Companion;
            iArr2[92] = 65;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            np npVar66 = op.Companion;
            iArr2[95] = 66;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            np npVar67 = op.Companion;
            iArr2[98] = 67;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            np npVar68 = op.Companion;
            iArr2[99] = 68;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            np npVar69 = op.Companion;
            iArr2[103] = 69;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            np npVar70 = op.Companion;
            iArr2[101] = 70;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            np npVar71 = op.Companion;
            iArr2[102] = 71;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            np npVar72 = op.Companion;
            iArr2[79] = 72;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            np npVar73 = op.Companion;
            iArr2[104] = 73;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            np npVar74 = op.Companion;
            iArr2[51] = 74;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            np npVar75 = op.Companion;
            iArr2[39] = 75;
        } catch (NoSuchFieldError unused181) {
        }
        try {
            np npVar76 = op.Companion;
            iArr2[73] = 76;
        } catch (NoSuchFieldError unused182) {
        }
        try {
            np npVar77 = op.Companion;
            iArr2[64] = 77;
        } catch (NoSuchFieldError unused183) {
        }
        try {
            np npVar78 = op.Companion;
            iArr2[94] = 78;
        } catch (NoSuchFieldError unused184) {
        }
        try {
            np npVar79 = op.Companion;
            iArr2[100] = 79;
        } catch (NoSuchFieldError unused185) {
        }
        try {
            np npVar80 = op.Companion;
            iArr2[15] = 80;
        } catch (NoSuchFieldError unused186) {
        }
        try {
            np npVar81 = op.Companion;
            iArr2[8] = 81;
        } catch (NoSuchFieldError unused187) {
        }
        try {
            np npVar82 = op.Companion;
            iArr2[59] = 82;
        } catch (NoSuchFieldError unused188) {
        }
        try {
            np npVar83 = op.Companion;
            iArr2[63] = 83;
        } catch (NoSuchFieldError unused189) {
        }
        try {
            np npVar84 = op.Companion;
            iArr2[67] = 84;
        } catch (NoSuchFieldError unused190) {
        }
        try {
            np npVar85 = op.Companion;
            iArr2[96] = 85;
        } catch (NoSuchFieldError unused191) {
        }
        try {
            np npVar86 = op.Companion;
            iArr2[36] = 86;
        } catch (NoSuchFieldError unused192) {
        }
        try {
            np npVar87 = op.Companion;
            iArr2[6] = 87;
        } catch (NoSuchFieldError unused193) {
        }
        try {
            np npVar88 = op.Companion;
            iArr2[97] = 88;
        } catch (NoSuchFieldError unused194) {
        }
        try {
            np npVar89 = op.Companion;
            iArr2[0] = 89;
        } catch (NoSuchFieldError unused195) {
        }
        try {
            np npVar90 = op.Companion;
            iArr2[1] = 90;
        } catch (NoSuchFieldError unused196) {
        }
        try {
            np npVar91 = op.Companion;
            iArr2[14] = 91;
        } catch (NoSuchFieldError unused197) {
        }
        try {
            np npVar92 = op.Companion;
            iArr2[21] = 92;
        } catch (NoSuchFieldError unused198) {
        }
        try {
            np npVar93 = op.Companion;
            iArr2[22] = 93;
        } catch (NoSuchFieldError unused199) {
        }
        try {
            np npVar94 = op.Companion;
            iArr2[25] = 94;
        } catch (NoSuchFieldError unused200) {
        }
        try {
            np npVar95 = op.Companion;
            iArr2[91] = 95;
        } catch (NoSuchFieldError unused201) {
        }
        try {
            np npVar96 = op.Companion;
            iArr2[93] = 96;
        } catch (NoSuchFieldError unused202) {
        }
        try {
            np npVar97 = op.Companion;
            iArr2[34] = 97;
        } catch (NoSuchFieldError unused203) {
        }
        try {
            np npVar98 = op.Companion;
            iArr2[57] = 98;
        } catch (NoSuchFieldError unused204) {
        }
        try {
            np npVar99 = op.Companion;
            iArr2[27] = 99;
        } catch (NoSuchFieldError unused205) {
        }
        try {
            np npVar100 = op.Companion;
            iArr2[26] = 100;
        } catch (NoSuchFieldError unused206) {
        }
        try {
            np npVar101 = op.Companion;
            iArr2[2] = 101;
        } catch (NoSuchFieldError unused207) {
        }
        try {
            np npVar102 = op.Companion;
            iArr2[3] = 102;
        } catch (NoSuchFieldError unused208) {
        }
        try {
            np npVar103 = op.Companion;
            iArr2[4] = 103;
        } catch (NoSuchFieldError unused209) {
        }
        try {
            np npVar104 = op.Companion;
            iArr2[5] = 104;
        } catch (NoSuchFieldError unused210) {
        }
        try {
            np npVar105 = op.Companion;
            iArr2[88] = 105;
        } catch (NoSuchFieldError unused211) {
        }
    }
}
