package q;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f30635a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f30636b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f30637c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f30638d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f30635a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f30636b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f30637c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f30638d = true;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        }
    }
}
