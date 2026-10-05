package k3;

import a0.s0;

/* loaded from: /home/user/work/p/classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f27703a;

    /* renamed from: b, reason: collision with root package name */
    public final s f27704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27705c;

    /* renamed from: d, reason: collision with root package name */
    public final r f27706d;

    public z(int i, s sVar, int i10, r rVar) {
        this.f27703a = i;
        this.f27704b = sVar;
        this.f27705c = i10;
        this.f27706d = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f27703a == zVar.f27703a && k71.k.b(this.f27704b, zVar.f27704b) && this.f27705c == zVar.f27705c && this.f27706d.equals(zVar.f27706d);
    }

    public final int hashCode() {
        return this.f27706d.f27689a.hashCode() + s0.b(0, s0.b(this.f27705c, ((this.f27703a * 31) + this.f27704b.f27698r) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResourceFont(resId=");
        sb2.append(this.f27703a);
        sb2.append(", weight=");
        sb2.append(this.f27704b);
        sb2.append(", style=");
        int i = this.f27705c;
        sb2.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb2.append(", loadingStrategy=Blocking)");
        return sb2.toString();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r<T1,T2,T3,T4> {
        public r() {
        }
    }
}
