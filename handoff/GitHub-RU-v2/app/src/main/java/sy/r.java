package sy;

import android.database.SQLException;
import android.graphics.Color;
import androidx.compose.runtime.b2;
import b6.a1;
import c21.h0;
import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.projects.ProjectViewItemSortableValueType;
import com.github.service.models.response.type.StatusState;
import com.github.service.models.response.type.SubscriptionState;
import e50.d1;
import gn0.kw;
import hc0.j2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import l01.q0;
import qx.c1;
import s0.h1;
import w80.a2;
import w80.k3;
import w80.x1;
import w80.z1;
import wy0.n6;
import yz0.b8;
import yz0.j8;
import yz0.l4;
import yz0.l8;
import yz0.m8;
import yz0.p0;
import yz0.x2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r {
    public static final boolean A(i50.h hVar) {
        k71.k.g(hVar, "<this>");
        i50.g gVar = hVar.i;
        return (gVar != null ? gVar.b : false) && hVar.h == null;
    }

    public static final void a(z5.a aVar, z5.n nVar, int i, z5.d dVar, androidx.compose.runtime.s sVar, int i2, int i3) {
        int i4;
        sVar.e0(491792371);
        int i5 = (sVar.f(aVar) ? 4 : 2) | i2 | (sVar.f(nVar) ? 256 : 128);
        int i6 = i5 | 3072;
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 = i5 | 27648;
        } else {
            i4 = ((32768 & i2) == 0 ? sVar.f(dVar) : sVar.h(dVar) ? 16384 : 8192) | i6;
        }
        if ((i4 & 9363) == 9362 && sVar.C()) {
            sVar.V();
        } else {
            if (i7 != 0) {
                dVar = null;
            }
            b(aVar, nVar, dVar, sVar, (i4 & 14) | 196656 | (i4 & 896) | 3072 | (i4 & 57344));
            i = 1;
        }
        int i8 = i;
        z5.d dVar2 = dVar;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues.ui.l(aVar, nVar, i8, dVar2, i2, i3);
        }
    }

    public static final void b(z5.a aVar, z5.n nVar, z5.d dVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.e0(2075067909);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? sVar.f(aVar) : sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f((Object) null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(nVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.d(1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? sVar.f(dVar) : sVar.h(dVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.f((Object) null) ? 131072 : 65536;
        }
        if ((i2 & 74899) == 74898 && sVar.C()) {
            sVar.V();
        } else {
            sVar.d0(884190429);
            sVar.q(false);
            sVar.d0(1849434622);
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = z5.o.z;
                sVar.n0(N);
            }
            sVar.q(false);
            j71.a aVar2 = (k71.i) N;
            sVar.d0(-1115894518);
            sVar.d0(1886828752);
            if (!(sVar.a instanceof z5.b)) {
                androidx.compose.runtime.t.x();
                throw null;
            }
            sVar.a0();
            if (sVar.S) {
                sVar.k(new a1(1, aVar2));
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, new n6(12), aVar);
            androidx.compose.runtime.t.I(sVar, new n6(13), nVar);
            androidx.compose.runtime.t.I(sVar, new n6(14), new i6.h());
            androidx.compose.runtime.t.I(sVar, new n6(15), dVar);
            androidx.compose.runtime.t.I(sVar, new n6(16), (Object) null);
            sVar.q(true);
            sVar.q(false);
            sVar.q(false);
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new h1(aVar, nVar, dVar, i, 6);
        }
    }

    public static final b01.g c(c40.c cVar, String str, i80.c cVar2, y60.a aVar, i50.n nVar, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, d1 d1Var, boolean z6, boolean z7, boolean z8) {
        i50.s sVar;
        i50.m mVar = nVar.b;
        bb0.b bVar = new bb0.b(cVar, str, p0.s);
        String str3 = cVar.b;
        ArrayList f = c0.f(cVar2, str3);
        boolean z9 = cVar2.c;
        Integer valueOf = Integer.valueOf(mVar.a);
        x2 d = t.d(aVar);
        x61.r rVar = mVar.b;
        if (rVar == null) {
            rVar = x61.r.r;
        }
        ArrayList S = x61.m.S(rVar);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            i50.u uVar = ((i50.l) obj).c;
            c40.c cVar3 = uVar.h;
            String str4 = uVar.b;
            i80.c cVar4 = uVar.i;
            Integer num = valueOf;
            y60.a aVar2 = uVar.k;
            g70.a aVar3 = uVar.j;
            ArrayList arrayList2 = S;
            boolean z11 = aVar3.b;
            boolean z12 = aVar3.c;
            aa0.a aVar4 = cVar3.l;
            boolean z13 = aVar4 != null ? aVar4.b : false;
            boolean z14 = uVar.c;
            boolean z15 = uVar.d;
            boolean z16 = uVar.e;
            i50.t tVar = uVar.f;
            arrayList.add(e(cVar3, str4, cVar4, aVar2, z11, z12, z13, z14, z15, z16, (tVar == null || (sVar = tVar.c) == null) ? null : sVar.b));
            valueOf = num;
            S = arrayList2;
        }
        return new b01.g(bVar, f, z9, valueOf, z, z2, z3, z4, str2, z5, d, arrayList, new b8(d1Var.d, str3, z8, d1Var.c), z6, z7);
    }

    public static final b01.g d(c40.c cVar, String str, i80.c cVar2, y60.a aVar, Integer num, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, List list, d1 d1Var, boolean z6, boolean z7, boolean z8) {
        x2 x2Var;
        bb0.b bVar = new bb0.b(cVar, str, p0.s);
        String str3 = cVar.b;
        ArrayList f = c0.f(cVar2, str3);
        boolean z9 = cVar2.c;
        if (aVar != null) {
            x2Var = t.d(aVar);
        } else {
            x2.Companion.getClass();
            x2Var = x2.e;
        }
        return new b01.g(bVar, f, z9, num, z, z2, z3, z4, str2, z5, x2Var, list, new b8(d1Var.d, str3, z8, d1Var.c), z6, z7);
    }

    public static final b01.g e(c40.c cVar, String str, i80.c cVar2, y60.a aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2) {
        return new b01.g(new bb0.b(cVar, str, p0.s), c0.f(cVar2, cVar.b), cVar2.c, (Integer) null, z3, z4, z5, z6, str2, false, t.d(aVar), (List) null, (b8) null, z, z2);
    }

    public static final MergeCheckStatus g(StatusState statusState) {
        k71.k.g(statusState, "<this>");
        switch (va0.g.a[statusState.ordinal()]) {
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

    public static final MergeCheckStatus h(j2 j2Var) {
        switch (j2Var.ordinal()) {
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

    public static final j8 i(r70.c cVar) {
        String str;
        r70.a aVar;
        String str2;
        r70.a aVar2;
        k71.k.g(cVar, "<this>");
        List list = cVar.c;
        String str3 = cVar.a;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (list == null || (aVar2 = (r70.a) x61.m.W(list)) == null || (str = aVar2.b) == null) {
            str = "";
        }
        if (list != null && (aVar = (r70.a) x61.m.W(list)) != null && (str2 = aVar.a) != null) {
            str4 = str2;
        }
        return new j8(str3, str, str4, cVar.b);
    }

    public static final l8 j(a2 a2Var) {
        String str;
        int i;
        String str2 = a2Var.c;
        z1 z1Var = a2Var.i;
        String str3 = z1Var != null ? z1Var.b : "";
        if (z1Var != null) {
            try {
                str = z1Var.a;
            } catch (Exception unused) {
                i = -16777216;
            }
        } else {
            str = null;
        }
        i = Color.parseColor(str);
        int i2 = i;
        String str4 = a2Var.d;
        x1 x1Var = a2Var.h;
        return new l8(str2, str3, i2, str4, x1Var.c, t.q.q(x1Var.d), a2Var.b, a2Var.r.c);
    }

    public static final m8 k(k3 k3Var) {
        String str = k3Var.a;
        if (str == null || t71.p.T(str)) {
            return null;
        }
        String str2 = k3Var.b;
        if (str2 == null) {
            str2 = "";
        }
        return new m8(str2, str);
    }

    public static final l4 l(c1 c1Var) {
        k71.k.g(c1Var, "<this>");
        return new l4(w8.s.A(c1Var.g), c1Var.b, c1Var.c, c1Var.d, c1Var.e);
    }

    public static void m(int i) {
        if (2 > i || i >= 37) {
            StringBuilder o = x.i.o("radix ", i, " was not in valid range ");
            o.append(new q71.g(2, 36, 1));
            throw new IllegalArgumentException(o.toString());
        }
    }

    public static byte[] n(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final int o(List list, List list2, int i) {
        String str;
        Float v;
        Float v2;
        int i2 = 0;
        if (i < list.size()) {
            q0 q0Var = (q0) x61.m.X(i, list);
            q0 q0Var2 = (q0) x61.m.X(i, list2);
            ProjectViewItemSortableValueType projectViewItemSortableValueType = q0Var != null ? q0Var.b : null;
            int i3 = projectViewItemSortableValueType == null ? -1 : u00.v.a[projectViewItemSortableValueType.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    String str2 = q0Var.a;
                    if (str2 != null) {
                        i2 = str2.compareTo(String.valueOf(q0Var2 != null ? q0Var2.a : null));
                    }
                } else if (i3 == 2 || i3 == 3) {
                    String str3 = q0Var.a;
                    float f = 0.0f;
                    float floatValue = (str3 == null || (v2 = t71.v.v(str3)) == null) ? 0.0f : v2.floatValue();
                    if (q0Var2 != null && (str = q0Var2.a) != null && (v = t71.v.v(str)) != null) {
                        f = v.floatValue();
                    }
                    i2 = Float.compare(floatValue, f);
                } else if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return i2 != 0 ? i2 : o(list, list2, i + 1);
            }
        }
        return 0;
    }

    public static final boolean p(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final void q(v7.a aVar, String str) {
        k71.k.g(aVar, "<this>");
        k71.k.g(str, "sql");
        v7.c F0 = aVar.F0(str);
        try {
            F0.B0();
            m7.y.t(F0, (Throwable) null);
        } finally {
        }
    }

    public static final boolean r(z5.i iVar) {
        return true;
    }

    public static boolean s(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final void t(x6.y yVar, k71.e eVar, Object obj, j71.c cVar) {
        k71.k.g(yVar, "<this>");
        k71.k.g(obj, "startDestination");
        x6.y yVar2 = new x6.y(yVar.g, obj, eVar);
        cVar.k(yVar2);
        yVar.j.add(yVar2.a());
    }

    public static final void u(x6.y yVar, k71.e eVar, k71.e eVar2, Map map, j71.c cVar) {
        k71.k.g(yVar, "<this>");
        k71.k.g(map, "typeMap");
        x6.y yVar2 = new x6.y(yVar.g, eVar2, eVar, map);
        cVar.k(yVar2);
        yVar.j.add(yVar2.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x91.d v(b21.v vVar) {
        x91.d dVar;
        h0 m;
        x91.d dVar2;
        List list;
        List list2;
        h0 h0Var = j91.a.K;
        h0 h0Var2 = j91.a.L;
        h0 h0Var3 = j91.a.T;
        k71.k.g(vVar, "iterator");
        int i = vVar.s;
        x91.d n = s.n(vVar);
        if (n != null) {
            b21.v vVar2 = n.a;
            if (k71.k.b(vVar2.r(), h0Var)) {
                b21.v c = vVar2.c().c();
                if (k71.k.b(c.m(), h0Var3)) {
                    c = c.c();
                }
                boolean b = k71.k.b(c.m(), h0Var3);
                List list3 = x61.r.r;
                if (!b && !k71.k.b(c.m(), h0Var2)) {
                    int i2 = c.s;
                    boolean b2 = k71.k.b(c.m(), j91.a.O);
                    b21.v c2 = b2 ? c.c() : c;
                    boolean z = false;
                    while (c2.m() != null && (!b2 || !k71.k.b(c2.m(), j91.a.P))) {
                        if (!b2) {
                            if (k71.k.b(c2.m(), h0Var)) {
                                if (z) {
                                    break;
                                }
                                z = true;
                            }
                            h0 r = c2.r();
                            char d = c2.d(1);
                            if (d == 0 || Character.isSpaceChar(d) || s(d) || r == null) {
                                break;
                            }
                            if (!r.equals(h0Var2)) {
                                continue;
                            } else {
                                if (!z) {
                                    break;
                                }
                                z = false;
                            }
                        }
                        c2 = c2.c();
                    }
                    if (c2.m() != null && !z) {
                        dVar = new x91.d(c2, d0.n(new x91.e(new q71.g(i2, c2.s + 1, 1), j91.a.o)), list3);
                        if (dVar != null) {
                            c = dVar.a.c();
                            if (k71.k.b(c.m(), h0Var3)) {
                                c = c.c();
                            }
                        }
                        if (!k71.k.b(c.m(), h0Var3)) {
                            int i3 = c.s;
                            if (k71.k.b(c.m(), j91.a.I) || k71.k.b(c.m(), j91.a.J)) {
                                m = c.m();
                            } else if (k71.k.b(c.m(), h0Var)) {
                                m = h0Var2;
                            }
                            b21.v c3 = c.c();
                            while (c3.m() != null && !k71.k.b(c3.m(), m)) {
                                c3 = c3.c();
                            }
                            if (c3.m() != null) {
                                dVar2 = new x91.d(c3, d0.n(new x91.e(new q71.g(i3, c3.s + 1, 1), j91.a.p)), list3);
                                if (dVar2 != null) {
                                    c = dVar2.a.c();
                                    if (k71.k.b(c.m(), h0Var3)) {
                                        c = c.c();
                                    }
                                }
                                if (k71.k.b(c.m(), h0Var2)) {
                                    List list4 = n.b;
                                    if (dVar == null || (list = dVar.b) == null) {
                                        list = list3;
                                    }
                                    ArrayList l0 = x61.m.l0(list4, list);
                                    if (dVar2 != null && (list2 = dVar2.b) != null) {
                                        list3 = list2;
                                    }
                                    return new x91.d(c, x61.m.m0(x61.m.l0(l0, list3), new x91.e(new q71.g(i, c.s + 1, 1), j91.a.r)), n.c);
                                }
                            }
                        }
                        dVar2 = null;
                        if (dVar2 != null) {
                        }
                        if (k71.k.b(c.m(), h0Var2)) {
                        }
                    }
                }
                dVar = null;
                if (dVar != null) {
                }
                if (!k71.k.b(c.m(), h0Var3)) {
                }
                dVar2 = null;
                if (dVar2 != null) {
                }
                if (k71.k.b(c.m(), h0Var2)) {
                }
            }
        }
        return null;
    }

    public static final void w(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public static final kw x(SubscriptionState subscriptionState) {
        switch (subscriptionState == null ? -1 : vl0.p.a[subscriptionState.ordinal()]) {
            case -1:
                return kw.y;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return kw.y;
            case 2:
                return kw.x;
            case 3:
                return kw.v;
            case 4:
                return kw.w;
            case 5:
                return kw.u;
            case 6:
                return kw.t;
        }
    }

    public static byte[] y(w51.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = dVar.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return n(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (dVar.read() == -1) {
            return n(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final SubscriptionState z(kw kwVar) {
        switch (kwVar == null ? -1 : vl0.p.b[kwVar.ordinal()]) {
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
}
