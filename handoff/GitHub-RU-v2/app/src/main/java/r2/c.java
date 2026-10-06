package r2;

import b91.g;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f31100a;

    /* renamed from: b, reason: collision with root package name */
    public b f31101b;

    /* renamed from: c, reason: collision with root package name */
    public int f31102c;

    /* renamed from: d, reason: collision with root package name */
    public a[] f31103d;

    /* renamed from: e, reason: collision with root package name */
    public int f31104e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f31105f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f31106g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f31107h;

    public c(boolean z10, b bVar) {
        int i;
        this.f31100a = z10;
        this.f31101b = bVar;
        if (z10 && bVar.equals(b.f31097r)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        this.f31102c = i;
        this.f31103d = new a[20];
        this.f31105f = new float[20];
        this.f31106g = new float[20];
        this.f31107h = new float[3];
    }

    public final void a(float f6, long j10) {
        int i = (this.f31104e + 1) % 20;
        this.f31104e = i;
        a[] aVarArr = this.f31103d;
        a aVar = aVarArr[i];
        if (aVar != null) {
            aVar.f31095a = j10;
            aVar.f31096b = f6;
        } else {
            a aVar2 = new a();
            aVar2.f31095a = j10;
            aVar2.f31096b = f6;
            aVarArr[i] = aVar2;
        }
    }

    public final float b(float f6) {
        b bVar;
        float[] fArr;
        float[] fArr2;
        float f10;
        boolean z10;
        int i;
        float f11;
        float f12 = f6;
        float f13 = 0.0f;
        if (f12 <= 0.0f) {
            t2.a.b("maximumVelocity should be a positive value. You specified=" + f12);
        }
        int i10 = this.f31104e;
        a[] aVarArr = this.f31103d;
        a aVar = aVarArr[i10];
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            int i11 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i10];
                boolean z11 = this.f31100a;
                bVar = this.f31101b;
                fArr = this.f31105f;
                fArr2 = this.f31106g;
                if (aVar3 != null) {
                    long j10 = aVar.f31095a;
                    f10 = f13;
                    int i12 = i10;
                    long j11 = aVar3.f31095a;
                    float f14 = j10 - j11;
                    z10 = z11;
                    i = 1;
                    float abs = Math.abs(j11 - aVar2.f31095a);
                    aVar2 = (bVar == b.f31097r || z10) ? aVar3 : aVar;
                    if (f14 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i11] = aVar3.f31096b;
                    fArr2[i11] = -f14;
                    i10 = (i12 == 0 ? 20 : i12) - 1;
                    i11++;
                    if (i11 >= 20) {
                        break;
                    }
                    f13 = f10;
                } else {
                    f10 = f13;
                    z10 = z11;
                    i = 1;
                    break;
                }
            }
            if (i11 >= this.f31102c) {
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.f31107h;
                        g.H(fArr2, fArr, i11, fArr3);
                        f11 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f11 = f10;
                    }
                } else {
                    if (ordinal != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i13 = i11 - i;
                    float f15 = fArr2[i13];
                    int i14 = i13;
                    float f16 = f10;
                    while (i14 > 0) {
                        int i15 = i14 - 1;
                        float f17 = fArr2[i15];
                        if (f15 != f17) {
                            float f18 = (z10 ? -fArr[i15] : fArr[i14] - fArr[i15]) / (f15 - f17);
                            f16 += Math.abs(f18) * (f18 - (Math.signum(f16) * ((float) Math.sqrt(Math.abs(f16) * 2))));
                            if (i14 == i13) {
                                f16 *= 0.5f;
                            }
                        }
                        i14--;
                        f15 = f17;
                    }
                    f11 = Math.signum(f16) * ((float) Math.sqrt(Math.abs(f16) * 2));
                }
                f13 = f11 * 1000;
            } else {
                f13 = f10;
            }
        }
        if (f13 == f10 || Float.isNaN(f13)) {
            return f10;
        }
        if (f13 <= f10) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }

    public /* synthetic */ c() {
        this(false, b.f31097r);
    }

    public c(int i) {
        this(true, b.f31098s);
    }
}
