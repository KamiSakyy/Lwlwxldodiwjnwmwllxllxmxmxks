package k21;

import a5.h1;
import aa.t0;
import aa.u0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.LocaleList;
import android.os.Looper;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.fragment.app.o0;
import c21.h0;
import com.github.rudroid.common.b0;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.TrendingPeriod;
import com.github.service.models.response.projects.ProjectFieldOption$Iteration;
import com.github.service.models.response.projects.ProjectFieldOption$SingleOption;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2IterationField;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2SingleSelectField;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2TextField;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2UnknownField;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import com.github.service.models.response.type.ReviewDecision;
import com.github.service.models.response.type.StatusState;
import com.github.service.models.response.type.SubscriptionState;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.w3;
import com.google.android.gms.internal.measurement.z3;
import d.y;
import gn0.hn;
import hc0.jl;
import in.r;
import java.io.File;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kc0.b80;
import kc0.c80;
import kc0.e80;
import kc0.f80;
import kc0.g80;
import kc0.h80;
import kc0.j80;
import kc0.k80;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import m0.l;
import m10.g7;
import m10.t7;
import m10.wm;
import pz0.e3;
import pz0.e7;
import pz0.f40;
import pz0.f50;
import pz0.n30;
import pz0.ot;
import s3.o;
import s3.p;
import sy.d0;
import t00.f8;
import vz.t;
import w3.u;
import w61.a0;
import wx0.g4;
import wx0.h4;
import wx0.i4;
import wx0.i5;
import wx0.j4;
import wx0.o4;
import wx0.q4;
import wx0.r4;
import x61.m;
import x61.n;
import x61.x;
import xt0.c2;
import xt0.d2;
import xt0.j2;
import xt0.k2;
import xt0.l2;
import xt0.n2;
import xt0.o2;
import xt0.p2;
import xt0.x7;
import xt0.y7;
import xt0.z7;
import y41.t1;
import yz0.d3;
import yz0.j3;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static ClassLoader a;
    public static Thread b;

    public static final y71.i A(ProjectsMetaInfo projectsMetaInfo, com.github.service.wrapper.b bVar) {
        k71.k.g(bVar, "cachedClient");
        return projectsMetaInfo != null ? r.l(com.github.service.wrapper.a.o(bVar, new t(projectsMetaInfo.s), null, false, null, null, 62)) : new f8(21, a0.a);
    }

    public static final float C(long j, float f, s3.c cVar) {
        float c;
        long b2 = o.b(j);
        if (p.a(b2, 4294967296L)) {
            if (cVar.Q() <= 1.05d) {
                return cVar.u0(j);
            }
            c = o.c(j) / o.c(cVar.z(f));
        } else {
            if (!p.a(b2, 8589934592L)) {
                return Float.NaN;
            }
            c = o.c(j);
        }
        return c * f;
    }

    public static final void D(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(d2.a0.y(j)), i, i2, 33);
        }
    }

    public static final void E(Spannable spannable, long j, s3.c cVar, int i, int i2) {
        long b2 = o.b(j);
        if (p.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(m71.a.W(cVar.u0(j)), false), i, i2, 33);
        } else if (p.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(o.c(j)), i, i2, 33);
        }
    }

    public static final void F(Spannable spannable, n3.b bVar, int i, int i2) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(n.F(bVar, 10));
            Iterator it = bVar.r.iterator();
            while (it.hasNext()) {
                arrayList.add(((n3.a) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static int G(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final f50 H(TrendingPeriod trendingPeriod) {
        int i = trendingPeriod == null ? -1 : jx0.r.a[trendingPeriod.ordinal()];
        if (i == -1) {
            return f50.v;
        }
        if (i == 1) {
            return f50.s;
        }
        if (i == 2) {
            return f50.t;
        }
        if (i == 3) {
            return f50.u;
        }
        if (i == 4) {
            return f50.v;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CheckStatusState I(n30 n30Var) {
        int ordinal = n30Var.ordinal();
        if (ordinal == 0) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 1) {
            return CheckStatusState.UNKNOWN__;
        }
        if (ordinal == 2) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 3) {
            return CheckStatusState.QUEUED;
        }
        if (ordinal == 4) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 5) {
            return CheckStatusState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    public static final j3 J(p2 p2Var) {
        boolean z;
        int i;
        String str;
        boolean z2;
        boolean z3;
        java.util.List r3;
        ReviewDecision reviewDecision;
        List list;
        x7 x7Var;
        SubscriptionState subscriptionState;
        SubscriptionState subscriptionState2;
        k71.k.g(p2Var, "<this>");
        c2 c2Var = p2Var.q;
        f40 f40Var = p2Var.o;
        n2 n2Var = p2Var.m;
        f40 f40Var2 = n2Var.c;
        String str2 = p2Var.b;
        String str3 = p2Var.d;
        String str4 = p2Var.e;
        Boolean bool = p2Var.j;
        boolean z4 = (bool == null || bool.booleanValue()) ? false : true;
        Integer num = p2Var.k;
        if (num != null) {
            i = num.intValue();
            z = false;
        } else {
            z = false;
            i = 0;
        }
        ZonedDateTime zonedDateTime = p2Var.g;
        boolean z5 = z;
        d3 d3Var = new d3(n2Var.e.b, n2Var.b);
        SubscriptionState Q = i21.a.Q(f40Var2);
        SubscriptionState Q2 = i21.a.Q(f40Var);
        List list2 = n2Var.d;
        SubscriptionState subscriptionState3 = SubscriptionState.IGNORED;
        if (Q2 != subscriptionState3 && Q != subscriptionState3 && (Q != null || Q2 != null)) {
            SubscriptionState subscriptionState4 = SubscriptionState.UNSUBSCRIBED;
            if ((Q != subscriptionState4 || Q2 != subscriptionState4) && (Q != (subscriptionState2 = SubscriptionState.CUSTOM) || Q2 != subscriptionState4)) {
                if (Q != subscriptionState2 || Q2 != subscriptionState2) {
                    z5 = true;
                } else if (list2 != null) {
                    z5 = list2.contains(e7.v);
                }
            }
            z5 = false;
        }
        SubscriptionState Q3 = i21.a.Q(f40Var2);
        SubscriptionState Q4 = i21.a.Q(f40Var);
        SubscriptionState subscriptionState5 = (Q4 == subscriptionState3 || Q3 == SubscriptionState.SUBSCRIBED || Q4 == (subscriptionState = SubscriptionState.UNSUBSCRIBED)) ? subscriptionState3 : subscriptionState;
        SubscriptionState Q5 = i21.a.Q(f40Var2);
        SubscriptionState Q6 = i21.a.Q(f40Var);
        SubscriptionState subscriptionState6 = SubscriptionState.SUBSCRIBED;
        SubscriptionState subscriptionState7 = (Q5 == subscriptionState6 && Q6 == null) ? null : subscriptionState6;
        List f = b91.g.f(p2Var.w);
        List list3 = p2Var.r.a;
        x61.r rVar = x61.r.r;
        if (list3 == null) {
            list3 = rVar;
        }
        ArrayList S = m.S(list3);
        ArrayList arrayList = new ArrayList(n.F(S, 10));
        int size = S.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = S.get(i2);
            i2++;
            ArrayList arrayList2 = S;
            o2 o2Var = ((k2) obj).b.b;
            arrayList.add(o2Var != null ? com.google.common.util.concurrent.a.W(o2Var.b) : null);
            S = arrayList2;
        }
        StatusState statusState = (StatusState) m.W(arrayList);
        String str5 = p2Var.n;
        boolean z6 = p2Var.c;
        int i3 = p2Var.f;
        PullRequestState Q7 = z3.Q(p2Var.l);
        List list4 = c2Var.b;
        if (list4 != null) {
            ArrayList S2 = m.S(list4);
            str = str5;
            z2 = z6;
            r3 = new ArrayList(n.F(S2, 10));
            int size2 = S2.size();
            z3 = z4;
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = S2.get(i4);
                i4++;
                r3.add(k41.b.e(((l2) obj2).c));
                S2 = S2;
            }
        } else {
            str = str5;
            z2 = z6;
            z3 = z4;
            r3 = rVar;
        }
        b0 b0Var = new b0(c2Var.a, (List) r3);
        ot otVar = p2Var.p;
        if (otVar != null) {
            int ordinal = otVar.ordinal();
            if (ordinal == 0) {
                reviewDecision = ReviewDecision.APPROVED;
            } else if (ordinal == 1) {
                reviewDecision = ReviewDecision.CHANGES_REQUESTED;
            } else if (ordinal == 2) {
                reviewDecision = ReviewDecision.REVIEW_REQUIRED;
            } else {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                reviewDecision = ReviewDecision.UNKNOWN;
            }
        } else {
            reviewDecision = null;
        }
        d2 d2Var = p2Var.s;
        int i5 = d2Var != null ? d2Var.a : 0;
        boolean z7 = p2Var.t;
        j2 j2Var = p2Var.u;
        Integer valueOf = j2Var != null ? Integer.valueOf(j2Var.b) : null;
        z7 z7Var = p2Var.x;
        ReviewDecision reviewDecision2 = reviewDecision;
        boolean z8 = z7Var.c;
        y7 y7Var = z7Var.d;
        return new j3(str2, str3, str4, z3, zonedDateTime, d3Var, z5, subscriptionState5, subscriptionState7, f, str, i3, b0Var, i, statusState, z2, Q7, reviewDecision2, i5, z7, valueOf, new m01.a((y7Var == null || (list = y7Var.a) == null || (x7Var = (x7) m.f0(list)) == null) ? 0 : x7Var.b.a, z8, z7Var.e.b != null));
    }

    public static final CheckStatusState K(e3 e3Var) {
        k71.k.g(e3Var, "<this>");
        switch (e3Var.ordinal()) {
            case 0:
                return CheckStatusState.COMPLETED;
            case 1:
                return CheckStatusState.IN_PROGRESS;
            case 2:
                return CheckStatusState.UNKNOWN__;
            case 3:
                return CheckStatusState.QUEUED;
            case 4:
                return CheckStatusState.REQUESTED;
            case 5:
                return CheckStatusState.WAITING;
            case 6:
                return CheckStatusState.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final MergeStateStatus L(wm wmVar) {
        switch (wmVar.ordinal()) {
            case 0:
                return MergeStateStatus.BEHIND;
            case 1:
                return MergeStateStatus.BLOCKED;
            case 2:
                return MergeStateStatus.CLEAN;
            case 3:
                return MergeStateStatus.DIRTY;
            case 4:
                return MergeStateStatus.DRAFT;
            case 5:
                return MergeStateStatus.HAS_HOOKS;
            case 6:
                return MergeStateStatus.UNKNOWN;
            case 7:
                return MergeStateStatus.UNSTABLE;
            case 8:
                return MergeStateStatus.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final PullRequestReviewCommentState M(jl jlVar) {
        int ordinal = jlVar.ordinal();
        if (ordinal == 0) {
            return PullRequestReviewCommentState.PENDING;
        }
        if (ordinal == 1) {
            return PullRequestReviewCommentState.SUBMITTED;
        }
        if (ordinal == 2) {
            return PullRequestReviewCommentState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final int N(l lVar) {
        java.util.List r0 = (java.util.List) (lVar.k);
        if (r0.isEmpty()) {
            return 0;
        }
        int size = r0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((m0.m) r0.get(i2)).p;
        }
        return (i / r0.size()) + lVar.q;
    }

    public static com.google.android.gms.internal.measurement.n O(Object obj) {
        if (obj == null) {
            return com.google.android.gms.internal.measurement.n.c;
        }
        if (obj instanceof String) {
            return new q((String) obj);
        }
        if (obj instanceof Double) {
            return new com.google.android.gms.internal.measurement.g((Double) obj);
        }
        if (obj instanceof Long) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new com.google.android.gms.internal.measurement.e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            com.google.android.gms.internal.measurement.d dVar = new com.google.android.gms.internal.measurement.d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dVar.q(dVar.o(), O(it.next()));
            }
            return dVar;
        }
        com.google.android.gms.internal.measurement.k kVar = new com.google.android.gms.internal.measurement.k();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            com.google.android.gms.internal.measurement.n O = O(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                kVar.f((String) obj2, O);
            }
        }
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009d, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader P() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        Thread cVar;
        synchronized (f.class) {
            if (a == null) {
                Thread thread2 = b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i = 0;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i2];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (thread == null) {
                                        try {
                                            cVar = new h91.c(threadGroup, "GmsDynamite");
                                        } catch (SecurityException e2) {
                                            e = e2;
                                        }
                                        try {
                                            cVar.setContextClassLoader(null);
                                            cVar.start();
                                            thread = cVar;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = cVar;
                                            new StringBuilder(String.valueOf(e.getMessage()).length() + 39);
                                            thread2 = thread;
                                            b = thread2;
                                        }
                                    }
                                } catch (SecurityException e4) {
                                    e = e4;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = b.getContextClassLoader();
                    } catch (SecurityException e5) {
                        new StringBuilder(String.valueOf(e5.getMessage()).length() + 41);
                    }
                }
                a = classLoader2;
            }
            classLoader = a;
        }
        return classLoader;
    }

    public static com.google.android.gms.internal.measurement.n Q(w3 w3Var) {
        if (w3Var == null) {
            return com.google.android.gms.internal.measurement.n.b;
        }
        int x = w3Var.x() - 1;
        if (x == 1) {
            return w3Var.r() ? new q(w3Var.s()) : com.google.android.gms.internal.measurement.n.i;
        }
        if (x == 2) {
            return w3Var.v() ? new com.google.android.gms.internal.measurement.g(Double.valueOf(w3Var.w())) : new com.google.android.gms.internal.measurement.g(null);
        }
        if (x == 3) {
            return w3Var.t() ? new com.google.android.gms.internal.measurement.e(Boolean.valueOf(w3Var.u())) : new com.google.android.gms.internal.measurement.e(null);
        }
        if (x != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List p = w3Var.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = p.iterator();
        while (it.hasNext()) {
            arrayList.add(Q((w3) it.next()));
        }
        return new com.google.android.gms.internal.measurement.o(w3Var.q(), arrayList);
    }

    public static boolean R(byte b2) {
        return b2 > -65;
    }

    public static final void a(z5.n nVar, int i, int i2, r1.d dVar, s sVar, int i3, int i4) {
        z5.n nVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        r1.d dVar2;
        z5.n nVar3;
        sVar.e0(-1208072102);
        int i10 = i4 & 1;
        if (i10 != 0) {
            i5 = i3 | 6;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            i5 = i3 | (sVar.f(nVar2) ? 4 : 2);
        }
        int i12 = i4 & 2;
        if (i12 != 0) {
            i7 = i5 | 48;
            i6 = i;
        } else {
            i6 = i;
            i7 = i5 | (sVar.d(i6) ? 32 : 16);
        }
        int i13 = i4 & 4;
        if (i13 != 0) {
            i9 = i7 | 384;
            i8 = i2;
        } else {
            i8 = i2;
            i9 = i7 | (sVar.d(i8) ? 256 : 128);
        }
        if ((i9 & 1171) == 1170 && sVar.C()) {
            sVar.V();
            dVar2 = dVar;
            nVar3 = nVar2;
        } else {
            z5.n nVar4 = i10 != 0 ? z5.l.a : nVar2;
            if (i12 != 0) {
                i6 = 0;
            }
            if (i13 != 0) {
                i8 = 0;
            }
            sVar.d0(1849434622);
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = i6.p.z;
                sVar.n0(N);
            }
            sVar.q(false);
            j71.a aVar = (j71.a) ((k71.i) N);
            sVar.d0(-683746039);
            sVar.d0(-548224868);
            if (!(sVar.a instanceof z5.b)) {
                androidx.compose.runtime.t.x();
                throw null;
            }
            sVar.a0();
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, new he.c(17), nVar4);
            androidx.compose.runtime.t.I(sVar, new he.c(18), new i6.b(i8));
            androidx.compose.runtime.t.I(sVar, new he.c(19), new i6.a(i6));
            dVar2 = dVar;
            dVar2.f(i6.q.a, sVar, 54);
            sVar.q(true);
            sVar.q(false);
            sVar.q(false);
            nVar3 = nVar4;
        }
        int i14 = i6;
        int i15 = i8;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new i6.e(nVar3, i14, i15, dVar2, i3, i4, 1);
        }
    }

    public static final t7 b(com.github.rudroid.common.k kVar, fp.a aVar) {
        ArrayList arrayList;
        List list = aVar.a;
        if (list != null) {
            arrayList = new ArrayList(n.F(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(k41.b.Q((on.c) it.next()));
            }
        } else {
            arrayList = null;
        }
        g7 g7Var = kVar.b() ? null : g7.s;
        if (arrayList == null && g7Var == null) {
            return null;
        }
        aa1.b bVar = t0.d;
        aa1.b u0Var = arrayList == null ? bVar : new u0(arrayList);
        if (g7Var != null) {
            bVar = new u0(g7Var);
        }
        return new t7(bVar, u0Var);
    }

    public static void c(y yVar, u uVar, j71.c cVar, int i) {
        if ((i & 1) != 0) {
            uVar = null;
        }
        k71.k.g(yVar, "<this>");
        o0 o0Var = new o0(cVar);
        if (uVar != null) {
            yVar.a(uVar, o0Var);
        } else {
            yVar.b(o0Var);
        }
    }

    public static final ArrayList d(ep0.i iVar) {
        List list = iVar != null ? iVar.b.c : null;
        if (list == null) {
            list = x61.r.r;
        }
        ArrayList S = m.S(list);
        ArrayList arrayList = new ArrayList(n.F(S, 10));
        int size = S.size();
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            ep0.h hVar = (ep0.h) obj;
            String str = hVar.d;
            Avatar L = m7.y.L(hVar.e);
            String str2 = hVar.b;
            String str3 = hVar.c;
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(new yz0.b2(str, L, str2, str3, false, false, 112));
        }
        return arrayList;
    }

    public static final MergeCheckStatus e(StatusState statusState) {
        k71.k.g(statusState, "<this>");
        switch (pl0.g.a[statusState.ordinal()]) {
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

    public static final MergeCheckStatus f(gn0.l2 l2Var) {
        switch (l2Var.ordinal()) {
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

    public static final fz.g g(fu.a aVar) {
        if (aVar != null) {
            return new fz.g(aVar.b, aVar.c, k41.b.Y(aVar.d), (int) aVar.e, aVar.f);
        }
        return null;
    }

    public static final LinkedHashMap h(wx0.h hVar) {
        ArrayList arrayList;
        int i;
        w61.k kVar;
        w61.k kVar2;
        Iterable iterable = hVar.a;
        if (iterable == null) {
            iterable = x61.r.r;
        }
        ArrayList S = m.S(iterable);
        int i2 = 10;
        int s = x.s(n.F(S, 10));
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        int size = S.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = S.get(i3);
            i3++;
            wx0.g gVar = (wx0.g) obj;
            wx0.o oVar = gVar.b;
            if (oVar != null) {
                String str = oVar.a;
                l01.y yVar = new l01.y(str);
                Integer num = oVar.b;
                kVar = new w61.k(yVar, new ProjectV2Field$ProjectV2TextField(str, num != null ? num.intValue() : 0, oVar.c, com.google.common.util.concurrent.a.U(oVar.d)));
                arrayList = S;
                i = size;
            } else {
                r4 r4Var = gVar.c;
                if (r4Var != null) {
                    String str2 = r4Var.a;
                    l01.y yVar2 = new l01.y(str2);
                    Integer num2 = r4Var.b;
                    int intValue = num2 != null ? num2.intValue() : 0;
                    String str3 = r4Var.c;
                    ProjectFieldType U = com.google.common.util.concurrent.a.U(r4Var.d);
                    ArrayList arrayList2 = r4Var.e;
                    ArrayList arrayList3 = new ArrayList(n.F(arrayList2, i2));
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        int i6 = i4 + 1;
                        if (i4 < 0) {
                            d0.x();
                            throw null;
                        }
                        i5 i5Var = ((q4) obj2).b;
                        arrayList3.add(new ProjectFieldOption$SingleOption(i4, i5Var.a, i5Var.b, i5Var.c));
                        i4 = i6;
                        S = S;
                        size = size;
                    }
                    arrayList = S;
                    i = size;
                    kVar2 = new w61.k(yVar2, new ProjectV2Field$ProjectV2SingleSelectField(str2, intValue, str3, U, arrayList3));
                } else {
                    arrayList = S;
                    i = size;
                    j4 j4Var = gVar.d;
                    if (j4Var != null) {
                        String str4 = j4Var.a;
                        h4 h4Var = j4Var.e;
                        l01.y yVar3 = new l01.y(str4);
                        Integer num3 = j4Var.b;
                        int intValue2 = num3 != null ? num3.intValue() : 0;
                        String str5 = j4Var.c;
                        ProjectFieldType U2 = com.google.common.util.concurrent.a.U(j4Var.d);
                        ArrayList arrayList4 = h4Var.b;
                        ArrayList arrayList5 = new ArrayList(n.F(arrayList4, 10));
                        int size3 = arrayList4.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Object obj3 = arrayList4.get(i7);
                            i7++;
                            o4 o4Var = ((g4) obj3).b;
                            arrayList5.add(new ProjectFieldOption$Iteration(o4Var.a, o4Var.b, o4Var.c, o4Var.d, o4Var.e));
                            arrayList4 = arrayList4;
                        }
                        ArrayList arrayList6 = h4Var.c;
                        ArrayList arrayList7 = new ArrayList(n.F(arrayList6, 10));
                        int size4 = arrayList6.size();
                        int i8 = 0;
                        while (i8 < size4) {
                            Object obj4 = arrayList6.get(i8);
                            i8++;
                            o4 o4Var2 = ((i4) obj4).b;
                            arrayList7.add(new ProjectFieldOption$Iteration(o4Var2.a, o4Var2.b, o4Var2.c, o4Var2.d, o4Var2.e));
                            arrayList6 = arrayList6;
                        }
                        kVar2 = new w61.k(yVar3, new ProjectV2Field$ProjectV2IterationField(str4, intValue2, str5, U2, arrayList5, arrayList7, h4Var.a));
                    } else {
                        kVar = new w61.k(new l01.y(""), new ProjectV2Field$ProjectV2UnknownField());
                    }
                }
                kVar = kVar2;
            }
            linkedHashMap.put(kVar.r, kVar.s);
            S = arrayList;
            size = i;
            i2 = 10;
        }
        return linkedHashMap;
    }

    public static final yz0.y7 i(e80 e80Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        yz0.s bVar;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        j80 j80Var;
        j80 j80Var2;
        b80 b80Var;
        j80 j80Var3;
        j80 j80Var4;
        f80 f80Var;
        j80 j80Var5;
        j80 j80Var6;
        j80 j80Var7;
        j80 j80Var8;
        j80 j80Var9;
        k71.k.g(e80Var, "<this>");
        k80 k80Var = e80Var.a;
        String str = "";
        String str2 = (k80Var == null || (j80Var9 = k80Var.b) == null) ? "" : j80Var9.b;
        hn hnVar = (k80Var == null || (j80Var8 = k80Var.b) == null) ? null : j80Var8.d;
        int i = hnVar == null ? -1 : pl0.p.a[hnVar.ordinal()];
        if (i == -1) {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        } else if (i == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
        } else if (i == 2) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
        } else if (i == 3) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        IssueOrPullRequestState issueOrPullRequestState2 = issueOrPullRequestState;
        ArrayList a2 = a.a.a((k80Var == null || (j80Var7 = k80Var.b) == null) ? null : j80Var7.i);
        List f = com.google.common.util.concurrent.a.f((k80Var == null || (j80Var6 = k80Var.b) == null) ? null : j80Var6.j);
        List list = (k80Var == null || (j80Var5 = k80Var.b) == null) ? null : j80Var5.f.a;
        if (list == null) {
            list = x61.r.r;
        }
        ArrayList S = m.S(list);
        ArrayList arrayList2 = new ArrayList(n.F(S, 10));
        int size = S.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = S.get(i2);
            i2++;
            g80 g80Var = (g80) obj;
            h80 h80Var = g80Var.b;
            c80 c80Var = g80Var.a;
            String str3 = str;
            arrayList2.add(new xz0.f(new SimpleLegacyProject(h80Var.b, h80Var.a, t1.R(h80Var.c), c80Var != null ? c80Var.a : null), c80Var != null ? c80Var.a : null));
            str = str3;
        }
        String str4 = str;
        wl0.g j = m71.a.j((k80Var == null || (j80Var4 = k80Var.b) == null || (f80Var = j80Var4.e) == null) ? null : f80Var.c);
        se0.c cVar = (k80Var == null || (j80Var3 = k80Var.b) == null) ? null : j80Var3.k;
        if (cVar == null) {
            yz0.s.Companion.getClass();
            bVar = yz0.r.b;
        } else {
            j80 j80Var10 = k80Var.b;
            bVar = new wl0.b(cVar, j80Var10.c, new yz0.b0(j80Var10.b));
        }
        com.github.service.models.response.a aVar = new com.github.service.models.response.a((k80Var == null || (b80Var = k80Var.a) == null) ? str4 : b80Var.b, (Avatar) null, (String) null, false, (String) null, 62);
        ArrayList arrayList3 = new ArrayList();
        if (k80Var == null || (j80Var2 = k80Var.b) == null) {
            z = true;
        } else {
            z = true;
            if (j80Var2.g) {
                z2 = true;
                if (k80Var == null && (j80Var = k80Var.b) != null && j80Var.h == z) {
                    z3 = z;
                    arrayList = a2;
                } else {
                    arrayList = a2;
                    z3 = false;
                }
                return new yz0.y7(str2, issueOrPullRequestState2, arrayList, f, arrayList2, j, bVar, aVar, arrayList3, z2, z3);
            }
        }
        z2 = false;
        if (k80Var == null) {
        }
        arrayList = a2;
        z3 = false;
        return new yz0.y7(str2, issueOrPullRequestState2, arrayList, f, arrayList2, j, bVar, aVar, arrayList3, z2, z3);
    }

    public static final void j(View view) {
        k71.k.g(view, "<this>");
        s71.i z = i21.a.z(new h1(view, (a71.c) null, 0));
        while (z.hasNext()) {
            ArrayList arrayList = s((View) z.next()).a;
            for (int m = d0.m(arrayList); -1 < m; m--) {
                ((w2.n2) arrayList.get(m)).a.d();
            }
        }
    }

    public static String l(Object obj, String str) {
        k71.k.g(obj, "value");
        return str + " value: " + obj;
    }

    public static final String m(int i) {
        return no.a.k("appWidget-", i);
    }

    public static final k91.a n(k91.a aVar, h0 h0Var) {
        Object obj;
        k71.k.g(aVar, "<this>");
        k71.k.g(h0Var, "type");
        Iterator it = aVar.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (k71.k.b(((k91.a) obj).a, h0Var)) {
                break;
            }
        }
        return (k91.a) obj;
    }

    public static long o(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    s3.b.l(i6);
                    throw new KotlinNothingValueException();
                }
                i5 = 8190;
            }
        }
        return s3.b.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
    }

    public static long p(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i, 262142);
        int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    s3.b.l(i6);
                    throw new KotlinNothingValueException();
                }
                i5 = 8190;
            }
        }
        return s3.b.a(min, min2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static a71.f q(a71.f fVar, a71.g gVar) {
        k71.k.g(gVar, "key");
        if (k71.k.b(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final ViewParent r(View view) {
        k71.k.g(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(2131363507);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final h5.a s(View view) {
        h5.a aVar = (h5.a) view.getTag(2131363178);
        if (aVar != null) {
            return aVar;
        }
        h5.a aVar2 = new h5.a();
        view.setTag(2131363178, aVar2);
        return aVar2;
    }

    public static final CharSequence t(k91.a aVar, CharSequence charSequence) {
        k71.k.g(aVar, "<this>");
        k71.k.g(charSequence, "allFileText");
        return charSequence.subSequence(aVar.b, aVar.c);
    }

    public static boolean u(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean v(b6.c cVar) {
        int i = cVar.a;
        return Integer.MIN_VALUE <= i && i < -1;
    }

    public static a71.h x(a71.f fVar, a71.g gVar) {
        k71.k.g(gVar, "key");
        return k71.k.b(fVar.getKey(), gVar) ? a71.i.r : fVar;
    }

    public static a71.h y(a71.f fVar, a71.h hVar) {
        k71.k.g(hVar, "context");
        return hVar == a71.i.r ? fVar : (a71.h) hVar.x0(new a00.a(3, (byte) 0), fVar);
    }

    public static final File z(Context context, String str) {
        k71.k.g(context, "<this>");
        k71.k.g(str, "name");
        return m7.y.u(context, str.concat(".preferences_pb"));
    }

    public abstract f B(j71.c cVar, String str);

    public abstract Object k();

    public boolean w() {
        if (equals(qa.a.c)) {
            return true;
        }
        if (!(this instanceof qa.c)) {
            if (equals(qa.a.d)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        qa.c cVar = (qa.c) this;
        qa.c.Companion.getClass();
        int i = cVar.c;
        if (i <= 3) {
            return i == 3 && cVar.d >= 10;
        }
        return true;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class l<T1,T2,T3,T4> {
        public l() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class u<T1,T2,T3,T4> {
        public u() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class y<T1,T2,T3,T4> {
        public y() {
        }
    }
}
