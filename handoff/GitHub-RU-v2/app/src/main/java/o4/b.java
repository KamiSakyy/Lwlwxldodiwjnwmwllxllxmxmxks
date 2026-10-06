package o4;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;
import n4.b0;
import n4.e;
import n4.f;
import n4.h;
import q4.i;
import q4.j;
import q4.l;
import w4.d;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f29991a = null;

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new b0(context).f29422b.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int b(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, f.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r5.f30957c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList c(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i iVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        j jVar = new j(resources, theme);
        synchronized (l.f30962c) {
            try {
                SparseArray sparseArray = (SparseArray) l.f30961b.get(jVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (iVar = (i) sparseArray.get(i)) != null) {
                    if (iVar.f30956b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (iVar.f30957c != 0) {
                            }
                            colorStateList2 = iVar.f30955a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = l.f30960a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            try {
                colorStateList = q4.c.a(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (l.f30962c) {
            try {
                WeakHashMap weakHashMap = l.f30961b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(jVar, sparseArray2);
                }
                sparseArray2.append(i, new i(colorStateList, jVar.f30958a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static String d(Context context, int i) {
        w4.c a10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            Object systemService = context.getSystemService("locale");
            a10 = systemService != null ? new w4.c(new d(h.a(systemService))) : w4.c.f33317b;
        } else {
            a10 = w4.c.a(e.e(context));
        }
        if (i10 <= 32 && !a10.f33318a.f33319a.isEmpty()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocales(a10.f33318a.f33319a);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i);
    }

    public static Object b;
}
