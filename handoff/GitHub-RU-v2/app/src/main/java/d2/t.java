package d2;

/* loaded from: /home/user/work/p/classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final long f21381b = a0.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f21382c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f21383d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f21384e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f21385f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f21386g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f21387h;
    public static final long i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f21388j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f21389k;
    public static final /* synthetic */ int l = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f21390a;

    static {
        a0.d(4282664004L);
        f21382c = a0.d(4287137928L);
        a0.d(4291611852L);
        f21383d = a0.d(4294967295L);
        f21384e = a0.d(4294901760L);
        f21385f = a0.d(4278255360L);
        f21386g = a0.d(4278190335L);
        f21387h = a0.d(4294967040L);
        i = a0.d(4278255615L);
        a0.d(4294902015L);
        f21388j = a0.c(0);
        f21389k = a0.b(0.0f, 0.0f, 0.0f, 0.0f, e2.d.f21869u);
    }

    public /* synthetic */ t(long j10) {
        this.f21390a = j10;
    }

    public static final long a(long j10, e2.c cVar) {
        e2.g gVar;
        e2.c f6 = f(j10);
        int i10 = f6.f21851c;
        int i11 = cVar.f21851c;
        if ((i10 | i11) < 0) {
            gVar = e2.j.e(f6, cVar);
        } else {
            x.w wVar = e2.h.f21881a;
            int i12 = i10 | (i11 << 6);
            Object b10 = wVar.b(i12);
            if (b10 == null) {
                b10 = e2.j.e(f6, cVar);
                wVar.i(i12, b10);
            }
            gVar = (e2.g) b10;
        }
        return gVar.a(j10);
    }

    public static long b(float f6, long j10) {
        return a0.b(h(j10), g(j10), e(j10), f6, f(j10));
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        float p3;
        float f6;
        if ((63 & j10) == 0) {
            p3 = (float) sy.c0.p((j10 >>> 56) & 255);
            f6 = 255.0f;
        } else {
            p3 = (float) sy.c0.p((j10 >>> 6) & 1023);
            f6 = 1023.0f;
        }
        return p3 / f6;
    }

    public static final float e(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) sy.c0.p((j10 >>> 32) & 255)) / 255.0f;
        }
        short s2 = (short) ((j10 >>> 16) & 65535);
        int i13 = 32768 & s2;
        int i14 = ((65535 & s2) >>> 10) & 31;
        int i15 = s2 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f21397a;
                return i13 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final e2.c f(long j10) {
        float[] fArr = e2.d.f21852a;
        return e2.d.f21873y[(int) (j10 & 63)];
    }

    public static final float g(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) sy.c0.p((j10 >>> 40) & 255)) / 255.0f;
        }
        short s2 = (short) ((j10 >>> 32) & 65535);
        int i13 = 32768 & s2;
        int i14 = ((65535 & s2) >>> 10) & 31;
        int i15 = s2 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f21397a;
                return i13 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float h(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) sy.c0.p((j10 >>> 48) & 255)) / 255.0f;
        }
        short s2 = (short) ((j10 >>> 48) & 65535);
        int i13 = 32768 & s2;
        int i14 = ((65535 & s2) >>> 10) & 31;
        int i15 = s2 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f21397a;
                return i13 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String i(long j10) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j10));
        sb2.append(", ");
        sb2.append(g(j10));
        sb2.append(", ");
        sb2.append(e(j10));
        sb2.append(", ");
        sb2.append(d(j10));
        sb2.append(", ");
        return a0.s0.m(sb2, f(j10).f21849a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f21390a == ((t) obj).f21390a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21390a);
    }

    public final String toString() {
        return i(this.f21390a);
    }

    public static Object d;

    public static Object g;

    public static Object f;

    public static Object c;

    public static Object b;

    public static Object c(Object... a) {
        return null;
    }

    public static Object l;

    public static Object i(Object... a) {
        return null;
    }

    public static Object k;

    public static Object j;

    public static Object b(Object... a) {
        return null;
    }

    public static Object i;
    public static Object E(Object p1, Object p2) { return null; }
    public static Object I(Object p1, Object p2, Object p3) { return null; }
    public static Object L(Object p1) { return null; }
    public static Object w(Object p1, Object p2, Object p3) { return null; }
    public Object a = null;
}
