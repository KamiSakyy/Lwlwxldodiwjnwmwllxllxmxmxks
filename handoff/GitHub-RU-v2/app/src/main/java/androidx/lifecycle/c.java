package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2832a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public HashMap f2833b;

    public c(HashMap hashMap) {
        this.f2833b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            v vVar = (v) entry.getValue();
            List list = (List) this.f2832a.get(vVar);
            if (list == null) {
                list = new ArrayList();
                this.f2832a.put(vVar, list);
            }
            list.add((d) entry.getKey());
        }
    }

    public static void a(List list, c0 c0Var, v vVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                d dVar = (d) list.get(size);
                Method method = dVar.f2835b;
                try {
                    int i = dVar.f2834a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, c0Var);
                    } else if (i == 2) {
                        method.invoke(obj, c0Var, vVar);
                    }
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
    public Object v(Object p1) { return null; }
    public Object v(Object) { return null; }
}
