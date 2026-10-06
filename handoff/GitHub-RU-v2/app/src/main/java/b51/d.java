package b51;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.t1;
import androidx.work.impl.WorkDatabase;
import h0.q1;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k71.k;
import m11.s;
import v2.t;
import v41.i;
import v41.q;
import v41.u;
import v41.v;
import v8.x;
import w21.g;
import w21.o;
import w51.r;
import x41.e;
import x41.f;
import x41.h;
import x41.n;
import y41.a0;
import y41.b0;
import y41.c1;
import y41.c2;
import y41.d1;
import y41.f0;
import y41.f1;
import y41.g1;
import y41.j2;
import y41.o0Shadow;
import y41.p0;
import y41.q0;
import y41.r0;
import y41.t0;
import y41.u0;
import y41.v0;
import y41.z0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public d() {
        this.a = new AtomicBoolean();
        this.b = null;
        this.c = new HashMap(16, 1.0f);
        this.d = new HashMap(16, 1.0f);
        this.e = new HashMap(16, 1.0f);
        this.f = new HashMap(16, 1.0f);
        this.g = null;
    }

    public static p0 a(p0 p0Var, f fVar, d dVar, Map map) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Map unmodifiableMap3;
        o0Shadow a = p0Var.a();
        String e = ((x41.d) fVar.s).e();
        if (e != null) {
            a.e = new c1(e);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        t1 t1Var = (t1) dVar.d;
        if (map.isEmpty()) {
            e eVar = (e) ((AtomicMarkableReference) t1Var.b).getReference();
            synchronized (eVar) {
                unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(eVar.a));
            }
        } else {
            e eVar2 = (e) ((AtomicMarkableReference) t1Var.b).getReference();
            synchronized (eVar2) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar2.a));
            }
            HashMap hashMap = new HashMap(unmodifiableMap);
            for (Map.Entry entry : map.entrySet()) {
                String a2 = e.a((String) entry.getKey(), 1024);
                if (hashMap.size() < 64 || hashMap.containsKey(a2)) {
                    hashMap.put(a2, e.a((String) entry.getValue(), 1024));
                }
            }
            unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
        }
        List g = g(unmodifiableMap2);
        e eVar3 = (e) ((AtomicMarkableReference) ((t1) dVar.e).b).getReference();
        synchronized (eVar3) {
            unmodifiableMap3 = Collections.unmodifiableMap(new HashMap(eVar3.a));
        }
        List g2 = g(unmodifiableMap3);
        if (!g.isEmpty() || !g2.isEmpty()) {
            q0 q0Var = (q0) p0Var.c;
            a.c = new q0(q0Var.a, g, g2, q0Var.d, q0Var.e, q0Var.f, q0Var.g);
        }
        return a.a();
    }

    public static j2 b(p0 p0Var, d dVar) {
        List unmodifiableList;
        q1 q1Var = (q1) dVar.f;
        synchronized (q1Var) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(q1Var.b));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < unmodifiableList.size(); i++) {
            n nVar = (n) unmodifiableList.get(i);
            nVar.getClass();
            d1 d1Var = new d1();
            x41.b bVar = (x41.b) nVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            d1Var.a = new f1(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            d1Var.b = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            d1Var.c = str4;
            d1Var.d = bVar.f;
            d1Var.e = (byte) (d1Var.e | 1);
            arrayList.add(d1Var.a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        o0Shadow a = p0Var.a();
        a.f = new g1(arrayList);
        return a.a();
    }

    public static String d(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static d e(Context context, v vVar, d dVar, v41.a aVar, f fVar, d dVar2, e51.a aVar2, d51.d dVar3, t tVar, i iVar, w41.c cVar) {
        q qVar = new q(context, vVar, aVar, aVar2, dVar3);
        b bVar = new b(dVar, dVar3, iVar);
        z41.c cVar2 = c51.a.b;
        s.b(context);
        return new d(qVar, bVar, new c51.a(new c51.d(s.a().c(new k11.a(c51.a.c, c51.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new j11.c("json"), c51.a.e), dVar3.c(), tVar)), fVar, dVar2, vVar, cVar);
    }

    public static List g(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new f0(str, str2));
        }
        Collections.sort(arrayList, new androidx.compose.foundation.lazy.layout.a(10));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void i(File file) {
        synchronized (d.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    file.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    file.delete();
                }
                if (!file.mkdirs()) {
                    file.toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean j(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j(file2);
            }
        }
        return file.delete();
    }

    public static List k(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void c(String str) {
        File file = new File((File) this.b, str);
        if (file.exists() && j(file)) {
            file.getPath();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public File f(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void h(Throwable th, Thread thread, String str, final x41.c cVar, boolean z) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        e51.a aVar;
        final boolean equals = str.equals("crash");
        q qVar = (q) this.a;
        long j = cVar.b;
        Context context = qVar.a;
        int i = context.getResources().getConfiguration().orientation;
        e51.a aVar2 = qVar.d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        r rVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            rVar = new r(th3.getLocalizedMessage(), th3.getClass().getName(), aVar2.k(th3.getStackTrace()), rVar, 9);
        }
        r rVar2 = rVar;
        o0Shadow o0Var = new o0Shadow();
        o0Var.b = str;
        o0Var.a = j;
        o0Var.g = (byte) (o0Var.g | 1);
        c2 b = s41.c.a.b(context);
        int i2 = ((z0) b).c;
        Boolean valueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList a = s41.c.a(context);
        byte b2 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) rVar2.u;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b3 = (byte) 1;
        List d = q.d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        if (b3 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b3 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(no.a.n("Missing required properties:", sb));
        }
        arrayList.add(new v0(4, name, d));
        if (z) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    aVar = aVar2;
                } else {
                    StackTraceElement[] k = aVar2.k(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d2 = q.d(k, 0);
                    if (d2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b3 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        if (b3 == 0) {
                            sb2.append(" importance");
                        }
                        throw new IllegalStateException(no.a.n("Missing required properties:", sb2));
                    }
                    aVar = aVar2;
                    arrayList.add(new v0(0, name2, d2));
                }
                it2 = it;
                aVar2 = aVar;
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        t0 c = q.c(rVar2, 0);
        u0 e = q.e();
        List a2 = qVar.a();
        if (a2 == null) {
            throw new NullPointerException("Null binaries");
        }
        r0 r0Var = new r0(unmodifiableList, c, null, e, a2);
        if (b2 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b2 == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(no.a.n("Missing required properties:", sb3));
        }
        o0Var.c = new q0(r0Var, null, null, valueOf, b, a, i);
        o0Var.d = qVar.b(i);
        p0 a3 = o0Var.a();
        Map map = cVar.c;
        f fVar = (f) this.d;
        d dVar = (d) this.e;
        final j2 b4 = b(a(a3, fVar, dVar, map), dVar);
        if (z) {
            ((b) this.b).d(b4, cVar.a, equals);
        } else {
            ((w41.c) this.g).b.a(new Runnable() { // from class: v41.w
                @Override // java.lang.Runnable
                public final void run() {
                    b51.d dVar2 = b51.d.this;
                    dVar2.getClass();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    ((b51.b) dVar2.b).d(b4, cVar.a, equals);
                }
            });
        }
    }

    public o l(String str, Executor executor) {
        g gVar;
        ArrayList b = ((b) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            File file = (File) obj;
            try {
                z41.c cVar = b.g;
                String e = b.e(file);
                cVar.getClass();
                arrayList.add(new v41.b(z41.c.i(e), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            v41.b bVar = (v41.b) obj2;
            if (str == null || str.equals(bVar.b)) {
                c51.a aVar = (c51.a) this.c;
                b0 b0Var = bVar.a;
                if (b0Var.f == null || b0Var.g == null) {
                    u b2 = ((v) this.f).b(true);
                    b0 b0Var2 = bVar.a;
                    String str2 = b2.a;
                    a0 a = b0Var2.a();
                    a.e = str2;
                    b0 a2 = a.a();
                    String str3 = b2.b;
                    a0 a3 = a2.a();
                    a3.f = str3;
                    bVar = new v41.b(a3.a(), bVar.b, bVar.c);
                }
                boolean z = str != null;
                c51.d dVar = aVar.a;
                synchronized (dVar.f) {
                    try {
                        gVar = new g();
                        if (z) {
                            ((AtomicInteger) dVar.i.s).getAndIncrement();
                            if (dVar.f.size() < dVar.e) {
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                dVar.f.size();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                dVar.g.execute(new c51.c(dVar, bVar, gVar, 0));
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                gVar.c(bVar);
                            } else {
                                dVar.a();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                ((AtomicInteger) dVar.i.t).getAndIncrement();
                                gVar.c(bVar);
                            }
                        } else {
                            dVar.b(bVar, gVar);
                        }
                    } finally {
                    }
                }
                arrayList2.add(gVar.a.e(executor, new c5.b(25, this)));
            }
        }
        return t.q.u(arrayList2);
    }

    public d(Context context) {
        String str;
        String replaceAll;
        String str2 = ((z0) s41.c.a.b(context)).a;
        this.a = str2;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = v41.g.h(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        i(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        i(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        i(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        i(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        i(file5);
        this.g = file5;
    }

    public d(String str, d dVar, w41.c cVar) {
        this.d = new t1(this, false);
        this.e = new t1(this, true);
        this.f = new q1(5);
        this.g = new AtomicMarkableReference(null, false);
        this.a = str;
        this.b = new h(dVar);
        this.c = cVar;
    }

    public d(q qVar, b bVar, c51.a aVar, f fVar, d dVar, v vVar, w41.c cVar) {
        this.a = qVar;
        this.b = bVar;
        this.c = aVar;
        this.d = fVar;
        this.e = dVar;
        this.f = vVar;
        this.g = cVar;
    }

    public d(Context context, v8.c cVar, f9.a aVar, c9.a aVar2, WorkDatabase workDatabase, d9.q qVar, ArrayList arrayList) {
        k.g(context, "context");
        k.g(aVar2, "foregroundProcessor");
        this.a = cVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = workDatabase;
        this.e = qVar;
        this.f = arrayList;
        Context applicationContext = context.getApplicationContext();
        k.f(applicationContext, "getApplicationContext(...)");
        this.g = applicationContext;
        new x();
    }

}
