package n1;

import com.google.android.gms.internal.measurement.b4;
import java.util.NoSuchElementException;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends a {

    /* renamed from: t, reason: collision with root package name */
    public int f29395t;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f29396u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29397v;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i, int i10, int i11) {
        super(i, i10);
        this.f29395t = i11;
        Object[] objArr2 = new Object[i11];
        this.f29396u = objArr2;
        ?? r52 = i == i10 ? 1 : 0;
        this.f29397v = r52;
        objArr2[0] = objArr;
        b(i - r52, 1);
    }

    public final Object a() {
        int i = this.f29369r & 31;
        Object obj = this.f29396u[this.f29395t - 1];
        k.e(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i10) {
        int i11 = (this.f29395t - i10) * 5;
        while (i10 < this.f29395t) {
            Object[] objArr = this.f29396u;
            Object obj = objArr[i10 - 1];
            k.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i10] = ((Object[]) obj)[b4.S(i, i11)];
            i11 -= 5;
            i10++;
        }
    }

    public final void c(int i) {
        int i10 = 0;
        while (b4.S(this.f29369r, i10) == i) {
            i10 += 5;
        }
        if (i10 > 0) {
            b(this.f29369r, ((this.f29395t - 1) - (i10 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a10 = a();
        int i = this.f29369r + 1;
        this.f29369r = i;
        if (i == this.f29370s) {
            this.f29397v = true;
            return a10;
        }
        c(0);
        return a10;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f29369r--;
        if (this.f29397v) {
            this.f29397v = false;
            return a();
        }
        c(31);
        return a();
    }
}
