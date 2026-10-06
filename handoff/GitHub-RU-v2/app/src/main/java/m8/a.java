package m8;

import android.app.Activity;
import java.lang.reflect.Proxy;
import k71.k;
import n8.d;
import n8.e;
import r8.b;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public ClassLoader f29082a;

    public a(ClassLoader classLoader, int i) {
        switch (i) {
            case 1:
                k.g(classLoader, "loader");
                this.f29082a = classLoader;
                break;
            default:
                this.f29082a = classLoader;
                break;
        }
    }

    public e a(Object obj, k71.e eVar, Activity activity, b bVar) {
        d dVar = new d(eVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.f29082a, new Class[]{b()}, dVar);
        k.f(newProxyInstance, "newProxyInstance(...)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new e(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f29082a.loadClass("java.util.function.Consumer");
        k.f(loadClass, "loadClass(...)");
        return loadClass;
    }
}
