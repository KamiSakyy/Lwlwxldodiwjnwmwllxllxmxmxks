package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class ob {

    /* renamed from: a, reason: collision with root package name */
    public w1.h f23493a;

    /* renamed from: b, reason: collision with root package name */
    public w1.h f23494b;

    public ob() {
        w1.h hVar = w1.c.D;
        this.f23493a = hVar;
        this.f23494b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return k71.k.b(this.f23493a, obVar.f23493a) && k71.k.b(this.f23494b, obVar.f23494b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f23494b.f32937a) + x.i.b(Boolean.hashCode(false) * 31, this.f23493a.f32937a, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.f23493a + ", expandedAlignment=" + this.f23494b + ')';
    }
}
