package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes.dex */
public final class d1 extends f1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2272b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f2272b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final boolean c(long j10, Object obj) {
        switch (this.f2272b) {
            case k5.f.J /* 0 */:
                if (!g1.f2290g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!g1.f2290g) {
                    break;
                } else {
                    break;
                }
        }
        return g1.c(j10, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final double d(long j10, Object obj) {
        switch (this.f2272b) {
        }
        return Double.longBitsToDouble(g(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final float e(long j10, Object obj) {
        switch (this.f2272b) {
        }
        return Float.intBitsToFloat(f(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final void j(Object obj, long j10, boolean z10) {
        switch (this.f2272b) {
            case k5.f.J /* 0 */:
                if (!g1.f2290g) {
                    g1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    g1.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!g1.f2290g) {
                    g1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    g1.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final void k(Object obj, long j10, byte b10) {
        switch (this.f2272b) {
            case k5.f.J /* 0 */:
                if (!g1.f2290g) {
                    g1.l(obj, j10, b10);
                    break;
                } else {
                    g1.k(obj, j10, b10);
                    break;
                }
            default:
                if (!g1.f2290g) {
                    g1.l(obj, j10, b10);
                    break;
                } else {
                    g1.k(obj, j10, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final void l(Object obj, long j10, double d10) {
        switch (this.f2272b) {
            case k5.f.J /* 0 */:
                o(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                o(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final void m(Object obj, long j10, float f6) {
        switch (this.f2272b) {
            case k5.f.J /* 0 */:
                n(Float.floatToIntBits(f6), j10, obj);
                break;
            default:
                n(Float.floatToIntBits(f6), j10, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final boolean r() {
        switch (this.f2272b) {
        }
        return false;
    }


}
