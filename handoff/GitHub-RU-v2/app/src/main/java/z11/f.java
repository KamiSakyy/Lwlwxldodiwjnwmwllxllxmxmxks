package z11;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c21.u;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public class f {
    public static final int a;
    public static final f b;

    static {
        int i = g.e;
        a = 12451000;
        b = new f();
    }

    public Intent a(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && g21.b.a(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(i21.b.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|3)|4|(4:8|25|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(1:43)|44|(13:46|(1:48)(1:121)|49|(4:113|114|(1:116)(1:119)|117)(1:51)|52|53|(1:55)(1:111)|56|57|(1:59)(2:(2:82|(1:84))|(4:90|(1:92)(1:109)|(1:94)|(1:96)(4:97|(2:103|104)|99|(1:101)(1:102)))(1:89))|60|(2:(5:63|64|65|66|(2:67|(2:69|(1:71)(1:72))(2:73|74)))|77)(0)|(1:79)(1:80)))|122|(0)(0)|49|(0)(0)|52|53|(0)(0)|56|57|(0)(0)|60|(0)(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b3, code lost:
    
        java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing.");
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i) {
        boolean z;
        int i2;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        int i3 = g.e;
        try {
            context.getResources().getString(2131951952);
        } catch (Throwable unused) {
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !g.d.get()) {
            synchronized (u.a) {
                try {
                    if (!u.b) {
                        u.b = true;
                        try {
                            bundle = i21.b.a(context).d(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            u.c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i4 = u.c;
            if (i4 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i4 != 12451000) {
                int i5 = a;
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 104 + String.valueOf(i4).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i5);
                sb.append(" but found ");
                sb.append(i4);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (!g21.b.a(context)) {
            if (g21.b.e == null) {
                g21.b.e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!g21.b.e.booleanValue()) {
                z = true;
                u.b(i < 0);
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                i2 = 9;
                if (z) {
                    packageInfo = null;
                } else {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
                    }
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
                h.a(context);
                if (h.c(packageInfo2, true)) {
                    String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
                } else {
                    if (z) {
                        u.g(packageInfo);
                        if (!h.c(packageInfo, true)) {
                            String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                        }
                    }
                    if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        int i6 = packageInfo2.versionCode;
                        if ((i6 == -1 ? -1 : i6 / 1000) < (i != -1 ? i / 1000 : -1)) {
                            new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i6).length());
                            i2 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                    i2 = 1;
                                    if (i2 != 18) {
                                    }
                                    if (z2) {
                                    }
                                }
                            }
                            i2 = !applicationInfo.enabled ? 3 : 0;
                        }
                    } else {
                        String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                    }
                }
                if (i2 != 18) {
                    if (i2 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused3) {
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    return 18;
                }
                return i2;
            }
        }
        z = false;
        u.b(i < 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        i2 = 9;
        if (z) {
        }
        packageInfo2 = packageManager2.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
        h.a(context);
        if (h.c(packageInfo2, true)) {
        }
        if (i2 != 18) {
        }
        if (z2) {
        }
    }
}
