package com.apollographql.apollo.internal;

import aa.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k71.k;
import k71.z;
import x61.m;
import x61.x;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public LinkedHashMap f4287a;

    /* renamed from: b, reason: collision with root package name */
    public LinkedHashMap f4288b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedHashSet f4289c;

    /* renamed from: d, reason: collision with root package name */
    public LinkedHashSet f4290d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4291e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4292f;

    public a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4287a = linkedHashMap;
        this.f4288b = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f4289c = linkedHashSet;
        this.f4290d = linkedHashSet;
        this.f4291e = true;
    }

    public static void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                if ((obj instanceof Map) && (!(obj instanceof l71.a) || (obj instanceof l71.e))) {
                    Object obj2 = map.get(str);
                    k.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    Map b10 = z.b(obj2);
                    Map map3 = value instanceof Map ? (Map) value : null;
                    if (map3 == null) {
                        throw new IllegalStateException(("'" + str + "' is an object in destination but not in map").toString());
                    }
                    a(b10, map3);
                }
            }
            map.put(str, value);
        }
    }

    public final LinkedHashMap b(Map map) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Object obj;
        LinkedHashMap linkedHashMap3 = this.f4288b;
        boolean isEmpty = linkedHashMap3.isEmpty();
        LinkedHashMap linkedHashMap4 = this.f4287a;
        if (isEmpty) {
            linkedHashMap4.putAll(map);
            return linkedHashMap3;
        }
        Object obj2 = map.get("incremental");
        List<Map> list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            this.f4292f = true;
            linkedHashMap = linkedHashMap3;
        } else {
            this.f4292f = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map map2 : list) {
                Map map3 = (Map) map2.get("data");
                Object obj3 = map2.get("path");
                k.e(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj3;
                Object obj4 = linkedHashMap3.get("data");
                k.e(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                Object obj5 = (Map) obj4;
                if (map3 != null) {
                    for (Object obj6 : list2) {
                        LinkedHashMap linkedHashMap5 = linkedHashMap3;
                        if (obj5 instanceof List) {
                            k.e(obj6, "null cannot be cast to non-null type kotlin.Int");
                            obj = ((List) obj5).get(((Integer) obj6).intValue());
                        } else {
                            k.e(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            obj = ((Map) obj5).get(obj6);
                        }
                        obj5 = obj;
                        linkedHashMap3 = linkedHashMap5;
                    }
                    linkedHashMap2 = linkedHashMap3;
                    k.e(obj5, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    a(z.b(obj5), map3);
                    this.f4289c.add(new y(list2, (String) map2.get("label")));
                } else {
                    linkedHashMap2 = linkedHashMap3;
                }
                Object obj7 = map2.get("errors");
                List list3 = obj7 instanceof List ? (List) obj7 : null;
                if (list3 != null) {
                    m.J(arrayList, list3);
                }
                Object obj8 = map2.get("extensions");
                Map map4 = obj8 instanceof Map ? (Map) obj8 : null;
                if (map4 != null) {
                    arrayList2.add(map4);
                }
                linkedHashMap3 = linkedHashMap2;
            }
            linkedHashMap = linkedHashMap3;
            if (arrayList.isEmpty()) {
                linkedHashMap4.remove("errors");
            } else {
                linkedHashMap4.put("errors", arrayList);
            }
            if (arrayList2.isEmpty()) {
                linkedHashMap4.remove("extensions");
            } else {
                linkedHashMap4.put("extensions", x.t(new w61.k("incremental", arrayList2)));
            }
        }
        Boolean bool = (Boolean) map.get("hasNext");
        this.f4291e = bool != null ? bool.booleanValue() : false;
        return linkedHashMap;
    }
    public com.apollographql.apollo.internal.a e = null;
    public com.apollographql.apollo.internal.a f = null;
}
