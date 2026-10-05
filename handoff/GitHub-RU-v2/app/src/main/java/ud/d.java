package ud;

import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.issueorpullrequest.ChecksOverviewState;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32300a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32301b;

        static {
            int[] iArr = new int[ChecksOverviewState.values().length];
            try {
                iArr[ChecksOverviewState.ACTION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChecksOverviewState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChecksOverviewState.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChecksOverviewState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChecksOverviewState.PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChecksOverviewState.EXPECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChecksOverviewState.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f32300a = iArr;
            int[] iArr2 = new int[MergeCheckStatus.values().length];
            try {
                iArr2[MergeCheckStatus.ACTION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MergeCheckStatus.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MergeCheckStatus.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MergeCheckStatus.SKIPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MergeCheckStatus.STALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MergeCheckStatus.FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[MergeCheckStatus.SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[MergeCheckStatus.PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            f32301b = iArr2;
        }
    }
}
