package jx0;

import com.github.service.models.response.type.MobileEventContext;
import pz0.ak;
import pz0.zj;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MobileEventContext.values().length];
        try {
            iArr[MobileEventContext.SAVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobileEventContext.UNSAVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MobileEventContext.DONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MobileEventContext.UNDONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MobileEventContext.READ.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MobileEventContext.UNREAD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[MobileEventContext.SUBSCRIBE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[MobileEventContext.UNSUBSCRIBE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[MobileEventContext.CREATED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[MobileEventContext.ASSIGNED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[MobileEventContext.MENTIONED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[MobileEventContext.REVIEW_REQUESTED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[MobileEventContext.CLOSED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[MobileEventContext.OPEN.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[MobileEventContext.DISPLAYED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[MobileEventContext.DISMISSED.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[MobileEventContext.OPENED.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[MobileEventContext.AWESOME.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[MobileEventContext.FEED.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[MobileEventContext.TRENDING.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[MobileEventContext.CONTINUE_REVIEW.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[MobileEventContext.COPILOT_UPSELL_BANNER_FLOW.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[MobileEventContext.FOCUSED.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[MobileEventContext.NOT_FOCUSED.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[MobileEventContext.NOTIFICATIONS_ONBOARDING_FLOW.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[MobileEventContext.PAGE_FIVE.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[MobileEventContext.PAGE_FOUR.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[MobileEventContext.PAGE_ONE.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[MobileEventContext.PAGE_SEVEN.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[MobileEventContext.PAGE_SIX.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[MobileEventContext.PAGE_THREE.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[MobileEventContext.PAGE_TWO.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[MobileEventContext.COMPLETE.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[MobileEventContext.AGENT_TASKS_HOME.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[MobileEventContext.AGENT_TASKS_REPOSITORY.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[MobileEventContext.HOME.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[MobileEventContext.REPOSITORY.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[MobileEventContext.COPILOT_CHAT.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[MobileEventContext.COPILOT_CHAT_ASSISTANT_MESSAGE.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[MobileEventContext.COPILOT_CHAT_INPUT_FIELD.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[MobileEventContext.EXTERNAL.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[MobileEventContext.AGENT_PULL_REQUESTS.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[MobileEventContext.COMMIT_DETAILS.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[MobileEventContext.ISSUE_DETAILS.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[MobileEventContext.PULL_REQUEST_DETAILS.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[MobileEventContext.PULL_REQUEST_FILES.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[MobileEventContext.PULL_REQUEST_FILES_CHANGED.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[MobileEventContext.REPOSITORY_FILE_VIEWER.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[MobileEventContext.WORKFLOW_RUNS.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[MobileEventContext.WORKFLOW_RUN_STEPS.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[MobileEventContext.WORKFLOW_RUN_STEP_LOG.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[MobileEventContext.WORKFLOW_SUMMARY.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[MobileEventContext.PULL_REQUEST_FILES_CHANGED_SINGLE_FILE.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[MobileEventContext.AGENT_INSTRUCTIONS_EMPTY.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[MobileEventContext.AGENT_INSTRUCTIONS_INCLUDED.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[MobileEventContext.COPILOT_HOME.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[MobileEventContext.COPILOT_THREADS.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[MobileEventContext.ISSUE_CELL.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[MobileEventContext.NEW_ISSUE.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[MobileEventContext.AGENT_LOGS.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[MobileEventContext.AGENT_TASK_ACTIVE.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[MobileEventContext.AGENT_TASK_COMPLETED.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[MobileEventContext.CREATE_REPO_CONFIGURATION.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[MobileEventContext.CREATE_REPO_GENERAL.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[MobileEventContext.PROFILE_REPOSITORIES.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[MobileEventContext.UNKNOWN__.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        a = iArr;
        int[] iArr2 = new int[ak.values().length];
        try {
            zj zjVar = ak.Companion;
            iArr2[26] = 1;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            zj zjVar2 = ak.Companion;
            iArr2[31] = 2;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            zj zjVar3 = ak.Companion;
            iArr2[9] = 3;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            zj zjVar4 = ak.Companion;
            iArr2[29] = 4;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            zj zjVar5 = ak.Companion;
            iArr2[24] = 5;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            zj zjVar6 = ak.Companion;
            iArr2[30] = 6;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            zj zjVar7 = ak.Companion;
            iArr2[27] = 7;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            zj zjVar8 = ak.Companion;
            iArr2[32] = 8;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            zj zjVar9 = ak.Companion;
            iArr2[6] = 9;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            zj zjVar10 = ak.Companion;
            iArr2[0] = 10;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            zj zjVar11 = ak.Companion;
            iArr2[12] = 11;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            zj zjVar12 = ak.Companion;
            iArr2[25] = 12;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            zj zjVar13 = ak.Companion;
            iArr2[2] = 13;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            zj zjVar14 = ak.Companion;
            iArr2[15] = 14;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            zj zjVar15 = ak.Companion;
            iArr2[8] = 15;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            zj zjVar16 = ak.Companion;
            iArr2[7] = 16;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            zj zjVar17 = ak.Companion;
            iArr2[16] = 17;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            zj zjVar18 = ak.Companion;
            iArr2[1] = 18;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            zj zjVar19 = ak.Companion;
            iArr2[10] = 19;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            zj zjVar20 = ak.Companion;
            iArr2[28] = 20;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            zj zjVar21 = ak.Companion;
            iArr2[33] = 21;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            zj zjVar22 = ak.Companion;
            iArr2[4] = 22;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            zj zjVar23 = ak.Companion;
            iArr2[5] = 23;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            zj zjVar24 = ak.Companion;
            iArr2[11] = 24;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            zj zjVar25 = ak.Companion;
            iArr2[14] = 25;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            zj zjVar26 = ak.Companion;
            iArr2[13] = 26;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            zj zjVar27 = ak.Companion;
            iArr2[3] = 27;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            zj zjVar28 = ak.Companion;
            iArr2[17] = 28;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            zj zjVar29 = ak.Companion;
            iArr2[18] = 29;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            zj zjVar30 = ak.Companion;
            iArr2[19] = 30;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            zj zjVar31 = ak.Companion;
            iArr2[20] = 31;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            zj zjVar32 = ak.Companion;
            iArr2[21] = 32;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            zj zjVar33 = ak.Companion;
            iArr2[22] = 33;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            zj zjVar34 = ak.Companion;
            iArr2[23] = 34;
        } catch (NoSuchFieldError unused100) {
        }
    }
}
