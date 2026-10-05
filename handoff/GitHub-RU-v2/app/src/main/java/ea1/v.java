package ea1;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes5.dex */
public final class v extends y {
    public final ArrayList c;
    public int d;

    public v(n nVar) {
        super(nVar);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = 2;
        arrayList.add(nVar);
        this.d = nVar.a() + this.d;
    }

    @Override // ea1.n
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return ba1.h.i(" > ", this.c);
    }
}
