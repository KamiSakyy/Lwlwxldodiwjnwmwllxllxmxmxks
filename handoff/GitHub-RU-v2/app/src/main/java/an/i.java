package an;

import android.content.ContentResolver;
import androidx.lifecycle.l1;
import b6.l0;
import b6.q0;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.measurement.internal.x3;
import go0.z;
import in.b1;
import in.c1;
import in.d0;
import in.j0;
import in.n0;
import in.s;
import in.t;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import q2.x;
import q81.c0;
import q81.q;
import q81.w;
import s0.u0;
import sy.f0;
import sy.y;
import t71.n;
import t71.p;
import v71.b0;
import w61.a0;
import yz0.a7;
import yz0.a8;
import yz0.b6;
import yz0.b7;
import yz0.d7;
import yz0.g7;
import yz0.o6;
import yz0.q7;
import yz0.s7;
import yz0.x2;
import yz0.x7;
import yz0.y7;
import zk.g1;
import zk.i1;
import zk.j1;
import zk.s1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = obj;
        this.y = obj2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                i iVar = new i((j) this.x, (oa.j) this.y, cVar, 0);
                iVar.w = obj;
                return iVar;
            case 1:
                i iVar2 = new i((String) this.x, (String) this.y, cVar, 1);
                iVar2.w = obj;
                return iVar2;
            case 2:
                i iVar3 = new i((s5.e) this.x, this.y, cVar, 2);
                iVar3.w = obj;
                return iVar3;
            case 3:
                i iVar4 = new i((z) this.x, (qn.g) this.y, cVar, 3);
                iVar4.w = obj;
                return iVar4;
            case 4:
                i iVar5 = new i((z) this.x, (qn.g) this.y, cVar, 4);
                iVar5.w = obj;
                return iVar5;
            case 5:
                i iVar6 = new i((hj.g) this.x, (oa.j) this.y, cVar, 5);
                iVar6.w = obj;
                return iVar6;
            case 6:
                return new i((n0) this.w, (t) this.x, (String) this.y, cVar, 6);
            case 7:
                return new i((s) this.w, (n0) this.x, (t) this.y, cVar, 7);
            case 8:
                i iVar7 = new i((z) this.x, (qn.g) this.y, cVar, 8);
                iVar7.w = obj;
                return iVar7;
            case 9:
                i iVar8 = new i((z) this.x, (qn.g) this.y, cVar, 9);
                iVar8.w = obj;
                return iVar8;
            case 10:
                i iVar9 = new i((x) this.x, (u0) this.y, cVar, 10);
                iVar9.w = obj;
                return iVar9;
            case 11:
                return new i(this.w, (oa.j) this.y, (String) this.x, cVar, 11);
            case 12:
                return new i(this.w, (oa.j) this.y, (String) this.x, cVar, 12);
            case 13:
                return new i((oa.j) this.y, (g1) this.w, (String) this.x, cVar);
            case 14:
                return new i(this.w, (oa.j) this.y, (String) this.x, cVar, 14);
            case 15:
                return new i(this.w, (oa.j) this.y, (String) this.x, cVar, 15);
            default:
                return new i(this.w, (oa.j) this.y, (String) this.x, cVar, 16);
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                i r = r((a71.c) obj2, (yz0.s) obj);
                a0 a0Var = a0.a;
                r.v(a0Var);
                return a0Var;
            case 1:
                return r((a71.c) obj2, (s5.b) obj).v(a0.a);
            case 2:
                i r2 = r((a71.c) obj2, (s5.b) obj);
                a0 a0Var2 = a0.a;
                r2.v(a0Var2);
                return a0Var2;
            case 3:
                i r3 = r((a71.c) obj2, (qn.d) obj);
                a0 a0Var3 = a0.a;
                r3.v(a0Var3);
                return a0Var3;
            case 4:
                i r4 = r((a71.c) obj2, (qn.d) obj);
                a0 a0Var4 = a0.a;
                r4.v(a0Var4);
                return a0Var4;
            case 5:
                i r5 = r((a71.c) obj2, (yz0.s) obj);
                a0 a0Var5 = a0.a;
                r5.v(a0Var5);
                return a0Var5;
            case 6:
                return r((a71.c) obj2, (v71.z) obj).v(a0.a);
            case 7:
                return r((a71.c) obj2, (v71.z) obj).v(a0.a);
            case 8:
                i r6 = r((a71.c) obj2, (qn.d) obj);
                a0 a0Var6 = a0.a;
                r6.v(a0Var6);
                return a0Var6;
            case 9:
                i r7 = r((a71.c) obj2, (qn.d) obj);
                a0 a0Var7 = a0.a;
                r7.v(a0Var7);
                return a0Var7;
            case 10:
                return r((a71.c) obj2, (v71.z) obj).v(a0.a);
            case 11:
                i r8 = r((a71.c) obj2, (a8) obj);
                a0 a0Var8 = a0.a;
                r8.v(a0Var8);
                return a0Var8;
            case 12:
                i r9 = r((a71.c) obj2, (a0) obj);
                a0 a0Var9 = a0.a;
                r9.v(a0Var9);
                return a0Var9;
            case 13:
                i r11 = r((a71.c) obj2, (a0) obj);
                a0 a0Var10 = a0.a;
                r11.v(a0Var10);
                return a0Var10;
            case 14:
                i r12 = r((a71.c) obj2, (x7) obj);
                a0 a0Var11 = a0.a;
                r12.v(a0Var11);
                return a0Var11;
            case 15:
                i r13 = r((a71.c) obj2, (y7) obj);
                a0 a0Var12 = a0.a;
                r13.v(a0Var12);
                return a0Var12;
            default:
                i r14 = r((a71.c) obj2, (a0) obj);
                a0 a0Var13 = a0.a;
                r14.v(a0Var13);
                return a0Var13;
        }
    }

    public final Object v(Object obj) {
        q81.a0 e;
        int i = this.v;
        String str = "{}";
        final int i2 = 3;
        final int i3 = 2;
        a0 a0Var = a0.a;
        Object obj2 = this.x;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                final yz0.s sVar = (yz0.s) this.w;
                b71.a aVar = b71.a.r;
                y.j(obj);
                final int i4 = 0;
                final int i5 = 1;
                ((cn.s) ((j) obj2).c.a((oa.j) obj3)).f(new j71.c() { // from class: an.h
                    public final Object k(Object obj4) {
                        boolean o;
                        o6 o6Var = (s7) obj4;
                        switch (i4) {
                            case 0:
                                o = t.e.o(sVar.getId(), o6Var);
                                break;
                            case 1:
                                boolean z = o6Var instanceof o6;
                                yz0.s sVar2 = sVar;
                                return z ? o6.a(o6Var, sVar2, (List) null, false, (x2) null, false, false, 126) : o6Var instanceof a7 ? a7.a((a7) o6Var, sVar2, (List) null, false, false, false, 1015) : o6Var;
                            case 2:
                                o = t.e.o(sVar.getId(), o6Var);
                                break;
                            default:
                                yz0.s sVar3 = sVar;
                                return !t.e.o(sVar3.getId(), o6Var) ? o6Var : o6Var instanceof o6 ? o6.a(o6Var, sVar3, (List) null, false, (x2) null, false, false, 126) : o6Var instanceof a7 ? a7.a((a7) o6Var, sVar3, (List) null, false, false, false, 1015) : o6Var;
                        }
                        return Boolean.valueOf(o);
                    }
                }, new j71.c() { // from class: an.h
                    public final Object k(Object obj4) {
                        boolean o;
                        o6 o6Var = (s7) obj4;
                        switch (i5) {
                            case 0:
                                o = t.e.o(sVar.getId(), o6Var);
                                break;
                            case 1:
                                boolean z = o6Var instanceof o6;
                                yz0.s sVar2 = sVar;
                                return z ? o6.a(o6Var, sVar2, (List) null, false, (x2) null, false, false, 126) : o6Var instanceof a7 ? a7.a((a7) o6Var, sVar2, (List) null, false, false, false, 1015) : o6Var;
                            case 2:
                                o = t.e.o(sVar.getId(), o6Var);
                                break;
                            default:
                                yz0.s sVar3 = sVar;
                                return !t.e.o(sVar3.getId(), o6Var) ? o6Var : o6Var instanceof o6 ? o6.a(o6Var, sVar3, (List) null, false, (x2) null, false, false, 126) : o6Var instanceof a7 ? a7.a((a7) o6Var, sVar3, (List) null, false, false, false, 1015) : o6Var;
                        }
                        return Boolean.valueOf(o);
                    }
                });
                return a0Var;
            case 1:
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                s5.b bVar = (s5.b) this.w;
                s5.b h = bVar.h();
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                s5.e eVar = q0.g;
                x61.t tVar = (Set) bVar.d(eVar);
                if (tVar == null) {
                    tVar = x61.t.r;
                }
                h.g(eVar, f0.n(tVar, str2));
                h.g(l0.b(q0.d, str2), str3);
                return h.i();
            case 2:
                s5.b bVar2 = (s5.b) this.w;
                b71.a aVar3 = b71.a.r;
                y.j(obj);
                bVar2.f((s5.e) obj2, obj3);
                return a0Var;
            case 3:
                qn.d dVar = (qn.d) this.w;
                b71.a aVar4 = b71.a.r;
                y.j(obj);
                ((z) obj2).z.compute(((qn.g) obj3).a, new go0.a(2, new go0.b(dVar, 0)));
                return a0Var;
            case 4:
                qn.d dVar2 = (qn.d) this.w;
                b71.a aVar5 = b71.a.r;
                y.j(obj);
                ((z) obj2).z.compute(((qn.g) obj3).a, new go0.a(4, new go0.b(dVar2, 1)));
                return a0Var;
            case 5:
                final yz0.s sVar2 = (yz0.s) this.w;
                b71.a aVar6 = b71.a.r;
                y.j(obj);
                ((cn.s) ((hj.g) obj2).b.a((oa.j) obj3)).f(new j71.c() { // from class: an.h
                    public final Object k(Object obj4) {
                        boolean o;
                        o6 o6Var = (s7) obj4;
                        switch (i3) {
                            case 0:
                                o = t.e.o(sVar2.getId(), o6Var);
                                break;
                            case 1:
                                boolean z = o6Var instanceof o6;
                                yz0.s sVar22 = sVar2;
                                return z ? o6.a(o6Var, sVar22, (List) null, false, (x2) null, false, false, 126) : o6Var instanceof a7 ? a7.a((a7) o6Var, sVar22, (List) null, false, false, false, 1015) : o6Var;
                            case 2:
                                o = t.e.o(sVar2.getId(), o6Var);
                                break;
                            default:
                                yz0.s sVar3 = sVar2;
                                return !t.e.o(sVar3.getId(), o6Var) ? o6Var : o6Var instanceof o6 ? o6.a(o6Var, sVar3, (List) null, false, (x2) null, false, false, 126) : o6Var instanceof a7 ? a7.a((a7) o6Var, sVar3, (List) null, false, false, false, 1015) : o6Var;
                        }
                        return Boolean.valueOf(o);
                    }
                }, new j71.c() { // from class: an.h
                    public final Object k(Object obj4) {
                        boolean o;
                        o6 o6Var = (s7) obj4;
                        switch (i2) {
                            case 0:
                                o = t.e.o(sVar2.getId(), o6Var);
                                break;
                            case 1:
                                boolean z = o6Var instanceof o6;
                                yz0.s sVar22 = sVar2;
                                return z ? o6.a(o6Var, sVar22, (List) null, false, (x2) null, false, false, 126) : o6Var instanceof a7 ? a7.a((a7) o6Var, sVar22, (List) null, false, false, false, 1015) : o6Var;
                            case 2:
                                o = t.e.o(sVar2.getId(), o6Var);
                                break;
                            default:
                                yz0.s sVar3 = sVar2;
                                return !t.e.o(sVar3.getId(), o6Var) ? o6Var : o6Var instanceof o6 ? o6.a(o6Var, sVar3, (List) null, false, (x2) null, false, false, 126) : o6Var instanceof a7 ? a7.a((a7) o6Var, sVar3, (List) null, false, false, false, 1015) : o6Var;
                        }
                        return Boolean.valueOf(o);
                    }
                });
                return a0Var;
            case 6:
                t tVar2 = (t) obj2;
                String str4 = tVar2.b;
                String str5 = tVar2.d;
                n0 n0Var = (n0) this.w;
                b71.a aVar7 = b71.a.r;
                y.j(obj);
                try {
                    String concat = n0Var.c.a().concat("/mobile/upload/policy");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("content_type", str5);
                    jSONObject.put("name", str4);
                    jSONObject.put("size", tVar2.c);
                    jSONObject.put("subject_id", (String) obj3);
                    String jSONObject2 = jSONObject.toString();
                    k71.k.f(jSONObject2, "toString(...)");
                    q81.xShadow xVar = q81.y.Companion;
                    n nVar = q.d;
                    q g0 = i4.g0("application/json; charset=utf-8");
                    xVar.getClass();
                    w a = q81.xShadow.a(jSONObject2, g0);
                    l1 l1Var = new l1(11);
                    l1Var.I(concat);
                    l1Var.A(a);
                    l1Var.G(j0.class, new j0(false, true));
                    e = n0Var.a.b(new androidx.lifecycle.b(l1Var)).e();
                    try {
                        c0 c0Var = e.x;
                        if (!e.H) {
                            throw new b1(n0.a(n0Var, e, c0Var.t(), tVar2));
                        }
                        String t = c0Var.t();
                        if (!p.T(t)) {
                            str = t;
                        }
                        s sVar3 = new s(new JSONObject(str));
                        e.close();
                        return sVar3;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    throw i4.G(th2, "upload creation failed", str4, str5);
                }
            case 7:
                t tVar3 = (t) obj3;
                String str6 = tVar3.d;
                String str7 = tVar3.b;
                s sVar4 = (s) this.w;
                b71.a aVar8 = b71.a.r;
                y.j(obj);
                try {
                    x3 x3Var = sVar4.b;
                    l51.h hVar = new l51.h(10);
                    ArrayList arrayList = (ArrayList) hVar.u;
                    i4.F(hVar, x3Var);
                    ContentResolver contentResolver = tVar3.e;
                    n nVar2 = q.d;
                    arrayList.add(b31.b.N("file", str7, new c1(contentResolver, i4.g0("application/json; charset=utf-8"), tVar3.c, tVar3.a)));
                    hVar.K(i4.V("multipart/form-data"));
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    q81.sShadow sVar5 = new q81.sShadow((h91.kShadow) hVar.s, (q) hVar.t, r81.g.j(arrayList));
                    l1 l1Var2 = new l1(11);
                    l1Var2.I(i4.I(sVar4.a, "upload_url"));
                    for (Map.Entry entry : sVar4.c.p().entrySet()) {
                        l1Var2.g((String) entry.getKey(), (String) entry.getValue());
                    }
                    l1Var2.g("content-type", "multipart/form-data;");
                    l1Var2.g("cache-control", "no-cache");
                    l1Var2.G(j0.class, new j0(true, true));
                    l1Var2.A(sVar5);
                    e = ((n0) obj2).a.b(new androidx.lifecycle.b(l1Var2)).e();
                    try {
                        c0 c0Var2 = e.x;
                        if (e.H) {
                            String t2 = c0Var2.t();
                            if (!p.T(t2)) {
                                str = t2;
                            }
                            in.c0 c0Var3 = new in.c0(sVar4, new JSONObject(str));
                            e.close();
                            return c0Var3;
                        }
                        String str8 = "upload to s3 failed " + t71.w.C(c0Var2.t(), str7, "filename_redacted");
                        k71.k.g(str8, "errorMessage");
                        throw new b1(new d0(str8, str7, str6));
                    } finally {
                    }
                } catch (Throwable th3) {
                    throw i4.G(th3, "upload to s3 failed", str7, str6);
                }
            case 8:
                qn.d dVar3 = (qn.d) this.w;
                b71.a aVar9 = b71.a.r;
                y.j(obj);
                ((z) obj2).z.compute(((qn.g) obj3).c, new go0.a(7, new go0.b(dVar3, 2)));
                return a0Var;
            case 9:
                qn.d dVar4 = (qn.d) this.w;
                b71.a aVar10 = b71.a.r;
                y.j(obj);
                ((z) obj2).z.compute(((qn.g) obj3).a, new go0.a(11, new go0.b(dVar4, 3)));
                return a0Var;
            case 10:
                b71.a aVar11 = b71.a.r;
                y.j(obj);
                v71.z zVar = (v71.z) this.w;
                v71.a0Shadow a0Var2 = v71.a0Shadow.u;
                x xVar2 = (x) obj2;
                u0 u0Var = (u0) obj3;
                b0.z(zVar, (a71.h) null, a0Var2, new s0.a0(xVar2, u0Var, (a71.c) null, 1), 1);
                return b0.z(zVar, (a71.h) null, a0Var2, new s0.a0(xVar2, u0Var, (a71.c) null, 2), 1);
            case 11:
                b71.a aVar12 = b71.a.r;
                y.j(obj);
                oa.j jVar = (oa.j) obj3;
                ((cn.s) ((zk.i) this.w).b.a(jVar)).a((String) obj2, new b6(new com.github.service.models.response.a(jVar.c, (Avatar) null, (String) null, false, (String) null, 62), (k.w) null, (ZonedDateTime) null, (CloseReason) null, (z01.p) null, 30));
                return a0Var;
            case 12:
                b71.a aVar13 = b71.a.r;
                y.j(obj);
                oa.j jVar2 = (oa.j) obj3;
                String str9 = jVar2.c;
                ZonedDateTime now = ZonedDateTime.now();
                k71.k.f(now, "now(...)");
                ((cn.s) ((zk.n0) this.w).b.a(jVar2)).b((String) obj2, sy.d0Shadow.n(new b7(str9, now)));
                return a0Var;
            case 13:
                b71.a aVar14 = b71.a.r;
                y.j(obj);
                oa.j jVar3 = (oa.j) obj3;
                String str10 = jVar3.c;
                ZonedDateTime now2 = ZonedDateTime.now();
                k71.k.f(now2, "now(...)");
                ((cn.s) ((g1) this.w).b.a(jVar3)).a((String) obj2, new d7(str10, (String) null, now2));
                return a0Var;
            case 14:
                b71.a aVar15 = b71.a.r;
                y.j(obj);
                oa.j jVar4 = (oa.j) obj3;
                ((cn.s) ((i1) this.w).b.a(jVar4)).a((String) obj2, new g7(new com.github.service.models.response.a(jVar4.c, (Avatar) null, (String) null, false, (String) null, 62)));
                return a0Var;
            case 15:
                b71.a aVar16 = b71.a.r;
                y.j(obj);
                oa.j jVar5 = (oa.j) obj3;
                ((cn.s) ((j1) this.w).b.a(jVar5)).a((String) obj2, new g7(new com.github.service.models.response.a(jVar5.c, (Avatar) null, (String) null, false, (String) null, 62)));
                return a0Var;
            default:
                b71.a aVar17 = b71.a.r;
                y.j(obj);
                oa.j jVar6 = (oa.j) obj3;
                String str11 = jVar6.c;
                ZonedDateTime now3 = ZonedDateTime.now();
                k71.k.f(now3, "now(...)");
                ((cn.s) ((s1) this.w).b.a(jVar6)).a((String) obj2, new q7(str11, now3));
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, oa.j jVar, String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.w = obj;
        this.y = jVar;
        this.x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(oa.j jVar, g1 g1Var, String str, a71.c cVar) {
        super(2, cVar);
        this.v = 13;
        this.y = jVar;
        this.w = g1Var;
        this.x = str;
    }
}
