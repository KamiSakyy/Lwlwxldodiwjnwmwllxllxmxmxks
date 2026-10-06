package da1;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c0 {
    public final /* synthetic */ int a = 0;
    public String b;
    public String c;

    public c0(a aVar, String str) {
        aVar.getClass();
        this.b = aVar.M0();
        this.c = str;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "<" + this.b + ">: " + this.c;
            default:
                return super.toString();
        }
    }

    public c0(a aVar, String str, Object[] objArr) {
        aVar.getClass();
        this.b = aVar.M0();
        this.c = String.format(str, objArr);
    }

    public c0(l7.x1 x1Var) {
        Context context = (Context) x1Var.r;
        int d = v41.gShadow.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (d != 0) {
            this.b = "Unity";
            this.c = context.getResources().getString(d);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.b = "Flutter";
                this.c = null;
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }
}
