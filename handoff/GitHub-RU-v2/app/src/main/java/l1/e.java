package l1;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes.dex */
public final class e implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public Object[] f27901r;

    /* renamed from: s, reason: collision with root package name */
    public b f27902s;

    /* renamed from: t, reason: collision with root package name */
    public int f27903t = 0;

    public e(Object[] objArr) {
        this.f27901r = objArr;
    }

    public final void a(int i, Object obj) {
        int i10 = this.f27903t + 1;
        if (this.f27901r.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f27901r;
        int i11 = this.f27903t;
        if (i != i11) {
            System.arraycopy(objArr, i, objArr, i + 1, i11 - i);
        }
        objArr[i] = obj;
        this.f27903t++;
    }

    public final void b(Object obj) {
        int i = this.f27903t + 1;
        if (this.f27901r.length < i) {
            n(i);
        }
        Object[] objArr = this.f27901r;
        int i10 = this.f27903t;
        objArr[i10] = obj;
        this.f27903t = i10 + 1;
    }

    public final void c(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i10 = this.f27903t + size;
        if (this.f27901r.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f27901r;
        int i11 = this.f27903t;
        if (i != i11) {
            System.arraycopy(objArr, i, objArr, i + size, i11 - i);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr[i + i12] = list.get(i12);
        }
        this.f27903t += size;
    }

    public final void d(int i, e eVar) {
        int i10 = eVar.f27903t;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f27903t + i10;
        if (this.f27901r.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f27901r;
        int i12 = this.f27903t;
        if (i != i12) {
            System.arraycopy(objArr, i, objArr, i + i10, i12 - i);
        }
        System.arraycopy(eVar.f27901r, 0, objArr, i, i10);
        this.f27903t += i10;
    }

    public final boolean e(int i, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i11 = this.f27903t + size;
        if (this.f27901r.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f27901r;
        int i12 = this.f27903t;
        if (i != i12) {
            System.arraycopy(objArr, i, objArr, i + size, i12 - i);
        }
        for (Object obj : collection) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                d0Shadow.x();
                throw null;
            }
            objArr[i10 + i] = obj;
            i10 = i13;
        }
        this.f27903t += size;
        return true;
    }

    public final List f() {
        b bVar = this.f27902s;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(0, this);
        this.f27902s = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f27901r;
        int i = this.f27903t;
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = null;
        }
        this.f27903t = 0;
    }

    public final boolean i(Object obj) {
        int i = this.f27903t - 1;
        if (i >= 0) {
            for (int i10 = 0; !k.b(this.f27901r[i10], obj); i10++) {
                if (i10 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.f27901r;
        int i = this.f27903t;
        for (int i10 = 0; i10 < i; i10++) {
            if (k.b(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int j10 = j(obj);
        if (j10 < 0) {
            return false;
        }
        l(j10);
        return true;
    }

    public final Object l(int i) {
        Object[] objArr = this.f27901r;
        Object obj = objArr[i];
        int i10 = this.f27903t;
        if (i != i10 - 1) {
            int i11 = i + 1;
            System.arraycopy(objArr, i11, objArr, i, i10 - i11);
        }
        int i12 = this.f27903t - 1;
        this.f27903t = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void m(int i, int i10) {
        if (i10 > i) {
            int i11 = this.f27903t;
            if (i10 < i11) {
                Object[] objArr = this.f27901r;
                System.arraycopy(objArr, i10, objArr, i, i11 - i10);
            }
            int i12 = this.f27903t;
            int i13 = i12 - (i10 - i);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.f27901r[i15] = null;
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f27903t = i13;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.f27901r;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f27901r = objArr2;
    }


    public static Object g(Object... a) {
        return null;
    }
    public Object f27901r = null;
    public Object f27903t = null;
    public Object t = null;
}
