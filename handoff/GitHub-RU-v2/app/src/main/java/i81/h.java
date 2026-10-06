package i81;

import a5.g1;
import java.util.Iterator;
import k81.y;
import w8.p;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h implements Iterable, l71.a {
    public final /* synthetic */ int r;
    public Object s;

    public /* synthetic */ h(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.r) {
            case 0:
                return new g1((y) this.s);
            case 1:
                return new t71.b((t71.c) this.s);
            case 2:
                return k71.k.k((Object[]) this.s);
            default:
                return new s71.b(k71.k.k((Object[]) ((p) this.s).s));
        }
    }

    public Object s;
}
