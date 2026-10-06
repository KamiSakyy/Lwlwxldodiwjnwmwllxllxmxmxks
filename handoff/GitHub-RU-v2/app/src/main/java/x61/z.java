package x61;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z extends e implements RandomAccess {
    public Object[] r;
    public int s;
    public int t;
    public int u;

    public z(int i, Object[] objArr) {
        this.r = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(no.a.k("ring buffer filled size should not be negative but it is ", i).toString());
        }
        if (i <= objArr.length) {
            this.s = objArr.length;
            this.u = i;
        } else {
            StringBuilder o = x.i.o("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            o.append(objArr.length);
            throw new IllegalArgumentException(o.toString().toString());
        }
    }

    @Override // x61.a
    public final int a() {
        return this.u;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(no.a.k("n shouldn't be negative but it is ", i).toString());
        }
        if (i > this.u) {
            StringBuilder o = x.i.o("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
            o.append(this.u);
            throw new IllegalArgumentException(o.toString().toString());
        }
        if (i > 0) {
            int i2 = this.t;
            int i3 = this.s;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.r;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.t = i4;
            this.u -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int a = a();
        if (i < 0 || i >= a) {
            throw new IndexOutOfBoundsException(no.a.j(i, a, "index: ", ", size: "));
        }
        return this.r[(this.t + i) % this.s];
    }

    @Override // x61.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new y(this);
    }

    @Override // x61.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // x61.a, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        k71.k.g(objArr, "array");
        int length = objArr.length;
        int i = this.u;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
            k71.k.f(objArr, "copyOf(...)");
        }
        int i2 = this.u;
        int i3 = this.t;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.r;
            if (i5 >= i2 || i3 >= this.s) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
