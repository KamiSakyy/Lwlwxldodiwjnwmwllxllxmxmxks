package cn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import sy.y;
import w61.a0;
import yz0.o6;
import yz0.s7;

/* loaded from: /home/user/work/p/classes3.dex */
public class b extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ g x;
    public final /* synthetic */ oa.j y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, oa.j jVar, String str, String str2, int i, a71.c cVar, int i2) {
        super(2, cVar);
        this.v = i2;
        this.x = gVar;
        this.y = jVar;
        this.z = str;
        this.A = str2;
        this.B = i;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                b bVar = new b(this.x, this.y, this.z, this.A, this.B, cVar, 0);
                bVar.w = obj;
                return bVar;
            default:
                b bVar2 = new b(this.x, this.y, this.z, this.A, this.B, cVar, 1);
                bVar2.w = obj;
                return bVar2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                b r = r((a71.c) obj2, (List) obj);
                a0 a0Var = a0.a;
                r.v(a0Var);
                return a0Var;
            default:
                b r2 = r((a71.c) obj2, (h01.q) obj);
                a0 a0Var2 = a0.a;
                r2.v(a0Var2);
                return a0Var2;
        }
    }

    public final Object v(Object obj) {
        int i = this.v;
        a0 a0Var = a0.a;
        int i2 = this.B;
        String str = this.A;
        String str2 = this.z;
        oa.j jVar = this.y;
        g gVar = this.x;
        switch (i) {
            case 0:
                List list = (List) this.w;
                b71.a aVar = b71.a.r;
                y.j(obj);
                s sVar = (s) gVar.b.a(jVar);
                sVar.getClass();
                k71.k.g(list, "timelineItems");
                String d = s.d(str2, i2, str);
                ConcurrentHashMap concurrentHashMap = sVar.e;
                hShadow hVar = (hShadow) concurrentHashMap.get(d);
                if (hVar != null) {
                    h01.q qVar = hVar.a;
                    List<o6> list2 = qVar.c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        o6 o6Var = (s7) obj2;
                        if (o6Var instanceof o6) {
                            String id = o6Var.a.getId();
                            if (!list2.isEmpty()) {
                                for (o6 o6Var2 : list2) {
                                    if (!(o6Var2 instanceof o6) || !k71.k.b(o6Var2.a.getId(), id)) {
                                    }
                                }
                            }
                            arrayList.add(obj2);
                        } else if (!list2.contains(o6Var)) {
                            arrayList.add(obj2);
                        }
                    }
                    concurrentHashMap.put(d, new hShadow(new h01.q(qVar.a, qVar.b, x61.m.l0(list2, arrayList), qVar.d, qVar.e, qVar.f, qVar.g), x61.rShadow.r));
                    sVar.c(d);
                    break;
                }
                break;
            default:
                h01.q qVar2 = (h01.q) this.w;
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                ((s) gVar.b.a(jVar)).e(str2, str, i2, qVar2);
                break;
        }
        return a0Var;
    }
}
