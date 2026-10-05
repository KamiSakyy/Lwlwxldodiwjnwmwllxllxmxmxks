package xp;

import android.text.Html;
import android.text.Spanned;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import cq.a4;
import cq.c4;
import cq.k5;
import cq.l0;
import cq.l5;
import cq.n3;
import cq.p5;
import cq.q3;
import cq.q5;
import cq.r5;
import cq.s5;
import cq.t5;
import cq.u3;
import cq.y3;
import cq.z3;
import dw.o5;
import eq.g;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import pv.c;
import t10.e;
import t10.i;
import t10.j;
import t10.l;
import t10.r;
import t71.p;
import w8.s;
import yz0.c2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final e a(l0 l0Var) {
        String str = l0Var.b;
        String str2 = l0Var.c;
        String str3 = l0Var.d;
        String str4 = l0Var.e;
        String r0 = p.r0(l0Var.f, 150);
        int i = l0Var.g;
        c cVar = l0Var.i;
        return new e(str, str2, str3, str4, r0, i, s.h(str, cVar), cVar.c, b(l0Var.h.c));
    }

    public static final l b(t5 t5Var) {
        String str;
        Avatar avatar;
        String str2 = t5Var.a;
        String str3 = t5Var.b;
        String str4 = t5Var.c;
        s5 s5Var = t5Var.d;
        q5 q5Var = s5Var.f;
        String str5 = s5Var.c;
        r5 r5Var = s5Var.e;
        if (r5Var == null || (str = r5Var.c) == null) {
            str = q5Var != null ? q5Var.c : null;
        }
        g gVar = s5Var.g;
        if (gVar != null) {
            avatar = s.A(gVar);
        } else {
            Avatar.Companion.getClass();
            avatar = Avatar.u;
        }
        return new l(str2, str3, str4, str5, str, avatar, s5Var.d, t5Var.e, t5Var.f, q5Var != null);
    }

    public static final i c(n3 n3Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        c cVar = n3Var.l;
        String str = n3Var.b;
        String str2 = n3Var.c;
        String str3 = n3Var.d;
        String r0 = p.r0(n3Var.e, 150);
        int i = n3Var.j;
        c2 c2Var = new c2(n3Var.f, n3Var.g);
        int ordinal = n3Var.h.ordinal();
        if (ordinal == 0) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
        } else if (ordinal == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
        } else if (ordinal == 2) {
            issueOrPullRequestState = n3Var.i ? IssueOrPullRequestState.PULL_REQUEST_DRAFT : IssueOrPullRequestState.PULL_REQUEST_OPEN;
        } else {
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        return new i(str, str2, str3, r0, i, c2Var, issueOrPullRequestState, s.h(str, cVar), cVar.c, b(n3Var.k.c));
    }

    public static final r d(q3 q3Var) {
        k.g(q3Var, "<this>");
        return new r(q3Var.b, q3Var.c, q3Var.d, q3Var.e, q3Var.f, s.A(q3Var.h), q3Var.g);
    }

    public static final t10.s e(u3 u3Var) {
        k.g(u3Var, "<this>");
        return new t10.s(u3Var.b, u3Var.c, u3Var.d, u3Var.e, u3Var.f, u3Var.g.a, u3Var.h.a, s.A(u3Var.l), u3Var.i, u3Var.j, u3Var.k);
    }

    public static final j f(c4 c4Var) {
        ArrayList arrayList;
        List<a4> list;
        c cVar = c4Var.j;
        z3 z3Var = c4Var.g;
        String str = c4Var.b;
        String str2 = c4Var.c;
        String str3 = c4Var.d;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = c4Var.e;
        if (str4 == null) {
            str4 = "";
        }
        Spanned fromHtml = Html.fromHtml(str4 != null ? str4 : "", 0);
        k.f(fromHtml, "fromHtml(...)");
        String obj = p.t0(fromHtml).toString();
        String str5 = c4Var.f;
        if (z3Var == null || (list = z3Var.b) == null) {
            arrayList = x61.r.r;
        } else {
            arrayList = new ArrayList();
            for (a4 a4Var : list) {
                String str6 = a4Var != null ? a4Var.d.b : null;
                if (str6 != null) {
                    arrayList.add(str6);
                }
            }
        }
        int i = z3Var != null ? z3Var.a : 0;
        ArrayList arrayList2 = arrayList;
        ArrayList h = s.h(str, cVar);
        boolean z = cVar.c;
        y3 y3Var = c4Var.i;
        return new j(str, str2, str3, str4, obj, str5, arrayList2, i, h, z, y3Var != null ? y3Var.a : null, y3Var != null ? y3Var.b : null, b(c4Var.h.c));
    }

    public static final t10.k g(l5 l5Var) {
        ArrayList arrayList;
        k.g(l5Var, "<this>");
        t5 t5Var = l5Var.g;
        String str = l5Var.b;
        int i = l5Var.c;
        k5 k5Var = l5Var.e;
        String str2 = k5Var != null ? k5Var.a : null;
        String str3 = k5Var != null ? k5Var.b : null;
        String str4 = l5Var.d;
        Spanned fromHtml = Html.fromHtml(str4, 0);
        k.f(fromHtml, "fromHtml(...)");
        boolean z = !p.T(p.t0(fromHtml));
        o5 o5Var = l5Var.f;
        int i2 = o5Var.c;
        boolean z2 = o5Var.d;
        l b = b(t5Var);
        List<p5> list = t5Var.g.a;
        if (list != null) {
            arrayList = new ArrayList();
            for (p5 p5Var : list) {
                String str5 = p5Var != null ? p5Var.b : null;
                if (str5 != null) {
                    arrayList.add(str5);
                }
            }
        } else {
            arrayList = x61.r.r;
        }
        return new t10.k(str, i, str3, str2, str4, z, i2, z2, b, arrayList);
    }
}
