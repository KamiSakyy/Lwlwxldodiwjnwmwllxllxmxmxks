package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q {
    public static final q f = new q((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public q(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(a2.class);
        this.e = enumMap;
        enumMap.put((EnumMap) a2.AD_USER_DATA, (a2) (bool == null ? y1.UNINITIALIZED : bool.booleanValue() ? y1.GRANTED : y1.DENIED));
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static q b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(a2.class);
        a2[] a2VarArr = z1.DMA.r;
        int length = a2VarArr.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) a2VarArr[i2], (a2) b2.e(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new q(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static q c(int i, Bundle bundle) {
        if (bundle == null) {
            return new q((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(a2.class);
        for (a2 a2Var : z1.DMA.r) {
            enumMap.put((EnumMap) a2Var, (a2) b2.d(bundle.getString(a2Var.r)));
        }
        return new q(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final y1 a() {
        y1 y1Var = (y1) this.e.get(a2.AD_USER_DATA);
        return y1Var == null ? y1.UNINITIALIZED : y1Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (a2 a2Var : z1.DMA.r) {
            sb.append(":");
            sb.append(b2.h((y1) this.e.get(a2Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.b.equalsIgnoreCase(qVar.b) && Objects.equals(this.c, qVar.c)) {
            return Objects.equals(this.d, qVar.d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(b2.a(this.a));
        for (a2 a2Var : z1.DMA.r) {
            sb.append(",");
            sb.append(a2Var.r);
            sb.append("=");
            y1 y1Var = (y1) this.e.get(a2Var);
            if (y1Var == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = y1Var.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public q(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(a2.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
