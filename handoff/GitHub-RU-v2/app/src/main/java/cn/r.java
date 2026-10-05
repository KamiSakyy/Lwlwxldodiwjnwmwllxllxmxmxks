package cn;

import com.apollographql.apollo.exception.ApolloException;
import com.github.rudroid.common.e;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.google.android.gms.internal.measurement.b4;
import go0.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.HttpException;
import sy.y;
import w61.a0;
import x61.x;
import yz0.f8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r extends c71.j implements j71.f {
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.v) {
            case 0:
                r rVar = new r((s) this.w, (String) this.x, (a71.c) obj3, 0);
                a0 a0Var = a0.a;
                rVar.v(a0Var);
                return a0Var;
            case 1:
                r rVar2 = new r((j71.c) this.x, (a71.c) obj3, 1);
                rVar2.w = (Throwable) obj2;
                rVar2.v(a0.a);
                throw null;
            case 2:
                r rVar3 = new r((oa.j) this.x, (a71.c) obj3, 2);
                rVar3.w = (Throwable) obj2;
                a0 a0Var2 = a0.a;
                rVar3.v(a0Var2);
                return a0Var2;
            case 3:
                r rVar4 = new r((z) this.w, (qn.g) this.x, (a71.c) obj3, 3);
                a0 a0Var3 = a0.a;
                rVar4.v(a0Var3);
                return a0Var3;
            case 4:
                r rVar5 = new r((z) this.w, (qn.g) this.x, (a71.c) obj3, 4);
                a0 a0Var4 = a0.a;
                rVar5.v(a0Var4);
                return a0Var4;
            case 5:
                r rVar6 = new r((String) this.x, (a71.c) obj3, 5);
                rVar6.w = (Throwable) obj2;
                rVar6.v(a0.a);
                throw null;
            case 6:
                r rVar7 = new r((z) this.w, (qn.g) this.x, (a71.c) obj3, 6);
                a0 a0Var5 = a0.a;
                rVar7.v(a0Var5);
                return a0Var5;
            case 7:
                r rVar8 = new r((nm.i) this.x, (a71.c) obj3, 7);
                rVar8.w = (Throwable) obj2;
                rVar8.v(a0.a);
                throw null;
            case 8:
                r rVar9 = new r((z) this.w, (qn.g) this.x, (a71.c) obj3, 8);
                a0 a0Var6 = a0.a;
                rVar9.v(a0Var6);
                return a0Var6;
            case 9:
                r rVar10 = new r(3, (a71.c) obj3, 9);
                rVar10.w = (q5.d) obj;
                rVar10.x = (s5.b) obj2;
                return rVar10.v(a0.a);
            case 10:
                r rVar11 = new r(3, (a71.c) obj3, 10);
                rVar11.w = (on.f) obj;
                rVar11.x = (on.m) obj2;
                return rVar11.v(a0.a);
            case 11:
                r rVar12 = new r((um.r) this.x, (a71.c) obj3, 11);
                rVar12.w = (List) obj;
                return rVar12.v(a0.a);
            default:
                r rVar13 = new r(3, (a71.c) obj3, 12);
                rVar13.w = (List) obj;
                rVar13.x = (f8) obj2;
                return rVar13.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        int i = this.v;
        Boolean bool = null;
        a0 a0Var = a0.a;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                y.j(obj);
                s sVar = (s) this.w;
                CopyOnWriteArrayList copyOnWriteArrayList = sVar.g;
                String str = (String) this.x;
                copyOnWriteArrayList.remove(str);
                if (!sVar.g.contains(str)) {
                    sVar.e.remove(str);
                }
                return a0Var;
            case 1:
                HttpException httpException = (Throwable) this.w;
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                if (!(httpException instanceof HttpException)) {
                    throw new ApiFailure(ApiFailureType.UNKNOWN, (String) null, (String) null, (Integer) null, (ArrayList) null, (Map) null, httpException, 48);
                }
                String str2 = (String) ((j71.c) this.x).k(httpException);
                if (str2 == null) {
                    str2 = httpException.s;
                }
                throw b4.I(str2, httpException.r, (String) null);
            case 2:
                Throwable th2 = (Throwable) this.w;
                b71.a aVar3 = b71.a.r;
                y.j(obj);
                th2.printStackTrace();
                String str3 = ((oa.j) this.x).c;
                th2.toString();
                return a0Var;
            case 3:
                b71.a aVar4 = b71.a.r;
                y.j(obj);
                z zVar = (z) this.w;
                String str4 = ((qn.g) this.x).a;
                if (((go0.f) zVar.z.compute(str4, new go0.a(0, new g3.a0(24)))) == null) {
                    String jSONObject = new JSONObject().put("unsubscribe", new JSONArray().put(str4)).toString();
                    k71.k.f(jSONObject, "toString(...)");
                    k71.k.g("- sending: ".concat(jSONObject), "message");
                    g91.f fVar = zVar.A;
                    if (fVar != null) {
                        h91.k kVar = h91.k.u;
                        bool = Boolean.valueOf(fVar.f(1, c30.d.b(jSONObject)));
                    }
                    k71.k.g("on completion - unsubscribed: " + bool, "message");
                }
                return a0Var;
            case 4:
                b71.a aVar5 = b71.a.r;
                y.j(obj);
                z zVar2 = (z) this.w;
                String str5 = ((qn.g) this.x).a;
                if (((hd0.d) zVar2.z.compute(str5, new go0.a(3, new g3.a0(27)))) == null) {
                    String jSONObject2 = new JSONObject().put("unsubscribe", new JSONArray().put(str5)).toString();
                    k71.k.f(jSONObject2, "toString(...)");
                    k71.k.g("- sending: ".concat(jSONObject2), "message");
                    g91.f fVar2 = zVar2.A;
                    if (fVar2 != null) {
                        h91.k kVar2 = h91.k.u;
                        bool = Boolean.valueOf(fVar2.f(1, c30.d.b(jSONObject2)));
                    }
                    k71.k.g("on completion - unsubscribed: " + bool, "message");
                }
                return a0Var;
            case 5:
                ApolloException apolloException = (Throwable) this.w;
                b71.a aVar6 = b71.a.r;
                y.j(obj);
                if (apolloException instanceof ApolloException) {
                    throw in.r.b(apolloException, (String) this.x);
                }
                throw apolloException;
            case 6:
                b71.a aVar7 = b71.a.r;
                y.j(obj);
                z zVar3 = (z) this.w;
                qn.g gVar = (qn.g) this.x;
                if (((kp.d) zVar3.z.compute(gVar.c, new go0.a(6, new ie.d(26)))) == null) {
                    String jSONObject3 = new JSONObject().put("unsubscribe", new JSONArray().put(gVar.a)).toString();
                    k71.k.f(jSONObject3, "toString(...)");
                    k71.k.g("- sending: ".concat(jSONObject3), "message");
                    g91.f fVar3 = zVar3.A;
                    if (fVar3 != null) {
                        h91.k kVar3 = h91.k.u;
                        bool = Boolean.valueOf(fVar3.f(1, c30.d.b(jSONObject3)));
                    }
                    k71.k.g("on completion - unsubscribed: " + bool, "message");
                }
                return a0Var;
            case 7:
                Throwable th3 = (Throwable) this.w;
                b71.a aVar8 = b71.a.r;
                y.j(obj);
                qe.a aVar9 = ((nm.i) this.x).d;
                IOException iOException = new IOException("Error updating schedules", th3);
                e.a aVar10 = com.github.rudroid.common.e.Companion;
                aVar9.b("NotificationSchedulesRepository", iOException, true);
                throw th3;
            case 8:
                b71.a aVar11 = b71.a.r;
                y.j(obj);
                z zVar4 = (z) this.w;
                String str6 = ((qn.g) this.x).a;
                if (((r20.d) zVar4.z.compute(str6, new go0.a(9, new py0.o(17)))) == null) {
                    String jSONObject4 = new JSONObject().put("unsubscribe", new JSONArray().put(str6)).toString();
                    k71.k.f(jSONObject4, "toString(...)");
                    k71.k.g("- sending: ".concat(jSONObject4), "message");
                    g91.f fVar4 = zVar4.A;
                    if (fVar4 != null) {
                        h91.k kVar4 = h91.k.u;
                        bool = Boolean.valueOf(fVar4.f(1, c30.d.b(jSONObject4)));
                    }
                    k71.k.g("on completion - unsubscribed: " + bool, "message");
                }
                return a0Var;
            case 9:
                b71.a aVar12 = b71.a.r;
                y.j(obj);
                q5.d dVar = (q5.d) this.w;
                s5.b bVar = (s5.b) this.x;
                Set keySet = bVar.a().keySet();
                ArrayList arrayList = new ArrayList(x61.n.F(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s5.e) it.next()).a);
                }
                Map<String, ?> all = dVar.a.getAll();
                k71.k.f(all, "getAll(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Set set = dVar.b;
                    if (set != null ? set.contains(key) : true) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(x.s(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Set) {
                        value = x61.m.K0((Iterable) value);
                    }
                    linkedHashMap2.put(key2, value);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    if (!arrayList.contains((String) entry3.getKey())) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                s5.b h = bVar.h();
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    String str7 = (String) entry4.getKey();
                    Object value2 = entry4.getValue();
                    if (value2 instanceof Boolean) {
                        h.g(b91.g.j(str7), value2);
                    } else if (value2 instanceof Float) {
                        h.g(b91.g.q(str7), value2);
                    } else if (value2 instanceof Integer) {
                        h.g(b91.g.u(str7), value2);
                    } else if (value2 instanceof Long) {
                        h.g(b91.g.z(str7), value2);
                    } else if (value2 instanceof String) {
                        h.g(b91.g.Q(str7), value2);
                    } else if (value2 instanceof Set) {
                        k71.k.g(str7, "name");
                        h.g(new s5.e(str7), (Set) value2);
                    }
                }
                return h.i();
            case 10:
                on.f fVar5 = (on.f) this.w;
                on.m mVar = (on.m) this.x;
                b71.a aVar13 = b71.a.r;
                y.j(obj);
                return new ui.a(fVar5, mVar);
            case 11:
                List list = (List) this.w;
                b71.a aVar14 = b71.a.r;
                y.j(obj);
                return um.r.a((um.r) this.x, list);
            default:
                List list2 = (List) this.w;
                f8 f8Var = (f8) this.x;
                b71.a aVar15 = b71.a.r;
                y.j(obj);
                return new zm.a(list2, f8Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.w = obj;
        this.x = obj2;
    }
}
