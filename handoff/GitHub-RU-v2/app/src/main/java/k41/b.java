package k41;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.RemoteViews;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.compose.runtime.c3;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.t;
import androidx.compose.runtime.u0;
import androidx.fragment.app.i0;
import androidx.fragment.app.l1;
import androidx.lifecycle.c0;
import androidx.lifecycle.w;
import b21.v;
import b6.h1;
import com.apollographql.apollo.exception.NullOrMissingField;
import com.github.rudroid.fragments.GitHubFragment;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.WorkflowRunEvent;
import com.github.service.models.response.projects.ProjectViewItemSortableValueType;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.MilestoneState;
import com.github.service.models.response.type.MinimizedStateReason;
import com.github.service.models.response.type.PullRequestReviewEvent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.g6;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.x4;
import com.google.android.gms.internal.measurement.z5;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.y1;
import com.google.android.gms.internal.play_billing.z3;
import h1.u;
import hc0.pl;
import hp.m;
import hp.o;
import iy0.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jo.f4;
import jx0.s;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import l01.q0;
import m10.cr;
import m10.gn;
import m10.o7;
import m10.u7;
import m10.v7;
import m10.w7;
import m7.y;
import n5.l0;
import n8.j;
import pz0.bs;
import pz0.la0;
import pz0.q7;
import pz0.t9;
import t71.p;
import v71.b0;
import v71.s1;
import wk0.z0;
import x61.l;
import x61.r;
import y71.w1;
import yz0.d3;
import yz0.e8;
import yz0.p3;
import yz0.x2;
import z5.n;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static boolean A(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final void B(ea.e eVar, String str) {
        k.g(eVar, "jsonReader");
        StringBuilder v = f4.v("Field '", str, "' is missing or null at path ");
        v.append(eVar.h());
        String sb = v.toString();
        k.g(sb, "message");
        throw new NullOrMissingField(sb, null);
    }

    public static j C(String str) {
        String group;
        if (str == null || p.T(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
        k.d(group4);
        return new j(parseInt, parseInt2, parseInt3, group4);
    }

    public static boolean D(Parcel parcel, int i) {
        f0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static final byte[] E(InputStream inputStream) {
        k.g(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        k.f(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static int F(Parcel parcel, int i) {
        f0(parcel, i, 4);
        return parcel.readInt();
    }

    public static long G(Parcel parcel, int i) {
        f0(parcel, i, 8);
        return parcel.readLong();
    }

    public static int H(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final String I(String str) {
        k.g(str, "<this>");
        if (!p.J(str, '-')) {
            return str;
        }
        String substring = str.substring(0, p.Q(str, '-', 0, 6));
        k.f(substring, "substring(...)");
        return substring;
    }

    public static int J(int i, int i2, Context context) {
        TypedValue c0 = b4.c0(context, i);
        return (c0 == null || c0.type != 16) ? i2 : c0.data;
    }

    public static TimeInterpolator K(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!A(valueOf, "cubic-bezier") && !A(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!A(valueOf, "cubic-bezier")) {
            if (A(valueOf, "path")) {
                return new PathInterpolator(b31.b.P(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
        if (split.length == 4) {
            return new PathInterpolator(w(0, split), w(1, split), w(2, split), w(3, split));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }

    public static final void L(GitHubFragment gitHubFragment, String str, j71.e eVar) {
        gitHubFragment.A3().i0(str, gitHubFragment, new i0(eVar));
    }

    public static final n M(float f) {
        return y(c0(f), f);
    }

    public static void N(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + H(parcel, i));
    }

    public static final on.b O(o oVar) {
        xn.f fVar;
        String str = oVar.a;
        String str2 = oVar.b;
        on.c Z = Z(oVar.c);
        ZonedDateTime zonedDateTime = oVar.e;
        m mVar = oVar.f;
        on.i iVar = null;
        String str3 = mVar != null ? mVar.c.b : null;
        String str4 = mVar != null ? mVar.b : null;
        hp.n nVar = (hp.n) x61.m.W(oVar.g);
        if (nVar != null) {
            hp.k kVar = nVar.b;
            if ((kVar != null ? kVar.c : null) != null) {
                iVar = U(kVar.c);
            }
        }
        int ordinal = oVar.d.ordinal();
        if (ordinal == 0) {
            fVar = xn.f.r;
        } else if (ordinal == 1) {
            fVar = xn.f.s;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = xn.f.u;
        }
        return new on.b(str, str2, Z, zonedDateTime, str3, str4, iVar, fVar);
    }

    public static final pl P(PullRequestReviewEvent pullRequestReviewEvent) {
        k.g(pullRequestReviewEvent, "<this>");
        int i = ab0.h.a[pullRequestReviewEvent.ordinal()];
        if (i == 1) {
            return pl.w;
        }
        if (i == 2) {
            return pl.t;
        }
        if (i == 3) {
            return pl.s;
        }
        if (i == 4) {
            return pl.v;
        }
        if (i == 5) {
            return pl.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final o7 Q(on.c cVar) {
        k.g(cVar, "<this>");
        switch (cVar.ordinal()) {
            case 0:
                return o7.t;
            case 1:
                return o7.u;
            case 2:
                return o7.v;
            case 3:
                return o7.w;
            case 4:
                return o7.x;
            case 5:
                return o7.y;
            case 6:
                return o7.z;
            case 7:
                return o7.A;
            case 8:
                return o7.B;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final u7 R(on.g gVar) {
        k.g(gVar, "<this>");
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            v7 v7Var = w7.Companion;
            return new u7(cr.u);
        }
        if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        v7 v7Var2 = w7.Companion;
        return new u7(cr.t);
    }

    public static final on.j S(hp.h hVar) {
        String str = hVar.c;
        String str2 = hVar.a;
        hp.g gVar = hVar.b;
        return new on.j(hVar.d, str2, gVar != null ? gVar.a : null, hVar.e, str, hVar.f);
    }

    public static final i01.b T(ih0.g gVar) {
        String str = gVar.a;
        com.github.service.models.response.a d = aa1.b.d(gVar.b.b);
        Integer num = gVar.c;
        boolean z = gVar.d;
        boolean z2 = gVar.e;
        int i = gVar.f;
        ih0.f fVar = gVar.g;
        return new i01.b(str, d, num, z, z2, i, fVar != null ? y9.a.G(fVar.c) : null);
    }

    public static final on.i U(hp.c cVar) {
        String str = cVar.a;
        String str2 = cVar.e;
        String str3 = cVar.f;
        int i = cVar.g;
        hp.b bVar = cVar.h;
        return new on.i(str, str2, str3, i, new d3(bVar.c.b, bVar.b), cVar.i, cVar.j, cVar.k, a.a.C(cVar.b), cVar.c, cVar.d);
    }

    public static final WorkflowRunEvent V(la0 la0Var) {
        switch (la0Var == null ? -1 : s.a[la0Var.ordinal()]) {
            case -1:
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

    public static final ProjectViewItemSortableValueType W(bs bsVar) {
        int ordinal = bsVar.ordinal();
        if (ordinal == 0) {
            return ProjectViewItemSortableValueType.FLOAT;
        }
        if (ordinal == 1) {
            return ProjectViewItemSortableValueType.INTEGER;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return ProjectViewItemSortableValueType.STRING;
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return ProjectViewItemSortableValueType.NULL;
    }

    public static final DiffLineType X(t9 t9Var) {
        k.g(t9Var, "<this>");
        int ordinal = t9Var.ordinal();
        if (ordinal == 0) {
            return DiffLineType.ADDITION;
        }
        if (ordinal == 1) {
            return DiffLineType.CONTEXT;
        }
        if (ordinal == 2) {
            return DiffLineType.DELETION;
        }
        if (ordinal == 3) {
            return DiffLineType.HUNK;
        }
        if (ordinal == 4) {
            return DiffLineType.INJECTED_CONTEXT;
        }
        if (ordinal == 5) {
            return DiffLineType.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final MilestoneState Y(gn gnVar) {
        int ordinal = gnVar.ordinal();
        if (ordinal == 0) {
            return MilestoneState.CLOSED;
        }
        if (ordinal == 1) {
            return MilestoneState.OPEN;
        }
        if (ordinal == 2) {
            return MilestoneState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final on.c Z(o7 o7Var) {
        switch (o7Var.ordinal()) {
            case 0:
                return on.c.r;
            case 1:
                return on.c.s;
            case 2:
                return on.c.t;
            case 3:
                return on.c.u;
            case 4:
                return on.c.v;
            case 5:
                return on.c.w;
            case 6:
                return on.c.x;
            case 7:
                return on.c.y;
            case 8:
                return on.c.z;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static s3.d a() {
        return new s3.d(1.0f, 1.0f);
    }

    public static final e8 a0(z0 z0Var) {
        return new e8(z0Var.e.a, z0Var.a, z0Var.b, z0Var.f);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x01a7
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(b6.b2 r23, android.widget.RemoteViews r24, z5.n r25, b6.c1 r26) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k41.b.b(b6.b2, android.widget.RemoteViews, z5.n, b6.c1):void");
    }

    public static int b0(Parcel parcel) {
        int readInt = parcel.readInt();
        int H = H(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = H + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static final void c(Context context, RemoteViews remoteViews, i6.m mVar, int i) {
        n6.g gVar = mVar.a;
        int i2 = Build.VERSION.SDK_INT;
        n6.g gVar2 = n6.c.a;
        n6.g gVar3 = n6.f.a;
        if (i2 >= 31) {
            if (i2 >= 33 || !l.r(new n6.g[]{gVar3, gVar2}).contains(gVar)) {
                b6.p.b(remoteViews, i, gVar);
                return;
            }
            return;
        }
        if (l.r(new n6.g[]{gVar3, n6.d.a, gVar2}).contains(h1.e(gVar, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a height of " + gVar + " requires a complex layout before API 31");
    }

    public static final n c0(float f) {
        return new i6.s(new n6.b(f));
    }

    public static final void d(Context context, RemoteViews remoteViews, i6.s sVar, int i) {
        n6.g gVar = sVar.a;
        int i2 = Build.VERSION.SDK_INT;
        n6.g gVar2 = n6.c.a;
        n6.g gVar3 = n6.f.a;
        if (i2 >= 31) {
            if (i2 >= 33 || !l.r(new n6.g[]{gVar3, gVar2}).contains(gVar)) {
                b6.p.c(remoteViews, i, gVar);
                return;
            }
            return;
        }
        if (l.r(new n6.g[]{gVar3, n6.d.a, gVar2}).contains(h1.e(gVar, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a width of " + gVar + " requires a complex layout before API 31");
    }

    public static int d0(byte[] bArr, int i, androidx.glance.appwidget.protobuf.d dVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return g0(b, bArr, i2, dVar);
        }
        dVar.a = b;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r7.b == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.github.service.models.response.a e(cp0.c cVar) {
        boolean z;
        String str = cVar != null ? cVar.b : "";
        Avatar L = y.L(cVar != null ? cVar.f : null);
        if (cVar != null && (r7 = cVar.d) != null) {
            z = true;
        }
        z = false;
        return new com.github.service.models.response.a(str, L, (String) null, z, (String) null, 52);
    }

    public static c4 e0(v vVar) {
        a4 a4Var = new a4();
        a4Var.c = new d4();
        c4 c4Var = new c4(a4Var);
        a4Var.b = c4Var;
        a4Var.a = vVar.getClass();
        try {
            a4Var.a = vVar.C(a4Var);
            return c4Var;
        } catch (Exception e) {
            y1 y1Var = new y1(e);
            b4 b4Var = z3.w;
            com.google.android.gms.internal.play_billing.b4 b4Var2 = c4Var.s;
            if (b4Var.A0(b4Var2, null, y1Var)) {
                z3.d(b4Var2);
            }
            return c4Var;
        }
    }

    public static final x2 f(ju.a aVar) {
        k.g(aVar, "<this>");
        boolean z = aVar.b;
        boolean z2 = aVar.d;
        r01.h hVar = MinimizedStateReason.Companion;
        String str = aVar.c;
        hVar.getClass();
        return new x2(z, z, z2, r01.h.a(str));
    }

    public static void f0(Parcel parcel, int i, int i2) {
        int H = H(parcel, i);
        if (H == i2) {
            return;
        }
        String hexString = Integer.toHexString(H);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(H).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(H);
        throw new SafeParcelReader$ParseException(no.a.q(sb, " (0x", hexString, ")"), parcel);
    }

    public static final List g(z zVar) {
        List<iy0.y> list;
        if (zVar == null || (list = zVar.a) == null) {
            return r.r;
        }
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        for (iy0.y yVar : list) {
            arrayList.add(new q0(yVar.b, W(yVar.a)));
        }
        return arrayList;
    }

    public static int g0(int i, byte[] bArr, int i2, androidx.glance.appwidget.protobuf.d dVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            dVar.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            dVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            dVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            dVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i12 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i10 + 1;
            if (bArr[i10] >= 0) {
                dVar.a = i12;
                return i13;
            }
            i10 = i13;
        }
    }

    public static final p3 h(ct0.a aVar) {
        com.github.rudroid.common.f fVar;
        k.g(aVar, "<this>");
        q7 q7Var = aVar.a;
        k.g(q7Var, "dayOfWeek");
        switch (q7Var.ordinal()) {
            case 0:
                fVar = com.github.rudroid.common.f.y;
                break;
            case 1:
                fVar = com.github.rudroid.common.f.u;
                break;
            case 2:
                fVar = com.github.rudroid.common.f.z;
                break;
            case 3:
                fVar = com.github.rudroid.common.f.t;
                break;
            case 4:
                fVar = com.github.rudroid.common.f.x;
                break;
            case 5:
                fVar = com.github.rudroid.common.f.v;
                break;
            case 6:
                fVar = com.github.rudroid.common.f.w;
                break;
            case 7:
                com.github.rudroid.common.f.Companion.getClass();
                fVar = com.github.rudroid.common.f.r;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new p3(fVar, aVar.b, aVar.c, aVar.d);
    }

    public static void h0(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new SafeParcelReader$ParseException(no.a.q(sb, " (0x", hexString, ")"), parcel);
    }

    public static final k21.f i(String str) {
        if (str == null || str.length() == 0) {
            return qa.a.c;
        }
        List f0 = p.f0(I(str), new char[]{'.'}, 6);
        ArrayList arrayList = new ArrayList(x61.n.F(f0, 10));
        Iterator it = f0.iterator();
        while (true) {
            int i = -1;
            if (!it.hasNext()) {
                break;
            }
            try {
                i = Integer.parseInt((String) it.next());
            } catch (NumberFormatException unused) {
            }
            arrayList.add(Integer.valueOf(i));
        }
        return (arrayList.size() < 2 || ((Number) arrayList.get(0)).intValue() <= -1 || ((Number) arrayList.get(1)).intValue() <= -1) ? qa.a.d : new qa.c(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue());
    }

    public static int i0(byte[] bArr, int i, androidx.glance.appwidget.protobuf.d dVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            dVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        dVar.b = j2;
        return i3;
    }

    public static final f1 j(y71.i iVar, Object obj, s0 s0Var, androidx.compose.runtime.s sVar, int i) {
        w wVar = w.u;
        a71.i iVar2 = a71.i.r;
        Object[] objArr = {iVar, s0Var, wVar, iVar2};
        boolean h = ((((i & 7168) ^ 3072) > 2048 && sVar.d(wVar.ordinal())) || (i & 3072) == 2048) | sVar.h(s0Var) | sVar.h(iVar2) | sVar.h(iVar);
        Object N = sVar.N();
        androidx.compose.runtime.i iVar3 = androidx.compose.runtime.n.a;
        if (h || N == iVar3) {
            N = new u(s0Var, iVar, (a71.c) null);
            sVar.n0(N);
        }
        j71.e eVar = (j71.e) N;
        Object N2 = sVar.N();
        if (N2 == iVar3) {
            N2 = t.B(obj);
            sVar.n0(N2);
        }
        f1 f1Var = (f1) N2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h2 = sVar.h(eVar);
        Object N3 = sVar.N();
        if (h2 || N3 == iVar3) {
            N3 = new c3(eVar, f1Var, (a71.c) null, 2);
            sVar.n0(N3);
        }
        j71.e eVar2 = (j71.e) N3;
        a71.h hVar = sVar.R;
        boolean z = false;
        for (Object obj2 : Arrays.copyOf(copyOf, copyOf.length)) {
            z |= sVar.f(obj2);
        }
        Object N4 = sVar.N();
        if (!z && N4 != iVar3) {
            return f1Var;
        }
        sVar.n0(new u0(hVar, eVar2));
        return f1Var;
    }

    public static int j0(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static final f1 k(y71.i iVar, Object obj, androidx.compose.runtime.s sVar, int i) {
        c0 c0Var = (c0) sVar.j(r6.f.a);
        w wVar = w.r;
        return j(iVar, obj, c0Var.m3(), sVar, i & 112);
    }

    public static long k0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static final f1 l(w1 w1Var, l1 l1Var, androidx.compose.runtime.s sVar, int i) {
        if ((i & 1) != 0) {
            l1Var = (c0) sVar.j(r6.f.a);
        }
        w wVar = w.r;
        return j(w1Var, w1Var.getValue(), l1Var.m3(), sVar, 0);
    }

    public static int l0(byte[] bArr, int i, androidx.glance.appwidget.protobuf.d dVar) {
        int d0 = d0(bArr, i, dVar);
        int i2 = dVar.a;
        if (i2 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            dVar.c = "";
            return d0;
        }
        int i3 = q6.a;
        int length = bArr.length;
        if ((((length - d0) - i2) | d0 | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(d0), Integer.valueOf(i2)));
        }
        int i4 = d0 + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (d0 < i4) {
            byte b = bArr[d0];
            if (b < 0) {
                break;
            }
            d0++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (d0 < i4) {
            int i6 = d0 + 1;
            byte b2 = bArr[d0];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                d0 = i6;
                while (d0 < i4) {
                    byte b3 = bArr[d0];
                    if (b3 >= 0) {
                        d0++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else {
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i6 >= i4 - 2) {
                            throw new zzmr("Protocol message had invalid UTF-8.");
                        }
                        byte b4 = bArr[i6];
                        int i7 = d0 + 3;
                        byte b5 = bArr[d0 + 2];
                        d0 += 4;
                        byte b6 = bArr[i7];
                        if (!w8.s.L(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !w8.s.L(b5) && !w8.s.L(b6)) {
                                int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                i5 += 2;
                            }
                        }
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    if (i6 >= i4 - 1) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    int i9 = i5 + 1;
                    int i10 = d0 + 2;
                    byte b7 = bArr[i6];
                    d0 += 3;
                    byte b8 = bArr[i10];
                    if (!w8.s.L(b7)) {
                        if (b2 == -32) {
                            if (b7 >= -96) {
                                b2 = -32;
                            }
                        }
                        if (b2 == -19) {
                            if (b7 < -96) {
                                b2 = -19;
                            }
                        }
                        if (!w8.s.L(b8)) {
                            cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                            i5 = i9;
                        }
                    }
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                if (i6 >= i4) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                int i12 = i5 + 1;
                d0 += 2;
                byte b9 = bArr[i6];
                if (b2 < -62 || w8.s.L(b9)) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i5 = i12;
            }
        }
        dVar.c = new String(cArr, 0, i5);
        return i4;
    }

    public static Bundle m(Parcel parcel, int i) {
        int H = H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + H);
        return readBundle;
    }

    public static int m0(byte[] bArr, int i, androidx.glance.appwidget.protobuf.d dVar) {
        int d0 = d0(bArr, i, dVar);
        int i2 = dVar.a;
        if (i2 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - d0) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            dVar.c = x4.t;
            return d0;
        }
        dVar.c = x4.e(bArr, d0, i2);
        return d0 + i2;
    }

    public static Parcelable n(Parcel parcel, int i, Parcelable.Creator creator) {
        int H = H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + H);
        return parcelable;
    }

    public static int n0(Object obj, g6 g6Var, byte[] bArr, int i, int i2, androidx.glance.appwidget.protobuf.d dVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = g0(i4, bArr, i3, dVar);
            i4 = dVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = dVar.d + 1;
        dVar.d = i6;
        if (i6 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        g6Var.f(obj, bArr, i5, i7, dVar);
        dVar.d--;
        dVar.c = obj;
        return i7;
    }

    public static String o(Parcel parcel, int i) {
        int H = H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + H);
        return readString;
    }

    public static int o0(Object obj, g6 g6Var, byte[] bArr, int i, int i2, int i3, androidx.glance.appwidget.protobuf.d dVar) {
        z5 z5Var = (z5) g6Var;
        int i4 = dVar.d + 1;
        dVar.d = i4;
        if (i4 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int t = z5Var.t(obj, bArr, i, i2, i3, dVar);
        dVar.d--;
        dVar.c = obj;
        return t;
    }

    public static Object[] p(Parcel parcel, int i, Parcelable.Creator creator) {
        int H = H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + H);
        return createTypedArray;
    }

    public static int p0(int i, byte[] bArr, int i2, int i3, m5 m5Var, androidx.glance.appwidget.protobuf.d dVar) {
        h5 h5Var = (h5) m5Var;
        int d0 = d0(bArr, i2, dVar);
        h5Var.e(dVar.a);
        while (d0 < i3) {
            int d02 = d0(bArr, d0, dVar);
            if (i != dVar.a) {
                break;
            }
            d0 = d0(bArr, d02, dVar);
            h5Var.e(dVar.a);
        }
        return d0;
    }

    public static ArrayList q(Parcel parcel, int i, Parcelable.Creator creator) {
        int H = H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + H);
        return createTypedArrayList;
    }

    public static int q0(byte[] bArr, int i, m5 m5Var, androidx.glance.appwidget.protobuf.d dVar) {
        h5 h5Var = (h5) m5Var;
        int d0 = d0(bArr, i, dVar);
        int i2 = dVar.a + d0;
        while (d0 < i2) {
            d0 = d0(bArr, d0, dVar);
            h5Var.e(dVar.a);
        }
        if (d0 == i2) {
            return d0;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static m5.a r(String str, l0 l0Var) {
        m20.a aVar = new m20.a(29);
        c81.e eVar = v71.l0.a;
        c81.d dVar = c81.d.t;
        s1 e = b0.e();
        dVar.getClass();
        return new m5.a(str, new kk.a(7, l0Var), aVar, b0.c(k21.f.y(dVar, e)));
    }

    public static int r0(g6 g6Var, int i, byte[] bArr, int i2, int i3, m5 m5Var, androidx.glance.appwidget.protobuf.d dVar) {
        g5 c = g6Var.c();
        g6 g6Var2 = g6Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        androidx.glance.appwidget.protobuf.d dVar2 = dVar;
        int n0 = n0(c, g6Var2, bArr2, i2, i4, dVar2);
        g6Var2.i(c);
        dVar2.c = c;
        m5Var.add(c);
        while (n0 < i4) {
            androidx.glance.appwidget.protobuf.d dVar3 = dVar2;
            int i5 = i4;
            int d0 = d0(bArr2, n0, dVar3);
            if (i != dVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            g6 g6Var3 = g6Var2;
            g5 c2 = g6Var3.c();
            n0 = n0(c2, g6Var3, bArr3, d0, i5, dVar3);
            g6Var2 = g6Var3;
            bArr2 = bArr3;
            i4 = i5;
            dVar2 = dVar3;
            g6Var2.i(c2);
            dVar2.c = c2;
            m5Var.add(c2);
        }
        return n0;
    }

    public static void s(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static int s0(int i, byte[] bArr, int i2, int i3, k6 k6Var, androidx.glance.appwidget.protobuf.d dVar) {
        if ((i >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int i0 = i0(bArr, i2, dVar);
            k6Var.d(i, Long.valueOf(dVar.b));
            return i0;
        }
        if (i4 == 1) {
            k6Var.d(i, Long.valueOf(k0(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int d0 = d0(bArr, i2, dVar);
            int i5 = dVar.a;
            if (i5 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - d0) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                k6Var.d(i, x4.t);
            } else {
                k6Var.d(i, x4.e(bArr, d0, i5));
            }
            return d0 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            k6Var.d(i, Integer.valueOf(j0(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        k6 a = k6.a();
        int i7 = dVar.d + 1;
        dVar.d = i7;
        if (i7 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int d02 = d0(bArr, i2, dVar);
            int i9 = dVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = d02;
                break;
            }
            i2 = s0(i9, bArr, d02, i3, a, dVar);
            i8 = i9;
        }
        dVar.d--;
        if (i2 > i3 || i8 != i6) {
            throw new zzmr("Failed to parse the message.");
        }
        k6Var.d(i, a);
        return i2;
    }

    public static final n t(n nVar) {
        return nVar.d(new i6.s(n6.d.a));
    }

    public static int t0(int i, byte[] bArr, int i2, int i3, androidx.glance.appwidget.protobuf.d dVar) {
        if ((i >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return i0(bArr, i2, dVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return d0(bArr, i2, dVar) + dVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = d0(bArr, i2, dVar);
            i6 = dVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = t0(i6, bArr, i2, i3, dVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new zzmr("Failed to parse the message.");
        }
        return i2;
    }

    public static final long u(float f, int i, long j, boolean z) {
        int i2 = ((z || i == 2 || i == 4 || i == 5) && s3.a.e(j)) ? s3.a.i(j) : Integer.MAX_VALUE;
        if (s3.a.k(j) != i2) {
            i2 = aa1.b.v(s0.s.q(f), s3.a.k(j), i2);
        }
        return k21.f.p(0, i2, 0, s3.a.h(j));
    }

    public static Object v(Class cls, Object obj) {
        if (obj instanceof o61.a) {
            return cls.cast(obj);
        }
        if (obj instanceof o61.b) {
            return v(cls, ((o61.b) obj).w());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + o61.a.class + " or " + o61.b.class);
    }

    public static float w(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final int x(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final n y(n nVar, float f) {
        return nVar.d(new i6.m(new n6.b(f)));
    }

    public static final boolean z(n6.g gVar) {
        if ((gVar instanceof n6.b) || (gVar instanceof n6.e)) {
            return true;
        }
        if (k.b(gVar, n6.c.a) || k.b(gVar, n6.d.a) || k.b(gVar, n6.f.a) || gVar == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }



    public static Object v;
}
