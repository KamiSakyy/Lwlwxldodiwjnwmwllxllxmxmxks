package com.github.rudroid.utilities;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import com.github.rudroid.activities.DeepLinkActivity;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 {
    public static LinkedHashMap a(Uri uri) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        k71.k.f(queryParameterNames, "getQueryParameterNames(...)");
        Set<String> set = queryParameterNames;
        int s = x61.x.s(x61.n.F(set, 10));
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (Object obj : set) {
            linkedHashMap.put(obj, uri.getQueryParameter((String) obj));
        }
        return linkedHashMap;
    }

    public static boolean b(String str) {
        List r0 = str != null ? x61.m.r0(t71.p.g0(str, new String[]{"."}, 6)) : null;
        if (r0 == null) {
            r0 = x61.rShadow.r;
        }
        return r0.size() > 1 && k71.k.b(r0.get(0), "com") && k71.k.b(r0.get(1), "github");
    }

    public static boolean c(Uri uri) {
        k71.k.g(uri, "uri");
        try {
            return b(new URI(uri.toString()).getHost());
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(String str, oa.m mVar) {
        String str2;
        Object obj;
        k71.k.g(mVar, "userManager");
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            k71.k.f(str2, "toLowerCase(...)");
        } else {
            str2 = "";
        }
        ArrayList e = mVar.e();
        int size = e.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = e.get(i);
            i++;
            String lowerCase = com.google.common.util.concurrent.a.u((oa.j) obj).toLowerCase(Locale.ROOT);
            k71.k.f(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals(str2)) {
                break;
            }
        }
        return obj != null;
    }

    public static boolean e(Context context, Uri uri) {
        k71.k.g(context, "context");
        k71.k.g(uri, "uri");
        return f(context, uri) || g(context, uri, null);
    }

    public static boolean f(Context context, Uri uri) {
        k71.k.g(context, "context");
        k71.k.g(uri, "uri");
        PackageManager packageManager = context.getPackageManager();
        Intent data = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.parse("http://"));
        k71.k.f(data, "setData(...)");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, 65536);
        k71.k.f(queryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(data, 131072);
        k71.k.f(queryIntentActivities2, "queryIntentActivities(...)");
        queryIntentActivities.addAll(queryIntentActivities2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.packageName;
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService").setPackage(str);
            k71.k.f(intent, "setPackage(...)");
            if (packageManager.resolveService(intent, 0) != null) {
                k71.k.d(str);
                arrayList.add(str);
            }
        }
        String str2 = (String) x61.m.W(arrayList);
        if (str2 != null && !t71.p.T(str2)) {
            e1.g gVar = new e1.g();
            gVar.b = new Intent("android.intent.action.VIEW");
            gVar.c = new s21.a(8, false);
            gVar.a = true;
            int color = context.getColor(2131099700);
            ((s21.a) gVar.c).s = Integer.valueOf(color | (-16777216));
            l7.x1 d = gVar.d();
            Intent intent2 = (Intent) d.r;
            intent2.setPackage(str2);
            try {
                intent2.setData(uri);
                context.startActivity(intent2, (Bundle) d.s);
                return true;
            } catch (ActivityNotFoundException | AndroidRuntimeException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(Context context, Uri uri, String str) {
        Intent intent;
        Object obj;
        k71.k.g(context, "context");
        k71.k.g(uri, "uri");
        if (c(uri)) {
            Intent data = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.parse("http://"));
            k71.k.f(data, "setData(...)");
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(data, 131072);
            k71.k.f(queryIntentActivities, "queryIntentActivities(...)");
            if (!queryIntentActivities.isEmpty()) {
                if (str != null) {
                    Iterator<T> it = queryIntentActivities.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (k71.k.b(((ResolveInfo) obj).activityInfo.packageName, str)) {
                            break;
                        }
                    }
                    ResolveInfo resolveInfo = (ResolveInfo) obj;
                    if (resolveInfo != null) {
                        intent = new Intent("android.intent.action.VIEW", uri);
                        intent.setPackage(resolveInfo.activityInfo.packageName);
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        intent.setClassName(activityInfo.packageName, activityInfo.name);
                        ArrayList arrayList = new ArrayList();
                        for (ResolveInfo resolveInfo2 : queryIntentActivities) {
                            if (!k71.k.b(resolveInfo2.activityInfo.packageName, "com.github.rudroid")) {
                                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                                intent2.setPackage(resolveInfo2.activityInfo.packageName);
                                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                                intent2.setClassName(activityInfo2.packageName, activityInfo2.name);
                                arrayList.add(intent2);
                            }
                        }
                        if (intent == null) {
                            context.startActivity(Intent.createChooser(intent, null));
                            return true;
                        }
                        if (!arrayList.isEmpty()) {
                            Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), null);
                            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                            context.startActivity(createChooser);
                            return true;
                        }
                    }
                }
                intent = null;
                ArrayList arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                }
                if (intent == null) {
                }
            }
        } else {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", uri));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void h(Context context, boolean z) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName("com.github.rudroid", DeepLinkActivity.class.getName()), z ? 1 : 2, 1);
        context.getPackageManager().setComponentEnabledSetting(new ComponentName("com.github.rudroid", Build.VERSION.SDK_INT >= 35 ? "com.github.rudroid.DeepLinkAliasActivityApi35" : "com.github.rudroid.DeepLinkAliasActivity"), z ? 1 : 2, 1);
    }
}
