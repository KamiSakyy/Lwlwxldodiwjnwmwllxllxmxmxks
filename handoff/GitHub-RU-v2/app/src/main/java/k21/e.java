package k21;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import c21.u;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public static final u31.f c;
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static final n51.e l;
    public static j m;
    public static k n;
    public Context a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final h k = new h(0);
    public static final rb0.b b = new rb0.b(7);
    public static final w50.c d = new w50.c(7);

    static {
        int i2 = 7;
        l = new n51.e(i2);
        c = new u31.f(i2);
    }

    public e(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (u.j(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            new StringBuilder(String.valueOf(declaredField.get(null)).length() + 50 + str.length() + 1);
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(str.length() + 45);
            return 0;
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    public static e c(Context context, d dVar, String str) {
        long j2;
        e eVar;
        int i2;
        Boolean bool;
        j21.a Q;
        k kVar;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new DynamiteModule$LoadingException("null application Context");
        }
        ThreadLocal threadLocal = j;
        i iVar = (i) threadLocal.get();
        i iVar2 = new i();
        threadLocal.set(iVar2);
        h hVar = k;
        Long l2 = (Long) hVar.get();
        long longValue = l2.longValue();
        try {
            j2 = longValue;
        } catch (Throwable th) {
            th = th;
            j2 = longValue;
        }
        try {
            hVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            c f2 = dVar.f(context, str, l);
            new StringBuilder(str.length() + 26 + String.valueOf(f2.a).length() + 19 + str.length() + 1 + String.valueOf(f2.b).length());
            int i3 = f2.c;
            if (i3 != 0) {
                if (i3 == -1) {
                    if (f2.a != 0) {
                        i3 = -1;
                    }
                }
                if (i3 != 1 || f2.b != 0) {
                    if (i3 == -1) {
                        "Selected local version of ".concat(str);
                        e eVar2 = new e(applicationContext);
                        if (j2 == 0) {
                            hVar.remove();
                        } else {
                            hVar.set(l2);
                        }
                        Cursor cursor = iVar2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(iVar);
                        return eVar2;
                    }
                    if (i3 != 1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 36);
                        sb.append("VersionPolicy returned invalid code:");
                        sb.append(i3);
                        throw new DynamiteModule$LoadingException(sb.toString());
                    }
                    try {
                        i2 = f2.b;
                    } catch (DynamiteModule$LoadingException e2) {
                        new StringBuilder(String.valueOf(e2.getMessage()).length() + 30);
                        int i4 = f2.a;
                        if (i4 == 0 || dVar.f(context, str, new p81.a(i4)).c != -1) {
                            throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e2);
                        }
                        "Selected local version of ".concat(str);
                        eVar = new e(applicationContext);
                    }
                    try {
                        synchronized (e.class) {
                            if (!e(context)) {
                                throw new DynamiteModule$LoadingException("Remote loading disabled");
                            }
                            bool = e;
                        }
                        if (bool == null) {
                            throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                            synchronized (e.class) {
                                kVar = n;
                            }
                            if (kVar == null) {
                                throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                            }
                            i iVar3 = (i) threadLocal.get();
                            if (iVar3 == null || iVar3.a == null) {
                                throw new DynamiteModule$LoadingException("No result cursor");
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Cursor cursor2 = iVar3.a;
                            new j21.b(null);
                            synchronized (e.class) {
                                z = h >= 2;
                            }
                            Context context2 = (Context) j21.b.N(z ? kVar.Q(new j21.b(applicationContext2), str, i2, new j21.b(cursor2)) : kVar.P(new j21.b(applicationContext2), str, i2, new j21.b(cursor2)));
                            if (context2 == null) {
                                throw new DynamiteModule$LoadingException("Failed to get module context");
                            }
                            eVar = new e(context2);
                        } else {
                            new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                            j h2 = h(context);
                            if (h2 == null) {
                                throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                            }
                            Parcel e3 = h2.e(h2.g(), 6);
                            int readInt = e3.readInt();
                            e3.recycle();
                            if (readInt >= 3) {
                                i iVar4 = (i) threadLocal.get();
                                if (iVar4 == null) {
                                    throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                }
                                Q = h2.S(new j21.b(context), str, i2, new j21.b(iVar4.a));
                            } else {
                                Q = readInt == 2 ? h2.Q(new j21.b(context), str, i2) : h2.P(new j21.b(context), str, i2);
                            }
                            Object N = j21.b.N(Q);
                            if (N == null) {
                                throw new DynamiteModule$LoadingException("Failed to load remote module.");
                            }
                            eVar = new e((Context) N);
                        }
                        if (j2 == 0) {
                            k.remove();
                        } else {
                            k.set(l2);
                        }
                        Cursor cursor3 = iVar2.a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        j.set(iVar);
                        return eVar;
                    } catch (RemoteException e4) {
                        throw new DynamiteModule$LoadingException("Failed to load remote module.", e4);
                    } catch (DynamiteModule$LoadingException e5) {
                        throw e5;
                    } catch (Throwable th2) {
                        throw new DynamiteModule$LoadingException("Failed to load remote module.", th2);
                    }
                }
            }
            int i5 = f2.a;
            int i6 = f2.b;
            StringBuilder sb2 = new StringBuilder(str.length() + 46 + String.valueOf(i5).length() + 23 + String.valueOf(i6).length() + 1);
            sb2.append("No acceptable module ");
            sb2.append(str);
            sb2.append(" found. Local version is ");
            sb2.append(i5);
            sb2.append(" and remote version is ");
            sb2.append(i6);
            sb2.append(".");
            throw new DynamiteModule$LoadingException(sb2.toString());
        } catch (Throwable th3) {
            th = th3;
            if (j2 == 0) {
                k.remove();
            } else {
                k.set(l2);
            }
            Cursor cursor4 = iVar2.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            j.set(iVar);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x016a, code lost:
    
        if (r2 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        int readInt;
        Cursor cursor;
        try {
            synchronized (e.class) {
                Boolean bool = e;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        new StringBuilder(e2.toString().length() + 30);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (DynamiteModule$LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f2 = f(context, str, z, true);
                                        String str2 = f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader P = f.P();
                                            if (P == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    a.b();
                                                    String str3 = f;
                                                    u.g(str3);
                                                    P = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = f;
                                                    u.g(str4);
                                                    P = new g(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(P);
                                            declaredField.set(null, P);
                                            e = bool2;
                                            return f2;
                                        }
                                        return f2;
                                    } catch (DynamiteModule$LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        e = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (DynamiteModule$LoadingException e3) {
                        new StringBuilder(String.valueOf(e3.getMessage()).length() + 42);
                        return 0;
                    }
                }
                j h2 = h(context);
                try {
                    if (h2 == null) {
                        return 0;
                    }
                    try {
                        Parcel e4 = h2.e(h2.g(), 6);
                        int readInt2 = e4.readInt();
                        e4.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = j;
                            i iVar = (i) threadLocal.get();
                            if (iVar != null && (cursor = iVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) j21.b.N(h2.R(new j21.b(context), str, z, ((Long) k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            i iVar2 = (i) threadLocal.get();
                                            if (iVar2 == null || iVar2.a != null) {
                                                z2 = false;
                                            } else {
                                                iVar2.a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    remoteException = e5;
                                    cursor2 = cursor3;
                                    new StringBuilder(String.valueOf(remoteException.getMessage()).length() + 42);
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            j21.b bVar = new j21.b(context);
                            Parcel g2 = h2.g();
                            o21.g.b(g2, bVar);
                            g2.writeString(str);
                            g2.writeInt(z ? 1 : 0);
                            Parcel e6 = h2.e(g2, 5);
                            readInt = e6.readInt();
                            e6.recycle();
                        } else {
                            j21.b bVar2 = new j21.b(context);
                            Parcel g3 = h2.g();
                            o21.g.b(g3, bVar2);
                            g3.writeString(str);
                            g3.writeInt(z ? 1 : 0);
                            Parcel e7 = h2.e(g3, 3);
                            readInt = e7.readInt();
                            e7.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e8) {
                        remoteException = e8;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (z11.f.b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                g = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, String str, boolean z, boolean z2) {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) k.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z5 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i2 = 0; i2 < count; i2++) {
                                if (!query.moveToPosition(i2)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i3 = 0; i3 < columnCount; i3++) {
                                    int type = query.getType(i3);
                                    if (type == 0) {
                                        objArr[i3] = null;
                                    } else if (type == 1) {
                                        objArr[i3] = Long.valueOf(query.getLong(i3));
                                    } else if (type == 2) {
                                        objArr[i3] = Double.valueOf(query.getDouble(i3));
                                    } else if (type == 3) {
                                        objArr[i3] = query.getString(i3);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i3] = query.getBlob(i3);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i4 = matrixCursor.getInt(0);
                                        if (i4 > 0) {
                                            synchronized (e.class) {
                                                try {
                                                    f = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        h = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z3 = matrixCursor.getInt(columnIndex2) != 0;
                                                        g = z3;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            i iVar = (i) j.get();
                                            if (iVar == null || iVar.a != null) {
                                                z4 = false;
                                            } else {
                                                iVar.a = matrixCursor;
                                            }
                                            z5 = z3;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z2 && z5) {
                                            throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i4;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    if (exc instanceof DynamiteModule$LoadingException) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb.append("V2 version check failed: ");
                                    sb.append(message);
                                    throw new DynamiteModule$LoadingException(sb.toString(), exc);
                                } catch (Throwable th3) {
                                    th = th3;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th;
                                    }
                                    matrixCursor2.close();
                                    throw th;
                                }
                            }
                            throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void g(ClassLoader classLoader) {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
            }
            n = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = m;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (jVar != null) {
                    m = jVar;
                    return jVar;
                }
            } catch (Exception e2) {
                new StringBuilder(String.valueOf(e2.getMessage()).length() + 45);
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
