package l51;

import a5.q0;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.foundation.lazy.layout.t1;
import androidx.compose.runtime.i3;
import androidx.core.graphics.drawable.IconCompat;
import coil.request.NullRequestDataException;
import com.github.domain.database.GitHubDatabase;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.FirebaseMessagingService;
import e50.y;
import h91.d0;
import h91.e0;
import h91.i0;
import h91.j0;
import h91.k0;
import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.Signature;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.Adler32;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import n4.m;
import oa.j;
import org.json.JSONArray;
import org.json.JSONException;
import q.p0;
import r9.n;
import t.f0;
import t.o;
import t.p;
import u5.q;
import u5.t;
import u5.u;
import v2.g0;
import v2.v1;
import v71.v;
import w51.r;
import w8.s;
import w9.l;
import x.h0;
import y71.n1;
import z70.w;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements q9.e, t41.b, t41.a, u1.d, j0 {
    public final /* synthetic */ int r;
    public Object s;
    public Object t;
    public Object u;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    public static h C(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new h(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static final void e(h hVar, Network network, boolean z) {
        boolean z2;
        Network[] allNetworks = ((ConnectivityManager) hVar.s).getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (k.b(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) hVar.s).getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        l lVar = (l) hVar.t;
        synchronized (lVar) {
            try {
                if (((g9.h) lVar.r.get()) != null) {
                    lVar.v = z3;
                } else {
                    lVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean m(Editable editable, KeyEvent keyEvent, boolean z) {
        u[] uVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) != null && uVarArr.length > 0) {
                for (u uVar : uVarArr) {
                    int spanStart = editable.getSpanStart(uVar);
                    int spanEnd = editable.getSpanEnd(uVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static r9.f o(r9.k kVar, Throwable th) {
        Drawable b;
        if (th instanceof NullRequestDataException) {
            kVar.getClass();
            r9.c cVar = kVar.E;
            Integer num = kVar.C;
            cVar.getClass();
            b = w9.d.b(kVar, num);
            if (b == null) {
                Integer num2 = kVar.B;
                cVar.getClass();
                b = w9.d.b(kVar, num2);
            }
        } else {
            Integer num3 = kVar.B;
            kVar.E.getClass();
            b = w9.d.b(kVar, num3);
        }
        return new r9.f(b, kVar, th);
    }

    public static boolean x(r9.k kVar, Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (!kVar.m) {
                return false;
            }
            t9.a aVar = kVar.c;
            if (aVar instanceof t9.a) {
                ImageView imageView = aVar.s;
                if (imageView.isAttachedToWindow() && !imageView.isHardwareAccelerated()) {
                    return false;
                }
            }
        }
        return true;
    }

    public y71.i A(j jVar) {
        k.g(jVar, "user");
        qm.d dVar = (qm.d) this.s;
        dVar.getClass();
        return n1.y(new sm.b(n1.y(dVar.a.a(jVar), (v) this.t), 0), (v) this.u);
    }

    public y71.i B(j jVar) {
        k.g(jVar, "user");
        nm.i iVar = (nm.i) this.s;
        iVar.getClass();
        nm.k kVar = iVar.a;
        kVar.getClass();
        zj.b B = ((GitHubDatabase) kVar.a.a(jVar)).B();
        y71.i p = n1.p(d5.B(B.a, new String[]{"notification_schedules"}, new ze.a(B)));
        h hVar = (h) this.t;
        ak.a aVar = ak.a.s;
        qm.d dVar = (qm.d) hVar.s;
        dVar.getClass();
        return n1.y(new c00.g(p, n1.y(new sm.b(n1.y(dVar.a.a(jVar), (v) hVar.t)), (v) hVar.u), new rm.a(this, (a71.c) null), 27), (v) this.u);
    }

    public void D(Activity activity, p8.h hVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.u;
        k.g(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.t;
        reentrantLock.lock();
        try {
            if (hVar.equals((p8.h) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((s8.l) ((s21.a) this.s).s).b.iterator();
            k.f(it, "iterator(...)");
            while (it.hasNext()) {
                s8.k kVar = (s8.k) it.next();
                if (kVar.a.equals(activity)) {
                    kVar.c = hVar;
                    kVar.b.accept(hVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        if (((w9.h) r16.u).b(r18) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n E(r9.k kVar, s9.h hVar) {
        List list = kVar.h;
        Bitmap.Config config = kVar.f;
        if (list.isEmpty() || x61.l.t(w9.f.a, config)) {
            if (config == Bitmap.Config.HARDWARE) {
                if (x(kVar, config)) {
                }
            }
            k41.b bVar = hVar.a;
            s9.b bVar2 = s9.b.a;
            return new n(kVar.a, config, (ColorSpace) null, hVar, (!bVar.equals(bVar2) || hVar.b.equals(bVar2)) ? s9.g.s : kVar.y, w9.d.a(kVar), (kVar.n || !kVar.h.isEmpty() || config == Bitmap.Config.ALPHA_8) ? false : true, kVar.o, (String) null, kVar.j, kVar.k, kVar.z, kVar.p, kVar.q, kVar.r);
        }
        config = Bitmap.Config.ARGB_8888;
        k41.b bVar3 = hVar.a;
        s9.b bVar22 = s9.b.a;
        return new n(kVar.a, config, (ColorSpace) null, hVar, (!bVar3.equals(bVar22) || hVar.b.equals(bVar22)) ? s9.g.s : kVar.y, w9.d.a(kVar), (kVar.n || !kVar.h.isEmpty() || config == Bitmap.Config.ALPHA_8) ? false : true, kVar.o, (String) null, kVar.j, kVar.k, kVar.z, kVar.p, kVar.q, kVar.r);
    }

    public Object F(CharSequence charSequence, int i, int i2, int i3, boolean z, u5.l lVar) {
        int i4;
        u5.n nVar = new u5.n((q) ((r) this.t).u);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        loop0: while (true) {
            int i6 = codePointAt;
            while (true) {
                i4 = i;
                while (i < i2 && i5 < i3 && z2) {
                    int a = nVar.a(i6);
                    if (a == 1) {
                        i = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (i < i2) {
                            break;
                        }
                    } else if (a == 2) {
                        int charCount = Character.charCount(i6) + i;
                        if (charCount < i2) {
                            i6 = Character.codePointAt(charSequence, charCount);
                        }
                        i = charCount;
                    } else if (a == 3) {
                        if (z || !w(charSequence, i4, i, nVar.d.b)) {
                            z2 = lVar.e(charSequence, i4, i, nVar.d.b);
                            i5++;
                        }
                    }
                }
            }
            codePointAt = Character.codePointAt(charSequence, i);
        }
        if (nVar.a == 2 && nVar.c.b != null && ((nVar.f > 1 || nVar.c()) && i5 < i3 && z2 && (z || !w(charSequence, i4, i, nVar.c.b)))) {
            lVar.e(charSequence, i4, i, nVar.c.b);
        }
        return lVar.getResult();
    }

    public void G() {
        ((TypedArray) this.t).recycle();
    }

    public void H(m11.j jVar, int i, boolean z) {
        s11.b bVar = (s11.b) this.u;
        Context context = (Context) this.s;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = jVar.a;
        String str2 = jVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        j11.d dVar = jVar.c;
        adler32.update(allocate.putInt(w11.a.a(dVar)).array());
        byte[] bArr = jVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        a.a.i(jVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((t11.i) ((t11.d) this.t)).f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(w11.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(dVar, longValue, i));
            Set set = ((s11.c) bVar.b.get(dVar)).c;
            if (set.contains(s11.d.r)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(s11.d.t)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(s11.d.s)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", w11.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, longValue, i)), valueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void I(Object obj) {
        long b = r1.i.b();
        if (b == r1.l.a) {
            this.u = obj;
            return;
        }
        synchronized (this.t) {
            r1.k kVar = (r1.k) ((AtomicReference) this.s).get();
            int a = kVar.a(b);
            if (a < 0) {
                ((AtomicReference) this.s).set(kVar.b(b, obj));
            } else {
                kVar.c[a] = obj;
            }
        }
    }

    public void J(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.s = str;
    }

    public void K(q81.q qVar) {
        k.g(qVar, "type");
        if (qVar.b.equals("multipart")) {
            this.t = qVar;
        } else {
            throw new IllegalArgumentException(("multipart != " + qVar).toString());
        }
    }

    public void L() {
        synchronized (this) {
            ((AtomicInteger) this.t).decrementAndGet();
            if (((AtomicInteger) this.t).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void M() {
        h0 h0Var = (h0) this.s;
        String str = (String) this.t;
        List list = (List) h0Var.k(str);
        if (list != null) {
            list.remove((j71.a) this.u);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.m(str, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n N(n nVar) {
        boolean z;
        boolean z2;
        Bitmap.Config config = nVar.b;
        r9.b bVar = nVar.o;
        boolean z3 = true;
        if (config != Bitmap.Config.HARDWARE || ((w9.h) this.u).a()) {
            z = false;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z = true;
        }
        Bitmap.Config config2 = config;
        if (nVar.o.r) {
            l lVar = (l) this.t;
            synchronized (lVar) {
                lVar.a();
                z2 = lVar.v;
            }
            if (!z2) {
                bVar = r9.b.u;
                return !z3 ? new n(nVar.a, config2, nVar.c, nVar.d, nVar.e, nVar.f, nVar.g, nVar.h, nVar.i, nVar.j, nVar.k, nVar.l, nVar.m, nVar.n, bVar) : nVar;
            }
        }
        z3 = z;
        if (!z3) {
        }
    }

    public k0 a() {
        switch (this.r) {
            case 25:
                return (e0) this.t;
            default:
                return (u81.f) this.t;
        }
    }

    public boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.s;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public i0 c() {
        switch (this.r) {
            case 25:
                return (d0) this.u;
            default:
                return (u81.e) this.s;
        }
    }

    public void cancel() {
        switch (this.r) {
            case 25:
                ((j0) this.s).cancel();
                break;
            default:
                ((v81.e) ((t1) this.u).d).cancel();
                break;
        }
    }

    @Override // t41.b
    public void d(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.u;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public void f(g0 g0Var, v2.u uVar) {
        s21.a aVar = (s21.a) this.s;
        s21.a aVar2 = (s21.a) this.t;
        s21.a aVar3 = (s21.a) this.u;
        int ordinal = uVar.ordinal();
        if (ordinal == 0) {
            aVar.i(g0Var);
            aVar3.i(g0Var);
            return;
        }
        if (ordinal == 1) {
            aVar2.i(g0Var);
            aVar3.i(g0Var);
            return;
        }
        if (ordinal == 2) {
            if (g0Var.z != null) {
                aVar3.i(g0Var);
                return;
            } else {
                aVar.i(g0Var);
                return;
            }
        }
        if (ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (g0Var.z != null) {
            aVar3.i(g0Var);
        } else {
            aVar2.i(g0Var);
        }
    }

    public boolean g() {
        synchronized (this) {
            if (((AtomicBoolean) this.u).get()) {
                return false;
            }
            ((AtomicInteger) this.t).incrementAndGet();
            return true;
        }
    }

    @Override // t41.a
    public void h(Bundle bundle) {
        synchronized (this.t) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.u = new CountDownLatch(1);
            ((s21.a) this.s).h(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (((CountDownLatch) this.u).await(500, TimeUnit.MILLISECONDS)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                }
            } catch (InterruptedException unused) {
            }
            this.u = null;
        }
    }

    public m11.j i() {
        String str = ((String) this.s) == null ? " backendName" : "";
        if (((j11.d) this.u) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new m11.j((String) this.s, (byte[]) this.t, (j11.d) this.u);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public int j(int i) {
        a7.d dVar = (a7.d) this.s;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BiometricManager biometricManager = (BiometricManager) this.t;
            if (biometricManager == null) {
                return 1;
            }
            return p.a(biometricManager, i);
        }
        if (!t.e.m(i)) {
            return -2;
        }
        if (i == 0) {
            return 12;
        }
        Context context = dVar.a;
        if (t.e0.a(context) == null) {
            return 12;
        }
        if (t.e.l(i)) {
            KeyguardManager a = t.e0.a(context);
            return a == null ? false : t.e0.b(a) ? 0 : 11;
        }
        if (i2 == 29) {
            BiometricManager biometricManager2 = (BiometricManager) this.t;
            if (biometricManager2 == null) {
                return 1;
            }
            return o.a(biometricManager2);
        }
        if (i2 != 28) {
            return k();
        }
        if (!((context == null || context.getPackageManager() == null || !f0.a(context.getPackageManager())) ? false : true)) {
            return 12;
        }
        KeyguardManager a2 = t.e0.a(dVar.a);
        return !(a2 == null ? false : t.e0.b(a2)) ? k() : k() == 0 ? 0 : -1;
    }

    public int k() {
        a7.d dVar = (a7.d) this.u;
        if (dVar == null) {
            return 1;
        }
        Context context = dVar.a;
        FingerprintManager e = a7.d.e(context);
        if (e == null || !e.isHardwareDetected()) {
            return 12;
        }
        FingerprintManager e2 = a7.d.e(context);
        return (e2 == null || !e2.hasEnrolledFingerprints()) ? 11 : 0;
    }

    public boolean l(g0 g0Var) {
        return !(g0Var.z == null) && (((v1) ((s21.a) this.s).s).contains(g0Var) || ((v1) ((s21.a) this.t).s).contains(g0Var));
    }

    public void n(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.s;
        f fVar = new f(byteArrayOutputStream, hashMap, (HashMap) this.t, (i51.c) this.u);
        i51.c cVar = (i51.c) hashMap.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, fVar);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    public Object p() {
        long b = r1.i.b();
        if (b == r1.l.a) {
            return this.u;
        }
        r1.k kVar = (r1.k) ((AtomicReference) this.s).get();
        int a = kVar.a(b);
        if (a >= 0) {
            return kVar.c[a];
        }
        return null;
    }

    public ColorStateList q(int i) {
        int resourceId;
        ColorStateList c;
        TypedArray typedArray = (TypedArray) this.t;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = o4.b.c((Context) this.s, resourceId)) == null) ? typedArray.getColorStateList(i) : c;
    }

    public n3.b r() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((c30.d) this.u)) {
            try {
                n3.b bVar = (n3.b) this.t;
                if (bVar != null && localeList == ((LocaleList) this.s)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new n3.a(localeList.get(i)));
                }
                n3.b bVar2 = new n3.b(arrayList);
                this.s = localeList;
                this.t = bVar2;
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Drawable s(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.t;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : s.o((Context) this.s, resourceId);
    }

    public void shutdown() {
        ((ConnectivityManager) this.s).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.u);
    }

    public Drawable t(int i) {
        int resourceId;
        Drawable c;
        if (!((TypedArray) this.t).hasValue(i) || (resourceId = ((TypedArray) this.t).getResourceId(i, 0)) == 0) {
            return null;
        }
        q.r a = q.r.a();
        Context context = (Context) this.s;
        synchronized (a) {
            c = a.a.c(resourceId, context, true);
        }
        return c;
    }

    public String toString() {
        switch (this.r) {
            case 29:
                String str = (String) this.u;
                String str2 = (String) this.t;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.s;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                k.f(sb2, "toString(...)");
                return sb2;
            default:
                return super.toString();
        }
    }

    public Typeface u(int i, int i2, p0 p0Var) {
        int resourceId = ((TypedArray) this.t).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.u) == null) {
            this.u = new TypedValue();
        }
        Context context = (Context) this.s;
        TypedValue typedValue = (TypedValue) this.u;
        ThreadLocal threadLocal = q4.l.a;
        if (context.isRestricted()) {
            return null;
        }
        return q4.l.b(context, resourceId, typedValue, i2, p0Var, true, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(87:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(84:263|264|(1:24)|25|26|27|(1:29)|260|31|32|33|34|35|(65:242|(2:246|(2:250|(3:252|(1:254)(1:256)|255)))|38|(1:40)|41|(1:43)|44|(3:229|(2:237|238)|(1:236))|50|(1:52)|53|(1:55)(2:219|(1:224)(1:223))|56|(1:58)(1:218)|59|(1:61)(5:208|(1:210)|211|(1:213)(1:217)|(1:215)(1:216))|62|(1:64)(6:190|(4:193|(2:201|202)(1:199)|200|191)|203|204|(1:206)|207)|65|(1:67)(1:189)|(1:69)|70|(38:185|186|(1:76)|77|(1:79)|80|(1:82)|(1:84)|85|(1:87)|(1:89)|90|(1:92)|(1:94)|95|(23:167|168|(1:99)|100|(3:157|158|(20:160|(1:162)|163|(1:104)|105|(4:142|143|144|(2:146|(14:148|(3:109|(1:114)(1:112)|113)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:141)|126|(4:130|131|(1:133)(1:136)|134)|128|129)(2:149|150))(2:151|152))|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)(2:164|165))|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|72|(41:181|182|(0)|77|(0)|80|(1:177)|82|(0)|85|(1:173)|87|(0)|90|(1:171)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|37|38|(0)|41|(0)|44|(2:46|225)|229|(1:231)|237|238|(1:234)|236|50|(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|22|(0)|25|26|27|(0)|260|31|32|33|34|35|(0)|37|38|(0)|41|(0)|44|(0)|229|(0)|237|238|(0)|236|50|(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129) */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01a3, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x00ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x00ac, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0321 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: NameNotFoundException -> 0x00ab, TRY_LEAVE, TryCatch #12 {NameNotFoundException -> 0x00ab, blocks: (B:27:0x009f, B:29:0x00a5), top: B:26:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03df  */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v87, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean v() {
        w51.n nVar;
        FirebaseMessagingService firebaseMessagingService;
        s21.a aVar;
        Bundle bundle;
        String packageName;
        PackageManager packageManager;
        String n;
        String n2;
        String o;
        int i;
        String o2;
        Uri defaultUri;
        String o3;
        Intent launchIntentForPackage;
        int i2;
        PendingIntent activity;
        PendingIntent broadcast;
        String o4;
        Integer valueOf;
        String o5;
        Integer l;
        Integer l2;
        Integer l3;
        String o6;
        Long valueOf2;
        JSONArray m;
        long[] jArr;
        JSONArray m2;
        int[] iArr;
        int r0;
        String o7;
        IconCompat iconCompat;
        boolean z;
        int i3;
        ApplicationInfo applicationInfo;
        int i4 = 1;
        if (((s21.a) this.u).k("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.t;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String o8 = ((s21.a) this.u).o("gcm.n.image");
        if (!TextUtils.isEmpty(o8)) {
            try {
                nVar = new w51.n(new URL(o8));
            } catch (MalformedURLException unused) {
            }
            if (nVar != null) {
                ExecutorService executorService = (ExecutorService) this.s;
                w21.g gVar = new w21.g();
                nVar.s = executorService.submit((Runnable) new b9.f(19, nVar, gVar));
                nVar.t = gVar.a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.t;
            aVar = (s21.a) this.u;
            AtomicInteger atomicInteger = w51.e.a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String o9 = aVar.o("gcm.n.android_channel_id");
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(o9) || notificationManager.getNotificationChannel(o9) == null) {
                    o9 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (TextUtils.isEmpty(o9) || notificationManager.getNotificationChannel(o9) == null) {
                        o9 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", identifier == 0 ? "Misc" : firebaseMessagingService.getString(identifier), 3));
                        }
                    }
                }
                AtomicInteger atomicInteger2 = w51.e.a;
                packageName = firebaseMessagingService.getPackageName();
                Resources resources = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                n4.p pVar = new n4.p(firebaseMessagingService, o9);
                n = aVar.n(resources, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(n)) {
                    pVar.e = n4.p.b(n);
                }
                n2 = aVar.n(resources, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(n2)) {
                    pVar.f = n4.p.b(n2);
                    n4.n nVar2 = new n4.n(0);
                    nVar2.u = n4.p.b(n2);
                    pVar.e(nVar2);
                }
                o = aVar.o("gcm.n.icon");
                if (!TextUtils.isEmpty(o) || (((i = resources.getIdentifier(o, "drawable", packageName)) == 0 || !w51.e.a(resources, i)) && ((i = resources.getIdentifier(o, "mipmap", packageName)) == 0 || !w51.e.a(resources, i)))) {
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0 || !w51.e.a(resources, i)) {
                        i = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i != 0 || !w51.e.a(resources, i)) {
                        i = 17301651;
                    }
                }
                pVar.v.icon = i;
                o2 = aVar.o("gcm.n.sound2");
                if (TextUtils.isEmpty(o2)) {
                    o2 = aVar.o("gcm.n.sound");
                }
                if (TextUtils.isEmpty(o2)) {
                    defaultUri = null;
                } else if ("default".equals(o2) || resources.getIdentifier(o2, "raw", packageName) == 0) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                } else {
                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + o2);
                }
                if (defaultUri != null) {
                    Notification notification = pVar.v;
                    notification.sound = defaultUri;
                    notification.audioStreamType = -1;
                    notification.audioAttributes = n4.o.a(n4.o.d(n4.o.c(n4.o.b(), 4), 5));
                }
                o3 = aVar.o("gcm.n.click_action");
                if (TextUtils.isEmpty(o3)) {
                    String o10 = aVar.o("gcm.n.link_android");
                    if (TextUtils.isEmpty(o10)) {
                        o10 = aVar.o("gcm.n.link");
                    }
                    Uri parse = !TextUtils.isEmpty(o10) ? Uri.parse(o10) : null;
                    if (parse != null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setPackage(packageName);
                        launchIntentForPackage.setData(parse);
                    } else {
                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    }
                } else {
                    launchIntentForPackage = new Intent(o3);
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setFlags(268435456);
                }
                if (launchIntentForPackage == null) {
                    i2 = 1;
                    activity = null;
                } else {
                    launchIntentForPackage.addFlags(67108864);
                    Bundle bundle3 = (Bundle) aVar.s;
                    Bundle bundle4 = new Bundle(bundle3);
                    for (String str : bundle3.keySet()) {
                        int i5 = i4;
                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                            bundle4.remove(str);
                        }
                        i4 = i5;
                    }
                    i2 = i4;
                    launchIntentForPackage.putExtras(bundle4);
                    if (aVar.k("google.c.a.e")) {
                        launchIntentForPackage.putExtra("gcm.n.analytics_data", aVar.s());
                    }
                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                }
                pVar.g = activity;
                broadcast = !aVar.k("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(aVar.s())), 1140850688);
                if (broadcast != null) {
                    pVar.v.deleteIntent = broadcast;
                }
                o4 = aVar.o("gcm.n.color");
                if (!TextUtils.isEmpty(o4)) {
                    try {
                        valueOf = Integer.valueOf(Color.parseColor(o4));
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (valueOf != null) {
                        pVar.r = valueOf.intValue();
                    }
                    pVar.c(16, !aVar.k("gcm.n.sticky"));
                    pVar.p = aVar.k("gcm.n.local_only");
                    o5 = aVar.o("gcm.n.ticker");
                    if (o5 != null) {
                        pVar.v.tickerText = n4.p.b(o5);
                    }
                    l = aVar.l("gcm.n.notification_priority");
                    if (l != null || l.intValue() < -2 || l.intValue() > 2) {
                        l = null;
                    }
                    if (l != null) {
                        pVar.j = l.intValue();
                    }
                    l2 = aVar.l("gcm.n.visibility");
                    if (l2 != null || l2.intValue() < -1 || l2.intValue() > i2) {
                        l2 = null;
                    }
                    if (l2 != null) {
                        pVar.s = l2.intValue();
                    }
                    l3 = aVar.l("gcm.n.notification_count");
                    if (l3 != null || l3.intValue() < 0) {
                        l3 = null;
                    }
                    if (l3 != null) {
                        pVar.i = l3.intValue();
                    }
                    o6 = aVar.o("gcm.n.event_time");
                    if (!TextUtils.isEmpty(o6)) {
                        try {
                            valueOf2 = Long.valueOf(Long.parseLong(o6));
                        } catch (NumberFormatException unused3) {
                            s21.a.w("gcm.n.event_time");
                        }
                        if (valueOf2 != null) {
                            pVar.k = true;
                            pVar.v.when = valueOf2.longValue();
                        }
                        m = aVar.m("gcm.n.vibrate_timings");
                        if (m != null) {
                            try {
                            } catch (NumberFormatException | JSONException unused4) {
                                m.toString();
                            }
                            if (m.length() <= 1) {
                                throw new JSONException("vibrateTimings have invalid length");
                            }
                            int length = m.length();
                            jArr = new long[length];
                            for (int i6 = 0; i6 < length; i6++) {
                                jArr[i6] = m.optLong(i6);
                            }
                            if (jArr != null) {
                                pVar.v.vibrate = jArr;
                            }
                            m2 = aVar.m("gcm.n.light_settings");
                            if (m2 != null) {
                                iArr = new int[3];
                                try {
                                } catch (IllegalArgumentException e) {
                                    m2.toString();
                                    e.getMessage();
                                } catch (JSONException unused5) {
                                    m2.toString();
                                }
                                if (m2.length() != 3) {
                                    throw new JSONException("lightSettings don't have all three fields");
                                }
                                int parseColor = Color.parseColor(m2.optString(0));
                                if (parseColor == -16777216) {
                                    throw new IllegalArgumentException("Transparent color is invalid");
                                }
                                iArr[0] = parseColor;
                                iArr[1] = m2.optInt(1);
                                iArr[2] = m2.optInt(2);
                                if (iArr != null) {
                                    int i7 = iArr[0];
                                    int i8 = iArr[1];
                                    int i9 = iArr[2];
                                    Notification notification2 = pVar.v;
                                    notification2.ledARGB = i7;
                                    notification2.ledOnMS = i8;
                                    notification2.ledOffMS = i9;
                                    notification2.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | ((-2) & notification2.flags);
                                }
                                boolean k = aVar.k("gcm.n.default_sound");
                                boolean z2 = k;
                                if (aVar.k("gcm.n.default_vibrate_timings")) {
                                    z2 = (k ? 1 : 0) | 2;
                                }
                                r0 = z2;
                                if (aVar.k("gcm.n.default_light_settings")) {
                                    r0 = (z2 ? 1 : 0) | 4;
                                }
                                Notification notification3 = pVar.v;
                                notification3.defaults = r0;
                                if ((r0 & 4) != 0) {
                                    notification3.flags |= 1;
                                }
                                o7 = aVar.o("gcm.n.tag");
                                if (TextUtils.isEmpty(o7)) {
                                    o7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                }
                                String str2 = o7;
                                if (nVar != null) {
                                    try {
                                        w21.o oVar = nVar.t;
                                        c21.u.g(oVar);
                                        Bitmap bitmap = (Bitmap) t.q.d(oVar, 5L, TimeUnit.SECONDS);
                                        pVar.d(bitmap);
                                        m mVar = new m(6, false);
                                        if (bitmap == null) {
                                            iconCompat = null;
                                            z = true;
                                        } else {
                                            z = true;
                                            iconCompat = new IconCompat(1);
                                            iconCompat.b = bitmap;
                                        }
                                        mVar.t = iconCompat;
                                        mVar.u = null;
                                        mVar.v = z;
                                        pVar.e(mVar);
                                    } catch (InterruptedException unused6) {
                                        nVar.close();
                                        Thread.currentThread().interrupt();
                                    } catch (ExecutionException e2) {
                                        Objects.toString(e2.getCause());
                                    } catch (TimeoutException unused7) {
                                        nVar.close();
                                    }
                                }
                                Log.isLoggable("FirebaseMessaging", 3);
                                ((NotificationManager) ((FirebaseMessagingService) this.t).getSystemService("notification")).notify(str2, 0, pVar.a());
                                return true;
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean k2 = aVar.k("gcm.n.default_sound");
                            boolean z22 = k2;
                            if (aVar.k("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z22;
                            if (aVar.k("gcm.n.default_light_settings")) {
                            }
                            Notification notification32 = pVar.v;
                            notification32.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            o7 = aVar.o("gcm.n.tag");
                            if (TextUtils.isEmpty(o7)) {
                            }
                            String str22 = o7;
                            if (nVar != null) {
                            }
                            Log.isLoggable("FirebaseMessaging", 3);
                            ((NotificationManager) ((FirebaseMessagingService) this.t).getSystemService("notification")).notify(str22, 0, pVar.a());
                            return true;
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        m2 = aVar.m("gcm.n.light_settings");
                        if (m2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean k22 = aVar.k("gcm.n.default_sound");
                        boolean z222 = k22;
                        if (aVar.k("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z222;
                        if (aVar.k("gcm.n.default_light_settings")) {
                        }
                        Notification notification322 = pVar.v;
                        notification322.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        o7 = aVar.o("gcm.n.tag");
                        if (TextUtils.isEmpty(o7)) {
                        }
                        String str222 = o7;
                        if (nVar != null) {
                        }
                        Log.isLoggable("FirebaseMessaging", 3);
                        ((NotificationManager) ((FirebaseMessagingService) this.t).getSystemService("notification")).notify(str222, 0, pVar.a());
                        return true;
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    m = aVar.m("gcm.n.vibrate_timings");
                    if (m != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    m2 = aVar.m("gcm.n.light_settings");
                    if (m2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean k222 = aVar.k("gcm.n.default_sound");
                    boolean z2222 = k222;
                    if (aVar.k("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z2222;
                    if (aVar.k("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222 = pVar.v;
                    notification3222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    o7 = aVar.o("gcm.n.tag");
                    if (TextUtils.isEmpty(o7)) {
                    }
                    String str2222 = o7;
                    if (nVar != null) {
                    }
                    Log.isLoggable("FirebaseMessaging", 3);
                    ((NotificationManager) ((FirebaseMessagingService) this.t).getSystemService("notification")).notify(str2222, 0, pVar.a());
                    return true;
                }
                i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i3 != 0) {
                    try {
                        valueOf = Integer.valueOf(firebaseMessagingService.getColor(i3));
                    } catch (Resources.NotFoundException unused8) {
                    }
                    if (valueOf != null) {
                    }
                    pVar.c(16, !aVar.k("gcm.n.sticky"));
                    pVar.p = aVar.k("gcm.n.local_only");
                    o5 = aVar.o("gcm.n.ticker");
                    if (o5 != null) {
                    }
                    l = aVar.l("gcm.n.notification_priority");
                    if (l != null) {
                    }
                    l = null;
                    if (l != null) {
                    }
                    l2 = aVar.l("gcm.n.visibility");
                    if (l2 != null) {
                    }
                    l2 = null;
                    if (l2 != null) {
                    }
                    l3 = aVar.l("gcm.n.notification_count");
                    if (l3 != null) {
                    }
                    l3 = null;
                    if (l3 != null) {
                    }
                    o6 = aVar.o("gcm.n.event_time");
                    if (!TextUtils.isEmpty(o6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    m = aVar.m("gcm.n.vibrate_timings");
                    if (m != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    m2 = aVar.m("gcm.n.light_settings");
                    if (m2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean k2222 = aVar.k("gcm.n.default_sound");
                    boolean z22222 = k2222;
                    if (aVar.k("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z22222;
                    if (aVar.k("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222 = pVar.v;
                    notification32222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    o7 = aVar.o("gcm.n.tag");
                    if (TextUtils.isEmpty(o7)) {
                    }
                    String str22222 = o7;
                    if (nVar != null) {
                    }
                    Log.isLoggable("FirebaseMessaging", 3);
                    ((NotificationManager) ((FirebaseMessagingService) this.t).getSystemService("notification")).notify(str22222, 0, pVar.a());
                    return true;
                }
                valueOf = null;
                if (valueOf != null) {
                }
                pVar.c(16, !aVar.k("gcm.n.sticky"));
                pVar.p = aVar.k("gcm.n.local_only");
                o5 = aVar.o("gcm.n.ticker");
                if (o5 != null) {
                }
                l = aVar.l("gcm.n.notification_priority");
                if (l != null) {
                }
                l = null;
                if (l != null) {
                }
                l2 = aVar.l("gcm.n.visibility");
                if (l2 != null) {
                }
                l2 = null;
                if (l2 != null) {
                }
                l3 = aVar.l("gcm.n.notification_count");
                if (l3 != null) {
                }
                l3 = null;
                if (l3 != null) {
                }
                o6 = aVar.o("gcm.n.event_time");
                if (!TextUtils.isEmpty(o6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                m = aVar.m("gcm.n.vibrate_timings");
                if (m != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                m2 = aVar.m("gcm.n.light_settings");
                if (m2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean k22222 = aVar.k("gcm.n.default_sound");
                boolean z222222 = k22222;
                if (aVar.k("gcm.n.default_vibrate_timings")) {
                }
                r0 = z222222;
                if (aVar.k("gcm.n.default_light_settings")) {
                }
                Notification notification322222 = pVar.v;
                notification322222.defaults = r0;
                if ((r0 & 4) != 0) {
                }
                o7 = aVar.o("gcm.n.tag");
                if (TextUtils.isEmpty(o7)) {
                }
                String str222222 = o7;
                if (nVar != null) {
                }
                Log.isLoggable("FirebaseMessaging", 3);
                ((NotificationManager) ((FirebaseMessagingService) this.t).getSystemService("notification")).notify(str222222, 0, pVar.a());
                return true;
            }
            o9 = null;
            AtomicInteger atomicInteger22 = w51.e.a;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources2 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            n4.p pVar2 = new n4.p(firebaseMessagingService, o9);
            n = aVar.n(resources2, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(n)) {
            }
            n2 = aVar.n(resources2, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(n2)) {
            }
            o = aVar.o("gcm.n.icon");
            if (!TextUtils.isEmpty(o)) {
            }
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i != 0) {
            }
            i = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i != 0) {
            }
            i = 17301651;
            pVar2.v.icon = i;
            o2 = aVar.o("gcm.n.sound2");
            if (TextUtils.isEmpty(o2)) {
            }
            if (TextUtils.isEmpty(o2)) {
            }
            if (defaultUri != null) {
            }
            o3 = aVar.o("gcm.n.click_action");
            if (TextUtils.isEmpty(o3)) {
            }
            if (launchIntentForPackage == null) {
            }
            pVar2.g = activity;
            if (!aVar.k("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            o4 = aVar.o("gcm.n.color");
            if (!TextUtils.isEmpty(o4)) {
            }
            i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i3 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            pVar2.c(16, !aVar.k("gcm.n.sticky"));
            pVar2.p = aVar.k("gcm.n.local_only");
            o5 = aVar.o("gcm.n.ticker");
            if (o5 != null) {
            }
            l = aVar.l("gcm.n.notification_priority");
            if (l != null) {
            }
            l = null;
            if (l != null) {
            }
            l2 = aVar.l("gcm.n.visibility");
            if (l2 != null) {
            }
            l2 = null;
            if (l2 != null) {
            }
            l3 = aVar.l("gcm.n.notification_count");
            if (l3 != null) {
            }
            l3 = null;
            if (l3 != null) {
            }
            o6 = aVar.o("gcm.n.event_time");
            if (!TextUtils.isEmpty(o6)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            m = aVar.m("gcm.n.vibrate_timings");
            if (m != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            m2 = aVar.m("gcm.n.light_settings");
            if (m2 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean k222222 = aVar.k("gcm.n.default_sound");
            boolean z2222222 = k222222;
            if (aVar.k("gcm.n.default_vibrate_timings")) {
            }
            r0 = z2222222;
            if (aVar.k("gcm.n.default_light_settings")) {
            }
            Notification notification3222222 = pVar2.v;
            notification3222222.defaults = r0;
            if ((r0 & 4) != 0) {
            }
            o7 = aVar.o("gcm.n.tag");
            if (TextUtils.isEmpty(o7)) {
            }
            String str2222222 = o7;
            if (nVar != null) {
            }
            Log.isLoggable("FirebaseMessaging", 3);
            ((NotificationManager) ((FirebaseMessagingService) this.t).getSystemService("notification")).notify(str2222222, 0, pVar2.a());
            return true;
        }
        nVar = null;
        if (nVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.t;
        aVar = (s21.a) this.u;
        AtomicInteger atomicInteger3 = w51.e.a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String o92 = aVar.o("gcm.n.android_channel_id");
        if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
        }
        o92 = null;
        AtomicInteger atomicInteger222 = w51.e.a;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources22 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        n4.p pVar22 = new n4.p(firebaseMessagingService, o92);
        n = aVar.n(resources22, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
        }
        n2 = aVar.n(resources22, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
        }
        o = aVar.o("gcm.n.icon");
        if (!TextUtils.isEmpty(o)) {
        }
        i = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i != 0) {
        }
        i = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i != 0) {
        }
        i = 17301651;
        pVar22.v.icon = i;
        o2 = aVar.o("gcm.n.sound2");
        if (TextUtils.isEmpty(o2)) {
        }
        if (TextUtils.isEmpty(o2)) {
        }
        if (defaultUri != null) {
        }
        o3 = aVar.o("gcm.n.click_action");
        if (TextUtils.isEmpty(o3)) {
        }
        if (launchIntentForPackage == null) {
        }
        pVar22.g = activity;
        if (!aVar.k("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        o4 = aVar.o("gcm.n.color");
        if (!TextUtils.isEmpty(o4)) {
        }
        i3 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i3 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        pVar22.c(16, !aVar.k("gcm.n.sticky"));
        pVar22.p = aVar.k("gcm.n.local_only");
        o5 = aVar.o("gcm.n.ticker");
        if (o5 != null) {
        }
        l = aVar.l("gcm.n.notification_priority");
        if (l != null) {
        }
        l = null;
        if (l != null) {
        }
        l2 = aVar.l("gcm.n.visibility");
        if (l2 != null) {
        }
        l2 = null;
        if (l2 != null) {
        }
        l3 = aVar.l("gcm.n.notification_count");
        if (l3 != null) {
        }
        l3 = null;
        if (l3 != null) {
        }
        o6 = aVar.o("gcm.n.event_time");
        if (!TextUtils.isEmpty(o6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        m = aVar.m("gcm.n.vibrate_timings");
        if (m != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        m2 = aVar.m("gcm.n.light_settings");
        if (m2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean k2222222 = aVar.k("gcm.n.default_sound");
        boolean z22222222 = k2222222;
        if (aVar.k("gcm.n.default_vibrate_timings")) {
        }
        r0 = z22222222;
        if (aVar.k("gcm.n.default_light_settings")) {
        }
        Notification notification32222222 = pVar22.v;
        notification32222222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        o7 = aVar.o("gcm.n.tag");
        if (TextUtils.isEmpty(o7)) {
        }
        String str22222222 = o7;
        if (nVar != null) {
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) ((FirebaseMessagingService) this.t).getSystemService("notification")).notify(str22222222, 0, pVar22.a());
        return true;
    }

    public boolean w(CharSequence charSequence, int i, int i2, t tVar) {
        if ((tVar.c & 3) == 0) {
            u5.c cVar = (u5.e) this.u;
            androidx.emoji2.text.flatbuffer.a c = tVar.c();
            int a = c.a(8);
            if (a != 0) {
                ((ByteBuffer) ((q0) c).u).getShort(a + ((q0) c).r);
            }
            u5.c cVar2 = cVar;
            cVar2.getClass();
            ThreadLocal threadLocal = u5.c.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = cVar2.a;
            String sb2 = sb.toString();
            int i3 = r4.c.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i4 = tVar.c & 4;
            tVar.c = hasGlyph ? i4 | 2 : i4 | 1;
        }
        return (tVar.c & 3) == 2;
    }

    public boolean y() {
        return !(((v1) ((s21.a) this.s).s).isEmpty() && ((v1) ((s21.a) this.u).s).isEmpty() && ((v1) ((s21.a) this.t).s).isEmpty());
    }

    public boolean z() {
        if (((i3) this.s).getValue() != this.u) {
            return true;
        }
        h hVar = (h) this.t;
        return hVar != null && hVar.z();
    }

    public h(String str) {
        this.r = 17;
        k.g(str, "text");
        this.s = str;
        this.t = t71.p.f0(str, new char[]{'\n'}, 6);
        this.u = str.length() > 0 ? new s91.c(this, 0, -1, -1).f(1) : null;
    }

    public h(qm.d dVar, v vVar, v vVar2) {
        this.r = 18;
        k.g(dVar, "repository");
        k.g(vVar, "ioDispatcher");
        k.g(vVar2, "defaultDispatcher");
        this.s = dVar;
        this.t = vVar;
        this.u = vVar2;
    }

    public h(nm.i iVar, h hVar, y yVar, v vVar) {
        this.r = 14;
        k.g(iVar, "repository");
        k.g(vVar, "ioDispatcher");
        this.s = iVar;
        this.t = hVar;
        this.u = vVar;
    }

    public h(oa.g gVar, oa.g gVar2, v vVar) {
        this.r = 2;
        k.g(gVar, "service");
        k.g(gVar2, "logStorage");
        k.g(vVar, "ioDispatcher");
        this.s = gVar;
        this.t = gVar2;
        this.u = vVar;
    }

    public h(g9.h hVar, l lVar) {
        w9.j kVar;
        this.r = 13;
        this.s = hVar;
        this.t = lVar;
        int i = Build.VERSION.SDK_INT;
        if (w9.a.a) {
            kVar = new w9.j(false);
        } else if (i != 26 && i != 27) {
            kVar = new w9.j(true);
        } else {
            kVar = new w9.k();
        }
        this.u = kVar;
    }

    public h(j0 j0Var) {
        this.r = 25;
        this.s = j0Var;
        this.t = h91.b.c(j0Var.a());
        this.u = h91.b.b(j0Var.c());
    }

    public h(b2.i iVar) {
        this.r = 5;
        this.s = iVar;
        this.t = new AtomicInteger(0);
        this.u = new AtomicBoolean(false);
    }

    public h(s21.a aVar, byte b) {
        this.r = 22;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.t = new Object();
        this.s = aVar;
    }

    public h(p31.b bVar, View view) {
        Object cVar;
        this.r = 8;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            cVar = new p31.e();
        } else {
            cVar = i >= 33 ? new p31.c() : null;
        }
        this.s = cVar;
        this.t = bVar;
        this.u = view;
    }

    public h(FirebaseMessagingService firebaseMessagingService, s21.a aVar, ExecutorService executorService) {
        this.r = 28;
        this.s = executorService;
        this.t = firebaseMessagingService;
        this.u = aVar;
    }

    public h(Context context, TypedArray typedArray) {
        this.r = 9;
        this.s = context;
        this.t = typedArray;
    }

    public h(ConnectivityManager connectivityManager, l lVar) {
        this.r = 11;
        this.s = connectivityManager;
        this.t = lVar;
        b9.i iVar = new b9.i(1, this);
        this.u = iVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), (ConnectivityManager.NetworkCallback) iVar);
    }

    public h(t.u uVar) {
        this.r = 19;
        this.u = uVar;
    }

    public h(int i) {
        this.r = i;
        switch (i) {
            case 4:
                this.u = new c30.d(8);
                break;
            case 7:
                this.s = new WeakHashMap();
                this.t = new WeakHashMap();
                this.u = new WeakHashMap();
                break;
            case 10:
                String uuid = UUID.randomUUID().toString();
                k.f(uuid, "toString(...)");
                h91.k kVar = h91.k.u;
                this.s = c30.d.b(uuid);
                this.t = q81.s.e;
                this.u = new ArrayList();
                break;
            case 12:
                this.s = new AtomicReference(r1.i.b);
                this.t = new Object();
                break;
            case 27:
                this.s = new s21.a(13);
                this.t = new s21.a(13);
                this.u = new s21.a(13);
                break;
        }
    }

    public h(r rVar, w wVar, u5.c cVar, Set set) {
        this.r = 24;
        this.s = wVar;
        this.t = rVar;
        this.u = cVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            F(str, 0, str.length(), 1, true, new a81.t(8, str, false));
        }
    }

    public h(t1 t1Var) {
        this.r = 26;
        this.u = t1Var;
        v81.e eVar = (v81.e) t1Var.d;
        this.s = new u81.e(t1Var, eVar.g().c(), -1L, true);
        this.t = new u81.f(t1Var, eVar.g().a(), -1L, true);
    }

    public h(k3.f0 f0Var, h hVar) {
        this.r = 6;
        this.s = f0Var;
        this.t = hVar;
        this.u = f0Var.getValue();
    }

    public h(Signature signature) {
        this.r = 21;
        this.s = signature;
        this.t = null;
        this.u = null;
    }

    public h(Cipher cipher) {
        this.r = 21;
        this.t = cipher;
        this.s = null;
        this.u = null;
    }

    public h(Mac mac) {
        this.r = 21;
        this.u = mac;
        this.t = null;
        this.s = null;
    }

    public h(a7.d dVar) {
        this.r = 20;
        Context context = dVar.a;
        this.s = dVar;
        int i = Build.VERSION.SDK_INT;
        this.t = i >= 29 ? o.b(context) : null;
        this.u = i <= 29 ? new a7.d(context, (short) 0) : null;
    }

    public h(s21.a aVar) {
        this.r = 16;
        this.s = aVar;
        this.t = new ReentrantLock();
        this.u = new WeakHashMap();
    }





}
