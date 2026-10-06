package a5;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public class g1 implements Iterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f406r;

    /* renamed from: s, reason: collision with root package name */
    public int f407s;

    /* renamed from: t, reason: collision with root package name */
    public Object f408t;

    public /* synthetic */ g1(int i, Object obj) {
        this.f406r = i;
        this.f408t = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f406r) {
            case k5.f.J /* 0 */:
                if (this.f407s < ((ViewGroup) this.f408t).getChildCount()) {
                }
                break;
            case 1:
                if (this.f407s > 0) {
                }
                break;
            case 2:
                if (this.f407s < ((Object[]) this.f408t).length) {
                }
                break;
            case 3:
                if (this.f407s < ((byte[]) this.f408t).length) {
                }
                break;
            case 4:
                if (this.f407s < ((int[]) this.f408t).length) {
                }
                break;
            case 5:
                if (this.f407s < ((long[]) this.f408t).length) {
                }
                break;
            case 6:
                if (this.f407s < ((short[]) this.f408t).length) {
                }
                break;
            case 7:
                if (this.f407s < ((x.r0) this.f408t).h()) {
                }
                break;
            default:
                if (this.f407s < ((x61.e) this.f408t).a()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f406r) {
            case k5.f.J /* 0 */:
                ViewGroup viewGroup = (ViewGroup) this.f408t;
                int i = this.f407s;
                this.f407s = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                k81.y yVar = (k81.y) this.f408t;
                int i10 = ((k81.e1) yVar).c;
                int i11 = this.f407s;
                this.f407s = i11 - 1;
                return ((k81.e1) yVar).e[i10 - i11];
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f408t;
                    int i12 = this.f407s;
                    this.f407s = i12 + 1;
                    return objArr[i12];
                } catch (ArrayIndexOutOfBoundsException e5) {
                    this.f407s--;
                    throw new NoSuchElementException(e5.getMessage());
                }
            case 3:
                int i13 = this.f407s;
                byte[] bArr = (byte[]) this.f408t;
                if (i13 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f407s));
                }
                this.f407s = i13 + 1;
                return new w61.r(bArr[i13]);
            case 4:
                int i14 = this.f407s;
                int[] iArr = (int[]) this.f408t;
                if (i14 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f407s));
                }
                this.f407s = i14 + 1;
                return new w61.t(iArr[i14]);
            case 5:
                int i15 = this.f407s;
                long[] jArr = (long[]) this.f408t;
                if (i15 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f407s));
                }
                this.f407s = i15 + 1;
                return new w61.v(jArr[i15]);
            case 6:
                int i16 = this.f407s;
                short[] sArr = (short[]) this.f408t;
                if (i16 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f407s));
                }
                this.f407s = i16 + 1;
                return new w61.y(sArr[i16]);
            case 7:
                x.r0 r0Var = (x.r0) this.f408t;
                int i17 = this.f407s;
                this.f407s = i17 + 1;
                return r0Var.i(i17);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                x61.e eVar = (x61.e) this.f408t;
                int i18 = this.f407s;
                this.f407s = i18 + 1;
                return eVar.get(i18);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f406r) {
            case k5.f.J /* 0 */:
                ViewGroup viewGroup = (ViewGroup) this.f408t;
                int i = this.f407s - 1;
                this.f407s = i;
                viewGroup.removeViewAt(i);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g1(Object[] objArr) {
        this.f406r = 2;
        k71.k.g(objArr, "array");
        this.f408t = objArr;
    }

    public g1(k81.y yVar) {
        this.f406r = 1;
        this.f408t = yVar;
        this.f407s = ((k81.e1) yVar).c;
    }
}
