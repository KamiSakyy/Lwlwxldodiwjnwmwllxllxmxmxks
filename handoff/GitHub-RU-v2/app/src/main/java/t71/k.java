package t71;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import sy.d0;
import v1.c0;

/* loaded from: /home/user/work/p/classes.dex */
public final class k extends x61.e {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f32134r = 1;

    /* renamed from: s, reason: collision with root package name */
    public Object f32135s;

    public k(List list) {
        k71.k.g(list, "delegate");
        this.f32135s = list;
    }

    public final int a() {
        switch (this.f32134r) {
            case k5.f.J:
                return ((l) this.f32135s).f32136a.groupCount() + 1;
            default:
                return ((List) this.f32135s).size();
        }
    }

    public /* bridge */ boolean contains(Object obj) {
        switch (this.f32134r) {
            case k5.f.J:
                if (obj instanceof String) {
                    return super/*x61.a*/.contains((String) obj);
                }
                return false;
            default:
                return super/*x61.a*/.contains(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object get(int i) {
        switch (this.f32134r) {
            case k5.f.J:
                String group = ((l) this.f32135s).f32136a.group(i);
                return group == null ? "" : group;
            default:
                List list = (List) this.f32135s;
                if (i >= 0 && i <= d0.m(this)) {
                    return list.get(d0.m(this) - i);
                }
                StringBuilder o5 = x.i.o("Element index ", i, " must be in range [");
                o5.append(new q71.g(0, d0.m(this), 1));
                o5.append("].");
                throw new IndexOutOfBoundsException(o5.toString());
        }
    }

    public /* bridge */ int indexOf(Object obj) {
        switch (this.f32134r) {
            case k5.f.J:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    public Iterator iterator() {
        switch (this.f32134r) {
            case 1:
                return new c0(this, 0);
            default:
                return super.iterator();
        }
    }

    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f32134r) {
            case k5.f.J:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    public ListIterator listIterator() {
        switch (this.f32134r) {
            case 1:
                return new c0(this, 0);
            default:
                return super.listIterator();
        }
    }

    public ListIterator listIterator(int i) {
        switch (this.f32134r) {
            case 1:
                return new c0(this, i);
            default:
                return super.listIterator(i);
        }
    }

    public k(l lVar) {
        this.f32135s = lVar;
    }
}
