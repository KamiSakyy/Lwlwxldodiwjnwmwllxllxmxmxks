package q71;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public class e implements Iterable, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public int f30996r;

    /* renamed from: s, reason: collision with root package name */
    public int f30997s;

    /* renamed from: t, reason: collision with root package name */
    public int f30998t;

    public e(int i, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f30996r = i;
        this.f30997s = k41.b.x(i, i10, i11);
        this.f30998t = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f30996r == eVar.f30996r && this.f30997s == eVar.f30997s && this.f30998t == eVar.f30998t;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f30996r * 31) + this.f30997s) * 31) + this.f30998t;
    }

    public boolean isEmpty() {
        int i = this.f30998t;
        int i10 = this.f30997s;
        int i11 = this.f30996r;
        return i > 0 ? i11 > i10 : i11 < i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f30996r, this.f30997s, this.f30998t);
    }

    public String toString() {
        StringBuilder sb2;
        int i = this.f30997s;
        int i10 = this.f30996r;
        int i11 = this.f30998t;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }

    public e(Object... a) {
    }
    public Object r = null;
    public Object s = null;
    public Object t = null;
}
