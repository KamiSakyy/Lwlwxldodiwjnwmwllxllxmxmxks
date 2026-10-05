package bz;

import com.github.service.models.response.NotificationReasonState;
import m10.iq;
import m10.jq;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[jq.values().length];
        try {
            iq iqVar = jq.Companion;
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iq iqVar2 = jq.Companion;
            iArr[3] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iq iqVar3 = jq.Companion;
            iArr[5] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iq iqVar4 = jq.Companion;
            iArr[6] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iq iqVar5 = jq.Companion;
            iArr[7] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iq iqVar6 = jq.Companion;
            iArr[9] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iq iqVar7 = jq.Companion;
            iArr[11] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iq iqVar8 = jq.Companion;
            iArr[13] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iq iqVar9 = jq.Companion;
            iArr[14] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iq iqVar10 = jq.Companion;
            iArr[15] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iq iqVar11 = jq.Companion;
            iArr[16] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iq iqVar12 = jq.Companion;
            iArr[17] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iq iqVar13 = jq.Companion;
            iArr[4] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iq iqVar14 = jq.Companion;
            iArr[1] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iq iqVar15 = jq.Companion;
            iArr[12] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iq iqVar16 = jq.Companion;
            iArr[10] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iq iqVar17 = jq.Companion;
            iArr[8] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iq iqVar18 = jq.Companion;
            iArr[0] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iq iqVar19 = jq.Companion;
            iArr[18] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        a = iArr;
        int[] iArr2 = new int[NotificationReasonState.values().length];
        try {
            iArr2[NotificationReasonState.ASSIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[NotificationReasonState.AUTHOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[NotificationReasonState.COMMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[NotificationReasonState.INVITATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[NotificationReasonState.MANUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[NotificationReasonState.MENTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[NotificationReasonState.REVIEW_REQUESTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[NotificationReasonState.SECURITY_ADVISORY_CREDIT.ordinal()] = 8;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[NotificationReasonState.SECURITY_ALERT.ordinal()] = 9;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[NotificationReasonState.STATE_CHANGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[NotificationReasonState.SUBSCRIBED.ordinal()] = 11;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[NotificationReasonState.TEAM_MENTION.ordinal()] = 12;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[NotificationReasonState.CI_ACTIVITY.ordinal()] = 13;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[NotificationReasonState.APPROVAL_REQUESTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[NotificationReasonState.SAVE.ordinal()] = 15;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[NotificationReasonState.READY_FOR_REVIEW.ordinal()] = 16;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[NotificationReasonState.UNKNOWN.ordinal()] = 17;
        } catch (NoSuchFieldError unused36) {
        }
        b = iArr2;
    }
}
