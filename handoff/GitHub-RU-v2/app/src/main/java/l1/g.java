package l1;

import androidx.compose.ui.layout.x1;
import c71.i;
import sy.y;
import w61.a0;
import x.h0;
import x.i0;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends i implements j71.e {
    public int A;
    public /* synthetic */ Object B;
    public Object C;
    public final /* synthetic */ Object D;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f27904t;

    /* renamed from: u, reason: collision with root package name */
    public long[] f27905u;

    /* renamed from: v, reason: collision with root package name */
    public int f27906v;

    /* renamed from: w, reason: collision with root package name */
    public int f27907w;

    /* renamed from: x, reason: collision with root package name */
    public int f27908x;

    /* renamed from: y, reason: collision with root package name */
    public int f27909y;

    /* renamed from: z, reason: collision with root package name */
    public long f27910z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, a71.c cVar, int i) {
        super(2, cVar);
        this.f27904t = i;
        this.D = obj;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f27904t) {
            case k5.f.J:
                g gVar = new g((h) this.D, cVar, 0);
                gVar.B = obj;
                return gVar;
            case 1:
                g gVar2 = new g((x.g) this.D, cVar, 1);
                gVar2.B = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((x.g) this.D, cVar, 2);
                gVar3.B = obj;
                return gVar3;
            default:
                g gVar4 = new g((x1) this.D, cVar, 3);
                gVar4.B = obj;
                return gVar4;
        }
    }

    public final Object s(Object obj, Object obj2) {
        s71.i iVar = (s71.i) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f27904t) {
        }
        return r(cVar, iVar).v(a0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0087 -> B:7:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:16:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0070 -> B:8:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x011f -> B:30:0x013f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0106 -> B:38:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0108 -> B:31:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01ef -> B:52:0x01f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01a7 -> B:61:0x01fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01a9 -> B:53:0x01bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x026e -> B:76:0x022e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0257 -> B:78:0x0268). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x029a -> B:86:0x029b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        s71.i iVar;
        Object[] objArr;
        long[] jArr;
        int length;
        int i;
        long j10;
        s71.i iVar2;
        x.g gVar;
        long[] jArr2;
        int length2;
        int i10;
        long j11;
        long j12;
        s71.i iVar3;
        Object[] objArr2;
        long[] jArr3;
        int length3;
        int i11;
        long j13;
        long j14;
        long j15;
        char c10;
        long j16;
        s71.i iVar4;
        Object[] objArr3;
        long[] jArr4;
        int length4;
        int i12;
        long j17;
        int i13 = this.f27904t;
        a0 a0Var = a0.a;
        Object obj2 = this.D;
        switch (i13) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i14 = this.A;
                if (i14 == 0) {
                    y.j(obj);
                    iVar = (s71.i) this.B;
                    i0 i0Var = ((h) obj2).f27911r;
                    objArr = i0Var.f33576b;
                    jArr = i0Var.f33575a;
                    length = jArr.length - 2;
                    if (length < 0) {
                        return a0Var;
                    }
                    i = 0;
                    j10 = jArr[i];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i15 = this.f27909y;
                    int i16 = this.f27908x;
                    long j18 = this.f27910z;
                    i = this.f27907w;
                    int i17 = this.f27906v;
                    long[] jArr5 = this.f27905u;
                    Object[] objArr4 = (Object[]) this.C;
                    s71.i iVar5 = (s71.i) this.B;
                    y.j(obj);
                    j18 >>= 8;
                    i15++;
                    if (i15 < i16) {
                        if (i16 != 8) {
                            return a0Var;
                        }
                        length = i17;
                        jArr = jArr5;
                        objArr = objArr4;
                        iVar = iVar5;
                        if (i == length) {
                            i++;
                            j10 = jArr[i];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                iVar5 = iVar;
                                i15 = 0;
                                jArr5 = jArr;
                                objArr4 = objArr;
                                i16 = 8 - ((~(i - length)) >>> 31);
                                i17 = length;
                                j18 = j10;
                                if (i15 < i16) {
                                    if ((j18 & 255) < 128) {
                                        Object obj3 = objArr4[(i << 3) + i15];
                                        this.B = iVar5;
                                        this.C = objArr4;
                                        this.f27905u = jArr5;
                                        this.f27906v = i17;
                                        this.f27907w = i;
                                        this.f27910z = j18;
                                        this.f27908x = i16;
                                        this.f27909y = i15;
                                        this.A = 1;
                                        iVar5.b(this, obj3);
                                        b71.a aVar2 = b71.a.r;
                                        return aVar;
                                    }
                                    j18 >>= 8;
                                    i15++;
                                    if (i15 < i16) {
                                    }
                                }
                            } else if (i == length) {
                                return a0Var;
                            }
                        }
                    }
                }
            case 1:
                long j19 = 128;
                b71.a aVar3 = b71.a.r;
                int i18 = this.A;
                if (i18 == 0) {
                    y.j(obj);
                    iVar2 = (s71.i) this.B;
                    gVar = (x.g) obj2;
                    jArr2 = gVar.f33565s.f33569a;
                    length2 = jArr2.length - 2;
                    if (length2 < 0) {
                        return a0Var;
                    }
                    i10 = 0;
                    j11 = jArr2[i10];
                    j12 = j19;
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    }
                    if (i10 != length2) {
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i19 = this.f27909y;
                    int i20 = this.f27908x;
                    long j20 = this.f27910z;
                    int i21 = this.f27907w;
                    int i22 = this.f27906v;
                    long[] jArr6 = this.f27905u;
                    x.g gVar2 = (x.g) this.C;
                    s71.i iVar6 = (s71.i) this.B;
                    y.j(obj);
                    s71.i iVar7 = iVar6;
                    j12 = 128;
                    x.g gVar3 = gVar2;
                    long[] jArr7 = jArr6;
                    int i23 = i22;
                    int i24 = i21;
                    int i25 = 1;
                    j20 >>= 8;
                    i19 += i25;
                    if (i19 < i20) {
                        if (i20 != 8) {
                            return a0Var;
                        }
                        i10 = i24;
                        length2 = i23;
                        jArr2 = jArr7;
                        gVar = gVar3;
                        iVar2 = iVar7;
                        if (i10 != length2) {
                            i10++;
                            j19 = j12;
                            j11 = jArr2[i10];
                            j12 = j19;
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                iVar7 = iVar2;
                                i19 = 0;
                                jArr7 = jArr2;
                                gVar3 = gVar;
                                i20 = 8 - ((~(i10 - length2)) >>> 31);
                                i23 = length2;
                                i24 = i10;
                                j20 = j11;
                                if (i19 < i20) {
                                    if ((j20 & 255) < j12) {
                                        int i26 = (i24 << 3) + i19;
                                        h0 h0Var = gVar3.f33565s;
                                        o1.a aVar4 = new o1.a(1, h0Var.f33570b[i26], h0Var.f33571c[i26]);
                                        this.B = iVar7;
                                        this.C = gVar3;
                                        this.f27905u = jArr7;
                                        this.f27906v = i23;
                                        this.f27907w = i24;
                                        this.f27910z = j20;
                                        this.f27908x = i20;
                                        this.f27909y = i19;
                                        this.A = 1;
                                        iVar7.b(this, aVar4);
                                        b71.a aVar5 = b71.a.r;
                                        return aVar3;
                                    }
                                    i25 = 1;
                                    j20 >>= 8;
                                    i19 += i25;
                                    if (i19 < i20) {
                                    }
                                }
                            }
                            if (i10 != length2) {
                                return a0Var;
                            }
                        }
                    }
                }
            case 2:
                b71.a aVar6 = b71.a.r;
                int i27 = this.A;
                if (i27 == 0) {
                    y.j(obj);
                    iVar3 = (s71.i) this.B;
                    h0 h0Var2 = ((x.g) obj2).f33565s;
                    objArr2 = h0Var2.f33570b;
                    jArr3 = h0Var2.f33569a;
                    length3 = jArr3.length - 2;
                    if (length3 < 0) {
                        return a0Var;
                    }
                    i11 = 0;
                    j13 = jArr3[i11];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    }
                    if (i11 != length3) {
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i28 = this.f27909y;
                    int i29 = this.f27908x;
                    long j21 = this.f27910z;
                    i11 = this.f27907w;
                    int i30 = this.f27906v;
                    long[] jArr8 = this.f27905u;
                    Object[] objArr5 = (Object[]) this.C;
                    s71.i iVar8 = (s71.i) this.B;
                    y.j(obj);
                    j21 >>= 8;
                    i28++;
                    if (i28 < i29) {
                        if (i29 != 8) {
                            return a0Var;
                        }
                        length3 = i30;
                        jArr3 = jArr8;
                        objArr2 = objArr5;
                        iVar3 = iVar8;
                        if (i11 != length3) {
                            i11++;
                            j13 = jArr3[i11];
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                iVar8 = iVar3;
                                i28 = 0;
                                jArr8 = jArr3;
                                i30 = length3;
                                i29 = 8 - ((~(i11 - length3)) >>> 31);
                                objArr5 = objArr2;
                                j21 = j13;
                                if (i28 < i29) {
                                    if ((j21 & 255) < 128) {
                                        Object obj4 = objArr5[(i11 << 3) + i28];
                                        this.B = iVar8;
                                        this.C = objArr5;
                                        this.f27905u = jArr8;
                                        this.f27906v = i30;
                                        this.f27907w = i11;
                                        this.f27910z = j21;
                                        this.f27908x = i29;
                                        this.f27909y = i28;
                                        this.A = 1;
                                        iVar8.b(this, obj4);
                                        b71.a aVar7 = b71.a.r;
                                        return aVar6;
                                    }
                                    j21 >>= 8;
                                    i28++;
                                    if (i28 < i29) {
                                    }
                                }
                            }
                            if (i11 != length3) {
                                return a0Var;
                            }
                        }
                    }
                }
            default:
                b71.a aVar8 = b71.a.r;
                int i31 = this.A;
                if (i31 == 0) {
                    j14 = 128;
                    j15 = 255;
                    c10 = 7;
                    j16 = -9187201950435737472L;
                    y.j(obj);
                    iVar4 = (s71.i) this.B;
                    h0 h0Var3 = (h0) ((x1) obj2).f2086s;
                    objArr3 = h0Var3.f33571c;
                    jArr4 = h0Var3.f33569a;
                    length4 = jArr4.length - 2;
                    if (length4 < 0) {
                        return a0Var;
                    }
                    i12 = 0;
                    j17 = jArr4[i12];
                    if ((((~j17) << c10) & j17 & j16) != j16) {
                    }
                    if (i12 != length4) {
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i32 = this.f27909y;
                    int i33 = this.f27908x;
                    j14 = 128;
                    long j22 = this.f27910z;
                    j15 = 255;
                    int i34 = this.f27907w;
                    length4 = this.f27906v;
                    c10 = 7;
                    long[] jArr9 = this.f27905u;
                    Object[] objArr6 = (Object[]) this.C;
                    j16 = -9187201950435737472L;
                    s71.i iVar9 = (s71.i) this.B;
                    y.j(obj);
                    j22 >>= 8;
                    i32++;
                    if (i32 < i33) {
                        if (i33 != 8) {
                            return a0Var;
                        }
                        jArr4 = jArr9;
                        iVar4 = iVar9;
                        i12 = i34;
                        objArr3 = objArr6;
                        if (i12 != length4) {
                            i12++;
                            j17 = jArr4[i12];
                            if ((((~j17) << c10) & j17 & j16) != j16) {
                                int i35 = 8 - ((~(i12 - length4)) >>> 31);
                                iVar9 = iVar4;
                                int i36 = i12;
                                jArr9 = jArr4;
                                j22 = j17;
                                i33 = i35;
                                i32 = 0;
                                objArr6 = objArr3;
                                i34 = i36;
                                if (i32 < i33) {
                                    if ((j22 & j15) < j14) {
                                        Object obj5 = objArr6[(i34 << 3) + i32];
                                        this.B = iVar9;
                                        this.C = objArr6;
                                        this.f27905u = jArr9;
                                        this.f27906v = length4;
                                        this.f27907w = i34;
                                        this.f27910z = j22;
                                        this.f27908x = i33;
                                        this.f27909y = i32;
                                        this.A = 1;
                                        iVar9.b(this, obj5);
                                        b71.a aVar9 = b71.a.r;
                                        return aVar8;
                                    }
                                    j22 >>= 8;
                                    i32++;
                                    if (i32 < i33) {
                                    }
                                }
                            }
                            if (i12 != length4) {
                                return a0Var;
                            }
                        }
                    }
                }
        }
    }
}
