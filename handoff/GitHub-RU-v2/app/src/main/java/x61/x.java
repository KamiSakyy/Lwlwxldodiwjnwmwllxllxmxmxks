package x61;

import com.github.rudroid.copilot.h1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import sy.e0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x extends e0 {
    public static Map A(List list) {
        k71.k.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return s.r;
        }
        if (size == 1) {
            return t((w61.k) list.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s(list.size()));
        k71.k.g(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w61.k kVar = (w61.k) it.next();
            linkedHashMap.put(kVar.r, kVar.s);
        }
        return linkedHashMap;
    }

    public static Map B(Map map) {
        k71.k.g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? C(map) : D(map) : s.r;
    }

    public static LinkedHashMap C(Map map) {
        k71.k.g(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map D(Map map) {
        k71.k.g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        k71.k.f(singletonMap, "with(...)");
        return singletonMap;
    }

    public static Object r(Object obj, Map map) {
        k71.k.g(map, "<this>");
        if (map instanceof w) {
            return ((w) map).o();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(h1.l(obj, "Key ", " is missing in the map."));
    }

    public static int s(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map t(w61.k kVar) {
        k71.k.g(kVar, "pair");
        Map singletonMap = Collections.singletonMap(kVar.r, kVar.s);
        k71.k.f(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map u(w61.k... kVarArr) {
        if (kVarArr.length <= 0) {
            return s.r;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s(kVarArr.length));
        z(linkedHashMap, kVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap v(w61.k... kVarArr) {
        k71.k.g(kVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(s(kVarArr.length));
        z(linkedHashMap, kVarArr);
        return linkedHashMap;
    }

    public static final Map w(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? linkedHashMap : D(linkedHashMap) : s.r;
    }

    public static LinkedHashMap x(Map map, Map map2) {
        k71.k.g(map, "<this>");
        k71.k.g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map y(Map map, w61.k kVar) {
        k71.k.g(map, "<this>");
        if (map.isEmpty()) {
            return t(kVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(kVar.r, kVar.s);
        return linkedHashMap;
    }

    public static final void z(HashMap hashMap, w61.k[] kVarArr) {
        k71.k.g(kVarArr, "pairs");
        for (w61.k kVar : kVarArr) {
            hashMap.put(kVar.r, kVar.s);
        }
    }





}
