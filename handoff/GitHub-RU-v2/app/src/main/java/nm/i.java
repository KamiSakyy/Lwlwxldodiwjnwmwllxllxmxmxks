package nm;

import cn.r;
import java.time.LocalTime;
import java.util.ArrayList;
import m7.w;
import sy.y;
import v71.v;
import w61.a0;
import x61.n;
import y71.n1;
import z01.u0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final a Companion = new a();
    public k a;
    public oa.g b;
    public v c;
    public qe.a d;

    public i(k kVar, oa.g gVar, v vVar, qe.a aVar) {
        k71.k.g(kVar, "schedulesStore");
        k71.k.g(gVar, "pushNotificationService");
        k71.k.g(vVar, "ioDispatcher");
        this.a = kVar;
        this.b = gVar;
        this.c = vVar;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, c71.c cVar) {
        c cVar2;
        int i;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.x = i2 - Integer.MIN_VALUE;
                Object obj = cVar2.v;
                b71.a aVar = b71.a.r;
                i = cVar2.x;
                if (i != 0) {
                    y.j(obj);
                    u0 u0Var = (u0) this.b.a(jVar);
                    Integer num = new Integer(7);
                    cVar2.u = jVar;
                    cVar2.x = 1;
                    obj = u0Var.c(num);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = cVar2.u;
                    y.j(obj);
                }
                return n1.y(new aq.c(new y71.y((y71.i) obj, new d(this, jVar, null, 0), 6), 6), this.c);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.v;
        b71.a aVar2 = b71.a.r;
        i = cVar2.x;
        if (i != 0) {
        }
        return n1.y(new aq.c(new y71.y((y71.i) obj2, new d(this, jVar, null, 0), 6), 6), this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oa.j jVar, ArrayList arrayList, LocalTime localTime, LocalTime localTime2, c71.c cVar) {
        h hVar;
        Object obj;
        b71.a aVar;
        int i;
        oa.j jVar2;
        ArrayList arrayList2;
        LocalTime localTime3;
        LocalTime localTime4;
        oa.j jVar3;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.A = i2 - Integer.MIN_VALUE;
                h hVar2 = hVar;
                obj = hVar2.y;
                aVar = b71.a.r;
                i = hVar2.A;
                a71.c cVar2 = null;
                if (i != 0) {
                    y.j(obj);
                    ArrayList arrayList3 = new ArrayList(n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        arrayList3.add(new zj.d((com.github.rudroid.common.f) obj2, "", localTime, localTime2));
                    }
                    hVar2.u = jVar;
                    hVar2.v = arrayList;
                    hVar2.w = localTime;
                    hVar2.x = localTime2;
                    hVar2.A = 1;
                    k kVar = this.a;
                    w wVar = (w) kVar.a.a(jVar);
                    Object O = y9.a.O(wVar, new a10.b(wVar, new j(kVar, jVar, arrayList3, cVar2, 0), (a71.c) null), hVar2);
                    if (O != b71.a.r) {
                        O = a0.a;
                    }
                    if (O != aVar) {
                        jVar2 = jVar;
                        arrayList2 = arrayList;
                        localTime3 = localTime;
                        localTime4 = localTime2;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar3 = hVar2.u;
                    y.j(obj);
                    return n1.y(new g(new y71.y(new y71.y((y71.i) obj, new d(this, jVar3, cVar2, 1), 6), new r(this, cVar2, 7)), 0), this.c);
                }
                localTime4 = hVar2.x;
                localTime3 = hVar2.w;
                arrayList2 = hVar2.v;
                jVar2 = hVar2.u;
                y.j(obj);
                u0 u0Var = (u0) this.b.a(jVar2);
                hVar2.u = jVar2;
                hVar2.v = null;
                hVar2.w = null;
                hVar2.x = null;
                hVar2.A = 2;
                obj = u0Var.e(arrayList2, localTime3, localTime4);
                if (obj != aVar) {
                    jVar3 = jVar2;
                    return n1.y(new g(new y71.y(new y71.y((y71.i) obj, new d(this, jVar3, cVar2, 1), 6), new r(this, cVar2, 7)), 0), this.c);
                }
                return aVar;
            }
        }
        hVar = new h(this, cVar);
        h hVar22 = hVar;
        obj = hVar22.y;
        aVar = b71.a.r;
        i = hVar22.A;
        a71.c cVar22 = null;
        if (i != 0) {
        }
        u0 u0Var2 = (u0) this.b.a(jVar2);
        hVar22.u = jVar2;
        hVar22.v = null;
        hVar22.w = null;
        hVar22.x = null;
        hVar22.A = 2;
        obj = u0Var2.e(arrayList2, localTime3, localTime4);
        if (obj != aVar) {
        }
        return aVar;
    }
    public Object j(Object p1) { return null; }
}
