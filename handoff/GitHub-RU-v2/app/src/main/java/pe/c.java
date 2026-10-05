package pe;

import com.github.service.models.response.type.MinimizedStateReason;
import yz0.x2;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30534a;

        static {
            int[] iArr = new int[MinimizedStateReason.values().length];
            try {
                iArr[MinimizedStateReason.ABUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MinimizedStateReason.OFFTOPIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MinimizedStateReason.OUTDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MinimizedStateReason.RESOLVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MinimizedStateReason.DUPLICATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MinimizedStateReason.SPAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f30534a = iArr;
        }
    }

    public static final int a(x2 x2Var) {
        MinimizedStateReason minimizedStateReason = x2Var != null ? x2Var.d : null;
        switch (minimizedStateReason == null ? -1 : a.f30534a[minimizedStateReason.ordinal()]) {
            case 1:
                return 2131951915;
            case 2:
                return 2131951917;
            case 3:
                return 2131951918;
            case 4:
                return 2131951919;
            case 5:
                return 2131951916;
            case 6:
                return 2131951920;
            default:
                return 2131951921;
        }
    }
}
