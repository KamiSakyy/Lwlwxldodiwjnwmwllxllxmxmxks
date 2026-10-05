package pe;

import com.github.service.models.response.MergeCheckStatus;
import kotlin.NoWhenBranchMatchedException;
import me.f;
import w61.k;
import yz0.l;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: pe.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0086a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30532a;

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
            f30532a = iArr;
        }
    }

    public static final f a(l lVar) {
        k kVar;
        k71.k.g(lVar, "<this>");
        switch (C0086a.f30532a[lVar.e().ordinal()]) {
            case 1:
                kVar = new k(2131952764, 2131952763);
                break;
            case 2:
                kVar = new k(2131952766, 2131952765);
                break;
            case 3:
                kVar = new k(2131952774, 2131952773);
                break;
            case 4:
                kVar = new k(2131952780, 2131952779);
                break;
            case 5:
                kVar = new k(2131952782, 2131952781);
                break;
            case 6:
                kVar = new k(2131952771, 2131952770);
                break;
            case 7:
                kVar = new k(2131952785, 2131952784);
                break;
            case 8:
                kVar = new k(2131952776, 2131952775);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int intValue = ((Number) kVar.r).intValue();
        int intValue2 = ((Number) kVar.s).intValue();
        Integer duration = lVar.getDuration();
        return duration != null ? new f.e(intValue, duration.intValue()) : new f.c(intValue2);
    }
}
