package k71;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements r71.b, d {
    public static final Map b;
    public final Class a;

    static {
        List r = x61.l.r(new Class[]{j71.a.class, j71.c.class, j71.e.class, j71.f.class, j71.g.class, j71.h.class, j71.i.class, r1.c.class, j71.j.class, r1.c.class, r1.c.class, r1.c.class, j71.b.class, r1.c.class, r1.c.class, r1.c.class, r1.c.class, r1.c.class, r1.c.class, r1.c.class, r1.c.class, r1.c.class, j71.d.class});
        ArrayList arrayList = new ArrayList(x61.n.F(r, 10));
        int i = 0;
        for (Object obj : r) {
            int i2 = i + 1;
            if (i < 0) {
                d0.x();
                throw null;
            }
            arrayList.add(new w61.k((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = x61.x.A(arrayList);
    }

    public e(Class cls) {
        k.g(cls, "jClass");
        this.a = cls;
    }

    @Override // k71.d
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String d;
        Class cls = this.a;
        k.g(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String d2 = z.d(cls.getName());
            return d2 == null ? cls.getCanonicalName() : d2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (d = z.d(componentType.getName())) != null) {
            str = d.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String c() {
        String g;
        Class cls = this.a;
        k.g(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String g2 = z.g(cls.getName());
                return g2 == null ? cls.getSimpleName() : g2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (g = z.g(componentType.getName())) != null) {
                str = g.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return t71.p.l0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return t71.p.k0('$', simpleName, simpleName);
        }
        return t71.p.l0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean d(Object obj) {
        Class cls = this.a;
        k.g(cls, "jClass");
        Map map = b;
        k.e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return z.e(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = l0.y(x.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && l0.y(this).equals(l0.y((r71.b) obj));
    }

    public final int hashCode() {
        return l0.y(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
    public Object c(Object p1, Object p2, Object p3) { return null; }
    public Object j() { return null; }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
