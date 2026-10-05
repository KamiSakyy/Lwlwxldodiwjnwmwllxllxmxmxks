package androidx.compose.ui.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final class c1 implements y1, i {

    /* renamed from: s, reason: collision with root package name */
    public static final c1 f1934s = new c1(0);

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1935r;

    public /* synthetic */ c1(int i) {
        this.f1935r = i;
    }

    @Override // androidx.compose.ui.layout.i
    public long a(long j10, long j11) {
        switch (this.f1935r) {
            case 1:
                float max = Math.max(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = q1.f2043a;
                return floatToRawIntBits;
            case 2:
                float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                int i10 = q1.f2043a;
                return floatToRawIntBits2;
            case 3:
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
                int i11 = q1.f2043a;
                return floatToRawIntBits3;
            case 4:
                float d10 = z.d(j10, j11);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(d10) << 32) | (Float.floatToRawIntBits(d10) & 4294967295L);
                int i12 = q1.f2043a;
                return floatToRawIntBits4;
            default:
                if (Float.intBitsToFloat((int) (j10 >> 32)) <= Float.intBitsToFloat((int) (j11 >> 32)) && Float.intBitsToFloat((int) (j10 & 4294967295L)) <= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
                    long floatToRawIntBits5 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i13 = q1.f2043a;
                    return floatToRawIntBits5;
                }
                float d11 = z.d(j10, j11);
                long floatToRawIntBits6 = (Float.floatToRawIntBits(d11) << 32) | (Float.floatToRawIntBits(d11) & 4294967295L);
                int i14 = q1.f2043a;
                return floatToRawIntBits6;
        }
    }

    @Override // androidx.compose.ui.layout.y1
    public void b(x1 x1Var) {
        x1Var.clear();
    }

    @Override // androidx.compose.ui.layout.y1
    public boolean d(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f1935r) {
            case 6:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
