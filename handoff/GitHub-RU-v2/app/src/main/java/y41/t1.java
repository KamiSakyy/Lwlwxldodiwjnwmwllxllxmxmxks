package y41;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import com.github.service.models.response.LegacyProjectWithNumber;
import com.github.service.models.response.ProjectState;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.type.CommentAuthorAssociation;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import com.google.android.gms.internal.measurement.d5;
import gn0.dl;
import gn0.jr;
import gn0.u9;
import hc0.ks;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.f4;
import jo.w5;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m10.fz;
import m10.v90;
import m10.xc;
import pz0.cu;
import pz0.t9;
import pz0.xl;
import t00.f8;
import xt0.g7;
import xt0.h7;
import xt0.j7;
import xt0.k7;
import yz0.b8;
import yz0.g4;
import yz0.u7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t1 {
    public static boolean a = true;
    public static ei.f b;

    public static final int A(o0.q qVar) {
        return (int) (qVar.e == h0.b2.r ? qVar.b() & 4294967295L : qVar.b() >> 32);
    }

    public static final long B(double d) {
        return E((float) d, 4294967296L);
    }

    public static final long C(int i) {
        return E(i, 4294967296L);
    }

    public static final int D(v7.a aVar) {
        k71.k.g(aVar, "connection");
        v7.c F0 = aVar.F0("SELECT changes()");
        try {
            F0.B0();
            int i = (int) F0.getLong(0);
            m7.y.t(F0, (Throwable) null);
            return i;
        } finally {
        }
    }

    public static final long E(float f, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        s3.p[] pVarArr = s3.o.b;
        return floatToRawIntBits;
    }

    public static final String G(wq0.a aVar) {
        Integer valueOf;
        k71.k.g(aVar, "<this>");
        t9 t9Var = aVar.a;
        if (t9Var == t9.t) {
            valueOf = aVar.c;
        } else {
            Integer num = aVar.d;
            valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        }
        return valueOf + ":" + t9Var;
    }

    public static final boolean H(x.h0 h0Var, Object obj, Object obj2) {
        Object g = h0Var.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof xShadow.i0)) {
            if (!g.equals(obj2)) {
                return false;
            }
            h0Var.k(obj);
            return true;
        }
        x.i0 i0Var = (x.i0) g;
        boolean l = i0Var.l(obj2);
        if (l && i0Var.g()) {
            h0Var.k(obj);
        }
        return l;
    }

    public static final void I(x.h0 h0Var, Object obj) {
        boolean z;
        long[] jArr = h0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = h0Var.b[i4];
                        Object obj3 = h0Var.c[i4];
                        if (obj3 instanceof xShadow.i0) {
                            x.i0 i0Var = (x.i0) obj3;
                            i0Var.l(obj);
                            z = i0Var.g();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            h0Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final boolean J(z5.h hVar) {
        ArrayList arrayList;
        if (hVar instanceof b6.y) {
            return true;
        }
        if ((hVar instanceof z5.j) && ((arrayList = ((z5.j) hVar).c) == null || !arrayList.isEmpty())) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (J((z5.h) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList K(CharSequence charSequence) {
        k71.k.g(charSequence, "text");
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) == '|') {
                int i3 = i2 - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (charSequence.charAt(i3) != '\\') {
                    arrayList.add(charSequence.subSequence(i, i2).toString());
                    i = i2 + 1;
                }
            }
        }
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public static void L(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            b6.a2.o(viewGroup, z);
        } else if (a) {
            try {
                b6.a2.o(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    public static final ks M(ShortcutIcon shortcutIcon) {
        switch (shortcutIcon == null ? -1 : ab0.n.a[shortcutIcon.ordinal()]) {
            case -1:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                return ks.Y;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return ks.X;
            case 2:
                return ks.J;
            case 3:
                return ks.H;
            case 4:
                return ks.C;
            case 5:
                return ks.O;
            case 6:
                return ks.P;
            case 7:
                return ks.w;
            case 8:
                return ks.F;
            case 9:
                return ks.B;
            case 10:
                return ks.A;
            case 11:
                return ks.V;
            case 12:
                return ks.W;
            case 13:
                return ks.u;
            case 14:
                return ks.t;
            case 15:
                return ks.E;
            case 16:
                return ks.U;
            case 17:
                return ks.v;
            case 18:
                return ks.y;
            case 19:
                return ks.L;
            case 20:
                return ks.M;
            case 21:
                return ks.T;
            case 22:
                return ks.G;
            case 23:
                return ks.x;
            case 24:
                return ks.N;
            case 25:
                return ks.Q;
            case 26:
                return ks.S;
            case 27:
                return ks.I;
            case 28:
                return ks.D;
            case 29:
                return ks.z;
            case 30:
                return ks.K;
            case 31:
                return ks.R;
            case 32:
                return ks.P;
        }
    }

    public static final xl N(v01.a aVar) {
        k71.k.g(aVar, "<this>");
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return xl.t;
        }
        if (ordinal == 1) {
            return xl.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CommentLevelType O(cu cuVar) {
        int ordinal = cuVar.ordinal();
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

    public static final PullRequestReviewCommentState P(fz fzVar) {
        int ordinal = fzVar.ordinal();
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

    public static final tz0.d Q(v90 v90Var) {
        k71.k.g(v90Var, "<this>");
        switch (v90Var.ordinal()) {
            case 0:
                return tz0.d.r;
            case 1:
                return tz0.d.s;
            case 2:
                return tz0.d.t;
            case 3:
                return tz0.d.u;
            case 4:
                return tz0.d.v;
            case 5:
                return tz0.d.w;
            case 6:
                return tz0.d.x;
            case 7:
                return tz0.d.y;
            case 8:
                return tz0.d.z;
            case 9:
                return tz0.d.A;
            case 10:
                return tz0.d.B;
            case 11:
                return tz0.d.C;
            case 12:
                return tz0.d.D;
            case 13:
                return tz0.d.E;
            case 14:
                return tz0.d.F;
            case 15:
                return tz0.d.G;
            case 16:
                return tz0.d.H;
            case 17:
                return tz0.d.I;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProjectState R(dl dlVar) {
        k71.k.g(dlVar, "<this>");
        int ordinal = dlVar.ordinal();
        if (ordinal == 0) {
            return ProjectState.CLOSED;
        }
        if (ordinal == 1) {
            return ProjectState.OPEN;
        }
        if (ordinal == 2) {
            return ProjectState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final f8 S(String str, String str2) {
        return new f8(new com.github.rudroid.d0(a0.s0.k("Method ", str, " not supported in ", str2), (a71.c) null, 2));
    }

    public static final y51.c T(aa.d0 d0Var, aa.w wVar) {
        k71.k.g(d0Var, "<this>");
        k71.k.g(wVar, "customScalarAdapters");
        ea.k kVar = new ea.k();
        kVar.j();
        d0Var.o(kVar, wVar, true);
        kVar.e();
        Object m = kVar.m();
        k71.k.e(m, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new y51.c(6, (Map) m);
    }

    public static void U(int i, int i2) {
        String P;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                P = y9.a.P("%s (%s) must not be negative", new Object[]{"index", Integer.valueOf(i)});
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(no.a.k("negative size: ", i2));
                }
                P = y9.a.P("%s (%s) must be less than size (%s)", new Object[]{"index", Integer.valueOf(i), Integer.valueOf(i2)});
            }
            throw new IndexOutOfBoundsException(P);
        }
    }

    public static void V(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(X(i, "index", i2));
        }
    }

    public static void W(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? X(i, "start index", i3) : (i2 < 0 || i2 > i3) ? X(i2, "end index", i3) : y9.a.P("end index (%s) must not be less than start index (%s)", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    public static String X(int i, String str, int i2) {
        if (i < 0) {
            return y9.a.P("%s (%s) must not be negative", new Object[]{str, Integer.valueOf(i)});
        }
        if (i2 >= 0) {
            return y9.a.P("%s (%s) must not be greater than size (%s)", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)});
        }
        throw new IllegalArgumentException(no.a.k("negative size: ", i2));
    }

    public static final void a(int i, androidx.compose.runtime.s sVar) {
        sVar.e0(1257244356);
        if (i == 0 && sVar.C()) {
            sVar.V();
        } else {
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = b6.b1.z;
                sVar.n0(N);
            }
            j71.a aVar = (j71.a) ((k71.i) N);
            sVar.d0(-1115894518);
            sVar.d0(1886828752);
            if (!(sVar.a instanceof z5.b)) {
                androidx.compose.runtime.t.x();
                throw null;
            }
            sVar.a0();
            if (sVar.S) {
                sVar.k(new b6.a1(0, aVar));
            } else {
                sVar.q0();
            }
            sVar.q(true);
            sVar.q(false);
            sVar.q(false);
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new a00.a(i);
        }
    }

    public static final k81.i1 b(String str) {
        i81.e eVar = i81.e.m;
        if (t71.p.T(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a5.q0 it = k81.j1.a.values().iterator();
        while (it.hasNext()) {
            KSerializer kSerializer = (KSerializer) ((y61.c) it).next();
            if (str.equals(kSerializer.getDescriptor().a())) {
                StringBuilder v = f4.v("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                v.append(k71.x.a(kSerializer.getClass()).c());
                v.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(t71.q.r(v.toString()));
            }
        }
        return new k81.i1(str, eVar);
    }

    public static final c2.c c(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new c2.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void d(x.h0 h0Var, Object obj, Object obj2) {
        int f = h0Var.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : h0Var.c[f];
        if (obj3 != null) {
            if (obj3 instanceof xShadow.i0) {
                ((x.i0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                x.i0 i0Var = new x.i0();
                i0Var.a(obj3);
                i0Var.a(obj2);
                obj2 = i0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            h0Var.c[f] = obj2;
            return;
        }
        int i = ~f;
        h0Var.b[i] = obj;
        h0Var.c[i] = obj2;
    }

    public static final yz0.p e(w5 w5Var) {
        k71.k.g(w5Var, "<this>");
        double d = w5Var.e;
        ArrayList arrayList = w5Var.d;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                sy.d0.x();
                throw null;
            }
            wz0.e c = wz0.d.c((String) obj, 2);
            arrayList2.add(new yz0.m1(c.b, c.a, w5Var.a + i));
            i = i3;
        }
        return new yz0.p(d, w5Var.a, w5Var.b, w5Var.c, arrayList2);
    }

    public static final f01.g f(yp0.c cVar, String str, String str2, gu0.c cVar2, at0.a aVar, String str3, PullRequestReviewCommentState pullRequestReviewCommentState, String str4, String str5, boolean z, DiffLineType diffLineType, eu0.a aVar2, String str6, String str7, boolean z2, boolean z3, String str8, boolean z4, boolean z5, gt0.a aVar3, CommentLevelType commentLevelType) {
        k71.k.g(pullRequestReviewCommentState, "state");
        k71.k.g(diffLineType, "lineType");
        k71.k.g(commentLevelType, "commentLevelType");
        String str9 = cVar.b;
        kx0.b bVar = new kx0.b(cVar, str5, pullRequestReviewCommentState == PullRequestReviewCommentState.PENDING ? new yz0.g0(str9) : new yz0.l0(str9));
        String str10 = aVar2 != null ? aVar2.c : null;
        DiffLineType diffLineType2 = k71.k.b(str10, "-") ? DiffLineType.DELETION : k71.k.b(str10, "+") ? DiffLineType.ADDITION : DiffLineType.CONTEXT;
        String str11 = aVar2 != null ? aVar2.d : null;
        return new f01.g(str, str2, str3, pullRequestReviewCommentState, str4, null, diffLineType, str6, str7, z2, z3, str8, z4, z5, z3, com.google.common.util.concurrent.a.g(aVar), bVar, m7.y.o(cVar2, bVar.getId()), cVar2.c, aVar2 != null ? aVar2.a : null, aVar2 != null ? aVar2.b : null, diffLineType2, k71.k.b(str11, "-") ? DiffLineType.DELETION : k71.k.b(str11, "+") ? DiffLineType.ADDITION : DiffLineType.CONTEXT, aVar3 != null ? aVar3.b : false, aVar3 != null ? aVar3.c : false, z, commentLevelType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    public static yz0.b1 g(wq0.a aVar, List list) {
        LinkedHashMap linkedHashMap;
        String str;
        x61.r rVar;
        int intValue;
        String str2;
        java.util.List r0;
        t9 t9Var;
        String str3;
        java.util.List r15;
        int intValue2;
        String str4;
        java.util.List r2;
        w61.p pVar = wz0.d.a;
        wz0.e b2 = wz0.d.b(aVar.b, wz0.d.a(k41.b.X(aVar.a)), true);
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
        String str7 = b2.a;
        int i = b2.b;
        Integer num = aVar.c;
        Integer num2 = aVar.d;
        String G = G(aVar);
        t9 t9Var2 = aVar.a;
        int i2 = bx0.e.b[k41.b.X(t9Var2).ordinal()];
        x61.r rVar2 = x61.r.r;
        int i3 = 0;
        switch (i2) {
            case 1:
                if (linkedHashMap != null && (r0 = (List) linkedHashMap.get(G)) != 0) {
                    rVar2 = r0;
                }
                f01.g gVar = (f01.g) x61.m.W(rVar2);
                if (gVar != null && (str2 = gVar.a) != null) {
                    str5 = str2;
                }
                str = str5;
                rVar = rVar2;
                intValue = num != null ? num.intValue() : 0;
                t9Var = t9Var2;
                return new yz0.b1(str7, i, k41.b.X(t9Var), G, intValue, i3, str, rVar, aVar.e, aVar.f);
            case 2:
                if (linkedHashMap != null && (r15 = (List) linkedHashMap.get(G)) != 0) {
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
                t9Var = t9Var2;
                return new yz0.b1(str7, i, k41.b.X(t9Var), G, intValue, i3, str, rVar, aVar.e, aVar.f);
            case 3:
            case 4:
                if (linkedHashMap != null && (r2 = (List) linkedHashMap.get(G)) != 0) {
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
                t9Var = t9Var2;
                rVar = rVar2;
                intValue = i3;
                i3 = intValue2;
                return new yz0.b1(str7, i, k41.b.X(t9Var), G, intValue, i3, str, rVar, aVar.e, aVar.f);
            case 5:
            case 6:
                intValue2 = num2 != null ? num2.intValue() : 0;
                if (num != null) {
                    i3 = num.intValue();
                }
                str = str5;
                t9Var = t9Var2;
                rVar = rVar2;
                intValue = i3;
                i3 = intValue2;
                return new yz0.b1(str7, i, k41.b.X(t9Var), G, intValue, i3, str, rVar, aVar.e, aVar.f);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static u7 h(es.a aVar) {
        int i;
        int intValue;
        w61.p pVar = wz0.d.a;
        wz0.e b2 = wz0.d.b(aVar.b, wz0.d.a(b31.b.g0(aVar.a)), true);
        k71.k.g(aVar, "<this>");
        String str = b2.a;
        int i2 = b2.b;
        Integer num = aVar.c;
        Integer num2 = aVar.d;
        xc xcVar = aVar.a;
        int i3 = 0;
        switch (sy.j.a[b31.b.g0(xcVar).ordinal()]) {
            case 1:
                i = 0;
                i3 = num != null ? num.intValue() : 0;
                return new u7(str, i2, b31.b.g0(xcVar), i3, i, aVar.e, aVar.f);
            case 2:
                i = num2 != null ? num2.intValue() : 0;
                return new u7(str, i2, b31.b.g0(xcVar), i3, i, aVar.e, aVar.f);
            case 3:
            case 4:
                intValue = num2 != null ? num2.intValue() : 0;
                if (num != null) {
                    i3 = num.intValue();
                }
                i = intValue;
                return new u7(str, i2, b31.b.g0(xcVar), i3, i, aVar.e, aVar.f);
            case 5:
            case 6:
                intValue = num2 != null ? num2.intValue() : 0;
                if (num != null) {
                    i3 = num.intValue();
                }
                i = intValue;
                return new u7(str, i2, b31.b.g0(xcVar), i3, i, aVar.e, aVar.f);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b01.b i(uf0.p0 p0Var) {
        jr jrVar;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        ZonedDateTime zonedDateTime;
        String str;
        com.github.service.models.response.a aVar;
        b01.c cVar;
        b8 b8Var;
        List list;
        int i3;
        String str2;
        b01.k kVar;
        boolean z4;
        String str3;
        x61.r rVar;
        List list2;
        int i4;
        String str4;
        Iterator it;
        String str5;
        b01.l lVar;
        yf0.g gVar;
        k71.k.g(p0Var, "<this>");
        uf0.g0 g0Var = p0Var.o;
        uf0.o0Shadow o0Var = p0Var.m;
        jr jrVar2 = o0Var.d;
        String str6 = p0Var.b;
        String str7 = p0Var.c;
        uf0.h0 h0Var = p0Var.q;
        com.github.service.models.response.a d = aa1.b.d(h0Var != null ? h0Var.c : null);
        String str8 = o0Var.a;
        String str9 = o0Var.b;
        uf0.l0 l0Var = o0Var.c;
        String str10 = l0Var.a;
        String str11 = l0Var.b;
        boolean z5 = p0Var.h;
        int i5 = jrVar2 == null ? -1 : zl0.a.a[jrVar2.ordinal()];
        boolean z6 = i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4;
        boolean z7 = p0Var.i;
        if (jrVar2 == null) {
            jrVar = jrVar2;
            i = -1;
        } else {
            jrVar = jrVar2;
            i = zl0.a.a[jrVar2.ordinal()];
        }
        if (i == 1 || i == 2 || i == 3) {
            z = z6;
            z2 = z7;
            z3 = true;
        } else {
            z = z6;
            z2 = z7;
            z3 = false;
        }
        boolean z8 = (jrVar == null ? -1 : zl0.a.a[jrVar.ordinal()]) == 1;
        b01.e i6 = m7.y.i(p0Var.p.c);
        ZonedDateTime zonedDateTime2 = p0Var.d;
        ZonedDateTime zonedDateTime3 = p0Var.e;
        boolean z9 = g0Var != null;
        ZonedDateTime zonedDateTime4 = p0Var.f;
        int i7 = p0Var.g;
        if (g0Var != null) {
            i2 = i7;
            zonedDateTime = zonedDateTime2;
            String str12 = g0Var.b;
            str = str7;
            yf0.i iVar = g0Var.d;
            aVar = d;
            se0.c cVar2 = iVar.j;
            String str13 = iVar.c;
            aj0.c cVar3 = iVar.n;
            qh0.a aVar2 = iVar.l;
            boolean z10 = iVar.d;
            boolean z12 = iVar.e;
            boolean z13 = iVar.f;
            boolean z14 = iVar.g;
            yf0.h hVar = iVar.i;
            String str14 = (hVar == null || (gVar = hVar.c) == null) ? null : gVar.b;
            uf0.i1 i1Var = iVar.m;
            yh0.a aVar3 = iVar.k;
            b01.g i8 = v8.l0.i(cVar2, str13, cVar3, aVar2, z10, z12, z13, z14, str14, i1Var, aVar3.b, aVar3.c, v8.l0.T(iVar), 1544);
            uf0.n0 n0Var = g0Var.c;
            cVar = new b01.c(str12, i8, n0Var != null ? n0Var.a : null);
        } else {
            i2 = i7;
            zonedDateTime = zonedDateTime2;
            str = str7;
            aVar = d;
            cVar = null;
        }
        String str15 = p0Var.l;
        int i9 = p0Var.r.a;
        uf0.i1 i1Var2 = p0Var.u;
        b01.c cVar4 = cVar;
        b8 b8Var2 = new b8(i1Var2.d, str6, p0Var.j, i1Var2.c);
        List f = com.google.common.util.concurrent.a.f(p0Var.t);
        uf0.m0 m0Var = p0Var.s;
        if (m0Var != null) {
            ag0.i iVar2 = m0Var.c;
            String str16 = iVar2.a;
            b8Var = b8Var2;
            String str17 = iVar2.b;
            boolean z15 = iVar2.c;
            int i10 = iVar2.d;
            boolean z16 = iVar2.e;
            ag0.h hVar2 = iVar2.f;
            if (hVar2 == null || (list2 = hVar2.a) == null) {
                z4 = z16;
                list = f;
                i3 = i9;
                str2 = str6;
                str3 = str16;
                rVar = x61.r.r;
            } else {
                z4 = z16;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    List list3 = f;
                    ag0.g gVar2 = (ag0.g) it2.next();
                    if (gVar2 != null) {
                        cg0.a aVar4 = gVar2.c;
                        i4 = i9;
                        str4 = str6;
                        it = it2;
                        str5 = str16;
                        lVar = new b01.l(aVar4.d, aVar4.a, aVar4.b, aVar4.c);
                    } else {
                        i4 = i9;
                        str4 = str6;
                        it = it2;
                        str5 = str16;
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                    it2 = it;
                    str16 = str5;
                    f = list3;
                    i9 = i4;
                    str6 = str4;
                }
                list = f;
                i3 = i9;
                str2 = str6;
                str3 = str16;
                rVar = arrayList;
            }
            kVar = new b01.k(str3, str17, z15, i10, z4, rVar);
        } else {
            b8Var = b8Var2;
            list = f;
            i3 = i9;
            str2 = str6;
            kVar = null;
        }
        r01.a aVar5 = CommentAuthorAssociation.Companion;
        String str18 = p0Var.k.r;
        aVar5.getClass();
        return new b01.b(str2, str, aVar, str8, str9, str10, str11, z5, z, z2, z3, z8, i6, zonedDateTime, zonedDateTime3, z9, zonedDateTime4, i2, cVar4, str15, i3, b8Var, list, kVar, r01.a.a(str18), o0Var.e, j(p0Var.v));
    }

    public static final b01.f j(uf0.k kVar) {
        boolean z = kVar.b;
        boolean z2 = kVar.c;
        boolean z3 = kVar.d;
        ZonedDateTime zonedDateTime = kVar.e;
        u9 u9Var = kVar.f;
        return new b01.f(z, z2, z3, zonedDateTime, u9Var != null ? d5.e0(u9Var) : null);
    }

    public static final LegacyProjectWithNumber k(String str, String str2, li0.a aVar) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        return new LegacyProjectWithNumber(new SimpleLegacyProject(aVar.b, aVar.a, R(aVar.c), null), aVar.d, str, str2);
    }

    public static final g4 l(hv0.f fVar) {
        hv0.c cVar;
        hv0.e eVar;
        List list;
        hv0.b bVar;
        boolean z = fVar.a;
        String str = fVar.c;
        String str2 = fVar.d;
        List list2 = fVar.h.a;
        return new g4(z, str, str2, (list2 == null || (cVar = (hv0.c) x61.m.W(list2)) == null || (eVar = cVar.a) == null || (list = eVar.a) == null || (bVar = (hv0.b) x61.m.f0(list)) == null) ? null : G(bVar.b), fVar.e, fVar.f, O(fVar.g));
    }

    public static final i81.g m(String str, SerialDescriptor[] serialDescriptorArr, j71.c cVar) {
        if (t71.p.T(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        i81.a aVar = new i81.a(str);
        cVar.k(aVar);
        return new i81.g(str, i81.k.e, aVar.c.size(), x61.l.g0(serialDescriptorArr), aVar);
    }

    public static final i81.g n(String str, y9.a aVar, SerialDescriptor[] serialDescriptorArr, j71.c cVar) {
        k71.k.g(str, "serialName");
        if (t71.p.T(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (aVar.equals(i81.k.e)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        i81.a aVar2 = new i81.a(str);
        cVar.k(aVar2);
        return new i81.g(str, aVar, aVar2.c.size(), x61.l.g0(serialDescriptorArr), aVar2);
    }

    public static i81.g o(String str, y9.a aVar, SerialDescriptor[] serialDescriptorArr) {
        k71.k.g(str, "serialName");
        if (t71.p.T(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (aVar.equals(i81.k.e)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        i81.a aVar2 = new i81.a(str);
        return new i81.g(str, aVar, aVar2.c.size(), x61.l.g0(serialDescriptorArr), aVar2);
    }

    public static final void p(long j) {
        s3.p[] pVarArr = s3.o.b;
        if ((j & 1095216660480L) == 0) {
            s3.i.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void q(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
    }

    public static final void r(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
    }

    public static final void s(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder m = x.i.m(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            m.append(i3);
            throw new IndexOutOfBoundsException(m.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(no.a.j(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final androidx.compose.runtime.f1 t(j0.i iVar, androidx.compose.runtime.s sVar, int i) {
        Object N = sVar.N();
        androidx.compose.runtime.i iVar2 = androidx.compose.runtime.n.a;
        if (N == iVar2) {
            N = androidx.compose.runtime.t.B(Boolean.FALSE);
            sVar.n0(N);
        }
        androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) N;
        boolean z = (((i & 14) ^ 6) > 4 && sVar.f(iVar)) || (i & 6) == 4;
        Object N2 = sVar.N();
        if (z || N2 == iVar2) {
            N2 = new gi.b(iVar, f1Var, (a71.c) null, 11);
            sVar.n0(N2);
        }
        androidx.compose.runtime.t.f(sVar, (j71.e) N2, iVar);
        return f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    public static final LinkedHashMap u(xt0.v vVar, cu cuVar) {
        x61.r rVar;
        ArrayList r112;
        DiffLineType diffLineType;
        List list;
        g7 g7Var;
        List list2;
        g7 g7Var2;
        xt0.v vVar2 = vVar;
        List list3 = vVar2.c.a;
        x61.r rVar2 = x61.r.r;
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
            if (!((xt0.s) obj).e) {
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
            xt0.s sVar = (xt0.s) obj2;
            if (sVar.b == cuVar) {
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
                    k7 k7Var = ((xt0.r) obj3).c;
                    j7 j7Var = k7Var.g;
                    h7 h7Var = k7Var.f;
                    String str = null;
                    String str2 = h7Var != null ? h7Var.a : null;
                    yp0.c cVar = k7Var.k;
                    String str3 = sVar.c;
                    x61.r rVar3 = rVar2;
                    gu0.c cVar2 = k7Var.l;
                    at0.a aVar = k7Var.o;
                    String str4 = k7Var.h;
                    PullRequestReviewCommentState U = b41.b.U(k7Var.i);
                    if (j7Var != null && (list2 = j7Var.g) != null && (g7Var2 = (g7) x61.m.f0(list2)) != null) {
                        wq0.a aVar2 = g7Var2.b;
                        if (k7Var.c != null) {
                            str = G(aVar2);
                        }
                    }
                    String str5 = str;
                    String str6 = k7Var.j;
                    boolean z = k7Var.m.b;
                    if (j7Var == null || (list = j7Var.g) == null || (g7Var = (g7) x61.m.f0(list)) == null || (diffLineType = k41.b.X(g7Var.b.a)) == null) {
                        diffLineType = DiffLineType.UNKNOWN__;
                    }
                    DiffLineType diffLineType2 = diffLineType;
                    eu0.a aVar3 = sVar.k;
                    String str7 = vVar2.a;
                    String str8 = vVar2.b;
                    boolean z2 = sVar.i;
                    boolean z3 = sVar.d;
                    xt0.t tVar = sVar.h;
                    r112.add(f(cVar, str3, str2, cVar2, aVar, str4, U, str5, str6, z, diffLineType2, aVar3, str7, str8, z2, z3, tVar != null ? tVar.a : "", sVar.f, sVar.g, k7Var.n, O(sVar.b)));
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

    public static x.h0 v() {
        long[] jArr = x.o0.a;
        return new x.h0();
    }

    public static final m7.s w(Context context, Class cls, String str) {
        k71.k.g(context, "context");
        if (str == null || t71.p.T(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (k71.k.b(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new m7.s(context, cls, str);
    }

    public static void z(com.google.common.util.concurrent.c cVar) {
        if (!cVar.isDone()) {
            throw new IllegalStateException(b41.b.D("Future was expected to be done: %s", cVar));
        }
        boolean z = false;
        while (true) {
            try {
                cVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public abstract int F(byte[] bArr, int i, int i2);

    public abstract String x(byte[] bArr, int i, int i2);

    public abstract int y(String str, byte[] bArr, int i, int i2);
}
