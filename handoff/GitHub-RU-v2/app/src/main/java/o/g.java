package o;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: t, reason: collision with root package name */
    public static final Class[] f29739t = {MenuItem.class};

    /* renamed from: r, reason: collision with root package name */
    public Object f29740r;

    /* renamed from: s, reason: collision with root package name */
    public Method f29741s;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f29740r;
        Method method = this.f29741s;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
