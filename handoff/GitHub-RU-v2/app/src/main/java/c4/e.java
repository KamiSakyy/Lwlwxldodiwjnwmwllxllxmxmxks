package c4;

/* loaded from: /home/user/work/p/classes.dex */
public class e extends c {

    /* renamed from: v, reason: collision with root package name */
    public float f4109v;

    public e(float f6) {
        super(null);
        this.f4109v = f6;
    }

    @Override // c4.c
    public final float d() {
        char[] cArr;
        if (Float.isNaN(this.f4109v) && (cArr = this.f4105r) != null && cArr.length >= 1) {
            this.f4109v = Float.parseFloat(b());
        }
        return this.f4109v;
    }

    @Override // c4.c
    public final int e() {
        char[] cArr;
        if (Float.isNaN(this.f4109v) && (cArr = this.f4105r) != null && cArr.length >= 1) {
            this.f4109v = Integer.parseInt(b());
        }
        return (int) this.f4109v;
    }

    @Override // c4.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            float d10 = d();
            float d11 = ((e) obj).d();
            if ((Float.isNaN(d10) && Float.isNaN(d11)) || d10 == d11) {
                return true;
            }
        }
        return false;
    }

    @Override // c4.c
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f6 = this.f4109v;
        return hashCode + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0);
    }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
