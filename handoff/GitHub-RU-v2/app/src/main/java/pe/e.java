package pe;

import com.github.service.models.response.type.StatusState;
import k71.k;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30536a;

        static {
            int[] iArr = new int[StatusState.values().length];
            try {
                iArr[StatusState.EXPECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusState.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusState.UNKNOWN__.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StatusState.FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StatusState.SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f30536a = iArr;
        }
    }

    public static final int a(StatusState statusState) {
        k.g(statusState, "<this>");
        switch (a.f30536a[statusState.ordinal()]) {
            case 1:
            case 2:
                return 2131100992;
            case 3:
                return 2131100987;
            case 4:
            case 5:
                return 2131100991;
            case 6:
                return 2131100988;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int b(StatusState statusState) {
        k.g(statusState, "<this>");
        switch (a.f30536a[statusState.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 2131231238;
            case 4:
            case 5:
                return 2131231497;
            case 6:
                return 2131231158;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
