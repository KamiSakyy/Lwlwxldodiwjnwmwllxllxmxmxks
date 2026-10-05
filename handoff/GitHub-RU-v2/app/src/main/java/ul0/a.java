package ul0;

import com.github.service.models.response.NotificationReasonState;
import gn0.hi;
import gn0.ii;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ii.values().length];
        try {
            hi hiVar = ii.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            hi hiVar2 = ii.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            hi hiVar3 = ii.Companion;
            iArr[4] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            hi hiVar4 = ii.Companion;
            iArr[5] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            hi hiVar5 = ii.Companion;
            iArr[6] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            hi hiVar6 = ii.Companion;
            iArr[8] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            hi hiVar7 = ii.Companion;
            iArr[10] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            hi hiVar8 = ii.Companion;
            iArr[12] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            hi hiVar9 = ii.Companion;
            iArr[13] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            hi hiVar10 = ii.Companion;
            iArr[14] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            hi hiVar11 = ii.Companion;
            iArr[15] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            hi hiVar12 = ii.Companion;
            iArr[16] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            hi hiVar13 = ii.Companion;
            iArr[3] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            hi hiVar14 = ii.Companion;
            iArr[0] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            hi hiVar15 = ii.Companion;
            iArr[11] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            hi hiVar16 = ii.Companion;
            iArr[9] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            hi hiVar17 = ii.Companion;
            iArr[7] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            hi hiVar18 = ii.Companion;
            iArr[17] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        a = iArr;
        int[] iArr2 = new int[NotificationReasonState.values().length];
        try {
            iArr2[NotificationReasonState.ASSIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[NotificationReasonState.AUTHOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[NotificationReasonState.COMMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[NotificationReasonState.INVITATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[NotificationReasonState.MANUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[NotificationReasonState.MENTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[NotificationReasonState.REVIEW_REQUESTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[NotificationReasonState.SECURITY_ADVISORY_CREDIT.ordinal()] = 8;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[NotificationReasonState.SECURITY_ALERT.ordinal()] = 9;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[NotificationReasonState.STATE_CHANGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[NotificationReasonState.SUBSCRIBED.ordinal()] = 11;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[NotificationReasonState.TEAM_MENTION.ordinal()] = 12;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[NotificationReasonState.CI_ACTIVITY.ordinal()] = 13;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[NotificationReasonState.APPROVAL_REQUESTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[NotificationReasonState.SAVE.ordinal()] = 15;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[NotificationReasonState.READY_FOR_REVIEW.ordinal()] = 16;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[NotificationReasonState.UNKNOWN.ordinal()] = 17;
        } catch (NoSuchFieldError unused35) {
        }
        b = iArr2;
    }
}
