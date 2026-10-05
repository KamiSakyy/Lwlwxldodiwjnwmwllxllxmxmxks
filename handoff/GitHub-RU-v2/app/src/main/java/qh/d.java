package qh;

import com.github.rudroid.discussions.k6;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.NotificationReasonState;
import com.github.service.models.response.discussions.type.DiscussionStateReason;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import yz0.a5;
import yz0.m4;
import yz0.n4;
import yz0.o4;
import yz0.p4;
import yz0.q4;
import yz0.r4;
import yz0.s4;
import yz0.t4;
import yz0.u4;
import yz0.v4;
import yz0.w4;
import yz0.x4;
import yz0.y4;
import yz0.z4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CheckConclusionState.values().length];
            try {
                iArr[CheckConclusionState.ACTION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckConclusionState.TIMED_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckConclusionState.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckConclusionState.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckConclusionState.STARTUP_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckConclusionState.SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckConclusionState.NEUTRAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckConclusionState.SKIPPED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckConclusionState.STALE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CheckConclusionState.UNKNOWN__.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            a = iArr;
            int[] iArr2 = new int[CheckStatusState.values().length];
            try {
                iArr2[CheckStatusState.UNKNOWN__.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CheckStatusState.REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CheckStatusState.QUEUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CheckStatusState.IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CheckStatusState.WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CheckStatusState.COMPLETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            b = iArr2;
        }
    }

    public static final int a(o.b bVar, NotificationReasonState notificationReasonState) {
        k.g(bVar, "<this>");
        k.g(notificationReasonState, "reason");
        if (bVar instanceof n4) {
            return 2131953930;
        }
        if (bVar instanceof p4) {
            return 2131953933;
        }
        if (bVar instanceof y4) {
            return 2131953954;
        }
        if (bVar instanceof a5) {
            return 2131953956;
        }
        if (bVar instanceof m4) {
            if (notificationReasonState == NotificationReasonState.APPROVAL_REQUESTED) {
                return 2131953925;
            }
            m4 m4Var = (m4) bVar;
            switch (a.b[m4Var.v.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return 2131953927;
                case 6:
                    CheckConclusionState checkConclusionState = m4Var.w;
                    switch (checkConclusionState == null ? -1 : a.a[checkConclusionState.ordinal()]) {
                        case -1:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            return 2131953926;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 6:
                            return 2131953928;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (bVar instanceof q4) {
            return qh.a.a(((q4) bVar).w);
        }
        if (bVar instanceof r4) {
            r4 r4Var = (r4) bVar;
            return b.a(r4Var.x, r4Var.v, false);
        }
        if (bVar instanceof s4) {
            return 2131953940;
        }
        if (bVar instanceof v4) {
            return 2131953943;
        }
        if (bVar instanceof w4) {
            return 2131953944;
        }
        if (bVar instanceof t4) {
            return 2131953941;
        }
        if (bVar instanceof u4) {
            return 2131953942;
        }
        if (bVar instanceof x4) {
            return 2131953945;
        }
        if (bVar instanceof o4) {
            return k6.a(((o4) bVar).z);
        }
        if (bVar instanceof z4) {
            return 2131953939;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(o.b bVar, NotificationReasonState notificationReasonState) {
        k.g(bVar, "<this>");
        k.g(notificationReasonState, "reason");
        if (bVar instanceof n4) {
            return 2131231284;
        }
        if (bVar instanceof p4) {
            return 2131231280;
        }
        if (bVar instanceof a5) {
            return 2131231430;
        }
        if (bVar instanceof m4) {
            if (notificationReasonState == NotificationReasonState.APPROVAL_REQUESTED) {
                return 2131231430;
            }
            m4 m4Var = (m4) bVar;
            switch (a.b[m4Var.v.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return 2131231239;
                case 6:
                    CheckConclusionState checkConclusionState = m4Var.w;
                    switch (checkConclusionState != null ? a.a[checkConclusionState.ordinal()] : -1) {
                        case -1:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            return 2131231500;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 6:
                            return 2131231159;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (bVar instanceof q4) {
            q4 q4Var = (q4) bVar;
            return qh.a.b(q4Var.w, q4Var.z);
        }
        if (bVar instanceof r4) {
            r4 r4Var = (r4) bVar;
            return b.c(r4Var.x, r4Var.v, r4Var.A);
        }
        if (bVar instanceof s4) {
            return 2131231465;
        }
        if (bVar instanceof v4) {
            return 2131231360;
        }
        if ((bVar instanceof w4) || (bVar instanceof u4)) {
            return 2131231105;
        }
        if ((bVar instanceof t4) || (bVar instanceof x4)) {
            return 2131231442;
        }
        if (!(bVar instanceof o4)) {
            if (bVar instanceof y4) {
                return 2131231203;
            }
            if (bVar instanceof z4) {
                return 2131231292;
            }
            throw new NoWhenBranchMatchedException();
        }
        DiscussionStateReason discussionStateReason = ((o4) bVar).z;
        int i = discussionStateReason != null ? k6.a.a[discussionStateReason.ordinal()] : -1;
        if (i == 1) {
            return 2131231228;
        }
        if (i != 2) {
            return i != 3 ? 2131231203 : 2131231225;
        }
        return 2131231231;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int c(o.b bVar, NotificationReasonState notificationReasonState) {
        k.g(bVar, "<this>");
        k.g(notificationReasonState, "reason");
        if (bVar instanceof n4) {
            return 2131099747;
        }
        if (bVar instanceof p4) {
            return 2131099948;
        }
        if (bVar instanceof y4) {
            return 2131100986;
        }
        if (bVar instanceof a5) {
            return 2131099948;
        }
        if (bVar instanceof m4) {
            if (notificationReasonState != NotificationReasonState.APPROVAL_REQUESTED) {
                m4 m4Var = (m4) bVar;
                switch (a.b[m4Var.v.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        return 2131100992;
                    case 6:
                        CheckConclusionState checkConclusionState = m4Var.w;
                        switch (checkConclusionState == null ? -1 : a.a[checkConclusionState.ordinal()]) {
                            case -1:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                break;
                            case 0:
                            default:
                                throw new NoWhenBranchMatchedException();
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                return 2131100991;
                            case 6:
                                return 2131100988;
                        }
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return 2131099948;
        }
        if (bVar instanceof q4) {
            q4 q4Var = (q4) bVar;
            return qh.a.d(q4Var.w, q4Var.z);
        }
        if (bVar instanceof r4) {
            r4 r4Var = (r4) bVar;
            return b.e(r4Var.x, r4Var.v, r4Var.A);
        }
        if ((bVar instanceof s4) || (bVar instanceof v4)) {
            return 2131099948;
        }
        if (bVar instanceof w4) {
            return 2131100992;
        }
        if ((bVar instanceof t4) || (bVar instanceof u4) || (bVar instanceof x4)) {
            return 2131099948;
        }
        if (bVar instanceof o4) {
            return ((o4) bVar).z == DiscussionStateReason.RESOLVED ? 2131099724 : 2131099712;
        }
        if (bVar instanceof z4) {
            return 2131099948;
        }
        throw new NoWhenBranchMatchedException();
    }
}
