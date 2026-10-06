package jx0;

import com.github.service.models.response.WorkflowRunEvent;
import pz0.ka0;
import pz0.la0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class s {
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
        int[] iArr2 = new int[la0.values().length];
        try {
            ka0 ka0Var = la0.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            ka0 ka0Var2 = la0.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            ka0 ka0Var3 = la0.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            ka0 ka0Var4 = la0.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            ka0 ka0Var5 = la0.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            ka0 ka0Var6 = la0.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            ka0 ka0Var7 = la0.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            ka0 ka0Var8 = la0.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            ka0 ka0Var9 = la0.Companion;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            ka0 ka0Var10 = la0.Companion;
            iArr2[9] = 10;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            ka0 ka0Var11 = la0.Companion;
            iArr2[10] = 11;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            ka0 ka0Var12 = la0.Companion;
            iArr2[11] = 12;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            ka0 ka0Var13 = la0.Companion;
            iArr2[12] = 13;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            ka0 ka0Var14 = la0.Companion;
            iArr2[13] = 14;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            ka0 ka0Var15 = la0.Companion;
            iArr2[14] = 15;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            ka0 ka0Var16 = la0.Companion;
            iArr2[15] = 16;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            ka0 ka0Var17 = la0.Companion;
            iArr2[16] = 17;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            ka0 ka0Var18 = la0.Companion;
            iArr2[17] = 18;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            ka0 ka0Var19 = la0.Companion;
            iArr2[18] = 19;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            ka0 ka0Var20 = la0.Companion;
            iArr2[19] = 20;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            ka0 ka0Var21 = la0.Companion;
            iArr2[20] = 21;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            ka0 ka0Var22 = la0.Companion;
            iArr2[21] = 22;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            ka0 ka0Var23 = la0.Companion;
            iArr2[22] = 23;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            ka0 ka0Var24 = la0.Companion;
            iArr2[23] = 24;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            ka0 ka0Var25 = la0.Companion;
            iArr2[24] = 25;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            ka0 ka0Var26 = la0.Companion;
            iArr2[25] = 26;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            ka0 ka0Var27 = la0.Companion;
            iArr2[26] = 27;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            ka0 ka0Var28 = la0.Companion;
            iArr2[27] = 28;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            ka0 ka0Var29 = la0.Companion;
            iArr2[28] = 29;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            ka0 ka0Var30 = la0.Companion;
            iArr2[29] = 30;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            ka0 ka0Var31 = la0.Companion;
            iArr2[30] = 31;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            ka0 ka0Var32 = la0.Companion;
            iArr2[31] = 32;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            ka0 ka0Var33 = la0.Companion;
            iArr2[32] = 33;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            ka0 ka0Var34 = la0.Companion;
            iArr2[33] = 34;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            ka0 ka0Var35 = la0.Companion;
            iArr2[34] = 35;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            ka0 ka0Var36 = la0.Companion;
            iArr2[35] = 36;
        } catch (NoSuchFieldError unused72) {
        }
        a = iArr2;
    }
    public static Object L(Object p1) { return null; }
    public Object N() { return null; }
    public Object f(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object d(Object p1) { return null; }
}
