package com.github.rudroid.achievements.ui;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f4515a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4516b;

    public j(float f6, float f10) {
        this.f4515a = f6;
        this.f4516b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f4515a, jVar.f4515a) == 0 && Float.compare(this.f4516b, jVar.f4516b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4516b) + (Float.hashCode(this.f4515a) * 31);
    }

    public final String toString() {
        return "SensorData(roll=" + this.f4515a + ", pitch=" + this.f4516b + ")";
    }
}
