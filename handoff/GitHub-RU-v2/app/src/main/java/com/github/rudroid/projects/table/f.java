package com.github.rudroid.projects.table;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.lang.Object] */
    public static com.github.rudroid.common.y a(l01.n0 n0Var, l01.l0 l0Var, int i, boolean z10) {
        ?? r82 = n0Var.b;
        ArrayList arrayList = new ArrayList(x61.n.F((Iterable) r82, 10));
        for (l01.v vVar : r82) {
            l01.p0 p0Var = vVar.a;
            Map map = p0Var.v;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (l0Var.x.contains(((l01.y) entry.getKey()).r)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            final e eVar = new e(l0Var);
            TreeMap treeMap = new TreeMap(new Comparator() { // from class: com.github.rudroid.projects.table.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) eVar.s(obj, obj2)).intValue();
                }
            });
            treeMap.putAll(linkedHashMap);
            arrayList.add(new l01.v(l01.p0.c(p0Var, treeMap), vVar.b, vVar.c));
        }
        return new com.github.rudroid.common.y(i, arrayList, z10);
    }

    public static vb.g b(jl.a aVar, Map map) {
        k71.k.g(aVar, "projectViewData");
        k71.k.g(map, "groupExpandedState");
        p pVar = new p(4, map);
        List list = aVar.c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            vb.a aVar2 = (vb.a) obj;
            if (!atomicBoolean.getAndSet(!aVar2.a() || ((Boolean) pVar.k(aVar2)).booleanValue())) {
                break;
            }
            arrayList.add(obj);
        }
        vb.a aVar3 = (vb.a) x61.m.f0(arrayList);
        return new vb.g(arrayList, (aVar3 == null || !aVar3.a() || ((Boolean) pVar.k(aVar3)).booleanValue()) ? aVar.f ? new vb.c(aVar.b.r) : null : new vb.d(aVar3.getGroupId()));
    }
}
