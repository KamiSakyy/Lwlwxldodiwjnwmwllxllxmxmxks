package da1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d0 extends ArrayList {
    public final /* synthetic */ int r;

    public boolean a() {
        return size() < 0;
    }

    public ca1.j b(int i, ca1.j jVar) {
        aa1.b.K(jVar);
        ca1.o oVar = (ca1.o) super.set(i, jVar);
        oVar.getClass();
        if (oVar.r == null) {
            oVar.r = jVar.r;
        }
        aa1.b.K(oVar.r);
        ca1.j jVar2 = oVar.r;
        jVar2.getClass();
        aa1.b.G(oVar.r == jVar2);
        if (oVar != jVar) {
            ca1.j jVar3 = jVar.r;
            if (jVar3 != null) {
                jVar3.B(jVar);
            }
            int C = oVar.C();
            ((ArrayList) jVar2.k()).set(C, jVar);
            jVar.r = jVar2;
            jVar.s = C;
            oVar.r = null;
        }
        return (ca1.j) oVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        switch (this.r) {
            case 1:
                int size = size();
                int i = 0;
                while (i < size) {
                    Object obj = get(i);
                    i++;
                    ca1.o oVar = (ca1.o) obj;
                    ca1.j jVar = oVar.r;
                    if (jVar != null) {
                        jVar.B(oVar);
                    }
                }
                super.clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.ArrayList
    public Object clone() {
        switch (this.r) {
            case 1:
                d0 d0Var = new d0(size(), 1);
                int size = size();
                int i = 0;
                while (i < size) {
                    Object obj = get(i);
                    i++;
                    d0Var.add(((ca1.j) obj).i());
                }
                return d0Var;
            default:
                return super.clone();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        switch (this.r) {
            case 1:
                ca1.o oVar = (ca1.o) super.remove(i);
                ca1.j jVar = oVar.r;
                if (jVar != null) {
                    jVar.B(oVar);
                }
                return (ca1.j) oVar;
            default:
                return super.remove(i);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        switch (this.r) {
            case 1:
                Iterator it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    z |= remove(it.next());
                }
                return z;
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.ArrayList, java.util.Collection
    public boolean removeIf(Predicate predicate) {
        switch (this.r) {
            case 1:
                Iterator<E> it = iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (predicate.test((ca1.o) it.next())) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            default:
                return super.removeIf(predicate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        switch (this.r) {
            case 1:
                for (int i = 0; i < size(); i++) {
                    b(i, (ca1.j) ((ca1.o) unaryOperator.apply((ca1.o) get(i))));
                }
                break;
            default:
                super.replaceAll(unaryOperator);
                break;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        switch (this.r) {
            case 1:
                Iterator<E> it = iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (!collection.contains((ca1.o) it.next())) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        switch (this.r) {
            case 1:
                return b(i, (ca1.j) obj);
            default:
                return super.set(i, obj);
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.r) {
            case 1:
                Stream map = stream().map(new ba1.f(2));
                String[] strArr = ba1.h.a;
                final String str = "\n";
                return (String) map.collect(Collector.of(new Supplier() { // from class: ba1.c
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new g(str);
                    }
                }, new ba1.d(), new ba1.e(), new ba1.f(0), new Collector.Characteristics[0]));
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        switch (this.r) {
            case 1:
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                ca1.o oVar = (ca1.o) super.remove(indexOf);
                ca1.j jVar = oVar.r;
                if (jVar != null) {
                    jVar.B(oVar);
                }
                return true;
            default:
                return super.remove(obj);
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class E {
        public E() {
        }
    }
    public d0() {
    }
}
