package vo0;

import android.text.Html;
import android.text.Spanned;
import ap0.c3;
import ap0.d0;
import ap0.d3;
import ap0.e3;
import ap0.g3;
import ap0.o4;
import ap0.p4;
import ap0.r2;
import ap0.t4;
import ap0.u2;
import ap0.u4;
import ap0.v4;
import ap0.w4;
import ap0.x4;
import ap0.y2;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import cp0.g;
import gu0.c;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import m7.y;
import t10.e;
import t10.i;
import t10.j;
import t10.l;
import t10.r;
import t10.s;
import t71.p;
import yz0.c2;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final e a(d0 d0Var) {
        String str = d0Var.b;
        String str2 = d0Var.c;
        String str3 = d0Var.d;
        String str4 = d0Var.e;
        String r0 = p.r0(d0Var.f, 150);
        int i = d0Var.g;
        c cVar = d0Var.i;
        return new e(str, str2, str3, str4, r0, i, y.o(cVar, str), cVar.c, b(d0Var.h.c));
    }

    public static final l b(x4 x4Var) {
        String str;
        Avatar avatar;
        String str2 = x4Var.a;
        String str3 = x4Var.b;
        String str4 = x4Var.c;
        w4 w4Var = x4Var.d;
        u4 u4Var = w4Var.f;
        String str5 = w4Var.c;
        v4 v4Var = w4Var.e;
        if (v4Var == null || (str = v4Var.c) == null) {
            str = u4Var != null ? u4Var.c : null;
        }
        g gVar = w4Var.g;
        if (gVar != null) {
            avatar = y.L(gVar);
        } else {
            Avatar.Companion.getClass();
            avatar = Avatar.u;
        }
        return new l(str2, str3, str4, str5, str, avatar, w4Var.d, x4Var.e, x4Var.f, u4Var != null);
    }

    public static final i c(r2 r2Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        c cVar = r2Var.l;
        String str = r2Var.b;
        String str2 = r2Var.c;
        String str3 = r2Var.d;
        String r0 = p.r0(r2Var.e, 150);
        int i = r2Var.j;
        c2 c2Var = new c2(r2Var.f, r2Var.g);
        int ordinal = r2Var.h.ordinal();
        if (ordinal == 0) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
        } else if (ordinal == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
        } else if (ordinal == 2) {
            issueOrPullRequestState = r2Var.i ? IssueOrPullRequestState.PULL_REQUEST_DRAFT : IssueOrPullRequestState.PULL_REQUEST_OPEN;
        } else {
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        return new i(str, str2, str3, r0, i, c2Var, issueOrPullRequestState, y.o(cVar, str), cVar.c, b(r2Var.k.c));
    }

    public static final r d(u2 u2Var) {
        k.g(u2Var, "<this>");
        return new r(u2Var.b, u2Var.c, u2Var.d, u2Var.e, u2Var.f, y.L(u2Var.h), u2Var.g);
    }

    public static final s e(y2 y2Var) {
        k.g(y2Var, "<this>");
        return new s(y2Var.b, y2Var.c, y2Var.d, y2Var.e, y2Var.f, y2Var.g.a, y2Var.h.a, y.L(y2Var.l), y2Var.i, y2Var.j, y2Var.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public static final j f(g3 g3Var) {
        java.util.ArrayList r12;
        List<e3> list;
        c cVar = g3Var.j;
        d3 d3Var = g3Var.g;
        String str = g3Var.b;
        String str2 = g3Var.c;
        String str3 = g3Var.d;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = g3Var.e;
        if (str4 == null) {
            str4 = "";
        }
        Spanned fromHtml = Html.fromHtml(str4 != null ? str4 : "", 0);
        k.f(fromHtml, "fromHtml(...)");
        String obj = p.t0(fromHtml).toString();
        String str5 = g3Var.f;
        if (d3Var == null || (list = d3Var.b) == null) {
            r12 = x61.rShadow.r;
        } else {
            r12 = new ArrayList();
            for (e3 e3Var : list) {
                String str6 = e3Var != null ? e3Var.d.b : null;
                if (str6 != null) {
                    r12.add(str6);
                }
            }
        }
        int i = d3Var != null ? d3Var.a : 0;
        List list2 = r12;
        ArrayList o = y.o(cVar, str);
        boolean z = cVar.c;
        c3 c3Var = g3Var.i;
        return new j(str, str2, str3, str4, obj, str5, list2, i, o, z, c3Var != null ? c3Var.a : null, c3Var != null ? c3Var.b : null, b(g3Var.h.c));
    }

    public static final t10.k g(p4 p4Var) {
        List list;
        k.g(p4Var, "<this>");
        x4 x4Var = p4Var.g;
        String str = p4Var.b;
        int i = p4Var.c;
        o4 o4Var = p4Var.e;
        String str2 = o4Var != null ? o4Var.a : null;
        String str3 = o4Var != null ? o4Var.b : null;
        String str4 = p4Var.d;
        Spanned fromHtml = Html.fromHtml(str4, 0);
        k.f(fromHtml, "fromHtml(...)");
        boolean z = !p.T(p.t0(fromHtml));
        uu0.u4 u4Var = p4Var.f;
        int i2 = u4Var.c;
        boolean z2 = u4Var.d;
        l b = b(x4Var);
        List<t4> list2 = x4Var.g.a;
        if (list2 != null) {
            list = new ArrayList();
            for (t4 t4Var : list2) {
                String str5 = t4Var != null ? t4Var.b : null;
                if (str5 != null) {
                    list.add(str5);
                }
            }
        } else {
            list = x61.rShadow.r;
        }
        return new t10.k(str, i, str3, str2, str4, z, i2, z2, b, list);
    }
}
