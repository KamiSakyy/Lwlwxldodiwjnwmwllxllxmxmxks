package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e4 {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public static final String[] j = {"key", "value"};
    public ContentResolver a;
    public Uri b;
    public Runnable c;
    public volatile Map g;
    public a4 d = null;
    public volatile boolean e = true;
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();

    public e4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
    }

    public static e4 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        e4 e4Var = (e4) i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.d4
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new e4(contentResolver, uri, runnable);
            }
        });
        try {
            if (!e4Var.e) {
                return e4Var;
            }
            synchronized (e4Var) {
                try {
                    if (e4Var.e) {
                        a4 a4Var = new a4(e4Var);
                        e4Var.a.registerContentObserver(e4Var.b, false, a4Var);
                        e4Var.d = a4Var;
                        e4Var.e = false;
                    }
                } finally {
                }
            }
            return e4Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = i.values().iterator();
        while (it.hasNext()) {
            e4 e4Var = (e4) it.next();
            synchronized (e4Var) {
                try {
                    if (e4Var.e) {
                        e4Var.e = false;
                    } else {
                        a4 a4Var = e4Var.d;
                        if (a4Var != null) {
                            e4Var.a.unregisterContentObserver(a4Var);
                            e4Var.d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    public final Map b() {
        Map map;
        Map map2;
        Object c;
        Map map3 = this.g;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f) {
                StrictMode.ThreadPolicy threadPolicy = this.g;
                map2 = threadPolicy;
                if (threadPolicy == 0) {
                    try {
                        threadPolicy = StrictMode.allowThreadDiskReads();
                        try {
                            t5 t5Var = new t5(this);
                            try {
                                c = t5Var.c();
                            } catch (SecurityException unused) {
                                long clearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    c = t5Var.c();
                                } finally {
                                    Binder.restoreCallingIdentity(clearCallingIdentity);
                                }
                            }
                            map = (Map) c;
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            map = Collections.EMPTY_MAP;
                        }
                        this.g = map;
                        map2 = map;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                }
            }
            map4 = map2;
        }
        return map4 != null ? map4 : Collections.EMPTY_MAP;
    }
}
