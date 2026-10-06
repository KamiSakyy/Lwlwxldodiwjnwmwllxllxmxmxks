package an;

import a0.q0;
import aa.r0;
import aa.s0;
import android.graphics.Color;
import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.f1;
import cn.s;
import com.github.service.models.HideCommentReason;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import f1.j2;
import g3.p0;
import h1.b0;
import h1.g0;
import h1.u;
import h1.z;
import ik.l0;
import ja.o;
import java.io.Serializable;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import k71.w;
import kotlin.NoWhenBranchMatchedException;
import l3.v;
import sy.d0Shadow;
import sy.e0;
import sy.f0;
import sy.y;
import v2.d1;
import w61.a0;
import x61.n;
import yz0.a7;
import yz0.b6;
import yz0.e2;
import yz0.e7;
import yz0.j7;
import yz0.k2;
import yz0.n7;
import yz0.o6;
import yz0.o7;
import yz0.q6;
import yz0.r3;
import yz0.s7;
import yz0.t5;
import yz0.u5;
import yz0.w7;
import yz0.x2;
import yz0.x7;
import yz0.y7;
import yz0.z7;
import z01.p;
import zk.b1;
import zk.b2;
import zk.m1;
import zk.x1;
import zk.y1;
import zk.z1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends c71.j implements j71.e {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Serializable serializable, Object obj, Object obj2, Serializable serializable2, Object obj3, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.w = serializable;
        this.z = obj;
        this.x = obj2;
        this.y = serializable2;
        this.A = obj3;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                d dVar = new d((eShadow) this.z, (oa.j) this.x, (String) this.y, (com.github.rudroid.viewmodels.tasklist.c) this.A, cVar, 0);
                dVar.w = obj;
                return dVar;
            case 1:
                d dVar2 = new d((f) this.z, (oa.j) this.x, (String) this.y, (com.github.rudroid.viewmodels.tasklist.c) this.A, cVar, 1);
                dVar2.w = obj;
                return dVar2;
            case 2:
                d dVar3 = new d((kShadow) this.z, (oa.j) this.x, (String) this.y, (com.github.rudroid.viewmodels.tasklist.c) this.A, cVar, 2);
                dVar3.w = obj;
                return dVar3;
            case 3:
                return new d((bj.b) this.w, (oa.j) this.x, (String) this.y, (String) this.z, (HideCommentReason) this.A, cVar, 3);
            case 4:
                return new d((Long) this.w, (z) this.z, (g0) this.x, (Locale) this.y, (f1) this.A, cVar, 4);
            case 5:
                return new d((l0) this.w, (oa.j) this.x, (String) this.y, (Set) this.z, (Set) this.A, cVar, 5);
            case 6:
                d dVar4 = new d((w) this.z, (o) this.x, (aa.d) this.y, (aa.w) this.A, cVar, 6);
                dVar4.w = obj;
                return dVar4;
            case 7:
                return new d((w) this.w, (String) this.y, (kj.g) this.z, (oa.j) this.x, (r3) this.A, cVar, 7);
            case 8:
                return new d((w) this.w, (String) this.y, (kj.g0) this.z, (oa.j) this.x, (r3) this.A, cVar, 8);
            case 9:
                d dVar5 = new d((ml.o) this.z, (oa.j) this.x, (String) this.y, (String) this.A, cVar, 9);
                dVar5.w = obj;
                return dVar5;
            case 10:
                d dVar6 = new d((p0.g) this.z, (d1) this.x, (a2.b) this.y, (com.github.rudroid.actions.workflowruns.ui.e) this.A, cVar, 10);
                dVar6.w = obj;
                return dVar6;
            case 11:
                return new d((zk.h) this.w, (oa.j) this.x, (String) this.y, (CloseReason) this.z, (p) this.A, cVar, 11);
            case 12:
                return new d((Serializable) this.w, this.z, this.x, (Serializable) this.y, this.A, cVar, 12);
            case 13:
                d dVar7 = new d((b1) this.z, (oa.j) this.x, (String) this.y, (List) this.A, cVar, 13);
                dVar7.w = obj;
                return dVar7;
            case 14:
                return new d((m1) this.w, (oa.j) this.x, (String) this.y, (Set) this.z, (Set) this.A, cVar, 14);
            case 15:
                return new d((Set) this.w, (Set) this.z, (x1) this.A, (oa.j) this.x, (String) this.y, cVar, 15);
            default:
                return new d((Set) this.w, (Set) this.z, (z1) this.A, (oa.j) this.x, (String) this.y, cVar, 16);
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (String) obj).v(a0.a);
            case 1:
                return r((a71.c) obj2, (String) obj).v(a0.a);
            case 2:
                return r((a71.c) obj2, (String) obj).v(a0.a);
            case 3:
                d r = r((a71.c) obj2, (a0) obj);
                a0 a0Var = a0.a;
                r.v(a0Var);
                return a0Var;
            case 4:
                d r2 = r((a71.c) obj2, (v71.z) obj);
                a0 a0Var2 = a0.a;
                r2.v(a0Var2);
                return a0Var2;
            case 5:
                d r3 = r((a71.c) obj2, (List) obj);
                a0 a0Var3 = a0.a;
                r3.v(a0Var3);
                return a0Var3;
            case 6:
                d r4 = r((a71.c) obj2, (aa.f) obj);
                a0 a0Var4 = a0.a;
                r4.v(a0Var4);
                return a0Var4;
            case 7:
                d r5 = r((a71.c) obj2, (y71.j) obj);
                a0 a0Var5 = a0.a;
                r5.v(a0Var5);
                return a0Var5;
            case 8:
                d r6 = r((a71.c) obj2, (y71.j) obj);
                a0 a0Var6 = a0.a;
                r6.v(a0Var6);
                return a0Var6;
            case 9:
                d r7 = r((a71.c) obj2, (p01.j) obj);
                a0 a0Var7 = a0.a;
                r7.v(a0Var7);
                return a0Var7;
            case 10:
                return r((a71.c) obj2, (v71.z) obj).v(a0.a);
            case 11:
                d r8 = r((a71.c) obj2, (x7) obj);
                a0 a0Var8 = a0.a;
                r8.v(a0Var8);
                return a0Var8;
            case 12:
                d r9 = r((a71.c) obj2, (y71.j) obj);
                a0 a0Var9 = a0.a;
                r9.v(a0Var9);
                return a0Var9;
            case 13:
                d r11 = r((a71.c) obj2, (z7) obj);
                a0 a0Var10 = a0.a;
                r11.v(a0Var10);
                return a0Var10;
            case 14:
                d r12 = r((a71.c) obj2, (a0) obj);
                a0 a0Var11 = a0.a;
                r12.v(a0Var11);
                return a0Var11;
            case 15:
                d r13 = r((a71.c) obj2, (w7) obj);
                a0 a0Var12 = a0.a;
                r13.v(a0Var12);
                return a0Var12;
            default:
                d r14 = r((a71.c) obj2, (y7) obj);
                a0 a0Var13 = a0.a;
                r14.v(a0Var13);
                return a0Var13;
        }
    }

    public final Object v(Object obj) {
        int i;
        int i2;
        cn.kShadow kVar;
        cn.kShadow kVar2;
        String str;
        int i3 = this.v;
        a0 a0Var = a0.a;
        Object obj2 = this.y;
        Object obj3 = this.A;
        Object obj4 = this.x;
        Object obj5 = this.z;
        switch (i3) {
            case 0:
                String str2 = (String) this.w;
                b71.a aVar = b71.a.r;
                y.j(obj);
                return ((eShadow) obj5).a.a((oa.j) obj4, (String) obj2, str2, (com.github.rudroid.viewmodels.tasklist.c) obj3);
            case 1:
                String str3 = (String) this.w;
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                return y1.a(((f) obj5).a, (oa.j) obj4, (String) obj2, str3, (com.github.rudroid.viewmodels.tasklist.c) obj3);
            case 2:
                String str4 = (String) this.w;
                b71.a aVar3 = b71.a.r;
                y.j(obj);
                return b2.a(((kShadow) obj5).a, (oa.j) obj4, (String) obj2, null, str4, (com.github.rudroid.viewmodels.tasklist.c) obj3, 108);
            case 3:
                b71.a aVar4 = b71.a.r;
                y.j(obj);
                ((s) ((bj.b) this.w).b.a((oa.j) obj4)).g(new q0(17, (String) obj5, (HideCommentReason) obj3), (String) obj2);
                return a0Var;
            case 4:
                b71.a aVar5 = b71.a.r;
                y.j(obj);
                Long l = (Long) this.w;
                if (l != null) {
                    f1 f1Var = (f1) obj3;
                    long longValue = l.longValue();
                    String str5 = ((g0) obj4).c;
                    ZoneId zoneId = b0.e;
                    String format = Instant.ofEpochMilli(longValue).atZone(b0.e).toLocalDate().format(h1.j.m(str5, (Locale) obj2, ((z) ((z) obj5)).b));
                    v vVar = new v(4, format.length() == 0 ? p0.b : g3.g0.b(format.length(), format.length()), format);
                    f2 f2Var = j2.a;
                    f1Var.setValue(vVar);
                }
                return a0Var;
            case 5:
                b71.a aVar6 = b71.a.r;
                y.j(obj);
                l0 l0Var = (l0) this.w;
                oa.j jVar = (oa.j) obj4;
                String str6 = (String) obj2;
                Set set = (Set) obj5;
                Set set2 = (Set) obj3;
                Set l2 = f0.l(set, set2);
                Set l3 = f0.l(set2, set);
                Set<k2> set3 = l2;
                ArrayList arrayList = new ArrayList(n.F(set3, 10));
                for (k2 k2Var : set3) {
                    com.github.service.models.response.a aVar7 = new com.github.service.models.response.a(jVar.c, (Avatar) null, (String) null, false, (String) null, 62);
                    String name = k2Var.getName();
                    String J = k2Var.J();
                    k71.k.g(name, "labelName");
                    k71.k.g(J, "_colorString");
                    try {
                        if (!t71.w.F(J, "#", false)) {
                            J = "#".concat(J);
                        }
                        i2 = Color.parseColor(J);
                    } catch (Exception unused) {
                        i2 = -16777216;
                    }
                    ZonedDateTime now = ZonedDateTime.now();
                    k71.k.f(now, "now(...)");
                    arrayList.add(new o7(aVar7, name, i2, now));
                }
                Set set4 = l3;
                ArrayList arrayList2 = new ArrayList(n.F(set4, 10));
                Iterator it = set4.iterator();
                while (it.hasNext()) {
                    k2 k2Var2 = (k2) it.next();
                    com.github.service.models.response.a aVar8 = new com.github.service.models.response.a(jVar.c, (Avatar) null, (String) null, false, (String) null, 62);
                    String name2 = k2Var2.getName();
                    String J2 = k2Var2.J();
                    k71.k.g(name2, "labelName");
                    k71.k.g(J2, "_colorString");
                    Iterator it2 = it;
                    try {
                        if (!t71.w.F(J2, "#", false)) {
                            J2 = "#".concat(J2);
                        }
                        i = Color.parseColor(J2);
                    } catch (Exception unused2) {
                        i = -16777216;
                    }
                    ZonedDateTime now2 = ZonedDateTime.now();
                    k71.k.f(now2, "now(...)");
                    arrayList2.add(new q6(aVar8, name2, i, now2));
                    it = it2;
                }
                ((s) l0Var.b.a(jVar)).b(str6, x61.m.l0(arrayList, arrayList2));
                return a0Var;
            case 6:
                b71.a aVar9 = b71.a.r;
                y.j(obj);
                r0 r0Var = ((aa.f) this.w).c;
                if (r0Var != null) {
                    androidx.lifecycle.b bVar = ((o) obj4).a;
                    s0 s0Var = ((aa.d) obj2).a;
                    k71.k.g(s0Var, "operation");
                    ((w) obj5).r = v8.l0.p(v8.l0.C(s0Var, r0Var, (aa.w) obj3, (ha.c) bVar.b).values());
                }
                return a0Var;
            case 7:
                b71.a aVar10 = b71.a.r;
                y.j(obj);
                w wVar = (w) this.w;
                String str7 = (String) obj2;
                if (str7 != null) {
                    final r3 r3Var = (r3) obj3;
                    final int i4 = 0;
                    kVar = ((s) ((kj.g) obj5).b.a((oa.j) obj4)).g(new j71.c() { // from class: kj.a
                        public final Object k(Object obj6) {
                            o6 o6Var;
                            o6 o6Var2;
                            o6 o6Var3 = (s7) obj6;
                            switch (i4) {
                                case 0:
                                    k71.k.g(o6Var3, "item");
                                    boolean z = o6Var3 instanceof o6;
                                    r3 r3Var2 = r3Var;
                                    if (z) {
                                        o6Var = o6Var3;
                                        if (k71.k.b(o6Var.a.getId(), r3Var2.b)) {
                                            return o6.a(o6Var, (yz0.s) null, sy.f0.y(o6Var.b, sy.f0.a(r3Var2)), false, (x2) null, false, false, 125);
                                        }
                                    } else {
                                        if (!(o6Var3 instanceof a7)) {
                                            return o6Var3;
                                        }
                                        o6Var = (a7) o6Var3;
                                        if (k71.k.b(((a7) o6Var).d.getId(), r3Var2.b)) {
                                            return a7.a(o6Var, (yz0.s) null, sy.f0.y(((a7) o6Var).e, sy.f0.a(r3Var2)), false, false, false, 1007);
                                        }
                                    }
                                    return o6Var;
                                default:
                                    k71.k.g(o6Var3, "item");
                                    boolean z2 = o6Var3 instanceof o6;
                                    r3 r3Var3 = r3Var;
                                    if (z2) {
                                        o6Var2 = o6Var3;
                                        if (k71.k.b(o6Var2.a.getId(), r3Var3.b)) {
                                            return o6.a(o6Var2, (yz0.s) null, sy.f0.y(o6Var2.b, sy.f0.p(r3Var3)), false, (x2) null, false, false, 125);
                                        }
                                    } else {
                                        if (!(o6Var3 instanceof a7)) {
                                            return o6Var3;
                                        }
                                        o6Var2 = (a7) o6Var3;
                                        if (k71.k.b(((a7) o6Var2).d.getId(), r3Var3.b)) {
                                            return a7.a(o6Var2, (yz0.s) null, sy.f0.y(((a7) o6Var2).e, sy.f0.p(r3Var3)), false, false, false, 1007);
                                        }
                                    }
                                    return o6Var2;
                            }
                        }
                    }, str7);
                } else {
                    kVar = null;
                }
                wVar.r = kVar;
                return a0Var;
            case 8:
                b71.a aVar11 = b71.a.r;
                y.j(obj);
                w wVar2 = (w) this.w;
                String str8 = (String) obj2;
                if (str8 != null) {
                    final r3 r3Var2 = (r3) obj3;
                    final int i5 = 1;
                    kVar2 = ((s) ((kj.g0) obj5).b.a((oa.j) obj4)).g(new j71.c() { // from class: kj.a
                        public final Object k(Object obj6) {
                            o6 o6Var;
                            o6 o6Var2;
                            o6 o6Var3 = (s7) obj6;
                            switch (i5) {
                                case 0:
                                    k71.k.g(o6Var3, "item");
                                    boolean z = o6Var3 instanceof o6;
                                    r3 r3Var22 = r3Var2;
                                    if (z) {
                                        o6Var = o6Var3;
                                        if (k71.k.b(o6Var.a.getId(), r3Var22.b)) {
                                            return o6.a(o6Var, (yz0.s) null, sy.f0.y(o6Var.b, sy.f0.a(r3Var22)), false, (x2) null, false, false, 125);
                                        }
                                    } else {
                                        if (!(o6Var3 instanceof a7)) {
                                            return o6Var3;
                                        }
                                        o6Var = (a7) o6Var3;
                                        if (k71.k.b(((a7) o6Var).d.getId(), r3Var22.b)) {
                                            return a7.a(o6Var, (yz0.s) null, sy.f0.y(((a7) o6Var).e, sy.f0.a(r3Var22)), false, false, false, 1007);
                                        }
                                    }
                                    return o6Var;
                                default:
                                    k71.k.g(o6Var3, "item");
                                    boolean z2 = o6Var3 instanceof o6;
                                    r3 r3Var3 = r3Var2;
                                    if (z2) {
                                        o6Var2 = o6Var3;
                                        if (k71.k.b(o6Var2.a.getId(), r3Var3.b)) {
                                            return o6.a(o6Var2, (yz0.s) null, sy.f0.y(o6Var2.b, sy.f0.p(r3Var3)), false, (x2) null, false, false, 125);
                                        }
                                    } else {
                                        if (!(o6Var3 instanceof a7)) {
                                            return o6Var3;
                                        }
                                        o6Var2 = (a7) o6Var3;
                                        if (k71.k.b(((a7) o6Var2).d.getId(), r3Var3.b)) {
                                            return a7.a(o6Var2, (yz0.s) null, sy.f0.y(((a7) o6Var2).e, sy.f0.p(r3Var3)), false, false, false, 1007);
                                        }
                                    }
                                    return o6Var2;
                            }
                        }
                    }, str8);
                } else {
                    kVar2 = null;
                }
                wVar2.r = kVar2;
                return a0Var;
            case 9:
                p01.j jVar2 = (p01.j) this.w;
                b71.a aVar12 = b71.a.r;
                y.j(obj);
                if (jVar2.o) {
                    gk.l lVar = ((ml.o) obj5).b;
                    String str9 = (String) obj2;
                    String str10 = (String) obj3;
                    lVar.getClass();
                    k71.k.g(str9, "owner");
                    k71.k.g(str10, "repository");
                    v71.b0.z(lVar.b, (a71.h) null, (v71.a0Shadow) null, new a0.h(lVar, (oa.j) obj4, str9, str10, (a71.c) null, 23), 3);
                }
                return a0Var;
            case 10:
                b71.a aVar13 = b71.a.r;
                y.j(obj);
                v71.z zVar = (v71.z) this.w;
                p0.g gVar = (p0.g) obj5;
                v71.b0.z(zVar, (a71.h) null, (v71.a0Shadow) null, new u(gVar, (d1) obj4, (a2.b) obj2, (a71.c) null, 18), 3);
                return v71.b0.z(zVar, (a71.h) null, (v71.a0Shadow) null, new gi.b(gVar, (com.github.rudroid.actions.workflowruns.ui.e) obj3, null, 29), 3);
            case 11:
                b71.a aVar14 = b71.a.r;
                y.j(obj);
                oa.j jVar3 = (oa.j) obj4;
                ((s) ((zk.h) this.w).b.a(jVar3)).a((String) obj2, new b6(new com.github.service.models.response.a(jVar3.c, (Avatar) null, (String) null, false, (String) null, 62), (k.w) null, (ZonedDateTime) null, (CloseReason) obj5, (p) obj3, 6));
                return a0Var;
            case 12:
                b71.a aVar15 = b71.a.r;
                y.j(obj);
                ((w) this.w).r = ((s) ((zk.k) obj5).b.a((oa.j) obj4)).g(new tj.b((String) obj3, 25), (String) obj2);
                return a0Var;
            case 13:
                z7 z7Var = (z7) this.w;
                b71.a aVar16 = b71.a.r;
                y.j(obj);
                oa.j jVar4 = (oa.j) obj4;
                s sVar = (s) ((b1) obj5).b.a(jVar4);
                String str11 = (String) obj2;
                ArrayList arrayList3 = z7Var.a;
                List list = (List) obj3;
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj6 = arrayList3.get(i6);
                    i6++;
                    if (list.contains(((e2) obj6).d)) {
                        arrayList4.add(obj6);
                    }
                }
                ArrayList arrayList5 = new ArrayList(n.F(arrayList4, 10));
                int size2 = arrayList4.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj7 = arrayList4.get(i7);
                    i7++;
                    e2 e2Var = (e2) obj7;
                    com.github.service.models.response.a a = hn.a.a(jVar4);
                    String str12 = e2Var.a.z;
                    e0 e0Var = e2Var.e;
                    if (k71.k.b(e0Var, yz0.f2.b)) {
                        str = z7Var.d;
                    } else {
                        if (!k71.k.b(e0Var, yz0.f2.d) && !k71.k.b(e0Var, yz0.f2.a) && !k71.k.b(e0Var, yz0.f2.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = null;
                    }
                    ZonedDateTime now3 = ZonedDateTime.now();
                    k71.k.f(now3, "now(...)");
                    arrayList5.add(new j7(a, str12, str, now3));
                }
                sVar.b(str11, arrayList5);
                return a0Var;
            case 14:
                b71.a aVar17 = b71.a.r;
                y.j(obj);
                m1 m1Var = (m1) this.w;
                oa.j jVar5 = (oa.j) obj4;
                String str13 = (String) obj2;
                Set set5 = (Set) obj5;
                Set set6 = (Set) obj3;
                m1Var.getClass();
                Set l4 = f0.l(set5, set6);
                Set l5 = f0.l(set6, set5);
                Set<yz0.f> set7 = l4;
                ArrayList arrayList6 = new ArrayList(n.F(set7, 10));
                for (yz0.f fVar : set7) {
                    com.github.service.models.response.a aVar18 = new com.github.service.models.response.a(jVar5.c, (Avatar) null, (String) null, false, (String) null, 62);
                    com.github.service.models.response.a aVar19 = new com.github.service.models.response.a(d0.j(fVar), fVar.e(), (String) null, false, (String) null, 60);
                    ZonedDateTime now4 = ZonedDateTime.now();
                    k71.k.f(now4, "now(...)");
                    arrayList6.add(new n7(aVar18, aVar19, now4));
                }
                Set<yz0.f> set8 = l5;
                ArrayList arrayList7 = new ArrayList(n.F(set8, 10));
                for (yz0.f fVar2 : set8) {
                    arrayList7.add(new u5(new com.github.service.models.response.a(jVar5.c, (Avatar) null, (String) null, false, (String) null, 62), new com.github.service.models.response.a(d0.j(fVar2), fVar2.e(), (String) null, false, (String) null, 60)));
                }
                ((s) m1Var.b.a(jVar5)).b(str13, x61.m.l0(arrayList6, arrayList7));
                return a0Var;
            case 15:
                b71.a aVar20 = b71.a.r;
                y.j(obj);
                Set set9 = (Set) this.w;
                Set set10 = (Set) obj5;
                Set<SimpleLegacyProject> l6 = f0.l(set9, set10);
                oa.j jVar6 = (oa.j) obj4;
                String str14 = jVar6.c;
                ArrayList arrayList8 = new ArrayList();
                for (SimpleLegacyProject simpleLegacyProject : l6) {
                    String str15 = simpleLegacyProject.u;
                    e7 e7Var = str15 != null ? new e7(str14, str15, simpleLegacyProject.r) : null;
                    if (e7Var != null) {
                        arrayList8.add(e7Var);
                    }
                }
                Set l7 = f0.l(set10, set9);
                ArrayList arrayList9 = new ArrayList(n.F(l7, 10));
                Iterator it3 = l7.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(new t5(str14, ((SimpleLegacyProject) it3.next()).r));
                }
                ((s) ((x1) obj3).b.a(jVar6)).b((String) obj2, x61.m.l0(arrayList8, arrayList9));
                return a0Var;
            default:
                b71.a aVar21 = b71.a.r;
                y.j(obj);
                Set set11 = (Set) this.w;
                Set set12 = (Set) obj5;
                Set<SimpleLegacyProject> l8 = f0.l(set11, set12);
                oa.j jVar7 = (oa.j) obj4;
                String str16 = jVar7.c;
                ArrayList arrayList10 = new ArrayList();
                for (SimpleLegacyProject simpleLegacyProject2 : l8) {
                    String str17 = simpleLegacyProject2.u;
                    e7 e7Var2 = str17 != null ? new e7(str16, str17, simpleLegacyProject2.r) : null;
                    if (e7Var2 != null) {
                        arrayList10.add(e7Var2);
                    }
                }
                Set l9 = f0.l(set12, set11);
                ArrayList arrayList11 = new ArrayList(n.F(l9, 10));
                Iterator it4 = l9.iterator();
                while (it4.hasNext()) {
                    arrayList11.add(new t5(str16, ((SimpleLegacyProject) it4.next()).r));
                }
                ((s) ((z1) obj3).b.a(jVar7)).b((String) obj2, x61.m.l0(arrayList10, arrayList11));
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.z = obj;
        this.x = obj2;
        this.y = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, oa.j jVar, String str, Object obj2, Object obj3, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.w = obj;
        this.x = jVar;
        this.y = str;
        this.z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Set set, Set set2, Object obj, oa.j jVar, String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.w = set;
        this.z = set2;
        this.A = obj;
        this.x = jVar;
        this.y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(w wVar, String str, Object obj, oa.j jVar, r3 r3Var, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.w = wVar;
        this.y = str;
        this.z = obj;
        this.x = jVar;
        this.A = r3Var;
    }
}
