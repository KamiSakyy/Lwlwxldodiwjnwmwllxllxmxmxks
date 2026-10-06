package com.github.rudroid.utilities.ui.emojipicker;

import com.github.rudroid.y;
import com.github.rudroid.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final LinkedHashMap a;
    public static final LinkedHashMap b;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a A[SYNTHETIC] */
    static {
        y yVar;
        Iterator it;
        int charCount;
        u5.t tVar;
        LinkedHashMap x = x.x((Map) u.a.getValue(), (Map) z.a.getValue());
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.s(x.size()));
        Iterator it2 = x.entrySet().iterator();
        while (true) {
            int i = 1;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            y yVar2 = (y) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!u.b.contains(((w61.k) obj).r)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                String str = (String) ((w61.k) obj2).s;
                if (yVar2 == y.r) {
                    it = it2;
                } else {
                    if (u5.i.d() && u5.i.a().c() == i) {
                        u5.i a2 = u5.i.a();
                        sy.pShadow.j("Not initialized yet", a2.e());
                        sy.pShadow.i(str, "sequence cannot be null");
                        u5.n nVar = new u5.n((u5.q) ((w51.r) ((l51.h) a2.d.a).t).u);
                        int length = str.length();
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int codePointAt = Character.codePointAt(str, i3);
                            int a3 = nVar.a(codePointAt);
                            Iterator it3 = it2;
                            u5.t tVar2 = nVar.c.b;
                            if (a3 == 1) {
                                charCount = Character.charCount(codePointAt);
                            } else if (a3 != 2) {
                                if (a3 == 3) {
                                    tVar = nVar.d.b;
                                    if (tVar.b() <= 2147483647) {
                                        i4++;
                                    }
                                    if (tVar != null) {
                                        tVar.b();
                                    }
                                    it2 = it3;
                                }
                                tVar = tVar2;
                                if (tVar != null) {
                                }
                                it2 = it3;
                            } else {
                                charCount = Character.charCount(codePointAt);
                            }
                            i3 += charCount;
                            tVar = tVar2;
                            if (tVar != null) {
                            }
                            it2 = it3;
                        }
                        it = it2;
                        if (i4 == 0) {
                            if (nVar.a == 2) {
                                if (nVar.c.b != null) {
                                    if (nVar.f <= 1) {
                                        if (!nVar.c()) {
                                        }
                                    }
                                    if (nVar.c.b.b() > 2147483647) {
                                    }
                                }
                            }
                        }
                    } else {
                        it = it2;
                    }
                    it2 = it;
                    i = 1;
                }
                arrayList2.add(obj2);
                it2 = it;
                i = 1;
            }
            linkedHashMap.put(key, arrayList2);
        }
        a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(x.s(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            y yVar3 = (y) entry2.getKey();
            List list2 = (List) entry2.getValue();
            LinkedHashMap linkedHashMap3 = a;
            Iterator it4 = linkedHashMap3.keySet().iterator();
            int i5 = 0;
            while (it4.hasNext() && (yVar = (y) it4.next()) != yVar3) {
                List list3 = (List) linkedHashMap3.get(yVar);
                i5 = i5 + (list3 != null ? list3.size() : 0) + 1;
            }
            linkedHashMap2.put(key2, new q71.g(i5, list2.size() + i5, 1));
        }
        b = linkedHashMap2;
    }
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object B(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
    public static Object x(Object p1, Object p2) { return null; }
}
