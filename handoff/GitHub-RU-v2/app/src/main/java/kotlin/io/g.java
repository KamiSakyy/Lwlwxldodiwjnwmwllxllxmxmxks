package kotlin.io;

import a5.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import s71.l;
import x61.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements s71.h {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new e(this);
            case 1:
                return new p1.c(this);
            default:
                l lVar = (l) this.b;
                ArrayList arrayList = new ArrayList();
                j0 it = lVar.iterator();
                while (true) {
                    j0 j0Var = it;
                    if (!j0Var.hasNext()) {
                        p.I(arrayList, (Comparator) this.c);
                        return arrayList.iterator();
                    }
                    arrayList.add(j0Var.next());
                }
        }
    }

    public g(File file) {
        this.a = 0;
        h hVar = h.r;
        this.b = file;
        this.c = hVar;
    }
}
