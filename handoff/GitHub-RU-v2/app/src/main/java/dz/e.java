package dz;

import com.github.service.models.response.type.MobileEventContext;
import m10.ap;
import m10.bp;

/* loaded from: /home/user/work/p/classes3.dex */
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
            iArr[MobileEventContext.AGENT_PULL_REQUESTS.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[MobileEventContext.AGENT_TASKS_HOME.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[MobileEventContext.AGENT_TASKS_REPOSITORY.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[MobileEventContext.HOME.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[MobileEventContext.REPOSITORY.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[MobileEventContext.COPILOT_CHAT.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[MobileEventContext.COPILOT_CHAT_ASSISTANT_MESSAGE.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[MobileEventContext.COPILOT_CHAT_INPUT_FIELD.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[MobileEventContext.EXTERNAL.ordinal()] = 42;
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
        int[] iArr2 = new int[bp.values().length];
        try {
            ap apVar = bp.Companion;
            iArr2[54] = 1;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            ap apVar2 = bp.Companion;
            iArr2[59] = 2;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            ap apVar3 = bp.Companion;
            iArr2[25] = 3;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            ap apVar4 = bp.Companion;
            iArr2[57] = 4;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            ap apVar5 = bp.Companion;
            iArr2[50] = 5;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            ap apVar6 = bp.Companion;
            iArr2[58] = 6;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            ap apVar7 = bp.Companion;
            iArr2[55] = 7;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            ap apVar8 = bp.Companion;
            iArr2[60] = 8;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            ap apVar9 = bp.Companion;
            iArr2[20] = 9;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            ap apVar10 = bp.Companion;
            iArr2[8] = 10;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            ap apVar11 = bp.Companion;
            iArr2[32] = 11;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            ap apVar12 = bp.Companion;
            iArr2[53] = 12;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            ap apVar13 = bp.Companion;
            iArr2[10] = 13;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            ap apVar14 = bp.Companion;
            iArr2[36] = 14;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            ap apVar15 = bp.Companion;
            iArr2[24] = 15;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            ap apVar16 = bp.Companion;
            iArr2[23] = 16;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            ap apVar17 = bp.Companion;
            iArr2[37] = 17;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            ap apVar18 = bp.Companion;
            iArr2[9] = 18;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            ap apVar19 = bp.Companion;
            iArr2[27] = 19;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            ap apVar20 = bp.Companion;
            iArr2[56] = 20;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            ap apVar21 = bp.Companion;
            iArr2[13] = 21;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            ap apVar22 = bp.Companion;
            iArr2[19] = 22;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            ap apVar23 = bp.Companion;
            iArr2[28] = 23;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            ap apVar24 = bp.Companion;
            iArr2[35] = 24;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            ap apVar25 = bp.Companion;
            iArr2[34] = 25;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            ap apVar26 = bp.Companion;
            iArr2[12] = 26;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            ap apVar27 = bp.Companion;
            iArr2[38] = 27;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            ap apVar28 = bp.Companion;
            iArr2[39] = 28;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            ap apVar29 = bp.Companion;
            iArr2[40] = 29;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            ap apVar30 = bp.Companion;
            iArr2[41] = 30;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            ap apVar31 = bp.Companion;
            iArr2[42] = 31;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            ap apVar32 = bp.Companion;
            iArr2[43] = 32;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            ap apVar33 = bp.Companion;
            iArr2[44] = 33;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            ap apVar34 = bp.Companion;
            iArr2[3] = 34;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            ap apVar35 = bp.Companion;
            iArr2[4] = 35;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            ap apVar36 = bp.Companion;
            iArr2[5] = 36;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            ap apVar37 = bp.Companion;
            iArr2[29] = 37;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            ap apVar38 = bp.Companion;
            iArr2[51] = 38;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            ap apVar39 = bp.Companion;
            iArr2[14] = 39;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            ap apVar40 = bp.Companion;
            iArr2[15] = 40;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            ap apVar41 = bp.Companion;
            iArr2[16] = 41;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            ap apVar42 = bp.Companion;
            iArr2[26] = 42;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            ap apVar43 = bp.Companion;
            iArr2[11] = 43;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            ap apVar44 = bp.Companion;
            iArr2[31] = 44;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            ap apVar45 = bp.Companion;
            iArr2[46] = 45;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            ap apVar46 = bp.Companion;
            iArr2[47] = 46;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            ap apVar47 = bp.Companion;
            iArr2[48] = 47;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            ap apVar48 = bp.Companion;
            iArr2[52] = 48;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            ap apVar49 = bp.Companion;
            iArr2[61] = 49;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            ap apVar50 = bp.Companion;
            iArr2[62] = 50;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            ap apVar51 = bp.Companion;
            iArr2[63] = 51;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            ap apVar52 = bp.Companion;
            iArr2[64] = 52;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            ap apVar53 = bp.Companion;
            iArr2[49] = 53;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            ap apVar54 = bp.Companion;
            iArr2[0] = 54;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            ap apVar55 = bp.Companion;
            iArr2[1] = 55;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            ap apVar56 = bp.Companion;
            iArr2[17] = 56;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            ap apVar57 = bp.Companion;
            iArr2[18] = 57;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            ap apVar58 = bp.Companion;
            iArr2[30] = 58;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            ap apVar59 = bp.Companion;
            iArr2[33] = 59;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            ap apVar60 = bp.Companion;
            iArr2[2] = 60;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            ap apVar61 = bp.Companion;
            iArr2[6] = 61;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            ap apVar62 = bp.Companion;
            iArr2[7] = 62;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            ap apVar63 = bp.Companion;
            iArr2[65] = 63;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            ap apVar64 = bp.Companion;
            iArr2[21] = 64;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            ap apVar65 = bp.Companion;
            iArr2[22] = 65;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            ap apVar66 = bp.Companion;
            iArr2[45] = 66;
        } catch (NoSuchFieldError unused132) {
        }
    }
}
