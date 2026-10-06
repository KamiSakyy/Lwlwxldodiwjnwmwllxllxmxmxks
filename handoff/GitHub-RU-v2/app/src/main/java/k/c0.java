package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public final class c0 implements View.OnClickListener {

    /* renamed from: r, reason: collision with root package name */
    public View f27408r;

    /* renamed from: s, reason: collision with root package name */
    public String f27409s;

    /* renamed from: t, reason: collision with root package name */
    public Method f27410t;

    /* renamed from: u, reason: collision with root package name */
    public Context f27411u;

    public c0(View view, String str) {
        this.f27408r = view;
        this.f27409s = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f27410t == null) {
            View view2 = this.f27408r;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f27409s;
                if (context == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder v4 = f4.v("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    v4.append(view2.getClass());
                    v4.append(str);
                    throw new IllegalStateException(v4.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f27410t = method;
                        this.f27411u = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f27410t.invoke(this.f27411u, view);
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e5);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
