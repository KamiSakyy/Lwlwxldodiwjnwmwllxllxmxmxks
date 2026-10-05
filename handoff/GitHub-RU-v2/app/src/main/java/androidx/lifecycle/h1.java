package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2871a = sy.d0.o(new Class[]{Application.class, a1.class});

    /* renamed from: b, reason: collision with root package name */
    public static final List f2872b = sy.d0.n(a1.class);

    public static final Constructor a(Class cls, List list) {
        k71.k.g(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        k71.k.f(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            k71.k.f(parameterTypes, "getParameterTypes(...)");
            List g02 = x61.l.g0(parameterTypes);
            if (list.equals(g02)) {
                return constructor;
            }
            if (list.size() == g02.size() && g02.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final k1 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (k1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Failed to access " + cls, e5);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
