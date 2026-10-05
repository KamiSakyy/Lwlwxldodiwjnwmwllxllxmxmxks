package x;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class r0 implements Cloneable {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f33615r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ int[] f33616s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object[] f33617t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ int f33618u;

    public r0(int i) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f33616s = new int[i13];
        this.f33617t = new Object[i13];
    }

    public final void a(int i, Object obj) {
        int i10 = this.f33618u;
        if (i10 != 0 && i <= this.f33616s[i10 - 1]) {
            g(i, obj);
            return;
        }
        if (this.f33615r && i10 >= this.f33616s.length) {
            s.a(this);
        }
        int i11 = this.f33618u;
        if (i11 >= this.f33616s.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.f33616s, i15);
            k71.k.f(copyOf, "copyOf(...)");
            this.f33616s = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f33617t, i15);
            k71.k.f(copyOf2, "copyOf(...)");
            this.f33617t = copyOf2;
        }
        this.f33616s[i11] = i;
        this.f33617t[i11] = obj;
        this.f33618u = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r0 clone() {
        Object clone = super.clone();
        k71.k.e(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        r0 r0Var = (r0) clone;
        r0Var.f33616s = (int[]) this.f33616s.clone();
        r0Var.f33617t = (Object[]) this.f33617t.clone();
        return r0Var;
    }

    public final boolean c(int i) {
        if (this.f33615r) {
            s.a(this);
        }
        return y.a.a(this.f33618u, i, this.f33616s) >= 0;
    }

    public final Object d(int i) {
        Object obj;
        int a10 = y.a.a(this.f33618u, i, this.f33616s);
        if (a10 < 0 || (obj = this.f33617t[a10]) == s.f33621c) {
            return null;
        }
        return obj;
    }

    public final int e(int i) {
        if (this.f33615r) {
            s.a(this);
        }
        return this.f33616s[i];
    }

    public final void g(int i, Object obj) {
        int a10 = y.a.a(this.f33618u, i, this.f33616s);
        if (a10 >= 0) {
            this.f33617t[a10] = obj;
            return;
        }
        int i10 = ~a10;
        int i11 = this.f33618u;
        if (i10 < i11) {
            Object[] objArr = this.f33617t;
            if (objArr[i10] == s.f33621c) {
                this.f33616s[i10] = i;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f33615r && i11 >= this.f33616s.length) {
            s.a(this);
            i10 = ~y.a.a(this.f33618u, i, this.f33616s);
        }
        int i12 = this.f33618u;
        if (i12 >= this.f33616s.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.f33616s, i16);
            k71.k.f(copyOf, "copyOf(...)");
            this.f33616s = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f33617t, i16);
            k71.k.f(copyOf2, "copyOf(...)");
            this.f33617t = copyOf2;
        }
        int i17 = this.f33618u;
        if (i17 - i10 != 0) {
            int[] iArr = this.f33616s;
            int i18 = i10 + 1;
            x61.l.w(i18, i10, i17, iArr, iArr);
            Object[] objArr2 = this.f33617t;
            x61.l.x(i18, i10, this.f33618u, objArr2, objArr2);
        }
        this.f33616s[i10] = i;
        this.f33617t[i10] = obj;
        this.f33618u++;
    }

    public final int h() {
        if (this.f33615r) {
            s.a(this);
        }
        return this.f33618u;
    }

    public final Object i(int i) {
        if (this.f33615r) {
            s.a(this);
        }
        Object[] objArr = this.f33617t;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f33618u * 28);
        sb2.append('{');
        int i = this.f33618u;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(e(i10));
            sb2.append('=');
            Object i11 = i(i10);
            if (i11 != this) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }
}
