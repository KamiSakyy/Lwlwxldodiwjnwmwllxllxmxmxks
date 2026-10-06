package kj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import t00.f8;
import z01.p1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public oa.g a;

    public w(oa.g gVar) {
        k71.k.g(gVar, "userAccountInfoService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:10:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, cd0.a aVar, c71.c cVar) {
        t tVar;
        int i;
        Collection arrayList;
        int i2;
        Iterator it;
        int i3;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i4 = tVar.D;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tVar.D = i4 - Integer.MIN_VALUE;
                Object obj = tVar.B;
                Object obj2 = b71.a.r;
                i = tVar.D;
                if (i != 0) {
                    sy.y.j(obj);
                    arrayList = new ArrayList(x61.n.F(list, 10));
                    i2 = 0;
                    it = list.iterator();
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = tVar.A;
                    int i5 = tVar.z;
                    Collection collection = tVar.y;
                    oa.j jVar = tVar.x;
                    Iterator it2 = tVar.w;
                    Collection collection2 = tVar.v;
                    cd0.a aVar2 = tVar.u;
                    sy.y.j(obj);
                    int i6 = i5;
                    aVar = aVar2;
                    Iterator it3 = it2;
                    oa.j jVar2 = jVar;
                    Collection collection3 = collection2;
                    collection.add(new dn.o((y71.i) obj, jVar2, 1));
                    i2 = i6;
                    arrayList = collection3;
                    it = it3;
                    if (it.hasNext()) {
                        oa.j jVar3 = (oa.j) it.next();
                        tVar.u = aVar;
                        Collection collection4 = arrayList;
                        tVar.v = collection4;
                        tVar.w = it;
                        tVar.x = jVar3;
                        tVar.y = collection4;
                        tVar.z = i2;
                        tVar.A = i3;
                        tVar.D = 1;
                        Object b = b(jVar3, aVar, tVar);
                        if (b == obj2) {
                            return obj2;
                        }
                        it3 = it;
                        jVar2 = jVar3;
                        i6 = i2;
                        collection = arrayList;
                        obj = b;
                        collection3 = collection;
                        collection.add(new dn.o((y71.i) obj, jVar2, 1));
                        i2 = i6;
                        arrayList = collection3;
                        it = it3;
                        if (it.hasNext()) {
                            f8 f8Var = new f8(20, (List) arrayList);
                            int i7 = y71.n0.a;
                            if (i7 <= 0) {
                                throw new IllegalArgumentException(no.a.k("Expected positive concurrency level, but had ", i7).toString());
                            }
                            if (i7 == 1) {
                                return new y00.l(f8Var, 9);
                            }
                            return new z71.f(f8Var, i7, a71.i.r, -2, x71.a.r);
                        }
                    }
                }
            }
        }
        tVar = new t(this, cVar);
        Object obj3 = tVar.B;
        Object obj22 = b71.a.r;
        i = tVar.D;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oa.j jVar, j71.c cVar, c71.c cVar2) {
        v vVar;
        int i;
        if (cVar2 instanceof v) {
            vVar = (v) cVar2;
            int i2 = vVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.y = i2 - Integer.MIN_VALUE;
                Object obj = vVar.w;
                b71.a aVar = b71.a.r;
                i = vVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    p1 p1Var = (p1) this.a.a(jVar);
                    vVar.u = jVar;
                    vVar.v = cVar;
                    vVar.y = 1;
                    obj = p1Var.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = vVar.v;
                    jVar = vVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        vVar = new v(this, cVar2);
        Object obj2 = vVar.w;
        b71.a aVar2 = b71.a.r;
        i = vVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
