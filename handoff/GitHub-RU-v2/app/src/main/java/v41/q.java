package v41;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import y41.a1;
import y41.b1;
import y41.s0;
import y41.t0;
import y41.u0;
import y41.w0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qShadow {
    public static final HashMap f;
    public static final String g;
    public Context a;
    public v b;
    public a c;
    public e51.a d;
    public d51.d e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/19.4.4";
    }

    public Object q(Context context, v vVar, a aVar, e51.a aVar2, d51.d dVar) {
        this.a = context;
        this.b = vVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = dVar;
    }

    public static t0 c(w51.r rVar, int i) {

        Object i2 = null;
        String str = (String) rVar.t;
        String str2 = (String) rVar.s;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) rVar.u;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        w51.r rVar2 = (w51.r) rVar.v;
        if (i >= 8) {
            w51.r rVar3 = rVar2;
            while (rVar3 != null) {
                rVar3 = (w51.r) rVar3.v;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        byte b = (byte) (0 | 1);
        t0 t0Var = null;
        if (rVar2 != null && i3 == 0) {
            t0Var = c(rVar2, i + 1);
        }
        if (b == 1) {
            return new t0(str, str2, d, t0Var, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            w0 w0Var = new w0();
            w0Var.e = i;
            w0Var.f = (byte) (w0Var.f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            w0Var.a = max;
            byte b = (byte) (w0Var.f | 1);
            w0Var.f = b;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            w0Var.b = str;
            w0Var.c = fileName;
            w0Var.d = j;
            w0Var.f = (byte) (b | 2);
            arrayList.add(w0Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b = (byte) 1;
        if (b == 1) {
            return new u0(0L, "0", "0");
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.c;
        String str = aVar.e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = aVar.b;
        if (b == 3) {
            return Collections.singletonList(new s0(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
   
        Object i2 = null;
        Object valueOf = null; public final b1 b(int i) {
        boolean z;
        Float f2;
        long j;
        Intent registerReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.a;
        boolean z2 = false;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException unused) {
        }
        if (registerReceiver != null) {
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            z = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = registerReceiver.getIntExtra("level", -1);
                intExtra2 = registerReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException unused2) {
            }
            if (intExtra != -1 && intExtra2 != -1) {
                f2 = Float.valueOf(intExtra / intExtra2);
                Double valueOf = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
                int i2 = (z || f2 == null) ? 1 : ((double) f2.floatValue()) < 0.99d ? 2 : 3;
                if (!g.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long a = g.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = a - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                a1 a1Var = new a1();
                a1Var.a = valueOf;
                a1Var.b = i2;
                byte b = (byte) (a1Var.g | 1);
                a1Var.c = z2;
                a1Var.d = i;
                a1Var.e = j;
                a1Var.f = (r7.getBlockCount() * blockSize) - (blockSize * r7.getAvailableBlocks());
                a1Var.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return a1Var.a();
            }
            f2 = null;
            if (f2 != null) {
            }
            if (z) {
            }
            if (!g.f()) {
                z2 = true;
            }
            long a2 = g.a(context);
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
            j = a2 - memoryInfo2.availMem;
            if (j <= 0) {
            }
            long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
            a1 a1Var2 = new a1();
            a1Var2.a = valueOf;
            a1Var2.b = i2;
            byte b2 = (byte) (a1Var2.g | 1);
            a1Var2.c = z2;
            a1Var2.d = i;
            a1Var2.e = j;
            a1Var2.f = (r7.getBlockCount() * blockSize2) - (blockSize2 * r7.getAvailableBlocks());
            a1Var2.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
            return a1Var2.a();
        }
        z = false;
        f2 = null;
        if (f2 != null) {
        }
        if (z) {
        }
        if (!g.f()) {
        }
        long a22 = g.a(context);
        ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo22);
        j = a22 - memoryInfo22.availMem;
        if (j <= 0) {
        }
        long blockSize22 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        a1 a1Var22 = new a1();
        a1Var22.a = valueOf;
        a1Var22.b = i2;
        byte b22 = (byte) (a1Var22.g | 1);
        a1Var22.c = z2;
        a1Var22.d = i;
        a1Var22.e = j;
        a1Var22.f = (r7.getBlockCount() * blockSize22) - (blockSize22 * r7.getAvailableBlocks());
        a1Var22.g = (byte) (((byte) (((byte) (((byte) (b22 | 2)) | 4)) | 8)) | 16);
        return a1Var22.a();
    }
}
