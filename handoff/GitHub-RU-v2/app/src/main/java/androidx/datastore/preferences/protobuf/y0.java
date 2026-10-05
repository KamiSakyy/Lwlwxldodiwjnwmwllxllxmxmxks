package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public class y0 extends AbstractSet {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2408r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map f2409s;

    public /* synthetic */ y0(int i, Map map) {
        this.f2408r = i;
        this.f2409s = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f2408r) {
            case k5.f.J:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((v0) this.f2409s).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                this.f2409s.c((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f2408r) {
            case k5.f.J:
                ((v0) this.f2409s).clear();
                break;
            case 1:
                this.f2409s.clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f2408r) {
            case k5.f.J:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((v0) this.f2409s).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = this.f2409s.get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f2408r) {
            case k5.f.J:
                return new x0((v0) this.f2409s);
            case 1:
                return new x0(this.f2409s);
            default:
                return new x.c((x.e) this.f2409s);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f2408r) {
            case k5.f.J:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((v0) this.f2409s).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                this.f2409s.remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2408r) {
            case k5.f.J:
                return ((v0) this.f2409s).size();
            case 1:
                return this.f2409s.size();
            default:
                return ((x.e) this.f2409s).f33610t;
        }
    }
}
