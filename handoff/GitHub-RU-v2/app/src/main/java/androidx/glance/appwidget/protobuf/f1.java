package androidx.glance.appwidget.protobuf;

import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes.dex */
public final class f1 extends h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2717b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f2717b = i;
    }

    @Override // androidx.glance.appwidget.protobuf.h1
    public final boolean c(long j10, Object obj) {
        switch (this.f2717b) {
            case k5.f.J /* 0 */:
                if (i1.f2733g) {
                    if (i1.h(j10, obj) == 0) {
                    }
                } else if (i1.i(j10, obj) == 0) {
                }
                break;
            default:
                if (i1.f2733g) {
                    if (i1.h(j10, obj) == 0) {
                    }
                } else if (i1.i(j10, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.glance.appwidget.protobuf.h1
    public final byte d(long j10, Object obj) {
        switch (this.f2717b) {
            case k5.f.J /* 0 */:
                if (!i1.f2733g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!i1.f2733g) {
                    break;
                } else {
                    break;
                }
        }
        return i1.i(j10, obj);
    }

    @Override // androidx.glance.appwidget.protobuf.h1
    public final double e(long j10, Object obj) {
        switch (this.f2717b) {
        }
        return Double.longBitsToDouble(h(j10, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.h1
    public final float f(long j10, Object obj) {
        switch (this.f2717b) {
        }
        return Float.intBitsToFloat(g(j10, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.h1
    public final void k(Object obj, long j10, boolean z10) {
        switch (this.f2717b) {
            case k5.f.J /* 0 */:
                if (!i1.f2733g) {
                    i1.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!i1.f2733g) {
                    i1.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.glance.appwidget.protobuf.h1
    public final void l(Object obj, long j10, byte b10) {
        switch (this.f2717b) {
            case k5.f.J /* 0 */:
                if (!i1.f2733g) {
                    i1.m(obj, j10, b10);
                    break;
                } else {
                    i1.l(obj, j10, b10);
                    break;
                }
            default:
                if (!i1.f2733g) {
                    i1.m(obj, j10, b10);
                    break;
                } else {
                    i1.l(obj, j10, b10);
                    break;
                }
        }
    }

    @Override // androidx.glance.appwidget.protobuf.h1
    public final void m(Object obj, long j10, double d10) {
        switch (this.f2717b) {
            case k5.f.J /* 0 */:
                p(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                p(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.h1
    public final void n(Object obj, long j10, float f6) {
        switch (this.f2717b) {
            case k5.f.J /* 0 */:
                o(Float.floatToIntBits(f6), j10, obj);
                break;
            default:
                o(Float.floatToIntBits(f6), j10, obj);
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.h1
    public final boolean s() {
        switch (this.f2717b) {
        }
        return false;
    }



}
