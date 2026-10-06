package v1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class k implements Iterable, l71.a {

    /* renamed from: v, reason: collision with root package name */
    public static final k f32381v = new k(0, 0, 0, null);

    /* renamed from: r, reason: collision with root package name */
    public final long f32382r;

    /* renamed from: s, reason: collision with root package name */
    public final long f32383s;

    /* renamed from: t, reason: collision with root package name */
    public final long f32384t;

    /* renamed from: u, reason: collision with root package name */
    public final long[] f32385u;

    public k(long j10, long j11, long j12, long[] jArr) {
        this.f32382r = j10;
        this.f32383s = j11;
        this.f32384t = j12;
        this.f32385u = jArr;
    }

    public final k a(k kVar) {
        k kVar2;
        long j10;
        long[] jArr;
        k kVar3 = f32381v;
        if (kVar == kVar3) {
            return this;
        }
        if (this == kVar3) {
            return kVar3;
        }
        long j11 = kVar.f32384t;
        long j12 = kVar.f32384t;
        long[] jArr2 = kVar.f32385u;
        long j13 = kVar.f32383s;
        long j14 = kVar.f32382r;
        long j15 = this.f32384t;
        if (j11 == j15 && jArr2 == (jArr = this.f32385u)) {
            return new k(this.f32382r & (~j14), this.f32383s & (~j13), j15, jArr);
        }
        if (jArr2 != null) {
            kVar2 = this;
            for (long j16 : jArr2) {
                kVar2 = kVar2.b(j16);
            }
        } else {
            kVar2 = this;
        }
        long j17 = 0;
        if (j13 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j13) != j17) {
                    j10 = j17;
                    kVar2 = kVar2.b(i + j12);
                } else {
                    j10 = j17;
                }
                i++;
                j17 = j10;
            }
        }
        long j18 = j17;
        if (j14 != j18) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j14) != j18) {
                    kVar2 = kVar2.b(i10 + j12 + 64);
                }
            }
        }
        return kVar2;
    }

    public final k b(long j10) {
        long[] jArr;
        int c10;
        long[] jArr2;
        long j11 = j10 - this.f32384t;
        long j12 = 0;
        if (k71.k.i(j11, j12) >= 0 && k71.k.i(j11, 64) < 0) {
            long j13 = 1 << ((int) j11);
            long j14 = this.f32383s;
            if ((j14 & j13) != 0) {
                return new k(this.f32382r, j14 & (~j13), this.f32384t, this.f32385u);
            }
        } else if (k71.k.i(j11, 64) >= 0 && k71.k.i(j11, 128) < 0) {
            long j15 = 1 << (((int) j11) - 64);
            long j16 = this.f32382r;
            if ((j16 & j15) != 0) {
                return new k(j16 & (~j15), this.f32383s, this.f32384t, this.f32385u);
            }
        } else if (k71.k.i(j11, j12) < 0 && (jArr = this.f32385u) != null && (c10 = r.c(jArr, j10)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (c10 > 0) {
                    x61.l.z(jArr, jArr3, 0, 0, c10);
                }
                if (c10 < i) {
                    x61.l.z(jArr, jArr3, c10, c10 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new k(this.f32382r, this.f32383s, this.f32384t, jArr2);
        }
        return this;
    }

    public final boolean d(long j10) {
        long[] jArr;
        long j11 = j10 - this.f32384t;
        long j12 = 0;
        return (k71.k.i(j11, j12) < 0 || k71.k.i(j11, (long) 64) >= 0) ? (k71.k.i(j11, (long) 64) < 0 || k71.k.i(j11, (long) 128) >= 0) ? k71.k.i(j11, j12) <= 0 && (jArr = this.f32385u) != null && r.c(jArr, j10) >= 0 : ((1 << (((int) j11) - 64)) & this.f32382r) != 0 : ((1 << ((int) j11)) & this.f32383s) != 0;
    }

    public final k e(k kVar) {
        k kVar2;
        k kVar3;
        long[] jArr;
        k kVar4 = f32381v;
        if (kVar == kVar4) {
            return this;
        }
        if (this == kVar4) {
            return kVar;
        }
        long j10 = kVar.f32384t;
        long j11 = kVar.f32384t;
        long[] jArr2 = kVar.f32385u;
        long j12 = kVar.f32383s;
        long j13 = kVar.f32382r;
        long j14 = this.f32384t;
        long j15 = this.f32383s;
        long j16 = this.f32382r;
        if (j10 == j14 && jArr2 == (jArr = this.f32385u)) {
            return new k(j16 | j13, j15 | j12, j14, jArr);
        }
        int i = 0;
        long[] jArr3 = this.f32385u;
        if (jArr3 != null) {
            if (jArr2 != null) {
                kVar2 = this;
                for (long j17 : jArr2) {
                    kVar2 = kVar2.f(j17);
                }
            } else {
                kVar2 = this;
            }
            if (j12 != 0) {
                for (int i10 = 0; i10 < 64; i10++) {
                    if (((1 << i10) & j12) != 0) {
                        kVar2 = kVar2.f(i10 + j11);
                    }
                }
            }
            if (j13 != 0) {
                while (i < 64) {
                    if (((1 << i) & j13) != 0) {
                        kVar2 = kVar2.f(i + j11 + 64);
                    }
                    i++;
                }
            }
            return kVar2;
        }
        if (jArr3 != null) {
            kVar3 = kVar;
            for (long j18 : jArr3) {
                kVar3 = kVar3.f(j18);
            }
        } else {
            kVar3 = kVar;
        }
        long j19 = this.f32384t;
        if (j15 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j15) != 0) {
                    kVar3 = kVar3.f(i11 + j19);
                }
            }
        }
        if (j16 != 0) {
            while (i < 64) {
                if (((1 << i) & j16) != 0) {
                    kVar3 = kVar3.f(i + j19 + 64);
                }
                i++;
            }
        }
        return kVar3;
    }

    public final k f(long j10) {
        long[] jArr;
        long j11;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j12 = this.f32384t;
        long j13 = j10 - j12;
        long j14 = 0;
        int i = k71.k.i(j13, j14);
        long j15 = this.f32383s;
        int i10 = 64;
        long j16 = 0;
        if (i < 0 || k71.k.i(j13, 64) >= 0) {
            long j17 = 64;
            int i11 = k71.k.i(j13, j17);
            long j18 = this.f32382r;
            if (i11 < 0 || k71.k.i(j13, 128) >= 0) {
                long j19 = 128;
                int i12 = k71.k.i(j13, j19);
                long[] jArr5 = this.f32385u;
                if (i12 < 0) {
                    if (jArr5 == null) {
                        return new k(this.f32382r, this.f32383s, this.f32384t, new long[]{j10});
                    }
                    int c10 = r.c(jArr5, j10);
                    if (c10 < 0) {
                        int i13 = -(c10 + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        x61.l.z(jArr5, jArr6, 0, 0, i13);
                        x61.l.z(jArr5, jArr6, i13 + 1, i13, length);
                        jArr6[i13] = j10;
                        return new k(this.f32382r, this.f32383s, this.f32384t, jArr6);
                    }
                } else if (!d(j10)) {
                    long j20 = 1;
                    long j21 = ((j10 + j20) / j17) * j17;
                    if (k71.k.i(j21, j14) < 0) {
                        j21 = (Long.MAX_VALUE - j19) + j20;
                    }
                    long j22 = j12;
                    long j23 = j18;
                    s21.a aVar = null;
                    while (true) {
                        if (k71.k.i(j22, j21) >= 0) {
                            jArr = jArr5;
                            j11 = j22;
                            j16 = j15;
                            break;
                        }
                        if (j15 != 0) {
                            if (aVar == null) {
                                aVar = new s21.a(jArr5);
                            }
                            int i14 = 0;
                            while (i14 < i10) {
                                if ((j15 & (1 << i14)) != 0) {
                                    jArr4 = jArr5;
                                    ((x.z) aVar.s).a(i14 + j22);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i14++;
                                jArr5 = jArr4;
                                i10 = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j23 == 0) {
                            j11 = j21;
                            jArr = jArr7;
                            break;
                        }
                        j22 += j17;
                        jArr5 = jArr7;
                        j15 = j23;
                        i10 = 64;
                        j23 = 0;
                    }
                    if (aVar != null) {
                        x.z zVar = (x.z) aVar.s;
                        int i15 = zVar.f33649b;
                        if (i15 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i15];
                            long[] jArr9 = zVar.f33648a;
                            for (int i16 = 0; i16 < i15; i16++) {
                                jArr8[i16] = jArr9[i16];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                            return new k(j23, j16, j11, jArr2).f(j10);
                        }
                    }
                    jArr2 = jArr;
                    return new k(j23, j16, j11, jArr2).f(j10);
                }
            } else {
                long j24 = 1 << (((int) j13) - 64);
                if ((j18 & j24) == 0) {
                    return new k(j18 | j24, this.f32383s, this.f32384t, this.f32385u);
                }
            }
        } else {
            long j25 = 1 << ((int) j13);
            if ((j15 & j25) == 0) {
                return new k(this.f32382r, j15 | j25, this.f32384t, this.f32385u);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return i21.a.z(new j(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(x61.n.F(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            i++;
            if (i > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
