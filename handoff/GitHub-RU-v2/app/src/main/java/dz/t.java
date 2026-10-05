package dz;

import com.github.service.models.response.WorkflowRunEvent;
import m10.fh0;
import m10.gh0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WorkflowRunEvent.values().length];
        try {
            iArr[WorkflowRunEvent.BRANCH_PROTECTION_RULE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WorkflowRunEvent.CHECK_RUN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WorkflowRunEvent.CHECK_SUITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WorkflowRunEvent.CREATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WorkflowRunEvent.DELETE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WorkflowRunEvent.DEPLOYMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[WorkflowRunEvent.DEPLOYMENT_STATUS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[WorkflowRunEvent.DISCUSSION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[WorkflowRunEvent.DISCUSSION_COMMENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[WorkflowRunEvent.DYNAMIC.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[WorkflowRunEvent.FORK.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[WorkflowRunEvent.GOLLUM.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[WorkflowRunEvent.ISSUES.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[WorkflowRunEvent.ISSUE_COMMENT.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[WorkflowRunEvent.LABEL.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[WorkflowRunEvent.MERGE_GROUP.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[WorkflowRunEvent.MILESTONE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[WorkflowRunEvent.PAGE_BUILD.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[WorkflowRunEvent.PROJECT.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[WorkflowRunEvent.PROJECT_CARD.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[WorkflowRunEvent.PROJECT_COLUMN.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[WorkflowRunEvent.PUBLIC.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[WorkflowRunEvent.PULL_REQUEST.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[WorkflowRunEvent.PULL_REQUEST_REVIEW.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[WorkflowRunEvent.PULL_REQUEST_REVIEW_COMMENT.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[WorkflowRunEvent.PULL_REQUEST_TARGET.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[WorkflowRunEvent.PUSH.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[WorkflowRunEvent.REGISTRY_PACKAGE.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[WorkflowRunEvent.RELEASE.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[WorkflowRunEvent.REPOSITORY_DISPATCH.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[WorkflowRunEvent.SCHEDULE.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[WorkflowRunEvent.STATUS.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[WorkflowRunEvent.WATCH.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[WorkflowRunEvent.WORKFLOW_DISPATCH.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[WorkflowRunEvent.WORKFLOW_RUN.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[WorkflowRunEvent.UNKNOWN__.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        int[] iArr2 = new int[gh0.values().length];
        try {
            fh0 fh0Var = gh0.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            fh0 fh0Var2 = gh0.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            fh0 fh0Var3 = gh0.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            fh0 fh0Var4 = gh0.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            fh0 fh0Var5 = gh0.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            fh0 fh0Var6 = gh0.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            fh0 fh0Var7 = gh0.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            fh0 fh0Var8 = gh0.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            fh0 fh0Var9 = gh0.Companion;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            fh0 fh0Var10 = gh0.Companion;
            iArr2[9] = 10;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            fh0 fh0Var11 = gh0.Companion;
            iArr2[10] = 11;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            fh0 fh0Var12 = gh0.Companion;
            iArr2[11] = 12;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            fh0 fh0Var13 = gh0.Companion;
            iArr2[13] = 13;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            fh0 fh0Var14 = gh0.Companion;
            iArr2[14] = 14;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            fh0 fh0Var15 = gh0.Companion;
            iArr2[15] = 15;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            fh0 fh0Var16 = gh0.Companion;
            iArr2[16] = 16;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            fh0 fh0Var17 = gh0.Companion;
            iArr2[17] = 17;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            fh0 fh0Var18 = gh0.Companion;
            iArr2[18] = 18;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            fh0 fh0Var19 = gh0.Companion;
            iArr2[19] = 19;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            fh0 fh0Var20 = gh0.Companion;
            iArr2[20] = 20;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            fh0 fh0Var21 = gh0.Companion;
            iArr2[21] = 21;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            fh0 fh0Var22 = gh0.Companion;
            iArr2[22] = 22;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            fh0 fh0Var23 = gh0.Companion;
            iArr2[23] = 23;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            fh0 fh0Var24 = gh0.Companion;
            iArr2[24] = 24;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            fh0 fh0Var25 = gh0.Companion;
            iArr2[25] = 25;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            fh0 fh0Var26 = gh0.Companion;
            iArr2[26] = 26;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            fh0 fh0Var27 = gh0.Companion;
            iArr2[27] = 27;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            fh0 fh0Var28 = gh0.Companion;
            iArr2[28] = 28;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            fh0 fh0Var29 = gh0.Companion;
            iArr2[29] = 29;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            fh0 fh0Var30 = gh0.Companion;
            iArr2[30] = 30;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            fh0 fh0Var31 = gh0.Companion;
            iArr2[31] = 31;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            fh0 fh0Var32 = gh0.Companion;
            iArr2[32] = 32;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            fh0 fh0Var33 = gh0.Companion;
            iArr2[33] = 33;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            fh0 fh0Var34 = gh0.Companion;
            iArr2[35] = 34;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            fh0 fh0Var35 = gh0.Companion;
            iArr2[36] = 35;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            fh0 fh0Var36 = gh0.Companion;
            iArr2[12] = 36;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            fh0 fh0Var37 = gh0.Companion;
            iArr2[34] = 37;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            fh0 fh0Var38 = gh0.Companion;
            iArr2[37] = 38;
        } catch (NoSuchFieldError unused74) {
        }
        a = iArr2;
    }
}
