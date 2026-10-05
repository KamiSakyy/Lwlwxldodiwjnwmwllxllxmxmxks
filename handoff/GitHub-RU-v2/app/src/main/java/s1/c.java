package s1;

import x.d0;
import x.h0;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements d {

    /* renamed from: s, reason: collision with root package name */
    public boolean f31685s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f31686t;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31684r = true;

    /* renamed from: u, reason: collision with root package name */
    public final h0 f31687u = new h0();

    public final void a() {
        h0 h0Var = this.f31687u;
        Object[] objArr = h0Var.f33571c;
        long[] jArr = h0Var.f33569a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i << 3) + i11];
                            if (obj instanceof d0) {
                                d0 d0Var = (d0) obj;
                                Object[] objArr2 = d0Var.f33540a;
                                int i12 = d0Var.f33541b;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    Object obj2 = objArr2[i13];
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        h0Var.a();
    }
}
