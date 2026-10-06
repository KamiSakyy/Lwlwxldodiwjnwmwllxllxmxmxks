package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m4 {
    public static final Object g = new Object();
    public static volatile c4 h;
    public static final AtomicInteger i;
    public final n4 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final /* synthetic */ int f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ m4(n4 n4Var, String str, Object obj, int i2) {
        this.f = i2;
        if (((Uri) n4Var.s) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = n4Var;
        this.b = str;
        this.c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    new StringBuilder(this.b.length() + 25 + obj.toString().length());
                    break;
                } else {
                    break;
                }
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!y3.b.matcher(str).matches()) {
                            if (y3.c.matcher(str).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    new StringBuilder(this.b.length() + 28 + obj.toString().length());
                    break;
                } else {
                    break;
                }
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        new StringBuilder(this.b.length() + 27 + obj.toString().length());
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (obj instanceof String) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        String str;
        Object obj;
        String k;
        x.q0 q0Var;
        int i2 = i.get();
        if (this.d < i2) {
            synchronized (this) {
                try {
                    if (this.d < i2) {
                        c4 c4Var = h;
                        j41.b bVar = j41.a.r;
                        Object obj2 = null;
                        if (c4Var != null) {
                            bVar = (j41.b) c4Var.b.get();
                            if (bVar.b()) {
                                f4 f4Var = (f4) bVar.a();
                                Uri uri = (Uri) this.a.s;
                                String str2 = this.b;
                                if (uri != null) {
                                    q0Var = (x.q0) f4Var.a.get(uri.toString());
                                } else {
                                    f4Var.getClass();
                                    q0Var = null;
                                }
                                if (q0Var != null) {
                                    str = (String) q0Var.get("".concat(str2));
                                    if (c4Var == null) {
                                        throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                                    }
                                    n4 n4Var = this.a;
                                    Uri uri2 = (Uri) n4Var.s;
                                    if (uri2 == null) {
                                        Context context = c4Var.a;
                                        throw null;
                                    }
                                    e4 a = k4.a(c4Var.a, uri2) ? e4.a(c4Var.a.getContentResolver(), uri2, o4.r) : null;
                                    if (a != null) {
                                        String str3 = (String) a.b().get(this.b);
                                        if (str3 != null) {
                                            obj = a(str3);
                                            if (obj == null) {
                                                if (!n4Var.r && (k = h4.h(c4Var.a).k(this.b)) != null) {
                                                    obj2 = a(k);
                                                }
                                                obj = obj2 == null ? this.c : obj2;
                                            }
                                            if (bVar.b()) {
                                                obj = str == null ? this.c : a(str);
                                            }
                                            this.e = obj;
                                            this.d = i2;
                                        }
                                    }
                                    obj = null;
                                    if (obj == null) {
                                    }
                                    if (bVar.b()) {
                                    }
                                    this.e = obj;
                                    this.d = i2;
                                }
                            }
                        }
                        str = null;
                        if (c4Var == null) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.e;
    }
    public Object c() { return null; }
}
