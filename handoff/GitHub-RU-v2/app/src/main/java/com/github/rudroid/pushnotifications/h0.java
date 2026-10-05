package com.github.rudroid.pushnotifications;

import com.github.rudroid.pushnotifications.g0;
import com.github.service.models.response.NotificationReasonState;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18607a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                g0.a aVar = g0.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                g0.a aVar2 = g0.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                g0.a aVar3 = g0.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                g0.a aVar4 = g0.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                g0.a aVar5 = g0.Companion;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                g0.a aVar6 = g0.Companion;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                g0.a aVar7 = g0.Companion;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                g0.a aVar8 = g0.Companion;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                g0.a aVar9 = g0.Companion;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[NotificationReasonState.values().length];
            try {
                iArr2[NotificationReasonState.ASSIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[NotificationReasonState.MENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[NotificationReasonState.REVIEW_REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[NotificationReasonState.APPROVAL_REQUESTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f18607a = iArr2;
        }
    }

    public static final String a(g0 g0Var) {
        switch (g0Var.ordinal()) {
            case k5.f.J:
            case 9:
                return "direct_mentions";
            case 1:
                return "assignments";
            case 2:
                return "review_requests";
            case 3:
                return "deployment_reviews";
            case 4:
                return "pull_request_reviews";
            case 5:
                return "mobile_device_auth";
            case 6:
                return "ci_activity";
            case 7:
                return "release";
            case 8:
                return "live_update";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
