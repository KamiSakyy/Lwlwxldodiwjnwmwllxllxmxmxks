package qh;

import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;
import k71.k;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {

    /* renamed from: qh.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0029a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IssueState.values().length];
            try {
                iArr[IssueState.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssueState.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IssueState.UNKNOWN__.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final int a(IssueState issueState) {
        k.g(issueState, "<this>");
        int i = C0029a.a[issueState.ordinal()];
        if (i == 1) {
            return 2131953935;
        }
        if (i == 2) {
            return 2131953934;
        }
        if (i == 3) {
            return 2131953935;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(IssueState issueState, CloseReason closeReason) {
        k.g(issueState, "<this>");
        int i = C0029a.a[issueState.ordinal()];
        if (i == 1) {
            return 2131231329;
        }
        if (i == 2) {
            return (closeReason == CloseReason.NotPlanned || closeReason == CloseReason.Duplicate) ? 2131231448 : 2131231324;
        }
        if (i == 3) {
            return 2131231329;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int c(IssueState issueState, CloseReason closeReason) {
        k.g(issueState, "<this>");
        int i = C0029a.a[issueState.ordinal()];
        if (i == 1) {
            return 2131231327;
        }
        if (i == 2) {
            return (closeReason == CloseReason.NotPlanned || closeReason == CloseReason.Duplicate) ? 2131231447 : 2131231322;
        }
        if (i == 3) {
            return 2131231327;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int d(IssueState issueState, CloseReason closeReason) {
        k.g(issueState, "<this>");
        int i = C0029a.a[issueState.ordinal()];
        if (i == 1) {
            return 2131100988;
        }
        if (i == 2) {
            return (closeReason == CloseReason.NotPlanned || closeReason == CloseReason.Duplicate) ? 2131099947 : 2131100990;
        }
        if (i == 3) {
            return 2131099948;
        }
        throw new NoWhenBranchMatchedException();
    }
}
