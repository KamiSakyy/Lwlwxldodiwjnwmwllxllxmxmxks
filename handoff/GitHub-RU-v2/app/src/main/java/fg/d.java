package fg;

import a0.w1;
import a61.g0;
import android.accounts.Account;
import android.content.Context;
import android.graphics.Typeface;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.i3;
import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.l1;
import androidx.lifecycle.v;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.rudroid.actions.checkdetail.jobbottomsheet.ReRunJobBottomSheet;
import com.github.rudroid.activities.WebViewActivity;
import com.github.rudroid.repository.files.t;
import com.github.rudroid.repository.files.z;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import d2.p0;
import f1.ib;
import f1.ic;
import f1.ob;
import f1.p9;
import gn0.na;
import go0.o;
import h0.a1;
import h0.a3;
import h0.b2;
import h0.c3;
import h0.d1;
import h0.f1;
import h0.i0;
import h0.l;
import h0.n;
import h0.p3;
import h0.u;
import h1.r;
import h1.u0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.c0;
import k3.d0;
import k3.e0;
import k3.f0;
import k3.s;
import k3.x;
import kc0.me;
import kc0.ne;
import kc0.pe;
import kc0.qe;
import l7.z1;
import n0.m;
import n0.w;
import ri0.j0;
import ri0.o0;
import ri0.x0;
import s0.k0;
import t.q;
import t71.p;
import v71.b0;
import v71.z;
import w2.h1;
import w2.i2;
import w61.a0;
import w61.k;
import x.h0;
import y71.y1;
import yz0.a7;
import yz0.s7;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0700  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object a = null;
        k kVar;
        d0 d0Var;
        Object k;
        Object obj2;
        int i;
        Typeface a;
        e0 e0Var;
        p10.b bVar;
        String str;
        j0 j0Var;
        ArrayList arrayList;
        int i2 = 14;
        int i3 = 10;
        pe peVar = null;
        int i4 = 0;
        switch (this.r) {
            case 0:
                j71.a aVar = (j71.a) this.s;
                j71.c cVar = (j71.c) this.t;
                String str2 = (String) obj;
                k71.k.g(str2, "id");
                if (str2.equals("view_all_models")) {
                    aVar.a();
                } else {
                    cVar.k(str2);
                }
                return a0.a;
            case 1:
                j71.a aVar2 = (j71.a) this.s;
                h1 h1Var = (i2) this.t;
                k71.k.g((k0) obj, "$this$KeyboardActions");
                aVar2.a();
                if (h1Var != null) {
                    h1Var.a();
                }
                return a0.a;
            case 2:
                j71.e eVar = (j71.e) this.s;
                gh.f fVar = (gh.f) this.t;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                eVar.s(fVar.a, bool);
                return a0.a;
            case 3:
                l lVar = (l) this.s;
                n nVar = (n) this.t;
                long j = ((i0) obj).a;
                long g = lVar.k1() ? c2.b.g(-1.0f, j) : c2.b.g(1.0f, j);
                n.a(nVar, lVar.Z.e(Float.intBitsToFloat((int) (lVar.a0 == b2.r ? g & 4294967295L : g >> 32))));
                return a0.a;
            case 4:
                ((androidx.compose.foundation.lazy.layout.n) this.s).a.k((u) this.t);
                return a0.a;
            case 5:
                a1 a1Var = (a1) this.s;
                f1 f1Var = (f1) this.t;
                long j2 = ((i0) obj).a;
                long g2 = f1Var.e0 ? c2.b.g(-1.0f, j2) : c2.b.g(1.0f, j2);
                b2 b2Var = f1Var.a0;
                o oVar = d1.a;
                a1Var.a(Float.intBitsToFloat((int) (b2Var == b2.r ? g2 & 4294967295L : g2 >> 32)));
                return a0.a;
            case 6:
                a3 a3Var = (a3) this.s;
                c3 c3Var = (c3) this.t;
                i0 i0Var = (i0) obj;
                float f = i0Var.b ? -1.0f : 1.0f;
                long j3 = i0Var.a;
                a3Var.a(1, c2.b.g(f, c3Var.d == b2.s ? c2.b.b(j3, 0.0f, 0.0f, 1) : c2.b.b(j3, 0.0f, 0.0f, 2)));
                return a0.a;
            case 7:
                p3 p3Var = (p3) this.s;
                j71.c cVar2 = (j71.c) this.t;
                ((Long) obj).longValue();
                float f2 = p3Var.e;
                p3Var.e = 0.0f;
                cVar2.k(Float.valueOf(f2));
                return a0.a;
            case 8:
                u0 u0Var = (u0) this.s;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.t;
                if (((v) obj) == v.ON_RESUME) {
                    u0Var.d(accessibilityManager);
                }
                return a0.a;
            case 9:
                b0.z((z) this.s, (a71.h) null, (v71.a0Shadow) null, new gi.b((b2.e0) obj, (ic) this.t, null, 7), 3);
                return a0.a;
            case 10:
                d2.a0Shadow.l((f2.d) obj, (d2.a0Shadow) this.s, ((ib) this.t).a());
                return a0.a;
            case 11:
                i3 i3Var = (i3) this.s;
                androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) this.t;
                c2.e eVar2 = (c2.e) obj;
                float floatValue = ((Number) i3Var.getValue()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (eVar2.a >> 32)) * floatValue;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (eVar2.a & 4294967295L)) * floatValue;
                if (Float.intBitsToFloat((int) (((c2.e) f1Var2.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((c2.e) f1Var2.getValue()).a & 4294967295L)) != intBitsToFloat2) {
                    f1Var2.setValue(new c2.e((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)));
                }
                return a0.a;
            case 12:
                a2.e eVar3 = (a2.e) obj;
                return eVar3.c(new a2.d(0, new d(i3, ((p0) this.s).a(eVar3.r.a(), eVar3.r.getLayoutDirection(), eVar3), (ib) this.t)));
            case 13:
                a7 a7Var = (s7) obj;
                return ((a7Var instanceof a7) && k71.k.b(a7Var.d.getId(), (String) this.s)) ? (a7) this.t : a7Var;
            case 14:
                Context context = (Context) this.s;
                String str3 = (String) this.t;
                int i5 = jb.c.v;
                k71.k.g((String) obj, "it");
                WebViewActivity.Companion.getClass();
                context.startActivity(WebViewActivity.a.a(context, str3, (String) null));
                return a0.a;
            case 15:
                k3.j jVar = (k3.j) this.s;
                c0 c0Var = (c0) this.t;
                j71.c cVar3 = (j71.c) obj;
                k3.n nVar2 = jVar.d;
                a7.d dVar = jVar.a;
                r rVar = jVar.f;
                nVar2.getClass();
                k3.l lVar2 = c0Var.a;
                if (lVar2 instanceof k3.l) {
                    List list = lVar2.u;
                    s sVar = c0Var.b;
                    int i6 = c0Var.c;
                    ArrayList arrayList2 = new ArrayList(list.size());
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        Object obj3 = list.get(i7);
                        k3.z zVar = (k3.z) obj3;
                        if (k71.k.b(zVar.b, sVar) && zVar.c == i6) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            Object obj4 = list.get(i8);
                            if (((k3.z) obj4).c == i6) {
                                arrayList3.add(obj4);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            list = arrayList3;
                        }
                        int a2 = sVar.a(s.s);
                        int i9 = sVar.r;
                        if (a2 < 0) {
                            int size3 = list.size();
                            s sVar2 = null;
                            s sVar3 = null;
                            int i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    s sVar4 = ((k3.z) list.get(i11)).b;
                                    int i12 = sVar4.r;
                                    if (k71.k.h(i12, i9) < 0) {
                                        if (sVar2 == null || k71.k.h(i12, sVar2.r) > 0) {
                                            sVar2 = sVar4;
                                        }
                                    } else if (k71.k.h(i12, i9) <= 0) {
                                        sVar2 = sVar4;
                                        sVar3 = sVar2;
                                    } else if (sVar3 == null || k71.k.h(i12, sVar3.r) < 0) {
                                        sVar3 = sVar4;
                                    }
                                    i11++;
                                }
                            }
                            if (sVar2 == null) {
                                sVar2 = sVar3;
                            }
                            arrayList2 = new ArrayList(list.size());
                            int size4 = list.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                Object obj5 = list.get(i13);
                                if (k71.k.b(((k3.z) obj5).b, sVar2)) {
                                    arrayList2.add(obj5);
                                }
                            }
                        } else {
                            s sVar5 = s.t;
                            if (sVar.a(sVar5) > 0) {
                                int size5 = list.size();
                                s sVar6 = null;
                                s sVar7 = null;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size5) {
                                        s sVar8 = ((k3.z) list.get(i14)).b;
                                        int i15 = sVar8.r;
                                        if (k71.k.h(i15, i9) < 0) {
                                            if (sVar6 == null || k71.k.h(i15, sVar6.r) > 0) {
                                                sVar6 = sVar8;
                                            }
                                        } else if (k71.k.h(i15, i9) <= 0) {
                                            sVar6 = sVar8;
                                            sVar7 = sVar6;
                                        } else if (sVar7 == null || k71.k.h(i15, sVar7.r) < 0) {
                                            sVar7 = sVar8;
                                        }
                                        i14++;
                                    }
                                }
                                if (sVar7 != null) {
                                    sVar6 = sVar7;
                                }
                                arrayList2 = new ArrayList(list.size());
                                int size6 = list.size();
                                for (int i16 = 0; i16 < size6; i16++) {
                                    Object obj6 = list.get(i16);
                                    if (k71.k.b(((k3.z) obj6).b, sVar6)) {
                                        arrayList2.add(obj6);
                                    }
                                }
                            } else {
                                int size7 = list.size();
                                s sVar9 = null;
                                s sVar10 = null;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < size7) {
                                        s sVar11 = ((k3.z) list.get(i17)).b;
                                        int i18 = size7;
                                        if (k71.k.h(sVar11.r, sVar5.r) <= 0) {
                                            int i19 = sVar11.r;
                                            if (k71.k.h(i19, i9) < 0) {
                                                if (sVar9 == null || k71.k.h(i19, sVar9.r) > 0) {
                                                    sVar9 = sVar11;
                                                }
                                            } else if (k71.k.h(i19, i9) <= 0) {
                                                sVar9 = sVar11;
                                                sVar10 = sVar9;
                                            } else if (sVar10 == null || k71.k.h(i19, sVar10.r) < 0) {
                                                sVar10 = sVar11;
                                            }
                                        }
                                        i17++;
                                        size7 = i18;
                                    }
                                }
                                if (sVar10 != null) {
                                    sVar9 = sVar10;
                                }
                                ArrayList arrayList4 = new ArrayList(list.size());
                                int size8 = list.size();
                                for (int i21 = 0; i21 < size8; i21++) {
                                    Object obj7 = list.get(i21);
                                    if (k71.k.b(((k3.z) obj7).b, sVar9)) {
                                        arrayList4.add(obj7);
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    s sVar12 = s.t;
                                    int size9 = list.size();
                                    s sVar13 = null;
                                    s sVar14 = null;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 < size9) {
                                            s sVar15 = ((k3.z) list.get(i22)).b;
                                            if (sVar12 != null) {
                                                i = size9;
                                                if (k71.k.h(sVar15.r, sVar12.r) < 0) {
                                                    continue;
                                                    i22++;
                                                    size9 = i;
                                                }
                                            } else {
                                                i = size9;
                                            }
                                            int i23 = sVar15.r;
                                            if (k71.k.h(i23, i9) < 0) {
                                                if (sVar13 == null || k71.k.h(i23, sVar13.r) > 0) {
                                                    sVar13 = sVar15;
                                                }
                                            } else if (k71.k.h(i23, i9) <= 0) {
                                                sVar13 = sVar15;
                                                sVar14 = sVar13;
                                            } else if (sVar14 == null || k71.k.h(i23, sVar14.r) < 0) {
                                                sVar14 = sVar15;
                                            }
                                            i22++;
                                            size9 = i;
                                        }
                                    }
                                    if (sVar14 != null) {
                                        sVar13 = sVar14;
                                    }
                                    arrayList2 = new ArrayList(list.size());
                                    int size10 = list.size();
                                    for (int i24 = 0; i24 < size10; i24++) {
                                        Object obj8 = list.get(i24);
                                        if (k71.k.b(((k3.z) obj8).b, sVar13)) {
                                            arrayList2.add(obj8);
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList4;
                                }
                            }
                        }
                    }
                    a5.s sVar16 = nVar2.a;
                    if (arrayList2.size() > 0) {
                        k3.z zVar2 = (k3.z) arrayList2.get(0);
                        zVar2.getClass();
                        synchronized (((c30.d) sVar16.s)) {
                            try {
                                dVar.getClass();
                                k3.e eVar4 = new k3.e(zVar2);
                                k3.d dVar2 = (k3.d) ((z1) sVar16.t).h(eVar4);
                                if (dVar2 == null) {
                                    dVar2 = (k3.d) ((h0) sVar16.u).g(eVar4);
                                }
                                if (dVar2 != null) {
                                    obj2 = dVar2.a;
                                } else {
                                    try {
                                        k = dVar.i(zVar2);
                                    } catch (Exception unused) {
                                        k = rVar.k(c0Var);
                                    }
                                    sVar16.getClass();
                                    dVar.getClass();
                                    k3.e eVar5 = new k3.e(zVar2);
                                    synchronized (((c30.d) sVar16.s)) {
                                        try {
                                            if (k == null) {
                                                ((h0) sVar16.u).m(eVar5, new k3.d((Object) null));
                                            } else {
                                                ((z1) sVar16.t).l(eVar5, new k3.d(k));
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    obj2 = k;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        if (obj2 == null) {
                            obj2 = rVar.k(c0Var);
                        }
                        kVar = new k((Object) null, b91.g.R(c0Var.d, obj2, zVar2, c0Var.b, c0Var.c));
                    } else {
                        kVar = new k((Object) null, rVar.k(c0Var));
                    }
                    List list2 = (List) kVar.r;
                    Object obj9 = kVar.s;
                    if (list2 == null) {
                        d0Var = new e0(obj9, true);
                    } else {
                        k3.c cVar4 = new k3.c(list2, obj9, c0Var, nVar2.a, cVar3, dVar);
                        b0.z(nVar2.b, (a71.h) null, v71.a0Shadow.u, new g0(cVar4, (a71.c) null, 22), 1);
                        d0Var = new d0(cVar4);
                    }
                } else {
                    d0Var = null;
                }
                if (d0Var != null) {
                    return d0Var;
                }
                x xVar = (x) jVar.e.s;
                k3.u uVar = c0Var.a;
                int i25 = c0Var.c;
                s sVar17 = c0Var.b;
                if (uVar == null || (uVar instanceof k3.f)) {
                    a = xVar.a(sVar17, i25);
                } else {
                    if (!(uVar instanceof k3.u)) {
                        e0Var = null;
                        if (e0Var == null) {
                            return e0Var;
                        }
                        throw new IllegalStateException("Could not load font");
                    }
                    a = xVar.b(uVar, sVar17, i25);
                }
                e0Var = new e0(a, true);
                if (e0Var == null) {
                }
                break;
            case 16:
                e51.a aVar3 = (e51.a) this.s;
                c0 c0Var2 = (c0) this.t;
                f0 f0Var = (f0) obj;
                synchronized (((c30.d) aVar3.s)) {
                    try {
                        if (f0Var.c()) {
                        }
                    } finally {
                    }
                }
                return a0.a;
            case 17:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.s;
                x71.hShadow hVar = (x71.hShadow) this.t;
                a0 a0Var = a0.a;
                if (atomicBoolean.compareAndSet(false, true)) {
                    hVar.j(a0Var);
                }
                return a0Var;
            case 18:
                w wVar = (w) this.s;
                n0.n nVar3 = (n0.n) this.t;
                n0.v c = wVar.c(((Integer) obj).intValue());
                int i26 = c.a;
                List list3 = c.b;
                ArrayList arrayList5 = new ArrayList(list3.size());
                int size11 = list3.size();
                int i27 = 0;
                while (i4 < size11) {
                    int i28 = (int) ((n0.d) list3.get(i4)).a;
                    arrayList5.add(new k(Integer.valueOf(i26), new s3.a(nVar3.a(i27, i28))));
                    i26++;
                    i27 += i28;
                    i4++;
                }
                return arrayList5;
            case 19:
                n0.n nVar4 = (n0.n) this.s;
                m mVar = (m) this.t;
                int intValue = ((Integer) obj).intValue();
                w wVar2 = nVar4.e;
                int i29 = wVar2.f;
                int g3 = wVar2.g(intValue);
                return mVar.A(intValue, 0, g3, mVar.v, nVar4.a(0, g3));
            case 20:
                t tVar = (t) this.s;
                androidx.compose.runtime.f1 f1Var3 = (androidx.compose.runtime.f1) this.t;
                String str4 = (String) obj;
                k71.k.g(str4, "it");
                tVar.Q();
                f1Var3.setValue(str4);
                String str5 = (String) f1Var3.getValue();
                k71.k.g(str5, "value");
                if (p.I(str5, "../", false) || p.I(str5, "./", false)) {
                    y1 y1Var = tVar.u;
                    g1.a aVar4 = g1.Companion;
                    z.c cVar5 = z.c.a;
                    aVar4.getClass();
                    t1 t1Var = new t1(cVar5);
                    y1Var.getClass();
                    y1Var.k((Object) null, t1Var);
                } else {
                    tVar.Q();
                }
                return a0.a;
            case 21:
                androidx.compose.runtime.f1 f1Var4 = (androidx.compose.runtime.f1) this.s;
                k1 k1Var = (k1) obj;
                bm.f fVar2 = new bm.f(i3, (ArrayList) this.t);
                k1Var.r = true;
                fVar2.k(k1Var);
                k1Var.r = false;
                f1Var4.getValue();
                return a0.a;
            case 22:
                x71.s sVar18 = (x71.t) this.s;
                oa.m mVar2 = (oa.m) this.t;
                List<Account> list4 = (List) obj;
                ArrayList arrayList6 = new ArrayList(x61.n.F(list4, 10));
                for (Account account : list4) {
                    r71.e[] eVarArr = oa.m.m;
                    arrayList6.add(mVar2.d(account));
                }
                Object t = q.t(sVar18, arrayList6);
                if (t instanceof x71.n) {
                    sVar18.e(x71.o.a(t));
                }
                return new x71.o(t);
            case 23:
                Date date = (Date) this.s;
                Calendar calendar = (Calendar) this.t;
                t71.l lVar3 = (t71.l) obj;
                k71.k.g(lVar3, "matchResult");
                SimpleDateFormat simpleDateFormat = p10.c.b;
                String str6 = (String) lVar3.a().get(1);
                String str7 = (String) lVar3.a().get(2);
                String str8 = (String) lVar3.a().get(3);
                calendar.setTime(date);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                if (str6.length() == 0 || str7.length() == 0 || str8.length() == 0) {
                    peVar = simpleDateFormat.format(calendar.getTime());
                } else {
                    p10.b.Companion.getClass();
                    p10.b[] values = p10.b.values();
                    int length = values.length;
                    while (true) {
                        if (i4 < length) {
                            bVar = values[i4];
                            if (!bVar.r.equals(str8)) {
                                i4++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar != null) {
                        int i31 = str6.equals("+") ? 1 : -1;
                        Integer G = t71.w.G(str7);
                        if (G != null) {
                            calendar.add(bVar.s, i31 * G.intValue());
                            peVar = simpleDateFormat.format(calendar.getTime());
                        }
                    }
                }
                return peVar != null ? peVar : lVar3.c();
            case 24:
                ((pc.q) this.s).w.M((DiscussionCategoryData) this.t);
                return a0.a;
            case 25:
                mn.d dVar3 = (mn.d) this.s;
                ReRunJobBottomSheet reRunJobBottomSheet = (ReRunJobBottomSheet) this.t;
                m0.f fVar3 = (m0.f) obj;
                k71.k.g(fVar3, "$this$LazyColumn");
                m0.f.q(fVar3, (String) null, new r1.d(new com.github.rudroid.utilities.ui.emojipicker.d(i2, reRunJobBottomSheet), true, -1827479707), 3);
                m0.f.q(fVar3, (String) null, ra.b.a, 3);
                if (dVar3.b.a == mn.k.s && (str = dVar3.a) != null) {
                    m0.f.q(fVar3, (String) null, new r1.d(new com.github.rudroid.settings.codeoptions.g(23, reRunJobBottomSheet, str), true, -1776654432), 3);
                }
                if (dVar3.b.a == mn.k.t) {
                    m0.f.q(fVar3, (String) null, new r1.d(new com.github.rudroid.utilities.ui.emojipicker.d(15, dVar3), true, -1458805449), 3);
                }
                return a0.a;
            case 26:
                String str9 = (String) this.s;
                na naVar = (na) this.t;
                me meVar = (me) obj;
                k71.k.g(meVar, "cached");
                qe qeVar = meVar.a;
                if (qeVar != null) {
                    ne neVar = qeVar.b;
                    if (neVar != null) {
                        pe peVar2 = neVar.c;
                        if (peVar2 != null) {
                            x0 x0Var = peVar2.c;
                            j0 j0Var2 = x0Var.n;
                            if (j0Var2 != null) {
                                List list5 = j0Var2.a;
                                if (list5 != null) {
                                    ArrayList S = x61.m.S(list5);
                                    arrayList = new ArrayList(x61.n.F(S, 10));
                                    int size12 = S.size();
                                    while (i4 < size12) {
                                        Object obj10 = S.get(i4);
                                        i4++;
                                        o0 o0Var = (o0) obj10;
                                        if (o0Var.b.equals(str9)) {
                                            o0Var = new o0(naVar, o0Var.b);
                                        }
                                        arrayList.add(o0Var);
                                    }
                                } else {
                                    arrayList = null;
                                }
                                j0Var = new j0(arrayList);
                            } else {
                                j0Var = null;
                            }
                            peVar = pe.a(peVar2, x0.a(x0Var, (ri0.f0) null, j0Var, 24575));
                        }
                        peVar = ne.a(neVar, peVar);
                    }
                    peVar = qe.a(qeVar, peVar);
                }
                return new me(peVar);
            case 27:
                l3.v vVar = (l3.v) this.s;
                j71.c cVar6 = (j71.c) this.t;
                l3.v vVar2 = (l3.v) obj;
                if (!k71.k.b(vVar, vVar2)) {
                    cVar6.k(vVar2);
                }
                return a0.a;
            case 28:
                s0.o0 o0Var2 = (s0.o0) this.s;
                d2.p pVar = (d2.p) this.t;
                v2.i0 i0Var2 = (v2.i0) obj;
                i0Var2.c();
                if (((Boolean) o0Var2.s.getValue()).booleanValue() || ((Boolean) o0Var2.t.getValue()).booleanValue()) {
                    f2.d.u(i0Var2, pVar, 0L, 0L, 0.0f, (f2.e) null, 0, 126);
                }
                return a0.a;
            default:
                k1 k1Var2 = (k1) obj;
                ArrayList o = s0.s.o((List) this.s, (j71.a) ((p9) this.t).b);
                if (o != null) {
                    int size13 = o.size();
                    while (i4 < size13) {
                        k kVar2 = (k) o.get(i4);
                        l1 l1Var = (l1) kVar2.r;
                        j71.a aVar5 = (j71.a) kVar2.s;
                        k1.k(k1Var2, l1Var, aVar5 != null ? ((s3.j) aVar5.a()).a : 0L);
                        i4++;
                    }
                }
                return a0.a;
        }
    }

    public /* synthetic */ d(ob obVar, w1 w1Var, androidx.compose.runtime.f1 f1Var) {
        this.r = 11;
        this.s = w1Var;
        this.t = f1Var;
    }

}
