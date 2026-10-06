package k71;

import java.util.Collections;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x {
    public static final y a;

    static {
        y yVar = null;
        try {
            yVar = (y) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (yVar == null) {
            yVar = new y();
        }
        a = yVar;
    }

    public static e a(Class cls) {
        a.getClass();
        return new e(cls);
    }

    public static a0 b(Class cls) {
        e a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new a0(a2, true);
    }

    public static a0 c(Class cls) {
        e a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new a0(a2, false);
    }

    public static Object a;
    public Object values() { return null; }
}
