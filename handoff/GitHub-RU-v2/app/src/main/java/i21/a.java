package i21;

import aa.u0;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.lazy.layout.p0;
import androidx.compose.foundation.lazy.layout.t0;
import androidx.compose.foundation.lazy.layout.y1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.i;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.t;
import androidx.lifecycle.l1;
import ap0.e2;
import bu.l;
import bu.m;
import com.github.rudroid.widget.p;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.LegacyProjectWithNumber;
import com.github.service.models.response.organizations.Organization;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.SubscriptionState;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.play_billing.z3;
import d.z;
import d1.e0;
import d1.i1;
import e.d;
import f0.j;
import f1.e;
import fl.f;
import fl.g;
import h0.h1Shadow;
import h91.d0;
import h91.m0;
import hc0.zk;
import i6.o;
import j71.c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jx0.q;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import l01.c0;
import l01.w0;
import m0.h;
import m10.py;
import m10.wi;
import m7.y;
import mg0.g0;
import mg0.k0;
import pz0.f40;
import pz0.lo;
import pz0.n30;
import pz0.y2;
import q81.a0;
import q81.u;
import ri0.u1;
import tz.a5;
import tz.b5;
import tz.w4;
import tz.x4;
import tz.y4;
import tz.z4;
import uu0.h3;
import uu0.j3;
import uu0.k3;
import uu0.s4;
import v71.b0;
import v71.l0;
import w2.g1;
import w2.j0;
import w8.s;
import yz0.j8;
import yz0.l8;
import yz0.m8;
import yz0.x7;
import z5.n;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static Context a;
    public static Boolean b;
    public static Thread c;

    public static final f A(f fVar, c cVar) {
        k.g(fVar, "<this>");
        g gVar = fVar.a;
        Object obj = fVar.b;
        return new f(gVar, obj != null ? cVar.k(obj) : null, fVar.c);
    }

    public static MappedByteBuffer B(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final n C(n nVar, float f) {
        i6.n L = L(f);
        return nVar.d(new o(L, L, L, L));
    }

    public static n D(n nVar, float f, int i) {
        float f2 = ih.a.l;
        float f3 = (i & 1) != 0 ? 0 : f2;
        float f4 = 0;
        if ((i & 4) != 0) {
            f = 0;
        }
        if ((i & 8) != 0) {
            f2 = 0;
        }
        return nVar.d(new o(L(f3), L(f4), L(f), L(f2)));
    }

    public static void E(j4.a aVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + aVar.b;
        try {
            int b2 = y3.a.b(aVar.c);
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (b2) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((j((int) (fArr[3] * 255.0f)) << 24) | (j((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (j((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | j((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int j = (j((int) (fArr[3] * 255.0f)) << 24) | (j((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (j((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | j((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(j);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + aVar.b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException unused) {
            d5.O(view);
        } catch (NoSuchMethodException unused2) {
            d5.O(view);
        } catch (InvocationTargetException unused3) {
            d5.O(view);
        }
    }

    public static final zk F(PullRequestMergeMethod pullRequestMergeMethod) {
        k.g(pullRequestMergeMethod, "<this>");
        int i = ab0.g.a[pullRequestMergeMethod.ordinal()];
        if (i == 1) {
            return zk.w;
        }
        if (i == 2) {
            return zk.t;
        }
        if (i == 3) {
            return zk.v;
        }
        if (i == 4) {
            return zk.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final f40 G(SubscriptionState subscriptionState) {
        switch (subscriptionState == null ? -1 : q.a[subscriptionState.ordinal()]) {
            case -1:
                return f40.y;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return f40.y;
            case 2:
                return f40.x;
            case 3:
                return f40.v;
            case 4:
                return f40.w;
            case 5:
                return f40.u;
            case 6:
                return f40.t;
        }
    }

    public static final CheckConclusionState H(n30 n30Var) {
        int ordinal = n30Var.ordinal();
        if (ordinal == 0) {
            return CheckConclusionState.FAILURE;
        }
        if (ordinal == 1) {
            return null;
        }
        if (ordinal == 2) {
            return CheckConclusionState.FAILURE;
        }
        if (ordinal == 3) {
            return null;
        }
        if (ordinal == 4) {
            return CheckConclusionState.SUCCESS;
        }
        if (ordinal == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final i01.a I(m mVar) {
        PullRequestMergeMethod pullRequestMergeMethod;
        py pyVar;
        String str = mVar.a;
        l lVar = mVar.b;
        int i = lVar != null ? lVar.a : 0;
        bu.k kVar = mVar.c;
        if (kVar == null || (pyVar = kVar.a) == null || (pullRequestMergeMethod = s.G(pyVar)) == null) {
            pullRequestMergeMethod = PullRequestMergeMethod.UNKNOWN__;
        }
        return new i01.a(str, i, pullRequestMergeMethod, mVar.d);
    }

    public static final Organization J(kt0.q qVar) {
        k.g(qVar, "<this>");
        return new Organization(qVar.b, qVar.e, qVar.d, qVar.c, y.L(qVar.g), qVar.f);
    }

    public static final OrganizationNameAndAvatarUrl K(e2 e2Var) {
        k.g(e2Var, "<this>");
        return new OrganizationNameAndAvatarUrl(e2Var.b, e2Var.c, e2Var.d);
    }

    public static final i6.n L(float f) {
        return new i6.n(2, f);
    }

    public static final String M(LegacyProjectWithNumber legacyProjectWithNumber) {
        k.g(legacyProjectWithNumber, "<this>");
        int i = legacyProjectWithNumber.s;
        String str = legacyProjectWithNumber.t;
        String str2 = legacyProjectWithNumber.u;
        if (str2 == null || str2.length() == 0) {
            return str + "/" + i;
        }
        return str + "/" + str2 + "/" + i;
    }

    public static final CheckConclusionState N(y2 y2Var) {
        switch (y2Var == null ? -1 : jx0.b.a[y2Var.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return CheckConclusionState.ACTION_REQUIRED;
            case 2:
                return CheckConclusionState.CANCELLED;
            case 3:
                return CheckConclusionState.FAILURE;
            case 4:
                return CheckConclusionState.NEUTRAL;
            case 5:
                return CheckConclusionState.SKIPPED;
            case 6:
                return CheckConclusionState.STALE;
            case 7:
                return CheckConclusionState.STARTUP_FAILURE;
            case 8:
                return CheckConclusionState.SUCCESS;
            case 9:
                return CheckConclusionState.TIMED_OUT;
            case 10:
                return CheckConclusionState.UNKNOWN__;
        }
    }

    public static final IssueState O(wi wiVar) {
        int ordinal = wiVar.ordinal();
        if (ordinal == 0) {
            return IssueState.CLOSED;
        }
        if (ordinal == 1) {
            return IssueState.OPEN;
        }
        if (ordinal == 2) {
            return IssueState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PullRequestMergeMethod P(zk zkVar) {
        k.g(zkVar, "<this>");
        int ordinal = zkVar.ordinal();
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

    public static final SubscriptionState Q(f40 f40Var) {
        switch (f40Var == null ? -1 : q.b[f40Var.ordinal()]) {
            case -1:
                return SubscriptionState.UNKNOWN__;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return SubscriptionState.UNSUBSCRIBED;
            case 2:
                return SubscriptionState.RELEASES_ONLY;
            case 3:
                return SubscriptionState.SUBSCRIBED;
            case 4:
                return SubscriptionState.IGNORED;
            case 5:
                return SubscriptionState.CUSTOM;
            case 6:
                return SubscriptionState.UNKNOWN__;
        }
    }

    public static final lo R(c0 c0Var) {
        String str = c0Var.e;
        if (str != null) {
            return new lo(null, null, null, null, new u0(str), 15);
        }
        LocalDate localDate = c0Var.a;
        if (localDate != null) {
            return new lo(new u0(localDate), null, null, null, null, 30);
        }
        String str2 = c0Var.b;
        if (str2 != null) {
            return new lo(null, new u0(str2), null, null, null, 29);
        }
        Double d = c0Var.c;
        if (d != null) {
            return new lo(null, null, new u0(d), null, null, 27);
        }
        String str3 = c0Var.d;
        return str3 != null ? new lo(null, null, null, new u0(str3), null, 23) : new lo(null, null, null, null, null, 31);
    }

    public static final w0 S(b5 b5Var) {
        List list;
        w4 w4Var;
        a5 a5Var = b5Var.j;
        boolean z = a5Var.a <= 1;
        z4 z4Var = b5Var.i;
        y4 y4Var = z4Var.c;
        x4 x4Var = z4Var.d;
        String str = null;
        String str2 = y4Var != null ? y4Var.a : null;
        if (str2 == null || str2.length() == 0) {
            String str3 = x4Var != null ? x4Var.a : null;
            if (str3 == null || str3.length() == 0) {
                str = "";
            } else if (x4Var != null) {
                str = x4Var.a;
            }
        } else if (y4Var != null) {
            str = y4Var.a;
        }
        String str4 = str;
        return new w0(b5Var.a, b5Var.c, b5Var.b, b5Var.d, b5Var.e, b5Var.f, b5Var.g, b5Var.h, (!z || (list = a5Var.b) == null || (w4Var = (w4) x61.m.W(list)) == null) ? str4 : w4Var.a, str4);
    }

    public static final x7 T(k0 k0Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        int ordinal = k0Var.b.ordinal();
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
        return new x7(issueOrPullRequestState, k0Var.d);
    }

    public static void U(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static /* synthetic */ boolean V(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, z3 z3Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(z3Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(z3Var) != obj && atomicReferenceFieldUpdater.get(z3Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static void W(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void X(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean Y(com.google.android.gms.internal.measurement.n nVar) {
        if (nVar == null) {
            return false;
        }
        Double d = nVar.d();
        return !d.isNaN() && d.doubleValue() >= 0.0d && d.equals(Double.valueOf(Math.floor(d.doubleValue())));
    }

    public static w Z(String str) {
        w wVar = null;
        if (str != null && !str.isEmpty()) {
            wVar = (w) w.C0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException(e.g("Unsupported commandId ", str));
    }

    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, j71.a aVar, boolean z) {
        boolean z2;
        int i3;
        sVar.e0(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (sVar.g(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        if (sVar.S(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i4 != 0 ? true : z2;
            c7.c cVar = (c7.c) sVar.j(d7.a.a);
            if (cVar == null) {
                sVar.c0(950836184);
                View view = (View) sVar.j(j0.f);
                k.g(view, "<this>");
                while (true) {
                    if (view == null) {
                        cVar = null;
                        break;
                    }
                    Object tag = view.getTag(2131363509);
                    c7.c cVar2 = tag instanceof c7.c ? (c7.c) tag : null;
                    if (cVar2 != null) {
                        cVar = cVar2;
                        break;
                    } else {
                        Object r = k21.f.r(view);
                        view = r instanceof View ? (View) r : null;
                    }
                }
                sVar.q(false);
            } else {
                sVar.c0(950834231);
                sVar.q(false);
            }
            c7.c cVar3 = (z) sVar.j(e.e.a);
            if (cVar3 == null) {
                sVar.c0(1208426157);
                View view2 = (View) sVar.j(j0.f);
                k.g(view2, "<this>");
                while (true) {
                    if (view2 == null) {
                        cVar3 = null;
                        break;
                    }
                    Object tag2 = view2.getTag(2131363510);
                    c7.c cVar4 = tag2 instanceof z ? (z) tag2 : null;
                    if (cVar4 != null) {
                        cVar3 = cVar4;
                        break;
                    } else {
                        Object r2 = k21.f.r(view2);
                        view2 = r2 instanceof View ? (View) r2 : null;
                    }
                }
                sVar.q(false);
            } else {
                sVar.c0(1208423708);
                sVar.q(false);
            }
            if (cVar3 == null) {
                sVar.c0(1208428160);
                c7.c cVar5 = (Context) sVar.j(j0.b);
                while (true) {
                    if (!(cVar5 instanceof ContextWrapper)) {
                        cVar5 = null;
                        break;
                    } else if (cVar5 instanceof z) {
                        break;
                    } else {
                        cVar5 = ((ContextWrapper) cVar5).getBaseContext();
                    }
                }
                cVar3 = (z) cVar5;
                sVar.q(false);
            } else {
                sVar.c0(1208423789);
                sVar.q(false);
            }
            c7.c cVar6 = cVar == null ? cVar3 : cVar;
            if (cVar6 == null) {
                throw new IllegalArgumentException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            Object N = sVar.N();
            i iVar = androidx.compose.runtime.n.a;
            if (N == iVar) {
                N = new f.b(cVar != null ? cVar.e() : null, cVar3 != null ? cVar3.m() : null);
                sVar.n0(N);
            }
            f.b bVar = (f.b) N;
            long j = sVar.T;
            boolean f = sVar.f(bVar) | sVar.e(j);
            Object N2 = sVar.N();
            Object obj = N2;
            if (f || N2 == iVar) {
                d dVar = new d(new e.a(j, cVar6));
                dVar.c = new p(15);
                sVar.n0(dVar);
                obj = dVar;
            }
            d dVar2 = (d) obj;
            sVar.c0(-585289004);
            boolean h = sVar.h(dVar2) | ((i3 & 112) == 32);
            Object N3 = sVar.N();
            if (h || N3 == iVar) {
                N3 = new i1(4, dVar2, aVar);
                sVar.n0(N3);
            }
            t.i((j71.a) N3, sVar);
            Boolean valueOf = Boolean.valueOf(z3);
            int i5 = i3 & 14;
            boolean h2 = sVar.h(dVar2) | (i5 == 4);
            Object N4 = sVar.N();
            if (h2 || N4 == iVar) {
                N4 = new com.github.rudroid.deploymentreview.o(dVar2, z3);
                sVar.n0(N4);
            }
            y.d(valueOf, dVar2, (androidx.lifecycle.c0) null, (c) N4, sVar, i5);
            boolean h3 = sVar.h(bVar) | sVar.h(dVar2);
            Object N5 = sVar.N();
            if (h3 || N5 == iVar) {
                N5 = new e0(13, bVar, dVar2);
                sVar.n0(N5);
            }
            t.d(bVar, dVar2, (c) N5, sVar);
            sVar.q(false);
            z2 = z3;
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.workflowsummary.ui.p(aVar, z2, i, i2);
        }
    }

    public static boolean a0(com.google.android.gms.internal.measurement.n nVar, com.google.android.gms.internal.measurement.n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof r) || (nVar instanceof com.google.android.gms.internal.measurement.l)) {
            return true;
        }
        if (!(nVar instanceof com.google.android.gms.internal.measurement.g)) {
            return nVar instanceof com.google.android.gms.internal.measurement.q ? nVar.k().equals(nVar2.k()) : nVar instanceof com.google.android.gms.internal.measurement.e ? nVar.a().equals(nVar2.a()) : nVar == nVar2;
        }
        if (Double.isNaN(nVar.d().doubleValue()) || Double.isNaN(nVar2.d().doubleValue())) {
            return false;
        }
        return nVar.d().equals(nVar2.d());
    }

    public static final s3.e b(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        s3.n a2 = t3.b.a(f);
        if (a2 == null) {
            a2 = new s3.n(f);
        }
        return new s3.e(f2, f, a2);
    }

    public static int b0(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w1.r rVar, m0.s sVar, d2 d2Var, boolean z, h1Shadow h1Var, boolean z2, j jVar, w1.d dVar, androidx.compose.foundation.layout.k kVar, w1.i iVar, androidx.compose.foundation.layout.i iVar2, c cVar, androidx.compose.runtime.s sVar2, int i, int i2, int i3) {
        int i4;
        w1.d dVar2;
        androidx.compose.foundation.layout.k kVar2;
        int i5;
        int i6;
        m0.s sVar3;
        w1.i iVar3;
        androidx.compose.foundation.layout.i iVar4;
        b2 t;
        int i7;
        androidx.compose.foundation.layout.i iVar5;
        w1.i iVar6;
        int i8;
        androidx.compose.foundation.layout.k kVar3;
        w1.d dVar3;
        boolean z3;
        Object N;
        i iVar7;
        r71.c cVar2;
        boolean z4;
        Object N2;
        Object N3;
        boolean d;
        Object N4;
        i iVar8;
        int i9;
        r71.c cVar3;
        androidx.compose.foundation.layout.k kVar4;
        w1.r rVar2;
        sVar2.e0(924924659);
        if ((i & 6) == 0) {
            i4 = (sVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= sVar2.f(sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= sVar2.f(d2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= sVar2.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= sVar2.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= sVar2.f(h1Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= sVar2.g(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= sVar2.f(jVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= 805306368;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if ((i & 805306368) == 0) {
                i4 |= sVar2.f(dVar2) ? 536870912 : 268435456;
            }
        }
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i5 = i2 | 6;
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            if ((i2 & 6) == 0) {
                i5 = i2 | (sVar2.f(kVar2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i13 = i4;
        int i14 = i3 & 2048;
        if (i14 != 0) {
            i5 |= 48;
            i6 = i14;
        } else if ((i2 & 48) == 0) {
            i6 = i14;
            i5 |= sVar2.f(iVar) ? 32 : 16;
        } else {
            i6 = i14;
        }
        int i15 = i5;
        int i16 = i3 & 4096;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i2 & 384) == 0) {
            i15 |= sVar2.f(iVar2) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                i15 |= sVar2.h(cVar) ? 2048 : 1024;
            }
            if (sVar2.S(i13 & 1, (i13 & 306783379) == 306783378 || (i15 & 1171) != 1170)) {
                sVar3 = sVar;
                sVar2.V();
                iVar3 = iVar;
                iVar4 = iVar2;
            } else {
                sVar2.X();
                if ((i & 1) == 0 || sVar2.A()) {
                    i7 = i13 & (-234881025);
                    if (i10 != 0) {
                        dVar2 = null;
                    }
                    if (i12 != 0) {
                        kVar2 = null;
                    }
                    w1.i iVar9 = i6 != 0 ? null : iVar;
                    if (i16 != 0) {
                        iVar6 = iVar9;
                        i8 = i15;
                        kVar3 = kVar2;
                        dVar3 = dVar2;
                        iVar5 = null;
                        sVar2.r();
                        int i17 = i7 >> 3;
                        int i18 = i17 & 14;
                        int i19 = ((i8 >> 6) & 112) | i18;
                        int i20 = i7;
                        f1 G = t.G(cVar, sVar2);
                        int i22 = i8;
                        z3 = (((i19 & 14) ^ 6) <= 4 && sVar2.f(sVar)) || (i19 & 6) == 4;
                        N = sVar2.N();
                        iVar7 = androidx.compose.runtime.n.a;
                        if (!z3 || N == iVar7) {
                            m0.b bVar = new m0.b();
                            bVar.a = new m1(Integer.MAX_VALUE);
                            bVar.b = new m1(Integer.MAX_VALUE);
                            i iVar10 = i.v;
                            N = new a81.i(0, 5, i3.class, t.r(iVar10, new com.github.rudroid.actions.workflowruns.ui.e(t.r(iVar10, new de.f(G, 8)), sVar, bVar, 19)), "value", "getValue()Ljava/lang/Object;");
                            sVar2.n0(N);
                        }
                        cVar2 = (r71.c) N;
                        int i23 = i20 >> 9;
                        int i24 = i18 | (i23 & 112);
                        z4 = ((((i24 & 112) ^ 48) <= 32 && sVar2.g(z)) || (i24 & 48) == 32) | ((((i24 & 14) ^ 6) <= 4 && sVar2.f(sVar)) || (i24 & 6) == 4);
                        N2 = sVar2.N();
                        if (!z4 || N2 == iVar7) {
                            N2 = new m0.c(sVar, z);
                            sVar2.n0(N2);
                        }
                        androidx.compose.foundation.lazy.layout.h1Shadow h1Var2 = (androidx.compose.foundation.lazy.layout.h1) N2;
                        N3 = sVar2.N();
                        if (N3 == iVar7) {
                            N3 = t.p(sVar2);
                            sVar2.n0(N3);
                        }
                        v71.z zVar = (v71.z) N3;
                        d2.y yVar = (d2.y) sVar2.j(g1.g);
                        t0 t0Var = ((Boolean) sVar2.j(g1.v)).booleanValue() ? null : y1.a;
                        int i25 = i22 << 18;
                        int i26 = (i20 & 65520) | (i23 & 3670016) | (i25 & 29360128) | (i25 & 234881024) | ((i22 << 27) & 1879048192);
                        d = ((((i26 & 112) ^ 48) <= 32 && sVar2.f(sVar)) || (i26 & 48) == 32) | ((((i26 & 896) ^ 384) <= 256 && sVar2.f(d2Var)) || (i26 & 384) == 256) | ((((i26 & 7168) ^ 3072) <= 2048 && sVar2.g(false)) || (i26 & 3072) == 2048) | ((((57344 & i26) ^ 24576) <= 16384 && sVar2.g(z)) || (i26 & 24576) == 16384) | sVar2.d(0) | ((((i26 & 3670016) ^ 1572864) <= 1048576 && sVar2.f(dVar3)) || (i26 & 1572864) == 1048576) | ((((i26 & 29360128) ^ 12582912) <= 8388608 && sVar2.f(iVar6)) || (i26 & 12582912) == 8388608) | ((((i26 & 234881024) ^ 100663296) <= 67108864 && sVar2.f(iVar5)) || (i26 & 100663296) == 67108864) | ((((i26 & 1879048192) ^ 805306368) <= 536870912 && sVar2.f(kVar3)) || (i26 & 805306368) == 536870912) | sVar2.f(yVar) | sVar2.f(t0Var);
                        N4 = sVar2.N();
                        if (!d || N4 == iVar7) {
                            iVar8 = iVar7;
                            i9 = 4;
                            m0.j jVar2 = new m0.j(sVar, z, d2Var, cVar2, kVar3, iVar5, zVar, yVar, t0Var, dVar3, iVar6);
                            cVar3 = cVar2;
                            kVar4 = kVar3;
                            iVar4 = iVar5;
                            sVar2.n0(jVar2);
                            N4 = jVar2;
                        } else {
                            kVar4 = kVar3;
                            iVar4 = iVar5;
                            iVar8 = iVar7;
                            i9 = 4;
                            cVar3 = cVar2;
                        }
                        p0 p0Var = (p0) N4;
                        h0.b2 b2Var = !z ? h0.b2.r : h0.b2.s;
                        if (z2) {
                            sVar2.c0(-2076718545);
                            sVar2.q(false);
                            rVar2 = w1.o.a;
                        } else {
                            sVar2.c0(-2077147368);
                            boolean d2 = sVar2.d(0) | ((((i17 & 14) ^ 6) > i9 && sVar2.f(sVar)) || (i17 & 6) == i9);
                            Object N5 = sVar2.N();
                            if (d2 || N5 == iVar8) {
                                N5 = new m0.d(sVar);
                                sVar2.n0(N5);
                            }
                            rVar2 = androidx.compose.foundation.lazy.layout.p.m((m0.d) N5, sVar.o, b2Var);
                            sVar2.q(false);
                        }
                        sVar3 = sVar;
                        androidx.compose.foundation.lazy.layout.p.a(cVar3, f0.o.x(androidx.compose.foundation.lazy.layout.p.n(rVar.f(sVar.l).f(sVar.m), cVar3, h1Var2, b2Var, z2).f(rVar2).f(sVar.n.k), sVar, b2Var, jVar, z2, h1Var, sVar.g, (o0.i) null), sVar3.p, p0Var, sVar2, 0);
                        kVar2 = kVar4;
                        dVar2 = dVar3;
                        iVar3 = iVar6;
                    } else {
                        iVar5 = iVar2;
                        iVar6 = iVar9;
                    }
                } else {
                    sVar2.V();
                    i7 = i13 & (-234881025);
                    iVar6 = iVar;
                    iVar5 = iVar2;
                }
                i8 = i15;
                kVar3 = kVar2;
                dVar3 = dVar2;
                sVar2.r();
                int i172 = i7 >> 3;
                int i182 = i172 & 14;
                int i192 = ((i8 >> 6) & 112) | i182;
                int i202 = i7;
                f1 G2 = t.G(cVar, sVar2);
                int i222 = i8;
                if (((i192 & 14) ^ 6) <= 4) {
                }
                N = sVar2.N();
                iVar7 = androidx.compose.runtime.n.a;
                if (!z3) {
                }
                m0.b bVar2 = new m0.b();
                bVar2.a = new m1(Integer.MAX_VALUE);
                bVar2.b = new m1(Integer.MAX_VALUE);
                i iVar102 = i.v;
                N = new a81.i(0, 5, i3.class, t.r(iVar102, new com.github.rudroid.actions.workflowruns.ui.e(t.r(iVar102, new de.f(G2, 8)), sVar, bVar2, 19)), "value", "getValue()Ljava/lang/Object;");
                sVar2.n0(N);
                cVar2 = (r71.c) N;
                int i232 = i202 >> 9;
                int i242 = i182 | (i232 & 112);
                z4 = ((((i242 & 112) ^ 48) <= 32 && sVar2.g(z)) || (i242 & 48) == 32) | ((((i242 & 14) ^ 6) <= 4 && sVar2.f(sVar)) || (i242 & 6) == 4);
                N2 = sVar2.N();
                if (!z4) {
                }
                N2 = new m0.c(sVar, z);
                sVar2.n0(N2);
                androidx.compose.foundation.lazy.layout.h1Shadow h1Var22 = (androidx.compose.foundation.lazy.layout.h1) N2;
                N3 = sVar2.N();
                if (N3 == iVar7) {
                }
                v71.z zVar2 = (v71.z) N3;
                d2.y yVar2 = (d2.y) sVar2.j(g1.g);
                t0 t0Var2 = ((Boolean) sVar2.j(g1.v)).booleanValue() ? null : y1.a;
                int i252 = i222 << 18;
                int i262 = (i202 & 65520) | (i232 & 3670016) | (i252 & 29360128) | (i252 & 234881024) | ((i222 << 27) & 1879048192);
                d = ((((i262 & 112) ^ 48) <= 32 && sVar2.f(sVar)) || (i262 & 48) == 32) | ((((i262 & 896) ^ 384) <= 256 && sVar2.f(d2Var)) || (i262 & 384) == 256) | ((((i262 & 7168) ^ 3072) <= 2048 && sVar2.g(false)) || (i262 & 3072) == 2048) | ((((57344 & i262) ^ 24576) <= 16384 && sVar2.g(z)) || (i262 & 24576) == 16384) | sVar2.d(0) | ((((i262 & 3670016) ^ 1572864) <= 1048576 && sVar2.f(dVar3)) || (i262 & 1572864) == 1048576) | ((((i262 & 29360128) ^ 12582912) <= 8388608 && sVar2.f(iVar6)) || (i262 & 12582912) == 8388608) | ((((i262 & 234881024) ^ 100663296) <= 67108864 && sVar2.f(iVar5)) || (i262 & 100663296) == 67108864) | ((((i262 & 1879048192) ^ 805306368) <= 536870912 && sVar2.f(kVar3)) || (i262 & 805306368) == 536870912) | sVar2.f(yVar2) | sVar2.f(t0Var2);
                N4 = sVar2.N();
                if (d) {
                }
                iVar8 = iVar7;
                i9 = 4;
                m0.j jVar22 = new m0.j(sVar, z, d2Var, cVar2, kVar3, iVar5, zVar2, yVar2, t0Var2, dVar3, iVar6);
                cVar3 = cVar2;
                kVar4 = kVar3;
                iVar4 = iVar5;
                sVar2.n0(jVar22);
                N4 = jVar22;
                p0 p0Var2 = (p0) N4;
                h0.b2 b2Var2 = !z ? h0.b2.r : h0.b2.s;
                if (z2) {
                }
                sVar3 = sVar;
                androidx.compose.foundation.lazy.layout.p.a(cVar3, f0.o.x(androidx.compose.foundation.lazy.layout.p.n(rVar.f(sVar.l).f(sVar.m), cVar3, h1Var22, b2Var2, z2).f(rVar2).f(sVar.n.k), sVar, b2Var2, jVar, z2, h1Var, sVar.g, (o0.i) null), sVar3.p, p0Var2, sVar2, 0);
                kVar2 = kVar4;
                dVar2 = dVar3;
                iVar3 = iVar6;
            }
            t = sVar2.t();
            if (t == null) {
                t.d = new h(rVar, sVar3, d2Var, z, h1Var, z2, jVar, dVar2, kVar2, iVar3, iVar4, cVar, i, i2, i3);
                return;
            }
            return;
        }
        if ((i2 & 3072) == 0) {
        }
        if (sVar2.S(i13 & 1, (i13 & 306783379) == 306783378 || (i15 & 1171) != 1170)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }

    public static double c0(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static final float d(List list, Resources resources) {
        float f = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return f;
    }

    public static Object d0(com.google.android.gms.internal.measurement.n nVar) {
        if (com.google.android.gms.internal.measurement.n.c.equals(nVar)) {
            return null;
        }
        if (com.google.android.gms.internal.measurement.n.b.equals(nVar)) {
            return "";
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.k) {
            return e0((com.google.android.gms.internal.measurement.k) nVar);
        }
        if (!(nVar instanceof com.google.android.gms.internal.measurement.d)) {
            return !nVar.d().isNaN() ? nVar.d() : nVar.k();
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.gms.internal.measurement.d dVar = (com.google.android.gms.internal.measurement.d) nVar;
        int i = 0;
        while (i < dVar.o()) {
            if (i >= dVar.o()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i);
                throw new NoSuchElementException(sb.toString());
            }
            int i2 = i + 1;
            Object d0 = d0(dVar.p(i));
            if (d0 != null) {
                arrayList.add(d0);
            }
            i = i2;
        }
        return arrayList;
    }

    public static final a6.e e(j71.a aVar, androidx.compose.runtime.s sVar) {
        sVar.d0(-242680581);
        sVar.d0(-1287793883);
        String valueOf = String.valueOf(Long.hashCode(sVar.T));
        sVar.q(false);
        a6.e eVar = new a6.e(valueOf, aVar);
        sVar.q(false);
        return eVar;
    }

    public static HashMap e0(com.google.android.gms.internal.measurement.k kVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(kVar.r.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object d0 = d0(kVar.e(str));
            if (d0 != null) {
                hashMap.put(str, d0);
            }
        }
        return hashMap;
    }

    public static final List f(dl0.m mVar) {
        List<dl0.o> list;
        Parcelable b2;
        k.g(mVar, "<this>");
        dl0.n nVar = mVar.a;
        ArrayList arrayList = null;
        if (nVar != null && (list = nVar.a) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (dl0.o oVar : list) {
                g0 g0Var = oVar.b;
                if (g0Var != null) {
                    b2 = pl0.c.a(g0Var, true);
                } else {
                    u1 u1Var = oVar.c;
                    b2 = u1Var != null ? pl0.c.b(u1Var, true) : null;
                }
                if (b2 != null) {
                    arrayList2.add(b2);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? x61.rShadow.r : arrayList;
    }

    public static void f0(w51.r rVar) {
        int b0 = b0(rVar.d0("runtime.counter").d().doubleValue() + 1.0d);
        if (b0 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        rVar.b0("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(b0)));
    }

    public static final j8 g(tt0.c cVar) {
        String str;
        tt0.a aVar;
        String str2;
        tt0.a aVar2;
        k.g(cVar, "<this>");
        List list = cVar.c;
        String str3 = cVar.a;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (list == null || (aVar2 = (tt0.a) x61.m.W(list)) == null || (str = aVar2.b) == null) {
            str = "";
        }
        if (list != null && (aVar = (tt0.a) x61.m.W(list)) != null && (str2 = aVar.a) != null) {
            str4 = str2;
        }
        return new j8(str3, str, str4, cVar.b);
    }

    public static final l8 h(k3 k3Var) {
        String str;
        int i;
        String str2 = k3Var.c;
        j3 j3Var = k3Var.i;
        String str3 = j3Var != null ? j3Var.b : "";
        if (j3Var != null) {
            try {
                str = j3Var.a;
            } catch (Exception unused) {
                i = -16777216;
            }
        } else {
            str = null;
        }
        i = Color.parseColor(str);
        int i2 = i;
        String str4 = k3Var.d;
        h3 h3Var = k3Var.h;
        return new l8(str2, str3, i2, str4, h3Var.c, y.L(h3Var.d), k3Var.b, k3Var.r.c);
    }

    public static final m8 i(s4 s4Var) {
        String str = s4Var.a;
        if (str == null || t71.p.T(str)) {
            return null;
        }
        String str2 = s4Var.b;
        if (str2 == null) {
            str2 = "";
        }
        return new m8(str2, str);
    }

    public static int j(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static q81.n l(q81.n nVar, q81.n nVar2) {

        Object e = null;
        ia.d dVar = new ia.d(4);
        int size = nVar.size();
        for (int i = 0; i < size; i++) {
            String b2 = nVar.b(i);
            String e = nVar.e(i);
            if ((!"Warning".equalsIgnoreCase(b2) || !t71.w.F(e, "1", false)) && ("Content-Length".equalsIgnoreCase(b2) || "Content-Encoding".equalsIgnoreCase(b2) || "Content-Type".equalsIgnoreCase(b2) || !u(b2) || nVar2.a(b2) == null)) {
                dVar.d(b2, e);
            }
        }
        int size2 = nVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String b3 = nVar2.b(i2);
            if (!"Content-Length".equalsIgnoreCase(b3) && !"Content-Encoding".equalsIgnoreCase(b3) && !"Content-Type".equalsIgnoreCase(b3) && u(b3)) {
                dVar.d(b3, nVar2.e(i2));
            }
        }
        return dVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static boolean m(File file, Res
        Object r1 = null;
        Object th = null;
        Object e = null;ources resources, int i) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        int read;
        try {
            inputStream = resources.openRawResource(i);
            try {
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                boolean z = false;
                return r1 = 0;
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file, false);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    k(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    z = true;
                    r1 = read;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    e.getMessage();
                    k(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    r1 = fileOutputStream2;
                    k(inputStream);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = fileOutputStream;
                    k(r1);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
                k(inputStream);
                return z;
            } catch (Throwable th3) {
                th = th3;
                k(inputStream);
                throw th;
            }
        } catch (Throwable th4) {
  

        Object th = null;          th = th4;
            inputStream = null;
        }
    }

    public static final 

        Object e = null;long n() {
        return Thread.currentThread().getId();
    }

    public static final String p(u uVar, File file, String str) {
        k.g(uVar, "<this>");
        k.g(file, "file");
        k.g(str, "url");
        l1 l1Var = new l1(11);
        l1Var.I(str);
        l1Var.r();
        l1Var.G(in.j0.class, new in.j0(true, true));
        try {
            a0 e = uVar.b(new androidx.lifecycle.b(l1Var)).e();
            q81.c0 c0Var = e.x;
            if (!e.H) {
                return null;
            }
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            }
            d0 b2 = h91.b.b(new h91.z(new FileOutputStream(file, false), new m0()));
            b2.G(c0Var.r());
            b2.flush();
            b2.close();
            c0Var.close();
            return file.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String q(u uVar, File file, String str, String str2) {
        k.g(uVar, "<this>");
        k.g(str, "fileName");
        return p(uVar, new File(file, str), str2);
    }

    public static final Object s(u uVar, sy.c0 c0Var, c71.c cVar) {
        c81.e eVar = l0.a;
        return b0.L(c81.d.t, new androidx.lifecycle.n(uVar, c0Var, (a71.c) null, 15), cVar);
    }

    public static File t(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean u(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean v(f fVar) {
        k.g(fVar, "<this>");
        return fVar.a == g.t;
    }

    public static synchronized boolean w(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            Boolean valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            b = valueOf;
            a = applicationContext;
            return valueOf.booleanValue();
        }
    }

    public static final boolean x(f fVar) {
        k.g(fVar, "<this>");
        return fVar.a == g.r;
    }

    public static final boolean y(f fVar) {
        k.g(fVar, "<this>");
        return fVar.a == g.s;
    }

    public static s71.i z(j71.e eVar) {
        s71.i iVar = new s71.i();
        iVar.u = b4.G(iVar, iVar, eVar);
        return iVar;
    }

    public abstract String o(byte[] bArr, int i, int i2);

    public abstract int r(String str, byte[] bArr, int i, int i2);

}
