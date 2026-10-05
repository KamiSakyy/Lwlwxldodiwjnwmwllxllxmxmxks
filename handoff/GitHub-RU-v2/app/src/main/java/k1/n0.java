package k1;

import androidx.compose.runtime.v2;
import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public final class n0 extends t1 {

    /* renamed from: d, reason: collision with root package name */
    public int f27621d;

    /* renamed from: f, reason: collision with root package name */
    public int f27623f;

    /* renamed from: h, reason: collision with root package name */
    public int f27625h;

    /* renamed from: c, reason: collision with root package name */
    public k0[] f27620c = new k0[16];

    /* renamed from: e, reason: collision with root package name */
    public int[] f27622e = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public Object[] f27624g = new Object[16];

    public final void Y() {
        this.f27621d = 0;
        this.f27623f = 0;
        x61.l.G(0, this.f27625h, (Object) null, this.f27624g);
        this.f27625h = 0;
    }

    public final void Z(androidx.compose.runtime.d dVar, v2 v2Var, r1.j jVar, l0 l0Var) {
        if (b0()) {
            m0 m0Var = new m0(this);
            n0 n0Var = (n0) m0Var.f27618e;
            while (true) {
                k0 k0Var = n0Var.f27620c[m0Var.f27615b];
                androidx.compose.runtime.b b10 = k0Var.b(m0Var);
                androidx.compose.runtime.d dVar2 = dVar;
                v2 v2Var2 = v2Var;
                r1.j jVar2 = jVar;
                l0 l0Var2 = l0Var;
                try {
                    k0Var.a(m0Var, dVar2, v2Var2, jVar2, l0Var2);
                    int i = m0Var.f27615b;
                    int i10 = n0Var.f27621d;
                    if (i < i10) {
                        k0 k0Var2 = n0Var.f27620c[i];
                        m0Var.f27616c += k0Var2.f27610a;
                        m0Var.f27617d += k0Var2.f27611b;
                        int i11 = i + 1;
                        m0Var.f27615b = i11;
                        if (i11 >= i10) {
                            break;
                        }
                        dVar = dVar2;
                        v2Var = v2Var2;
                        jVar = jVar2;
                        l0Var = l0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        Y();
    }

    public final boolean a0() {
        return this.f27621d == 0;
    }

    public final boolean b0() {
        return this.f27621d != 0;
    }

    public final void c0(k0 k0Var) {
        int i = this.f27621d;
        k0[] k0VarArr = this.f27620c;
        if (i == k0VarArr.length) {
            k0[] k0VarArr2 = new k0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(k0VarArr, 0, k0VarArr2, 0, i);
            this.f27620c = k0VarArr2;
        }
        int i10 = this.f27623f;
        int i11 = k0Var.f27610a;
        int i12 = k0Var.f27611b;
        int i13 = i10 + i11;
        int[] iArr = this.f27622e;
        int length = iArr.length;
        if (i13 > length) {
            int i14 = (length > 1024 ? 1024 : length) + length;
            if (i14 >= i13) {
                i13 = i14;
            }
            int[] iArr2 = new int[i13];
            x61.l.w(0, 0, length, iArr, iArr2);
            this.f27622e = iArr2;
        }
        int i15 = this.f27625h + i12;
        Object[] objArr = this.f27624g;
        int length2 = objArr.length;
        if (i15 > length2) {
            int i16 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i16 >= i15) {
                i15 = i16;
            }
            Object[] objArr2 = new Object[i15];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f27624g = objArr2;
        }
        k0[] k0VarArr3 = this.f27620c;
        int i17 = this.f27621d;
        this.f27621d = i17 + 1;
        k0VarArr3[i17] = k0Var;
        this.f27623f += k0Var.f27610a;
        this.f27625h += i12;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class k0<T1,T2,T3,T4> {
        public k0() {
        }
    }
}
