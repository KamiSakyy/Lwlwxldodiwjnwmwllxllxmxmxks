package jc;

import com.github.service.models.response.CheckConclusionState;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: jc.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0074a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27389a;

        static {
            int[] iArr = new int[CheckConclusionState.values().length];
            try {
                iArr[CheckConclusionState.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckConclusionState.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckConclusionState.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckConclusionState.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckConclusionState.ACTION_REQUIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckConclusionState.TIMED_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckConclusionState.STARTUP_FAILURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckConclusionState.UNKNOWN__.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckConclusionState.FAILURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CheckConclusionState.STALE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f27389a = iArr;
        }
    }
}
