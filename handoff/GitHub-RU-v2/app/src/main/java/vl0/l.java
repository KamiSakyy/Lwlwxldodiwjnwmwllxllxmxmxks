package vl0;

import com.github.service.models.response.type.ReactionContent;
import gn0.ao;
import gn0.bo;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReactionContent.values().length];
        try {
            iArr[ReactionContent.UNKNOWN__.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReactionContent.THUMBS_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReactionContent.THUMBS_DOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReactionContent.LAUGH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ReactionContent.HOORAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ReactionContent.CONFUSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ReactionContent.HEART.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ReactionContent.ROCKET.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ReactionContent.EYES.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
        int[] iArr2 = new int[bo.values().length];
        try {
            ao aoVar = bo.Companion;
            iArr2[8] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            ao aoVar2 = bo.Companion;
            iArr2[7] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            ao aoVar3 = bo.Companion;
            iArr2[6] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            ao aoVar4 = bo.Companion;
            iArr2[4] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            ao aoVar5 = bo.Companion;
            iArr2[3] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            ao aoVar6 = bo.Companion;
            iArr2[0] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            ao aoVar7 = bo.Companion;
            iArr2[2] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            ao aoVar8 = bo.Companion;
            iArr2[5] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            ao aoVar9 = bo.Companion;
            iArr2[1] = 9;
        } catch (NoSuchFieldError unused18) {
        }
    }
}
