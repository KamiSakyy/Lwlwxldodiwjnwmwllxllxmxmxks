package gk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sy.y;
import x61.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements e {
    public final j a;

    public g(j jVar) {
        k71.k.g(jVar, "repositoryLastVisitedUseCase");
        this.a = jVar;
    }

    public static oa.j b(ArrayList arrayList, oa.j jVar) {
        Object obj;
        Object next;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (k71.k.b(((oa.j) ((w61.k) obj).r).a, jVar != null ? jVar.a : null)) {
                break;
            }
        }
        if (obj != null) {
            return jVar;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (k71.k.i(((Number) ((w61.k) next).s).longValue(), ((Number) ((w61.k) next2).s).longValue()) < 0) {
                    next = next2;
                }
            }
        } else {
            next = null;
        }
        w61.k kVar = (w61.k) next;
        if (kVar != null) {
            return (oa.j) kVar.r;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0082, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d7 -> B:10:0x00e2). Please report as a decompilation issue!!! */
    @Override // gk.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, oa.j jVar, String str, String str2, a71.c cVar) {
        f fVar;
        int i;
        oa.j jVar2;
        int i2;
        ArrayList arrayList;
        oa.j jVar3;
        Iterator it;
        int i3;
        int i4;
        String str3;
        f fVar2;
        String str4;
        Object obj;
        oa.j jVar4 = jVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i5 = fVar.G;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fVar.G = i5 - Integer.MIN_VALUE;
                Object obj2 = fVar.E;
                b71.a aVar = b71.a.r;
                i = fVar.G;
                int i6 = 1;
                if (i != 0) {
                    y.j(obj2);
                    if (jVar4 != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (k71.k.b(((oa.j) obj).a, jVar4.a)) {
                                break;
                            }
                        }
                        jVar2 = (oa.j) obj;
                    }
                    jVar2 = (oa.j) m.U(list);
                    if (str == null || list.size() <= 1) {
                        return jVar2;
                    }
                    i2 = 0;
                    arrayList = new ArrayList();
                    jVar3 = jVar2;
                    it = list.iterator();
                    i3 = 0;
                    i4 = 0;
                    str3 = str;
                    fVar2 = fVar;
                    str4 = str2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = fVar.D;
                    int i8 = fVar.C;
                    int i9 = fVar.B;
                    oa.j jVar5 = fVar.A;
                    Iterator it3 = fVar.z;
                    Collection collection = fVar.y;
                    oa.j jVar6 = fVar.x;
                    String str5 = fVar.w;
                    String str6 = fVar.v;
                    oa.j jVar7 = fVar.u;
                    y.j(obj2);
                    int i11 = i7;
                    jVar4 = jVar7;
                    oa.j jVar8 = jVar6;
                    Iterator it4 = it3;
                    fVar2 = fVar;
                    str4 = str5;
                    ArrayList arrayList2 = collection;
                    int i12 = i9;
                    i3 = i8;
                    k kVar = (k) obj2;
                    w61.k kVar2 = kVar == null ? new w61.k(jVar5, kVar) : null;
                    if (kVar2 != null) {
                        arrayList2.add(kVar2);
                    }
                    i2 = i11;
                    i4 = i12;
                    it = it4;
                    arrayList = arrayList2;
                    str3 = str6;
                    jVar3 = jVar8;
                    i6 = 1;
                    if (it.hasNext()) {
                        oa.j jVar9 = (oa.j) it.next();
                        fVar2.u = jVar4;
                        fVar2.v = str3;
                        fVar2.w = str4;
                        fVar2.x = jVar3;
                        fVar2.y = arrayList;
                        fVar2.z = it;
                        fVar2.A = jVar9;
                        fVar2.B = i4;
                        fVar2.C = i3;
                        fVar2.D = i2;
                        fVar2.G = i6;
                        Object a = this.a.a(jVar9, str3, str4, fVar2);
                        if (a == aVar) {
                            return aVar;
                        }
                        str6 = str3;
                        obj2 = a;
                        jVar8 = jVar3;
                        arrayList2 = arrayList;
                        it4 = it;
                        i12 = i4;
                        i11 = i2;
                        jVar5 = jVar9;
                        k kVar3 = (k) obj2;
                        if (kVar3 == null) {
                        }
                        if (kVar2 != null) {
                        }
                        i2 = i11;
                        i4 = i12;
                        it = it4;
                        arrayList = arrayList2;
                        str3 = str6;
                        jVar3 = jVar8;
                        i6 = 1;
                        if (it.hasNext()) {
                            ArrayList<w61.k> arrayList3 = arrayList;
                            ArrayList arrayList4 = new ArrayList();
                            for (w61.k kVar4 : arrayList3) {
                                oa.j jVar10 = (oa.j) kVar4.r;
                                Long l = ((k) kVar4.s).a;
                                w61.k kVar5 = l != null ? new w61.k(jVar10, new Long(l.longValue())) : null;
                                if (kVar5 != null) {
                                    arrayList4.add(kVar5);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList();
                            for (w61.k kVar6 : arrayList3) {
                                oa.j jVar11 = (oa.j) kVar6.r;
                                Long l2 = ((k) kVar6.s).b;
                                w61.k kVar7 = l2 != null ? new w61.k(jVar11, new Long(l2.longValue())) : null;
                                if (kVar7 != null) {
                                    arrayList5.add(kVar7);
                                }
                            }
                            oa.j b = b(arrayList4, jVar4);
                            if (b != null) {
                                return b;
                            }
                            oa.j b2 = b(arrayList5, jVar4);
                            return b2 == null ? jVar3 : b2;
                        }
                    }
                }
            }
        }
        fVar = new f(this, (c71.c) cVar);
        Object obj22 = fVar.E;
        b71.a aVar2 = b71.a.r;
        i = fVar.G;
        int i62 = 1;
        if (i != 0) {
        }
    }
}
