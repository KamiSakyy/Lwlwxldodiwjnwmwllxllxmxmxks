package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.TimelineItem$TimelineLockedEvent$Reason;
import com.github.service.models.response.TimelineItem$TimelinePullRequestReview$ReviewState;
import com.github.service.models.response.discussions.type.DiscussionStateReason;
import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.shortcuts.ShortcutScope$AllRepositories;
import com.github.service.models.response.shortcuts.ShortcutScope$SpecificRepository;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.DiffSide;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import com.github.service.models.response.type.StatusState;
import gn0.br;
import gn0.dn;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import m10.da0;
import m10.qt;
import pz0.df;
import pz0.ig;
import pz0.va;
import pz0.y80;
import pz0.zy;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b4 implements i3.d {
    public static UserManager r = null;
    public static volatile boolean s = false;
    public static long t;
    public static Method u;
    public static Method v;
    public static Method w;

    public static final yz0.p7 A(xv0.b bVar) {
        k71.k.g(bVar, "<this>");
        xv0.a aVar = bVar.c;
        return new yz0.p7(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60), bVar.d);
    }

    public static final yz0.r7 B(iw0.c cVar) {
        String str;
        String str2;
        cp0.c cVar2;
        cp0.c cVar3;
        k71.k.g(cVar, "<this>");
        String str3 = cVar.b;
        iw0.a aVar = cVar.c;
        if (aVar == null || (cVar3 = aVar.b) == null || (str = cVar3.b) == null) {
            str = "";
        }
        iw0.b bVar = cVar.d;
        if (bVar == null || (cVar2 = bVar.c) == null || (str2 = cVar2.b) == null) {
            str2 = "";
        }
        return new yz0.r7(str3, str, str2, cVar.e != y80.t, cVar.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    public static final LinkedHashMap C(ri0.v vVar, dn dnVar) {
        x61.rShadow rVar;
        ArrayList r112;
        DiffLineType diffLineType;
        List list;
        ri0.o7 o7Var;
        List list2;
        ri0.o7 o7Var2;
        ri0.v vVar2 = vVar;
        List list3 = vVar2.c.a;
        x61.rShadow rVar2 = x61.rShadow.r;
        if (list3 == null) {
            list3 = rVar2;
        }
        ArrayList S = x61.m.S(list3);
        ArrayList arrayList = new ArrayList();
        int size = S.size();
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            if (!((ri0.s) obj).e) {
                arrayList.add(obj);
            }
        }
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ri0.s sVar = (ri0.s) obj2;
            if (sVar.b == dnVar) {
                List list4 = sVar.j.a;
                if (list4 == null) {
                    list4 = rVar2;
                }
                ArrayList S2 = x61.m.S(list4);
                r112 = new ArrayList(x61.n.F(S2, i2));
                int size3 = S2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = S2.get(i4);
                    i4++;
                    ri0.s7 s7Var = ((ri0.r) obj3).c;
                    ri0.r7 r7Var = s7Var.e;
                    ri0.p7 p7Var = s7Var.d;
                    String str = null;
                    String str2 = p7Var != null ? p7Var.a : null;
                    se0.c cVar = s7Var.i;
                    String str3 = sVar.c;
                    x61.rShadow rVar3 = rVar2;
                    aj0.c cVar2 = s7Var.j;
                    qh0.a aVar = s7Var.m;
                    String str4 = s7Var.f;
                    PullRequestReviewCommentState t2 = t.e.t(s7Var.g);
                    if (r7Var != null && (list2 = r7Var.g) != null && (o7Var2 = (ri0.o7) x61.m.f0(list2)) != null) {
                        qf0.a aVar2 = o7Var2.b;
                        if (s7Var.c != null) {
                            str = a0(aVar2);
                        }
                    }
                    String str5 = str;
                    String str6 = s7Var.h;
                    boolean z = s7Var.k.b;
                    if (r7Var == null || (list = r7Var.g) == null || (o7Var = (ri0.o7) x61.m.f0(list)) == null || (diffLineType = sy.w.z(o7Var.b.a)) == null) {
                        diffLineType = DiffLineType.UNKNOWN__;
                    }
                    DiffLineType diffLineType2 = diffLineType;
                    yi0.a aVar3 = sVar.k;
                    String str7 = vVar2.a;
                    String str8 = vVar2.b;
                    boolean z2 = sVar.i;
                    boolean z3 = sVar.d;
                    ri0.t tVar = sVar.h;
                    r112.add(b(cVar, str3, str2, cVar2, aVar, str4, t2, str5, str6, z, diffLineType2, aVar3, str7, str8, z2, z3, tVar != null ? tVar.a : "", sVar.f, sVar.g, s7Var.l, l0(sVar.b)));
                    vVar2 = vVar;
                    rVar2 = rVar3;
                }
                rVar = rVar2;
            } else {
                rVar = rVar2;
                r112 = rVar;
            }
            arrayList2.add(r112);
            vVar2 = vVar;
            rVar2 = rVar;
            i2 = 10;
        }
        ArrayList G = x61.n.G(arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size4 = G.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = G.get(i5);
            i5++;
            String str9 = ((f01.g) obj4).c;
            Object obj5 = linkedHashMap.get(str9);
            if (obj5 == null) {
                obj5 = new ArrayList();
                linkedHashMap.put(str9, obj5);
            }
            ((List) obj5).add(obj4);
        }
        return linkedHashMap;
    }

    public static int D(l7.j1 j1Var, l7.h0 h0Var, View view, View view2, l7.w0 w0Var, boolean z) {
        if (w0Var.v() == 0 || j1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(l7.w0.K(view) - l7.w0.K(view2)) + 1;
        }
        return Math.min(h0Var.n(), h0Var.d(view2) - h0Var.g(view));
    }

    public static int E(l7.j1 j1Var, l7.h0 h0Var, View view, View view2, l7.w0 w0Var, boolean z, boolean z2) {
        if (w0Var.v() == 0 || j1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (j1Var.b() - Math.max(l7.w0.K(view), l7.w0.K(view2))) - 1) : Math.max(0, Math.min(l7.w0.K(view), l7.w0.K(view2)));
        if (z) {
            return Math.round((max * (Math.abs(h0Var.d(view2) - h0Var.g(view)) / (Math.abs(l7.w0.K(view) - l7.w0.K(view2)) + 1))) + (h0Var.m() - h0Var.g(view)));
        }
        return max;
    }

    public static int F(l7.j1 j1Var, l7.h0 h0Var, View view, View view2, l7.w0 w0Var, boolean z) {
        if (w0Var.v() == 0 || j1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return j1Var.b();
        }
        return (int) (((h0Var.d(view2) - h0Var.g(view)) / (Math.abs(l7.w0.K(view) - l7.w0.K(view2)) + 1)) * j1Var.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a71.c G(a71.c cVar, a71.c cVar2, j71.e eVar) {
        k71.k.g(eVar, "<this>");
        if (eVar instanceof c71.a) {
            return ((c71.a) eVar).r(cVar2, cVar);
        }
        a71.h q = cVar2.q();
        return q == a71.i.r ? new b71.b(cVar2, cVar, eVar) : new b71.c(cVar2, q, eVar, cVar);
    }

    public static final float H(int i, androidx.compose.runtime.s sVar) {
        return ((Resources) sVar.j(w2.j0.c)).getDimension(i) / ((s3.c) sVar.j(w2.g1.h)).b();
    }

    public static final ApiFailure I(String str, int i, String str2) {
        if (i == 401) {
            return new ApiFailure(ApiFailureType.UNAUTHORIZED, str, str2, Integer.valueOf(i), null, null, null, 112);
        }
        if (500 > i || i >= 600) {
            return new ApiFailure(ApiFailureType.HTTP_ERROR, str, str2, Integer.valueOf(i), null, null, null, 112);
        }
        return new ApiFailure(ApiFailureType.SERVER_ERROR, str, str2, Integer.valueOf(i), null, null, null, 112);
    }

    public static final double J(String str, Bundle bundle) {
        k71.k.g(str, "key");
        double d = bundle.getDouble(str, Double.MIN_VALUE);
        if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d;
        }
        i4.f0(str);
        throw null;
    }

    public static final float K(String str, Bundle bundle) {
        k71.k.g(str, "key");
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        i4.f0(str);
        throw null;
    }

    public static final int L(String str, Bundle bundle) {
        k71.k.g(str, "key");
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        i4.f0(str);
        throw null;
    }

    public static final long M(String str, Bundle bundle) {
        k71.k.g(str, "key");
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j;
        }
        i4.f0(str);
        throw null;
    }

    public static final Bundle N(String str, Bundle bundle) {
        k71.k.g(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        i4.f0(str);
        throw null;
    }

    public static final ArrayList O(String str, Bundle bundle) {
        k71.k.g(str, "key");
        ArrayList b = Build.VERSION.SDK_INT >= 34 ? b5.c.b(bundle, str, v8.l0.x(k71.xShadow.a(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (b != null) {
            return b;
        }
        i4.f0(str);
        throw null;
    }

    public static final String P(String str, Bundle bundle) {
        k71.k.g(str, "key");
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        i4.f0(str);
        throw null;
    }

    public static final String[] Q(String str, Bundle bundle) {
        k71.k.g(str, "key");
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        i4.f0(str);
        throw null;
    }

    public static void R(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final int S(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static a71.c T(a71.c cVar) {
        k71.k.g(cVar, "<this>");
        c71.c cVar2 = cVar instanceof c71.c ? (c71.c) cVar : null;
        if (cVar2 == null || (cVar = cVar2.t) != null) {
            return cVar;
        }
        v71.v vVar = (a71.e) cVar2.q().w0(a71.d.r);
        c71.c fVar = vVar != null ? new a81.f(vVar, cVar2) : cVar2;
        cVar2.t = fVar;
        return fVar;
    }

    public static boolean U() {
        if (Build.VERSION.SDK_INT >= 29) {
            return c8.a.c();
        }
        try {
            if (u == null) {
                t = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                u = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) u.invoke(null, Long.valueOf(t))).booleanValue();
        } catch (Exception e) {
            R(e);
            return false;
        }
    }

    public static boolean V(Context context) {
        k71.k.g(context, "context");
        ((j61.a) k41.b.v(j61.a.class, com.google.common.util.concurrent.a.t(context.getApplicationContext()))).getClass();
        int i = com.google.common.collect.f.t;
        com.google.common.collect.n nVar = com.google.common.collect.n.A;
        i4.S(nVar.y <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (nVar.isEmpty()) {
            return true;
        }
        return ((Boolean) ((com.google.common.collect.b) nVar.iterator()).next()).booleanValue();
    }

    public static final boolean W(String str, Bundle bundle) {
        k71.k.g(str, "key");
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static q81.n Z(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        k71.k.g(strArr2, "inputNamesAndValues");
        if (strArr2.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr3[i2] = t71.p.t0(strArr2[i2]).toString();
        }
        int x = k41.b.x(0, strArr3.length - 1, 2);
        if (x >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                i4.a0(str);
                i4.b0(str2, str);
                if (i == x) {
                    break;
                }
                i += 2;
            }
        }
        return new q81.n(strArr3);
    }

    public static final String a0(qf0.a aVar) {
        Integer valueOf;
        k71.k.g(aVar, "<this>");
        gn0.s8 s8Var = aVar.a;
        if (s8Var == gn0.s8.t) {
            valueOf = aVar.c;
        } else {
            Integer num = aVar.d;
            valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        }
        return valueOf + ":" + s8Var;
    }

    public static final f01.g b(se0.c cVar, String str, String str2, aj0.c cVar2, qh0.a aVar, String str3, PullRequestReviewCommentState pullRequestReviewCommentState, String str4, String str5, boolean z, DiffLineType diffLineType, yi0.a aVar2, String str6, String str7, boolean z2, boolean z3, String str8, boolean z4, boolean z5, yh0.a aVar3, CommentLevelType commentLevelType) {
        k71.k.g(pullRequestReviewCommentState, "state");
        k71.k.g(diffLineType, "lineType");
        k71.k.g(commentLevelType, "commentLevelType");
        String str9 = cVar.b;
        wl0.b bVar = new wl0.b(cVar, str5, pullRequestReviewCommentState == PullRequestReviewCommentState.PENDING ? new yz0.g0(str9) : new yz0.l0(str9));
        String str10 = aVar2 != null ? aVar2.c : null;
        DiffLineType diffLineType2 = k71.k.b(str10, "-") ? DiffLineType.DELETION : k71.k.b(str10, "+") ? DiffLineType.ADDITION : DiffLineType.CONTEXT;
        String str11 = aVar2 != null ? aVar2.d : null;
        return new f01.g(str, str2, str3, pullRequestReviewCommentState, str4, null, diffLineType, str6, str7, z2, z3, str8, z4, z5, z3, v8.l0.j(aVar), bVar, aa1.b.p(cVar2, bVar.getId()), cVar2.c, aVar2 != null ? aVar2.a : null, aVar2 != null ? aVar2.b : null, diffLineType2, k71.k.b(str11, "-") ? DiffLineType.DELETION : k71.k.b(str11, "+") ? DiffLineType.ADDITION : DiffLineType.CONTEXT, aVar3 != null ? aVar3.b : false, aVar3 != null ? aVar3.c : false, z, commentLevelType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    public static yz0.b1 c(qf0.a aVar, List list) {
        LinkedHashMap linkedHashMap;
        String str;
        x61.rShadow rVar;
        int intValue;
        String str2;
        java.util.List r0;
        gn0.s8 s8Var;
        String str3;
        java.util.List r15;
        int intValue2;
        String str4;
        java.util.List r2;
        w61.p pVar = wz0.d.a;
        wz0.e b = wz0.d.b(aVar.b, wz0.d.a(sy.w.z(aVar.a)), true);
        k71.k.g(aVar, "<this>");
        String str5 = "";
        if (list != null) {
            linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String str6 = ((f01.g) obj).e;
                if (str6 == null) {
                    str6 = "";
                }
                Object obj2 = linkedHashMap.get(str6);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(str6, obj2);
                }
                ((List) obj2).add(obj);
            }
        } else {
            linkedHashMap = null;
        }
        String str7 = b.a;
        int i = b.b;
        Integer num = aVar.c;
        Integer num2 = aVar.d;
        String a0 = a0(aVar);
        gn0.s8 s8Var2 = aVar.a;
        int i2 = pl0.e.b[sy.w.z(s8Var2).ordinal()];
        x61.rShadow rVar2 = x61.rShadow.r;
        int i3 = 0;
        switch (i2) {
            case 1:
                if (linkedHashMap != null && (r0 = (List) linkedHashMap.get(a0)) != 0) {
                    rVar2 = r0;
                }
                f01.g gVar = (f01.g) x61.m.W(rVar2);
                if (gVar != null && (str2 = gVar.a) != null) {
                    str5 = str2;
                }
                str = str5;
                rVar = rVar2;
                intValue = num != null ? num.intValue() : 0;
                s8Var = s8Var2;
                return new yz0.b1(str7, i, sy.w.z(s8Var), a0, intValue, i3, str, rVar, aVar.e, aVar.f);
            case 2:
                if (linkedHashMap != null && (r15 = (List) linkedHashMap.get(a0)) != 0) {
                    rVar2 = r15;
                }
                f01.g gVar2 = (f01.g) x61.m.W(rVar2);
                if (gVar2 != null && (str3 = gVar2.a) != null) {
                    str5 = str3;
                }
                str = str5;
                rVar = rVar2;
                intValue = 0;
                i3 = num2 != null ? num2.intValue() : 0;
                s8Var = s8Var2;
                return new yz0.b1(str7, i, sy.w.z(s8Var), a0, intValue, i3, str, rVar, aVar.e, aVar.f);
            case 3:
            case 4:
                if (linkedHashMap != null && (r2 = (List) linkedHashMap.get(a0)) != 0) {
                    rVar2 = r2;
                }
                f01.g gVar3 = (f01.g) x61.m.W(rVar2);
                if (gVar3 != null && (str4 = gVar3.a) != null) {
                    str5 = str4;
                }
                intValue2 = num2 != null ? num2.intValue() : 0;
                if (num != null) {
                    i3 = num.intValue();
                }
                str = str5;
                s8Var = s8Var2;
                rVar = rVar2;
                intValue = i3;
                i3 = intValue2;
                return new yz0.b1(str7, i, sy.w.z(s8Var), a0, intValue, i3, str, rVar, aVar.e, aVar.f);
            case 5:
            case 6:
                intValue2 = num2 != null ? num2.intValue() : 0;
                if (num != null) {
                    i3 = num.intValue();
                }
                str = str5;
                s8Var = s8Var2;
                rVar = rVar2;
                intValue = i3;
                i3 = intValue2;
                return new yz0.b1(str7, i, sy.w.z(s8Var), a0, intValue, i3, str, rVar, aVar.e, aVar.f);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TypedValue c0(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final MergeCheckStatus d(StatusState statusState) {
        k71.k.g(statusState, "<this>");
        switch (bx0.g.a[statusState.ordinal()]) {
            case 1:
            case 2:
                return MergeCheckStatus.FAILURE;
            case 3:
                return MergeCheckStatus.SUCCESS;
            case 4:
            case 5:
            case 6:
                return MergeCheckStatus.PENDING;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static boolean d0(int i, Context context, boolean z) {
        TypedValue c0 = c0(context, i);
        return (c0 == null || c0.type != 18) ? z : c0.data != 0;
    }

    public static final MergeCheckStatus e(pz0.y2 y2Var) {
        switch (y2Var.ordinal()) {
            case 0:
                return MergeCheckStatus.ACTION_REQUIRED;
            case 1:
                return MergeCheckStatus.CANCELLED;
            case 2:
            case 6:
            case 8:
                return MergeCheckStatus.FAILURE;
            case 3:
                return MergeCheckStatus.NEUTRAL;
            case 4:
                return MergeCheckStatus.SKIPPED;
            case 5:
                return MergeCheckStatus.STALE;
            case 7:
                return MergeCheckStatus.SUCCESS;
            case 9:
                return MergeCheckStatus.PENDING;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TypedValue e0(int i, Context context, String str) {
        TypedValue c0 = c0(context, i);
        if (c0 != null) {
            return c0;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final yz0.u5 f(gp0.c cVar) {
        cp0.c cVar2;
        cp0.c cVar3;
        k71.k.g(cVar, "<this>");
        gp0.a aVar = cVar.c;
        String str = "";
        cp0.g gVar = null;
        com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60);
        gp0.b bVar = cVar.d;
        if (bVar != null && (cVar3 = bVar.b) != null) {
            str = cVar3.b;
        }
        String str2 = str;
        if (bVar != null && (cVar2 = bVar.b) != null) {
            gVar = cVar2.f;
        }
        return new yz0.u5(aVar2, new com.github.service.models.response.a(str2, m7.y.L(gVar), (String) null, false, (String) null, 60), cVar.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0042, code lost:
    
        if (r7 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer f0(b21.l lVar, r71.f fVar, boolean z) {
        KSerializer kSerializer;
        KSerializer kSerializer2;
        KSerializer bVar;
        r71.b j = k81.c1Shadow.j(fVar);
        boolean a = fVar.a();
        List b = fVar.b();
        ArrayList arrayList = new ArrayList(x61.n.F(b, 10));
        Iterator it = b.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            k71.k.g(null, "<this>");
            throw null;
        }
        boolean isEmpty = arrayList.isEmpty();
        List list = x61.rShadow.r;
        if (isEmpty) {
            if (!k81.c1Shadow.i(j) || lVar.a(j, list) == null) {
                k81.m1 m1Var = g81.g.a;
                kSerializer = !a ? g81.g.a.h(j) : g81.g.b.h(j);
                if (kSerializer == null) {
                    return kSerializer;
                }
                if (arrayList.isEmpty()) {
                    kSerializer2 = b91.g.L(j);
                    if (kSerializer2 == null && (kSerializer2 = lVar.a(j, list)) == null) {
                        if (k81.c1Shadow.i(j)) {
                            bVar = new g81.b(j);
                            kSerializer2 = bVar;
                        }
                        kSerializer2 = null;
                    }
                    if (kSerializer2 != null) {
                        return a ? m71.a.z(kSerializer2) : kSerializer2;
                    }
                } else {
                    ArrayList M = b91.g.M(lVar, arrayList, z);
                    if (M != null) {
                        KSerializer E = b91.g.E(j, M, new f0.b2(6, arrayList));
                        if (E == null) {
                            kSerializer2 = lVar.a(j, M);
                            if (kSerializer2 == null) {
                                if (k81.c1Shadow.i(j)) {
                                    bVar = new g81.b(j);
                                    kSerializer2 = bVar;
                                }
                                kSerializer2 = null;
                            }
                        } else {
                            kSerializer2 = E;
                        }
                        if (kSerializer2 != null) {
                        }
                    }
                }
                return null;
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        } else {
            if (!lVar.r) {
                k81.m1 m1Var2 = g81.g.a;
                Object a2 = !a ? g81.g.c.a(j, arrayList) : g81.g.d.a(j, arrayList);
                if (a2 instanceof w61.m) {
                    a2 = null;
                }
                kSerializer = (KSerializer) a2;
                if (kSerializer == null) {
                }
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        }
    }

    public static final yz0.b6 g(wp0.m mVar) {
        k.w wVar;
        wp0.f fVar;
        IssueOrPullRequestState issueOrPullRequestState;
        IssueOrPullRequestState issueOrPullRequestState2;
        String str;
        wp0.e eVar;
        k71.k.g(mVar, "<this>");
        String str2 = mVar.b;
        wp0.a aVar = mVar.d;
        com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60);
        wp0.d dVar = mVar.f;
        if (dVar != null && (eVar = dVar.b) != null) {
            String str3 = eVar.a;
            wp0.j jVar = eVar.e;
            String str4 = eVar.b;
            String str5 = eVar.c;
            wp0.b bVar = eVar.d;
            wVar = new yz0.o5(new Avatar(bVar != null ? bVar.b : "", bVar != null ? bVar.a : ""), str3, str4, str5, !jVar.a.equals(str2) ? String.format("%s/%s", Arrays.copyOf(new Object[]{jVar.c.b, jVar.b}, 2)) : null);
        } else if (dVar == null || (fVar = dVar.c) == null) {
            wVar = null;
        } else {
            wp0.g gVar = mVar.e.b;
            String str6 = gVar != null ? gVar.a.a : null;
            String str7 = fVar.b;
            wp0.k kVar = fVar.d;
            String str8 = kVar.b;
            wp0.h hVar = kVar.d;
            String str9 = hVar.b;
            int i = fVar.a;
            int ordinal = fVar.c.ordinal();
            if (ordinal == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
            } else if (ordinal == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
            } else if (ordinal == 2) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
            } else {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
            boolean z = kVar.c;
            boolean z2 = fVar.e;
            if (kVar.a.equals(str6)) {
                issueOrPullRequestState2 = issueOrPullRequestState;
                str = null;
            } else {
                issueOrPullRequestState2 = issueOrPullRequestState;
                str = String.format("%s/%s", Arrays.copyOf(new Object[]{hVar.b, str8}, 2));
            }
            wVar = new yz0.p5(str2, str7, str9, str8, i, issueOrPullRequestState2, z, z2, fVar.f, str);
        }
        return new yz0.b6(aVar2, wVar, mVar.g, k0(mVar.c), null, 16);
    }

    public static void g0(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            a5.m.e(window, z);
        } else {
            if (i >= 30) {
                a5.m.d(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final yz0.c6 h(aq0.c cVar) {
        k71.k.g(cVar, "<this>");
        aq0.b bVar = cVar.d;
        com.github.service.models.response.a e = k41.b.e(bVar != null ? bVar.b : null);
        aq0.a aVar = cVar.c;
        return new yz0.c6(e, k41.b.e(aVar != null ? aVar.b : null), cVar.e);
    }

    public static final q81.a0 h0(q81.a0 a0Var) {
        k71.k.g(a0Var, "<this>");
        q81.z f = a0Var.f();
        q81.c0 c0Var = a0Var.x;
        f.g = new r81.c(c0Var.m(), c0Var.f());
        return f.a();
    }

    public static final yz0.h6 i(kq0.i iVar) {
        cp0.c cVar;
        IssueOrPullRequestState issueOrPullRequestState;
        boolean z;
        String str;
        String str2;
        IssueOrPullRequestState issueOrPullRequestState2;
        CloseReason closeReason;
        boolean z2;
        boolean z3;
        com.github.service.models.response.a aVar;
        df dfVar;
        cp0.c cVar2;
        k71.k.g(iVar, "<this>");
        kq0.h hVar = iVar.e;
        kq0.b bVar = hVar.b;
        kq0.c cVar3 = hVar.c;
        kq0.a aVar2 = iVar.c;
        String str3 = "";
        Boolean bool = null;
        com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(aVar2 != null ? aVar2.b.b : "", m7.y.L(aVar2 != null ? aVar2.b.f : null), (String) null, false, (String) null, 60);
        String str4 = iVar.b;
        boolean z4 = iVar.d;
        int i = bVar != null ? bVar.b : cVar3 != null ? cVar3.b : 0;
        String str5 = bVar != null ? bVar.c : cVar3 != null ? cVar3.c : "";
        String str6 = bVar != null ? bVar.e.b : cVar3 != null ? cVar3.e.b : "";
        String str7 = (cVar3 == null || (cVar2 = cVar3.e.d.b) == null) ? (bVar == null || (cVar = bVar.e.d.b) == null) ? "" : cVar.b : cVar2.b;
        if (cVar3 != null) {
            str3 = cVar3.e.c;
        } else if (bVar != null) {
            str3 = bVar.e.c;
        }
        if (bVar != null) {
            int ordinal = bVar.d.ordinal();
            if (ordinal == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
            } else if (ordinal == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        } else if (cVar3 != null) {
            int ordinal2 = cVar3.d.ordinal();
            if (ordinal2 == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
            } else if (ordinal2 == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
            } else if (ordinal2 == 2) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
            } else {
                if (ordinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        } else {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        CloseReason k0 = (bVar == null || (dfVar = bVar.f) == null) ? null : k0(dfVar);
        if (cVar3 == null) {
            if (bVar != null) {
                z = bVar.e.e;
            }
            boolean b = k71.k.b(bool, Boolean.TRUE);
            if (cVar3 == null && cVar3.f) {
                str = str3;
                str2 = str7;
                issueOrPullRequestState2 = issueOrPullRequestState;
                closeReason = k0;
                z2 = true;
            } else {
                str = str3;
                str2 = str7;
                issueOrPullRequestState2 = issueOrPullRequestState;
                closeReason = k0;
                z2 = false;
            }
            ZonedDateTime zonedDateTime = iVar.f;
            if (cVar3 == null && cVar3.g) {
                aVar = aVar3;
                z3 = true;
            } else {
                z3 = false;
                aVar = aVar3;
            }
            return new yz0.h6(aVar, str4, z4, i, str5, str6, str2, str, issueOrPullRequestState2, closeReason, b, z2, z3, zonedDateTime);
        }
        z = cVar3.e.e;
        bool = Boolean.valueOf(z);
        boolean b2 = k71.k.b(bool, Boolean.TRUE);
        if (cVar3 == null) {
        }
        str = str3;
        str2 = str7;
        issueOrPullRequestState2 = issueOrPullRequestState;
        closeReason = k0;
        z2 = false;
        ZonedDateTime zonedDateTime2 = iVar.f;
        if (cVar3 == null) {
        }
        z3 = false;
        aVar = aVar3;
        return new yz0.h6(aVar, str4, z4, i, str5, str6, str2, str, issueOrPullRequestState2, closeReason, b2, z2, z3, zonedDateTime2);
    }

    public static final hc0.i8 i0(DiffSide diffSide) {
        k71.k.g(diffSide, "<this>");
        int i = ab0.c.a[diffSide.ordinal()];
        if (i == 1) {
            return hc0.i8.s;
        }
        if (i == 2) {
            return hc0.i8.t;
        }
        if (i == 3) {
            return hc0.i8.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final yz0.i6 j(oq0.b bVar) {
        k71.k.g(bVar, "<this>");
        oq0.a aVar = bVar.c;
        return new yz0.i6(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60), bVar.d, bVar.e);
    }

    public static final zy j0(v01.d dVar) {
        k71.k.g(dVar, "<this>");
        switch (dVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return zy.s;
            case 2:
                return zy.t;
            case 3:
                return zy.u;
            case 4:
                return zy.v;
            case 5:
                return zy.w;
            case 6:
                return zy.x;
            case 7:
                return zy.y;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final yz0.o6 k(wr0.a aVar) {
        k71.k.g(aVar, "<this>");
        yp0.c cVar = aVar.d;
        String str = aVar.b;
        String str2 = cVar.b;
        kx0.b bVar = new kx0.b(cVar, str, new yz0.d0(str2));
        gu0.c cVar2 = aVar.e;
        ArrayList o = m7.y.o(cVar2, str2);
        boolean z = cVar2.c;
        yz0.x2 g = com.google.common.util.concurrent.a.g(aVar.h);
        ZonedDateTime zonedDateTime = cVar.i;
        gt0.a aVar2 = aVar.f;
        return new yz0.o6(bVar, o, z, g, zonedDateTime, aVar2.b, aVar2.c);
    }

    public static final CloseReason k0(df dfVar) {
        int i = dfVar == null ? -1 : bx0.n.b[dfVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return CloseReason.Completed;
            }
            if (i == 2) {
                return CloseReason.NotPlanned;
            }
            if (i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public static final CommentLevelType l0(dn dnVar) {
        int ordinal = dnVar.ordinal();
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

    public static final br m0(com.github.service.models.response.shortcuts.a aVar) {
        if (k71.k.b(aVar, ShortcutScope$AllRepositories.INSTANCE)) {
            return null;
        }
        if (!(aVar instanceof ShortcutScope$SpecificRepository)) {
            throw new NoWhenBranchMatchedException();
        }
        ShortcutScope$SpecificRepository shortcutScope$SpecificRepository = (ShortcutScope$SpecificRepository) aVar;
        return new br(shortcutScope$SpecificRepository.t, shortcutScope$SpecificRepository.s);
    }

    public static final yz0.q6 n(es0.c cVar) {
        int i;
        k71.k.g(cVar, "<this>");
        as0.a aVar = cVar.d.c;
        es0.a aVar2 = cVar.c;
        com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(aVar2 != null ? aVar2.b.b : "", m7.y.L(aVar2 != null ? aVar2.b.f : null), (String) null, false, (String) null, 60);
        String C = t71.w.C(aVar.c, " ", " ");
        try {
            String str = aVar.d;
            if (!t71.w.F(str, "#", false)) {
                str = "#".concat(str);
            }
            i = Color.parseColor(str);
        } catch (Exception unused) {
            i = -16777216;
        }
        return new yz0.q6(aVar3, C, i, cVar.e);
    }

    public static final DiscussionStateReason n0(va vaVar) {
        k71.k.g(vaVar, "<this>");
        int ordinal = vaVar.ordinal();
        if (ordinal == 0) {
            return DiscussionStateReason.DUPLICATE;
        }
        if (ordinal == 1) {
            return DiscussionStateReason.OUTDATED;
        }
        if (ordinal == 2) {
            return DiscussionStateReason.REOPENED;
        }
        if (ordinal == 3) {
            return DiscussionStateReason.RESOLVED;
        }
        if (ordinal == 4) {
            return DiscussionStateReason.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final yz0.t6 o(ms0.b bVar) {
        k71.k.g(bVar, "<this>");
        ig igVar = bVar.d;
        int i = igVar == null ? -1 : bx0.n.a[igVar.ordinal()];
        TimelineItem$TimelineLockedEvent$Reason timelineItem$TimelineLockedEvent$Reason = i != 1 ? i != 2 ? i != 3 ? i != 4 ? TimelineItem$TimelineLockedEvent$Reason.UNKNOWN : TimelineItem$TimelineLockedEvent$Reason.RESOLVED : TimelineItem$TimelineLockedEvent$Reason.TOO_HEATED : TimelineItem$TimelineLockedEvent$Reason.SPAM : TimelineItem$TimelineLockedEvent$Reason.OFF_TOPIC;
        ms0.a aVar = bVar.c;
        return new yz0.t6(timelineItem$TimelineLockedEvent$Reason, new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60), bVar.e);
    }

    public static final StatusState o0(da0 da0Var) {
        k71.k.g(da0Var, "<this>");
        int ordinal = da0Var.ordinal();
        if (ordinal == 0) {
            return StatusState.ERROR;
        }
        if (ordinal == 1) {
            return StatusState.EXPECTED;
        }
        if (ordinal == 2) {
            return StatusState.FAILURE;
        }
        if (ordinal == 3) {
            return StatusState.PENDING;
        }
        if (ordinal == 4) {
            return StatusState.SUCCESS;
        }
        if (ordinal == 5) {
            return StatusState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final yz0.u6 p(os0.e eVar) {
        String str;
        String str2;
        os0.d dVar;
        IssueOrPullRequestState issueOrPullRequestState;
        os0.c cVar;
        String str3;
        os0.c cVar2;
        os0.c cVar3;
        boolean z;
        IssueOrPullRequestState issueOrPullRequestState2;
        String str4;
        boolean z2;
        boolean z3;
        os0.d dVar2;
        os0.d dVar3;
        os0.d dVar4;
        String str5;
        os0.d dVar5;
        os0.c cVar4;
        df dfVar;
        os0.d dVar6;
        os0.c cVar5;
        xu0.c cVar6;
        xu0.b bVar;
        xu0.a aVar;
        cp0.c cVar7;
        xu0.c cVar8;
        xu0.b bVar2;
        cp0.c cVar9;
        k71.k.g(eVar, "<this>");
        os0.b bVar3 = eVar.f;
        String str6 = eVar.b;
        os0.a aVar2 = eVar.c;
        CloseReason closeReason = null;
        String str7 = (aVar2 == null || (cVar9 = aVar2.b) == null) ? null : cVar9.b;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        if (bVar3 == null || (cVar8 = bVar3.d) == null || (bVar2 = cVar8.b) == null || (str = bVar2.c) == null) {
            str = "";
        }
        if (bVar3 == null || (cVar6 = bVar3.d) == null || (bVar = cVar6.b) == null || (aVar = bVar.d) == null || (cVar7 = aVar.b) == null || (str2 = cVar7.b) == null) {
            str2 = "";
        }
        int i = (bVar3 == null || (cVar5 = bVar3.b) == null) ? (bVar3 == null || (dVar = bVar3.c) == null) ? 0 : dVar.c : cVar5.c;
        if (((bVar3 == null || (dVar6 = bVar3.c) == null) ? null : dVar6.e) != null) {
            int ordinal = bVar3.c.e.ordinal();
            if (ordinal == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
            } else if (ordinal == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
            } else if (ordinal == 2) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
            } else {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        } else {
            if (((bVar3 == null || (cVar = bVar3.b) == null) ? null : cVar.e) != null) {
                int ordinal2 = bVar3.b.e.ordinal();
                if (ordinal2 == 0) {
                    issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
                } else if (ordinal2 == 1) {
                    issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
                } else {
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                }
            } else {
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        }
        if (bVar3 != null && (cVar4 = bVar3.b) != null && (dfVar = cVar4.f) != null) {
            closeReason = k0(dfVar);
        }
        if (bVar3 == null || (dVar5 = bVar3.c) == null || (str3 = dVar5.d) == null) {
            str3 = (bVar3 == null || (cVar2 = bVar3.b) == null) ? "" : cVar2.d;
        }
        boolean z4 = eVar.e;
        if (bVar3 != null && (dVar4 = bVar3.c) != null && (str5 = dVar4.b) != null) {
            str8 = str5;
        } else if (bVar3 != null && (cVar3 = bVar3.b) != null) {
            str8 = cVar3.b;
        }
        if (bVar3 == null || (dVar3 = bVar3.c) == null || !dVar3.f) {
            z = false;
            issueOrPullRequestState2 = issueOrPullRequestState;
            str4 = str3;
            z2 = z4;
            z3 = false;
        } else {
            z = false;
            issueOrPullRequestState2 = issueOrPullRequestState;
            str4 = str3;
            z2 = z4;
            z3 = true;
        }
        ZonedDateTime zonedDateTime = eVar.d;
        if (bVar3 != null && (dVar2 = bVar3.c) != null && dVar2.g) {
            z = true;
        }
        return new yz0.u6(str6, str7, str, str2, i, issueOrPullRequestState2, closeReason, str4, z2, str8, z3, z, zonedDateTime, null);
    }

    public static final fz.f p0(jt.a aVar) {
        return new fz.f(aVar.c, aVar.b, aVar.d);
    }

    public static final yz0.w6 q(ys0.b bVar) {
        k71.k.g(bVar, "<this>");
        ys0.a aVar = bVar.c;
        return new yz0.w6(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60), bVar.d, bVar.e);
    }

    public static final qt q0(l01.c0 c0Var) {
        String str = c0Var.e;
        if (str != null) {
            return new qt((aa1.b) null, (aa1.b) null, (aa1.b) null, (aa1.b) null, new aa.u0(str), 15);
        }
        LocalDate localDate = c0Var.a;
        if (localDate != null) {
            return new qt(new aa.u0(localDate), (aa1.b) null, (aa1.b) null, (aa1.b) null, (aa1.b) null, 30);
        }
        String str2 = c0Var.b;
        if (str2 != null) {
            return new qt((aa1.b) null, new aa.u0(str2), (aa1.b) null, (aa1.b) null, (aa1.b) null, 29);
        }
        Double d = c0Var.c;
        if (d != null) {
            return new qt((aa1.b) null, (aa1.b) null, new aa.u0(d), (aa1.b) null, (aa1.b) null, 27);
        }
        String str3 = c0Var.d;
        return str3 != null ? new qt((aa1.b) null, (aa1.b) null, (aa1.b) null, new aa.u0(str3), (aa1.b) null, 23) : new qt((aa1.b) null, (aa1.b) null, (aa1.b) null, (aa1.b) null, (aa1.b) null, 31);
    }

    public static final yz0.z6 r(au0.d dVar) {
        String str;
        String str2;
        k71.k.g(dVar, "<this>");
        au0.b bVar = dVar.c;
        String str3 = bVar.b;
        String str4 = bVar.d;
        au0.a aVar = bVar.e;
        String str5 = "";
        if (aVar == null || (str = aVar.b) == null) {
            str = "";
        }
        if (aVar != null && (str2 = aVar.a) != null) {
            str5 = str2;
        }
        return new yz0.z6(str3, str4, new Avatar(str, str5), bVar.f);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final q01.r r0() {
        throw new UnsupportedOperationException("Method not decompiled");
    }
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final yz0.a7 s(cu0.c cVar) {
        TimelineItem$TimelinePullRequestReview$ReviewState timelineItem$TimelinePullRequestReview$ReviewState;
        k71.k.g(cVar, "<this>");
        String str = cVar.i.a;
        boolean z = cVar.d;
        int i = cVar.g.b;
        yp0.c cVar2 = cVar.j;
        String str2 = cVar.e;
        String str3 = cVar2.b;
        kx0.b bVar = new kx0.b(cVar2, str2, new yz0.k0(str3));
        gu0.c cVar3 = cVar.k;
        ArrayList o = m7.y.o(cVar3, str3);
        boolean z2 = cVar3.c;
        int ordinal = cVar.f.ordinal();
        if (ordinal == 0) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.APPROVED;
        } else if (ordinal == 1) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.CHANGES_REQUESTED;
        } else if (ordinal == 2) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.COMMENTED;
        } else if (ordinal == 3) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.DISMISSED;
        } else if (ordinal == 4) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.PENDING;
        } else {
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN;
        }
        TimelineItem$TimelinePullRequestReview$ReviewState timelineItem$TimelinePullRequestReview$ReviewState2 = timelineItem$TimelinePullRequestReview$ReviewState;
        ZonedDateTime zonedDateTime = cVar.c;
        if (zonedDateTime == null) {
            zonedDateTime = cVar.h;
        }
        gt0.a aVar = cVar.l;
        return new yz0.a7(str, z, i, bVar, o, z2, timelineItem$TimelinePullRequestReview$ReviewState2, zonedDateTime, aVar.b, aVar.c);
    }

    public static String s0(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final yz0.c7 t(ku0.f fVar) {
        k71.k.g(fVar, "<this>");
        ku0.a aVar = fVar.d;
        com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60);
        ku0.b bVar = fVar.f;
        String str = bVar != null ? bVar.d : "";
        String str2 = bVar != null ? bVar.b : "";
        boolean z = fVar.c;
        ku0.c cVar = fVar.e;
        cp0.c cVar2 = cVar.d.b;
        return new yz0.c7(aVar2, str, str2, z, cVar2 != null ? cVar2.b : "", cVar.c, cVar.b, cVar.e, fVar.g);
    }

    public static final Object t0(Context context, l6.g gVar, z5.k kVar, j71.e eVar, c71.c cVar) {
        if (kVar instanceof b6.c) {
            return l6.f.a.d(context, gVar, k21.f.m(((b6.c) kVar).a), eVar, cVar);
        }
        throw new IllegalArgumentException("The glance ID is not the one of an App Widget");
    }

    public static final yz0.f7 u(mu0.b bVar) {
        k71.k.g(bVar, "<this>");
        mu0.a aVar = bVar.c;
        return new yz0.f7(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60), bVar.d, bVar.e, bVar.f);
    }

    public static Object u0(j71.e eVar, Object obj, a71.c cVar) {
        k71.k.g(eVar, "<this>");
        a71.h q = cVar.q();
        Object dVar = q == a71.i.r ? new b71.d(cVar) : new b71.e(cVar, q);
        k71.z.c(2, eVar);
        return eVar.s(obj, dVar);
    }

    public static String v0(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(x0(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(x0(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final yz0.g7 x(ou0.b bVar) {
        k71.k.g(bVar, "<this>");
        ou0.a aVar = bVar.c;
        return new yz0.g7(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60), bVar.d);
    }

    public static String x0(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String q = no.a.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(q), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(q.length() + 8 + name2.length() + 1);
            f1.e.x(sb, "<", q, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static final yz0.n7 y(tv0.c cVar) {
        cp0.c cVar2;
        cp0.c cVar3;
        k71.k.g(cVar, "<this>");
        tv0.a aVar = cVar.c;
        String str = "";
        cp0.g gVar = null;
        com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", m7.y.L(aVar != null ? aVar.b.f : null), (String) null, false, (String) null, 60);
        tv0.b bVar = cVar.d;
        if (bVar != null && (cVar3 = bVar.b) != null) {
            str = cVar3.b;
        }
        String str2 = str;
        if (bVar != null && (cVar2 = bVar.b) != null) {
            gVar = cVar2.f;
        }
        return new yz0.n7(aVar2, new com.github.service.models.response.a(str2, m7.y.L(gVar), (String) null, false, (String) null, 60), cVar.e);
    }

    public static final yz0.o7 z(vv0.c cVar) {
        int i;
        k71.k.g(cVar, "<this>");
        as0.a aVar = cVar.d.c;
        vv0.a aVar2 = cVar.c;
        com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(aVar2 != null ? aVar2.b.b : "", m7.y.L(aVar2 != null ? aVar2.b.f : null), (String) null, false, (String) null, 60);
        String C = t71.w.C(aVar.c, " ", " ");
        try {
            String str = aVar.d;
            if (!t71.w.F(str, "#", false)) {
                str = "#".concat(str);
            }
            i = Color.parseColor(str);
        } catch (Exception unused) {
            i = -16777216;
        }
        return new yz0.o7(aVar3, C, i, cVar.e);
    }

    public abstract boolean A0(com.google.android.gms.internal.play_billing.z3 z3Var, Object obj, Object obj2);

    public abstract boolean B0(com.google.android.gms.internal.play_billing.z3 z3Var, com.google.android.gms.internal.play_billing.y3 y3Var, com.google.android.gms.internal.play_billing.y3 y3Var2);

    public abstract int X(int i);

    public void Y() {
        synchronized (this) {
        }
    }

    public abstract int b0(int i);

    public int l(int i) {
        int X = X(i);
        if (X == -1 || X(X) == -1) {
            return -1;
        }
        return X;
    }

    public int m(int i) {
        int b0 = b0(i);
        if (b0 == -1 || b0(b0) == -1) {
            return -1;
        }
        return b0;
    }

    public int v(int i) {
        return b0(i);
    }

    public int w(int i) {
        return X(i);
    }

    public abstract void w0(com.google.android.gms.internal.play_billing.y3 y3Var, com.google.android.gms.internal.play_billing.y3 y3Var2);

    public abstract void y0(com.google.android.gms.internal.play_billing.y3 y3Var, Thread thread);

    public abstract boolean z0(com.google.android.gms.internal.play_billing.z3 z3Var, com.google.android.gms.internal.play_billing.g2 g2Var, com.google.android.gms.internal.play_billing.g2 g2Var2);

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ShortcutScope$SpecificRepository {
        public ShortcutScope$SpecificRepository() {
        }
    }
}
