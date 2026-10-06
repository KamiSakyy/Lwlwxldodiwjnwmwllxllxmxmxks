package b6;

import android.app.Application;
import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: /home/user/work/p/classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ r71.e[] f3609a;

    static {
        r71.e qVar = new k71.q(l0.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        k71.x.a.getClass();
        f3609a = new r71.e[]{qVar};
    }

    public static final String a(l0 l0Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(null, null);
        k71.k.e(invoke, "null cannot be cast to non-null type kotlin.String");
        return (String) invoke;
    }

    public static final s5.e b(l0 l0Var, String str) {
        l0Var.getClass();
        return b91.g.Q("provider:" + str);
    }
    public Object t(Object p1) { return null; }
}
