package x;

import java.util.ConcurrentModificationException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f33619a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f33620b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f33621c = new Object();

    public static final void a(r0 r0Var) {
        int i = r0Var.f33618u;
        int[] iArr = r0Var.f33616s;
        Object[] objArr = r0Var.f33617t;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            Object obj = objArr[i11];
            if (obj != f33621c) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        r0Var.f33615r = false;
        r0Var.f33618u = i10;
    }

    public static final void b(f fVar, int i) {
        fVar.f33554r = new int[i];
        fVar.f33555s = new Object[i];
    }

    public static final int c(f fVar, Object obj, int i) {
        int i10 = fVar.f33556t;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a10 = y.a.a(i10, i, fVar.f33554r);
            if (a10 < 0 || k71.k.b(obj, fVar.f33555s[a10])) {
                return a10;
            }
            int i11 = a10 + 1;
            while (i11 < i10 && fVar.f33554r[i11] == i) {
                if (k71.k.b(obj, fVar.f33555s[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && fVar.f33554r[i12] == i; i12--) {
                if (k71.k.b(obj, fVar.f33555s[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
