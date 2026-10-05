package ab0;

import com.github.service.models.response.WorkflowRunEvent;
import hc0.t00;
import hc0.u00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class p {
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
        int[] iArr2 = new int[u00.values().length];
        try {
            t00 t00Var = u00.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            t00 t00Var2 = u00.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            t00 t00Var3 = u00.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            t00 t00Var4 = u00.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            t00 t00Var5 = u00.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            t00 t00Var6 = u00.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            t00 t00Var7 = u00.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            t00 t00Var8 = u00.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            t00 t00Var9 = u00.Companion;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            t00 t00Var10 = u00.Companion;
            iArr2[9] = 10;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            t00 t00Var11 = u00.Companion;
            iArr2[10] = 11;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            t00 t00Var12 = u00.Companion;
            iArr2[11] = 12;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            t00 t00Var13 = u00.Companion;
            iArr2[12] = 13;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            t00 t00Var14 = u00.Companion;
            iArr2[13] = 14;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            t00 t00Var15 = u00.Companion;
            iArr2[14] = 15;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            t00 t00Var16 = u00.Companion;
            iArr2[15] = 16;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            t00 t00Var17 = u00.Companion;
            iArr2[16] = 17;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            t00 t00Var18 = u00.Companion;
            iArr2[17] = 18;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            t00 t00Var19 = u00.Companion;
            iArr2[18] = 19;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            t00 t00Var20 = u00.Companion;
            iArr2[19] = 20;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            t00 t00Var21 = u00.Companion;
            iArr2[20] = 21;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            t00 t00Var22 = u00.Companion;
            iArr2[21] = 22;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            t00 t00Var23 = u00.Companion;
            iArr2[22] = 23;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            t00 t00Var24 = u00.Companion;
            iArr2[23] = 24;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            t00 t00Var25 = u00.Companion;
            iArr2[24] = 25;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            t00 t00Var26 = u00.Companion;
            iArr2[25] = 26;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            t00 t00Var27 = u00.Companion;
            iArr2[26] = 27;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            t00 t00Var28 = u00.Companion;
            iArr2[27] = 28;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            t00 t00Var29 = u00.Companion;
            iArr2[28] = 29;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            t00 t00Var30 = u00.Companion;
            iArr2[29] = 30;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            t00 t00Var31 = u00.Companion;
            iArr2[30] = 31;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            t00 t00Var32 = u00.Companion;
            iArr2[31] = 32;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            t00 t00Var33 = u00.Companion;
            iArr2[32] = 33;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            t00 t00Var34 = u00.Companion;
            iArr2[33] = 34;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            t00 t00Var35 = u00.Companion;
            iArr2[34] = 35;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            t00 t00Var36 = u00.Companion;
            iArr2[35] = 36;
        } catch (NoSuchFieldError unused72) {
        }
        a = iArr2;
    }
}
