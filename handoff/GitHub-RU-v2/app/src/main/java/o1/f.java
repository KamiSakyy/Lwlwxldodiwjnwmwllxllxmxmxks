package o1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import k71.z;

/* loaded from: /home/user/work/p/classes.dex */
public class f extends d {

    /* renamed from: u, reason: collision with root package name */
    public final e f29918u;

    /* renamed from: v, reason: collision with root package name */
    public Object f29919v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f29920w;

    /* renamed from: x, reason: collision with root package name */
    public int f29921x;

    public f(e eVar, n[] nVarArr) {
        super(eVar.f29914t, nVarArr);
        this.f29918u = eVar;
        this.f29921x = eVar.f29916v;
    }

    public final void c(int i, m mVar, Object obj, int i10) {
        int i11 = i10 * 5;
        n[] nVarArr = this.f29909r;
        if (i11 <= 30) {
            int x2 = 1 << b41.b.x(i, i11);
            if (mVar.h(x2)) {
                nVarArr[i10].a(mVar.f29934d, Integer.bitCount(mVar.f29931a) * 2, mVar.f(x2));
                this.f29910s = i10;
                return;
            } else {
                int t10 = mVar.t(x2);
                m s2 = mVar.s(t10);
                nVarArr[i10].a(mVar.f29934d, Integer.bitCount(mVar.f29931a) * 2, t10);
                c(i, s2, obj, i10 + 1);
                return;
            }
        }
        n nVar = nVarArr[i10];
        Object[] objArr = mVar.f29934d;
        nVar.a(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i10];
            if (k71.k.b(nVar2.f29935r[nVar2.f29937t], obj)) {
                this.f29910s = i10;
                return;
            } else {
                nVarArr[i10].f29937t += 2;
            }
        }
    }

    @Override // o1.d, java.util.Iterator
    public final Object next() {
        if (this.f29918u.f29916v != this.f29921x) {
            throw new ConcurrentModificationException();
        }
        if (!this.f29911t) {
            throw new NoSuchElementException();
        }
        n nVar = this.f29909r[this.f29910s];
        this.f29919v = nVar.f29935r[nVar.f29937t];
        this.f29920w = true;
        return super.next();
    }

    @Override // o1.d, java.util.Iterator
    public final void remove() {
        if (!this.f29920w) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f29911t;
        e eVar = this.f29918u;
        if (!z10) {
            z.b(eVar).remove(this.f29919v);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            n nVar = this.f29909r[this.f29910s];
            Object obj = nVar.f29935r[nVar.f29937t];
            z.b(eVar).remove(this.f29919v);
            c(obj != null ? obj.hashCode() : 0, eVar.f29914t, obj, 0);
        }
        this.f29919v = null;
        this.f29920w = false;
        this.f29921x = eVar.f29916v;
    }


}
