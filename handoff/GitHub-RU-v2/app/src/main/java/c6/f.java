package c6;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import b6.b2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import s3.h;
import sy.n;
import w61.k;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a6.c f4125a = new a6.c("android.widget.extra.CHECKED");

    public static d a(Intent intent) {
        return new d(intent, com.google.common.util.concurrent.a.F((a6.d[]) Arrays.copyOf(new a6.d[0], 0)));
    }

    public static final Uri b(b2 b2Var, int i, c cVar, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(cVar.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(b2Var.f3496b));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", h.c(b2Var.f3503j));
        builder.appendQueryParameter("extraData", str);
        if (b2Var.f3500f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(b2Var.f3504k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final Intent c(a6.a aVar, b2 b2Var, int i, bq.a aVar2) {
        if (aVar instanceof d) {
            d dVar = (d) aVar;
            Intent f6 = f(dVar, dVar.f4124b);
            if (f6.getData() == null) {
                f6.setData(b(b2Var, i, c.f4121s, String.valueOf(f6.getFlags())));
            }
            return f6;
        }
        if (!(aVar instanceof a6.e)) {
            throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + aVar).toString());
        }
        ComponentName componentName = b2Var.f3505n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent putExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", ((a6.e) aVar).f521a).putExtra("EXTRA_APPWIDGET_ID", b2Var.f3496b);
        c cVar = c.f4120r;
        Intent intent = new Intent();
        intent.setComponent((ComponentName) b2Var.f3506o.f3272s);
        intent.setData(b(b2Var, i, cVar, ""));
        intent.putExtra("ACTION_TYPE", "BROADCAST");
        intent.putExtra("ACTION_INTENT", putExtra);
        return intent;
    }

    public static a6.f d(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle2 == null) {
            throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
        }
        a6.f F = com.google.common.util.concurrent.a.F(new a6.d[0]);
        LinkedHashMap linkedHashMap = F.f523a;
        for (String str : bundle2.keySet()) {
            a6.c cVar = new a6.c(str);
            Object obj = bundle2.get(str);
            linkedHashMap.get(cVar);
            if (obj == null) {
                linkedHashMap.remove(cVar);
            } else {
                linkedHashMap.put(cVar, obj);
            }
        }
        if (bundle.containsKey("android.widget.extra.CHECKED")) {
            Boolean valueOf = Boolean.valueOf(bundle.getBoolean("android.widget.extra.CHECKED"));
            a6.c cVar2 = f4125a;
            linkedHashMap.get(cVar2);
            linkedHashMap.put(cVar2, valueOf);
        }
        return F;
    }

    public static final PendingIntent e(a6.a aVar, b2 b2Var, int i, bq.a aVar2) {
        Context context = b2Var.f3495a;
        if (aVar instanceof d) {
            d dVar = (d) aVar;
            Intent f6 = f(dVar, dVar.f4124b);
            if (f6.getData() == null) {
                f6.setData(b(b2Var, i, c.f4121s, String.valueOf(f6.getFlags())));
            }
            return PendingIntent.getActivity(context, 0, f6, 201326592, null);
        }
        if (!(aVar instanceof a6.e)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + aVar).toString());
        }
        ComponentName componentName = b2Var.f3505n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        String str = ((a6.e) aVar).f521a;
        Intent putExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", str).putExtra("EXTRA_APPWIDGET_ID", b2Var.f3496b);
        putExtra.setData(b(b2Var, i, c.f4121s, str));
        return PendingIntent.getBroadcast(context, 0, putExtra, 201326592);
    }

    public static final Intent f(d dVar, a6.f fVar) {
        if (!(dVar instanceof d)) {
            throw new IllegalStateException(("Action type not defined in app widget package: " + dVar).toString());
        }
        Intent intent = dVar.f4123a;
        Map unmodifiableMap = Collections.unmodifiableMap(fVar.f523a);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            arrayList.add(new k(((a6.c) entry.getKey()).f520a, entry.getValue()));
        }
        k[] kVarArr = (k[]) arrayList.toArray(new k[0]);
        intent.putExtras(n.d((k[]) Arrays.copyOf(kVarArr, kVarArr.length)));
        return intent;
    }

    public static final void g(Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        int ordinal = c.valueOf(stringExtra).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    activity.startService(intent2);
                } else if (ordinal == 3) {
                    activity.startForegroundService(intent2);
                } else if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            activity.sendBroadcast(intent2);
        } else {
            activity.startActivity(intent2, bundleExtra);
        }
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b2<T1,T2,T3,T4> {
        public b2() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c<T1,T2,T3,T4> {
        public c() {
        }
    }
}
