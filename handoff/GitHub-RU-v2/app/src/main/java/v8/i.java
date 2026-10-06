package v8;

import com.github.rudroid.copilot.h1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f32789b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f32790a;

    static {
        i iVar = new i(new LinkedHashMap());
        sy.t.r(iVar);
        f32789b = iVar;
    }

    public i(i iVar) {
        k71.k.g(iVar, "other");
        this.f32790a = new HashMap(iVar.f32790a);
    }

    public final String a(String str) {
        Object obj = this.f32790a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean b(String str) {
        Object obj = this.f32790a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && i.class.equals(obj.getClass())) {
                HashMap hashMap = ((i) obj).f32790a;
                HashMap hashMap2 = this.f32790a;
                Set<String> keySet = hashMap2.keySet();
                if (k71.k.b(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 == null || obj3 == null) {
                            z10 = obj2 == obj3;
                        } else {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z10 = x61.l.u(objArr, (Object[]) obj3);
                                }
                            }
                            z10 = obj2.equals(obj3);
                        }
                        if (!z10) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.f32790a.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final String toString() {
        return h1.p(new StringBuilder("Data {"), x61.m.c0(this.f32790a.entrySet(), (String) null, (String) null, (String) null, 0, new v00.n(6), 31), "}");
    }

    public i(LinkedHashMap linkedHashMap) {
        k71.k.g(linkedHashMap, "values");
        this.f32790a = new HashMap(linkedHashMap);
    }

    public static v8.i b;

    public static Object b;
    public Object a = null;
}
