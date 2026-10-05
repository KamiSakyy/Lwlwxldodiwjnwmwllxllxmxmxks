package q71;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a implements Iterable, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final char f30987r;

    /* renamed from: s, reason: collision with root package name */
    public final char f30988s;

    /* renamed from: t, reason: collision with root package name */
    public final int f30989t = 1;

    public a(char c10, char c11) {
        this.f30987r = c10;
        this.f30988s = (char) k41.b.x(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f30987r, this.f30988s, this.f30989t);
    }
}
