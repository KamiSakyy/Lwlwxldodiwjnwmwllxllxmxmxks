package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 {
    public static final b2 c = new b2(100);
    public EnumMap a;
    public int b;

    public b2(int i) {
        EnumMap enumMap = new EnumMap(a2.class);
        this.a = enumMap;
        a2 a2Var = a2.AD_STORAGE;
        y1 y1Var = y1.UNINITIALIZED;
        enumMap.put((EnumMap) a2Var, (a2) y1Var);
        enumMap.put((EnumMap) a2.ANALYTICS_STORAGE, (a2) y1Var);
        this.b = i;
    }

    public static String a(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static b2 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new b2(i);
        }
        EnumMap enumMap = new EnumMap(a2.class);
        for (a2 a2Var : z1.STORAGE.r) {
            enumMap.put((EnumMap) a2Var, (a2) d(bundle.getString(a2Var.r)));
        }
        return new b2(enumMap, i);
    }

    public static b2 c(String str, int i) {
        EnumMap enumMap = new EnumMap(a2.class);
        a2[] a2VarArr = z1.STORAGE.r;
        for (int i2 = 0; i2 < a2VarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            a2 a2Var = a2VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) a2Var, (a2) e(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) a2Var, (a2) y1.UNINITIALIZED);
            }
        }
        return new b2(enumMap, i);
    }

    public static y1 d(String str) {
        y1 y1Var = y1.UNINITIALIZED;
        return str == null ? y1Var : str.equals("granted") ? y1.GRANTED : str.equals("denied") ? y1.DENIED : y1Var;
    }

    public static y1 e(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? y1.UNINITIALIZED : y1.GRANTED : y1.DENIED : y1.POLICY;
    }

    public static char h(y1 y1Var) {
        if (y1Var == null) {
            return '-';
        }
        int ordinal = y1Var.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        for (a2 a2Var : z1.STORAGE.r) {
            if (this.a.get(a2Var) != b2Var.a.get(a2Var)) {
                return false;
            }
        }
        return this.b == b2Var.b;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (a2 a2Var : z1.STORAGE.r) {
            y1 y1Var = (y1) this.a.get(a2Var);
            char c2 = '-';
            if (y1Var != null && (ordinal = y1Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c2 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (a2 a2Var : z1.STORAGE.r) {
            sb.append(h((y1) this.a.get(a2Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int i = this.b * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((y1) it.next()).hashCode();
        }
        return i;
    }

    public final boolean i(a2 a2Var) {
        return ((y1) this.a.get(a2Var)) != y1.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b2 j(b2 b2Var) {
        EnumMap enumMap = new EnumMap(a2.class);
        for (a2 a2Var : z1.STORAGE.r) {
            y1 y1Var = (y1) this.a.get(a2Var);
            y1 y1Var2 = (y1) b2Var.a.get(a2Var);
            if (y1Var != null) {
                if (y1Var2 != null) {
                    y1 y1Var3 = y1.UNINITIALIZED;
                    if (y1Var != y1Var3) {
                        if (y1Var2 != y1Var3) {
                            y1 y1Var4 = y1.POLICY;
                            if (y1Var != y1Var4) {
                                if (y1Var2 != y1Var4) {
                                    y1 y1Var5 = y1.DENIED;
                                    y1Var = (y1Var == y1Var5 || y1Var2 == y1Var5) ? y1Var5 : y1.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (y1Var == null) {
                    enumMap.put((EnumMap) a2Var, (a2) y1Var);
                }
            }
            y1Var = y1Var2;
            if (y1Var == null) {
            }
        }
        return new b2(enumMap, 100);
    }

    public final b2 k(b2 b2Var) {
        EnumMap enumMap = new EnumMap(a2.class);
        for (a2 a2Var : z1.STORAGE.r) {
            y1 y1Var = (y1) this.a.get(a2Var);
            if (y1Var == y1.UNINITIALIZED) {
                y1Var = (y1) b2Var.a.get(a2Var);
            }
            if (y1Var != null) {
                enumMap.put((EnumMap) a2Var, (a2) y1Var);
            }
        }
        return new b2(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (a2 a2Var : z1.STORAGE.r) {
            sb.append(",");
            sb.append(a2Var.r);
            sb.append("=");
            y1 y1Var = (y1) this.a.get(a2Var);
            if (y1Var == null) {
                y1Var = y1.UNINITIALIZED;
            }
            sb.append(y1Var);
        }
        return sb.toString();
    }

    public b2(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(a2.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
