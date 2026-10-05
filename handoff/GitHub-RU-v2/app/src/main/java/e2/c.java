package e2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f21849a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21850b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21851c;

    public c(int i, long j10, String str) {
        this.f21849a = str;
        this.f21850b = j10;
        this.f21851c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f6, float f10, float f11);

    public abstract float e(float f6, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21851c == cVar.f21851c && k71.k.b(this.f21849a, cVar.f21849a)) {
            return b.a(this.f21850b, cVar.f21850b);
        }
        return false;
    }

    public abstract long f(float f6, float f10, float f11, float f12, c cVar);

    public int hashCode() {
        int hashCode = this.f21849a.hashCode() * 31;
        int i = b.f21848e;
        return x.i.c(hashCode, 31, this.f21850b) + this.f21851c;
    }

    public final String toString() {
        return this.f21849a + " (id=" + this.f21851c + ", model=" + ((Object) b.b(this.f21850b)) + ')';
    }
}
