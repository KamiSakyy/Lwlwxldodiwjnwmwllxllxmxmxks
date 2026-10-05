package com.github.rudroid.achievements.ui;

/* loaded from: /home/user/work/p/classes.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    public final float f4579a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4580b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4581c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4582d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4583e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4584f;

    public o(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f4579a = f6;
        this.f4580b = f10;
        this.f4581c = f11;
        this.f4582d = f12;
        this.f4583e = f13;
        this.f4584f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f4579a, oVar.f4579a) == 0 && Float.compare(this.f4580b, oVar.f4580b) == 0 && Float.compare(this.f4581c, oVar.f4581c) == 0 && Float.compare(this.f4582d, oVar.f4582d) == 0 && Float.compare(this.f4583e, oVar.f4583e) == 0 && Float.compare(this.f4584f, oVar.f4584f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4584f) + x.i.b(x.i.b(x.i.b(x.i.b(Float.hashCode(this.f4579a) * 31, this.f4580b, 31), this.f4581c, 31), this.f4582d, 31), this.f4583e, 31);
    }

    public final String toString() {
        return "UserAchievementBadgeAnimation(currentPageOffset=" + this.f4579a + ", cameraDistance=" + this.f4580b + ", translationX=" + this.f4581c + ", translationY=" + this.f4582d + ", rotationX=" + this.f4583e + ", rotationY=" + this.f4584f + ")";
    }
}
