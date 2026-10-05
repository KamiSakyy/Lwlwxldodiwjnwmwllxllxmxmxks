package d6;

import i6.m;
import java.util.ArrayList;
import z5.j;
import z5.n;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends j {

    /* renamed from: d, reason: collision with root package name */
    public i6.c f21594d;

    /* renamed from: e, reason: collision with root package name */
    public n f21595e;

    /* renamed from: f, reason: collision with root package name */
    public long f21596f;

    public b() {
        super(0, 3);
        this.f21594d = i6.c.f26023d;
        this.f21595e = k41.b.t(new m(n6.f.f29641a));
    }

    @Override // z5.h
    public final z5.h a() {
        b bVar = new b();
        bVar.f21596f = this.f21596f;
        bVar.f21594d = this.f21594d;
        ArrayList arrayList = this.f34584c;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((z5.h) obj).a());
        }
        bVar.f34584c.addAll(arrayList2);
        return bVar;
    }

    @Override // z5.h
    public final void b(n nVar) {
        this.f21595e = nVar;
    }

    @Override // z5.h
    public final n c() {
        return this.f21595e;
    }

    public final String toString() {
        return "EmittableLazyListItem(modifier=" + this.f21595e + ", alignment=" + this.f21594d + ", children=[\n" + d() + "\n])";
    }
}
