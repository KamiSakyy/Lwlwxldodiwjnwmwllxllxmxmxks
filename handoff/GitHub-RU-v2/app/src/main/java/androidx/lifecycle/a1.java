package androidx.lifecycle;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2820a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f2821b;

    public a1(y61.e eVar) {
        this.f2820a = new LinkedHashMap();
        this.f2821b = new l1((Map) eVar);
    }

    public final Object a(String str) {
        Object value;
        k71.k.g(str, "key");
        l1 l1Var = this.f2821b;
        l1Var.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) l1Var.f2899r;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) l1Var.f2902u;
        try {
            y1 y1Var = (y71.g1) linkedHashMap2.get(str);
            if (y1Var != null && (value = y1Var.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) l1Var.f2901t).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final y71.i1 b(String str) {
        l1 l1Var = this.f2821b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) l1Var.f2902u;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) l1Var.f2899r;
        if (linkedHashMap.containsKey(str)) {
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) l1Var.f2902u;
            Object obj = linkedHashMap3.get(str);
            if (obj == null) {
                if (!linkedHashMap2.containsKey(str)) {
                    linkedHashMap2.put(str, null);
                }
                obj = y71.n1.c(linkedHashMap2.get(str));
                linkedHashMap3.put(str, obj);
            }
            return new y71.i1((y71.g1) obj);
        }
        LinkedHashMap linkedHashMap4 = (LinkedHashMap) l1Var.f2901t;
        Object obj2 = linkedHashMap4.get(str);
        if (obj2 == null) {
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, null);
            }
            obj2 = y71.n1.c(linkedHashMap2.get(str));
            linkedHashMap4.put(str, obj2);
        }
        return new y71.i1((y71.g1) obj2);
    }

    public final void c(Object obj, String str) {
        if (obj != null) {
            ArrayList arrayList = s6.a.f31720a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((Class) obj2).isInstance(obj)) {
                    }
                }
            }
            throw new IllegalArgumentException(("Can't put value with type " + obj.getClass() + " into saved state").toString());
        }
        ArrayList arrayList2 = s6.a.f31720a;
        Object obj3 = this.f2820a.get(str);
        p0 p0Var = obj3 instanceof p0 ? (p0) obj3 : null;
        if (p0Var != null) {
            p0Var.j(obj);
        }
        this.f2821b.E(obj, str);
    }

    public a1() {
        this.f2820a = new LinkedHashMap();
        this.f2821b = new l1((Map) x61.s.r);
    }

}
