package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s4 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = n5.a;
        iterable.getClass();
        if (iterable instanceof p5) {
            List c = ((p5) iterable).c();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = c.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof x4) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                x4.e(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof c6) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof e6) {
                e6 e6Var = (e6) list;
                int i = e6Var.t + size;
                int length = e6Var.s.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = com.github.rudroid.copilot.h1.g(length, 3, 2, 1, 10);
                        }
                        e6Var.s = Arrays.copyOf(e6Var.s, length);
                    } else {
                        e6Var.s = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    f5.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                f5.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            g5 g5Var = (g5) this;
            int k = g5Var.k();
            byte[] bArr = new byte[k];
            y4 y4Var = new y4(k, bArr);
            g5Var.d(y4Var);
            if (k - y4Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(no.a.q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public abstract int b(g6 g6Var);
}
