package r1;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f31091a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f31092b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f31093c;

    public k(int i, long[] jArr, Object[] objArr) {
        this.f31091a = i;
        this.f31092b = jArr;
        this.f31093c = objArr;
    }

    public final int a(long j10) {
        int i = this.f31091a - 1;
        if (i != -1) {
            long[] jArr = this.f31092b;
            int i10 = 0;
            if (i != 0) {
                while (i10 <= i) {
                    int i11 = (i10 + i) >>> 1;
                    long j11 = jArr[i11] - j10;
                    if (j11 < 0) {
                        i10 = i11 + 1;
                    } else {
                        if (j11 <= 0) {
                            return i11;
                        }
                        i = i11 - 1;
                    }
                }
                return -(i10 + 1);
            }
            long j12 = jArr[0];
            if (j12 == j10) {
                return 0;
            }
            if (j12 > j10) {
                return -2;
            }
        }
        return -1;
    }

    public final k b(long j10, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.f31093c;
        int i10 = 0;
        int i11 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr2 = new long[i12];
        Object[] objArr2 = new Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (true) {
                jArr = this.f31092b;
                i = this.f31091a;
                if (i10 >= i12 || i13 >= i) {
                    break;
                }
                long j11 = jArr[i13];
                Object obj3 = objArr[i13];
                if (j11 > j10) {
                    jArr2[i10] = j10;
                    objArr2[i10] = obj;
                    i10++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i10] = j11;
                    objArr2[i10] = obj3;
                    i10++;
                }
                i13++;
            }
            if (i13 == i) {
                jArr2[i11] = j10;
                objArr2[i11] = obj;
            } else {
                while (i10 < i12) {
                    long j12 = jArr[i13];
                    Object obj4 = objArr[i13];
                    if (obj4 != null) {
                        jArr2[i10] = j12;
                        objArr2[i10] = obj4;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr2[0] = j10;
            objArr2[0] = obj;
        }
        return new k(i12, jArr2, objArr2);
    }
}
