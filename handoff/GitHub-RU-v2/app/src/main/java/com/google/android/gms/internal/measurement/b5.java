package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b5 {
    public static final /* synthetic */ int c = 0;
    public final i6 a = new i6();
    public boolean b;

    static {
        new b5(0);
    }

    public b5() {
    }

    public static void b(y4 y4Var, r6 r6Var, int i, Object obj) {
        if (r6Var == r6.u) {
            Charset charset = n5.a;
            y4Var.d0(i, 3);
            ((g5) ((s4) obj)).d(y4Var);
            y4Var.d0(i, 4);
            return;
        }
        y4Var.d0(i, r6Var.s);
        s6 s6Var = s6.r;
        switch (r6Var.ordinal()) {
            case 0:
                y4Var.p0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                y4Var.n0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                y4Var.o0(((Long) obj).longValue());
                break;
            case 3:
                y4Var.o0(((Long) obj).longValue());
                break;
            case 4:
                y4Var.l0(((Integer) obj).intValue());
                break;
            case 5:
                y4Var.p0(((Long) obj).longValue());
                break;
            case 6:
                y4Var.n0(((Integer) obj).intValue());
                break;
            case 7:
                y4Var.k0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof x4)) {
                    y4Var.r0((String) obj);
                    break;
                } else {
                    y4Var.j0((x4) obj);
                    break;
                }
            case 9:
                ((g5) ((s4) obj)).d(y4Var);
                break;
            case 10:
                y4Var.getClass();
                g5 g5Var = (g5) ((s4) obj);
                y4Var.m0(g5Var.k());
                g5Var.d(y4Var);
                break;
            case 11:
                if (!(obj instanceof x4)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    y4Var.m0(length);
                    y4Var.q0(length, bArr);
                    break;
                } else {
                    y4Var.j0((x4) obj);
                    break;
                }
            case 12:
                y4Var.m0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof i5)) {
                    y4Var.l0(((Integer) obj).intValue());
                    break;
                } else {
                    y4Var.l0(((i5) obj).c());
                    break;
                }
            case 14:
                y4Var.n0(((Integer) obj).intValue());
                break;
            case 15:
                y4Var.p0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                y4Var.m0((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                y4Var.o0((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        i6 i6Var = this.a;
        int i = i6Var.s;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = i6Var.a(i2).s;
            if (obj instanceof g5) {
                ((g5) obj).g();
            }
        }
        Iterator it = i6Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof g5) {
                ((g5) value).g();
            }
        }
        if (!i6Var.u) {
            if (i6Var.s > 0) {
                i6Var.a(0).r.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = i6Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!i6Var.u) {
            i6Var.t = i6Var.t.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(i6Var.t);
            i6Var.w = i6Var.w.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(i6Var.w);
            i6Var.u = true;
        }
        this.b = true;
    }

    public final Object clone() {
        b5 b5Var = new b5();
        i6 i6Var = this.a;
        if (i6Var.s > 0) {
            i6Var.a(0).r.getClass();
            throw new ClassCastException();
        }
        Iterator it = i6Var.b().iterator();
        if (!it.hasNext()) {
            return b5Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b5) {
            return this.a.equals(((b5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public b5(int i) {
        a();
        a();
    }
}
