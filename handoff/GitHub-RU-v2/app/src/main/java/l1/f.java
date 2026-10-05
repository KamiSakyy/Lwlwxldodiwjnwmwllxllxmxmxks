package l1;

import a0.s0;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    public static final void b(List list, int i, int i10) {
        if (i > i10) {
            f(i, i10);
        }
        if (i < 0) {
            d(i);
        }
        if (i10 > list.size()) {
            e(i10, list.size());
        }
    }

    private static final void c(int i, int i10) {
        throw new IndexOutOfBoundsException(f4.h(i, i10, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(s0.i("fromIndex (", i, ") is less than 0."));
    }

    private static final void e(int i, int i10) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i10 + ')');
    }

    private static final void f(int i, int i10) {
        throw new IllegalArgumentException(f4.h(i, i10, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
