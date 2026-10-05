package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 extends t1 {
    private static final b1 zzb;
    private x1 zzd = m2.v;

    static {
        b1 b1Var = new b1();
        zzb = b1Var;
        t1.f(b1.class, b1Var);
    }

    public static a1 p() {
        return (a1) zzb.k();
    }

    public static void q(b1 b1Var, ArrayList arrayList) {
        x1 x1Var = b1Var.zzd;
        if (!((h1) x1Var).r) {
            int size = x1Var.size();
            b1Var.zzd = x1Var.h(size + size);
        }
        List list = b1Var.zzd;
        Charset charset = z1.a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof m2) {
            m2 m2Var = (m2) list;
            int i = m2Var.t + size2;
            int length = m2Var.s.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = com.github.rudroid.copilot.h1.g(length, 3, 2, 1, 10);
                    }
                    m2Var.s = Arrays.copyOf(m2Var.s, length);
                } else {
                    m2Var.s = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String i3 = a0.s0.i("Element at index ", list.size() - size3, " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(i3);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", z0.class});
        }
        if (i2 == 3) {
            return new b1();
        }
        if (i2 == 4) {
            return new a1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
