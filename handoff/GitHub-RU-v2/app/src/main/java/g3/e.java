package g3;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24575a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24576b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24577c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24578d;

    public e(Object obj, int i, int i10, String str) {
        this.f24575a = obj;
        this.f24576b = i;
        this.f24577c = i10;
        this.f24578d = str;
        if (i <= i10) {
            return;
        }
        m3.a.a("Reversed range is not supported");
    }

    public static e a(e eVar, b bVar, int i, int i10) {
        Object obj = bVar;
        if ((i10 & 1) != 0) {
            obj = eVar.f24575a;
        }
        int i11 = eVar.f24576b;
        if ((i10 & 4) != 0) {
            i = eVar.f24577c;
        }
        String str = eVar.f24578d;
        eVar.getClass();
        return new e(obj, i11, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.f24575a, eVar.f24575a) && this.f24576b == eVar.f24576b && this.f24577c == eVar.f24577c && k71.k.b(this.f24578d, eVar.f24578d);
    }

    public final int hashCode() {
        Object obj = this.f24575a;
        return this.f24578d.hashCode() + a0.s0.b(this.f24577c, a0.s0.b(this.f24576b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f24575a);
        sb2.append(", start=");
        sb2.append(this.f24576b);
        sb2.append(", end=");
        sb2.append(this.f24577c);
        sb2.append(", tag=");
        return a0.s0.m(sb2, this.f24578d, ')');
    }

    public e(Object obj, int i, int i10) {
        this(obj, i, i10, "");
    }
}
