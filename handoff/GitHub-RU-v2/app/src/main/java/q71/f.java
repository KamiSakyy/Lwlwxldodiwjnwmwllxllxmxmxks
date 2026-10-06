package q71;

import java.util.NoSuchElementException;
import x61.v;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends v {

    /* renamed from: r, reason: collision with root package name */
    public final int f30999r;

    /* renamed from: s, reason: collision with root package name */
    public final int f31000s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f31001t;

    /* renamed from: u, reason: collision with root package name */
    public int f31002u;

    public f(int i, int i10, int i11) {
        this.f30999r = i11;
        this.f31000s = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i >= i10 : i <= i10) {
            z10 = true;
        }
        this.f31001t = z10;
        this.f31002u = z10 ? i : i10;
    }

    public final boolean hasNext() {
        return this.f31001t;
    }

    public final int nextInt() {
        int i = this.f31002u;
        if (i != this.f31000s) {
            this.f31002u = this.f30999r + i;
            return i;
        }
        if (!this.f31001t) {
            throw new NoSuchElementException();
        }
        this.f31001t = false;
        return i;
    }
    public Object t = null;
}
