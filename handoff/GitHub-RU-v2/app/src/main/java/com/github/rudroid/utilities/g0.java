package com.github.rudroid.utilities;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public static final d0 a(String str) {
        k71.k.g(str, "text");
        g3.d dVar = new g3.d(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        g3.g k = dVar.k();
        String str2 = k.s;
        i0.a.f(k, new com.github.rudroid.repositories.repositoryownerrepositories.d(15, linkedHashMap2, linkedHashMap));
        g3.d dVar2 = new g3.d();
        Iterator it = x61.m.v0(linkedHashMap2.keySet(), new e0()).iterator();
        int i = 0;
        while (it.hasNext()) {
            long j = ((g3.p0) it.next()).a;
            if (i < str2.length()) {
                String str3 = (String) linkedHashMap2.get(new g3.p0(j));
                if (str3 == null) {
                    str3 = "";
                }
                dVar2.d(k.e(i, (int) (j >> 32)));
                s0.s.p(dVar2, str3, str3);
                i = ((int) (j & 4294967295L)) + 1;
            }
        }
        if (i < str2.length()) {
            dVar2.d(k.e(i, str2.length()));
        }
        return new d0(dVar2.k(), linkedHashMap);
    }

    public static final d0 b(g3.g gVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str = gVar.s;
        int i = 0;
        for (g3.e eVar : gVar.b(0, "image_key", str.length())) {
            String str2 = (String) eVar.a;
            linkedHashMap2.put(new g3.p0(g3.g0.b(eVar.b, eVar.c)), str2);
            float f = 1;
            linkedHashMap.put(str2, new s0.f0(new g3.w(y41.t1.E(f, 8589934592L), y41.t1.E(f, 8589934592L)), new r1.d(new ab.m(str2, 11), true, 1384735065)));
        }
        g3.d dVar = new g3.d();
        Iterator it = x61.m.v0(linkedHashMap2.keySet(), new f0()).iterator();
        while (it.hasNext()) {
            long j = ((g3.p0) it.next()).a;
            if (i < str.length()) {
                String str3 = (String) linkedHashMap2.get(new g3.p0(j));
                if (str3 == null) {
                    str3 = "";
                }
                dVar.d(gVar.e(i, (int) (j >> 32)));
                s0.s.p(dVar, str3, str3);
                i = (int) (j & 4294967295L);
            }
        }
        if (i < str.length()) {
            dVar.d(gVar.e(i, str.length()));
        }
        return new d0(dVar.k(), linkedHashMap);
    }
}
