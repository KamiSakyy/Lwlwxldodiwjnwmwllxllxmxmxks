package a81;

import a0.s0;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c30.o0;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;
import jo.f4;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t implements u5.l {
    public final /* synthetic */ int r;
    public String s;

    public static void a(a5.s sVar, d51.f fVar) {
        String str = (String) fVar.b;
        if (str != null) {
            sVar.v("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        sVar.v("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        sVar.v("X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        sVar.v("Accept", "application/json");
        String str2 = (String) fVar.c;
        if (str2 != null) {
            sVar.v("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) fVar.d;
        if (str3 != null) {
            sVar.v("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) fVar.e;
        if (str4 != null) {
            sVar.v("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((v41.v) fVar.i).c().a;
        if (str5 != null) {
            sVar.v("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(d51.f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", (String) fVar.h);
        hashMap.put("display_version", (String) fVar.g);
        hashMap.put("source", Integer.toString(fVar.a));
        String str = (String) fVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static String h(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return f1.e.h(str, " : ", str2);
    }

    public static String i(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return f1.e.h(str, " : ", str2);
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            i(this.s, str, objArr);
        }
    }

    public void d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            i(this.s, str, objArr);
        }
    }

    public boolean e(CharSequence charSequence, int i, int i2, u5.t tVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.s)) {
            return true;
        }
        tVar.c = (tVar.c & 3) | 4;
        return false;
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            h(this.s, str, objArr);
        }
    }

    public void g(String str, Object... objArr) {
        switch (this.r) {
            case 3:
                if (Log.isLoggable("PlayCore", 4)) {
                    i(this.s, str, objArr);
                    break;
                }
                break;
            default:
                if (Log.isLoggable("PlayCore", 5)) {
                    h(this.s, str, objArr);
                    break;
                }
                break;
        }
    }

    public Object getResult() {
        return this;
    }

    public String toString() {
        switch (this.r) {
            case 0:
                return s0.m(new StringBuilder("<"), this.s, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(int i, String str, boolean z) {
        this.r = i;
        this.s = str;
    }

    public t(String str, int i) {
        this.r = i;
        switch (i) {
            case 3:
                this.s = f4.h(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                break;
            case 4:
            case 6:
            default:
                k71.k.g(str, "serverUrl");
                this.s = str;
                break;
            case 5:
                this.s = f4.h(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                break;
            case 7:
                k71.k.g(str, "userAgent");
                this.s = str;
                break;
        }
    }

    public t(String str, o0 o0Var) {
        this.r = 4;
        if (str != null) {
            this.s = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
