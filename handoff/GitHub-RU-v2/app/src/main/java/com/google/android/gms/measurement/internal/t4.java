package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t4 extends w1 {
    public static final String[] A = {"firebase_", "google_", "ga_"};
    public static final String[] B = {"_err"};
    public SecureRandom u;
    public final AtomicLong v;
    public int w;
    public h7.a x;
    public Boolean y;
    public Integer z;

    public t4(o1 o1Var) {
        super(o1Var);
        this.z = null;
        this.v = new AtomicLong(0L);
    }

    public static String E(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public static boolean I0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void P(s4 s4Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        t0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        s4Var.a(str, "_err", bundle);
    }

    public static MessageDigest Q() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long R(byte[] bArr) {
        c21.u.g(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i = 0;
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean S(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static int U() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static boolean W(String str) {
        String str2 = (String) c0.r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean Y(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean Z(String str, String[] strArr) {
        c21.u.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] e0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList p0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", fVar.r);
            bundle.putString("origin", fVar.s);
            bundle.putLong("creation_timestamp", fVar.u);
            bundle.putString("name", fVar.t.s);
            Object j = fVar.t.j();
            c21.u.g(j);
            c2.c(bundle, j);
            bundle.putBoolean("active", fVar.v);
            String str = fVar.w;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            w wVar = fVar.x;
            if (wVar != null) {
                bundle.putString("timed_out_event_name", wVar.r);
                v vVar = wVar.s;
                if (vVar != null) {
                    bundle.putBundle("timed_out_event_params", vVar.C());
                }
            }
            bundle.putLong("trigger_timeout", fVar.y);
            w wVar2 = fVar.z;
            if (wVar2 != null) {
                bundle.putString("triggered_event_name", wVar2.r);
                v vVar2 = wVar2.s;
                if (vVar2 != null) {
                    bundle.putBundle("triggered_event_params", vVar2.C());
                }
            }
            bundle.putLong("triggered_timestamp", fVar.t.t);
            bundle.putLong("time_to_live", fVar.A);
            w wVar3 = fVar.B;
            if (wVar3 != null) {
                bundle.putString("expired_event_name", wVar3.r);
                v vVar3 = wVar3.s;
                if (vVar3 != null) {
                    bundle.putBundle("expired_event_params", vVar3.C());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean q0(Context context) {
        ActivityInfo receiverInfo;
        c21.u.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void r0(b3 b3Var, Bundle bundle, boolean z) {
        if (bundle != null && b3Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = b3Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = b3Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", b3Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && b3Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean t0(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean y0(String str) {
        c21.u.d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    @Override // com.google.android.gms.measurement.internal.w1
    public final boolean A() {
        return true;
    }

    public final boolean A0(String str, String str2) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (str2 == null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.z.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.z.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            s0 s0Var3 = o1Var.w;
            o1.m(s0Var3);
            s0Var3.z.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                s0 s0Var4 = o1Var.w;
                o1.m(s0Var4);
                s0Var4.z.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean B0(String str, String str2) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (str2 == null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.z.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.z.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                s0 s0Var3 = o1Var.w;
                o1.m(s0Var3);
                s0Var3.z.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                s0 s0Var4 = o1Var.w;
                o1.m(s0Var4);
                s0Var4.z.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean C0(String str, String[] strArr, String[] strArr2, String str2) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (str2 == null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.z.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(A[i])) {
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                s0Var2.z.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !Z(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && Z(str2, strArr2)) {
            return true;
        }
        s0 s0Var3 = o1Var.w;
        o1.m(s0Var3);
        s0Var3.z.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean D(String str) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (TextUtils.isEmpty(str)) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.z.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        c21.u.g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        s0 s0Var2 = o1Var.w;
        o1.m(s0Var2);
        s0Var2.z.b(s0.H(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean D0(String str, int i, String str2) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (str2 == null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.z.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        s0 s0Var2 = o1Var.w;
        o1.m(s0Var2);
        s0Var2.z.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final int E0(String str) {
        if (!B0("event", str)) {
            return 2;
        }
        if (!C0("event", c2.a, c2.b, str)) {
            return 13;
        }
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
        return !D0("event", 40, str) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        int size;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        int i3 = 0;
        if (I0(obj)) {
            if (!z2) {
                return 21;
            }
            if (!Z(str2, c2.g)) {
                return 20;
            }
            p3 p = o1Var.p();
            p.z();
            p.A();
            if (p.G()) {
                t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p).s).z;
                o1.k(t4Var);
                if (t4Var.g0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.C.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i2 = 500;
                if (!Y(str) || Y(str2)) {
                    o1Var.u.getClass();
                    i2 = Math.max(500, 256);
                } else {
                    o1Var.u.getClass();
                }
                if (!J0("param", str2, i2, obj)) {
                    if (!z2) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        K0((Bundle) obj, str, str2, list, z);
                        return i;
                    }
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        int length = parcelableArr2.length;
                        while (i3 < length) {
                            Parcelable parcelable = parcelableArr2[i3];
                            if (!(parcelable instanceof Bundle)) {
                                s0 s0Var2 = o1Var.w;
                                o1.m(s0Var2);
                                s0Var2.C.c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                                return 4;
                            }
                            K0((Bundle) parcelable, str, str2, list, z);
                            i3++;
                        }
                    } else {
                        if (!(obj instanceof ArrayList)) {
                            return 4;
                        }
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size2 = arrayList2.size();
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            if (!(obj2 instanceof Bundle)) {
                                s0 s0Var3 = o1Var.w;
                                o1.m(s0Var3);
                                s0Var3.C.c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                                return 4;
                            }
                            K0((Bundle) obj2, str, str2, list, z);
                            i3++;
                        }
                    }
                }
                return i;
            }
        }
        i = 0;
        i2 = 500;
        if (Y(str)) {
        }
        o1Var.u.getClass();
        i2 = Math.max(500, 256);
        if (!J0("param", str2, i2, obj)) {
        }
        return i;
    }

    public final int F0(String str) {
        if (!B0("user property", str)) {
            return 6;
        }
        if (!C0("user property", c2.i, null, str)) {
            return 15;
        }
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
        return !D0("user property", 24, str) ? 6 : 0;
    }

    public final Object G(Object obj, String str) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        int i = 500;
        if ("_ev".equals(str)) {
            o1Var.u.getClass();
            return u0(Math.max(500, 256), obj, true, true);
        }
        if (Y(str)) {
            o1Var.u.getClass();
            i = Math.max(500, 256);
        } else {
            o1Var.u.getClass();
        }
        return u0(i, obj, false, true);
    }

    public final int G0(String str) {
        if (!A0("event param", str)) {
            return 3;
        }
        if (!C0("event param", null, null, str)) {
            return 14;
        }
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
        return !D0("event param", 40, str) ? 3 : 0;
    }

    public final Bundle H(String str, Bundle bundle, List list, boolean z) {
        int G0;
        String str2;
        List list2 = list;
        boolean Z = Z(str, c2.d);
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        h hVar = o1Var.u;
        n0 n0Var = o1Var.A;
        t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) hVar).s).z;
        o1.k(t4Var);
        int i = t4Var.f0(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                G0 = !z ? G0(str4) : 0;
                if (G0 == 0) {
                    G0 = H0(str4);
                }
            } else {
                G0 = 0;
            }
            if (G0 != 0) {
                L(bundle2, G0, str4, G0 == 3 ? str4 : str3);
                bundle2.remove(str4);
            } else {
                int F = F(str, str4, bundle.get(str4), bundle2, list2, z, Z);
                if (F == 17) {
                    L(bundle2, 17, str4, Boolean.FALSE);
                } else if (F != 0 && !"_ev".equals(str4)) {
                    L(bundle2, F, F == 21 ? str : str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (y0(str4)) {
                    i2++;
                    if (i2 > i) {
                        if (o1Var.u.J(str3, c0.e1) && z2) {
                            str2 = str3;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String sb2 = sb.toString();
                            s0 s0Var = o1Var.w;
                            o1.m(s0Var);
                            str2 = str3;
                            s0Var.z.c(sb2, n0Var.a(str), n0Var.e(bundle));
                        }
                        t0(5, bundle2);
                        bundle2.remove(str4);
                        z2 = true;
                        list2 = list;
                        str3 = str2;
                    } else {
                        list2 = list;
                    }
                }
            }
            str2 = str3;
            list2 = list;
            str3 = str2;
        }
        return bundle2;
    }

    public final int H0(String str) {
        if (!B0("event param", str)) {
            return 3;
        }
        if (!C0("event param", null, null, str)) {
            return 14;
        }
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
        return !D0("event param", 40, str) ? 3 : 0;
    }

    public final void I(t0 t0Var, int i) {
        Bundle bundle = (Bundle) t0Var.e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (y0(str) && (i2 = i2 + 1) > i) {
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
                h hVar = o1Var.u;
                n0 n0Var = o1Var.A;
                if (!hVar.J(null, c0.e1) || !z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String sb2 = sb.toString();
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.z.c(sb2, n0Var.a((String) t0Var.c), n0Var.e(bundle));
                    t0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void J(Parcelable[] parcelableArr, int i) {
        c21.u.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (y0(str) && !Z(str, c2.h) && (i2 = i2 + 1) > i) {
                    o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
                    h hVar = o1Var.u;
                    n0 n0Var = o1Var.A;
                    if (!hVar.J(null, c0.e1) || !z) {
                        s0 s0Var = o1Var.w;
                        o1.m(s0Var);
                        q0 q0Var = s0Var.z;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        q0Var.c(sb.toString(), n0Var.b(str), n0Var.e(bundle));
                    }
                    t0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final boolean J0(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.C.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
            return false;
        }
        return true;
    }

    public final void K(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).z;
                o1.k(t4Var);
                t4Var.O(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void K0(Bundle bundle, String str, String str2, List list, boolean z) {
        int G0;
        String str3;
        int F;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        h hVar = o1Var.u;
        s0 s0Var = o1Var.w;
        n0 n0Var = o1Var.A;
        t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) hVar).s).z;
        o1.k(t4Var);
        int i = true != t4Var.f0(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                G0 = !z ? G0(str4) : 0;
                if (G0 == 0) {
                    G0 = H0(str4);
                }
            } else {
                G0 = 0;
            }
            if (G0 != 0) {
                L(bundle, G0, str4, G0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (I0(bundle.get(str4))) {
                    o1.m(s0Var);
                    s0Var.C.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    F = 22;
                    str3 = null;
                } else {
                    str3 = null;
                    F = F(str, str4, bundle.get(str4), bundle, list2, z, false);
                }
                if (F != 0 && !"_ev".equals(str4)) {
                    L(bundle, F, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (y0(str4) && !Z(str4, c2.h)) {
                    int i3 = i2 + 1;
                    if (!f0(231100000)) {
                        o1.m(s0Var);
                        s0Var.z.c("Item array not supported on client's version of Google Play Services (Android Only)", n0Var.a(str), n0Var.e(bundle));
                        t0(23, bundle);
                        bundle.remove(str4);
                    } else if (i3 > i) {
                        if (!o1Var.u.J(str3, c0.e1) || !z2) {
                            o1.m(s0Var);
                            q0 q0Var = s0Var.z;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            q0Var.c(sb.toString(), n0Var.a(str), n0Var.e(bundle));
                        }
                        t0(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        i2 = i3;
                        z2 = true;
                    }
                    list2 = list;
                    i2 = i3;
                }
            }
            list2 = list;
        }
    }

    public final void L(Bundle bundle, int i, String str, Object obj) {
        if (t0(i, bundle)) {
            ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
            bundle.putString("_ev", E(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int M(Object obj, String str) {
        return "_ldl".equals(str) ? J0("user property referrer", str, v0(str), obj) : J0("user property", str, v0(str), obj) ? 0 : 7;
    }

    public final Object N(Object obj, String str) {
        return "_ldl".equals(str) ? u0(v0(str), obj, true, false) : u0(v0(str), obj, false, false);
    }

    public final void O(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.C.c("Not putting event parameter. Invalid value type. name, type", o1Var.A.b(str), simpleName);
        }
    }

    public final h7.a T() {
        i7.b bVar;
        if (this.x == null) {
            Context context = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r;
            k71.k.g(context, "context");
            int i = Build.VERSION.SDK_INT;
            f7.b bVar2 = f7.b.a;
            if (i >= 33) {
                bVar2.a();
            }
            if ((i >= 33 ? bVar2.a() : 0) >= 5) {
                bVar = new i7.b(context, 1);
            } else {
                f7.a aVar = f7.a.a;
                if (((i == 31 || i == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        bVar = new i7.b(context, 0);
                    } catch (NoClassDefFoundError unused) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 == 31 || i2 == 32) {
                            aVar.a();
                        }
                    }
                }
                bVar = null;
            }
            this.x = bVar != null ? new h7.a(bVar) : null;
        }
        return this.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long V() {
        boolean booleanValue;
        Object e;
        Integer num;
        z();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        k0 r = o1Var.r();
        s0 s0Var = o1Var.w;
        if (!W(r.F())) {
            return 0L;
        }
        long j = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : U() < ((Integer) c0.l0.a(null)).intValue() ? 16L : 0L;
        if (!X("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.y == null) {
                h7.a T = T();
                booleanValue = false;
                if (T != null) {
                    try {
                        num = (Integer) T.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    booleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                o1.m(s0Var);
                                s0Var.A.b(e, "Measurement manager api exception");
                                this.y = Boolean.FALSE;
                                o1.m(s0Var);
                                s0Var.F.b(num, "Measurement manager api status result");
                                booleanValue = this.y.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j == 0) {
                                }
                            } catch (CancellationException e3) {
                                e = e3;
                                o1.m(s0Var);
                                s0Var.A.b(e, "Measurement manager api exception");
                                this.y = Boolean.FALSE;
                                o1.m(s0Var);
                                s0Var.F.b(num, "Measurement manager api status result");
                                booleanValue = this.y.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j == 0) {
                                }
                            } catch (ExecutionException e4) {
                                e = e4;
                                o1.m(s0Var);
                                s0Var.A.b(e, "Measurement manager api exception");
                                this.y = Boolean.FALSE;
                                o1.m(s0Var);
                                s0Var.F.b(num, "Measurement manager api status result");
                                booleanValue = this.y.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j == 0) {
                                }
                            } catch (TimeoutException e5) {
                                e = e5;
                                o1.m(s0Var);
                                s0Var.A.b(e, "Measurement manager api exception");
                                this.y = Boolean.FALSE;
                                o1.m(s0Var);
                                s0Var.F.b(num, "Measurement manager api status result");
                                booleanValue = this.y.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j == 0) {
                                }
                            }
                        }
                        this.y = Boolean.valueOf(booleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        e = e6;
                        num = null;
                    }
                    o1.m(s0Var);
                    s0Var.F.b(num, "Measurement manager api status result");
                }
                if (!booleanValue) {
                    j = 64;
                }
            }
            booleanValue = this.y.booleanValue();
            if (!booleanValue) {
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final boolean X(String str) {
        z();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (i21.b.a(o1Var.r).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        s0Var.E.b(str, "Permission not granted");
        return false;
    }

    public final boolean a0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).u.D("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle b0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object G = G(bundle.get(str), str);
                if (G == null) {
                    o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.C.b(o1Var.A.b(str), "Param value can't be null");
                } else {
                    O(bundle2, str, G);
                }
            }
        }
        return bundle2;
    }

    public final w c0(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (E0(str) != 0) {
            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.b(o1Var.A.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle H = H(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            H = b0(H);
        }
        c21.u.g(H);
        return new w(str, new v(H), str2, j);
    }

    public final boolean d0(Context context, String str) {
        Signature[] signatureArr;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f = i21.b.a(context).f(str, 64);
            if (f == null || (signatureArr = f.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean f0(int i) {
        Boolean bool = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).p().w;
        if (g0() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int g0() {
        if (this.z == null) {
            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
            z11.f fVar = z11.f.b;
            Context context = o1Var.r;
            fVar.getClass();
            int i = z11.g.e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            this.z = Integer.valueOf(i2 / 1000);
        }
        return this.z.intValue();
    }

    public final void h0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void i0(String str, com.google.android.gms.internal.measurement.n0 n0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            n0Var.c(bundle);
        } catch (RemoteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(e, "Error returning string value to wrapper");
        }
    }

    public final void j0(com.google.android.gms.internal.measurement.n0 n0Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            n0Var.c(bundle);
        } catch (RemoteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(e, "Error returning long value to wrapper");
        }
    }

    public final void k0(com.google.android.gms.internal.measurement.n0 n0Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            n0Var.c(bundle);
        } catch (RemoteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(e, "Error returning int value to wrapper");
        }
    }

    public final void l0(com.google.android.gms.internal.measurement.n0 n0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            n0Var.c(bundle);
        } catch (RemoteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void m0(com.google.android.gms.internal.measurement.n0 n0Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            n0Var.c(bundle);
        } catch (RemoteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void n0(com.google.android.gms.internal.measurement.n0 n0Var, Bundle bundle) {
        try {
            n0Var.c(bundle);
        } catch (RemoteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void o0(com.google.android.gms.internal.measurement.n0 n0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            n0Var.c(bundle);
        } catch (RemoteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String s0() {
        byte[] bArr = new byte[16];
        x0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object u0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return E(i, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle b0 = b0((Bundle) parcelable);
                if (!b0.isEmpty()) {
                    arrayList.add(b0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int v0(String str) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if ("_ldl".equals(str)) {
            o1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            o1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            o1Var.getClass();
            return 100;
        }
        o1Var.getClass();
        return 36;
    }

    public final long w0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.v;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.v;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).B.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.w + 1;
            this.w = i;
            j = nextLong + i;
        }
        return j;
    }

    public final SecureRandom x0() {
        z();
        if (this.u == null) {
            this.u = new SecureRandom();
        }
        return this.u;
    }

    public final Bundle z0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            for (String str11 : uri.getQueryParameterNames()) {
                if (str11.startsWith("gad_")) {
                    String queryParameter10 = uri.getQueryParameter(str11);
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(str11, queryParameter10);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }
}
