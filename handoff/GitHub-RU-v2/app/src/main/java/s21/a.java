package s21;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k71.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s1.d;
import sy.u;
import t41.b;
import u81.g;
import u81.n;
import u81.o;
import u81.q;
import u81.r;
import v2.g0;
import v2.t;
import v2.v1;
import v41.j;
import v41.l;
import v41.p;
import v41.x;
import w21.e;
import w21.f;
import w7.c;
import x.z;
import x1.h;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements b, u41.a, t41.a, g, f, d, e, v7.b {
    public final /* synthetic */ int r;
    public Object s;

    public /* synthetic */ a(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public static boolean p(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String v(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static void w(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public n a() {
        r b;
        IOException iOException = null;
        while (!((o) this.s).l.H) {
            try {
                b = ((o) this.s).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    u.a(iOException, e);
                }
                if (!((o) this.s).a((n) null)) {
                    throw iOException;
                }
            }
            if (!b.a()) {
                q e2 = b.e();
                if (e2.b == null && e2.c == null) {
                    e2 = b.g();
                }
                r rVar = e2.b;
                Throwable th = e2.c;
                if (th != null) {
                    throw th;
                }
                if (rVar != null) {
                    ((o) this.s).q.addFirst(rVar);
                }
            }
            return b.c();
        }
        throw new IOException("Canceled");
    }

    public o b() {
        return (o) this.s;
    }

    @Override // u41.a
    public void c(v41.o oVar) {
        this.s = oVar;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // t41.b
    public void d(String str, Bundle bundle) {
        v41.o oVar = (v41.o) this.s;
        if (oVar != null) {
            try {
                String str2 = "$A$:" + v(str, bundle);
                p pVar = oVar.a;
                pVar.p.a.a(new v41.n(pVar, System.currentTimeMillis() - pVar.d, str2, 0));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // w21.e
    public void e(Object obj) {
        ((w21.g) ((a) this.s).s).a.n();
    }

    @Override // w21.f
    public w21.o f(Object obj) {
        switch (this.r) {
            case 15:
                d51.b bVar = (d51.b) obj;
                l lVar = ((j) this.s).e;
                return bVar == null ? t.q.k((Object) null) : t.q.u(Arrays.asList(l.a(lVar), lVar.m.l(null, lVar.e.a)));
            default:
                d51.b bVar2 = (d51.b) obj;
                t tVar = (t) this.s;
                if (bVar2 == null) {
                    return t.q.k((Object) null);
                }
                l lVar2 = (l) tVar.t;
                l.a(lVar2);
                lVar2.m.l(null, lVar2.e.a);
                lVar2.q.c(null);
                return t.q.k((Object) null);
        }
    }

    public v7.a g(String str) {
        k.g(str, "fileName");
        c cVar = (c) this.s;
        String databaseName = cVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                throw new IllegalArgumentException(f1.e.z("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested.").toString());
            }
        } else if (!databaseName.equals(str) && !t71.p.m0('/', databaseName, databaseName).equals(t71.p.m0('/', str, str))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + cVar.getDatabaseName() + "' but '" + str + "' was requested.").toString());
        }
        return new x7.a(cVar.f0());
    }

    @Override // t41.a
    public void h(Bundle bundle) {
        ((m41.b) ((m41.a) this.s)).a("clx", "_ae", bundle);
    }

    public void i(g0 g0Var) {
        if (!g0Var.I()) {
            t2.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((v1) this.s).add(g0Var);
    }

    public boolean j() {
        return true;
    }

    public boolean k(String str) {
        String o = o(str);
        return "1".equals(o) || Boolean.parseBoolean(o);
    }

    public Integer l(String str) {
        String o = o(str);
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(o));
        } catch (NumberFormatException unused) {
            w(str);
            return null;
        }
    }

    public JSONArray m(String str) {
        String o = o(str);
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        try {
            return new JSONArray(o);
        } catch (JSONException unused) {
            w(str);
            return null;
        }
    }

    public String n(Resources resources, String str, String str2) {
        String[] strArr;
        String o = o(str2);
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        String o2 = o(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(o2)) {
            return null;
        }
        int identifier = resources.getIdentifier(o2, "string", str);
        if (identifier == 0) {
            w(str2.concat("_loc_key"));
            return null;
        }
        JSONArray m = m(str2.concat("_loc_args"));
        if (m == null) {
            strArr = null;
        } else {
            int length = m.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = m.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            w(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public String o(String str) {
        Bundle bundle = (Bundle) this.s;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public void q(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            h.a(view, (AutofillManager) this.s, i, z);
        }
    }

    public void r(d51.d dVar, Thread thread, Throwable th) {
        w21.o f;
        l lVar = (l) this.s;
        synchronized (lVar) {
            Objects.toString(th);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            long currentTimeMillis = System.currentTimeMillis();
            w41.b bVar = lVar.e.a;
            j jVar = new j(lVar, currentTimeMillis, th, thread, dVar);
            synchronized (bVar.s) {
                f = bVar.t.f(bVar.r, new c5.b(27, jVar));
                bVar.t = f;
            }
            try {
                x.a(f);
            } catch (TimeoutException | Exception unused) {
            }
        }
    }

    public Bundle s() {
        Bundle bundle = (Bundle) this.s;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void t(n41.b bVar) {
        k1 k1Var = (k1) this.s;
        ArrayList arrayList = k1Var.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i)).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            h1 h1Var = new h1(bVar);
            arrayList.add(new Pair(bVar, h1Var));
            if (k1Var.f != null) {
                try {
                    k1Var.f.registerOnMeasurementEventListener(h1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            k1Var.a(new x0(k1Var, h1Var, 4));
        }
    }

    public String toString() {
        switch (this.r) {
            case 13:
                return ((v1) this.s).toString();
            default:
                return super.toString();
        }
    }

    public boolean u(g0 g0Var) {
        if (!g0Var.I()) {
            t2.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((v1) this.s).remove(g0Var);
    }

    public /* synthetic */ a(int i, boolean z) {
        this.r = i;
    }

    public a(int i) {
        this.r = i;
        switch (i) {
            case 13:
                this.s = new v1(v2.l.a);
                break;
            case 18:
                s1.c cVar = new s1.c();
                this.s = cVar;
                if (!cVar.s) {
                    if (cVar.t) {
                        t1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.t = true;
                    break;
                }
                break;
            case 19:
                this.s = new a(21);
                break;
            case 21:
                this.s = new w21.o();
                break;
            case 26:
                this.s = sy.oShadow.d(Looper.getMainLooper());
                break;
            default:
                this.s = new LinkedHashSet();
                break;
        }
    }

    public a(c cVar) {
        this.r = 28;
        k.g(cVar, "openHelper");
        this.s = cVar;
    }

    public a(Bundle bundle) {
        this.r = 25;
        this.s = new Bundle(bundle);
    }

    public a(TextView textView) {
        this.r = 17;
        this.s = new v5.g(textView);
    }

    public a(long[] jArr) {
        z zVar;
        this.r = 12;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            zVar = new z(copyOf.length);
            int i = zVar.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = zVar.a;
                    if (jArr2.length < length) {
                        long[] copyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        k.f(copyOf2, "copyOf(...)");
                        zVar.a = copyOf2;
                    }
                    long[] jArr3 = zVar.a;
                    int i2 = zVar.b;
                    if (i != i2) {
                        x61.l.z(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    x61.l.z(copyOf, jArr3, i, 0, copyOf.length);
                    zVar.b += copyOf.length;
                }
            } else {
                y.a.d("");
                throw null;
            }
        } else {
            zVar = new z(16);
        }
        this.s = zVar;
    }

    public a(j jVar, String str) {
        this.r = 15;
        this.s = jVar;
    }

    public a(r81.f fVar) {
        this.r = 7;
        this.s = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new SynchronousQueue(), (ThreadFactory) fVar);
    }

}
