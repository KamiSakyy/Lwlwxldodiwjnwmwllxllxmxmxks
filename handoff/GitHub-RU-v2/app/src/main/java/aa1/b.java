package aa1;

import a0Shadow.y;
import a7.d;
import aa.u;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.SizeF;
import android.view.inputmethod.ExtractedText;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import ar0.i1;
import b6.c1;
import b6.h1;
import b6.l1;
import b6.n1;
import b6.o1;
import b6.v1;
import b6.w1;
import b6.x1;
import b6.z;
import com.github.service.models.response.WorkflowRunEvent;
import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.home.NavLinkIdentifier;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.issueorpullrequest.IssueTypeColor;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import cq.o;
import d2.a0Shadow;
import d3.w;
import d9.i;
import d9.q;
import f0.p1;
import f01.c;
import f01.e;
import f1Shadow.f4;
import g3.p0;
import gn0.bo;
import gv.b0;
import gv.c0;
import gv.v7;
import gv.x7;
import gv.y7;
import h0.b2;
import hc0.u00;
import i6.s;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jo.aj0;
import jo.wi0;
import jo.xi0;
import jo.yi0;
import jo.zi0;
import k3.j;
import k3.t;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import l3.v;
import m0.l;
import m10.dg0;
import m10.m8;
import m10.q8;
import m10.x40;
import m10.xc;
import m10.xz;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.helper.ValidationException;
import pz0.of;
import pz0.zs;
import q71.g;
import qn.f;
import sy.d0Shadow;
import t71.p;
import v71.f0;
import v8.l0;
import x.h0;
import x61.m;
import x61.n;
import x61.rShadow;
import x61.x;
import xn.d1;
import xn.e1;
import xn.f1Shadow;
import xn.g4;
import y41.t1;
import yz0.b1;
import yz0.b8;
import yz0.g0;
import yz0.l4;
import yz0.r3;
import yz0.t3;
import yz0.x2;
import z5.h;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b {
    public static final long a = 1048576;
    public static final long b = 1073741824;
    public static final long c = 1099511627776L;

    public static final j A(Context context) {
        return new j(new d(context, 4), new k3.a(Build.VERSION.SDK_INT >= 31 ? t.a.a(context) : 0));
    }

    public static final i B(q qVar) {
        k.g(qVar, "<this>");
        return new i(qVar.a, qVar.t);
    }

    public static final String C(e eVar) {
        String a2 = eVar.a();
        if (eVar instanceof f01.b) {
            return null;
        }
        if (eVar instanceof f01.d) {
            f01.d dVar = (f01.d) eVar;
            Integer num = dVar.d;
            if (k.b(a2, dVar.c)) {
                return num + ":" + xc.u;
            }
            return num + ":" + xc.t + "_" + xc.v;
        }
        if (!(eVar instanceof c)) {
            if (eVar instanceof f01.a) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        c cVar = (c) eVar;
        Integer num2 = cVar.f;
        if (k.b(cVar.a, cVar.c)) {
            return num2 + ":" + xc.u;
        }
        return num2 + ":" + xc.t + "_" + xc.v;
    }

    public static final int D(l lVar) {
        return (int) (lVar.o == b2.r ? lVar.b() & 4294967295L : lVar.b() >> 32);
    }

    public static String E(long j) {
        double d = 1024L;
        double d2 = j / d;
        double d3 = d2 / d;
        double d4 = d3 / d;
        double d5 = d4 / d;
        if (j < 1024) {
            return j + " bytes";
        }
        long j2 = a;
        if (j < j2 && 1024 <= j) {
            return String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)).concat(" KB");
        }
        long j3 = b;
        if (j < j3 && j2 <= j) {
            return String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1)).concat(" MB");
        }
        long j4 = c;
        return (j >= j4 || j3 > j) ? j >= j4 ? String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d5)}, 1)).concat(" TB") : "" : String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1)).concat(" GB");
    }

    public static final boolean F(zi0 zi0Var) {
        k.g(zi0Var, "<this>");
        aj0 aj0Var = zi0Var.a;
        if (aj0Var.a == null) {
            return false;
        }
        xi0 xi0Var = aj0Var.f;
        String str = xi0Var != null ? xi0Var.a : null;
        return (str == null || p.T(str)) ? false : true;
    }

    public static void G(boolean z) {
        if (!z) {
            throw new ValidationException("Must be true");
        }
    }

    public static void H(String str) {
        if (str == null || str.length() == 0) {
            throw new ValidationException("String must not be empty");
        }
    }

    public static void I(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new ValidationException(str2);
        }
    }

    public static void J(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new ValidationException(f1Shadow.e.z("The '", str2, "' parameter must not be empty."));
        }
    }

    public static void K(Object obj) {
        if (obj == null) {
            throw new ValidationException("Object must not be null");
        }
    }

    public static final a.a L(String str) {
        JSONObject jSONObject;
        k.g(str, "message");
        if (p.I(str, "Switching Protocols", false)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
        }
        Object opt = jSONObject.opt("e");
        String optString = jSONObject.optString("ch");
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        String optString2 = jSONObject.optString("off");
        if (optString2 == null) {
            optString2 = "";
        }
        if (k.b(opt, "msg")) {
            k.d(optString);
            if (optString.length() > 0 && optJSONObject != null) {
                return new qn.d(optString, optString2, new f(optJSONObject));
            }
        }
        return k.b(opt, "ack") ? qn.a.a : new qn.e(str);
    }

    public static final void M(RemoteViews remoteViews, b6.b2 b2Var, c1 c1Var, List list) {
        int i = 0;
        for (Object obj : m.x0(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                d0Shadow.x();
                throw null;
            }
            Y(remoteViews, b2Var.b(c1Var, i), (h) obj);
            i = i2;
        }
    }

    public static q71.e N(g gVar, int i) {
        k.g(gVar, "<this>");
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i2 = ((q71.e) gVar).r;
        int i3 = ((q71.e) gVar).s;
        if (((q71.e) gVar).t <= 0) {
            i = -i;
        }
        return new q71.e(i2, i3, i);
    }

    public static final NavLinkIdentifier O(dg0 dg0Var) {
        switch (dg0Var.ordinal()) {
            case 0:
                return NavLinkIdentifier.DISCUSSIONS;
            case 1:
                return NavLinkIdentifier.ISSUES;
            case 2:
                return NavLinkIdentifier.ORGANIZATIONS;
            case 3:
                return NavLinkIdentifier.PROJECTS;
            case 4:
                return NavLinkIdentifier.PULL_REQUESTS;
            case 5:
                return NavLinkIdentifier.REPOSITORIES;
            case 6:
                return NavLinkIdentifier.STARRED;
            case 7:
                return NavLinkIdentifier.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final x40 P(v01.d dVar) {
        k.g(dVar, "<this>");
        switch (dVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return x40.s;
            case 2:
                return x40.t;
            case 3:
                return x40.u;
            case 4:
                return x40.v;
            case 5:
                return x40.w;
            case 6:
                return x40.x;
            case 7:
                return x40.y;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final zs Q(PullRequestMergeMethod pullRequestMergeMethod) {
        k.g(pullRequestMergeMethod, "<this>");
        int i = jx0.h.a[pullRequestMergeMethod.ordinal()];
        if (i == 1) {
            return zs.w;
        }
        if (i == 2) {
            return zs.t;
        }
        if (i == 3) {
            return zs.v;
        }
        if (i == 4) {
            return zs.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Bitmap R(Drawable drawable, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i4, i5, i6, i7);
        return createBitmap;
    }

    public static final CommentLevelType S(xz xzVar) {
        int ordinal = xzVar.ordinal();
        if (ordinal == 0) {
            return CommentLevelType.FILE;
        }
        if (ordinal == 1) {
            return CommentLevelType.LINE;
        }
        if (ordinal == 2) {
            return CommentLevelType.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ExtractedText T(v vVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = vVar.a.s;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = vVar.b;
        extractedText.selectionStart = p0.f(j);
        extractedText.selectionEnd = p0.e(j);
        extractedText.flags = !p.J(vVar.a.s, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final WorkflowRunEvent U(u00 u00Var) {
        switch (u00Var == null ? -1 : ab0.p.a[u00Var.ordinal()]) {
            case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
            case 36:
                return WorkflowRunEvent.UNKNOWN__;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return WorkflowRunEvent.BRANCH_PROTECTION_RULE;
            case 2:
                return WorkflowRunEvent.CHECK_RUN;
            case 3:
                return WorkflowRunEvent.CHECK_SUITE;
            case 4:
                return WorkflowRunEvent.CREATE;
            case 5:
                return WorkflowRunEvent.DELETE;
            case 6:
                return WorkflowRunEvent.DEPLOYMENT;
            case 7:
                return WorkflowRunEvent.DEPLOYMENT_STATUS;
            case 8:
                return WorkflowRunEvent.DISCUSSION;
            case 9:
                return WorkflowRunEvent.DISCUSSION_COMMENT;
            case 10:
                return WorkflowRunEvent.DYNAMIC;
            case 11:
                return WorkflowRunEvent.FORK;
            case 12:
                return WorkflowRunEvent.GOLLUM;
            case 13:
                return WorkflowRunEvent.ISSUES;
            case 14:
                return WorkflowRunEvent.ISSUE_COMMENT;
            case 15:
                return WorkflowRunEvent.LABEL;
            case 16:
                return WorkflowRunEvent.MERGE_GROUP;
            case 17:
                return WorkflowRunEvent.MILESTONE;
            case 18:
                return WorkflowRunEvent.PAGE_BUILD;
            case 19:
                return WorkflowRunEvent.PROJECT;
            case 20:
                return WorkflowRunEvent.PROJECT_CARD;
            case 21:
                return WorkflowRunEvent.PROJECT_COLUMN;
            case 22:
                return WorkflowRunEvent.PUBLIC;
            case 23:
                return WorkflowRunEvent.PULL_REQUEST;
            case 24:
                return WorkflowRunEvent.PULL_REQUEST_REVIEW;
            case 25:
                return WorkflowRunEvent.PULL_REQUEST_REVIEW_COMMENT;
            case 26:
                return WorkflowRunEvent.PULL_REQUEST_TARGET;
            case 27:
                return WorkflowRunEvent.PUSH;
            case 28:
                return WorkflowRunEvent.REGISTRY_PACKAGE;
            case 29:
                return WorkflowRunEvent.RELEASE;
            case 30:
                return WorkflowRunEvent.REPOSITORY_DISPATCH;
            case 31:
                return WorkflowRunEvent.SCHEDULE;
            case 32:
                return WorkflowRunEvent.STATUS;
            case 33:
                return WorkflowRunEvent.WATCH;
            case 34:
                return WorkflowRunEvent.WORKFLOW_DISPATCH;
            case 35:
                return WorkflowRunEvent.WORKFLOW_RUN;
        }
    }

    public static final PullRequestMergeMethod V(zs zsVar) {
        k.g(zsVar, "<this>");
        int ordinal = zsVar.ordinal();
        if (ordinal == 0) {
            return PullRequestMergeMethod.MERGE;
        }
        if (ordinal == 1) {
            return PullRequestMergeMethod.REBASE;
        }
        if (ordinal == 2) {
            return PullRequestMergeMethod.SQUASH;
        }
        if (ordinal == 3) {
            return PullRequestMergeMethod.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final dg0 W(NavLinkIdentifier navLinkIdentifier) {
        k.g(navLinkIdentifier, "<this>");
        switch (az.a.a[navLinkIdentifier.ordinal()]) {
            case 1:
                return dg0.t;
            case 2:
                return dg0.u;
            case 3:
                return dg0.v;
            case 4:
                return dg0.w;
            case 5:
                return dg0.x;
            case 6:
                return dg0.y;
            case 7:
                return dg0.z;
            case 8:
                return dg0.A;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final g4 X(zi0 zi0Var) {
        ArrayList arrayList;
        sz0.b bVar;
        Double d;
        Double d2;
        Object obj;
        k.g(zi0Var, "<this>");
        d1 d1Var = e1.Companion;
        aj0 aj0Var = zi0Var.a;
        m8 m8Var = aj0Var.a;
        String str = m8Var != null ? m8Var.r : null;
        if (str == null) {
            str = "";
        }
        d1Var.getClass();
        e1 a2 = d1.a(str);
        boolean z = aj0Var.b;
        boolean z2 = aj0Var.c;
        boolean z3 = aj0Var.e;
        List<m8> list = aj0Var.j;
        if (list != null) {
            arrayList = new ArrayList(n.F(list, 10));
            for (m8 m8Var2 : list) {
                d1 d1Var2 = e1.Companion;
                String str2 = m8Var2.r;
                d1Var2.getClass();
                arrayList.add(d1.a(str2));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = rShadow.r;
        }
        ArrayList arrayList2 = arrayList;
        q8 q8Var = aj0Var.i;
        if (q8Var != null) {
            sz0.a aVar = sz0.b.Companion;
            String str3 = q8Var.r;
            aVar.getClass();
            Iterator it = sz0.b.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((sz0.b) obj).rShadow.equals(str3)) {
                    break;
                }
            }
            sz0.b bVar2 = (sz0.b) obj;
            if (bVar2 == null) {
                bVar2 = sz0.b.t;
            }
            bVar = bVar2;
        } else {
            bVar = null;
        }
        xi0 xi0Var = aj0Var.f;
        String str4 = xi0Var != null ? xi0Var.a : null;
        yi0 yi0Var = aj0Var.g;
        o oVar = yi0Var != null ? yi0Var.b : null;
        LocalDate localDate = oVar != null ? oVar.a : null;
        Boolean bool = oVar != null ? oVar.b : null;
        Double d3 = oVar != null ? oVar.c : null;
        wi0 wi0Var = aj0Var.h;
        cq.m mVar = wi0Var != null ? wi0Var.b : null;
        boolean z4 = mVar != null && p.I(mVar.h, "premium", false);
        LocalDate localDate2 = mVar != null ? mVar.a : null;
        double d4 = 100.0d;
        double doubleValue = (mVar == null || (d2 = mVar.f) == null) ? 100.0d : d2.doubleValue();
        if (mVar != null && (d = mVar.g) != null) {
            d4 = d.doubleValue();
        }
        if (z4) {
            doubleValue = d4;
        }
        boolean z5 = doubleValue > 0.0d;
        LocalDate localDate3 = localDate2;
        o oVar2 = oVar;
        LocalDate localDate4 = localDate;
        double d5 = z4 ? mVar != null ? mVar.c : 0.0d : mVar != null ? mVar.b : 0.0d;
        boolean z6 = oVar2 != null ? false : mVar != null && mVar.e;
        LocalDate localDate5 = localDate4 == null ? localDate3 : localDate4;
        if (bool != null) {
            z5 = bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(z5);
        if (d3 != null) {
            doubleValue = d3.doubleValue();
        }
        return new g4(a2, z, z2, z3, bVar, arrayList2, str4, new f1Shadow(localDate5, valueOf, Double.valueOf(doubleValue), z6, d5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x062f, code lost:
    
        if (k71.k.b(r0 != null ? r0.a : null, r2) != false) goto L276;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Y(RemoteViews remoteViews, b6.b2 b2Var, h hVar) {
        l1 l1Var;
        boolean z;
        boolean z2;
        String str;
        int i;
        int i2;
        if (hVar instanceof i6.i) {
            i6.i iVar = (i6.i) hVar;
            ArrayList arrayList = ((z5.j) iVar).c;
            l1 l1Var2 = l1.t;
            int size = arrayList.size();
            z5.n nVar = iVar.d;
            i6.c cVar = iVar.e;
            c1 b2 = h1.b(remoteViews, b2Var, l1Var2, size, nVar, new i6.a(cVar.a), new i6.b(cVar.b));
            k41.b.b(b2Var, remoteViews, iVar.d, b2);
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                h hVar2 = (h) obj;
                hVar2.b(hVar2.c().d(new b6.a(iVar.e)));
            }
            M(remoteViews, b2Var, b2, arrayList);
            return;
        }
        int i4 = 16;
        if (hVar instanceof i6.k) {
            i6.k kVar = (i6.k) hVar;
            l1 l1Var3 = (Build.VERSION.SDK_INT < 31 || !a.a.p(kVar.d)) ? l1.r : l1.S;
            ArrayList arrayList2 = ((z5.j) kVar).c;
            c1 b3 = h1.b(remoteViews, b2Var, l1Var3, arrayList2.size(), kVar.d, (i6.a) null, new i6.b(kVar.f));
            int i5 = b3.a;
            int i6 = kVar.e;
            int i7 = kVar.f;
            if (i6 != 0) {
                if (i6 == 2) {
                    i2 = 8388613;
                } else if (i6 == 1) {
                    i2 = 1;
                } else {
                    i6.a.b(i6);
                }
                if (i7 != 0) {
                    if (i7 == 2) {
                        i4 = 80;
                    } else if (i7 != 1) {
                        i6.b.b(i7);
                    }
                    remoteViews.setInt(i5, "setGravity", i2 | i4);
                    k41.b.b(b6.b2.a(b2Var, 0, (AtomicInteger) null, (c1) null, (AtomicBoolean) null, 0L, 0, (Integer) null, 61439), remoteViews, kVar.d, b3);
                    M(remoteViews, b2Var, b3, arrayList2);
                    if (!a.a.p(kVar.d) || arrayList2.isEmpty()) {
                        return;
                    }
                    int size3 = arrayList2.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                    }
                    return;
                }
                i4 = 48;
                remoteViews.setInt(i5, "setGravity", i2 | i4);
                k41.b.b(b6.b2.a(b2Var, 0, (AtomicInteger) null, (c1) null, (AtomicBoolean) null, 0L, 0, (Integer) null, 61439), remoteViews, kVar.d, b3);
                M(remoteViews, b2Var, b3, arrayList2);
                if (a.a.p(kVar.d)) {
                    return;
                } else {
                    return;
                }
            }
            i2 = 8388611;
            if (i7 != 0) {
            }
            i4 = 48;
            remoteViews.setInt(i5, "setGravity", i2 | i4);
            k41.b.b(b6.b2.a(b2Var, 0, (AtomicInteger) null, (c1) null, (AtomicBoolean) null, 0L, 0, (Integer) null, 61439), remoteViews, kVar.d, b3);
            M(remoteViews, b2Var, b3, arrayList2);
            if (a.a.p(kVar.d)) {
            }
        } else {
            if (!(hVar instanceof i6.j)) {
                if (hVar instanceof m6.a) {
                    m6.a aVar = (m6.a) hVar;
                    c1 c2 = h1.c(remoteViews, b2Var, l1.u, aVar.d);
                    int i9 = c2.a;
                    CharSequence charSequence = aVar.a;
                    m6.e eVar = aVar.b;
                    int i10 = aVar.c;
                    Context context = b2Var.a;
                    if (i10 != Integer.MAX_VALUE) {
                        remoteViews.setInt(i9, "setMaxLines", i10);
                    }
                    if (eVar == null) {
                        remoteViews.setTextViewText(i9, charSequence);
                    } else {
                        SpannableString spannableString = new SpannableString(charSequence);
                        int length = spannableString.length();
                        s3.o oVar = eVar.b;
                        if (oVar != null) {
                            long j = oVar.a;
                            if ((j & 1095216660480L) != 4294967296L) {
                                throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
                            }
                            remoteViews.setTextViewTextSize(i9, 2, s3.o.c(j));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        m6.b bVar = eVar.c;
                        if (bVar != null) {
                            int i11 = bVar.a;
                            arrayList3.add(new TextAppearanceSpan(context, i11 == 700 ? 2132017522 : i11 == 500 ? 2132017524 : 2132017525));
                        }
                        if (eVar.e != null) {
                            arrayList3.add(new TypefaceSpan("inter"));
                        }
                        m6.c cVar2 = eVar.d;
                        if (cVar2 != null) {
                            int i12 = cVar2.a;
                            int i13 = Build.VERSION.SDK_INT;
                            if (i13 >= 31) {
                                int i14 = (i12 == 3 ? 1 : i12 == 1 ? 3 : i12 == 2 ? 5 : (i12 != 4 && i12 == 5) ? 8388613 : 8388611) | 48;
                                if (i13 < 31) {
                                    throw new IllegalArgumentException("setGravity is only available on SDK 31 and higher");
                                }
                                remoteViews.setInt(i9, "setGravity", i14);
                            } else {
                                boolean z3 = b2Var.c;
                                arrayList3.add(new AlignmentSpan.Standard(i12 == 3 ? Layout.Alignment.ALIGN_CENTER : i12 == 1 ? z3 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : i12 == 2 ? z3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : i12 == 4 ? Layout.Alignment.ALIGN_NORMAL : i12 == 5 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL));
                            }
                        }
                        int size4 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size4) {
                            Object obj3 = arrayList3.get(i15);
                            i15++;
                            spannableString.setSpan((ParcelableSpan) obj3, 0, length, 17);
                        }
                        remoteViews.setTextViewText(i9, spannableString);
                        n6.i iVar2 = eVar.a;
                        if (iVar2 instanceof n6.h) {
                            remoteViews.setTextColor(i9, a0Shadow.y(0L));
                        } else if (iVar2 instanceof n6.i) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                f5.g.g(remoteViews, i9, "setTextColor", iVar2.a);
                            } else {
                                remoteViews.setTextColor(i9, a0Shadow.y(a0Shadow.c(context.getColor(iVar2.a))));
                            }
                        } else if (!(iVar2 instanceof h6.a)) {
                            Objects.toString(iVar2);
                        } else if (Build.VERSION.SDK_INT >= 31) {
                            h6.a aVar2 = (h6.a) iVar2;
                            f5.g.f(remoteViews, i9, "setTextColor", a0Shadow.y(aVar2.a), a0Shadow.y(aVar2.b));
                        } else {
                            remoteViews.setTextColor(i9, a0Shadow.y(((h6.a) iVar2).a(context)));
                        }
                    }
                    k41.b.b(b2Var, remoteViews, aVar.d, c2);
                    return;
                }
                if (hVar instanceof d6.b) {
                    d6.b bVar2 = (d6.b) hVar;
                    ArrayList arrayList4 = ((z5.j) bVar2).c;
                    if (arrayList4.size() != 1 || !k.b(bVar2.d, i6.c.d)) {
                        throw new IllegalArgumentException("Lazy list items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
                    }
                    Y(remoteViews, b2Var, (h) m.U(arrayList4));
                    return;
                }
                Throwable th = null;
                if (!(hVar instanceof d6.a)) {
                    if (hVar instanceof i6.l) {
                        i6.l lVar = (i6.l) hVar;
                        k41.b.b(b2Var, remoteViews, lVar.a, h1.c(remoteViews, b2Var, l1.z, lVar.a));
                        return;
                    }
                    if (!(hVar instanceof z5.i)) {
                        if (!(hVar instanceof z)) {
                            throw new IllegalArgumentException("Unknown element type " + hVar.getClass().getCanonicalName());
                        }
                        ArrayList arrayList5 = ((z5.j) ((z) hVar)).c;
                        if (arrayList5.size() > 1) {
                            throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList5.size() + ". The normalization of the composition tree failed.").toString());
                        }
                        h hVar3 = (h) m.W(arrayList5);
                        if (hVar3 != null) {
                            Y(remoteViews, b2Var, hVar3);
                            return;
                        }
                        return;
                    }
                    z5.i iVar3 = (z5.i) hVar;
                    boolean r = sy.rShadow.r(iVar3);
                    int i16 = iVar3.e;
                    if (i16 == 0) {
                        l1Var = r ? l1.N : l1.K;
                    } else if (i16 == 1) {
                        l1Var = r ? l1.O : l1.L;
                    } else if (i16 == 2) {
                        l1Var = r ? l1.P : l1.M;
                    } else {
                        i6.h.a(i16);
                        l1Var = l1.L;
                    }
                    c1 c3 = h1.c(remoteViews, b2Var, l1Var, iVar3.a);
                    Context context2 = b2Var.a;
                    int i17 = c3.a;
                    z5.a aVar3 = iVar3.b;
                    if (!(aVar3 instanceof z5.a)) {
                        throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
                    }
                    remoteViews.setImageViewResource(i17, aVar3.a);
                    z5.q qVar = iVar3.c;
                    if (qVar != null) {
                        if (!(qVar instanceof z5.q)) {
                            throw new IllegalArgumentException("An unsupported ColorFilter was used.");
                        }
                        h6.a aVar4 = qVar.a;
                        if (Build.VERSION.SDK_INT < 31) {
                            remoteViews.setInt(i17, "setColorFilter", a0Shadow.y(aVar4.a(context2)));
                        } else if (aVar4 instanceof h6.a) {
                            h6.a aVar5 = aVar4;
                            f5.g.f(remoteViews, i17, "setColorFilter", a0Shadow.y(aVar5.a), a0Shadow.y(aVar5.b));
                        } else if (aVar4 instanceof n6.i) {
                            f5.g.d(remoteViews, i17, "setColorFilter", ((n6.i) aVar4).a);
                        } else {
                            remoteViews.setInt(i17, "setColorFilter", a0Shadow.y(aVar4.a(context2)));
                        }
                    }
                    if (iVar3.d != null) {
                        z = false;
                        remoteViews.setInt(i17, "setImageAlpha", v((int) Math.rint(u(r3.floatValue(), 0.0f, 1.0f) * 255), 0, 255));
                    } else {
                        z = false;
                    }
                    k41.b.b(b2Var, remoteViews, iVar3.a, c3);
                    if (iVar3.e == 1) {
                        s sVar = (s) iVar3.a.a(g6.a.s, (Object) null);
                        n6.g gVar = sVar != null ? sVar.a : null;
                        n6.f fVar = n6.f.a;
                        if (!k.b(gVar, fVar)) {
                            i6.m mVar = (i6.m) iVar3.a.a(g6.a.t, (Object) null);
                        }
                        z2 = true;
                        remoteViews.setBoolean(i17, "setAdjustViewBounds", z2);
                        return;
                    }
                    z2 = z;
                    remoteViews.setBoolean(i17, "setAdjustViewBounds", z2);
                    return;
                }
                d6.a aVar6 = (d6.a) hVar;
                c1 c4 = h1.c(remoteViews, b2Var, l1.v, aVar6.d);
                if (b2Var.f) {
                    throw new IllegalStateException("Glance does not support nested list views.");
                }
                int i18 = c4.a;
                remoteViews.setPendingIntentTemplate(i18, PendingIntent.getActivity(b2Var.a, 0, new Intent(), 184549384, null));
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                b6.b2 a2 = b6.b2.a(b2Var, 0, (AtomicInteger) null, (c1) null, (AtomicBoolean) null, 0L, i18, (Integer) null, 64479);
                ArrayList arrayList8 = ((z5.j) aVar6).c;
                int size5 = arrayList8.size();
                boolean z4 = false;
                int i19 = 0;
                int i20 = 0;
                while (i19 < size5) {
                    Object obj4 = arrayList8.get(i19);
                    i19++;
                    int i21 = i20 + 1;
                    if (i20 < 0) {
                        Throwable th2 = th;
                        d0Shadow.x();
                        throw th2;
                    }
                    d6.b bVar3 = (h) obj4;
                    k.e(bVar3, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.EmittableLazyListItem");
                    long j2 = bVar3.f;
                    Throwable th3 = th;
                    ArrayList arrayList9 = arrayList8;
                    int i22 = size5;
                    RemoteViews Z = Z(b6.b2.a(a2, 0, new AtomicInteger(1048576), (c1) null, (AtomicBoolean) null, 0L, i20, (Integer) null, 64447), d0Shadow.n(bVar3), b2Var.d.a(bVar3));
                    arrayList6.add(Long.valueOf(j2));
                    arrayList7.add(Z);
                    z4 = z4 || j2 > -4611686018427387904L;
                    size5 = i22;
                    i20 = i21;
                    th = th3;
                    arrayList8 = arrayList9;
                }
                int i23 = h1.c;
                if (i23 < 1) {
                    ArrayList arrayList10 = new ArrayList(n.F(arrayList7, 10));
                    int size6 = arrayList7.size();
                    int i24 = 0;
                    while (i24 < size6) {
                        Object obj5 = arrayList7.get(i24);
                        i24++;
                        arrayList10.add(Integer.valueOf(((RemoteViews) obj5).getLayoutId()));
                    }
                    i23 = m.F0(m.J0(arrayList10)).size();
                }
                n1 n1Var = new n1(m.G0(arrayList6), (RemoteViews[]) arrayList7.toArray(new RemoteViews[0]), z4, Math.max(i23, 1));
                long j3 = b2Var.j;
                if (j3 != 9205357640488583168L) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) s3.f.c(s3.h.b(j3)));
                    sb.append('x');
                    sb.append((Object) s3.f.c(s3.h.a(j3)));
                    str = sb.toString();
                } else {
                    str = "Unspecified";
                }
                if (Build.VERSION.SDK_INT > 31) {
                    a5.n.i(remoteViews, i18, n1Var);
                } else {
                    Context context3 = b2Var.a;
                    int i25 = b2Var.b;
                    Intent putExtra = new Intent().setComponent((ComponentName) b2Var.o.t).putExtra("appWidgetId", i25).putExtra("androidx.glance.widget.extra.view_id", i18).putExtra("androidx.glance.widget.extra.size_info", str);
                    putExtra.setData(Uri.parse(putExtra.toUri(1)));
                    if (context3.getPackageManager().resolveService(putExtra, 0) == null) {
                        throw new IllegalStateException((putExtra.getComponent() + " could not be resolved, check the app manifest.").toString());
                    }
                    remoteViews.setRemoteAdapter(i18, putExtra);
                    u uVar = GlanceRemoteViewsService.r;
                    synchronized (uVar) {
                        uVar.a.put(u.e(i25, str, i18), n1Var);
                    }
                    AppWidgetManager.getInstance(context3).notifyAppWidgetViewDataChanged(i25, i18);
                }
                k41.b.b(b2Var, remoteViews, aVar6.d, c4);
                return;
            }
            i6.j jVar = (i6.j) hVar;
            l1 l1Var4 = (Build.VERSION.SDK_INT < 31 || !a.a.p(jVar.d)) ? l1.s : l1.T;
            ArrayList arrayList11 = ((z5.j) jVar).c;
            c1 b4 = h1.b(remoteViews, b2Var, l1Var4, arrayList11.size(), jVar.d, new i6.a(jVar.f), (i6.b) null);
            int i26 = b4.a;
            int i27 = jVar.f;
            int i28 = jVar.e;
            if (i27 != 0) {
                if (i27 == 2) {
                    i = 8388613;
                } else if (i27 == 1) {
                    i = 1;
                } else {
                    i6.a.b(i27);
                }
                if (i28 != 0) {
                    if (i28 == 2) {
                        i4 = 80;
                    } else if (i28 != 1) {
                        i6.b.b(i28);
                    }
                    remoteViews.setInt(i26, "setGravity", i | i4);
                    k41.b.b(b6.b2.a(b2Var, 0, (AtomicInteger) null, (c1) null, (AtomicBoolean) null, 0L, 0, (Integer) null, 61439), remoteViews, jVar.d, b4);
                    M(remoteViews, b2Var, b4, arrayList11);
                    if (!a.a.p(jVar.d) || arrayList11.isEmpty()) {
                        return;
                    }
                    int size7 = arrayList11.size();
                    int i29 = 0;
                    while (i29 < size7) {
                        Object obj6 = arrayList11.get(i29);
                        i29++;
                    }
                    return;
                }
                i4 = 48;
                remoteViews.setInt(i26, "setGravity", i | i4);
                k41.b.b(b6.b2.a(b2Var, 0, (AtomicInteger) null, (c1) null, (AtomicBoolean) null, 0L, 0, (Integer) null, 61439), remoteViews, jVar.d, b4);
                M(remoteViews, b2Var, b4, arrayList11);
                if (a.a.p(jVar.d)) {
                    return;
                } else {
                    return;
                }
            }
            i = 8388611;
            if (i28 != 0) {
            }
            i4 = 48;
            remoteViews.setInt(i26, "setGravity", i | i4);
            k41.b.b(b6.b2.a(b2Var, 0, (AtomicInteger) null, (c1) null, (AtomicBoolean) null, 0L, 0, (Integer) null, 61439), remoteViews, jVar.d, b4);
            M(remoteViews, b2Var, b4, arrayList11);
            if (a.a.p(jVar.d)) {
            }
        }
    }

    public static final RemoteViews Z(b6.b2 b2Var, List list, int i) {
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!(((h) it.next()) instanceof z)) {
                    h hVar = (h) m.s0(list);
                    o1 a2 = h1.a(b2Var, hVar.c(), i);
                    RemoteViews remoteViews = a2.a;
                    Y(remoteViews, b6.b2.a(b2Var.b(a2.b, 0), 0, new AtomicInteger(-1), (c1) null, new AtomicBoolean(false), 0L, 0, (Integer) null, 65215), hVar);
                    return remoteViews;
                }
            }
        }
        Object U = m.U(list);
        k.e(U, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        x1 x1Var = ((z) U).e;
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            z zVar = (h) it2.next();
            k.e(zVar, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            z zVar2 = zVar;
            long j = zVar2.d;
            o1 a3 = h1.a(b2Var, zVar2.c(), i);
            RemoteViews remoteViews2 = a3.a;
            Y(remoteViews2, b6.b2.a(b2Var.b(a3.b, 0), 0, new AtomicInteger(-1), (c1) null, new AtomicBoolean(false), j, 0, (Integer) null, 64703), zVar);
            arrayList.add(new w61.k(new SizeF(s3.h.b(j), s3.h.a(j)), remoteViews2));
        }
        if (x1Var instanceof w1) {
            return (RemoteViews) ((w61.k) m.s0(arrayList)).s;
        }
        if (!k.b(x1Var, v1.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return a5.n.b(x.A(arrayList));
        }
        if (arrayList.size() != 1 && arrayList.size() != 2) {
            throw new IllegalArgumentException("unsupported views size");
        }
        ArrayList arrayList2 = new ArrayList(n.F(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add((RemoteViews) ((w61.k) obj).s);
        }
        int size2 = arrayList2.size();
        if (size2 == 1) {
            return (RemoteViews) arrayList2.get(0);
        }
        if (size2 == 2) {
            return new RemoteViews((RemoteViews) arrayList2.get(0), (RemoteViews) arrayList2.get(1));
        }
        throw new IllegalArgumentException("There must be between 1 and 2 views.");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(n0.c cVar, w1.rShadow rVar, n0.z zVar, d2 d2Var, androidx.compose.foundation.layout.k kVar, androidx.compose.foundation.layout.i iVar, h0.h1 h1Var, boolean z, f0.j jVar, j71.c cVar2, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.rShadow rVar2;
        int i3;
        androidx.compose.foundation.layout.k kVar2;
        androidx.compose.foundation.layout.i iVar2;
        int i4;
        int i5;
        d2 d2Var2;
        h0.h1 h1Var2;
        boolean z2;
        w1.rShadow rVar3;
        androidx.compose.foundation.layout.k kVar3;
        androidx.compose.foundation.layout.i iVar3;
        f0.j jVar2;
        androidx.compose.runtime.b2 t;
        int i6;
        f0.j a2;
        d2 d2Var3;
        h0.h1 h1Var3;
        boolean z3;
        int i7;
        sVar.e0(-2072102870);
        int i8 = i | (sVar.f(cVar) ? 4 : 2);
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 = i8 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i8 | (sVar.f(rVar2) ? 32 : 16);
        }
        int i10 = i3 | (sVar.f(zVar) ? 256 : 128) | 27648;
        if ((i & 196608) == 0) {
            if ((i2 & 32) == 0) {
                kVar2 = kVar;
                if (sVar.f(kVar2)) {
                    i7 = 131072;
                    i10 |= i7;
                }
            } else {
                kVar2 = kVar;
            }
            i7 = 65536;
            i10 |= i7;
        } else {
            kVar2 = kVar;
        }
        int i11 = i2 & 64;
        if (i11 != 0) {
            i10 |= 1572864;
        } else if ((i & 1572864) == 0) {
            iVar2 = iVar;
            i10 |= sVar.f(iVar2) ? 1048576 : 524288;
            i4 = i10 | 373293056;
            i5 = !sVar.h(cVar2) ? 4 : 2;
            boolean z4 = true;
            if (sVar.S(i4 & 1, (306783379 & i4) == 306783378 || (i5 & 3) != 2)) {
                sVar.V();
                d2Var2 = d2Var;
                h1Var2 = h1Var;
                z2 = z;
                rVar3 = rVar2;
                kVar3 = kVar2;
                iVar3 = iVar2;
                jVar2 = jVar;
            } else {
                sVar.X();
                int i12 = i & 1;
                Object obj = androidx.compose.runtime.n.a;
                if (i12 == 0 || sVar.A()) {
                    if (i9 != 0) {
                        rVar2 = w1.o.a;
                    }
                    float f = 0;
                    d2 f2Var = new f2(f, f, f, f);
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        kVar2 = androidx.compose.foundation.layout.l.c;
                    }
                    if (i11 != 0) {
                        iVar2 = androidx.compose.foundation.layout.l.a;
                    }
                    y a3 = z.f1Shadow.a(sVar);
                    boolean f2 = sVar.f(a3);
                    Object N = sVar.N();
                    Object obj2 = N;
                    if (f2 || N == obj) {
                        Object zVar2 = new h0.z(a3);
                        sVar.n0(zVar2);
                        obj2 = zVar2;
                    }
                    h0.h1 h1Var4 = (h0.z) obj2;
                    i6 = i4 & (-1908408321);
                    a2 = p1.a(sVar);
                    d2Var3 = f2Var;
                    w1.rShadow rVar4 = rVar2;
                    h1Var3 = h1Var4;
                    rVar3 = rVar4;
                    z3 = true;
                } else {
                    sVar.V();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    d2Var3 = d2Var;
                    z3 = z;
                    i6 = i4 & (-1908408321);
                    rVar3 = rVar2;
                    h1Var3 = h1Var;
                    a2 = jVar;
                }
                androidx.compose.foundation.layout.i iVar4 = iVar2;
                sVar.r();
                int i13 = (i6 & 14) | ((i6 >> 15) & 112);
                boolean z5 = (((i13 & 14) ^ 6) > 4 && sVar.f(cVar)) || (i13 & 6) == 4;
                f0.j jVar3 = a2;
                if ((((i13 & 112) ^ 48) <= 32 || !sVar.f(iVar4)) && (i13 & 48) != 32) {
                    z4 = false;
                }
                boolean z6 = z5 | z4;
                Object N2 = sVar.N();
                if (z6 || N2 == obj) {
                    N2 = new n0.e(new f4(7, cVar, iVar4));
                    sVar.n0(N2);
                }
                int i14 = i6 >> 3;
                b41.b.c(rVar3, zVar, (n0.e) N2, d2Var3, h1Var3, z3, jVar3, kVar2, iVar4, cVar2, sVar, (i14 & 112) | (i14 & 14) | 196608 | 12610560 | ((i6 << 12) & 1879048192), ((i6 >> 18) & 14) | ((i5 << 3) & 112));
                d2Var2 = d2Var3;
                kVar3 = kVar2;
                jVar2 = jVar3;
                z2 = z3;
                h1Var2 = h1Var3;
                iVar3 = iVar4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.fileschanged.ui.b(cVar, rVar3, zVar, d2Var2, kVar3, iVar3, h1Var2, z2, jVar2, cVar2, i, i2);
                return;
            }
            return;
        }
        iVar2 = iVar;
        i4 = i10 | 373293056;
        if (!sVar.h(cVar2)) {
        }
        boolean z42 = true;
        if (sVar.S(i4 & 1, (306783379 & i4) == 306783378 || (i5 & 3) != 2)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final RemoteViews a0(Context context, int i, b6.p1 p1Var, b6.e1 e1Var, int i2, ComponentName componentName, b1.m mVar) {
        return Z(new b6.b2(context, i, context.getResources().getConfiguration().getLayoutDirection() == 1, e1Var, -1, false, new AtomicInteger(-1), new c1(0, 0, (Map) null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, (Integer) null, componentName, mVar), ((z5.j) p1Var).c, i2);
    }

    public static final ArrayList b(int i, int i2, int i3) {
        int i4 = i - ((i2 - 1) * i3);
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    public static g b0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new g(i, i2 - 1, 1);
        }
        g gVar = g.u;
        return g.u;
    }

    public static final void c(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final boolean c0(er0.i iVar) {
        er0.h hVar = iVar.i;
        return (hVar != null ? hVar.b : false) && iVar.h == null;
    }

    public static final com.github.service.models.response.a d(ud0.a aVar) {
        return new com.github.service.models.response.a(aVar != null ? aVar.b : "", b41.b.O(aVar != null ? aVar.d : null), (String) null, false, (String) null, 60);
    }

    public static final void d0(d3.t tVar, int i, c3.h hVar) {
        d3.t tVar2;
        l1.e eVar = new l1.e(new d3.t[16]);
        List i2 = tVar.i(false, false);
        while (true) {
            eVar.c(eVar.t, i2);
            while (true) {
                int i3 = eVar.t;
                if (i3 == 0) {
                    return;
                }
                tVar2 = (d3.t) eVar.l(i3 - 1);
                boolean e = w.e(tVar2);
                d3.o oVar = tVar2.d;
                h0 h0Var = oVar.r;
                if (!e && !h0Var.c(d3.x.i)) {
                    v2.d1 d = tVar2.d();
                    if (d == null) {
                        throw x.i.p("Expected semantics node to have a coordinator.");
                    }
                    s3.k J = l0.J(androidx.compose.ui.layout.z.g(d, true));
                    if (J.a < J.c && J.b < J.d) {
                        Object g = oVar.rShadow.g(d3.n.e);
                        if (g == null) {
                            g = null;
                        }
                        j71.e eVar2 = (j71.e) g;
                        Object g2 = h0Var.g(d3.x.v);
                        d3.l lVar = (d3.l) (g2 != null ? g2 : null);
                        if (eVar2 != null && lVar != null && ((Number) lVar.b.a()).floatValue() > 0.0f) {
                            int i4 = 1 + i;
                            hVar.k(new c3.i(tVar2, i4, J, d));
                            d0(tVar2, i4, hVar);
                        }
                    }
                }
            }
            i2 = tVar2.i(false, false);
        }
    }

    public static final f01.g e(ar.c cVar, String str, String str2, pv.c cVar2, ju.a aVar, String str3, PullRequestReviewCommentState pullRequestReviewCommentState, String str4, String str5, boolean z, nv.a aVar2, String str6, String str7, boolean z2, boolean z3, String str8, boolean z4, boolean z5, pu.a aVar3, CommentLevelType commentLevelType) {
        k.g(pullRequestReviewCommentState, "state");
        k.g(commentLevelType, "commentLevelType");
        String str9 = cVar.b;
        fz.b bVar = new fz.b(cVar, str5, pullRequestReviewCommentState == PullRequestReviewCommentState.PENDING ? new g0(str9) : new yz0.l0(str9));
        String str10 = aVar2 != null ? aVar2.c : null;
        DiffLineType diffLineType = k.b(str10, "-") ? DiffLineType.DELETION : k.b(str10, "+") ? DiffLineType.ADDITION : DiffLineType.CONTEXT;
        String str11 = aVar2 != null ? aVar2.d : null;
        DiffLineType diffLineType2 = k.b(str11, "-") ? DiffLineType.DELETION : k.b(str11, "+") ? DiffLineType.ADDITION : DiffLineType.CONTEXT;
        x2 f = k41.b.f(aVar);
        ArrayList h = w8.s.h(bVar.getId(), cVar2);
        DiffLineType diffLineType3 = diffLineType2;
        return new f01.g(str, str2, str3, pullRequestReviewCommentState, (String) null, str4, diffLineType3, str6, str7, z2, z3, str8, z4, z5, z3, f, bVar, h, cVar2.c, aVar2 != null ? aVar2.a : null, aVar2 != null ? aVar2.b : null, diffLineType, diffLineType3, aVar3 != null ? aVar3.b : false, aVar3 != null ? aVar3.c : false, z, commentLevelType);
    }

    public static int e0(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static b1 f(es.a aVar, List list) {

        Object r4 = null;
        List list2;
        int intValue;
        String str;
        List list3;
        int intValue2;
        String str2;
        String str3;
        w61.p pVar = wz0.d.a;
        wz0.e b2 = wz0.d.b(aVar.b, wz0.d.a(b31.b.g0(aVar.a)), true);
        k.g(aVar, "<this>");
        List list4 = rShadow.r;
        if (list == null) {
            list = list4;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((f01.g) obj).f != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            String str4 = ((f01.g) obj2).f;
            if (str4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object obj3 = linkedHashMap.get(str4);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(str4, obj3);
            }
            ((List) obj3).add(obj2);
        }
        String str5 = b2.a;
        int i2 = b2.b;
        Integer num = aVar.d;
        Integer num2 = aVar.c;
        xc xcVar = aVar.a;
        xc xcVar2 = xc.u;
        Integer valueOf = xcVar == xcVar2 ? num2 : Integer.valueOf(num != null ? num.intValue() : 0);
        String str6 = xcVar == xcVar2 ? valueOf + ":" + xcVar2 : valueOf + ":" + DiffLineType.ADDITION + "_" + DiffLineType.INJECTED_CONTEXT;
        String str7 = "";
        switch (sy.e.b[b31.b.g0(xcVar).ordinal()]) {
            case 1:
                List list5 = (List) linkedHashMap.get(str6);
                if (list5 == null) {
                    list5 = list4;
                }
                f01.g gVar = (f01.g) m.W(list5);
                if (gVar != null && (str = gVar.a) != null) {
                    str7 = str;
                }
                list2 = list5;
                intValue = num2 != null ? num2.intValue() : 0;
                return new b1(str5, i2, b31.b.g0(xcVar), str6, intValue, r4, str7, list2, aVar.e, aVar.f);
            case 2:
                list3 = (List) linkedHashMap.get(str6);
                if (list3 == null) {
                    list3 = list4;
                }
                f01.g gVar2 = (f01.g) m.W(list3);
                if (gVar2 != null && (str2 = gVar2.a) != null) {
                    str7 = str2;
                }
                intValue2 = num != null ? num.intValue() : 0;
                list2 = list3;
                intValue = r4;
                r4 = intValue2;
                return new b1(str5, i2, b31.b.g0(xcVar), str6, intValue, r4, str7, list2, aVar.e, aVar.f);
            case 3:
            case 4:
                list3 = (List) linkedHashMap.get(str6);
                if (list3 == null) {
                    list3 = list4;
                }
                f01.g gVar3 = (f01.g) m.W(list3);
                if (gVar3 != null && (str3 = gVar3.a) != null) {
                    str7 = str3;
                }
                intValue2 = num != null ? num.intValue() : 0;
                if (num2 != null) {
                    r4 = num2.intValue();
                }
                list2 = list3;
                intValue = r4;
                r4 = intValue2;
                return new b1(str5, i2, b31.b.g0(xcVar), str6, intValue, r4, str7, list2, aVar.e, aVar.f);
            case 5:
            case 6:
                int intValue3 = num != null ? num.intValue() : 0;
                list2 = list4;
                intValue = num2 != null ? num2.intValue() : 0;
                r4 = intValue3;
                return new b1(str5, i2, b31.b.g0(xcVar), str6, intValue, r4, str7, list2, aVar.e, aVar.f);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final b01.g g(yp0.c cVar, String str, gu0.c cVar2, at0.a aVar, er0.o oVar, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, i1 i1Var, boolean z6, boolean z7, boolean z8) {
        er0.t tVar;
        er0.n nVar = oVar.b;
        kx0.b bVar = new kx0.b(cVar, str, yz0.p0.s);
        String str3 = cVar.b;
        ArrayList o = m7.y.o(cVar2, str3);
        boolean z9 = cVar2.c;
        Integer valueOf = Integer.valueOf(nVar.a);
        x2 g = com.google.common.util.concurrent.a.g(aVar);
        rShadow rVar = nVar.b;
        if (rVar == null) {
            rVar = rShadow.r;
        }
        ArrayList S = m.S(rVar);
        ArrayList arrayList = new ArrayList(n.F(S, 10));
        int size = S.size();
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            er0.v vVar = ((er0.m) obj).c;
            yp0.c cVar3 = vVar.h;
            String str4 = vVar.b;
            gu0.c cVar4 = vVar.i;
            Integer num = valueOf;
            at0.a aVar2 = vVar.k;
            gt0.a aVar3 = vVar.j;
            ArrayList arrayList2 = S;
            boolean z10 = aVar3.b;
            boolean z11 = aVar3.c;
            bw0.a aVar4 = cVar3.l;
            boolean z12 = aVar4 != null ? aVar4.b : false;
            boolean z13 = vVar.c;
            boolean z14 = vVar.d;
            boolean z15 = vVar.e;
            er0.u uVar = vVar.f;
            arrayList.add(i(cVar3, str4, cVar4, aVar2, z10, z11, z12, z13, z14, z15, (uVar == null || (tVar = uVar.c) == null) ? null : tVar.b));
            valueOf = num;
            S = arrayList2;
        }
        return new b01.g(bVar, o, z9, valueOf, z, z2, z3, z4, str2, z5, g, arrayList, new b8(i1Var.d, str3, z8, i1Var.c), z6, z7);
    }

    public static final b01.g h(yp0.c cVar, String str, gu0.c cVar2, at0.a aVar, Integer num, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, List list, i1 i1Var, boolean z6, boolean z7, boolean z8) {
        x2 x2Var;
        kx0.b bVar = new kx0.b(cVar, str, yz0.p0.s);
        String str3 = cVar.b;
        ArrayList o = m7.y.o(cVar2, str3);
        boolean z9 = cVar2.c;
        if (aVar != null) {
            x2Var = com.google.common.util.concurrent.a.g(aVar);
        } else {
            x2.Companion.getClass();
            x2Var = x2.e;
        }
        return new b01.g(bVar, o, z9, num, z, z2, z3, z4, str2, z5, x2Var, list, new b8(i1Var.d, str3, z8, i1Var.c), z6, z7);
    }

    public static final b01.g i(yp0.c cVar, String str, gu0.c cVar2, at0.a aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2) {
        return new b01.g(new kx0.b(cVar, str, yz0.p0.s), m7.y.o(cVar2, cVar.b), cVar2.c, (Integer) null, z3, z4, z5, z6, str2, false, com.google.common.util.concurrent.a.g(aVar), (List) null, (b8) null, z, z2);
    }

    public static final IssueType k(yr0.a aVar) {
        k.g(aVar, "<this>");
        String str = aVar.a;
        String str2 = aVar.b;
        of ofVar = aVar.e;
        k.g(ofVar, "<this>");
        int ordinal = ofVar.ordinal();
        return new IssueType(str, str2, aVar.c, aVar.d, ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 4 ? ordinal != 5 ? ordinal != 6 ? ordinal != 7 ? IssueTypeColor.UNKNOWN : IssueTypeColor.YELLOW : IssueTypeColor.RED : IssueTypeColor.PURPLE : IssueTypeColor.PINK : IssueTypeColor.GREEN : IssueTypeColor.GRAY : IssueTypeColor.BLUE);
    }

    public static x3.k l(f0 f0Var) {
        return t.q.m(new c5.b(14, f0Var));
    }

    public static final l4 m(fw0.c1 c1Var) {
        k.g(c1Var, "<this>");
        return new l4(m7.y.L(c1Var.g), c1Var.b, c1Var.c, c1Var.d, c1Var.e);
    }

    public static String n(int i, String str, int i2) {
        if (i < 0) {
            return b41.b.D("%s (%s) must not be negative", new Object[]{str, Integer.valueOf(i)});
        }
        if (i2 >= 0) {
            return b41.b.D("%s (%s) must not be greater than size (%s)", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)});
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final Object o(v2.j jVar, j71.a aVar, c71.c cVar) {
        w1.q qVar;
        v2.d1 u;
        Object m0;
        m11.h hVar;
        w1.q qVar2 = (w1.q) jVar;
        boolean z = qVar2.rShadow.E;
        if (z) {
            if (!z) {
                t2.a.b("visitAncestors called on an unattached node");
            }
            w1.q qVar3 = qVar2.rShadow.v;
            v2.g0 v = v2.l.v(jVar);
            loop0: while (true) {
                qVar = null;
                if (v == null) {
                    break;
                }
                if ((((w1.q) v.X.g).u & 524288) != 0) {
                    while (qVar3 != null) {
                        if ((qVar3.t & 524288) != 0) {
                            w1.q qVar4 = qVar3;
                            l1.e eVar = null;
                            while (qVar4 != null) {
                                if (qVar4 instanceof a3.a) {
                                    qVar = qVar4;
                                    break loop0;
                                }
                                if ((qVar4.t & 524288) != 0 && (qVar4 instanceof v2.k)) {
                                    int i = 0;
                                    for (w1.q qVar5 = ((v2.k) qVar4).G; qVar5 != null; qVar5 = qVar5.w) {
                                        if ((qVar5.t & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qVar4 = qVar5;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new l1.e(new w1.q[16]);
                                                }
                                                if (qVar4 != null) {
                                                    eVar.b(qVar4);
                                                    qVar4 = null;
                                                }
                                                eVar.b(qVar5);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                qVar4 = v2.l.e(eVar);
                            }
                        }
                        qVar3 = qVar3.v;
                    }
                }
                v = v.w();
                qVar3 = (v == null || (hVar = v.X) == null) ? null : (v2.w1Shadow) hVar.f;
            }
            a3.a aVar2 = (a3.a) qVar;
            if (aVar2 != null && (m0 = aVar2.m0((u = v2.l.u(jVar)), new a2.b(1, aVar, u), cVar)) == b71.a.r) {
                return m0;
            }
        }
        return w61.a0Shadow.a;
    }

    public static final ArrayList p(aj0.c cVar, String str) {
        k.g(str, "subjectId");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<aj0.a> list = cVar != null ? cVar.d : null;
        if (list == null) {
            list = rShadow.r;
        }
        for (aj0.a aVar : list) {
            bo boVar = aVar.d;
            int i = aVar.c.b;
            String str2 = boVar.r;
            t3 t3Var = t3.c;
            if (!k.b(str2, "CONFUSED")) {
                t3Var = t3.d;
                if (!k.b(str2, "EYES")) {
                    t3Var = t3.e;
                    if (!k.b(str2, "HEART")) {
                        t3Var = t3.f;
                        if (!k.b(str2, "HOORAY")) {
                            t3Var = t3.g;
                            if (!k.b(str2, "LAUGH")) {
                                t3Var = t3.h;
                                if (!k.b(str2, "ROCKET")) {
                                    t3Var = t3.i;
                                    if (!k.b(str2, "THUMBS_DOWN")) {
                                        t3Var = t3.j;
                                        if (!k.b(str2, "THUMBS_UP")) {
                                            t3Var = t3.k;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            r3 r3Var = new r3(t3Var, str, i, aVar.b);
            arrayList2.add(r3Var);
            if (i > 0) {
                arrayList.add(r3Var);
            }
        }
        return m.l0(d0Shadow.b(new yz0.b[]{new yz0.b(arrayList2)}), arrayList);
    }

    public static void q(int i, int i2) {
        String D;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                D = b41.b.D("%s (%s) must not be negative", new Object[]{"index", Integer.valueOf(i)});
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                D = b41.b.D("%s (%s) must be less than size (%s)", new Object[]{"index", Integer.valueOf(i), Integer.valueOf(i2)});
            }
            throw new IndexOutOfBoundsException(D);
        }
    }

    public static void r(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(n(i, "index", i2));
        }
    }

    public static void s(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? n(i, "start index", i3) : (i2 < 0 || i2 > i3) ? n(i2, "end index", i3) : b41.b.D("end index (%s) must not be less than start index (%s)", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    public static double t(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float u(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int v(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long w(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static Comparable x(Float f, q71.d dVar) {
        k.g(dVar, "range");
        float f2 = dVar.b;
        float f3 = dVar.a;
        if (f3 <= f2) {
            return (!q71.d.a(f, Float.valueOf(f3)) || q71.d.a(Float.valueOf(f3), f)) ? (!q71.d.a(Float.valueOf(f2), f) || q71.d.a(f, Float.valueOf(f2))) ? f : Float.valueOf(f2) : Float.valueOf(f3);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
    }

    public static Comparable y(Integer num, Integer num2, Integer num3) {
        if (num2 == null || num3 == null) {
            if (num2 != null && num.compareTo(num2) < 0) {
                return num2;
            }
            if (num3 != null && num.compareTo(num3) > 0) {
                return num3;
            }
        } else {
            if (num2.compareTo(num3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + num3 + " is less than minimum " + num2 + '.');
            }
            if (num.compareTo(num2) < 0) {
                return num2;
            }
            if (num.compareTo(num3) > 0) {
                return num3;
            }
        }
        return num;
    }

    public static final LinkedHashMap z(gv.f0 f0Var, xz xzVar) {
        rShadow rVar;
        ArrayList arrayList;
        f01.g e;
        gv.f0 f0Var2 = f0Var;
        rShadow rVar2 = f0Var2.c.a;
        rShadow rVar3 = rShadow.r;
        if (rVar2 == null) {
            rVar2 = rVar3;
        }
        ArrayList S = m.S(rVar2);
        ArrayList arrayList2 = new ArrayList(n.F(S, 10));
        int size = S.size();
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            c0 c0Var = (c0) obj;
            if (c0Var.b == xzVar) {
                rShadow rVar4 = c0Var.j.a;
                if (rVar4 == null) {
                    rVar4 = rVar3;
                }
                ArrayList S2 = m.S(rVar4);
                rVar = new ArrayList();
                int size2 = S2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = S2.get(i2);
                    i2++;
                    y7 y7Var = ((b0) obj2).c;
                    v7 v7Var = y7Var.f;
                    String str = v7Var != null ? v7Var.a : null;
                    x7 x7Var = y7Var.g;
                    e x = x7Var != null ? sy.w.x(x7Var.g.b) : null;
                    if (x instanceof f01.b) {
                        arrayList = S;
                        e = null;
                    } else {
                        ar.c cVar = y7Var.k;
                        String str2 = c0Var.c;
                        arrayList = S;
                        pv.c cVar2 = y7Var.l;
                        ju.a aVar = y7Var.o;
                        String str3 = y7Var.h;
                        PullRequestReviewCommentState P = t1.P(y7Var.i);
                        String C = x != null ? C(x) : null;
                        String str4 = y7Var.j;
                        boolean z = y7Var.m.b;
                        nv.a aVar2 = c0Var.k;
                        String str5 = f0Var2.a;
                        String str6 = f0Var2.b;
                        boolean z2 = c0Var.i;
                        boolean z3 = c0Var.d;
                        gv.d0Shadow d0Var = c0Var.h;
                        e = e(cVar, str2, str, cVar2, aVar, str3, P, C, str4, z, aVar2, str5, str6, z2, z3, d0Var != null ? d0Var.a : "", c0Var.f, c0Var.g, y7Var.n, S(c0Var.b));
                    }
                    if (e != null) {
                        rVar.add(e);
                    }
                    f0Var2 = f0Var;
                    S = arrayList;
                }
            } else {
                rVar = rVar3;
            }
            ArrayList arrayList3 = S;
            arrayList2.add(rVar);
            f0Var2 = f0Var;
            S = arrayList3;
        }
        ArrayList G = n.G(arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size3 = G.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = G.get(i3);
            i3++;
            String str7 = ((f01.g) obj3).c;
            Object obj4 = linkedHashMap.get(str7);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap.put(str7, obj4);
            }
            ((List) obj4).add(obj3);
        }
        return linkedHashMap;
    }





    public static Object L(Object... a) {
        return null;
    }

    public static Object j(Object... a) {
        return null;
    }
}
