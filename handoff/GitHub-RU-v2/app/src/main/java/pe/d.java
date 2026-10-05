package pe;

import com.github.service.models.response.MergeCheckStatus;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30535a;

        static {
            int[] iArr = new int[MergeCheckStatus.values().length];
            try {
                iArr[MergeCheckStatus.ACTION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MergeCheckStatus.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MergeCheckStatus.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MergeCheckStatus.SKIPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MergeCheckStatus.STALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MergeCheckStatus.FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MergeCheckStatus.SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MergeCheckStatus.PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f30535a = iArr;
        }
    }
}
