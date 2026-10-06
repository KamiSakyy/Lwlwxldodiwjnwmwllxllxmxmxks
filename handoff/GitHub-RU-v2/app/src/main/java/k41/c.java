package k41;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class c implements p51.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // p51.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                g gVar = (g) this.c;
                Context context = (Context) this.b;
                String d = gVar.d();
                u51.a aVar = new u51.a();
                Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + d, 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.a = z;
                return aVar;
            case 1:
                return new n51.h((Context) this.b, (String) this.c);
            default:
                p41.f fVar = (p41.f) this.c;
                p41.a aVar2 = (p41.a) this.b;
                return aVar2.f.f(new androidx.lifecycle.b(aVar2, fVar));
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.a = 1;
        this.b = context;
        this.c = str;
    }
    public Object ordinal() { return null; }
    public static final Object a = null;
}
