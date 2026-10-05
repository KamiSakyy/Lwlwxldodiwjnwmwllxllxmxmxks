package m61;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.a0;
import androidx.fragment.app.e0;
import com.github.rudroid.l0;
import com.github.rudroid.r;
import com.github.rudroid.s;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements o61.b {
    public final /* synthetic */ int r = 1;
    public final Object s = new Object();
    public volatile o61.a t;
    public final Object u;

    public f(y51.c cVar) {
        this.u = cVar;
    }

    public static final Context c(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public com.github.rudroid.e a() {
        a0 a0Var = (a0) this.u;
        e0 e0Var = a0Var.N;
        if ((e0Var == null ? null : e0Var.v) == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        i4.S((e0Var == null ? null : e0Var.v) instanceof o61.b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", (e0Var == null ? null : e0Var.v).getClass());
        e0 e0Var2 = a0Var.N;
        com.github.rudroid.b bVar = (g) k41.b.v(g.class, e0Var2 != null ? e0Var2.v : null);
        return new com.github.rudroid.e(bVar.b, bVar.c, bVar.d);
    }

    public s b() {
        com.github.rudroid.webview.viewholders.j jVar = (com.github.rudroid.webview.viewholders.j) this.u;
        Context context = jVar.getContext();
        while ((context instanceof ContextWrapper) && !o61.b.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Application t = com.google.common.util.concurrent.a.t(context.getApplicationContext());
        Object obj = context;
        if (context == t) {
            i4.S(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", jVar.getClass());
            obj = null;
        }
        if (obj instanceof o61.b) {
            com.github.rudroid.b bVar = (k) k41.b.v(k.class, (o61.b) obj);
            return new s(bVar.b, bVar.c);
        }
        throw new IllegalStateException(jVar.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    @Override // o61.b
    public final Object w() {
        switch (this.r) {
            case 0:
                if (this.t == null) {
                    synchronized (this.s) {
                        try {
                            if (this.t == null) {
                                this.t = new r(new a7.d((l0) ((y51.c) this.u).s, (short) 0), new xf.b());
                            }
                        } finally {
                        }
                    }
                }
                return this.t;
            case 1:
                if (this.t == null) {
                    synchronized (this.s) {
                        try {
                            if (this.t == null) {
                                this.t = a();
                            }
                        } finally {
                        }
                    }
                }
                return this.t;
            default:
                if (this.t == null) {
                    synchronized (this.s) {
                        try {
                            if (this.t == null) {
                                this.t = b();
                            }
                        } finally {
                        }
                    }
                }
                return this.t;
        }
    }

    public f(a0 a0Var) {
        this.u = a0Var;
    }

    public f(com.github.rudroid.webview.viewholders.j jVar) {
        this.u = jVar;
    }


}
