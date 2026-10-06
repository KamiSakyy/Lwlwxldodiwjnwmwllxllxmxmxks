package t71;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public final class i implements Iterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f32127r;

    /* renamed from: s, reason: collision with root package name */
    public int f32128s;

    /* renamed from: t, reason: collision with root package name */
    public int f32129t;

    /* renamed from: u, reason: collision with root package name */
    public int f32130u;

    /* renamed from: v, reason: collision with root package name */
    public int f32131v;

    public i(CharSequence charSequence) {
        k71.k.g(charSequence, "string");
        this.f32127r = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i10;
        int i11 = this.f32128s;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f32131v < 0) {
            this.f32128s = 2;
            return false;
        }
        CharSequence charSequence = this.f32127r;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f32129t; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f32128s = 1;
                this.f32131v = i;
                this.f32130u = length;
                return true;
            }
        }
        i = -1;
        this.f32128s = 1;
        this.f32131v = i;
        this.f32130u = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f32128s = 0;
        int i = this.f32130u;
        int i10 = this.f32129t;
        this.f32129t = this.f32131v + i;
        return this.f32127r.subSequence(i10, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
