package a5;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class j0 implements Iterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f430r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f431s;

    /* renamed from: t, reason: collision with root package name */
    public Object f432t;

    public j0(g1 g1Var) {
        this.f430r = 0;
        this.f432t = new ArrayList();
        this.f431s = g1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f430r) {
        }
        return this.f431s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f430r) {
            case k5.f.J:
                Object next = this.f431s.next();
                ArrayList arrayList = (ArrayList) this.f432t;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                g1 g1Var = viewGroup != null ? new g1(0, viewGroup) : null;
                if (g1Var == null || !g1Var.hasNext()) {
                    while (!this.f431s.hasNext() && !arrayList.isEmpty()) {
                        this.f431s = (Iterator) x61.m.e0(arrayList);
                        x61.m.p0(arrayList);
                    }
                } else {
                    arrayList.add(this.f431s);
                    this.f431s = g1Var;
                }
                return next;
            default:
                return ((s71.l) this.f432t).f31748c.k(this.f431s.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f430r) {
            case k5.f.J:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j0(s71.l lVar) {
        this.f430r = 1;
        this.f432t = lVar;
        this.f431s = lVar.f31747b.iterator();
    }
    public Object s = null;
}
