package x81;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e {
    public h91.h a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public c[] e = new c[8];
    public int f = 7;

    public e(h91.h hVar) {
        this.a = hVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                c cVar = this.e[length];
                k71.k.d(cVar);
                i -= cVar.c;
                int i4 = this.h;
                c cVar2 = this.e[length];
                k71.k.d(cVar2);
                this.h = i4 - cVar2.c;
                this.g--;
                i3++;
                length--;
            }
            c[] cVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(cVarArr, i5, cVarArr, i5 + i3, this.g);
            c[] cVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(cVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(c cVar) {
        int i = cVar.c;
        int i2 = this.d;
        if (i > i2) {
            c[] cVarArr = this.e;
            x61.l.G(0, cVarArr.length, (Object) null, cVarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        c[] cVarArr2 = this.e;
        if (i3 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f = this.e.length - 1;
            this.e = cVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = cVar;
        this.g++;
        this.h += i;
    }

    public final void c(h91.k kVar) {
        k71.k.g(kVar, "data");
        int[] iArr = y.a;
        int d = kVar.d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < d; i++) {
            byte i2 = kVar.i(i);
            byte[] bArr = r81.e.a;
            j2 += y.b[i2 & 255];
        }
        int i3 = (int) ((j2 + 7) >> 3);
        int d2 = kVar.d();
        h91.h hVar = this.a;
        if (i3 >= d2) {
            e(kVar.d(), 127, 0);
            hVar.E0(kVar);
            return;
        }
        h91.h hVar2 = new h91.h();
        int[] iArr2 = y.a;
        int d3 = kVar.d();
        int i4 = 0;
        for (int i5 = 0; i5 < d3; i5++) {
            byte i6 = kVar.i(i5);
            byte[] bArr2 = r81.e.a;
            int i7 = i6 & 255;
            int i8 = y.a[i7];
            byte b = y.b[i7];
            j = (j << b) | i8;
            i4 += b;
            while (i4 >= 8) {
                i4 -= 8;
                hVar2.J0((int) (j >> i4));
            }
        }
        if (i4 > 0) {
            hVar2.J0((int) ((j << (8 - i4)) | (255 >>> i4)));
        }
        h91.k v = hVar2.v(hVar2.s);
        e(v.d(), 127, 128);
        hVar.E0(v);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = (c) arrayList.get(i4);
            h91.k q = cVar.a.q();
            h91.k kVar = cVar.b;
            Integer num = (Integer) f.b.get(q);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    c[] cVarArr = f.a;
                    if (k71.k.b(cVarArr[intValue].b, kVar)) {
                        i = i2;
                    } else if (k71.k.b(cVarArr[i2].b, kVar)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    c cVar2 = this.e[i5];
                    k71.k.d(cVar2);
                    if (k71.k.b(cVar2.a, q)) {
                        c cVar3 = this.e[i5];
                        k71.k.d(cVar3);
                        if (k71.k.b(cVar3.b, kVar)) {
                            i2 = f.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + f.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.J0(64);
                c(q);
                c(kVar);
                b(cVar);
            } else {
                h91.k kVar2 = c.d;
                q.getClass();
                k71.k.g(kVar2, "prefix");
                if (!q.l(0, kVar2, kVar2.d()) || k71.k.b(c.i, q)) {
                    e(i, 63, 64);
                    c(kVar);
                    b(cVar);
                } else {
                    e(i, 15, 0);
                    c(kVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        h91.h hVar = this.a;
        if (i < i2) {
            hVar.J0(i | i3);
            return;
        }
        hVar.J0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            hVar.J0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        hVar.J0(i4);
    }
}
