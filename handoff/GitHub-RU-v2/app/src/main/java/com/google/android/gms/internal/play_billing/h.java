package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public enum h {
    s(-999),
    /* JADX INFO: Fake field, exist only in values array */
    EF18(-3),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(-2),
    /* JADX INFO: Fake field, exist only in values array */
    EF36(-1),
    /* JADX INFO: Fake field, exist only in values array */
    EF45(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF53(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF63(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF71(3),
    /* JADX INFO: Fake field, exist only in values array */
    EF80(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF92(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF101(6),
    /* JADX INFO: Fake field, exist only in values array */
    EF110(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF119(8),
    /* JADX INFO: Fake field, exist only in values array */
    EF133(11),
    /* JADX INFO: Fake field, exist only in values array */
    EF146(12);

    public static final a0 t;
    public final int r;

    static {
        androidx.compose.foundation.lazy.layout.o1 o1Var = new androidx.compose.foundation.lazy.layout.o1(2, (byte) 0);
        o1Var.c = new Object[8];
        o1Var.b = 0;
        for (h hVar : values()) {
            Integer valueOf = Integer.valueOf(hVar.r);
            int i = o1Var.b + 1;
            Object[] objArr = (Object[]) o1Var.c;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int highestOneBit = Integer.highestOneBit(i2 - 1);
                        length = highestOneBit + highestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                o1Var.c = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) o1Var.c;
            int i3 = o1Var.b;
            int i4 = i3 + i3;
            objArr2[i4] = valueOf;
            objArr2[i4 + 1] = hVar;
            o1Var.b = i3 + 1;
        }
        s sVar = (s) o1Var.d;
        if (sVar != null) {
            throw sVar.a();
        }
        a0 a = a0.a(o1Var.b, (Object[]) o1Var.c, o1Var);
        s sVar2 = (s) o1Var.d;
        if (sVar2 != null) {
            throw sVar2.a();
        }
        t = a;
    }

    h(int i) {
        this.r = i;
    }
}
