package c2;

import w8.s;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f4059e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f4060a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4061b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4062c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4063d;

    public c(float f6, float f10, float f11, float f12) {
        this.f4060a = f6;
        this.f4061b = f10;
        this.f4062c = f11;
        this.f4063d = f12;
    }

    public static c b(c cVar, float f6, float f10, float f11, int i) {
        if ((i & 1) != 0) {
            f6 = cVar.f4060a;
        }
        float f12 = cVar.f4061b;
        if ((i & 4) != 0) {
            f10 = cVar.f4062c;
        }
        if ((i & 8) != 0) {
            f11 = cVar.f4063d;
        }
        return new c(f6, f12, f10, f11);
    }

    public final boolean a(long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (intBitsToFloat >= this.f4060a) & (intBitsToFloat < this.f4062c) & (intBitsToFloat2 >= this.f4061b) & (intBitsToFloat2 < this.f4063d);
    }

    public final long c() {
        float f6 = this.f4062c;
        float f10 = this.f4060a;
        float f11 = ((f6 - f10) / 2.0f) + f10;
        float f12 = this.f4063d;
        float f13 = this.f4061b;
        return (Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public final long d() {
        float f6 = this.f4062c - this.f4060a;
        float f10 = this.f4063d - this.f4061b;
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public final long e() {
        return (Float.floatToRawIntBits(this.f4060a) << 32) | (Float.floatToRawIntBits(this.f4061b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f4060a, cVar.f4060a) == 0 && Float.compare(this.f4061b, cVar.f4061b) == 0 && Float.compare(this.f4062c, cVar.f4062c) == 0 && Float.compare(this.f4063d, cVar.f4063d) == 0;
    }

    public final c f(c cVar) {
        return new c(Math.max(this.f4060a, cVar.f4060a), Math.max(this.f4061b, cVar.f4061b), Math.min(this.f4062c, cVar.f4062c), Math.min(this.f4063d, cVar.f4063d));
    }

    public final boolean g() {
        return (this.f4060a >= this.f4062c) | (this.f4061b >= this.f4063d);
    }

    public final boolean h(c cVar) {
        return (this.f4060a < cVar.f4062c) & (cVar.f4060a < this.f4062c) & (this.f4061b < cVar.f4063d) & (cVar.f4061b < this.f4063d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4063d) + i.b(i.b(Float.hashCode(this.f4060a) * 31, this.f4061b, 31), this.f4062c, 31);
    }

    public final c i(float f6, float f10) {
        return new c(this.f4060a + f6, this.f4061b + f10, this.f4062c + f6, this.f4063d + f10);
    }

    public final c j(long j10) {
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        return new c(Float.intBitsToFloat(i) + this.f4060a, Float.intBitsToFloat(i10) + this.f4061b, Float.intBitsToFloat(i) + this.f4062c, Float.intBitsToFloat(i10) + this.f4063d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + s.J(this.f4060a) + ", " + s.J(this.f4061b) + ", " + s.J(this.f4062c) + ", " + s.J(this.f4063d) + ')';
    }
}
