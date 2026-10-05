package w51;

import a5.c1;
import a61.n0;
import android.R;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.a1;
import androidx.fragment.app.d1;
import androidx.fragment.app.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.r1;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.viewpager2.widget.ViewPager2;
import c21.f0;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.r9;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.w3;
import d1.c2;
import h91.i0;
import h91.j0;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import jo.f4;
import kotlinx.serialization.KSerializer;
import l7.w0;
import n5.k0;
import n5.o0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v8.l0;
import x.q0;
import y71.y1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements j0, o.a {
    public static r w;
    public static r x;
    public final /* synthetic */ int r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
    }

    public static synchronized r C() {
        r rVar;
        synchronized (r.class) {
            try {
                if (w == null) {
                    w = new r(0);
                }
                rVar = w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public static r D() {
        if (x == null) {
            x = new r(28);
        }
        return x;
    }

    public static void L(r rVar, u81.j jVar, u81.m mVar, u81.j jVar2, int i) {
        ni.a aVar;
        u81.j w2;
        if ((i & 1) != 0) {
            jVar = null;
        }
        if ((i & 2) != 0) {
            mVar = null;
        }
        if ((i & 4) != 0) {
            jVar2 = null;
        }
        rVar.getClass();
        TimeZone timeZone = r81.g.a;
        boolean isShutdown = ((ThreadPoolExecutor) rVar.u()).isShutdown();
        synchronized (rVar) {
            if (mVar != null) {
                try {
                    if (!((ArrayDeque) rVar.u).remove(mVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (jVar2 != null) {
                jVar2.s.decrementAndGet();
                if (!((ArrayDeque) rVar.t).remove(jVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (jVar != null) {
                ((ArrayDeque) rVar.v).add(jVar);
                u81.m mVar2 = jVar.t;
                if (!mVar2.t && (w2 = rVar.w(((q81.o) mVar2.s.b).d)) != null) {
                    jVar.s = w2.s;
                }
            }
            if ((mVar != null || jVar2 != null) && (isShutdown || ((ArrayDeque) rVar.t).isEmpty())) {
                ((ArrayDeque) rVar.u).isEmpty();
            }
            if (isShutdown) {
                List F0 = x61.m.F0((ArrayDeque) rVar.v);
                ((ArrayDeque) rVar.v).clear();
                aVar = new ni.a(F0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) rVar.v).iterator();
                k71.k.f(it, "iterator(...)");
                while (it.hasNext()) {
                    u81.j jVar3 = (u81.j) it.next();
                    if (((ArrayDeque) rVar.t).size() >= 64) {
                        break;
                    }
                    if (jVar3.s.get() < 5) {
                        it.remove();
                        jVar3.s.incrementAndGet();
                        arrayList.add(jVar3);
                        ((ArrayDeque) rVar.t).add(jVar3);
                    }
                }
                aVar = new ni.a(arrayList);
            }
        }
        int size = aVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Runnable runnable = (u81.j) aVar.a.get(i2);
            if (runnable != jVar) {
                u81.m mVar3 = ((u81.j) runnable).t;
            }
            if (isShutdown) {
                runnable.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                u81.m mVar4 = ((u81.j) runnable).t;
                mVar4.j(interruptedIOException);
                ((u81.j) runnable).r.r(mVar4, interruptedIOException);
            } else {
                ExecutorService u = rVar.u();
                runnable.getClass();
                u81.m mVar5 = ((u81.j) runnable).t;
                k71.k.g(mVar5.r.a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) u).execute(runnable);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        u81.m mVar6 = ((u81.j) runnable).t;
                        mVar6.j(interruptedIOException2);
                        ((u81.j) runnable).r.r(mVar6, interruptedIOException2);
                        r rVar2 = mVar5.r.a;
                        rVar2.getClass();
                        L(rVar2, null, null, runnable, 3);
                    }
                } catch (Throwable th2) {
                    r rVar3 = mVar5.r.a;
                    rVar3.getClass();
                    L(rVar3, null, null, runnable, 3);
                    throw th2;
                }
            }
        }
    }

    public static final Message d(r rVar, ArrayList arrayList, int i) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (((Message) obj2).what == i) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static void h(r rVar, c7.d dVar) {
        rVar.getClass();
        k71.k.g(dVar, "handler");
        if (((LinkedHashSet) rVar.u).add(dVar)) {
            c7.g gVar = (c7.g) rVar.t;
            gVar.getClass();
            if (dVar.c == null) {
                gVar.e.addFirst(dVar);
                dVar.c = rVar;
                gVar.b();
            } else {
                throw new IllegalArgumentException(("Handler '" + dVar + "' is already registered with a dispatcher").toString());
            }
        }
    }

    public ArrayList A() {
        ArrayList arrayList = new ArrayList();
        for (i1 i1Var : ((HashMap) this.t).values()) {
            if (i1Var != null) {
                arrayList.add(i1Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List B() {
        ArrayList arrayList;
        if (((ArrayList) this.s).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.s)) {
            arrayList = new ArrayList((ArrayList) this.s);
        }
        return arrayList;
    }

    public k1 E(k71.e eVar, String str) {
        k1 k1Var;
        k1 a;
        k71.k.g(str, "key");
        synchronized (((v6.c) this.v)) {
            try {
                t1 t1Var = (t1) this.s;
                t1Var.getClass();
                k1Var = (k1) t1Var.a.get(str);
                if (eVar.d(k1Var)) {
                    r1 r1Var = (o1) this.t;
                    if (r1Var instanceof r1) {
                        k71.k.d(k1Var);
                        r1Var.d(k1Var);
                    }
                    k71.k.e(k1Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    t6.d dVar = new t6.d((t6.c) this.u);
                    ((t6.c) dVar).a.put(s1.b, str);
                    o1 o1Var = (o1) this.t;
                    k71.k.g(o1Var, "factory");
                    try {
                        try {
                            a = o1Var.b(eVar, dVar);
                        } catch (AbstractMethodError unused) {
                            a = o1Var.c(l0.x(eVar), dVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        a = o1Var.a(l0.x(eVar));
                    }
                    k1Var = a;
                    t1 t1Var2 = (t1) this.s;
                    t1Var2.getClass();
                    k71.k.g(k1Var, "viewModel");
                    k1 k1Var2 = (k1) t1Var2.a.put(str, k1Var);
                    if (k1Var2 != null) {
                        k1Var2.L();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k1Var;
    }

    public boolean F(Context context) {
        if (((Boolean) this.u) == null) {
            this.u = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.t).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.u).booleanValue();
    }

    public boolean G(Context context) {
        if (((Boolean) this.t) == null) {
            this.t = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.t).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.t).booleanValue();
    }

    public boolean H(w31.f fVar) {
        w31.m mVar = (w31.m) this.u;
        return (mVar == null || fVar == null || mVar.a.get() != fVar) ? false : true;
    }

    public void I(i1 i1Var) {
        androidx.fragment.app.a0 a0Var = i1Var.c;
        String str = a0Var.w;
        HashMap hashMap = (HashMap) this.t;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(a0Var.w, i1Var);
        if (a1.O(2)) {
            a0Var.toString();
        }
    }

    public void J(i1 i1Var) {
        HashMap hashMap = (HashMap) this.t;
        androidx.fragment.app.a0 a0Var = i1Var.c;
        if (a0Var.V) {
            ((d1) this.v).Q(a0Var);
        }
        if (hashMap.get(a0Var.w) == i1Var && ((i1) hashMap.put(a0Var.w, null)) != null && a1.O(2)) {
            a0Var.toString();
        }
    }

    public void K(w31.f fVar) {
        synchronized (this.s) {
            try {
                if (H(fVar)) {
                    w31.m mVar = (w31.m) this.u;
                    if (!mVar.c) {
                        mVar.c = true;
                        ((Handler) this.t).removeCallbacksAndMessages(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void M(w31.f fVar) {
        synchronized (this.s) {
            try {
                if (H(fVar)) {
                    w31.m mVar = (w31.m) this.u;
                    if (mVar.c) {
                        mVar.c = false;
                        O(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r9.m(r1) == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007a, blocks: (B:25:0x005d, B:29:0x0067), top: B:24:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object N(c71.c cVar) {
        k0 k0Var;
        int i;
        e81.a aVar;
        e81.a aVar2;
        Throwable th;
        v71.r rVar = (v71.r) this.t;
        try {
            if (cVar instanceof k0) {
                k0Var = (k0) cVar;
                int i2 = k0Var.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    k0Var.x = i2 - Integer.MIN_VALUE;
                    Object obj = k0Var.v;
                    b71.a aVar3 = b71.a.r;
                    i = k0Var.x;
                    w61.a0 a0Var = w61.a0.a;
                    if (i != 0) {
                        sy.y.j(obj);
                        if (rVar.U()) {
                            return a0Var;
                        }
                        aVar = (e81.c) this.s;
                        k0Var.u = aVar;
                        k0Var.x = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = k0Var.u;
                            try {
                                sy.y.j(obj);
                                rVar.X(a0Var);
                                aVar2.f((Object) null);
                                return a0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2.f((Object) null);
                                throw th;
                            }
                        }
                        e81.a aVar4 = k0Var.u;
                        sy.y.j(obj);
                        aVar = aVar4;
                    }
                    if (!rVar.U()) {
                        aVar.f((Object) null);
                        return a0Var;
                    }
                    k0Var.u = aVar;
                    k0Var.x = 2;
                    if (t(k0Var) != aVar3) {
                        aVar2 = aVar;
                        rVar.X(a0Var);
                        aVar2.f((Object) null);
                        return a0Var;
                    }
                    return aVar3;
                }
            }
            if (!rVar.U()) {
            }
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.f((Object) null);
            throw th;
        }
        k0Var = new k0(this, cVar);
        Object obj2 = k0Var.v;
        b71.a aVar32 = b71.a.r;
        i = k0Var.x;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
    }

    public void O(w31.m mVar) {
        Handler handler = (Handler) this.t;
        int i = mVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(mVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, mVar), i);
    }

    public void P(int i) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.u).drainTo(arrayList);
        Message obtain = Message.obtain(null, i, 0, 0);
        k71.k.f(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        v71.b0.z(v71.b0.c((a71.h) this.s), (a71.h) null, (v71.a0) null, new n0(this, arrayList, null, 1), 3);
    }

    public Bundle Q(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.u;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public void R() {
        w31.m mVar = (w31.m) this.v;
        if (mVar != null) {
            this.u = mVar;
            this.v = null;
            w31.f fVar = (w31.f) mVar.a.get();
            if (fVar == null) {
                this.u = null;
            } else {
                Handler handler = w31.i.A;
                handler.sendMessage(handler.obtainMessage(0, fVar.a));
            }
        }
    }

    public void S(q2.m mVar) {
        if (((q2.y) this.t) == q2.y.s) {
            androidx.compose.ui.layout.w wVar = (androidx.compose.ui.layout.w) this.s;
            if (wVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            q2.t.i(mVar, wVar.X(0L), new a2.d(11, (q2.z) this.v), true);
        }
        this.t = q2.y.t;
    }

    public void T() {
        int k;
        j8.j jVar = (j8.j) this.t;
        j8.j jVar2 = (j8.j) this.s;
        ViewPager2 viewPager2 = (ViewPager2) this.v;
        int i = R.id.accessibilityActionPageLeft;
        c1.m(viewPager2, R.id.accessibilityActionPageLeft);
        c1.i(viewPager2, 0);
        c1.m(viewPager2, R.id.accessibilityActionPageRight);
        c1.i(viewPager2, 0);
        c1.m(viewPager2, R.id.accessibilityActionPageUp);
        c1.i(viewPager2, 0);
        c1.m(viewPager2, R.id.accessibilityActionPageDown);
        c1.i(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (k = viewPager2.getAdapter().k()) == 0 || !viewPager2.I) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.u < k - 1) {
                c1.n(viewPager2, new b5.b(R.id.accessibilityActionPageDown, (CharSequence) null), (String) null, jVar2);
            }
            if (viewPager2.u > 0) {
                c1.n(viewPager2, new b5.b(R.id.accessibilityActionPageUp, (CharSequence) null), (String) null, jVar);
                return;
            }
            return;
        }
        boolean z = ((w0) viewPager2.x).b.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.u < k - 1) {
            c1.n(viewPager2, new b5.b(i2, (CharSequence) null), (String) null, jVar2);
        }
        if (viewPager2.u > 0) {
            c1.n(viewPager2, new b5.b(i, (CharSequence) null), (String) null, jVar);
        }
    }

    public Bundle U() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        com.google.android.gms.measurement.internal.c1 c1Var = (com.google.android.gms.measurement.internal.c1) this.v;
        if (((Bundle) this.u) == null) {
            String str = (String) this.s;
            SharedPreferences D = c1Var.D();
            com.google.android.gms.measurement.internal.o1 o1Var = (com.google.android.gms.measurement.internal.o1) ((s0) c1Var).s;
            String string3 = D.getString(str, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            com.google.android.gms.measurement.internal.s0 s0Var = o1Var.w;
                            com.google.android.gms.measurement.internal.o1.m(s0Var);
                            s0Var.x.a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            m8.a();
                                            if (o1Var.u.J(null, com.google.android.gms.measurement.internal.c0.Q0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        m8.a();
                                        if (o1Var.u.J(null, com.google.android.gms.measurement.internal.c0.Q0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        com.google.android.gms.measurement.internal.s0 s0Var2 = o1Var.w;
                        com.google.android.gms.measurement.internal.o1.m(s0Var2);
                        s0Var2.x.b(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.u = bundle;
                } catch (JSONException unused2) {
                    com.google.android.gms.measurement.internal.s0 s0Var3 = o1Var.w;
                    com.google.android.gms.measurement.internal.o1.m(s0Var3);
                    s0Var3.x.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.u) == null) {
                this.u = (Bundle) this.t;
            }
        }
        Bundle bundle2 = (Bundle) this.u;
        c21.u.g(bundle2);
        return new Bundle(bundle2);
    }

    public com.google.android.gms.internal.measurement.n V(com.google.android.gms.internal.measurement.n nVar) {
        return ((com.google.android.gms.internal.measurement.t) this.t).c(this, nVar);
    }

    public com.google.android.gms.internal.measurement.n W(r rVar, w3... w3VarArr) {
        com.google.android.gms.internal.measurement.n nVar = com.google.android.gms.internal.measurement.n.b;
        for (w3 w3Var : w3VarArr) {
            nVar = k21.f.Q(w3Var);
            i21.a.f0((r) this.u);
            if ((nVar instanceof com.google.android.gms.internal.measurement.o) || (nVar instanceof com.google.android.gms.internal.measurement.m)) {
                nVar = ((com.google.android.gms.internal.measurement.t) this.s).c(rVar, nVar);
            }
        }
        return nVar;
    }

    public com.google.android.gms.internal.measurement.n X(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVar = com.google.android.gms.internal.measurement.n.b;
        Iterator n = dVar.n();
        while (n.hasNext()) {
            nVar = ((com.google.android.gms.internal.measurement.t) this.t).c(this, dVar.p(((Integer) n.next()).intValue()));
            if (nVar instanceof com.google.android.gms.internal.measurement.f) {
                break;
            }
        }
        return nVar;
    }

    public void Y(Bundle bundle) {
        String str = (String) this.s;
        com.google.android.gms.measurement.internal.c1 c1Var = (com.google.android.gms.measurement.internal.c1) this.v;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences D = c1Var.D();
        com.google.android.gms.measurement.internal.o1 o1Var = (com.google.android.gms.measurement.internal.o1) ((s0) c1Var).s;
        SharedPreferences.Editor edit = D.edit();
        if (bundle2.size() == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        m8.a();
                        if (!o1Var.u.J(null, com.google.android.gms.measurement.internal.c0.Q0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                com.google.android.gms.measurement.internal.s0 s0Var = o1Var.w;
                                com.google.android.gms.measurement.internal.o1.m(s0Var);
                                s0Var.x.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            com.google.android.gms.measurement.internal.s0 s0Var2 = o1Var.w;
                            com.google.android.gms.measurement.internal.o1.m(s0Var2);
                            s0Var2.x.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        com.google.android.gms.measurement.internal.s0 s0Var3 = o1Var.w;
                        com.google.android.gms.measurement.internal.o1.m(s0Var3);
                        s0Var3.x.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.u = bundle2;
    }

    public r Z() {
        return new r(this, (com.google.android.gms.internal.measurement.t) this.t);
    }

    public h91.k0 a() {
        return (i91.e) this.u;
    }

    public boolean a0(String str) {
        if (((HashMap) this.u).containsKey(str)) {
            return true;
        }
        r rVar = (r) this.s;
        if (rVar != null) {
            return rVar.a0(str);
        }
        return false;
    }

    public boolean b(o.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.s).onActionItemClicked(y(bVar), new p.s((Context) this.t, (u4.a) menuItem));
    }

    public void b0(String str, com.google.android.gms.internal.measurement.n nVar) {
        r rVar;
        HashMap hashMap = (HashMap) this.u;
        if (!hashMap.containsKey(str) && (rVar = (r) this.s) != null && rVar.a0(str)) {
            rVar.b0(str, nVar);
        } else {
            if (((HashMap) this.v).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, nVar);
            }
        }
    }

    public i0 c() {
        return (i91.d) this.v;
    }

    public void c0(String str, com.google.android.gms.internal.measurement.n nVar) {
        HashMap hashMap = (HashMap) this.u;
        if (((HashMap) this.v).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    public void cancel() {
        ((Socket) this.s).close();
    }

    public com.google.android.gms.internal.measurement.n d0(String str) {
        HashMap hashMap = (HashMap) this.u;
        if (hashMap.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.n) hashMap.get(str);
        }
        r rVar = (r) this.s;
        if (rVar != null) {
            return rVar.d0(str);
        }
        throw new IllegalArgumentException(x.i.f(str, " is not defined"));
    }

    public void e(fa1.m mVar) {
        ArrayList arrayList = (ArrayList) this.u;
        Objects.requireNonNull(mVar, "factory == null");
        arrayList.add(mVar);
    }

    public void f(androidx.fragment.app.a0 a0Var) {
        if (((ArrayList) this.s).contains(a0Var)) {
            throw new IllegalStateException("Fragment already added: " + a0Var);
        }
        synchronized (((ArrayList) this.s)) {
            ((ArrayList) this.s).add(a0Var);
        }
        a0Var.C = true;
    }

    public boolean g(o.b bVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.s;
        o.f y = y(bVar);
        q0 q0Var = (q0) this.v;
        p.a0 a0Var = (Menu) q0Var.get(menu);
        if (a0Var == null) {
            a0Var = new p.a0((Context) this.t, (p.l) menu);
            q0Var.put(menu, a0Var);
        }
        return callback.onPrepareActionMode(y, a0Var);
    }

    public void i(c7.f fVar) {
        if (((LinkedHashSet) this.v).add(fVar)) {
            ((c7.g) this.t).a(this, fVar, -1);
        }
    }

    public void j(c7.m mVar, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(no.a.k("Unsupported priority value: ", i).toString());
        }
        if (((LinkedHashSet) this.v).add(mVar)) {
            ((c7.g) this.t).a(this, mVar, i);
        }
    }

    public void k(String str, String str2) {
        this.v = ((String) this.v) + (((String) this.v).length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    public void l(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        l7.e eVar = new l7.e(1);
        eVar.k((q81.o) null, str);
        q81.o c = eVar.c();
        if ("".equals(c.f.get(r0.size() - 1))) {
            this.t = c;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + c);
        }
    }

    public l1 m() {
        ArrayList arrayList = (ArrayList) this.u;
        if (((q81.o) this.t) == null) {
            throw new IllegalStateException("Base URL required.");
        }
        q81.u uVar = (q81.u) this.s;
        if (uVar == null) {
            uVar = new q81.u();
        }
        fa1.a aVar = fa1.k0.a;
        fa1.b bVar = fa1.k0.c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.v);
        List a = bVar.a(aVar);
        arrayList2.addAll(a);
        List b = bVar.b();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + b.size());
        arrayList3.add(new fa1.c(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(b);
        q81.o oVar = (q81.o) this.t;
        List unmodifiableList = Collections.unmodifiableList(arrayList3);
        List unmodifiableList2 = Collections.unmodifiableList(arrayList2);
        a.size();
        l1 l1Var = new l1();
        l1Var.r = new ConcurrentHashMap();
        l1Var.s = uVar;
        l1Var.t = oVar;
        l1Var.u = unmodifiableList;
        l1Var.v = unmodifiableList2;
        return l1Var;
    }

    public boolean n(w31.m mVar, int i) {
        w31.f fVar = (w31.f) mVar.a.get();
        if (fVar == null) {
            return false;
        }
        ((Handler) this.t).removeCallbacksAndMessages(mVar);
        Handler handler = w31.i.A;
        handler.sendMessage(handler.obtainMessage(1, i, 0, fVar.a));
        return true;
    }

    public boolean o(o.b bVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.s;
        o.f y = y(bVar);
        q0 q0Var = (q0) this.v;
        p.a0 a0Var = (Menu) q0Var.get(menu);
        if (a0Var == null) {
            a0Var = new p.a0((Context) this.t, (p.l) menu);
            q0Var.put(menu, a0Var);
        }
        return callback.onCreateActionMode(y, a0Var);
    }

    public void p(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((q0) this.t).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                p(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void q(o.b bVar) {
        ((ActionMode.Callback) this.s).onDestroyActionMode(y(bVar));
    }

    public void r(c7.f fVar, c7.b bVar) {
        c7.g gVar = (c7.g) this.t;
        gVar.getClass();
        if (gVar.g != 0) {
            return;
        }
        c7.d c = gVar.c(-1);
        gVar.f = c;
        gVar.g = -1;
        gVar.h = fVar;
        if (bVar != null) {
            if (c != null) {
                c.d(bVar);
            }
            y1 y1Var = gVar.a;
            c7.i iVar = new c7.i(bVar);
            y1Var.getClass();
            y1Var.k((Object) null, iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public void s(q2.m mVar, boolean z) {
        q2.z zVar = (q2.z) this.v;
        ?? r1 = mVar.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((q2.u) r1.get(i)).b()) {
                S(mVar);
                return;
            }
        }
        androidx.compose.ui.layout.w wVar = (androidx.compose.ui.layout.w) this.s;
        if (wVar == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        q2.t.i(mVar, wVar.X(0L), new d2.n(3, this, zVar), false);
        if (((q2.y) this.t) == q2.y.s) {
            if (z) {
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((q2.u) r1.get(i2)).a();
                }
            }
            h4 h4Var = mVar.b;
            if (h4Var != null) {
                h4Var.a = !zVar.c;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(c71.c cVar) {
        n5.h hVar;
        int i;
        n5.c cVar2;
        n5.x xVar = (n5.x) this.v;
        if (cVar instanceof n5.h) {
            hVar = (n5.h) cVar;
            int i2 = hVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.w = i2 - Integer.MIN_VALUE;
                Object obj = hVar.u;
                b71.a aVar = b71.a.r;
                i = hVar.w;
                if (i != 0) {
                    sy.y.j(obj);
                    List list = (List) this.u;
                    if (list == null || list.isEmpty()) {
                        hVar.w = 1;
                        obj = n5.x.g(xVar, false, hVar);
                    } else {
                        o0 h = xVar.h();
                        n5.k kVar = new n5.k(xVar, this, (a71.c) null);
                        hVar.w = 2;
                        obj = h.b(kVar, hVar);
                    }
                    return aVar;
                }
                if (i == 1) {
                    sy.y.j(obj);
                    cVar2 = (n5.c) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    cVar2 = (n5.c) obj;
                }
                xVar.h.d(cVar2);
                return w61.a0.a;
            }
        }
        hVar = new n5.h(this, cVar);
        Object obj2 = hVar.u;
        b71.a aVar2 = b71.a.r;
        i = hVar.w;
        if (i != 0) {
        }
        xVar.h.d(cVar2);
        return w61.a0.a;
    }

    public String toString() {
        switch (this.r) {
            case 12:
                String socket = ((Socket) this.s).toString();
                k71.k.f(socket, "toString(...)");
                return socket;
            default:
                return super.toString();
        }
    }

    public synchronized ExecutorService u() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.s) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = r81.g.b + " Dispatcher";
                k71.k.g(str, "name");
                this.s = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, (BlockingQueue<Runnable>) synchronousQueue, (ThreadFactory) new r81.f(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.s;
            k71.k.d(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public androidx.fragment.app.a0 v(String str) {
        i1 i1Var = (i1) ((HashMap) this.t).get(str);
        if (i1Var != null) {
            return i1Var.c;
        }
        return null;
    }

    public u81.j w(String str) {
        Iterator it = ((ArrayDeque) this.t).iterator();
        k71.k.f(it, "iterator(...)");
        while (it.hasNext()) {
            u81.j jVar = (u81.j) it.next();
            if (k71.k.b(((q81.o) jVar.t.s.b).d, str)) {
                return jVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.v).iterator();
        k71.k.f(it2, "iterator(...)");
        while (it2.hasNext()) {
            u81.j jVar2 = (u81.j) it2.next();
            if (k71.k.b(((q81.o) jVar2.t.s.b).d, str)) {
                return jVar2;
            }
        }
        return null;
    }

    public androidx.fragment.app.a0 x(String str) {
        for (i1 i1Var : ((HashMap) this.t).values()) {
            if (i1Var != null) {
                androidx.fragment.app.a0 a0Var = i1Var.c;
                if (!str.equals(a0Var.w)) {
                    a0Var = a0Var.O.c.x(str);
                }
                if (a0Var != null) {
                    return a0Var;
                }
            }
        }
        return null;
    }

    public o.f y(o.b bVar) {
        ArrayList arrayList = (ArrayList) this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o.f fVar = (o.f) arrayList.get(i);
            if (fVar != null && fVar.b == bVar) {
                return fVar;
            }
        }
        o.f fVar2 = new o.f((Context) this.t, bVar);
        arrayList.add(fVar2);
        return fVar2;
    }

    public ArrayList z() {
        ArrayList arrayList = new ArrayList();
        for (i1 i1Var : ((HashMap) this.t).values()) {
            if (i1Var != null) {
                arrayList.add(i1Var);
            }
        }
        return arrayList;
    }

    public r(com.google.android.gms.measurement.internal.c1 c1Var, String str) {
        this.r = 7;
        this.v = c1Var;
        c21.u.d(str);
        this.s = str;
        this.t = new Bundle();
    }

    public r(r rVar, com.google.android.gms.internal.measurement.t tVar) {
        this.r = 6;
        this.u = new HashMap();
        this.v = new HashMap();
        this.s = rVar;
        this.t = tVar;
    }

    public r(v71.z zVar, h1.r rVar, n0.x xVar, gi.b bVar) {
        this.r = 18;
        k71.k.g(zVar, "scope");
        this.s = zVar;
        this.t = bVar;
        this.u = t.e.a(Integer.MAX_VALUE, 6, (x71.a) null);
        this.v = new kk.a(13);
        v71.d1 w0 = zVar.K().w0(v71.w.s);
        if (w0 != null) {
            w0.o0(new c2(rVar, this, xVar, 11));
        }
    }

    public r(t1 t1Var, o1 o1Var, t6.c cVar) {
        this.r = 27;
        k71.k.g(t1Var, "store");
        k71.k.g(o1Var, "factory");
        k71.k.g(cVar, "defaultExtras");
        this.s = t1Var;
        this.t = o1Var;
        this.u = cVar;
        this.v = new v6.c();
    }

    public r(Socket socket) {
        this.r = 12;
        this.s = socket;
        this.t = new AtomicInteger();
        this.u = new i91.e(this);
        this.v = new i91.d(this);
    }

    public r(KSerializer kSerializer) {
        this.r = 3;
        this.u = "";
        this.v = "";
        this.t = kSerializer;
        this.s = kSerializer.getDescriptor().a();
    }

    public r(a71.h hVar) {
        this.r = 1;
        k71.k.g(hVar, "backgroundDispatcher");
        this.s = hVar;
        this.u = new LinkedBlockingDeque(20);
        this.v = new a61.c1(0, this);
    }

    public r(q2.z zVar) {
        this.r = 22;
        this.v = zVar;
        this.t = q2.y.r;
    }

    public r(c5.b bVar) {
        this.r = 4;
        this.s = bVar;
        this.t = new c7.g();
        new LinkedHashSet();
        this.u = new LinkedHashSet();
        this.v = new LinkedHashSet();
    }

    public r(com.github.rudroid.activities.t tVar) {
        this.r = 19;
        this.s = new WeakReference(tVar);
        this.t = new AtomicReference();
        this.u = new CountDownLatch(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [android.graphics.drawable.Icon] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.app.Notification, java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r4v19, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.app.Notification$Builder] */
    public r(n4.p pVar) {
        Bundle bundle;
        Bundle[] bundleArr;
        int i;
        ArrayList arrayList;
        ?? r16;
        ?? r15;
        ArrayList arrayList2;
        Bundle bundle2;
        int i2;
        this.r = 16;
        new ArrayList();
        this.v = new Bundle();
        this.u = pVar;
        Context context = pVar.a;
        ArrayList arrayList3 = pVar.w;
        ArrayList arrayList4 = pVar.c;
        ArrayList arrayList5 = pVar.d;
        this.s = context;
        Notification.Builder builder = new Notification.Builder(context, pVar.t);
        this.t = builder;
        Notification notification = pVar.v;
        Context context2 = null;
        int i3 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(pVar.e).setContentText(pVar.f).setContentInfo(null).setContentIntent(pVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(pVar.i).setProgress(0, 0, false);
        IconCompat iconCompat = pVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.e(context));
        builder.setSubText(pVar.m).setUsesChronometer(false).setPriority(pVar.j);
        ArrayList arrayList6 = pVar.b;
        int size = arrayList6.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList6.get(i4);
            i4++;
            n4.j jVar = (n4.j) obj;
            if (jVar.b == null && (i2 = jVar.f) != 0) {
                jVar.b = IconCompat.a(i2);
            }
            IconCompat iconCompat2 = jVar.b;
            boolean z = jVar.d;
            Bundle bundle3 = jVar.a;
            if (iconCompat2 != null) {
                r16 = context2;
                r15 = iconCompat2.e(context2);
            } else {
                Context context3 = context2;
                r16 = context3;
                r15 = context3;
            }
            int i5 = i3;
            ArrayList arrayList7 = arrayList6;
            Notification.Action.Builder builder2 = new Notification.Action.Builder((Icon) r15, jVar.g, jVar.h);
            n4.d0[] d0VarArr = jVar.c;
            if (d0VarArr != null) {
                int length = d0VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                arrayList2 = arrayList4;
                if (d0VarArr.length > 0) {
                    n4.d0 d0Var = d0VarArr[i5];
                    throw r16;
                }
                for (int i6 = i5; i6 < length; i6++) {
                    builder2.addRemoteInput(remoteInputArr[i6]);
                }
            } else {
                arrayList2 = arrayList4;
            }
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i7 = Build.VERSION.SDK_INT;
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", i5);
            if (i7 >= 28) {
                n4.u.a(builder2);
            }
            if (i7 >= 29) {
                n4.f.d(builder2);
            }
            if (i7 >= 31) {
                n4.v.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", jVar.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.t).addAction(builder2.build());
            context2 = r16;
            arrayList6 = arrayList7;
            arrayList4 = arrayList2;
            i3 = 0;
        }
        ArrayList arrayList8 = arrayList4;
        ?? r162 = context2;
        Bundle bundle4 = pVar.q;
        if (bundle4 != null) {
            ((Bundle) this.v).putAll(bundle4);
        }
        int i8 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.t).setShowWhen(pVar.k);
        ((Notification.Builder) this.t).setLocalOnly(pVar.p);
        ((Notification.Builder) this.t).setGroup(pVar.n);
        ((Notification.Builder) this.t).setSortKey(r162);
        ((Notification.Builder) this.t).setGroupSummary(pVar.o);
        ((Notification.Builder) this.t).setCategory(r162);
        ((Notification.Builder) this.t).setColor(pVar.r);
        ((Notification.Builder) this.t).setVisibility(pVar.s);
        ((Notification.Builder) this.t).setPublicVersion(r162);
        ((Notification.Builder) this.t).setSound(notification.sound, notification.audioAttributes);
        if (i8 < 28) {
            if (arrayList8 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList8.size());
                Iterator it = arrayList8.iterator();
                if (it.hasNext()) {
                    throw f4.g(it);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    x.f fVar = new x.f(arrayList3.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList3);
                    arrayList3 = new ArrayList((Collection) fVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList3.get(i9);
                i9++;
                ((Notification.Builder) this.t).addPerson((String) obj2);
            }
        }
        if (arrayList5.size() > 0) {
            if (pVar.q == null) {
                pVar.q = new Bundle();
            }
            Bundle bundle5 = pVar.q.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                String num = Integer.toString(i10);
                n4.j jVar2 = (n4.j) arrayList5.get(i10);
                Bundle bundle8 = new Bundle();
                if (jVar2.b == null && (i = jVar2.f) != 0) {
                    jVar2.b = IconCompat.a(i);
                }
                IconCompat iconCompat3 = jVar2.b;
                Bundle bundle9 = jVar2.a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.b() : 0);
                bundle8.putCharSequence("title", jVar2.g);
                bundle8.putParcelable("actionIntent", jVar2.h);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", jVar2.d);
                bundle8.putBundle("extras", bundle);
                n4.d0[] d0VarArr2 = jVar2.c;
                if (d0VarArr2 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[d0VarArr2.length];
                    if (d0VarArr2.length > 0) {
                        n4.d0 d0Var2 = d0VarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", jVar2.e);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (pVar.q == null) {
                pVar.q = new Bundle();
            }
            pVar.q.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.v).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i12 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.t).setExtras(pVar.q);
        ((Notification.Builder) this.t).setRemoteInputHistory(null);
        ((Notification.Builder) this.t).setBadgeIconType(0);
        ((Notification.Builder) this.t).setSettingsText(null);
        ((Notification.Builder) this.t).setShortcutId(null);
        ((Notification.Builder) this.t).setTimeoutAfter(0L);
        ((Notification.Builder) this.t).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(pVar.t)) {
            ((Notification.Builder) this.t).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i12 >= 28) {
            Iterator it2 = arrayList8.iterator();
            if (it2.hasNext()) {
                throw f4.g(it2);
            }
        }
        if (i12 >= 29) {
            n4.f.b((Notification.Builder) this.t, pVar.u);
            n4.f.c((Notification.Builder) this.t);
        }
        if (i12 >= 36) {
            n4.w.a((Notification.Builder) this.t);
        }
    }

    public r(Typeface typeface, androidx.emoji2.text.flatbuffer.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.r = 26;
        this.v = typeface;
        this.s = bVar;
        this.u = new u5.q(1024);
        int a = bVar.a(6);
        if (a != 0) {
            int i5 = a + ((a5.q0) bVar).r;
            i = ((ByteBuffer) ((a5.q0) bVar).u).getInt(((ByteBuffer) ((a5.q0) bVar).u).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.t = new char[i * 2];
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i6 = a2 + ((a5.q0) bVar).r;
            i2 = ((ByteBuffer) ((a5.q0) bVar).u).getInt(((ByteBuffer) ((a5.q0) bVar).u).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            u5.t tVar = new u5.t(this, i7);
            androidx.emoji2.text.flatbuffer.a c = tVar.c();
            int a3 = c.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) ((a5.q0) c).u).getInt(a3 + ((a5.q0) c).r) : 0, (char[]) this.t, i7 * 2);
            androidx.emoji2.text.flatbuffer.a c2 = tVar.c();
            int a4 = c2.a(16);
            if (a4 != 0) {
                int i8 = a4 + ((a5.q0) c2).r;
                i3 = ((ByteBuffer) ((a5.q0) c2).u).getInt(((ByteBuffer) ((a5.q0) c2).u).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            sy.p.g("invalid metadata codepoint length", i3 > 0);
            u5.q qVar = (u5.q) this.u;
            androidx.emoji2.text.flatbuffer.a c3 = tVar.c();
            int a5 = c3.a(16);
            if (a5 != 0) {
                int i9 = a5 + ((a5.q0) c3).r;
                i4 = ((ByteBuffer) ((a5.q0) c3).u).getInt(((ByteBuffer) ((a5.q0) c3).u).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            qVar.a(tVar, 0, i4 - 1);
        }
    }

    public r(int i) {
        this.r = i;
        switch (i) {
            case 2:
                this.s = new ArrayList();
                this.t = new HashMap();
                this.u = new HashMap();
                break;
            case 5:
                com.google.android.gms.internal.measurement.t tVar = new com.google.android.gms.internal.measurement.t(0);
                this.s = tVar;
                r rVar = new r((r) null, tVar);
                this.u = rVar;
                this.t = rVar.Z();
                t5 t5Var = new t5(1);
                this.v = t5Var;
                rVar.b0("require", new r9(t5Var));
                ((HashMap) t5Var.r).put("internal.platform", com.google.android.gms.internal.measurement.d1.a);
                rVar.b0("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
                break;
            case 8:
                this.s = new x.e(0);
                this.t = new SparseArray();
                this.u = new x.r((Object) null);
                this.v = new x.e(0);
                break;
            case 11:
                this.u = new ArrayList();
                this.v = new ArrayList();
                break;
            case 14:
                this.s = new z3.d(10);
                this.t = new q0(0);
                this.u = new ArrayList();
                this.v = new HashSet();
                break;
            case 21:
                break;
            case 23:
                this.v = new ArrayDeque();
                this.t = new ArrayDeque();
                this.u = new ArrayDeque();
                break;
            case 28:
                this.s = new Object();
                this.t = new Handler(Looper.getMainLooper(), new f0(2, this));
                break;
            default:
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = new ArrayDeque();
                break;
        }
    }

    public r(Context context, ActionMode.Callback callback) {
        this.r = 20;
        this.t = context;
        this.s = callback;
        this.u = new ArrayList();
        this.v = new q0(0);
    }

    public r(j4.w wVar, l7.f0 f0Var) {
        this.r = 15;
        this.v = wVar;
        this.s = new SparseIntArray(1);
        this.t = new SparseIntArray(1);
        this.u = f0Var;
    }

    public r(Signature signature) {
        this.r = 25;
        this.s = signature;
        this.t = null;
        this.u = null;
        this.v = null;
    }

    public r(Cipher cipher) {
        this.r = 25;
        this.s = null;
        this.t = cipher;
        this.u = null;
        this.v = null;
    }

    public r(Mac mac) {
        this.r = 25;
        this.s = null;
        this.t = null;
        this.u = mac;
        this.v = null;
    }

    public r(IdentityCredential identityCredential) {
        this.r = 25;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = identityCredential;
    }

    public r(n5.x xVar, List list) {
        this.r = 17;
        this.v = xVar;
        this.s = e81.d.a();
        this.t = v71.b0.b();
        this.u = x61.m.F0(list);
    }

    public r(ViewPager2 viewPager2) {
        this.r = 13;
        this.v = viewPager2;
        this.s = new j8.j(this, 0);
        this.t = new j8.j(this, 1);
    }
}
