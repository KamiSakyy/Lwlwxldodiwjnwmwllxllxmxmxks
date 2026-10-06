package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t5 implements j41.d, x5 {
    public static final e5 s = new e5(3);
    public Object r;

    public /* synthetic */ t5(Object obj) {
        this.r = obj;
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((x5[]) this.r)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public f6 b(Class cls) {
        for (int i = 0; i < 2; i++) {
            x5 x5Var = ((x5[]) this.r)[i];
            if (x5Var.a(cls)) {
                return x5Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public Object c() {
        e4 e4Var = (e4) this.r;
        ContentResolver contentResolver = e4Var.a;
        Uri uri = e4Var.b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                return Collections.EMPTY_MAP;
            }
            Cursor query = acquireUnstableContentProviderClient.query(uri, e4.j, null, null, null);
            try {
                if (query == null) {
                    return Collections.EMPTY_MAP;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                x.e eVar = count <= 256 ? new x.e(count) : new HashMap(count, 1.0f);
                while (query.moveToNext()) {
                    eVar.put(query.getString(0), query.getString(1));
                }
                if (query.isAfterLast()) {
                    query.close();
                    return eVar;
                }
                Map map2 = Collections.EMPTY_MAP;
                query.close();
                return map2;
            } finally {
            }
        } catch (RemoteException unused) {
            return Collections.EMPTY_MAP;
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public void d(int i, Object obj, g6 g6Var) {
        s4 s4Var = (s4) obj;
        y4 y4Var = (y4) this.r;
        y4Var.m0((i << 3) | 2);
        y4Var.m0(s4Var.b(g6Var));
        g6Var.g(s4Var, y4Var.a);
    }

    public void e(int i, Object obj, g6 g6Var) {
        y4 y4Var = (y4) this.r;
        y4Var.d0(i, 3);
        g6Var.g((s4) obj, y4Var.a);
        y4Var.d0(i, 4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)|23|24|25|26|27|28|29|(1:31)(1:78)|32|(9:34|35|36|37|38|(2:39|(3:41|(3:56|57|58)(7:43|44|(2:46|(1:49))|50|(1:52)|53|54)|55)(1:59))|60|61|62)(1:77)|63|14) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0072, code lost:
    
        r5 = j41.a.r;
     */
    @Override // j41.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object get() {
        j41.b bVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        j41.b bVar2;
        Object obj = m4.g;
        Context context = (Context) this.r;
        j41.b bVar3 = i4.a;
        if (bVar3 != null) {
            return bVar3;
        }
        synchronized (i4.class) {
            try {
                bVar = i4.a;
                if (bVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    x.e eVar = l4.a;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        bVar = j41.a.r;
                        i4.a = bVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        bVar = j41.a.r;
                        i4.a = bVar;
                    }
                    if (!context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    j41.b bVar4 = file.exists() ? new j41.c(file) : j41.a.r;
                    if (bVar4.b()) {
                        File file2 = (File) bVar4.a();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                x.q0 q0Var = new x.q0(0);
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        new StringBuilder(readLine.length() + 9);
                                    } else {
                                        String str3 = new String(split[0]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        x.q0 q0Var2 = (x.q0) q0Var.get(str3);
                                        if (q0Var2 == null) {
                                            q0Var2 = new x.q0(0);
                                            q0Var.put(str3, q0Var2);
                                        }
                                        q0Var2.put(decode, str4);
                                    }
                                }
                                new StringBuilder(file2.toString().length() + 28 + String.valueOf(context.getPackageName()).length());
                                f4 f4Var = new f4(q0Var);
                                bufferedReader.close();
                                bVar2 = new j41.c(f4Var);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        bVar2 = j41.a.r;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    bVar = bVar2;
                    i4.a = bVar;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            } finally {
            }
        }
        return bVar;
    }

    public t5(int i) {
        switch (i) {
            case 1:
                this.r = new HashMap();
                break;
            default:
                d6 d6Var = d6.c;
                t5 t5Var = new t5(new x5[]{e5.s, s});
                Charset charset = n5.a;
                this.r = t5Var;
                break;
        }
    }

    public t5(y4 y4Var) {
        Charset charset = n5.a;
        this.r = y4Var;
        y4Var.a = this;
    }
}
