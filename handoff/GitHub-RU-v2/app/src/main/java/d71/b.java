package d71;

import java.io.Serializable;
import k71.k;
import x61.e;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b extends e implements a, Serializable {
    public Enum[] r;

    public b(Enum[] enumArr) {
        k.g(enumArr, "entries");
        this.r = enumArr;
    }

    @Override // x61.a
    public final int a() {
        return this.r.length;
    }

    @Override // x61.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) l.P(r4.ordinal(), this.r)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.r;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(no.a.j(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // x61.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (((Enum) l.P(ordinal, this.r)) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // x61.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (((Enum) l.P(ordinal, this.r)) == r4) {
            return ordinal;
        }
        return -1;
    }
}
