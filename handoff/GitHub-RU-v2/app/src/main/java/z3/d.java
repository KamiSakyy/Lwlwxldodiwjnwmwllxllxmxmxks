package z3;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f34548a;

    /* renamed from: b, reason: collision with root package name */
    public int f34549b;

    public d(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f34548a = new Object[i];
    }

    public Object a() {
        int i = this.f34549b;
        if (i <= 0) {
            return null;
        }
        int i10 = i - 1;
        Object[] objArr = this.f34548a;
        Object obj = objArr[i10];
        k.e(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f34549b--;
        return obj;
    }

    public void b(b bVar) {
        int i = this.f34549b;
        Object[] objArr = this.f34548a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f34549b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z10;
        k.g(obj, "instance");
        int i = this.f34549b;
        int i10 = 0;
        while (true) {
            objArr = this.f34548a;
            if (i10 >= i) {
                z10 = false;
                break;
            }
            if (objArr[i10] == obj) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f34549b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = obj;
        this.f34549b = i11 + 1;
        return true;
    }

    public d() {
        this.f34548a = new Object[256];
    }


}
