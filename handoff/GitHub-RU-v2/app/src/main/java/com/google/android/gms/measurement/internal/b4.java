package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b4 {
    public static final com.google.common.collect.h a;

    static {
        com.google.common.collect.b bVar = com.google.common.collect.d.s;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        w8.s.i(24, objArr);
        a = com.google.common.collect.d.i(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(com.google.android.gms.internal.measurement.q4 q4Var, com.google.common.collect.m mVar, com.google.common.collect.m mVar2, com.google.common.collect.o oVar, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        a4 a4Var;
        char c;
        int c2 = c(q4Var);
        if (c2 > 0 && (i2 != 1 || i != 1)) {
            cArr[c2] = '2';
        }
        if (g(q4Var, mVar2) == com.google.android.gms.internal.measurement.r4.s) {
            c = '3';
        } else {
            if (q4Var == com.google.android.gms.internal.measurement.q4.s && i3 == 1 && oVar.u.equals(str)) {
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = '1';
                }
                return true;
            }
            if (mVar.containsKey(q4Var) && (a4Var = (a4) mVar.get(q4Var)) != null) {
                int ordinal = a4Var.ordinal();
                com.google.android.gms.internal.measurement.r4 r4Var = com.google.android.gms.internal.measurement.r4.u;
                if (ordinal != 0) {
                    com.google.android.gms.internal.measurement.r4 r4Var2 = com.google.android.gms.internal.measurement.r4.t;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return g(q4Var, mVar2) == r4Var ? f(q4Var, cArr, str3, z2) : e(q4Var, cArr, str2, z);
                        }
                        if (ordinal == 3) {
                            return g(q4Var, mVar2) == r4Var2 ? e(q4Var, cArr, str2, z) : f(q4Var, cArr, str3, z2);
                        }
                    } else if (g(q4Var, mVar2) != r4Var2) {
                        return f(q4Var, cArr, str3, z2);
                    }
                } else if (g(q4Var, mVar2) != r4Var) {
                    return e(q4Var, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (c2 <= 0 || cArr[c2] == '2') {
            return false;
        }
        cArr[c2] = c;
        return false;
    }

    public static final int c(com.google.android.gms.internal.measurement.q4 q4Var) {
        if (q4Var == com.google.android.gms.internal.measurement.q4.s) {
            return 1;
        }
        if (q4Var == com.google.android.gms.internal.measurement.q4.u) {
            return 2;
        }
        if (q4Var == com.google.android.gms.internal.measurement.q4.v) {
            return 3;
        }
        return q4Var == com.google.android.gms.internal.measurement.q4.w ? 4 : -1;
    }

    public static final String d(com.google.android.gms.internal.measurement.q4 q4Var, String str, String str2) {
        String str3 = "0";
        String valueOf = (TextUtils.isEmpty(str) || str.length() < q4Var.c()) ? "0" : String.valueOf(str.charAt(q4Var.c() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= q4Var.c()) {
            str3 = String.valueOf(str2.charAt(q4Var.c() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final boolean e(com.google.android.gms.internal.measurement.q4 q4Var, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(q4Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= q4Var.c()) {
                char charAt = str.charAt(q4Var.c() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final boolean f(com.google.android.gms.internal.measurement.q4 q4Var, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(q4Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= q4Var.c()) {
                char charAt = str.charAt(q4Var.c() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.r4 g(com.google.android.gms.internal.measurement.q4 q4Var, com.google.common.collect.m mVar) {
        Object obj = mVar.get(q4Var);
        if (obj == null) {
            obj = com.google.android.gms.internal.measurement.r4.v;
        }
        return (com.google.android.gms.internal.measurement.r4) obj;
    }
}
