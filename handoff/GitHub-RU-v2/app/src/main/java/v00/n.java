package v00;

import aa.t0;
import hc0.fm;
import hc0.o8;
import hc0.w8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import u10.bb;
import u10.cb;
import u10.i3;
import u10.j3;
import u10.jw;
import u10.k3;
import u10.n3;
import u10.w1;
import u10.wq;
import u10.xq;
import u10.y1;
import u10.yq;
import u10.z1;
import yz0.h4;
import yz0.i4;
import z70.l3;
import z70.w3;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class n implements j71.c {
    public final /* synthetic */ int r;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final Object k(Object obj) {
        String str;
        String str2;
        List list;
        k3 k3Var;
        r2 = false;
        boolean z = false;
        switch (this.r) {
            case 0:
                l81.f fVar = (l81.f) obj;
                k71.k.g(fVar, "$this$Json");
                fVar.c = true;
                fVar.e = true;
                fVar.d = true;
                fVar.a = true;
                return w61.a0.a;
            case 1:
                l81.f fVar2 = (l81.f) obj;
                k71.k.g(fVar2, "$this$Json");
                fVar2.c = true;
                fVar2.e = true;
                return w61.a0.a;
            case 2:
                synchronized (v1.m.c) {
                    java.util.List r1 = (java.util.List) (v1.m.i);
                    int size = r1.size();
                    for (int i = 0; i < size; i++) {
                        ((j71.c) r1.get(i)).k(obj);
                    }
                }
                return w61.a0.a;
            case 3:
                n nVar = v1.m.a;
                return w61.a0.a;
            case 4:
                return w61.a0.a;
            case 5:
                v71.v vVar = (a71.f) obj;
                if (vVar instanceof v71.v) {
                    return vVar;
                }
                return null;
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                k71.k.g(entry, "<destruct>");
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    k71.k.f(value, "toString(...)");
                }
                sb.append(value);
                return sb.toString();
            case 7:
                k71.k.g((d3.c0) obj, "$this$semantics");
                return w61.a0.a;
            case 8:
                k71.k.g((d3.c0) obj, "$this$semantics");
                return w61.a0.a;
            case 9:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 12:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 13:
                la0.c cVar = (la0.c) obj;
                k71.k.g(cVar, "it");
                la0.a aVar = cVar.b;
                if (aVar != null) {
                    o8.Companion.getClass();
                    str = ((aa.q) o8.l).a;
                } else {
                    w8.Companion.getClass();
                    str = ((aa.q) w8.c).a;
                }
                la0.a a = aVar != null ? la0.a.a(aVar, aVar.b + 1, true) : null;
                la0.b bVar = cVar.c;
                return new y1(new w1(new z1(str, la0.c.a(cVar, a, bVar != null ? la0.b.a(bVar, bVar.b + 1, true) : null))));
            case 14:
                la0.c cVar2 = (la0.c) obj;
                k71.k.g(cVar2, "it");
                la0.a aVar2 = cVar2.b;
                if (aVar2 != null) {
                    o8.Companion.getClass();
                    str2 = ((aa.q) o8.l).a;
                } else {
                    w8.Companion.getClass();
                    str2 = ((aa.q) w8.c).a;
                }
                la0.a a2 = aVar2 != null ? la0.a.a(aVar2, aVar2.b - 1, false) : null;
                la0.b bVar2 = cVar2.c;
                return new wq(new xq(new yq(str2, la0.c.a(cVar2, a2, bVar2 != null ? la0.b.a(bVar2, bVar2.b - 1, false) : null))));
            case 15:
                na0.h hVar = (na0.h) obj;
                k71.k.g(hVar, "$this$observeWithPartialResultErrors");
                return Boolean.valueOf(hVar.b != null);
            case 16:
                bb bbVar = (bb) obj;
                k71.k.g(bbVar, "$this$fetchWithPartialResultErrors");
                cb cbVar = bbVar.a;
                return Boolean.valueOf((cbVar != null ? cbVar.a : null) != null);
            case 17:
                l3 l3Var = (l3) obj;
                k71.k.g(l3Var, "state");
                return l3.a(l3Var, fm.u);
            case 18:
                w3 w3Var = (w3) obj;
                k71.k.g(w3Var, "fragment");
                String str4 = w3Var.a;
                String str5 = w3Var.c;
                k71.k.g(str4, "id");
                k71.k.g(str5, "__typename");
                return new w3(str4, str5, false);
            case 19:
                l3 l3Var2 = (l3) obj;
                k71.k.g(l3Var2, "state");
                return l3.a(l3Var2, fm.t);
            case 20:
                jw jwVar = (jw) obj;
                k71.k.g(jwVar, "$this$observeWithPartialResultErrors");
                return Boolean.valueOf(jwVar.a != null);
            case 21:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 22:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
            case 23:
                k71.k.g((s01.n) obj, "it");
                return new n3(t0.d);
            case 24:
                i3 i3Var = (i3) obj;
                k71.k.g(i3Var, "data");
                u10.l3 l3Var3 = i3Var.a.b;
                if (l3Var3 != null && (list = l3Var3.b) != null) {
                    z = !list.isEmpty();
                }
                return Boolean.valueOf(z);
            case 25:
                i3 i3Var2 = (i3) obj;
                k71.k.g(i3Var2, "data");
                u10.l3 l3Var4 = i3Var2.a.b;
                if (l3Var4 == null || (k3Var = l3Var4.a) == null) {
                    return null;
                }
                return new x01.i(k3Var.c, k3Var.a, !k3Var.b);
            case 26:
                i3 i3Var3 = (i3) obj;
                k71.k.g(i3Var3, "data");
                u10.l3 l3Var5 = i3Var3.a.b;
                List list2 = l3Var5 != null ? l3Var5.b : null;
                return list2 == null ? x61.rShadow.r : list2;
            case 27:
                i3 i3Var4 = (i3) obj;
                k71.k.g(i3Var4, "data");
                u10.l3 l3Var6 = i3Var4.a.b;
                List list3 = l3Var6 != null ? l3Var6.b : null;
                if (list3 == null) {
                    list3 = x61.rShadow.r;
                }
                ArrayList S = x61.m.S(list3);
                ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                int size2 = S.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = S.get(i2);
                    i2++;
                    j3 j3Var = (j3) obj2;
                    arrayList.add(new h4(j3Var.b, j3Var.c));
                }
                k3 k3Var2 = l3Var6 != null ? l3Var6.a : null;
                return new i4(arrayList, k3Var2 != null ? new x01.i(k3Var2.c, k3Var2.a, !k3Var2.b) : new x01.i((String) null, false, true));
            case 28:
                l81.f fVar3 = (l81.f) obj;
                k71.k.g(fVar3, "$this$Json");
                fVar3.c = true;
                return w61.a0.a;
            default:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return w61.a0.a;
        }
    }
}
