package hx0;

import com.github.service.models.response.NotificationReasonState;
import pz0.fl;
import pz0.gl;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[gl.values().length];
        try {
            fl flVar = gl.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            fl flVar2 = gl.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            fl flVar3 = gl.Companion;
            iArr[4] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            fl flVar4 = gl.Companion;
            iArr[5] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            fl flVar5 = gl.Companion;
            iArr[6] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            fl flVar6 = gl.Companion;
            iArr[8] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            fl flVar7 = gl.Companion;
            iArr[10] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            fl flVar8 = gl.Companion;
            iArr[12] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            fl flVar9 = gl.Companion;
            iArr[13] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            fl flVar10 = gl.Companion;
            iArr[14] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            fl flVar11 = gl.Companion;
            iArr[15] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            fl flVar12 = gl.Companion;
            iArr[16] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            fl flVar13 = gl.Companion;
            iArr[3] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            fl flVar14 = gl.Companion;
            iArr[0] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            fl flVar15 = gl.Companion;
            iArr[11] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            fl flVar16 = gl.Companion;
            iArr[9] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            fl flVar17 = gl.Companion;
            iArr[7] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            fl flVar18 = gl.Companion;
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
