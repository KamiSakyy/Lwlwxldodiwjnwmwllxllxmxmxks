package b6;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class p1 extends z5.j {

    /* renamed from: d, reason: collision with root package name */
    public int f3659d;

    /* renamed from: e, reason: collision with root package name */
    public z5.n f3660e;

    public p1(int i) {
        super(i, 2);
        this.f3659d = i;
        this.f3660e = z5.l.f34585a;
    }

    @Override // z5.h
    public final z5.h a() {
        p1 p1Var = new p1(this.f3659d);
        p1Var.f3660e = this.f3660e;
        ArrayList arrayList = this.f34584c;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((z5.h) obj).a());
        }
        p1Var.f34584c.addAll(arrayList2);
        return p1Var;
    }

    @Override // z5.h
    public final void b(z5.n nVar) {
        this.f3660e = nVar;
    }

    @Override // z5.h
    public final z5.n c() {
        return this.f3660e;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.f3660e + ", children=[\n" + d() + "\n])";
    }
    public p1(int p1) {
    }
}
