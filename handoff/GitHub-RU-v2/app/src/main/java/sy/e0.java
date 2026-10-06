package sy;

import a0.s0;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.github.service.dotcom.models.response.copilot.AiModelCapabilitiesResponse;
import com.github.service.dotcom.models.response.copilot.AiModelPolicyResponse;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.type.PatchStatus;
import com.github.service.models.response.type.StatusState;
import cq.d1;
import cq.f6;
import cq.i2;
import cq.i3;
import cq.m1;
import cq.o1;
import cq.o6;
import cq.q3;
import cq.u3;
import cq.w0;
import cq.w6;
import cq.y1;
import dw.j3;
import dw.l3;
import dw.m3;
import dw.m5;
import gn0.pj;
import is.h0;
import is.k0;
import is.p0;
import java.net.ProtocolException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import m10.ya0;
import v8.l0;
import w80.a2;
import w80.c1;
import w80.g0;
import w80.m0;
import w80.n0;
import w80.p3;
import w80.x1;
import w80.z1;
import yz0.j8;
import yz0.l8;
import yz0.m8;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e0 {
    public static final p01.g a(c1 c1Var) {
        g0 g0Var;
        w80.e0 e0Var;
        StatusState K;
        g0 g0Var2;
        w80.e0 e0Var2;
        w80.f0 f0Var;
        g0 g0Var3;
        w80.e0 e0Var3;
        w80.f0 f0Var2;
        w80.e0 e0Var4;
        n0 n0Var = c1Var.e;
        m0 m0Var = c1Var.f;
        String str = n0Var != null ? n0Var.c.b : m0Var != null ? m0Var.c.b : "main";
        String str2 = null;
        boolean b = k71.k.b(n0Var != null ? Boolean.valueOf(n0Var.c.c) : m0Var != null ? Boolean.valueOf(m0Var.c.c) : null, Boolean.TRUE);
        if (n0Var != null) {
            g0 g0Var4 = n0Var.c.d;
            String str3 = (g0Var4 == null || (e0Var4 = g0Var4.c) == null) ? null : e0Var4.a;
            if (str3 != null) {
                str2 = str3;
                if (n0Var != null || (g0Var3 = n0Var.c.d) == null || (e0Var3 = g0Var3.c) == null || (f0Var2 = e0Var3.b) == null || (K = y9.a.K(f0Var2.a)) == null) {
                    K = (m0Var != null || (g0Var2 = m0Var.c.d) == null || (e0Var2 = g0Var2.c) == null || (f0Var = e0Var2.b) == null) ? StatusState.UNKNOWN__ : y9.a.K(f0Var.a);
                }
                return new p01.g(str, b, str2, K);
            }
        }
        if (m0Var != null && (g0Var = m0Var.c.d) != null && (e0Var = g0Var.c) != null) {
            str2 = e0Var.a;
        }
        if (n0Var != null) {
        }
        if (m0Var != null) {
        }
        return new p01.g(str, b, str2, K);
    }

    public static final xn.h b(AiModelCapabilitiesResponse aiModelCapabilitiesResponse) {
        xn.i iVar;
        k71.k.g(aiModelCapabilitiesResponse, "<this>");
        gz.b bVar_r7 = aiModelCapabilitiesResponse.a;
        k71.k.g(bVar_r7, "<this>");
        int ordinal = bVar_r7.ordinal();
        if (ordinal == 0) {
            iVar = xn.i.r;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = xn.i.s;
        }
        return new xn.h(iVar, aiModelCapabilitiesResponse.b);
    }

    public static final xn.j c(gz.e eVar) {
        k71.k.g(eVar, "<this>");
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return xn.j.r;
        }
        if (ordinal == 1) {
            return xn.j.s;
        }
        if (ordinal == 2) {
            return xn.j.t;
        }
        if (ordinal == 3) {
            return xn.j.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final xn.k d(AiModelPolicyResponse aiModelPolicyResponse) {
        xn.l lVar;
        k71.k.g(aiModelPolicyResponse, "<this>");
        gz.c cVar = aiModelPolicyResponse.a;
        k71.k.g(cVar, "<this>");
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            lVar = xn.l.r;
        } else if (ordinal == 1) {
            lVar = xn.l.s;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = xn.l.t;
        }
        return new xn.k(lVar, aiModelPolicyResponse.b);
    }

    public static final b01.j e(is.a0Shadow a0Var) {
        k0 k0Var;
        pv.c cVar = a0Var.l;
        com.github.service.models.response.a e = l0.e(a0Var.c.b.b);
        p0 p0Var = a0Var.k;
        h0 h0Var = p0Var.q;
        String str = (h0Var == null || (k0Var = h0Var.b) == null) ? "" : k0Var.a;
        b01.b d = f0.d(p0Var);
        String str2 = str;
        String str3 = a0Var.d;
        String str4 = a0Var.e;
        String str5 = p0Var.l;
        ArrayList h = w8.s.h(p0Var.b, cVar);
        boolean z = cVar.c;
        boolean z2 = a0Var.j;
        boolean z3 = a0Var.f == ya0.w;
        boolean z4 = a0Var.g;
        boolean z5 = a0Var.h;
        pu.a aVar = a0Var.m;
        return new b01.j(e, str2, d, str3, str4, str5, h, z, z2, z3, z4, z5, aVar.b, aVar.c);
    }

    public static final t10.h f(w0 w0Var) {
        cq.w wVar = w0Var.b;
        x61.rShadow rVar = x61.rShadow.r;
        if (wVar != null) {
            return new t10.b(wVar.b, wVar.c, wVar.d, l0.e(wVar.a.c), xp.a.a(wVar.f.c), wVar.e, rVar);
        }
        cq.g0 g0Var = w0Var.c;
        if (g0Var != null) {
            return new t10.c(g0Var.b, g0Var.c, g0Var.d, l0.e(g0Var.a.c), xp.a.g(g0Var.e.c), rVar);
        }
        d1 d1Var = w0Var.d;
        if (d1Var != null) {
            String str = d1Var.d;
            ZonedDateTime zonedDateTime = d1Var.b;
            cq.c1 c1Var = d1Var.f;
            u3 u3Var = c1Var.b;
            if (u3Var != null) {
                return new t10.n(zonedDateTime, d1Var.c, str, xp.a.e(u3Var), rVar);
            }
            q3 q3Var = c1Var.c;
            if (q3Var != null) {
                return new t10.m(zonedDateTime, d1Var.c, str, xp.a.d(q3Var), rVar);
            }
            return null;
        }
        o1 o1Var = w0Var.e;
        if (o1Var != null) {
            String str2 = o1Var.d;
            ZonedDateTime zonedDateTime2 = o1Var.b;
            m1 m1Var = o1Var.e;
            q3 q3Var2 = m1Var.c;
            u3 u3Var2 = m1Var.b;
            w6 w6Var = o1Var.f.c;
            if (u3Var2 != null) {
                return new t10.w(zonedDateTime2, o1Var.c, str2, new com.github.service.models.response.a(w6Var.c, w8.s.A(w6Var.e), (String) null, false, (String) null, 60), xp.a.e(u3Var2), rVar);
            }
            if (q3Var2 != null) {
                return new t10.v(zonedDateTime2, o1Var.c, str2, new com.github.service.models.response.a(w6Var.c, w8.s.A(w6Var.e), (String) null, false, (String) null, 60), xp.a.d(q3Var2), rVar);
            }
            return null;
        }
        y1 y1Var = w0Var.f;
        if (y1Var != null) {
            return new t10.o(y1Var.b, y1Var.c, y1Var.d, l0.e(y1Var.a.c), xp.a.g(y1Var.e.c), rVar);
        }
        i2 i2Var = w0Var.g;
        if (i2Var != null) {
            return new t10.p(i2Var.b, i2Var.c, i2Var.d, l0.e(i2Var.a.c), xp.a.c(i2Var.e.c), rVar);
        }
        i3 i3Var = w0Var.h;
        if (i3Var != null) {
            return new t10.q(i3Var.b, i3Var.c, i3Var.d, l0.e(i3Var.a.c), xp.a.f(i3Var.e.c), rVar);
        }
        f6 f6Var = w0Var.i;
        if (f6Var != null) {
            return new t10.t(f6Var.a, f6Var.b, f6Var.c, xp.a.g(f6Var.e.c), rVar);
        }
        o6 o6Var = w0Var.j;
        if (o6Var != null) {
            return new t10.u(o6Var.b, o6Var.c, o6Var.d, l0.e(o6Var.a.c), xp.a.g(o6Var.e.c), rVar);
        }
        return null;
    }

    public static final j8 g(cv.c cVar) {
        String str;
        cv.a aVar;
        String str2;
        cv.a aVar2;
        k71.k.g(cVar, "<this>");
        List list = cVar.c;
        String str3 = cVar.a;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (list == null || (aVar2 = (cv.a) x61.m.W(list)) == null || (str = aVar2.b) == null) {
            str = "";
        }
        if (list != null && (aVar = (cv.a) x61.m.W(list)) != null && (str2 = aVar.a) != null) {
            str4 = str2;
        }
        return new j8(str3, str, str4, cVar.b);
    }

    public static final l8 h(m3 m3Var) {
        String str;
        int i;
        String str2 = m3Var.c;
        l3 l3Var = m3Var.i;
        String str3 = l3Var != null ? l3Var.b : "";
        if (l3Var != null) {
            try {
                str = l3Var.a;
            } catch (Exception unused) {
                i = -16777216;
            }
        } else {
            str = null;
        }
        i = Color.parseColor(str);
        int i2 = i;
        String str4 = m3Var.d;
        j3 j3Var = m3Var.h;
        return new l8(str2, str3, i2, str4, j3Var.c, w8.s.A(j3Var.d), m3Var.b, m3Var.r.c);
    }

    public static final m8 i(m5 m5Var) {
        String str = m5Var.a;
        if (str == null || t71.p.T(str)) {
            return null;
        }
        String str2 = m5Var.b;
        if (str2 == null) {
            str2 = "";
        }
        return new m8(str2, str);
    }

    public static final int j(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static Set k() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static androidx.compose.foundation.lazy.layout.o1 l(String str) {
        q81.vShadow vVar;
        int i;
        String str2;
        k71.k.g(str, "statusLine");
        if (t71.w.F(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                vVar = q81.vShadow.t;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                vVar = q81.vShadow.u;
            }
        } else if (t71.w.F(str, "ICY ", false)) {
            vVar = q81.vShadow.t;
            i = 4;
        } else {
            if (!t71.w.F(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            vVar = q81.vShadow.u;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        String substring = str.substring(i, i2);
        k71.k.f(substring, "substring(...)");
        Integer G = t71.w.G(substring);
        if (G == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int intValue = G.intValue();
        if (str.length() <= i2) {
            str2 = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            str2 = str.substring(i + 4);
            k71.k.f(str2, "substring(...)");
        }
        return new androidx.compose.foundation.lazy.layout.o1(vVar, intValue, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(ViewStructure viewStructure, v2.g0 g0Var, AutofillId autofillId, String str, e3.b bVar_r7) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        f3.a aVar;
        g3.g gVar;
        x1.f fVar;
        d3.kShadow kVar;
        x1.d dVar;
        boolean z;
        boolean z2;
        x1.n nVar;
        Boolean bool;
        boolean z3;
        Integer num;
        boolean z4;
        List list;
        Integer valueOf;
        boolean z5;
        boolean z6;
        String E;
        String[] k;
        String[] k2;
        x.h0 h0Var;
        Object[] objArr;
        int i2;
        Object[] objArr2;
        boolean z7;
        x.h0 h0Var2;
        f3.a aVar2;
        g3.g gVar2;
        x1.f fVar2;
        d3.kShadow kVar2;
        boolean z8;
        int i3;
        d3.b0 b0Var = d3.xShadow.a;
        d3.b0 b0Var2 = d3.n.a;
        d3.oShadow y = g0Var.y();
        int i4 = 8;
        if (y == null || (h0Var2 = y.r) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            aVar = null;
            gVar = null;
            fVar = null;
            kVar = null;
            dVar = null;
            z = true;
            z2 = false;
            nVar = null;
            bool = null;
            z3 = false;
            num = null;
        } else {
            Object[] objArr3 = h0Var2.b;
            j = 128;
            Object[] objArr4 = h0Var2.c;
            long[] jArr = h0Var2.a;
            int length = jArr.length - 2;
            i = 2;
            if (length >= 0) {
                int i5 = 0;
                dVar = null;
                j2 = 255;
                z2 = false;
                aVar2 = null;
                gVar2 = null;
                fVar2 = null;
                nVar = null;
                bool = null;
                kVar2 = null;
                z3 = false;
                z8 = true;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                d3.b0 b0Var3 = (d3.b0) obj;
                                i3 = i4;
                                if (k71.k.b(b0Var3, d3.x.r)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    dVar = (x1.d) obj2;
                                } else if (k71.k.b(b0Var3, d3.xShadow.a)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) x61.m.W((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (k71.k.b(b0Var3, d3.x.q)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    nVar = (x1.n) obj2;
                                } else if (k71.k.b(b0Var3, d3.x.s)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidFillableData");
                                    fVar2 = (x1.f) obj2;
                                } else if (k71.k.b(b0Var3, d3.x.F)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    gVar2 = (g3.g) obj2;
                                } else if (k71.k.b(b0Var3, d3.x.k)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (k71.k.b(b0Var3, d3.x.O)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (k71.k.b(b0Var3, d3.x.K)) {
                                    z3 = true;
                                } else if (k71.k.b(b0Var3, d3.x.n)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    z8 = ((Boolean) obj2).booleanValue();
                                } else if (k71.k.b(b0Var3, d3.x.y)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    kVar2 = (d3.k) obj2;
                                } else if (k71.k.b(b0Var3, d3.x.I)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (k71.k.b(b0Var3, d3.x.J)) {
                                    k71.k.e(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar2 = (f3.a) obj2;
                                } else if (k71.k.b(b0Var3, d3.n.b)) {
                                    viewStructure.setClickable(true);
                                } else if (k71.k.b(b0Var3, d3.n.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (k71.k.b(b0Var3, d3.n.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (k71.k.b(b0Var3, d3.n.k)) {
                                    z2 = true;
                                }
                            } else {
                                i3 = i4;
                            }
                            j4 >>= i3;
                            i7++;
                            i4 = i3;
                        }
                        if (i6 != i4) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    i4 = 8;
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                dVar = null;
                z2 = false;
                aVar2 = null;
                gVar2 = null;
                fVar2 = null;
                nVar = null;
                bool = null;
                kVar2 = null;
                z3 = false;
                z8 = true;
                num = null;
            }
            aVar = aVar2;
            gVar = gVar2;
            fVar = fVar2;
            kVar = kVar2;
            z = z8;
        }
        d3.oShadow y2 = g0Var.y();
        if (y2 != null && y2.t && !y2.u) {
            y2 = y2.b();
            x.d0Shadow d0Var = new x.d0(((l1.e) g0Var.o().s).t);
            d0Var.b(g0Var.o());
            while (d0Var.i()) {
                v2.g0 g0Var2 = (v2.g0) d0Var.k(d0Var.b - 1);
                d3.oShadow y3 = g0Var2.y();
                if (y3 != null && !y3.t) {
                    y2.e(y3);
                    if (!y3.u) {
                        d0Var.b(g0Var2.o());
                    }
                }
            }
        }
        if (y2 != null && (h0Var = y2.r) != null) {
            Object[] objArr5 = h0Var.b;
            Object[] objArr6 = h0Var.c;
            long[] jArr2 = h0Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr2[i9];
                    long[] jArr3 = jArr2;
                    Object[] objArr7 = objArr5;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i11 = 8 - ((~(i9 - length2)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j5 & j2) < j) {
                                int i13 = (i9 << 3) + i12;
                                Object obj3 = objArr7[i13];
                                i2 = i12;
                                Object obj4 = objArr6[i13];
                                objArr2 = objArr6;
                                d3.b0 b0Var4 = (d3.b0) obj3;
                                z7 = z;
                                if (k71.k.b(b0Var4, d3.x.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (k71.k.b(b0Var4, d3.x.B)) {
                                    k71.k.e(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                i2 = i12;
                                objArr2 = objArr6;
                                z7 = z;
                            }
                            j5 >>= 8;
                            i12 = i2 + 1;
                            objArr6 = objArr2;
                            z = z7;
                        }
                        objArr = objArr6;
                        z4 = z;
                        if (i11 != 8) {
                            break;
                        }
                    } else {
                        objArr = objArr6;
                        z4 = z;
                    }
                    if (i9 == length2) {
                        break;
                    }
                    i9++;
                    objArr5 = objArr7;
                    jArr2 = jArr3;
                    objArr6 = objArr;
                    z = z4;
                }
                Integer valueOf2 = Integer.valueOf(g0Var.s);
                if (g0Var.w() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = dVar == null ? Integer.valueOf(dVar.a) : z2 ? 1 : aVar != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (gVar != null) {
                    viewStructure.setAutofillValue(AutofillValue.forText(gVar.s));
                }
                if (fVar != null) {
                    viewStructure.setAutofillValue(fVar.a);
                }
                if (nVar != null && (k2 = d0.k(nVar)) != null) {
                    viewStructure.setAutofillHints(k2);
                }
                bVar_r7.a.s(g0Var.s, new x1.o(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (aVar == null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(aVar == f3.a.r);
                } else if (bool != null && (kVar == null || kVar.a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                x1.n.a.getClass();
                String str2 = (String) x61.l.L(d0.k(x1.m.b));
                if (nVar != null || (k = d0.k(nVar)) == null) {
                    z5 = true;
                } else {
                    z5 = true;
                    if (x61.l.t(k, str2)) {
                        z6 = true;
                        boolean z9 = (!z3 || z6) ? z5 : false;
                        viewStructure.setDataIsSensitive((!z9 || z4) ? z5 : false);
                        viewStructure.setVisibility(((v2.d1) g0Var.X.e).e1() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = "";
                            for (int i14 = 0; i14 < size; i14++) {
                                str3 = s0.m(f1.e.p(str3), ((g3.g) list.get(i14)).s, '\n');
                            }
                            viewStructure.setText(str3);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (g0Var.o().isEmpty() && kVar != null && (E = w2.f0.E(kVar.a)) != null) {
                            viewStructure.setClassName(E);
                        }
                        if (z2) {
                            viewStructure.setClassName("android.widget.EditText");
                            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                                a5.l.A(viewStructure, num.intValue());
                            }
                            if (z9) {
                                viewStructure.setInputType(129);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z6 = false;
                if (z3) {
                }
                viewStructure.setDataIsSensitive((!z9 || z4) ? z5 : false);
                viewStructure.setVisibility(((v2.d1) g0Var.X.e).e1() ? 4 : 0);
                if (list != null) {
                }
                if (g0Var.o().isEmpty()) {
                    viewStructure.setClassName(E);
                }
                if (z2) {
                }
            }
        }
        z4 = z;
        list = null;
        Integer valueOf22 = Integer.valueOf(g0Var.s);
        if (g0Var.w() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (dVar == null) {
        }
        if (valueOf != null) {
        }
        if (gVar != null) {
        }
        if (fVar != null) {
        }
        if (nVar != null) {
            viewStructure.setAutofillHints(k2);
        }
        bVar_r7.a.s(g0Var.s, new x1.o(viewStructure));
        if (bool != null) {
        }
        if (aVar == null) {
        }
        x1.n.a.getClass();
        String str22 = (String) x61.l.L(d0.k(x1.m.b));
        if (nVar != null) {
        }
        z5 = true;
        z6 = false;
        if (z3) {
        }
        viewStructure.setDataIsSensitive((!z9 || z4) ? z5 : false);
        viewStructure.setVisibility(((v2.d1) g0Var.X.e).e1() ? 4 : 0);
        if (list != null) {
        }
        if (g0Var.o().isEmpty()) {
        }
        if (z2) {
        }
    }

    public static final p01.g n(w80.h0 h0Var) {
        StatusState statusState;
        w80.e0 e0Var;
        w80.f0 f0Var;
        w80.e0 e0Var2;
        String str = h0Var.b;
        boolean z = h0Var.c;
        g0 g0Var = h0Var.d;
        String str2 = (g0Var == null || (e0Var2 = g0Var.c) == null) ? null : e0Var2.a;
        if (g0Var == null || (e0Var = g0Var.c) == null || (f0Var = e0Var.b) == null || (statusState = y9.a.K(f0Var.a)) == null) {
            statusState = StatusState.UNKNOWN__;
        }
        return new p01.g(str, z, str2, statusState);
    }

    public static final p01.n o(w61.kShadow kVar) {
        int i;
        Object obj = kVar.r;
        a2 a2Var = (a2) obj;
        String str = a2Var.c;
        x1 x1Var = a2Var.h;
        com.github.service.models.response.a aVar = new com.github.service.models.response.a(x1Var.c, t.q.q(x1Var.d), (String) null, false, (String) null, 60);
        boolean z = a2Var.f;
        String str2 = a2Var.d;
        try {
            z1 z1Var = ((a2) obj).i;
            i = Color.parseColor(z1Var != null ? z1Var.a : null);
        } catch (Exception unused) {
            i = -16777216;
        }
        int i2 = i;
        z1 z1Var2 = a2Var.i;
        String str3 = z1Var2 != null ? z1Var2.b : null;
        String str4 = a2Var.b;
        int i3 = a2Var.r.c;
        bb0.j jVar = new bb0.j((w80.h) kVar.s);
        boolean z2 = a2Var.r.d;
        String str5 = (a2Var.j || a2Var.l) ? a2Var.k : null;
        String str6 = a2Var.e;
        boolean z3 = a2Var.o;
        w80.y1 y1Var = a2Var.p;
        return new p01.n(str, aVar, z, str2, i2, str3, str4, i3, jVar, z2, str5, str6, z3, y1Var != null ? f1.e.h(y1Var.b.b, "/", y1Var.a) : null);
    }

    public static final PatchStatus p(pj pjVar) {
        switch (pjVar.ordinal()) {
            case 0:
                return PatchStatus.ADDED;
            case 1:
                return PatchStatus.CHANGED;
            case 2:
                return PatchStatus.COPIED;
            case 3:
                return PatchStatus.DELETED;
            case 4:
                return PatchStatus.MODIFIED;
            case 5:
                return PatchStatus.RENAMED;
            case 6:
                return PatchStatus.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final SimpleRepository q(w80.q3 q3Var) {
        k71.k.g(q3Var, "<this>");
        String str = q3Var.a;
        String str2 = q3Var.b;
        p3 p3Var = q3Var.d;
        return new SimpleRepository(t.q.q(p3Var.d), str, str2, p3Var.c, q3Var.c);
    }
}
