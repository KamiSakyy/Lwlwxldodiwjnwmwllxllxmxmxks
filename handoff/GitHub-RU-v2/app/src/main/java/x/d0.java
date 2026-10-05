package x;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f33540a;

    /* renamed from: b, reason: collision with root package name */
    public int f33541b;

    /* renamed from: c, reason: collision with root package name */
    public l1.b f33542c;

    public d0(int i) {
        this.f33540a = i == 0 ? m0.f33598a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.f33541b + 1;
        Object[] objArr = this.f33540a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.f33540a;
        int i10 = this.f33541b;
        objArr2[i10] = obj;
        this.f33541b = i10 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f33541b;
        int size = list.size() + i;
        Object[] objArr = this.f33540a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.f33540a;
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            objArr2[i10 + i] = list.get(i10);
        }
        this.f33541b = list.size() + this.f33541b;
    }

    public final void c(d0 d0Var) {
        k71.k.g(d0Var, "elements");
        if (d0Var.h()) {
            return;
        }
        int i = this.f33541b + d0Var.f33541b;
        Object[] objArr = this.f33540a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        x61.l.x(this.f33541b, 0, d0Var.f33541b, d0Var.f33540a, this.f33540a);
        this.f33541b += d0Var.f33541b;
    }

    public final void d() {
        x61.l.G(0, this.f33541b, (Object) null, this.f33540a);
        this.f33541b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.f33540a[0];
        }
        y.a.e("ObjectList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            int i = d0Var.f33541b;
            int i10 = this.f33541b;
            if (i == i10) {
                Object[] objArr = this.f33540a;
                Object[] objArr2 = d0Var.f33540a;
                q71.g b02 = aa1.b.b0(0, i10);
                int i11 = b02.f30996r;
                int i12 = b02.f30997s;
                if (i11 > i12) {
                    return true;
                }
                while (k71.k.b(objArr[i11], objArr2[i11])) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.f33541b) {
            return this.f33540a[i];
        }
        n(i);
        throw null;
    }

    public final int g(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.f33540a;
            int i10 = this.f33541b;
            while (i < i10) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.f33540a;
        int i11 = this.f33541b;
        while (i < i11) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean h() {
        return this.f33541b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f33540a;
        int i = this.f33541b;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            Object obj = objArr[i11];
            i10 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i10;
    }

    public final boolean i() {
        return this.f33541b != 0;
    }

    public final boolean j(Object obj) {
        int g7 = g(obj);
        if (g7 < 0) {
            return false;
        }
        k(g7);
        return true;
    }

    public final Object k(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f33541b)) {
            n(i);
            throw null;
        }
        Object[] objArr = this.f33540a;
        Object obj = objArr[i];
        if (i != i10 - 1) {
            x61.l.x(i, i + 1, i10, objArr, objArr);
        }
        int i11 = this.f33541b - 1;
        this.f33541b = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void l(int i, int i10) {
        int i11;
        if (i < 0 || i > (i11 = this.f33541b) || i10 < 0 || i10 > i11) {
            StringBuilder m = i.m(i, i10, "Start (", ") and end (", ") must be in 0..");
            m.append(this.f33541b);
            y.a.d(m.toString());
            throw null;
        }
        if (i10 < i) {
            y.a.c("Start (" + i + ") is more than end (" + i10 + ')');
            throw null;
        }
        if (i10 != i) {
            if (i10 < i11) {
                Object[] objArr = this.f33540a;
                x61.l.x(i, i10, i11, objArr, objArr);
            }
            int i12 = this.f33541b;
            int i13 = i12 - (i10 - i);
            x61.l.G(i13, i12, (Object) null, this.f33540a);
            this.f33541b = i13;
        }
    }

    public final void m(int i, Object[] objArr) {
        k71.k.g(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        x61.l.x(0, 0, length, objArr, objArr2);
        this.f33540a = objArr2;
    }

    public final void n(int i) {
        StringBuilder o5 = i.o("Index ", i, " must be in 0..");
        o5.append(this.f33541b - 1);
        y.a.d(o5.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f33540a;
        int i = this.f33541b;
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i10++;
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ d0() {
        this(16);
    }
}
