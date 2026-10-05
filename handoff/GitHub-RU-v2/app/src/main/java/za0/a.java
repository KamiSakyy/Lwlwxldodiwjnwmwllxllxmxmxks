package za0;

import com.github.service.models.response.NotificationReasonState;
import hc0.hh;
import hc0.ih;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ih.values().length];
        try {
            hh hhVar = ih.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            hh hhVar2 = ih.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            hh hhVar3 = ih.Companion;
            iArr[4] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            hh hhVar4 = ih.Companion;
            iArr[5] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            hh hhVar5 = ih.Companion;
            iArr[6] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            hh hhVar6 = ih.Companion;
            iArr[7] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            hh hhVar7 = ih.Companion;
            iArr[9] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            hh hhVar8 = ih.Companion;
            iArr[11] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            hh hhVar9 = ih.Companion;
            iArr[12] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            hh hhVar10 = ih.Companion;
            iArr[13] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            hh hhVar11 = ih.Companion;
            iArr[14] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            hh hhVar12 = ih.Companion;
            iArr[15] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            hh hhVar13 = ih.Companion;
            iArr[3] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            hh hhVar14 = ih.Companion;
            iArr[0] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            hh hhVar15 = ih.Companion;
            iArr[10] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            hh hhVar16 = ih.Companion;
            iArr[8] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            hh hhVar17 = ih.Companion;
            iArr[16] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        a = iArr;
        int[] iArr2 = new int[NotificationReasonState.values().length];
        try {
            iArr2[NotificationReasonState.ASSIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[NotificationReasonState.AUTHOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[NotificationReasonState.COMMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[NotificationReasonState.INVITATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[NotificationReasonState.MANUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[NotificationReasonState.MENTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[NotificationReasonState.REVIEW_REQUESTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[NotificationReasonState.SECURITY_ADVISORY_CREDIT.ordinal()] = 8;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[NotificationReasonState.SECURITY_ALERT.ordinal()] = 9;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[NotificationReasonState.STATE_CHANGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[NotificationReasonState.SUBSCRIBED.ordinal()] = 11;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[NotificationReasonState.TEAM_MENTION.ordinal()] = 12;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[NotificationReasonState.CI_ACTIVITY.ordinal()] = 13;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[NotificationReasonState.APPROVAL_REQUESTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[NotificationReasonState.SAVE.ordinal()] = 15;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[NotificationReasonState.READY_FOR_REVIEW.ordinal()] = 16;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[NotificationReasonState.UNKNOWN.ordinal()] = 17;
        } catch (NoSuchFieldError unused34) {
        }
        b = iArr2;
    }
}
