package x;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f33598a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f33599b = new d0(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            y.a.d("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(List list, int i, int i10) {
        int size = list.size();
        if (i > i10) {
            y.a.c("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i10 + ").");
            throw null;
        }
        if (i < 0) {
            y.a.d("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i10 <= size) {
            return;
        }
        y.a.d("toIndex (" + i10 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
