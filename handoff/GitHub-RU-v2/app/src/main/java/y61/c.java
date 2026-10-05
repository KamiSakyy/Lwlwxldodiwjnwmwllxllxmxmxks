package y61;

import a5.q0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends q0 implements Iterator, l71.a {
    public final /* synthetic */ int v;

    public c(e eVar, int i) {
        this.v = i;
        k.g(eVar, "map");
        ((q0) this).u = eVar;
        ((q0) this).s = -1;
        ((q0) this).t = eVar.y;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.v) {
            case 0:
                b();
                int i = ((q0) this).r;
                e eVar = (e) ((q0) this).u;
                if (i >= eVar.w) {
                    throw new NoSuchElementException();
                }
                ((q0) this).r = i + 1;
                ((q0) this).s = i;
                d dVar = new d(eVar, i);
                e();
                return dVar;
            case 1:
                b();
                int i2 = ((q0) this).r;
                e eVar2 = (e) ((q0) this).u;
                if (i2 >= eVar2.w) {
                    throw new NoSuchElementException();
                }
                ((q0) this).r = i2 + 1;
                ((q0) this).s = i2;
                Object obj = eVar2.r[i2];
                e();
                return obj;
            default:
                b();
                int i3 = ((q0) this).r;
                e eVar3 = (e) ((q0) this).u;
                if (i3 >= eVar3.w) {
                    throw new NoSuchElementException();
                }
                ((q0) this).r = i3 + 1;
                ((q0) this).s = i3;
                Object[] objArr = eVar3.s;
                k.d(objArr);
                Object obj2 = objArr[((q0) this).s];
                e();
                return obj2;
        }
    }
}
