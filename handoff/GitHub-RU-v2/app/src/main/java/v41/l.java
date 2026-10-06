package v41;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.t1;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.measurement.internal.h2;
import h0.q1;
import j11.g;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import l7.x1;
import m11.i;
import m11.j;
import w8.f;
import x41.h;
import y41.a0;
import y41.b0;
import y41.c0;
import y41.d0;
import y41.e0;
import y41.h1;
import y41.i0;
import y41.j0;
import y41.j1;
import y41.k0;
import y41.k1;
import y41.l1;
import y41.m0;
import y41.m1;
import y41.m2;
import y41.n1;
import y41.n2;
import y41.o0;
import y41.p0;
import y41.q0;
import y41.r0;
import y41.u0;
import y41.y0;
import y41.z0;
import z70.x3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public static final b51.a r = new b51.a(3);
    public static final Charset s = Charset.forName("UTF-8");
    public Context a;
    public s b;
    public v2.t c;
    public b51.d d;
    public w41.c e;
    public v f;
    public b51.d g;
    public a h;
    public x41.f i;
    public s41.b j;
    public t41.a k;
    public i l;
    public b51.d m;
    public rShadow n;
    public final w21.g o = new w21.g();
    public final w21.g p = new w21.g();
    public final w21.g q = new w21.g();

    public l(Context context, v vVar, s sVar, b51.d dVar, v2.t tVar, a aVar, b51.d dVar2, x41.f fVar, b51.d dVar3, s41.b bVar, t41.a aVar2, i iVar, w41.c cVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = vVar;
        this.b = sVar;
        this.g = dVar;
        this.c = tVar;
        this.h = aVar;
        this.d = dVar2;
        this.i = fVar;
        this.j = bVar;
        this.k = aVar2;
        this.l = iVar;
        this.m = dVar3;
        this.e = cVar;
    }

    public static w21.o a(l lVar) {
        w21.o f;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : b51.d.k(((File) lVar.g.c).listFiles(rShadow))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    f = t.q.k((Object) null);
                } catch (ClassNotFoundException unused) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    f = t.q.f(new ScheduledThreadPoolExecutor(1), new k(lVar, parseLong));
                }
                arrayList.add(f);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return t.q.u(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [int] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r14v32, types: [int] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z, d51.d dVar, boolean z2) {
        ArrayList arrayList;
        int i;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        String str;
        String substring;
        i0 a;
        boolean z5;
        String[] list;
        List list2;
        boolean z6;
        ApplicationExitInfo applicationExitInfo;
        String str2;
        String processName;
        int i4;
        int i5;
        List list3;
        InputStream traceInputStream;
        Closeable closeable;
        FileInputStream fileInputStream;
        w41.c.a();
        ArrayList arrayList2 = new ArrayList(((b51.b) this.m.b).c());
        if (arrayList2.size() <= z) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        String str3 = (String) arrayList2.get(z == true ? 1 : 0);
        boolean z7 = true;
        if (!z2 || !dVar.c().b.b) {
            arrayList = arrayList2;
            i = 2;
            z3 = true;
            i2 = 4;
            i3 = 8;
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else if (Build.VERSION.SDK_INT >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                b51.d dVar2 = this.g;
                x41.f fVar = new x41.f(dVar2);
                fVar.s = x41.f.t;
                if (str3 != null) {
                    fVar.s = new x41.m(dVar2.f(str3, "userlog"));
                }
                b51.d dVar3 = this.g;
                w41.c cVar = this.e;
                x41.h hVar = new x41.h(dVar3);
                i2 = 4;
                b51.d dVar4 = new b51.d(str3, dVar3, cVar);
                i3 = 8;
                ((x41.e) ((AtomicMarkableReference) ((t1) dVar4.d).b).getReference()).c(hVar.c(str3, false));
                ((x41.e) ((AtomicMarkableReference) ((t1) dVar4.e).b).getReference()).c(hVar.c(str3, true));
                ((AtomicMarkableReference) dVar4.g).set(hVar.d(str3), false);
                q1 q1Var = (q1) dVar4.f;
                File f = dVar3.f(str3, "rollouts-state");
                if (f.exists()) {
                    int r14 = (int) ((f.length() > 0L ? 1 : (f.length() == 0L ? 0 : -1)));
                    try {
                        if (r14 != 0) {
                            try {
                                fileInputStream = new FileInputStream(f);
                                try {
                                    list2 = x41.h.b(g.i(fileInputStream));
                                    list2.toString();
                                    Log.isLoggable("FirebaseCrashlytics", 3);
                                    g.b(fileInputStream);
                                    r14 = fileInputStream;
                                } catch (Exception unused) {
                                    x41.h.f(f);
                                    g.b(fileInputStream);
                                    list2 = Collections.EMPTY_LIST;
                                    r14 = fileInputStream;
                                    synchronized (q1Var) {
                                    }
                                }
                            } catch (Exception unused2) {
                                fileInputStream = null;
                            } catch (Throwable th) {
                                th = th;
                                closeable = null;
                                g.b(closeable);
                                throw th;
                            }
                            synchronized (q1Var) {
                                q1Var.b.clear();
                                int size = list2.size();
                                int i6 = q1Var.a;
                                if (size > i6) {
                                    q1Var.b.addAll(list2.subList(0, i6));
                                } else {
                                    q1Var.b.addAll(list2);
                                }
                            }
                            b51.d dVar5 = this.m;
                            b51.b bVar = (b51.b) dVar5.b;
                            long lastModified = bVar.b.f(str3, "start-time").lastModified();
                            Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                            while (it.hasNext()) {
                                applicationExitInfo = it.next();
                                if (applicationExitInfo.getTimestamp() < lastModified) {
                                    break;
                                }
                                z6 = z7;
                                if (applicationExitInfo.getReason() == 6) {
                                    break;
                                } else {
                                    z7 = z6;
                                }
                            }
                            z6 = z7;
                            applicationExitInfo = null;
                            if (applicationExitInfo == null) {
                                Log.isLoggable("FirebaseCrashlytics", 2);
                                arrayList = arrayList2;
                                i4 = 2;
                                z3 = z6;
                            } else {
                                q qVar = (q) dVar5.a;
                                try {
                                    traceInputStream = applicationExitInfo.getTraceInputStream();
                                } catch (IOException e) {
                                    applicationExitInfo.toString();
                                    e.toString();
                                }
                                if (traceInputStream != null) {
                                    str2 = b51.d.d(traceInputStream);
                                    c0 c0Var = new c0();
                                    c0Var.d = applicationExitInfo.getImportance();
                                    c0Var.j = (byte) (c0Var.j | 4);
                                    processName = applicationExitInfo.getProcessName();
                                    if (processName != null) {
                                        throw new NullPointerException("Null processName");
                                    }
                                    c0Var.b = processName;
                                    c0Var.c = applicationExitInfo.getReason();
                                    c0Var.j = (byte) (c0Var.j | 2);
                                    c0Var.g = applicationExitInfo.getTimestamp();
                                    c0Var.j = (byte) (c0Var.j | 32);
                                    c0Var.a = applicationExitInfo.getPid();
                                    c0Var.j = (byte) (c0Var.j | 1);
                                    c0Var.e = applicationExitInfo.getPss();
                                    c0Var.j = (byte) (c0Var.j | 8);
                                    c0Var.f = applicationExitInfo.getRss();
                                    c0Var.j = (byte) (c0Var.j | 16);
                                    c0Var.h = str2;
                                    d0 a2 = c0Var.a();
                                    int i7 = qVar.a.getResources().getConfiguration().orientation;
                                    o0 o0Var = new o0();
                                    o0Var.b = "anr";
                                    long j = a2.g;
                                    o0Var.a = j;
                                    i4 = 2;
                                    o0Var.g = (byte) (o0Var.g | 1);
                                    a aVar = qVar.c;
                                    if (!qVar.e.c().b.c || aVar.c.size() <= 0) {
                                        arrayList = arrayList2;
                                        i5 = i7;
                                        list3 = null;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        ArrayList arrayList4 = aVar.c;
                                        int size2 = arrayList4.size();
                                        i5 = i7;
                                        int i8 = 0;
                                        while (i8 < size2) {
                                            Object obj = arrayList4.get(i8);
                                            int i9 = i8 + 1;
                                            int i10 = size2;
                                            d dVar6 = (d) obj;
                                            ArrayList arrayList5 = arrayList4;
                                            String str4 = dVar6.a;
                                            if (str4 == null) {
                                                throw new NullPointerException("Null libraryName");
                                            }
                                            String str5 = dVar6.b;
                                            if (str5 == null) {
                                                throw new NullPointerException("Null arch");
                                            }
                                            String str6 = dVar6.c;
                                            if (str6 == null) {
                                                throw new NullPointerException("Null buildId");
                                            }
                                            arrayList3.add(new e0(str5, str4, str6));
                                            size2 = i10;
                                            arrayList4 = arrayList5;
                                            i8 = i9;
                                            arrayList2 = arrayList2;
                                        }
                                        arrayList = arrayList2;
                                        list3 = Collections.unmodifiableList(arrayList3);
                                    }
                                    c0 c0Var2 = new c0();
                                    c0Var2.d = a2.d;
                                    byte b = (byte) (c0Var2.j | 4);
                                    c0Var2.j = b;
                                    String str7 = a2.b;
                                    if (str7 == null) {
                                        throw new NullPointerException("Null processName");
                                    }
                                    c0Var2.b = str7;
                                    c0Var2.c = a2.c;
                                    c0Var2.g = j;
                                    c0Var2.a = a2.a;
                                    c0Var2.e = a2.e;
                                    c0Var2.f = a2.f;
                                    c0Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 32)) | 1)) | 8)) | 16);
                                    c0Var2.h = a2.h;
                                    c0Var2.i = list3;
                                    d0 a3 = c0Var2.a();
                                    Boolean valueOf = Boolean.valueOf(a3.d != 100 ? z6 : false);
                                    String str8 = a3.b;
                                    int i12 = a3.a;
                                    int i13 = a3.d;
                                    k71.k.g(str8, "processName");
                                    if ((8 & 4) != 0) {
                                        i13 = 0;
                                    }
                                    y0 y0Var = new y0();
                                    y0Var.a = str8;
                                    y0Var.b = i12;
                                    byte b2 = (byte) (y0Var.e | 1);
                                    y0Var.c = i13;
                                    y0Var.d = false;
                                    y0Var.e = (byte) (((byte) (b2 | 2)) | 4);
                                    z0 a4 = y0Var.a();
                                    boolean z8 = z6;
                                    byte b3 = z8 ? (byte) 1 : (byte) 0;
                                    u0 e2 = q.e();
                                    List a5 = qVar.a();
                                    if (a5 == null) {
                                        throw new NullPointerException("Null binaries");
                                    }
                                    r0 r0Var = new r0(null, null, a3, e2, a5);
                                    if (b3 != z8) {
                                        StringBuilder sb = new StringBuilder();
                                        if (b3 == 0) {
                                            sb.append(" uiOrientation");
                                        }
                                        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
                                    }
                                    o0Var.c = new q0(r0Var, null, null, valueOf, a4, null, i5);
                                    o0Var.d = qVar.b(i5);
                                    p0 a6 = o0Var.a();
                                    Log.isLoggable("FirebaseCrashlytics", 3);
                                    z3 = true;
                                    bVar.d(b51.d.b(b51.d.a(a6, fVar, dVar4, Collections.EMPTY_MAP), dVar4), str3, true);
                                }
                                str2 = null;
                                c0 c0Var3 = new c0();
                                c0Var3.d = applicationExitInfo.getImportance();
                                c0Var3.j = (byte) (c0Var3.j | 4);
                                processName = applicationExitInfo.getProcessName();
                                if (processName != null) {
                                }
                            }
                            i = i4;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = r14;
                    }
                }
                if (f.exists() && f.delete()) {
                    f.getAbsolutePath();
                }
                list2 = Collections.EMPTY_LIST;
                synchronized (q1Var) {
                }
            } else {
                arrayList = arrayList2;
                z3 = true;
                i2 = 4;
                i3 = 8;
                i = 2;
                Log.isLoggable("FirebaseCrashlytics", 2);
            }
        } else {
            arrayList = arrayList2;
            i = 2;
            z3 = true;
            i2 = 4;
            i3 = 8;
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        if (z2 && this.j.c(str3)) {
            Log.isLoggable("FirebaseCrashlytics", i);
            this.j.a(str3).getClass();
        }
        if (z != 0) {
            z4 = false;
            str = (String) arrayList.get(0);
        } else {
            z4 = false;
            this.l.a(null);
            str = null;
        }
        b51.d dVar7 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        b51.b bVar2 = (b51.b) dVar7.b;
        b51.d dVar8 = bVar2.b;
        dVar8.c(".com.google.firebase.crashlytics");
        dVar8.c(".com.google.firebase.crashlytics-ndk");
        if (!((String) dVar8.a).isEmpty()) {
            dVar8.c(".com.google.firebase.crashlytics.files.v1");
            final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) dVar8.b;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: b51.c
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str10) {
                    return str10.startsWith(str9);
                }
            })) != null) {
                int length = list.length;
                for (int r12 = 0; r12 < length; r12++) {
                    dVar8.c(list[r12]);
                }
            }
        }
        NavigableSet<String> c = bVar2.c();
        if (str != null) {
            c.remove(str);
        }
        int i14 = i3;
        if (c.size() > i14) {
            while (c.size() > i14) {
                String str10 = (String) c.last();
                Log.isLoggable("FirebaseCrashlytics", 3);
                b51.d.j(new File((File) dVar8.d, str10));
                c.remove(str10);
            }
        }
        for (String str11 : c) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            z41.c cVar2 = b51.b.g;
            b51.a aVar2 = b51.b.i;
            File file2 = new File((File) dVar8.d, str11);
            file2.mkdirs();
            List<File> k = b51.d.k(file2.listFiles(aVar2));
            if (k.isEmpty()) {
                Log.isLoggable("FirebaseCrashlytics", 2);
            } else {
                Collections.sort(k);
                ArrayList arrayList6 = new ArrayList();
                boolean z9 = z4;
                for (File file3 : k) {
                    try {
                        String e3 = b51.b.e(file3);
                        cVar2.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(e3));
                            try {
                                p0 e4 = z41.c.e(jsonReader);
                                jsonReader.close();
                                arrayList6.add(e4);
                            } finally {
                            }
                        } catch (IllegalStateException e5) {
                            throw new IOException(e5);
                        }
                    } catch (IOException unused3) {
                        Objects.toString(file3);
                    }
                    if (!z9) {
                        String name = file3.getName();
                        if (!name.startsWith("event") || !name.endsWith("_")) {
                            z5 = false;
                            z9 = z5;
                        }
                    }
                    z5 = z3;
                    z9 = z5;
                }
                if (!arrayList6.isEmpty()) {
                    String d = new x41.h(dVar8).d(str11);
                    h hVar2 = bVar2.d.b;
                    synchronized (hVar2) {
                        if (Objects.equals(hVar2.b, str11)) {
                            substring = hVar2.c;
                        } else {
                            b51.d dVar9 = hVar2.a;
                            b51.a aVar3 = h.d;
                            File file4 = new File((File) dVar9.d, str11);
                            file4.mkdirs();
                            List k2 = b51.d.k(file4.listFiles(aVar3));
                            substring = k2.isEmpty() ? null : ((File) Collections.min(k2, h.e)).getName().substring(i2);
                        }
                    }
                    File f2 = dVar8.f(str11, "report");
                    try {
                        String e6 = b51.b.e(f2);
                        cVar2.getClass();
                        b0 i15 = z41.c.i(e6);
                        a0 a7 = i15.a();
                        m2 m2Var = i15.k;
                        if (m2Var != null) {
                            try {
                                a = m2Var.a();
                                a.e = Long.valueOf(currentTimeMillis);
                                a.f = z9;
                            } catch (IOException unused4) {
                            }
                            try {
                                a.m = (byte) (a.m | 2);
                                if (d != null) {
                                    a.h = new j1(d);
                                }
                                a7.j = a.a();
                            } catch (IOException unused5) {
                                Objects.toString(f2);
                                b51.d.j(new File((File) dVar8.d, str11));
                                z4 = false;
                                z3 = true;
                                i2 = 4;
                            }
                        }
                        b0 a8 = a7.a();
                        a0 a9 = a8.a();
                        a9.g = substring;
                        m2 m2Var2 = a8.k;
                        if (m2Var2 != null) {
                            i0 a10 = m2Var2.a();
                            a10.c = substring;
                            a9.j = a10.a();
                        }
                        b0 a12 = a9.a();
                        m2 m2Var3 = a12.k;
                        if (m2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        a0 a13 = a12.a();
                        i0 a14 = m2Var3.a();
                        a14.k = arrayList6;
                        a13.j = a14.a();
                        b0 a15 = a13.a();
                        m2 m2Var4 = a15.k;
                        if (m2Var4 != null) {
                            try {
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                b51.b.f(z9 ? new File((File) dVar8.f, ((j0) m2Var4).b) : new File((File) dVar8.e, ((j0) m2Var4).b), z41.c.a.o(a15));
                            } catch (IOException unused6) {
                            }
                        }
                    } catch (IOException unused7) {
                    }
                    Objects.toString(f2);
                }
                b51.d.j(new File((File) dVar8.d, str11));
                z4 = false;
                z3 = true;
                i2 = 4;
            }
            b51.d.j(new File((File) dVar8.d, str11));
            z4 = false;
            z3 = true;
            i2 = 4;
        }
        p81.a aVar4 = bVar2.c.c().a;
        ArrayList b4 = bVar2.b();
        int size3 = b4.size();
        if (size3 <= 4) {
            return;
        }
        Iterator it2 = b4.subList(4, size3).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final void c(final String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i;
        Integer num;
        final Map unmodifiableMap;
        final List unmodifiableList;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Log.isLoggable("FirebaseCrashlytics", 3);
        Locale locale = Locale.US;
        v vVar = this.f;
        a aVar = this.h;
        l1 l1Var = new l1(vVar.c, aVar.f, aVar.g, vVar.c().a, no.a.a(aVar.d != null ? 4 : 1), aVar.h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(g.g());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.r;
        String str7 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str7)) {
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else {
            f fVar2 = (f) f.s.get(str7.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        }
        int ordinal = fVar.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a = g.a(context);
        boolean f = g.f();
        int c = g.c();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        m1 m1Var = new m1(ordinal, availableProcessors, a, blockCount, f, c);
        s41.b bVar = this.j;
        k1 k1Var = new k1(l1Var, n1Var, m1Var);
        bVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        bVar.a.a(new s11.f(str, currentTimeMillis, k1Var));
        if (!bool.booleanValue() || str == null) {
            str2 = str9;
            str3 = str10;
            str4 = str8;
            i = 4;
        } else {
            final b51.d dVar = this.d;
            synchronized (((String) dVar.a)) {
                dVar.a = str;
                x41.e eVar = (x41.e) ((AtomicMarkableReference) ((t1) dVar.d).b).getReference();
                synchronized (eVar) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.a));
                }
                q1 q1Var = (q1) dVar.f;
                synchronized (q1Var) {
                    unmodifiableList = Collections.unmodifiableList(new ArrayList(q1Var.b));
                }
                final int i2 = 2;
                str4 = str8;
                str2 = str9;
                str3 = str10;
                i = 4;
                ((w41.c) dVar.c).b.a(new Runnable() { // from class: r11.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        String e;
                        BufferedWriter bufferedWriter;
                        BufferedWriter bufferedWriter2;
                        String obj;
                        switch (i2) {
                            case 0:
                                c cVar = (c) dVar;
                                j jVar = (j) str;
                                String str11 = jVar.a;
                                g gVar = (g) unmodifiableMap;
                                i iVar = (i) unmodifiableList;
                                cVar.getClass();
                                Logger logger = c.f;
                                try {
                                    n11.g a2 = cVar.c.a(str11);
                                    if (a2 == null) {
                                        String str12 = "Transport backend '" + str11 + "' is not registered";
                                        logger.warning(str12);
                                        gVar.b(new IllegalArgumentException(str12));
                                    } else {
                                        ((t11.i) cVar.e).E(new b(cVar, jVar, ((k11.c) a2).a(iVar), 0));
                                        gVar.b(null);
                                    }
                                    return;
                                } catch (Exception e2) {
                                    logger.warning("Error scheduling event " + e2.getMessage());
                                    gVar.b(e2);
                                    return;
                                }
                            case 1:
                                List list = (List) dVar;
                                d9.i iVar2 = (d9.i) str;
                                v8.c cVar2 = (v8.c) unmodifiableMap;
                                WorkDatabase workDatabase = (WorkDatabase) unmodifiableList;
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((w8.d) it.next()).c(iVar2.a);
                                }
                                f.b(cVar2, workDatabase, list);
                                return;
                            default:
                                b51.d dVar2 = (b51.d) dVar;
                                String str13 = (String) str;
                                Map map = (Map) unmodifiableMap;
                                List list2 = (List) unmodifiableList;
                                h hVar = (h) dVar2.b;
                                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) dVar2.g;
                                BufferedWriter bufferedWriter3 = null;
                                if (((String) atomicMarkableReference.getReference()) != null) {
                                    String str14 = (String) atomicMarkableReference.getReference();
                                    File f2 = hVar.a.f(str13, "user-data");
                                    try {
                                        x41.g gVar2 = new x41.g();
                                        gVar2.put("userId", str14);
                                        obj = gVar2.toString();
                                        bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2), h.b));
                                    } catch (Exception unused) {
                                        bufferedWriter2 = null;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    try {
                                        bufferedWriter2.write(obj);
                                        bufferedWriter2.flush();
                                    } catch (Exception unused2) {
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedWriter3 = bufferedWriter2;
                                        v41.g.b(bufferedWriter3);
                                        throw th;
                                    }
                                    v41.g.b(bufferedWriter2);
                                }
                                if (!map.isEmpty()) {
                                    hVar.g(str13, map, false);
                                }
                                if (list2.isEmpty()) {
                                    return;
                                }
                                File f3 = hVar.a.f(str13, "rollouts-state");
                                if (list2.isEmpty()) {
                                    if (f3.exists() && f3.delete()) {
                                        f3.getAbsolutePath();
                                        return;
                                    }
                                    return;
                                }
                                try {
                                    try {
                                        e = h.e(list2);
                                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f3), h.b));
                                    } catch (Exception unused3) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    bufferedWriter.write(e);
                                    bufferedWriter.flush();
                                    v41.g.b(bufferedWriter);
                                    return;
                                } catch (Exception unused4) {
                                    bufferedWriter3 = bufferedWriter;
                                    h.f(f3);
                                    v41.g.b(bufferedWriter3);
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedWriter3 = bufferedWriter;
                                    v41.g.b(bufferedWriter3);
                                    throw th;
                                }
                        }
                    }
                });
            }
        }
        x41.f fVar3 = this.i;
        ((x41.d) fVar3.s).a();
        fVar3.s = x41.f.t;
        if (str != null) {
            fVar3.s = new x41.m(((b51.d) fVar3.r).f(str, "userlog"));
        }
        this.l.a(str);
        b51.d dVar2 = this.m;
        q qVar = (q) dVar2.a;
        Charset charset = n2.a;
        a0 a0Var = new a0();
        a0Var.a = "19.4.4";
        a aVar2 = qVar.c;
        String str11 = aVar2.a;
        if (str11 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        a0Var.b = str11;
        v vVar2 = qVar.b;
        String str12 = vVar2.c().a;
        if (str12 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        a0Var.d = str12;
        a0Var.e = vVar2.c().b;
        a0Var.f = vVar2.c().c;
        String str13 = aVar2.f;
        if (str13 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        a0Var.h = str13;
        String str14 = aVar2.g;
        if (str14 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        a0Var.i = str14;
        a0Var.c = i;
        a0Var.m = (byte) (a0Var.m | 1);
        i0 i0Var = new i0();
        i0Var.f = false;
        byte b = (byte) (i0Var.m | 2);
        i0Var.d = currentTimeMillis;
        i0Var.m = (byte) (b | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        i0Var.b = str;
        String str15 = q.g;
        if (str15 == null) {
            throw new NullPointerException("Null generator");
        }
        i0Var.a = str15;
        String str16 = vVar2.c;
        if (str16 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str17 = vVar2.c().a;
        x1 x1Var = aVar2.h;
        if (((da1.c0) x1Var.s) == null) {
            x1Var.s = new da1.c0(x1Var);
        }
        da1.c0 c0Var = (da1.c0) x1Var.s;
        String str18 = c0Var.b;
        if (c0Var == null) {
            x1Var.s = new da1.c0(x1Var);
        }
        i0Var.g = new k0(str16, str13, str14, str17, str18, ((da1.c0) x1Var.s).c);
        h1 h1Var = new h1();
        h1Var.a = 3;
        h1Var.e = (byte) (h1Var.e | 1);
        if (str5 == null) {
            throw new NullPointerException("Null version");
        }
        h1Var.b = str5;
        if (str6 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        h1Var.c = str6;
        h1Var.d = g.g();
        h1Var.e = (byte) (h1Var.e | 2);
        i0Var.i = h1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i3 = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) q.f.get(str7.toLowerCase(locale))) != null) {
            i3 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a2 = g.a(qVar.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean f2 = g.f();
        int c2 = g.c();
        m0 m0Var = new m0();
        m0Var.a = i3;
        byte b2 = (byte) (m0Var.j | 1);
        m0Var.j = b2;
        if (str4 == null) {
            throw new NullPointerException("Null model");
        }
        m0Var.b = str4;
        m0Var.c = availableProcessors2;
        m0Var.d = a2;
        m0Var.e = blockCount2;
        m0Var.f = f2;
        m0Var.g = c2;
        m0Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str19 = str2;
        if (str19 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        m0Var.h = str19;
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException("Null modelClass");
        }
        m0Var.i = str20;
        i0Var.j = m0Var.a();
        i0Var.l = 3;
        i0Var.m = (byte) (i0Var.m | 4);
        a0Var.j = i0Var.a();
        b0 a3 = a0Var.a();
        b51.d dVar3 = ((b51.b) dVar2.b).b;
        m2 m2Var = a3.k;
        if (m2Var == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return;
        }
        String str21 = ((j0) m2Var).b;
        try {
            b51.b.g.getClass();
            b51.b.f(dVar3.f(str21, "report"), z41.c.a.o(a3));
            File f3 = dVar3.f(str21, "start-time");
            long j = ((j0) m2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(f3), b51.b.e);
            try {
                outputStreamWriter.write("");
                f3.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException unused) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public final String d() {
        NavigableSet c = ((b51.b) this.m.b).c();
        if (c.isEmpty()) {
            return null;
        }
        return (String) c.first();
    }

    public final String e() {
        Context context = this.a;
        int d = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = d == 0 ? null : context.getResources().getString(d);
        if (string != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = l.class.getClassLoader();
        InputStream resourceAsStream = classLoader == null ? null : classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return null;
        }
        try {
            Log.isLoggable("FirebaseCrashlytics", 3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f() {
        try {
            String e = e();
            if (e != null) {
                try {
                    ((t1) this.d.e).l("com.crashlytics.version-control-info", e);
                } catch (IllegalArgumentException e2) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e2;
                        }
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    public final void g(w21.o oVar) {
        w21.o oVar2;
        w21.o a;
        w21.g gVar = this.o;
        b51.d dVar = ((b51.b) this.m.b).b;
        if (b51.d.k(((File) dVar.e).listFiles()).isEmpty() && b51.d.k(((File) dVar.f).listFiles()).isEmpty() && b51.d.k(((File) dVar.g).listFiles()).isEmpty()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            gVar.c(Boolean.FALSE);
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        s sVar = this.b;
        if (sVar.a()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            gVar.c(Boolean.FALSE);
            a = t.q.k(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            gVar.c(Boolean.TRUE);
            synchronized (sVar.c) {
                oVar2 = sVar.d.a;
            }
            x3 x3Var = new x3(8);
            oVar2.getClass();
            h2 h2Var = w21.h.a;
            w21.o oVar3 = new w21.o();
            oVar2.b.j(new w21.l(h2Var, x3Var, oVar3));
            oVar2.q();
            Log.isLoggable("FirebaseCrashlytics", 3);
            a = w41.a.a(oVar3, this.p.a);
        }
        a.k(this.e.a, new v2.t(this, oVar, false, 3));
    }
}
