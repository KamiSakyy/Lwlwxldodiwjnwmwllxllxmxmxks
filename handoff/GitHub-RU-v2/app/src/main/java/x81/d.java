package x81;

import androidx.compose.runtime.i1;
import h91.e0;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d {
    public final e0 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public c[] d = new c[8];
    public int e = 7;

    public d(r rVar) {
        this.c = h91.b.c(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                c cVar = this.d[length];
                k71.k.d(cVar);
                int i4 = cVar.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            c[] cVarArr = this.d;
            System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final h91.k b(int i) {
        if (i >= 0) {
            c[] cVarArr = f.a;
            if (i <= cVarArr.length - 1) {
                return cVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - f.a.length);
        if (length >= 0) {
            c[] cVarArr2 = this.d;
            if (length < cVarArr2.length) {
                c cVar = cVarArr2[length];
                k71.k.d(cVar);
                return cVar.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(c cVar) {
        this.b.add(cVar);
        int i = cVar.c;
        int i2 = this.a;
        if (i > i2) {
            x61.l.J(this.d, (a81.t) null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        c[] cVarArr = this.d;
        if (i3 > cVarArr.length) {
            c[] cVarArr2 = new c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.e = this.d.length - 1;
            this.d = cVarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = cVar;
        this.f++;
        this.g += i;
    }

    public final h91.k d() {
        e0 e0Var = this.c;
        byte readByte = e0Var.readByte();
        byte[] bArr = r81.e.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e = e(i, 127);
        if (!z) {
            return e0Var.v(e);
        }
        h91.h hVar = new h91.h();
        int[] iArr = y.a;
        k71.k.g(e0Var, "source");
        i1 i1Var = y.c;
        i1 i1Var2 = i1Var;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = e0Var.readByte();
            byte[] bArr2 = r81.e.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                i1[] i1VarArr = (i1[]) i1Var2.t;
                k71.k.d(i1VarArr);
                i1Var2 = i1VarArr[(i2 >>> (i3 - 8)) & 255];
                k71.k.d(i1Var2);
                if (((i1[]) i1Var2.t) == null) {
                    hVar.J0(i1Var2.r);
                    i3 -= i1Var2.s;
                    i1Var2 = i1Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            i1[] i1VarArr2 = (i1[]) i1Var2.t;
            k71.k.d(i1VarArr2);
            i1 i1Var3 = i1VarArr2[(i2 << (8 - i3)) & 255];
            k71.k.d(i1Var3);
            int i4 = i1Var3.s;
            if (((i1[]) i1Var3.t) != null || i4 > i3) {
                break;
            }
            hVar.J0(i1Var3.r);
            i3 -= i4;
            i1Var2 = i1Var;
        }
        return hVar.v(hVar.s);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = r81.e.a;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
