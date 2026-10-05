package o1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class d implements Iterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final n[] f29909r;

    /* renamed from: s, reason: collision with root package name */
    public int f29910s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f29911t = true;

    public d(m mVar, n[] nVarArr) {
        this.f29909r = nVarArr;
        nVarArr[0].a(mVar.f29934d, Integer.bitCount(mVar.f29931a) * 2, 0);
        this.f29910s = 0;
        a();
    }

    public final void a() {
        int i = this.f29910s;
        n[] nVarArr = this.f29909r;
        n nVar = nVarArr[i];
        if (nVar.f29937t < nVar.f29936s) {
            return;
        }
        while (-1 < i) {
            int b10 = b(i);
            if (b10 == -1) {
                n nVar2 = nVarArr[i];
                int i10 = nVar2.f29937t;
                Object[] objArr = nVar2.f29935r;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f29937t = i10 + 1;
                    b10 = b(i);
                }
            }
            if (b10 != -1) {
                this.f29910s = b10;
                return;
            }
            if (i > 0) {
                n nVar3 = nVarArr[i - 1];
                int i11 = nVar3.f29937t;
                int length2 = nVar3.f29935r.length;
                nVar3.f29937t = i11 + 1;
            }
            nVarArr[i].a(m.f29930e.f29934d, 0, 0);
            i--;
        }
        this.f29911t = false;
    }

    public final int b(int i) {
        n[] nVarArr = this.f29909r;
        n nVar = nVarArr[i];
        int i10 = nVar.f29937t;
        if (i10 < nVar.f29936s) {
            return i;
        }
        Object[] objArr = nVar.f29935r;
        if (i10 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i10];
        k71.k.e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i == 6) {
            n nVar2 = nVarArr[i + 1];
            Object[] objArr2 = mVar.f29934d;
            nVar2.a(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i + 1].a(mVar.f29934d, Integer.bitCount(mVar.f29931a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29911t;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f29911t) {
            throw new NoSuchElementException();
        }
        Object next = this.f29909r[this.f29910s].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }







}
